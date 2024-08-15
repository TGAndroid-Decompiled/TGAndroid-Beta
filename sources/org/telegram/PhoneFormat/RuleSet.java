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
    public ArrayList<PhoneRule> rules = new ArrayList<>();

    public String format(String str, String str2, String str3, boolean z) {
        int length = str.length();
        int i = this.matchLen;
        if (length >= i) {
            Matcher matcher = pattern.matcher(str.substring(0, i));
            int parseInt = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
            Iterator<PhoneRule> it = this.rules.iterator();
            while (it.hasNext()) {
                PhoneRule next = it.next();
                if (parseInt >= next.minVal && parseInt <= next.maxVal && str.length() <= next.maxLen) {
                    if (z) {
                        int i2 = next.flag12;
                        if (((i2 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i2 & 1) != 0) || (str2 != null && (i2 & 2) != 0))) {
                            return next.format(str, str2, str3);
                        }
                    } else if ((str3 == null && str2 == null) || ((str3 != null && (next.flag12 & 1) != 0) || (str2 != null && (next.flag12 & 2) != 0))) {
                        return next.format(str, str2, str3);
                    }
                }
            }
            if (!z) {
                if (str2 != null) {
                    Iterator<PhoneRule> it2 = this.rules.iterator();
                    while (it2.hasNext()) {
                        PhoneRule next2 = it2.next();
                        if (parseInt >= next2.minVal && parseInt <= next2.maxVal && str.length() <= next2.maxLen && (str3 == null || (next2.flag12 & 1) != 0)) {
                            return next2.format(str, str2, str3);
                        }
                    }
                } else if (str3 != null) {
                    Iterator<PhoneRule> it3 = this.rules.iterator();
                    while (it3.hasNext()) {
                        PhoneRule next3 = it3.next();
                        if (parseInt >= next3.minVal && parseInt <= next3.maxVal && str.length() <= next3.maxLen && (str2 == null || (next3.flag12 & 2) != 0)) {
                            return next3.format(str, str2, str3);
                        }
                    }
                }
            }
        }
        return null;
    }
}
