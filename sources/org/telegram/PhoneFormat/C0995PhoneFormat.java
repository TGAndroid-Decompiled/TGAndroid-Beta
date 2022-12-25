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
import org.telegram.tgnet.ConnectionsManager;

public class C0995PhoneFormat {
    private static volatile C0995PhoneFormat Instance;
    public ByteBuffer buffer;
    public HashMap<String, ArrayList<String>> callingCodeCountries;
    public HashMap<String, CallingCodeInfo> callingCodeData;
    public HashMap<String, Integer> callingCodeOffsets;
    public HashMap<String, String> countryCallingCode;
    public byte[] data;
    public String defaultCallingCode;
    public String defaultCountry;
    private boolean initialzed = false;

    public static C0995PhoneFormat getInstance() {
        C0995PhoneFormat c0995PhoneFormat = Instance;
        if (c0995PhoneFormat == null) {
            synchronized (C0995PhoneFormat.class) {
                c0995PhoneFormat = Instance;
                if (c0995PhoneFormat == null) {
                    c0995PhoneFormat = new C0995PhoneFormat();
                    Instance = c0995PhoneFormat;
                }
            }
        }
        return c0995PhoneFormat;
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
        String str2 = z ? "0123456789+" : "0123456789";
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

    public C0995PhoneFormat() {
        init(null);
    }

    public void init(String str) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            inputStream = ApplicationLoader.applicationContext.getAssets().open("PhoneFormats.dat");
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[ConnectionsManager.RequestFlagDoNotWaitFloodWait];
                        while (true) {
                            int read = inputStream.read(bArr, 0, ConnectionsManager.RequestFlagDoNotWaitFloodWait);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        this.data = byteArray;
                        ByteBuffer wrap = ByteBuffer.wrap(byteArray);
                        this.buffer = wrap;
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception e) {
                            FileLog.m31e(e);
                        }
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                            FileLog.m31e(e2);
                        }
                        if (str != null && str.length() != 0) {
                            this.defaultCountry = str;
                        } else {
                            this.defaultCountry = Locale.getDefault().getCountry().toLowerCase();
                        }
                        this.callingCodeOffsets = new HashMap<>(255);
                        this.callingCodeCountries = new HashMap<>(255);
                        this.callingCodeData = new HashMap<>(10);
                        this.countryCallingCode = new HashMap<>(255);
                        parseDataHeader();
                        this.initialzed = true;
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e4) {
                                FileLog.m31e(e4);
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e5) {
                                FileLog.m31e(e5);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e6) {
                                FileLog.m31e(e6);
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e7) {
                                FileLog.m31e(e7);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
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
        if (this.initialzed) {
            try {
                String strip = strip(str);
                if (strip.startsWith("+")) {
                    String substring = strip.substring(1);
                    CallingCodeInfo findCallingCodeInfo = findCallingCodeInfo(substring);
                    if (findCallingCodeInfo != null) {
                        String format = findCallingCodeInfo.format(substring);
                        return "+" + format;
                    }
                    return str;
                }
                CallingCodeInfo callingCodeInfo = callingCodeInfo(this.defaultCallingCode);
                if (callingCodeInfo == null) {
                    return str;
                }
                String matchingAccessCode = callingCodeInfo.matchingAccessCode(strip);
                if (matchingAccessCode != null) {
                    String substring2 = strip.substring(matchingAccessCode.length());
                    CallingCodeInfo findCallingCodeInfo2 = findCallingCodeInfo(substring2);
                    if (findCallingCodeInfo2 != null) {
                        substring2 = findCallingCodeInfo2.format(substring2);
                    }
                    return substring2.length() == 0 ? matchingAccessCode : String.format("%s %s", matchingAccessCode, substring2);
                }
                return callingCodeInfo.format(strip);
            } catch (Exception e) {
                FileLog.m31e(e);
                return str;
            }
        }
        return str;
    }

    int value32(int i) {
        if (i + 4 <= this.data.length) {
            this.buffer.position(i);
            return this.buffer.getInt();
        }
        return 0;
    }

    short value16(int i) {
        if (i + 2 <= this.data.length) {
            this.buffer.position(i);
            return this.buffer.getShort();
        }
        return (short) 0;
    }

    public java.lang.String valueString(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.PhoneFormat.C0995PhoneFormat.valueString(int):java.lang.String");
    }

    public CallingCodeInfo callingCodeInfo(String str) {
        Integer num;
        byte[] bArr;
        int i;
        C0995PhoneFormat c0995PhoneFormat = this;
        CallingCodeInfo callingCodeInfo = c0995PhoneFormat.callingCodeData.get(str);
        if (callingCodeInfo != null || (num = c0995PhoneFormat.callingCodeOffsets.get(str)) == null) {
            return callingCodeInfo;
        }
        byte[] bArr2 = c0995PhoneFormat.data;
        int intValue = num.intValue();
        CallingCodeInfo callingCodeInfo2 = new CallingCodeInfo();
        callingCodeInfo2.callingCode = str;
        c0995PhoneFormat.callingCodeCountries.get(str);
        c0995PhoneFormat.callingCodeData.put(str, callingCodeInfo2);
        short value16 = c0995PhoneFormat.value16(intValue);
        int i2 = 2;
        int i3 = intValue + 2 + 2;
        short value162 = c0995PhoneFormat.value16(i3);
        int i4 = i3 + 2 + 2;
        short value163 = c0995PhoneFormat.value16(i4);
        int i5 = i4 + 2 + 2;
        ArrayList<String> arrayList = new ArrayList<>(5);
        while (true) {
            String valueString = c0995PhoneFormat.valueString(i5);
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
            String valueString2 = c0995PhoneFormat.valueString(i6);
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
            ruleSet.matchLen = c0995PhoneFormat.value16(i8);
            int i10 = i8 + i2;
            short value164 = c0995PhoneFormat.value16(i10);
            i8 = i10 + i2;
            ArrayList<PhoneRule> arrayList4 = new ArrayList<>(value164);
            int i11 = 0;
            while (i11 < value164) {
                PhoneRule phoneRule = new PhoneRule();
                phoneRule.minVal = c0995PhoneFormat.value32(i8);
                int i12 = i8 + 4;
                phoneRule.maxVal = c0995PhoneFormat.value32(i12);
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
                short value165 = c0995PhoneFormat.value16(i19);
                i8 = i19 + i2;
                String valueString3 = c0995PhoneFormat.valueString(i7 + value162 + value165);
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
                c0995PhoneFormat = this;
                bArr2 = bArr;
                i7 = i;
            }
            ruleSet.rules = arrayList4;
            arrayList3.add(ruleSet);
            i9++;
            c0995PhoneFormat = this;
            i7 = i7;
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
