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
            int i2 = 0;
            Matcher matcher = pattern.matcher(str.substring(0, i));
            int i3 = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
            ArrayList arrayList = this.rules;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                PhoneRule phoneRule = (PhoneRule) obj;
                if (i3 >= phoneRule.minVal && i3 <= phoneRule.maxVal && str.length() <= phoneRule.maxLen) {
                    if (z) {
                        int i5 = phoneRule.flag12;
                        if (((i5 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i5 & 1) != 0) || (str2 != null && (i5 & 2) != 0))) {
                            return phoneRule.format(str, str2, str3);
                        }
                    } else if ((str3 == null && str2 == null) || ((str3 != null && (phoneRule.flag12 & 1) != 0) || (str2 != null && (phoneRule.flag12 & 2) != 0))) {
                        return phoneRule.format(str, str2, str3);
                    }
                }
            }
            if (!z) {
                if (str2 != null) {
                    ArrayList arrayList2 = this.rules;
                    int size2 = arrayList2.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        PhoneRule phoneRule2 = (PhoneRule) obj2;
                        if (i3 >= phoneRule2.minVal && i3 <= phoneRule2.maxVal && str.length() <= phoneRule2.maxLen && (str3 == null || (phoneRule2.flag12 & 1) != 0)) {
                            return phoneRule2.format(str, str2, str3);
                        }
                    }
                } else if (str3 != null) {
                    ArrayList arrayList3 = this.rules;
                    int size3 = arrayList3.size();
                    while (i2 < size3) {
                        Object obj3 = arrayList3.get(i2);
                        i2++;
                        PhoneRule phoneRule3 = (PhoneRule) obj3;
                        if (i3 >= phoneRule3.minVal && i3 <= phoneRule3.maxVal && str.length() <= phoneRule3.maxLen && (str2 == null || (phoneRule3.flag12 & 2) != 0)) {
                            return phoneRule3.format(str, str2, str3);
                        }
                    }
                }
            }
        }
        return null;
    }
}
