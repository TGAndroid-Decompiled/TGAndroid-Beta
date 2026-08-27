package oe;

public final class c {

    public int f19434a;

    public int f19435b;

    public int f19436c;
    public int d;

    public String f19437e;

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(20);
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = 0; i11 < this.f19437e.length(); i11++) {
            char cCharAt = this.f19437e.charAt(i11);
            if (cCharAt != '#') {
                if (cCharAt != '(') {
                    if (cCharAt == 'c') {
                        if (str2 != null) {
                            sb2.append(str2);
                        }
                        z10 = true;
                    } else if (cCharAt == 'n') {
                        if (str3 != null) {
                            sb2.append(str3);
                        }
                        z11 = true;
                    }
                } else if (i10 < str.length()) {
                    z12 = true;
                }
                if (cCharAt == ' ' && i11 > 0) {
                    int i12 = i11 - 1;
                    if ((this.f19437e.charAt(i12) != 'n' || str3 != null) && (this.f19437e.charAt(i12) != 'c' || str2 != null)) {
                        if (i10 >= str.length()) {
                            sb2.append(this.f19437e.substring(i11, i11 + 1));
                            if (cCharAt == ')') {
                                z12 = false;
                            }
                        } else {
                            sb2.append(this.f19437e.substring(i11, i11 + 1));
                            if (cCharAt == ')') {
                                z12 = false;
                            }
                        }
                    }
                } else if (i10 >= str.length() || (z12 && cCharAt == ')')) {
                    sb2.append(this.f19437e.substring(i11, i11 + 1));
                    if (cCharAt == ')') {
                        z12 = false;
                    }
                }
            } else if (i10 < str.length()) {
                int i13 = i10 + 1;
                sb2.append(str.substring(i10, i13));
                i10 = i13;
            } else if (z12) {
                sb2.append(" ");
            }
        }
        if (str2 != null && !z10) {
            sb2.insert(0, str2.concat(" "));
        } else if (str3 != null && !z11) {
            sb2.insert(0, str3);
        }
        return sb2.toString();
    }
}
