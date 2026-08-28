package nb;
public final class b {
    public final a f18572a;
    public final int[] f18573b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f18572a = aVar;
            int length = iArr.length;
            int i9 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i9 < length && iArr[i9] == 0) {
                    i9++;
                }
                if (i9 == length) {
                    this.f18573b = new int[]{0};
                    return;
                }
                int i10 = length - i9;
                int[] iArr2 = new int[i10];
                this.f18573b = iArr2;
                System.arraycopy(iArr, i9, iArr2, 0, i10);
                return;
            }
            this.f18573b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        a aVar = bVar.f18572a;
        a aVar2 = this.f18572a;
        if (aVar2.equals(aVar)) {
            if (e()) {
                return bVar;
            }
            if (bVar.e()) {
                return this;
            }
            int[] iArr = bVar.f18573b;
            int[] iArr2 = this.f18573b;
            if (iArr2.length > iArr.length) {
                iArr2 = iArr;
                iArr = iArr2;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i9 = length; i9 < iArr.length; i9++) {
                iArr3[i9] = iArr2[i9 - length] ^ iArr[i9];
            }
            return new b(aVar2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final int b(int i9) {
        if (i9 == 0) {
            return c(0);
        }
        int[] iArr = this.f18573b;
        if (i9 == 1) {
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
            i12 = this.f18572a.c(i9, i12) ^ iArr[i13];
        }
        return i12;
    }

    public final int c(int i9) {
        int[] iArr = this.f18573b;
        return iArr[(iArr.length - 1) - i9];
    }

    public final int d() {
        return this.f18573b.length - 1;
    }

    public final boolean e() {
        if (this.f18573b[0] != 0) {
            return false;
        }
        return true;
    }

    public final b f(int i9) {
        a aVar = this.f18572a;
        if (i9 == 0) {
            return aVar.f18568c;
        }
        if (i9 == 1) {
            return this;
        }
        int[] iArr = this.f18573b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.c(iArr[i10], i9);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.f18572a;
        a aVar2 = this.f18572a;
        if (aVar2.equals(aVar)) {
            if (!e() && !bVar.e()) {
                int[] iArr = this.f18573b;
                int length = iArr.length;
                int[] iArr2 = bVar.f18573b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = iArr[i9];
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = i9 + i11;
                        iArr3[i12] = iArr3[i12] ^ aVar2.c(i10, iArr2[i11]);
                    }
                }
                return new b(aVar2, iArr3);
            }
            return aVar2.f18568c;
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final b h(int i9, int i10) {
        if (i9 >= 0) {
            a aVar = this.f18572a;
            if (i10 == 0) {
                return aVar.f18568c;
            }
            int[] iArr = this.f18573b;
            int length = iArr.length;
            int[] iArr2 = new int[i9 + length];
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
                    a aVar = this.f18572a;
                    if (c10 != 0) {
                        int i9 = aVar.f18567b[c10];
                        if (i9 == 0) {
                            sb2.append('1');
                        } else if (i9 == 1) {
                            sb2.append('a');
                        } else {
                            sb2.append("a^");
                            sb2.append(i9);
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
