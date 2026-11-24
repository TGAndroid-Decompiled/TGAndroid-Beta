package defpackage;

import java.util.Arrays;
public final class jge {
    public static final jge f = new jge(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public jge(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static jge b() {
        return new jge(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int b;
        int c;
        int b2;
        int i = this.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = this.b[i3];
                int i5 = i4 >>> 3;
                int i6 = i4 & 7;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 5) {
                                    ((Integer) this.c[i3]).getClass();
                                    b2 = fyd.b(i5 << 3) + 4;
                                } else {
                                    dq9.o(new q5e());
                                    return 0;
                                }
                            } else {
                                b = fyd.b(i5 << 3) << 1;
                                c = ((jge) this.c[i3]).a();
                            }
                        } else {
                            int b3 = fyd.b(i5 << 3);
                            int j = ((cxd) this.c[i3]).j();
                            i2 = mlb.h(j, j, b3, i2);
                        }
                    } else {
                        ((Long) this.c[i3]).getClass();
                        b2 = fyd.b(i5 << 3) + 8;
                    }
                    i2 = b2 + i2;
                } else {
                    long longValue = ((Long) this.c[i3]).longValue();
                    b = fyd.b(i5 << 3);
                    c = fyd.c(longValue);
                }
                i2 = c + b + i2;
            }
            this.d = i2;
            return i2;
        }
        return i;
    }

    public final void c(int i, Object obj) {
        if (this.e) {
            e(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        gxc.b();
    }

    public final void d(cf9 cf9Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    ((fyd) cf9Var.b).f(i4, ((Integer) obj).intValue());
                                } else {
                                    rjb.m(new q5e());
                                    return;
                                }
                            } else {
                                ((fyd) cf9Var.b).m(i4, 3);
                                ((jge) obj).d(cf9Var);
                                ((fyd) cf9Var.b).m(i4, 4);
                            }
                        } else {
                            ((fyd) cf9Var.b).e(i4, (cxd) obj);
                        }
                    } else {
                        ((fyd) cf9Var.b).h(i4, ((Long) obj).longValue());
                    }
                } else {
                    ((fyd) cf9Var.b).p(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void e(int i) {
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

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof jge)) {
                jge jgeVar = (jge) obj;
                int i = this.a;
                if (i == jgeVar.a) {
                    int[] iArr = this.b;
                    int[] iArr2 = jgeVar.b;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.c;
                            Object[] objArr2 = jgeVar.c;
                            int i3 = this.a;
                            for (int i4 = 0; i4 < i3; i4++) {
                                if (objArr[i4].equals(objArr2[i4])) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
