package defpackage;

import java.util.Arrays;
public final class s9c {
    public static final s9c f = new s9c(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public s9c(int i, int[] iArr, Object[] objArr, boolean z) {
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
                                g2 = xk2.g(i6) + 4;
                            } else {
                                vr9.l(bs5.b());
                                return 0;
                            }
                        } else {
                            g = xk2.g(i6) << 1;
                            i = ((s9c) this.c[i4]).b();
                        }
                    } else {
                        int g3 = xk2.g(i6);
                        int size = ((n51) this.c[i4]).size();
                        i3 = qu6.f(size, size, g3, i3);
                    }
                } else {
                    ((Long) this.c[i4]).getClass();
                    g2 = xk2.g(i6) + 8;
                }
                i3 = g2 + i3;
            } else {
                long longValue = ((Long) this.c[i4]).longValue();
                g = xk2.g(i6);
                i = xk2.i(longValue);
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
        p3d.a();
    }

    public final void d(z8d z8dVar) {
        if (this.a != 0) {
            z8dVar.getClass();
            xk2 xk2Var = (xk2) z8dVar.b;
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
                                    xk2Var.q(i3, ((Integer) obj).intValue());
                                } else {
                                    grb.m(bs5.b());
                                    return;
                                }
                            } else {
                                xk2Var.A(i3, 3);
                                ((s9c) obj).d(z8dVar);
                                xk2Var.A(i3, 4);
                            }
                        } else {
                            xk2Var.o(i3, (n51) obj);
                        }
                    } else {
                        xk2Var.s(i3, ((Long) obj).longValue());
                    }
                } else {
                    xk2Var.D(i3, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s9c)) {
            return false;
        }
        s9c s9cVar = (s9c) obj;
        int i = this.a;
        if (i == s9cVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = s9cVar.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = s9cVar.c;
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
