package org.telegram.PhoneFormat;

public final class PhoneRule {
    public int flag12;
    public String format;
    public int maxLen;
    public int maxVal;
    public int minVal;

    public final String format(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(20);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < this.format.length(); i2++) {
            char cCharAt = this.format.charAt(i2);
            if (cCharAt != '#') {
                if (cCharAt != '(') {
                    if (cCharAt == 'c') {
                        if (str2 != null) {
                            sb.append(str2);
                        }
                        z = true;
                    } else if (cCharAt == 'n') {
                        if (str3 != null) {
                            sb.append(str3);
                        }
                        z2 = true;
                    }
                } else if (i < str.length()) {
                    z3 = true;
                }
                if (cCharAt == ' ' && i2 > 0) {
                    int i3 = i2 - 1;
                    if ((this.format.charAt(i3) != 'n' || str3 != null) && (this.format.charAt(i3) != 'c' || str2 != null)) {
                        if (i >= str.length()) {
                            sb.append(this.format.substring(i2, i2 + 1));
                            if (cCharAt == ')') {
                                z3 = false;
                            }
                        } else {
                            sb.append(this.format.substring(i2, i2 + 1));
                            if (cCharAt == ')') {
                                z3 = false;
                            }
                        }
                    }
                } else if (i >= str.length() || (z3 && cCharAt == ')')) {
                    sb.append(this.format.substring(i2, i2 + 1));
                    if (cCharAt == ')') {
                        z3 = false;
                    }
                }
            } else if (i < str.length()) {
                int i4 = i + 1;
                sb.append(str.substring(i, i4));
                i = i4;
            } else if (z3) {
                sb.append(" ");
            }
        }
        if (str2 != null && !z) {
            sb.insert(0, str2.concat(" "));
        } else if (str3 != null && !z2) {
            sb.insert(0, str3);
        }
        return sb.toString();
    }
}
