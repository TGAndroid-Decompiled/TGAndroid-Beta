package org.telegram.PhoneFormat;

import java.util.ArrayList;

public class CallingCodeInfo {
    public ArrayList countries = new ArrayList();
    public String callingCode = "";
    public ArrayList trunkPrefixes = new ArrayList();
    public ArrayList intlPrefixes = new ArrayList();
    public ArrayList ruleSets = new ArrayList();

    String matchingAccessCode(String str) {
        ArrayList arrayList = this.intlPrefixes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    String matchingTrunkCode(String str) {
        ArrayList arrayList = this.trunkPrefixes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    String format(String str) {
        String strSubstring;
        String str2;
        String str3 = null;
        if (str.startsWith(this.callingCode)) {
            str2 = this.callingCode;
            strSubstring = str.substring(str2.length());
        } else {
            String strMatchingTrunkCode = matchingTrunkCode(str);
            if (strMatchingTrunkCode != null) {
                strSubstring = str.substring(strMatchingTrunkCode.length());
                str3 = strMatchingTrunkCode;
                str2 = null;
            } else {
                strSubstring = str;
                str2 = null;
            }
        }
        ArrayList arrayList = this.ruleSets;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str4 = ((RuleSet) obj).format(strSubstring, str2, str3, true);
            if (str4 != null) {
                return str4;
            }
        }
        ArrayList arrayList2 = this.ruleSets;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String str5 = ((RuleSet) obj2).format(strSubstring, str2, str3, false);
            if (str5 != null) {
                return str5;
            }
        }
        return (str2 == null || strSubstring.length() == 0) ? str : String.format("%s %s", str2, strSubstring);
    }
}
