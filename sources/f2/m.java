package f2;

import java.util.ArrayList;
import java.util.Arrays;
public final class m {
    public final ArrayList f6415a;
    public final int[] f6416b;
    public final int[] f6417c;
    public final q d;
    public final int f6418e;
    public final int f6419f;
    public final boolean f6420g;

    public m(q qVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        p pVar;
        int i10;
        this.f6415a = arrayList;
        this.f6416b = iArr;
        this.f6417c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = qVar;
        int e10 = qVar.e();
        this.f6418e = e10;
        int d = qVar.d();
        this.f6419f = d;
        this.f6420g = z10;
        if (arrayList.isEmpty()) {
            pVar = null;
        } else {
            pVar = (p) arrayList.get(0);
        }
        if (pVar == null || pVar.f6455a != 0 || pVar.f6456b != 0) {
            ?? obj = new Object();
            obj.f6455a = 0;
            obj.f6456b = 0;
            obj.d = false;
            obj.f6457c = 0;
            obj.f6458e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar2 = (p) arrayList.get(size);
            int i11 = pVar2.f6455a;
            int i12 = pVar2.f6457c;
            int i13 = i11 + i12;
            int i14 = pVar2.f6456b + i12;
            if (this.f6420g) {
                while (e10 > i13) {
                    if (iArr[e10 - 1] == 0) {
                        c(e10, d, size, false);
                    }
                    e10--;
                }
                while (d > i14) {
                    if (iArr2[d - 1] == 0) {
                        c(e10, d, size, true);
                    }
                    d--;
                }
            }
            for (int i15 = 0; i15 < pVar2.f6457c; i15++) {
                int i16 = pVar2.f6455a + i15;
                int i17 = pVar2.f6456b + i15;
                if (this.d.a(i16, i17)) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                iArr[i16] = (i17 << 5) | i10;
                iArr2[i17] = (i16 << 5) | i10;
            }
            e10 = pVar2.f6455a;
            d = pVar2.f6456b;
        }
    }

    public static n d(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            n nVar = (n) arrayList.get(size);
            if (nVar.f6426a == i10 && nVar.f6428c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    n nVar2 = (n) arrayList.get(size);
                    int i12 = nVar2.f6427b;
                    if (z10) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    nVar2.f6427b = i12 + i11;
                    size++;
                }
                return nVar;
            }
            size--;
        }
        return null;
    }

    public final void a(l0 l0Var) {
        b bVar;
        int[] iArr;
        int i10;
        if (l0Var instanceof b) {
            bVar = (b) l0Var;
        } else {
            bVar = new b(l0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f6415a;
        int size = arrayList2.size() - 1;
        int i11 = this.f6418e;
        int i12 = this.f6419f;
        while (size >= 0) {
            p pVar = (p) arrayList2.get(size);
            int i13 = pVar.f6457c;
            int i14 = pVar.f6455a + i13;
            int i15 = pVar.f6456b + i13;
            int[] iArr2 = this.f6416b;
            boolean z10 = this.f6420g;
            q qVar = this.d;
            ArrayList arrayList3 = arrayList2;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (!z10) {
                    bVar.H0(i14, i16);
                } else {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        int i20 = size;
                        int i21 = i19 & 31;
                        if (i21 != 0) {
                            iArr = iArr2;
                            if (i21 != 4 && i21 != 8) {
                                if (i21 == 16) {
                                    arrayList.add(new n(i18, i18, true));
                                    i10 = i17;
                                } else {
                                    StringBuilder o10 = j7.l1.o(i18, "unknown flag for pos ", " ");
                                    o10.append(Long.toBinaryString(i21));
                                    throw new IllegalStateException(o10.toString());
                                }
                            } else {
                                int i22 = i19 >> 5;
                                i10 = i17;
                                n d = d(i22, arrayList, false);
                                bVar.z(i18, d.f6427b - 1);
                                if (i21 == 4) {
                                    qVar.getClass();
                                    bVar.f1(d.f6427b - 1, 1);
                                }
                            }
                        } else {
                            iArr = iArr2;
                            i10 = i17;
                            bVar.H0(i18, 1);
                            int size2 = arrayList.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj = arrayList.get(i23);
                                i23++;
                                n nVar = (n) obj;
                                nVar.f6427b--;
                            }
                        }
                        i17 = i10 - 1;
                        size = i20;
                        iArr2 = iArr;
                    }
                }
            }
            int i24 = size;
            int[] iArr3 = iArr2;
            if (i15 < i12) {
                int i25 = i12 - i15;
                if (!z10) {
                    bVar.i0(i14, i25);
                } else {
                    for (int i26 = i25 - 1; i26 >= 0; i26--) {
                        int i27 = i15 + i26;
                        int i28 = this.f6417c[i27];
                        int i29 = i28 & 31;
                        if (i29 != 0) {
                            if (i29 != 4 && i29 != 8) {
                                if (i29 == 16) {
                                    arrayList.add(new n(i27, i14, false));
                                } else {
                                    StringBuilder o11 = j7.l1.o(i27, "unknown flag for pos ", " ");
                                    o11.append(Long.toBinaryString(i29));
                                    throw new IllegalStateException(o11.toString());
                                }
                            }
                            bVar.z(d(i28 >> 5, arrayList, true).f6427b, i14);
                            if (i29 == 4) {
                                qVar.getClass();
                                bVar.f1(i14, 1);
                            }
                        } else {
                            bVar.i0(i14, 1);
                            int size3 = arrayList.size();
                            int i30 = 0;
                            while (i30 < size3) {
                                Object obj2 = arrayList.get(i30);
                                i30++;
                                ((n) obj2).f6427b++;
                            }
                        }
                    }
                }
            }
            for (int i31 = i13 - 1; i31 >= 0; i31--) {
                int i32 = pVar.f6455a + i31;
                if ((iArr3[i32] & 31) == 2) {
                    qVar.getClass();
                    bVar.f1(i32, 1);
                }
            }
            i11 = pVar.f6455a;
            i12 = pVar.f6456b;
            size = i24 - 1;
            arrayList2 = arrayList3;
        }
        bVar.a();
    }

    public final void b(p0 p0Var) {
        a(new za.c(p0Var, 12));
    }

    public final void c(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            p pVar = (p) this.f6415a.get(i12);
            int i15 = pVar.f6455a;
            int i16 = pVar.f6457c;
            int i17 = i15 + i16;
            int i18 = pVar.f6456b + i16;
            int[] iArr = this.f6416b;
            int[] iArr2 = this.f6417c;
            int i19 = 4;
            q qVar = this.d;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i17; i20--) {
                    if (qVar.b(i20, i13)) {
                        if (qVar.a(i20, i13)) {
                            i19 = 8;
                        }
                        iArr2[i13] = (i20 << 5) | 16;
                        iArr[i20] = (i13 << 5) | i19;
                        return;
                    }
                }
                continue;
            } else {
                for (int i21 = i11 - 1; i21 >= i18; i21--) {
                    if (qVar.b(i13, i21)) {
                        if (qVar.a(i13, i21)) {
                            i19 = 8;
                        }
                        int i22 = i10 - 1;
                        iArr[i22] = (i21 << 5) | 16;
                        iArr2[i21] = (i22 << 5) | i19;
                        return;
                    }
                }
                continue;
            }
            i14 = pVar.f6455a;
            i11 = pVar.f6456b;
            i12--;
        }
    }
}
