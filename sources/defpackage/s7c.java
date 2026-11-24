package defpackage;

import java.util.Arrays;
public final class s7c {
    public static final s7c f = new s7c(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public s7c(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int g;
        int i;
        int g2;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 5) {
                                ((Integer) this.c[i4]).getClass();
                                g2 = pl2.g(i6) + 4;
                            } else {
                                dq9.o(yr5.b());
                                return 0;
                            }
                        } else {
                            g = pl2.g(i6) << 1;
                            i = ((s7c) this.c[i4]).b();
                        }
                    } else {
                        int g3 = pl2.g(i6);
                        int size = ((m61) this.c[i4]).size();
                        i3 = kt6.f(size, size, g3, i3);
                    }
                } else {
                    ((Long) this.c[i4]).getClass();
                    g2 = pl2.g(i6) + 8;
                }
                i3 = g2 + i3;
            } else {
                long longValue = ((Long) this.c[i4]).longValue();
                g = pl2.g(i6);
                i = pl2.i(longValue);
            }
            i3 = i + g + i3;
        }
        this.d = i3;
        return i3;
    }

    public final void c(int i, Object obj) {
        if (this.e) {
            a(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        gxc.b();
    }

    public final void d(k6d k6dVar) {
        if (this.a != 0) {
            k6dVar.getClass();
            pl2 pl2Var = (pl2) k6dVar.b;
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    pl2Var.q(i3, ((Integer) obj).intValue());
                                } else {
                                    rjb.m(yr5.b());
                                    return;
                                }
                            } else {
                                pl2Var.A(i3, 3);
                                ((s7c) obj).d(k6dVar);
                                pl2Var.A(i3, 4);
                            }
                        } else {
                            pl2Var.o(i3, (m61) obj);
                        }
                    } else {
                        pl2Var.s(i3, ((Long) obj).longValue());
                    }
                } else {
                    pl2Var.D(i3, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s7c)) {
            return false;
        }
        s7c s7cVar = (s7c) obj;
        int i = this.a;
        if (i == s7cVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = s7cVar.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = s7cVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
