package defpackage;
public final class ju4 {
    public final iu4 a;
    public final int[] b;

    public ju4(iu4 iu4Var, int[] iArr) {
        if (iArr.length != 0) {
            this.a = iu4Var;
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
        i98.g();
        throw null;
    }

    public final ju4 a(ju4 ju4Var) {
        iu4 iu4Var = ju4Var.a;
        iu4 iu4Var2 = this.a;
        if (iu4Var2.equals(iu4Var)) {
            if (e()) {
                return ju4Var;
            }
            if (ju4Var.e()) {
                return this;
            }
            int[] iArr = ju4Var.b;
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
            return new ju4(iu4Var2, iArr3);
        }
        u36.j("GenericGFPolys do not have same GenericGF field");
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
                iu4 iu4Var = iu4.h;
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

    public final ju4 f(int i) {
        iu4 iu4Var = this.a;
        if (i == 0) {
            return iu4Var.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = iu4Var.c(iArr[i2], i);
        }
        return new ju4(iu4Var, iArr2);
    }

    public final ju4 g(ju4 ju4Var) {
        iu4 iu4Var = ju4Var.a;
        iu4 iu4Var2 = this.a;
        if (iu4Var2.equals(iu4Var)) {
            if (!e() && !ju4Var.e()) {
                int[] iArr = this.b;
                int length = iArr.length;
                int[] iArr2 = ju4Var.b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = iArr3[i4] ^ iu4Var2.c(i2, iArr2[i3]);
                    }
                }
                return new ju4(iu4Var2, iArr3);
            }
            return iu4Var2.c;
        }
        u36.j("GenericGFPolys do not have same GenericGF field");
        return null;
    }

    public final ju4 h(int i, int i2) {
        if (i >= 0) {
            iu4 iu4Var = this.a;
            if (i2 == 0) {
                return iu4Var.c;
            }
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = iu4Var.c(iArr[i3], i2);
            }
            return new ju4(iu4Var, iArr2);
        }
        i98.g();
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
                    iu4 iu4Var = this.a;
                    if (c != 0) {
                        int i = iu4Var.b[c];
                        if (i == 0) {
                            sb.append('1');
                        } else if (i == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i);
                        }
                    } else {
                        iu4Var.getClass();
                        i98.g();
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
