package bc;
public final class b {
    public final a f3218a;
    public final int[] f3219b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f3218a = aVar;
            int length = iArr.length;
            int i3 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i3 < length && iArr[i3] == 0) {
                    i3++;
                }
                if (i3 == length) {
                    this.f3219b = new int[]{0};
                    return;
                }
                int i10 = length - i3;
                int[] iArr2 = new int[i10];
                this.f3219b = iArr2;
                System.arraycopy(iArr, i3, iArr2, 0, i10);
                return;
            }
            this.f3219b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        a aVar = bVar.f3218a;
        a aVar2 = this.f3218a;
        if (aVar2.equals(aVar)) {
            if (e()) {
                return bVar;
            }
            if (bVar.e()) {
                return this;
            }
            int[] iArr = bVar.f3219b;
            int[] iArr2 = this.f3219b;
            if (iArr2.length > iArr.length) {
                iArr2 = iArr;
                iArr = iArr2;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i3 = length; i3 < iArr.length; i3++) {
                iArr3[i3] = iArr2[i3 - length] ^ iArr[i3];
            }
            return new b(aVar2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final int b(int i3) {
        if (i3 == 0) {
            return c(0);
        }
        int[] iArr = this.f3219b;
        if (i3 == 1) {
            int i10 = 0;
            for (int i11 : iArr) {
                a aVar = a.h;
                i10 ^= i11;
            }
            return i10;
        }
        int i12 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            i12 = this.f3218a.c(i3, i12) ^ iArr[i13];
        }
        return i12;
    }

    public final int c(int i3) {
        int[] iArr = this.f3219b;
        return iArr[(iArr.length - 1) - i3];
    }

    public final int d() {
        return this.f3219b.length - 1;
    }

    public final boolean e() {
        if (this.f3219b[0] != 0) {
            return false;
        }
        return true;
    }

    public final b f(int i3) {
        a aVar = this.f3218a;
        if (i3 == 0) {
            return aVar.f3214c;
        }
        if (i3 == 1) {
            return this;
        }
        int[] iArr = this.f3219b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.c(iArr[i10], i3);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.f3218a;
        a aVar2 = this.f3218a;
        if (aVar2.equals(aVar)) {
            if (!e() && !bVar.e()) {
                int[] iArr = this.f3219b;
                int length = iArr.length;
                int[] iArr2 = bVar.f3219b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i3 = 0; i3 < length; i3++) {
                    int i10 = iArr[i3];
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = i3 + i11;
                        iArr3[i12] = iArr3[i12] ^ aVar2.c(i10, iArr2[i11]);
                    }
                }
                return new b(aVar2, iArr3);
            }
            return aVar2.f3214c;
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final b h(int i3, int i10) {
        if (i3 >= 0) {
            a aVar = this.f3218a;
            if (i10 == 0) {
                return aVar.f3214c;
            }
            int[] iArr = this.f3219b;
            int length = iArr.length;
            int[] iArr2 = new int[i3 + length];
            for (int i11 = 0; i11 < length; i11++) {
                iArr2[i11] = aVar.c(iArr[i11], i10);
            }
            return new b(aVar, iArr2);
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int d = d(); d >= 0; d--) {
            int c2 = c(d);
            if (c2 != 0) {
                if (c2 < 0) {
                    if (d == d()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    c2 = -c2;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d == 0 || c2 != 1) {
                    a aVar = this.f3218a;
                    if (c2 != 0) {
                        int i3 = aVar.f3213b[c2];
                        if (i3 == 0) {
                            sb2.append('1');
                        } else if (i3 == 1) {
                            sb2.append('a');
                        } else {
                            sb2.append("a^");
                            sb2.append(i3);
                        }
                    } else {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
