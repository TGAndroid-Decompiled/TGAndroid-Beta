package defpackage;
public final class mu4 {
    public final lu4 a;
    public final int[] b;

    public mu4(lu4 lu4Var, int[] iArr) {
        if (iArr.length != 0) {
            this.a = lu4Var;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.b = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.b = iArr;
            return;
        }
        iy8.d();
        throw null;
    }

    public final mu4 a(mu4 mu4Var) {
        lu4 lu4Var = mu4Var.a;
        lu4 lu4Var2 = this.a;
        if (lu4Var2.equals(lu4Var)) {
            if (e()) {
                return mu4Var;
            }
            if (mu4Var.e()) {
                return this;
            }
            int[] iArr = mu4Var.b;
            int[] iArr2 = this.b;
            if (iArr2.length > iArr.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = iArr2[i - length] ^ iArr[i];
            }
            return new mu4(lu4Var2, iArr3);
        }
        lq5.j("GenericGFPolys do not have same GenericGF field");
        return null;
    }

    public final int b(int i) {
        if (i == 0) {
            return c(0);
        }
        int[] iArr = this.b;
        if (i == 1) {
            int i2 = 0;
            for (int i3 : iArr) {
                lu4 lu4Var = lu4.h;
                i2 ^= i3;
            }
            return i2;
        }
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = this.a.c(i, i4) ^ iArr[i5];
        }
        return i4;
    }

    public final int c(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        if (this.b[0] != 0) {
            return false;
        }
        return true;
    }

    public final mu4 f(int i) {
        lu4 lu4Var = this.a;
        if (i == 0) {
            return lu4Var.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = lu4Var.c(iArr[i2], i);
        }
        return new mu4(lu4Var, iArr2);
    }

    public final mu4 g(mu4 mu4Var) {
        lu4 lu4Var = mu4Var.a;
        lu4 lu4Var2 = this.a;
        if (lu4Var2.equals(lu4Var)) {
            if (!e() && !mu4Var.e()) {
                int[] iArr = this.b;
                int length = iArr.length;
                int[] iArr2 = mu4Var.b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = iArr3[i4] ^ lu4Var2.c(i2, iArr2[i3]);
                    }
                }
                return new mu4(lu4Var2, iArr3);
            }
            return lu4Var2.c;
        }
        lq5.j("GenericGFPolys do not have same GenericGF field");
        return null;
    }

    public final mu4 h(int i, int i2) {
        if (i >= 0) {
            lu4 lu4Var = this.a;
            if (i2 == 0) {
                return lu4Var.c;
            }
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = lu4Var.c(iArr[i3], i2);
            }
            return new mu4(lu4Var, iArr2);
        }
        iy8.d();
        return null;
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() << 3);
        for (int d = d(); d >= 0; d--) {
            int c = c(d);
            if (c != 0) {
                if (c < 0) {
                    if (d == d()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    lu4 lu4Var = this.a;
                    if (c != 0) {
                        int i = lu4Var.b[c];
                        if (i == 0) {
                            sb.append('1');
                        } else if (i == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i);
                        }
                    } else {
                        lu4Var.getClass();
                        iy8.d();
                        return null;
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
