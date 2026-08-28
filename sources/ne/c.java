package ne;
public final class c {
    public int f18585a;
    public int f18586b;
    public int f18587c;
    public int d;
    public String f18588e;

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(20);
        boolean z10 = false;
        int i9 = 0;
        boolean z11 = false;
        boolean z12 = false;
        for (int i10 = 0; i10 < this.f18588e.length(); i10++) {
            char charAt = this.f18588e.charAt(i10);
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
                } else if (i9 < str.length()) {
                    z12 = true;
                }
                if (charAt == ' ' && i10 > 0) {
                    int i11 = i10 - 1;
                    if (this.f18588e.charAt(i11) == 'n') {
                        if (str3 == null) {
                        }
                    }
                    if (this.f18588e.charAt(i11) == 'c' && str2 == null) {
                    }
                }
                if (i9 < str.length() || (z12 && charAt == ')')) {
                    sb2.append(this.f18588e.substring(i10, i10 + 1));
                    if (charAt == ')') {
                        z12 = false;
                    }
                }
            } else if (i9 < str.length()) {
                int i12 = i9 + 1;
                sb2.append(str.substring(i9, i12));
                i9 = i12;
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
