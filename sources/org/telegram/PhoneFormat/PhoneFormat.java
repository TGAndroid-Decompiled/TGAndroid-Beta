package org.telegram.PhoneFormat;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;

public class PhoneFormat {
    private static volatile PhoneFormat Instance;
    public ByteBuffer buffer;
    public HashMap callingCodeCountries;
    public HashMap callingCodeData;
    public HashMap callingCodeOffsets;
    public HashMap countryCallingCode;
    public byte[] data;
    public String defaultCallingCode;
    public String defaultCountry;
    private boolean initialzed = false;

    public PhoneFormat() {
        init(null);
    }

    public static PhoneFormat getInstance() {
        PhoneFormat phoneFormat = Instance;
        if (phoneFormat == null) {
            synchronized (PhoneFormat.class) {
                try {
                    phoneFormat = Instance;
                    if (phoneFormat == null) {
                        phoneFormat = new PhoneFormat();
                        Instance = phoneFormat;
                    }
                } finally {
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

    public static String stripExceptNumbers(String str) {
        return stripExceptNumbers(str, false);
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

    public CallingCodeInfo callingCodeInfo(String str) {
        Integer num;
        byte[] bArr;
        ?? r2;
        PhoneFormat phoneFormat = this;
        CallingCodeInfo callingCodeInfo = (CallingCodeInfo) phoneFormat.callingCodeData.get(str);
        if (callingCodeInfo != null || (num = (Integer) phoneFormat.callingCodeOffsets.get(str)) == null) {
            return callingCodeInfo;
        }
        byte[] bArr2 = phoneFormat.data;
        int intValue = num.intValue();
        CallingCodeInfo callingCodeInfo2 = new CallingCodeInfo();
        callingCodeInfo2.callingCode = str;
        callingCodeInfo2.countries = (ArrayList) phoneFormat.callingCodeCountries.get(str);
        phoneFormat.callingCodeData.put(str, callingCodeInfo2);
        short value16 = phoneFormat.value16(intValue);
        short value162 = phoneFormat.value16(intValue + 4);
        short value163 = phoneFormat.value16(intValue + 8);
        int i = intValue + 12;
        ArrayList arrayList = new ArrayList(5);
        while (true) {
            String valueString = phoneFormat.valueString(i);
            if (valueString.length() == 0) {
                break;
            }
            arrayList.add(valueString);
            i += valueString.length() + 1;
        }
        callingCodeInfo2.trunkPrefixes = arrayList;
        int i2 = i + 1;
        ArrayList arrayList2 = new ArrayList(5);
        while (true) {
            String valueString2 = phoneFormat.valueString(i2);
            if (valueString2.length() == 0) {
                break;
            }
            arrayList2.add(valueString2);
            i2 += valueString2.length() + 1;
        }
        callingCodeInfo2.intlPrefixes = arrayList2;
        ArrayList arrayList3 = new ArrayList(value163);
        int i3 = intValue + value16;
        int i4 = i3;
        int i5 = 0;
        while (i5 < value163) {
            RuleSet ruleSet = new RuleSet();
            ruleSet.matchLen = phoneFormat.value16(i4);
            short value164 = phoneFormat.value16(i4 + 2);
            i4 += 4;
            ArrayList arrayList4 = new ArrayList(value164);
            int i6 = 0;
            while (i6 < value164) {
                PhoneRule phoneRule = new PhoneRule();
                phoneRule.minVal = phoneFormat.value32(i4);
                phoneRule.maxVal = phoneFormat.value32(i4 + 4);
                phoneRule.byte8 = bArr2[i4 + 8];
                phoneRule.maxLen = bArr2[i4 + 9];
                phoneRule.otherFlag = bArr2[i4 + 10];
                phoneRule.prefixLen = bArr2[i4 + 11];
                phoneRule.flag12 = bArr2[i4 + 12];
                phoneRule.flag13 = bArr2[i4 + 13];
                short value165 = phoneFormat.value16(i4 + 14);
                i4 += 16;
                String valueString3 = phoneFormat.valueString(i3 + value162 + value165);
                phoneRule.format = valueString3;
                int indexOf = valueString3.indexOf("[[");
                if (indexOf != -1) {
                    bArr = bArr2;
                    r2 = 1;
                    phoneRule.format = String.format("%s%s", phoneRule.format.substring(0, indexOf), phoneRule.format.substring(phoneRule.format.indexOf("]]") + 2));
                } else {
                    bArr = bArr2;
                    r2 = 1;
                }
                arrayList4.add(phoneRule);
                if (phoneRule.hasIntlPrefix) {
                    ruleSet.hasRuleWithIntlPrefix = r2;
                }
                if (phoneRule.hasTrunkPrefix) {
                    ruleSet.hasRuleWithTrunkPrefix = r2;
                }
                i6 += r2;
                phoneFormat = this;
                bArr2 = bArr;
            }
            ruleSet.rules = arrayList4;
            arrayList3.add(ruleSet);
            i5++;
            phoneFormat = this;
            bArr2 = bArr2;
        }
        callingCodeInfo2.ruleSets = arrayList3;
        return callingCodeInfo2;
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
                return "+" + findCallingCodeInfo.format(substring);
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
            FileLog.e(e);
            return str;
        }
    }

    public void init(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.PhoneFormat.PhoneFormat.init(java.lang.String):void");
    }

    public void parseDataHeader() {
        int value32 = value32(0);
        int i = 4;
        int i2 = (value32 * 12) + 4;
        for (int i3 = 0; i3 < value32; i3++) {
            String valueString = valueString(i);
            String valueString2 = valueString(i + 4);
            int value322 = value32(i + 8) + i2;
            i += 12;
            if (valueString2.equals(this.defaultCountry)) {
                this.defaultCallingCode = valueString;
            }
            this.countryCallingCode.put(valueString2, valueString);
            this.callingCodeOffsets.put(valueString, Integer.valueOf(value322));
            ArrayList arrayList = (ArrayList) this.callingCodeCountries.get(valueString);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.callingCodeCountries.put(valueString, arrayList);
            }
            arrayList.add(valueString2);
        }
        String str = this.defaultCallingCode;
        if (str != null) {
            callingCodeInfo(str);
        }
    }

    short value16(int i) {
        if (i + 2 > this.data.length) {
            return (short) 0;
        }
        this.buffer.position(i);
        return this.buffer.getShort();
    }

    int value32(int i) {
        if (i + 4 > this.data.length) {
            return 0;
        }
        this.buffer.position(i);
        return this.buffer.getInt();
    }

    public java.lang.String valueString(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.PhoneFormat.PhoneFormat.valueString(int):java.lang.String");
    }
}
