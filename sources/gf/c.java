package gf;
public final class c {
    public int f8791a;
    public int f8792b;
    public int f8793c;
    public int d;
    public String e;

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(20);
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = 0; i11 < this.e.length(); i11++) {
            char charAt = this.e.charAt(i11);
            if (charAt != '#') {
                if (charAt != '(') {
                    if (charAt != 'c') {
                        if (charAt == 'n') {
                            if (str3 != null) {
                                sb2.append(str3);
                            }
                            z11 = true;
                        }
                    } else {
                        if (str2 != null) {
                            sb2.append(str2);
                        }
                        z10 = true;
                    }
                } else if (i10 < str.length()) {
                    z12 = true;
                }
                if (charAt == ' ' && i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.e.charAt(i12) == 'n') {
                        if (str3 == null) {
                        }
                    }
                    if (this.e.charAt(i12) == 'c' && str2 == null) {
                    }
                }
                if (i10 < str.length() || (z12 && charAt == ')')) {
                    sb2.append(this.e.substring(i11, i11 + 1));
                    if (charAt == ')') {
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
