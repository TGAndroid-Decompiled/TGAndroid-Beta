package org.telegram.PhoneFormat;

import java.util.ArrayList;
import java.util.Iterator;

public class CallingCodeInfo {
    public String callingCode = "";
    public ArrayList<String> trunkPrefixes = new ArrayList<>();
    public ArrayList<String> intlPrefixes = new ArrayList<>();
    public ArrayList<RuleSet> ruleSets = new ArrayList<>();

    public CallingCodeInfo() {
        new ArrayList();
    }

    public String matchingAccessCode(String str) {
        Iterator<String> it = this.intlPrefixes.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (str.startsWith(next)) {
                return next;
            }
        }
        return null;
    }

    String matchingTrunkCode(String str) {
        Iterator<String> it = this.trunkPrefixes.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (str.startsWith(next)) {
                return next;
            }
        }
        return null;
    }

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
        Iterator<RuleSet> it = this.ruleSets.iterator();
        while (it.hasNext()) {
            String format = it.next().format(str2, str3, str4, true);
            if (format != null) {
                return format;
            }
        }
        Iterator<RuleSet> it2 = this.ruleSets.iterator();
        while (it2.hasNext()) {
            String format2 = it2.next().format(str2, str3, str4, false);
            if (format2 != null) {
                return format2;
            }
        }
        return (str3 == null || str2.length() == 0) ? str : String.format("%s %s", str3, str2);
    }
}
