package org.telegram.PhoneFormat;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public final class PhoneFormat {
    public static volatile PhoneFormat Instance;
    public final ByteBuffer buffer;
    public final HashMap callingCodeCountries;
    public final HashMap callingCodeData;
    public final HashMap callingCodeOffsets;
    public final HashMap countryCallingCode;
    public final byte[] data;
    public final String defaultCallingCode;
    public final String defaultCountry;
    public final boolean initialzed;

    public PhoneFormat() throws Throwable {
        ?? Open;
        ?? r3;
        ?? r2;
        int i;
        this.initialzed = false;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        try {
            try {
                Open = ApplicationLoader.applicationContext.getAssets().open("PhoneFormats.dat");
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i2 = Open.read(bArr, 0, 1024);
                            if (i2 == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, i2);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        this.data = byteArray;
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArray);
                        this.buffer = byteBufferWrap;
                        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        try {
                            Open.close();
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                        this.defaultCountry = Locale.getDefault().getCountry().toLowerCase();
                        this.callingCodeOffsets = new HashMap(255);
                        this.callingCodeCountries = new HashMap(255);
                        this.callingCodeData = new HashMap(10);
                        this.countryCallingCode = new HashMap(255);
                        Open = 4;
                        if (4 <= this.data.length) {
                            this.buffer.position(0);
                            r1 = this.buffer.getInt();
                        } else {
                            r1 = 0;
                        }
                        int i3 = (r1 * 12) + 4;
                        int i4 = 0;
                        while (i4 < r1) {
                            String strValueString = valueString(Open);
                            String strValueString2 = valueString(Open + 4);
                            int i5 = Open + 8;
                            int i6 = Open + 12;
                            if (i6 <= this.data.length) {
                                this.buffer.position(i5);
                                i = this.buffer.getInt();
                            } else {
                                i = 0;
                            }
                            int i7 = i + i3;
                            if (strValueString2.equals(this.defaultCountry)) {
                                this.defaultCallingCode = strValueString;
                            }
                            this.countryCallingCode.put(strValueString2, strValueString);
                            this.callingCodeOffsets.put(strValueString, Integer.valueOf(i7));
                            ArrayList arrayList = (ArrayList) this.callingCodeCountries.get(strValueString);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                this.callingCodeCountries.put(strValueString, arrayList);
                            }
                            arrayList.add(strValueString2);
                            i4++;
                            Open = i6;
                        }
                        String str = this.defaultCallingCode;
                        if (str != null) {
                            callingCodeInfo(str);
                        }
                        this.initialzed = true;
                    } catch (Exception e3) {
                        e = e3;
                        r1 = byteArrayOutputStream;
                        e.printStackTrace();
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                        }
                        if (Open != 0) {
                            try {
                                Open.close();
                            } catch (Exception e5) {
                                FileLog.e(e5);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r2 = Open;
                        r3 = byteArrayOutputStream;
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                        }
                        if (r2 == 0) {
                            throw th;
                        }
                        try {
                            r2.close();
                            throw th;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            throw th;
                        }
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
                r3 = r1;
                r2 = Open;
                if (r3 != 0) {
                    r3.close();
                }
                if (r2 == 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            Open = 0;
        } catch (Throwable th3) {
            th = th3;
            Open = 0;
            r3 = r1;
            r2 = Open;
            if (r3 != 0) {
                r3.close();
            }
            if (r2 == 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
    }

    public static PhoneFormat getInstance() {
        PhoneFormat phoneFormat;
        PhoneFormat phoneFormat2 = Instance;
        if (phoneFormat2 != null) {
            return phoneFormat2;
        }
        synchronized (PhoneFormat.class) {
            try {
                phoneFormat = Instance;
                if (phoneFormat == null) {
                    phoneFormat = new PhoneFormat();
                    Instance = phoneFormat;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return phoneFormat;
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

    public final CallingCodeInfo callingCodeInfo(String str) {
        Integer num;
        int i;
        int i2;
        HashMap map = this.callingCodeData;
        CallingCodeInfo callingCodeInfo = (CallingCodeInfo) map.get(str);
        if (callingCodeInfo != null || (num = (Integer) this.callingCodeOffsets.get(str)) == null) {
            return callingCodeInfo;
        }
        int iIntValue = num.intValue();
        CallingCodeInfo callingCodeInfo2 = new CallingCodeInfo();
        new ArrayList();
        callingCodeInfo2.callingCode = "";
        callingCodeInfo2.trunkPrefixes = new ArrayList();
        callingCodeInfo2.intlPrefixes = new ArrayList();
        callingCodeInfo2.ruleSets = new ArrayList();
        callingCodeInfo2.callingCode = str;
        map.put(str, callingCodeInfo2);
        short sValue16 = value16(iIntValue);
        short sValue17 = value16(iIntValue + 4);
        short sValue18 = value16(iIntValue + 8);
        int length = iIntValue + 12;
        ArrayList arrayList = new ArrayList(5);
        while (true) {
            String strValueString = valueString(length);
            if (strValueString.length() == 0) {
                break;
            }
            arrayList.add(strValueString);
            length += strValueString.length() + 1;
        }
        callingCodeInfo2.trunkPrefixes = arrayList;
        int length2 = length + 1;
        ArrayList arrayList2 = new ArrayList(5);
        while (true) {
            String strValueString2 = valueString(length2);
            if (strValueString2.length() == 0) {
                break;
            }
            arrayList2.add(strValueString2);
            length2 += strValueString2.length() + 1;
        }
        callingCodeInfo2.intlPrefixes = arrayList2;
        ArrayList arrayList3 = new ArrayList(sValue18);
        int i3 = iIntValue + sValue16;
        int i4 = i3;
        for (int i5 = 0; i5 < sValue18; i5++) {
            RuleSet ruleSet = new RuleSet();
            ruleSet.rules = new ArrayList();
            ruleSet.matchLen = value16(i4);
            short sValue19 = value16(i4 + 2);
            i4 += 4;
            ArrayList arrayList4 = new ArrayList(sValue19);
            int i6 = 0;
            while (i6 < sValue19) {
                PhoneRule phoneRule = new PhoneRule();
                int i7 = i4 + 4;
                byte[] bArr = this.data;
                int length3 = bArr.length;
                short s = sValue17;
                ByteBuffer byteBuffer = this.buffer;
                if (i7 <= length3) {
                    byteBuffer.position(i4);
                    i = byteBuffer.getInt();
                } else {
                    i = 0;
                }
                phoneRule.minVal = i;
                int i8 = i4 + 8;
                int i9 = i3;
                if (i8 <= bArr.length) {
                    byteBuffer.position(i7);
                    i2 = byteBuffer.getInt();
                } else {
                    i2 = 0;
                }
                phoneRule.maxVal = i2;
                byte b = bArr[i8];
                phoneRule.maxLen = bArr[i4 + 9];
                byte b2 = bArr[i4 + 10];
                byte b3 = bArr[i4 + 11];
                phoneRule.flag12 = bArr[i4 + 12];
                byte b4 = bArr[i4 + 13];
                short sValue110 = value16(i4 + 14);
                i4 += 16;
                String strValueString3 = valueString(i9 + s + sValue110);
                phoneRule.format = strValueString3;
                int iIndexOf = strValueString3.indexOf("[[");
                if (iIndexOf != -1) {
                    phoneRule.format = Fragment$$ExternalSyntheticOutline0.m$1(phoneRule.format.substring(0, iIndexOf), phoneRule.format.substring(phoneRule.format.indexOf("]]") + 2));
                }
                arrayList4.add(phoneRule);
                i6++;
                sValue17 = s;
                i3 = i9;
            }
            ruleSet.rules = arrayList4;
            arrayList3.add(ruleSet);
        }
        callingCodeInfo2.ruleSets = arrayList3;
        return callingCodeInfo2;
    }

    public final String format(String str) {
        String str2;
        if (this.initialzed) {
            try {
                StringBuilder sb = new StringBuilder(str);
                for (int length = sb.length() - 1; length >= 0; length--) {
                    if (!"0123456789+*#".contains(sb.substring(length, length + 1))) {
                        sb.deleteCharAt(length);
                    }
                }
                String string = sb.toString();
                CallingCodeInfo callingCodeInfo = null;
                if (string.startsWith("+")) {
                    String strSubstring = string.substring(1);
                    int i = 0;
                    while (i < 3 && i < strSubstring.length()) {
                        i++;
                        callingCodeInfo = callingCodeInfo(strSubstring.substring(0, i));
                        if (callingCodeInfo != null) {
                            break;
                        }
                    }
                    if (callingCodeInfo != null) {
                        return "+" + callingCodeInfo.format(strSubstring);
                    }
                } else {
                    CallingCodeInfo callingCodeInfo2 = callingCodeInfo(this.defaultCallingCode);
                    if (callingCodeInfo2 != null) {
                        ArrayList arrayList = callingCodeInfo2.intlPrefixes;
                        int size = arrayList.size();
                        int i2 = 0;
                        do {
                            if (i2 >= size) {
                                str2 = null;
                                break;
                            }
                            Object obj = arrayList.get(i2);
                            i2++;
                            str2 = (String) obj;
                        } while (!string.startsWith(str2));
                        if (str2 == null) {
                            return callingCodeInfo2.format(string);
                        }
                        String strSubstring2 = string.substring(str2.length());
                        int i3 = 0;
                        while (i3 < 3 && i3 < strSubstring2.length()) {
                            i3++;
                            callingCodeInfo = callingCodeInfo(strSubstring2.substring(0, i3));
                            if (callingCodeInfo != null) {
                                break;
                            }
                        }
                        if (callingCodeInfo != null) {
                            strSubstring2 = callingCodeInfo.format(strSubstring2);
                        }
                        if (strSubstring2.length() == 0) {
                            return str2;
                        }
                        return str2 + " " + strSubstring2;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                return str;
            }
        }
        return str;
    }

    public final short value16(int i) {
        if (i + 2 > this.data.length) {
            return (short) 0;
        }
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(i);
        return byteBuffer.getShort();
    }

    public final String valueString(int i) {
        int i2 = i;
        while (true) {
            try {
                byte[] bArr = this.data;
                if (i2 >= bArr.length) {
                    return "";
                }
                if (bArr[i2] == 0) {
                    int i3 = i2 - i;
                    return i == i3 ? "" : new String(bArr, i, i3);
                }
                i2++;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
    }
}
