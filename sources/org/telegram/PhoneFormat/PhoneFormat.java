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

    public PhoneFormat() throws Throwable {
        init(null);
    }

    public void init(java.lang.String r9) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.PhoneFormat.PhoneFormat.init(java.lang.String):void");
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
            String strStrip = strip(str);
            if (strStrip.startsWith("+")) {
                String strSubstring = strStrip.substring(1);
                CallingCodeInfo callingCodeInfoFindCallingCodeInfo = findCallingCodeInfo(strSubstring);
                if (callingCodeInfoFindCallingCodeInfo == null) {
                    return str;
                }
                return "+" + callingCodeInfoFindCallingCodeInfo.format(strSubstring);
            }
            CallingCodeInfo callingCodeInfo = callingCodeInfo(this.defaultCallingCode);
            if (callingCodeInfo == null) {
                return str;
            }
            String strMatchingAccessCode = callingCodeInfo.matchingAccessCode(strStrip);
            if (strMatchingAccessCode != null) {
                String strSubstring2 = strStrip.substring(strMatchingAccessCode.length());
                CallingCodeInfo callingCodeInfoFindCallingCodeInfo2 = findCallingCodeInfo(strSubstring2);
                if (callingCodeInfoFindCallingCodeInfo2 != null) {
                    strSubstring2 = callingCodeInfoFindCallingCodeInfo2.format(strSubstring2);
                }
                return strSubstring2.length() == 0 ? strMatchingAccessCode : String.format("%s %s", strMatchingAccessCode, strSubstring2);
            }
            return callingCodeInfo.format(strStrip);
        } catch (Exception e) {
            FileLog.e(e);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.PhoneFormat.PhoneFormat.valueString(int):java.lang.String");
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
        int iIntValue = num.intValue();
        CallingCodeInfo callingCodeInfo2 = new CallingCodeInfo();
        callingCodeInfo2.callingCode = str;
        callingCodeInfo2.countries = (ArrayList) phoneFormat.callingCodeCountries.get(str);
        phoneFormat.callingCodeData.put(str, callingCodeInfo2);
        short sValue16 = phoneFormat.value16(iIntValue);
        short sValue162 = phoneFormat.value16(iIntValue + 4);
        short sValue163 = phoneFormat.value16(iIntValue + 8);
        int length = iIntValue + 12;
        ArrayList arrayList = new ArrayList(5);
        while (true) {
            String strValueString = phoneFormat.valueString(length);
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
            String strValueString2 = phoneFormat.valueString(length2);
            if (strValueString2.length() == 0) {
                break;
            }
            arrayList2.add(strValueString2);
            length2 += strValueString2.length() + 1;
        }
        callingCodeInfo2.intlPrefixes = arrayList2;
        ArrayList arrayList3 = new ArrayList(sValue163);
        int i = iIntValue + sValue16;
        int i2 = i;
        int i3 = 0;
        while (i3 < sValue163) {
            RuleSet ruleSet = new RuleSet();
            ruleSet.matchLen = phoneFormat.value16(i2);
            short sValue164 = phoneFormat.value16(i2 + 2);
            i2 += 4;
            ArrayList arrayList4 = new ArrayList(sValue164);
            int i4 = 0;
            while (i4 < sValue164) {
                PhoneRule phoneRule = new PhoneRule();
                phoneRule.minVal = phoneFormat.value32(i2);
                phoneRule.maxVal = phoneFormat.value32(i2 + 4);
                phoneRule.byte8 = bArr2[i2 + 8];
                phoneRule.maxLen = bArr2[i2 + 9];
                phoneRule.otherFlag = bArr2[i2 + 10];
                phoneRule.prefixLen = bArr2[i2 + 11];
                phoneRule.flag12 = bArr2[i2 + 12];
                phoneRule.flag13 = bArr2[i2 + 13];
                short sValue165 = phoneFormat.value16(i2 + 14);
                i2 += 16;
                String strValueString3 = phoneFormat.valueString(i + sValue162 + sValue165);
                phoneRule.format = strValueString3;
                int iIndexOf = strValueString3.indexOf("[[");
                if (iIndexOf != -1) {
                    bArr = bArr2;
                    r2 = 1;
                    phoneRule.format = String.format("%s%s", phoneRule.format.substring(0, iIndexOf), phoneRule.format.substring(phoneRule.format.indexOf("]]") + 2));
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
                i4 += r2;
                phoneFormat = this;
                bArr2 = bArr;
            }
            ruleSet.rules = arrayList4;
            arrayList3.add(ruleSet);
            i3++;
            phoneFormat = this;
            bArr2 = bArr2;
        }
        callingCodeInfo2.ruleSets = arrayList3;
        return callingCodeInfo2;
    }

    public void parseDataHeader() {
        int iValue32 = value32(0);
        int i = 4;
        int i2 = (iValue32 * 12) + 4;
        for (int i3 = 0; i3 < iValue32; i3++) {
            String strValueString = valueString(i);
            String strValueString2 = valueString(i + 4);
            int iValue322 = value32(i + 8) + i2;
            i += 12;
            if (strValueString2.equals(this.defaultCountry)) {
                this.defaultCallingCode = strValueString;
            }
            this.countryCallingCode.put(strValueString2, strValueString);
            this.callingCodeOffsets.put(strValueString, Integer.valueOf(iValue322));
            ArrayList arrayList = (ArrayList) this.callingCodeCountries.get(strValueString);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.callingCodeCountries.put(strValueString, arrayList);
            }
            arrayList.add(strValueString2);
        }
        String str = this.defaultCallingCode;
        if (str != null) {
            callingCodeInfo(str);
        }
    }
}
