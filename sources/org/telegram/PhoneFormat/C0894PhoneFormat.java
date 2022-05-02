package org.telegram.PhoneFormat;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public class C0894PhoneFormat {
    private static volatile C0894PhoneFormat Instance;
    public ByteBuffer buffer;
    public HashMap<String, ArrayList<String>> callingCodeCountries;
    public HashMap<String, CallingCodeInfo> callingCodeData;
    public HashMap<String, Integer> callingCodeOffsets;
    public HashMap<String, String> countryCallingCode;
    public byte[] data;
    public String defaultCallingCode;
    public String defaultCountry;
    private boolean initialzed = false;

    public static C0894PhoneFormat getInstance() {
        C0894PhoneFormat phoneFormat = Instance;
        if (phoneFormat == null) {
            synchronized (C0894PhoneFormat.class) {
                phoneFormat = Instance;
                if (phoneFormat == null) {
                    phoneFormat = new C0894PhoneFormat();
                    Instance = phoneFormat;
                }
            }
        }
        return phoneFormat;
    }

    public static String strip(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int length = sb.length() - 1; length >= 0; length--) {
            if (!"0123456789+*#".contains(sb.substring(length, length + 1))) {
                sb.deleteCharAt(length);
            }
        }
        return sb.toString();
    }

    public static String stripExceptNumbers(String str, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = "0123456789";
        if (z) {
            str2 = str2 + "+";
        }
        for (int length = sb.length() - 1; length >= 0; length--) {
            if (!str2.contains(sb.substring(length, length + 1))) {
                sb.deleteCharAt(length);
            }
        }
        return sb.toString();
    }

    public static String stripExceptNumbers(String str) {
        return stripExceptNumbers(str, false);
    }

    public C0894PhoneFormat() {
        init(null);
    }

    public void init(String str) {
        Throwable th;
        InputStream inputStream;
        Exception e;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            inputStream = ApplicationLoader.applicationContext.getAssets().open("PhoneFormats.dat");
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.data = byteArray;
            ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            this.buffer = wrap;
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            try {
                byteArrayOutputStream.close();
            } catch (Exception e4) {
                FileLog.m30e(e4);
            }
            try {
                inputStream.close();
            } catch (Exception e5) {
                FileLog.m30e(e5);
            }
            if (str == null || str.length() == 0) {
                this.defaultCountry = Locale.getDefault().getCountry().toLowerCase();
            } else {
                this.defaultCountry = str;
            }
            this.callingCodeOffsets = new HashMap<>(255);
            this.callingCodeCountries = new HashMap<>(255);
            this.callingCodeData = new HashMap<>(10);
            this.countryCallingCode = new HashMap<>(255);
            parseDataHeader();
            this.initialzed = true;
        } catch (Exception e6) {
            e = e6;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e7) {
                    FileLog.m30e(e7);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e8) {
                    FileLog.m30e(e8);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e9) {
                    FileLog.m30e(e9);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e10) {
                    FileLog.m30e(e10);
                }
            }
            throw th;
        }
    }

    public CallingCodeInfo findCallingCodeInfo(String str) {
        CallingCodeInfo callingCodeInfo = null;
        int i = 0;
        while (i < 3 && i < str.length()) {
            i++;
            callingCodeInfo = callingCodeInfo(str.substring(0, i));
            if (callingCodeInfo != null) {
                break;
            }
        }
        return callingCodeInfo;
    }

    public String format(String str) {
        if (!this.initialzed) {
            return str;
        }
        try {
            String strip = strip(str);
            if (strip.startsWith("+")) {
                String substring = strip.substring(1);
                CallingCodeInfo findCallingCodeInfo = findCallingCodeInfo(substring);
                if (findCallingCodeInfo == null) {
                    return str;
                }
                String format = findCallingCodeInfo.format(substring);
                return "+" + format;
            }
            CallingCodeInfo callingCodeInfo = callingCodeInfo(this.defaultCallingCode);
            if (callingCodeInfo == null) {
                return str;
            }
            String matchingAccessCode = callingCodeInfo.matchingAccessCode(strip);
            if (matchingAccessCode == null) {
                return callingCodeInfo.format(strip);
            }
            String substring2 = strip.substring(matchingAccessCode.length());
            CallingCodeInfo findCallingCodeInfo2 = findCallingCodeInfo(substring2);
            if (findCallingCodeInfo2 != null) {
                substring2 = findCallingCodeInfo2.format(substring2);
            }
            return substring2.length() == 0 ? matchingAccessCode : String.format("%s %s", matchingAccessCode, substring2);
        } catch (Exception e) {
            FileLog.m30e(e);
            return str;
        }
    }

    int value32(int i) {
        if (i + 4 > this.data.length) {
            return 0;
        }
        this.buffer.position(i);
        return this.buffer.getInt();
    }

    short value16(int i) {
        if (i + 2 > this.data.length) {
            return (short) 0;
        }
        this.buffer.position(i);
        return this.buffer.getShort();
    }

    public java.lang.String valueString(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.PhoneFormat.C0894PhoneFormat.valueString(int):java.lang.String");
    }

    public CallingCodeInfo callingCodeInfo(String str) {
        Integer num;
        int i;
        byte[] bArr;
        C0894PhoneFormat phoneFormat = this;
        CallingCodeInfo callingCodeInfo = phoneFormat.callingCodeData.get(str);
        if (callingCodeInfo != null || (num = phoneFormat.callingCodeOffsets.get(str)) == null) {
            return callingCodeInfo;
        }
        byte[] bArr2 = phoneFormat.data;
        int intValue = num.intValue();
        CallingCodeInfo callingCodeInfo2 = new CallingCodeInfo();
        callingCodeInfo2.callingCode = str;
        phoneFormat.callingCodeCountries.get(str);
        phoneFormat.callingCodeData.put(str, callingCodeInfo2);
        short value16 = phoneFormat.value16(intValue);
        int i2 = 2;
        int i3 = intValue + 2 + 2;
        short value162 = phoneFormat.value16(i3);
        int i4 = i3 + 2 + 2;
        short value163 = phoneFormat.value16(i4);
        int i5 = i4 + 2 + 2;
        ArrayList<String> arrayList = new ArrayList<>(5);
        while (true) {
            String valueString = phoneFormat.valueString(i5);
            if (valueString.length() == 0) {
                break;
            }
            arrayList.add(valueString);
            i5 += valueString.length() + 1;
        }
        callingCodeInfo2.trunkPrefixes = arrayList;
        int i6 = i5 + 1;
        ArrayList<String> arrayList2 = new ArrayList<>(5);
        while (true) {
            String valueString2 = phoneFormat.valueString(i6);
            if (valueString2.length() == 0) {
                break;
            }
            arrayList2.add(valueString2);
            i6 += valueString2.length() + 1;
        }
        callingCodeInfo2.intlPrefixes = arrayList2;
        ArrayList<RuleSet> arrayList3 = new ArrayList<>(value163);
        int i7 = intValue + value16;
        int i8 = i7;
        int i9 = 0;
        while (i9 < value163) {
            RuleSet ruleSet = new RuleSet();
            ruleSet.matchLen = phoneFormat.value16(i8);
            int i10 = i8 + i2;
            short value164 = phoneFormat.value16(i10);
            i8 = i10 + i2;
            ArrayList<PhoneRule> arrayList4 = new ArrayList<>(value164);
            int i11 = 0;
            while (i11 < value164) {
                PhoneRule phoneRule = new PhoneRule();
                phoneRule.minVal = phoneFormat.value32(i8);
                int i12 = i8 + 4;
                phoneRule.maxVal = phoneFormat.value32(i12);
                int i13 = i12 + 4;
                int i14 = i13 + 1;
                byte b = bArr2[i13];
                int i15 = i14 + 1;
                phoneRule.maxLen = bArr2[i14];
                int i16 = i15 + 1;
                byte b2 = bArr2[i15];
                int i17 = i16 + 1;
                byte b3 = bArr2[i16];
                int i18 = i17 + 1;
                phoneRule.flag12 = bArr2[i17];
                int i19 = i18 + 1;
                byte b4 = bArr2[i18];
                short value165 = phoneFormat.value16(i19);
                i8 = i19 + i2;
                String valueString3 = phoneFormat.valueString(i7 + value162 + value165);
                phoneRule.format = valueString3;
                int indexOf = valueString3.indexOf("[[");
                if (indexOf != -1) {
                    bArr = bArr2;
                    i = i7;
                    i2 = 2;
                    phoneRule.format = String.format("%s%s", phoneRule.format.substring(0, indexOf), phoneRule.format.substring(phoneRule.format.indexOf("]]") + 2));
                } else {
                    bArr = bArr2;
                    i = i7;
                    i2 = 2;
                }
                arrayList4.add(phoneRule);
                i11++;
                phoneFormat = this;
                bArr2 = bArr;
                i7 = i;
            }
            i7 = i7;
            ruleSet.rules = arrayList4;
            arrayList3.add(ruleSet);
            i9++;
            phoneFormat = this;
        }
        callingCodeInfo2.ruleSets = arrayList3;
        return callingCodeInfo2;
    }

    public void parseDataHeader() {
        int value32 = value32(0);
        int i = (value32 * 12) + 4;
        int i2 = 4;
        for (int i3 = 0; i3 < value32; i3++) {
            String valueString = valueString(i2);
            int i4 = i2 + 4;
            String valueString2 = valueString(i4);
            int i5 = i4 + 4;
            int value322 = value32(i5) + i;
            i2 = i5 + 4;
            if (valueString2.equals(this.defaultCountry)) {
                this.defaultCallingCode = valueString;
            }
            this.countryCallingCode.put(valueString2, valueString);
            this.callingCodeOffsets.put(valueString, Integer.valueOf(value322));
            ArrayList<String> arrayList = this.callingCodeCountries.get(valueString);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.callingCodeCountries.put(valueString, arrayList);
            }
            arrayList.add(valueString2);
        }
        String str = this.defaultCallingCode;
        if (str != null) {
            callingCodeInfo(str);
        }
    }
}
