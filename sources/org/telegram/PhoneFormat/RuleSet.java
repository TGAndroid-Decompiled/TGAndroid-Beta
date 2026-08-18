package org.telegram.PhoneFormat;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RuleSet {
    public static Pattern pattern = Pattern.compile("[0-9]+");
    public boolean hasRuleWithIntlPrefix;
    public boolean hasRuleWithTrunkPrefix;
    public int matchLen;
    public ArrayList rules = new ArrayList();

    String format(String str, String str2, String str3, boolean z) {
        int length = str.length();
        int i = this.matchLen;
        if (length >= i) {
            Matcher matcher = pattern.matcher(str.substring(0, i));
            int i2 = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
            for (PhoneRule phoneRule : this.rules) {
                if (i2 >= phoneRule.minVal && i2 <= phoneRule.maxVal && str.length() <= phoneRule.maxLen) {
                    if (z) {
                        int i3 = phoneRule.flag12;
                        if (((i3 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i3 & 1) != 0) || (str2 != null && (i3 & 2) != 0))) {
                            return phoneRule.format(str, str2, str3);
                        }
                    } else if ((str3 == null && str2 == null) || ((str3 != null && (phoneRule.flag12 & 1) != 0) || (str2 != null && (phoneRule.flag12 & 2) != 0))) {
                        return phoneRule.format(str, str2, str3);
                    }
                }
            }
            if (!z) {
                if (str2 != null) {
                    for (PhoneRule phoneRule2 : this.rules) {
                        if (i2 >= phoneRule2.minVal && i2 <= phoneRule2.maxVal && str.length() <= phoneRule2.maxLen && (str3 == null || (phoneRule2.flag12 & 1) != 0)) {
                            return phoneRule2.format(str, str2, str3);
                        }
                    }
                } else if (str3 != null) {
                    for (PhoneRule phoneRule3 : this.rules) {
                        if (i2 >= phoneRule3.minVal && i2 <= phoneRule3.maxVal && str.length() <= phoneRule3.maxLen && (str2 == null || (phoneRule3.flag12 & 2) != 0)) {
                            return phoneRule3.format(str, str2, str3);
                        }
                    }
                }
            }
        }
        return null;
    }
}
