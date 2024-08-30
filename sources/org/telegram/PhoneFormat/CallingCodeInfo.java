package org.telegram.PhoneFormat;

import java.util.ArrayList;
import java.util.Iterator;

public class CallingCodeInfo {
    public ArrayList countries = new ArrayList();
    public String callingCode = "";
    public ArrayList trunkPrefixes = new ArrayList();
    public ArrayList intlPrefixes = new ArrayList();
    public ArrayList ruleSets = new ArrayList();

    public String format(String str) {
        String str2;
        String str3;
        String str4 = null;
        if (str.startsWith(this.callingCode)) {
            str3 = this.callingCode;
            str2 = str.substring(str3.length());
        } else {
            String matchingTrunkCode = matchingTrunkCode(str);
            if (matchingTrunkCode != null) {
                str2 = str.substring(matchingTrunkCode.length());
                str4 = matchingTrunkCode;
                str3 = null;
            } else {
                str2 = str;
                str3 = null;
            }
        }
        Iterator it = this.ruleSets.iterator();
        while (it.hasNext()) {
            String format = ((RuleSet) it.next()).format(str2, str3, str4, true);
            if (format != null) {
                return format;
            }
        }
        Iterator it2 = this.ruleSets.iterator();
        while (it2.hasNext()) {
            String format2 = ((RuleSet) it2.next()).format(str2, str3, str4, false);
            if (format2 != null) {
                return format2;
            }
        }
        return (str3 == null || str2.length() == 0) ? str : String.format("%s %s", str3, str2);
    }

    public String matchingAccessCode(String str) {
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
}
