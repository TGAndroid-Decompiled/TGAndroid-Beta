package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class tn2 {
    public int a;
    public final int b;
    public final boolean c;
    public Object d;
    public final Cloneable e;
    public Serializable f;
    public Object g;

    public tn2(age ageVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
        ep3 ep3Var;
        int i;
        int i2;
        int i3;
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = ageVar;
        int d = ageVar.d();
        this.a = d;
        int c = ageVar.c();
        this.b = c;
        this.c = z;
        if (arrayList.isEmpty()) {
            ep3Var = null;
        } else {
            ep3Var = (ep3) arrayList.get(0);
        }
        if (ep3Var == null || ep3Var.a != 0 || ep3Var.b != 0) {
            ?? obj = new Object();
            obj.a = 0;
            obj.b = 0;
            obj.d = false;
            obj.c = 0;
            obj.e = false;
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ep3 ep3Var2 = (ep3) arrayList.get(size);
            int i4 = ep3Var2.a;
            int i5 = ep3Var2.c;
            int i6 = i4 + i5;
            int i7 = ep3Var2.b + i5;
            if (this.c) {
                while (d > i6) {
                    if (iArr[d - 1] == 0) {
                        d(d, c, size, false);
                    }
                    d--;
                }
                while (c > i7) {
                    if (iArr2[c - 1] == 0) {
                        d(d, c, size, true);
                    }
                    c--;
                }
            }
            int i8 = 0;
            while (true) {
                int i9 = ep3Var2.c;
                i = ep3Var2.a;
                i2 = ep3Var2.b;
                if (i8 < i9) {
                    int i10 = i + i8;
                    int i11 = i2 + i8;
                    if (((age) this.g).a(i10, i11)) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                    iArr[i10] = (i11 << 5) | i3;
                    iArr2[i11] = (i10 << 5) | i3;
                    i8++;
                }
            }
            size--;
            d = i;
            c = i2;
        }
    }

    public static cp3 e(int i, ArrayList arrayList, boolean z) {
        int i2;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            cp3 cp3Var = (cp3) arrayList.get(size);
            if (cp3Var.a == i && cp3Var.c == z) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    cp3 cp3Var2 = (cp3) arrayList.get(size);
                    int i3 = cp3Var2.b;
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    cp3Var2.b = i3 + i2;
                    size++;
                }
                return cp3Var;
            }
            size--;
        }
        return null;
    }

    public final un2 a() {
        boolean z;
        boolean z2;
        int i;
        boolean z3 = false;
        if (((r7a) this.d) == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.a == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = true;
        }
        jte.o("Exactly one of sessionCommand and playerCommand should be set", z3);
        if (((io5) this.f) == null) {
            int i2 = this.a;
            if (i2 != 1) {
                if (i2 != 11 && i2 != 7) {
                    i = 6;
                    if (i2 != 6) {
                        if (i2 == 12 || i2 == 9 || i2 == 8) {
                            i = 3;
                        }
                    }
                }
                i = 2;
            } else {
                i = 1;
            }
            this.f = new io5(new int[]{i}, 1);
        }
        return new un2((r7a) this.d, this.a, this.b, (Bundle) this.e, this.c, (io5) this.f, this.g);
    }

    public final void b(r76 r76Var) {
        bi0 bi0Var;
        int i;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        age ageVar = (age) this.g;
        if (r76Var instanceof bi0) {
            bi0Var = (bi0) r76Var;
        } else {
            bi0Var = new bi0(r76Var);
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = this.a;
        int size = arrayList.size() - 1;
        int i3 = this.b;
        while (size >= 0) {
            ep3 ep3Var = (ep3) arrayList.get(size);
            int i4 = ep3Var.c;
            int i5 = ep3Var.a + i4;
            int i6 = ep3Var.b + i4;
            boolean z = this.c;
            int[] iArr2 = iArr;
            if (i5 < i2) {
                int i7 = i2 - i5;
                if (!z) {
                    bi0Var.C0(i5, i7);
                } else {
                    int i8 = i7 - 1;
                    while (i8 >= 0) {
                        int i9 = i5 + i8;
                        int i10 = iArr2[i9];
                        ArrayList arrayList3 = arrayList;
                        int i11 = i10 & 31;
                        age ageVar2 = ageVar;
                        if (i11 != 0) {
                            if (i11 != 4 && i11 != 8) {
                                if (i11 == 16) {
                                    arrayList2.add(new cp3(i9, i9, true));
                                    i = i8;
                                } else {
                                    rjb.l(hg9.l(i9, "unknown flag for pos ", " "), Long.toBinaryString(i11));
                                    return;
                                }
                            } else {
                                int i12 = i10 >> 5;
                                i = i8;
                                cp3 e = e(i12, arrayList2, false);
                                bi0Var.l(i9, e.b - 1);
                                if (i11 == 4) {
                                    ageVar2.getClass();
                                    bi0Var.O0(e.b - 1, 1);
                                }
                            }
                        } else {
                            i = i8;
                            boolean z2 = true;
                            bi0Var.C0(i9, 1);
                            int size2 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj = arrayList2.get(i13);
                                i13++;
                                cp3 cp3Var = (cp3) obj;
                                cp3Var.b--;
                                z2 = true;
                            }
                        }
                        i8 = i - 1;
                        arrayList = arrayList3;
                        ageVar = ageVar2;
                    }
                }
            }
            ArrayList arrayList4 = arrayList;
            age ageVar3 = ageVar;
            if (i6 < i3) {
                int i14 = i3 - i6;
                if (!z) {
                    bi0Var.C(i5, i14);
                } else {
                    for (int i15 = i14 - 1; i15 >= 0; i15--) {
                        int i16 = i6 + i15;
                        int i17 = ((int[]) this.f)[i16];
                        int i18 = i17 & 31;
                        if (i18 != 0) {
                            if (i18 != 4 && i18 != 8) {
                                if (i18 == 16) {
                                    arrayList2.add(new cp3(i16, i5, false));
                                } else {
                                    rjb.l(hg9.l(i16, "unknown flag for pos ", " "), Long.toBinaryString(i18));
                                    return;
                                }
                            } else {
                                bi0Var.l(e(i17 >> 5, arrayList2, true).b, i5);
                                if (i18 == 4) {
                                    ageVar3.getClass();
                                    bi0Var.O0(i5, 1);
                                }
                            }
                        } else {
                            boolean z3 = true;
                            bi0Var.C(i5, 1);
                            int size3 = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size3) {
                                Object obj2 = arrayList2.get(i19);
                                i19++;
                                ((cp3) obj2).b++;
                                z3 = true;
                            }
                        }
                    }
                }
            }
            while (true) {
                i4--;
                i2 = ep3Var.a;
                if (i4 >= 0) {
                    int i20 = i2 + i4;
                    if ((iArr2[i20] & 31) == 2) {
                        ageVar3.getClass();
                        bi0Var.O0(i20, 1);
                    }
                }
            }
            i3 = ep3Var.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            ageVar = ageVar3;
        }
        bi0Var.a();
    }

    public final void c(y59 y59Var) {
        b(new k6d(y59Var, (byte) 4));
    }

    public final void d(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        age ageVar = (age) this.g;
        if (z) {
            i2--;
            i5 = i;
            i4 = i2;
        } else {
            i4 = i - 1;
            i5 = i4;
        }
        while (i3 >= 0) {
            ep3 ep3Var = (ep3) ((ArrayList) this.d).get(i3);
            int i6 = ep3Var.a;
            int i7 = ep3Var.c;
            int i8 = i6 + i7;
            int i9 = ep3Var.b + i7;
            int i10 = 4;
            if (z) {
                for (int i11 = i5 - 1; i11 >= i8; i11--) {
                    if (ageVar.b(i11, i4)) {
                        if (ageVar.a(i11, i4)) {
                            i10 = 8;
                        }
                        iArr2[i4] = (i11 << 5) | 16;
                        iArr[i11] = (i4 << 5) | i10;
                        return;
                    }
                }
                continue;
            } else {
                for (int i12 = i2 - 1; i12 >= i9; i12--) {
                    if (ageVar.b(i4, i12)) {
                        if (ageVar.a(i4, i12)) {
                            i10 = 8;
                        }
                        int i13 = i - 1;
                        iArr[i13] = (i12 << 5) | 16;
                        iArr2[i12] = (i13 << 5) | i10;
                        return;
                    }
                }
                continue;
            }
            i5 = ep3Var.a;
            i2 = ep3Var.b;
            i3--;
        }
    }

    public tn2() {
        this.b = 0;
        this.e = Bundle.EMPTY;
        this.a = -1;
        this.c = true;
    }
}
