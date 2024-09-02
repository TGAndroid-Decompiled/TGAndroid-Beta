package org.telegram.PhoneFormat;

public class PhoneRule {
    public int byte8;
    public int flag12;
    public int flag13;
    public String format;
    public boolean hasIntlPrefix;
    public boolean hasTrunkPrefix;
    public int maxLen;
    public int maxVal;
    public int minVal;
    public int otherFlag;
    public int prefixLen;

    public String format(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(20);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < this.format.length(); i2++) {
            char charAt = this.format.charAt(i2);
            if (charAt == '#') {
                if (i < str.length()) {
                    int i3 = i + 1;
                    sb.append(str.substring(i, i3));
                    i = i3;
                } else if (z3) {
                    sb.append(" ");
                }
            } else {
                if (charAt != '(') {
                    if (charAt == 'c') {
                        if (str2 != null) {
                            sb.append(str2);
                        }
                        z = true;
                    } else if (charAt == 'n') {
                        if (str3 != null) {
                            sb.append(str3);
                        }
                        z2 = true;
                    }
                } else if (i < str.length()) {
                    z3 = true;
                }
                if (charAt == ' ' && i2 > 0) {
                    int i4 = i2 - 1;
                    if (this.format.charAt(i4) == 'n') {
                        if (str3 == null) {
                        }
                    }
                    if (this.format.charAt(i4) == 'c' && str2 == null) {
                    }
                }
                if (i < str.length() || (z3 && charAt == ')')) {
                    sb.append(this.format.substring(i2, i2 + 1));
                    if (charAt == ')') {
                        z3 = false;
                    }
                }
            }
        }
        if (str2 != null && !z) {
            sb.insert(0, str2 + " ");
        } else if (str3 != null && !z2) {
            sb.insert(0, str3);
        }
        return sb.toString();
    }
}
