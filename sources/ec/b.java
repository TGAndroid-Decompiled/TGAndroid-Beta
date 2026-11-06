package ec;
public final class b {
    public final a f10733a;
    public final int[] f10734b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f10733a = aVar;
            int length = iArr.length;
            int i7 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i7 < length && iArr[i7] == 0) {
                    i7++;
                }
                if (i7 == length) {
                    this.f10734b = new int[]{0};
                    return;
                }
                int i10 = length - i7;
                int[] iArr2 = new int[i10];
                this.f10734b = iArr2;
                System.arraycopy(iArr, i7, iArr2, 0, i10);
                return;
            }
            this.f10734b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        a aVar = bVar.f10733a;
        a aVar2 = this.f10733a;
        if (aVar2.equals(aVar)) {
            if (e()) {
                return bVar;
            }
            if (bVar.e()) {
                return this;
            }
            int[] iArr = bVar.f10734b;
            int[] iArr2 = this.f10734b;
            if (iArr2.length > iArr.length) {
                iArr2 = iArr;
                iArr = iArr2;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i7 = length; i7 < iArr.length; i7++) {
                iArr3[i7] = iArr2[i7 - length] ^ iArr[i7];
            }
            return new b(aVar2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final int b(int i7) {
        if (i7 == 0) {
            return c(0);
        }
        int[] iArr = this.f10734b;
        if (i7 == 1) {
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
            i12 = this.f10733a.c(i7, i12) ^ iArr[i13];
        }
        return i12;
    }

    public final int c(int i7) {
        int[] iArr = this.f10734b;
        return iArr[(iArr.length - 1) - i7];
    }

    public final int d() {
        return this.f10734b.length - 1;
    }

    public final boolean e() {
        if (this.f10734b[0] != 0) {
            return false;
        }
        return true;
    }

    public final b f(int i7) {
        a aVar = this.f10733a;
        if (i7 == 0) {
            return aVar.f10729c;
        }
        if (i7 == 1) {
            return this;
        }
        int[] iArr = this.f10734b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.c(iArr[i10], i7);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.f10733a;
        a aVar2 = this.f10733a;
        if (aVar2.equals(aVar)) {
            if (!e() && !bVar.e()) {
                int[] iArr = this.f10734b;
                int length = iArr.length;
                int[] iArr2 = bVar.f10734b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i7 = 0; i7 < length; i7++) {
                    int i10 = iArr[i7];
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = i7 + i11;
                        iArr3[i12] = iArr3[i12] ^ aVar2.c(i10, iArr2[i11]);
                    }
                }
                return new b(aVar2, iArr3);
            }
            return aVar2.f10729c;
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final b h(int i7, int i10) {
        if (i7 >= 0) {
            a aVar = this.f10733a;
            if (i10 == 0) {
                return aVar.f10729c;
            }
            int[] iArr = this.f10734b;
            int length = iArr.length;
            int[] iArr2 = new int[i7 + length];
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
            int c10 = c(d);
            if (c10 != 0) {
                if (c10 < 0) {
                    if (d == d()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    c10 = -c10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d == 0 || c10 != 1) {
                    a aVar = this.f10733a;
                    if (c10 != 0) {
                        int i7 = aVar.f10728b[c10];
                        if (i7 == 0) {
                            sb2.append('1');
                        } else if (i7 == 1) {
                            sb2.append('a');
                        } else {
                            sb2.append("a^");
                            sb2.append(i7);
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
