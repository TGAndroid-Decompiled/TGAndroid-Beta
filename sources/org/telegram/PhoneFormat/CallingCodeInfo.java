package org.telegram.PhoneFormat;

import java.util.ArrayList;
import java.util.Iterator;

public class CallingCodeInfo {
    public ArrayList countries = new ArrayList();
    public String callingCode = "";
    public ArrayList trunkPrefixes = new ArrayList();
    public ArrayList intlPrefixes = new ArrayList();
    public ArrayList ruleSets = new ArrayList();

    String matchingAccessCode(String str) {
        Iterator it = this.intlPrefixes.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    String matchingTrunkCode(String str) {
        Iterator it = this.trunkPrefixes.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
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
        Iterator it = this.ruleSets.iterator();
        while (it.hasNext()) {
            String str4 = ((RuleSet) it.next()).format(strSubstring, str2, str3, true);
            if (str4 != null) {
                return str4;
            }
        }
        Iterator it2 = this.ruleSets.iterator();
        while (it2.hasNext()) {
            String str5 = ((RuleSet) it2.next()).format(strSubstring, str2, str3, false);
            if (str5 != null) {
                return str5;
            }
        }
        return (str2 == null || strSubstring.length() == 0) ? str : String.format("%s %s", str2, strSubstring);
    }
}
