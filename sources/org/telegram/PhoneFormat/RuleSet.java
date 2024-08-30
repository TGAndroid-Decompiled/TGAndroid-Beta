package org.telegram.PhoneFormat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RuleSet {
    public static Pattern pattern = Pattern.compile("[0-9]+");
    public boolean hasRuleWithIntlPrefix;
    public boolean hasRuleWithTrunkPrefix;
    public int matchLen;
    public ArrayList rules = new ArrayList();

    public String format(String str, String str2, String str3, boolean z) {
        int length = str.length();
        int i = this.matchLen;
        if (length >= i) {
            Matcher matcher = pattern.matcher(str.substring(0, i));
            int parseInt = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
            Iterator it = this.rules.iterator();
            while (it.hasNext()) {
                PhoneRule phoneRule = (PhoneRule) it.next();
                if (parseInt >= phoneRule.minVal && parseInt <= phoneRule.maxVal && str.length() <= phoneRule.maxLen) {
                    if (z) {
                        int i2 = phoneRule.flag12;
                        if (((i2 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i2 & 1) != 0) || (str2 != null && (i2 & 2) != 0))) {
                            return phoneRule.format(str, str2, str3);
                        }
                    } else if ((str3 == null && str2 == null) || ((str3 != null && (phoneRule.flag12 & 1) != 0) || (str2 != null && (phoneRule.flag12 & 2) != 0))) {
                        return phoneRule.format(str, str2, str3);
                    }
                }
            }
            if (!z) {
                if (str2 != null) {
                    Iterator it2 = this.rules.iterator();
                    while (it2.hasNext()) {
                        PhoneRule phoneRule2 = (PhoneRule) it2.next();
                        if (parseInt >= phoneRule2.minVal && parseInt <= phoneRule2.maxVal && str.length() <= phoneRule2.maxLen && (str3 == null || (phoneRule2.flag12 & 1) != 0)) {
                            return phoneRule2.format(str, str2, str3);
                        }
                    }
                } else if (str3 != null) {
                    Iterator it3 = this.rules.iterator();
                    while (it3.hasNext()) {
                        PhoneRule phoneRule3 = (PhoneRule) it3.next();
                        if (parseInt >= phoneRule3.minVal && parseInt <= phoneRule3.maxVal && str.length() <= phoneRule3.maxLen && (str2 == null || (phoneRule3.flag12 & 2) != 0)) {
                            return phoneRule3.format(str, str2, str3);
                        }
                    }
                }
            }
        }
        return null;
    }
}
