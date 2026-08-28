package f2;

import java.util.ArrayList;
import java.util.Arrays;
public final class o {
    public final ArrayList f5481a;
    public final int[] f5482b;
    public final int[] f5483c;
    public final s d;
    public final int f5484e;
    public final int f5485f;
    public final boolean f5486g;

    public o(s sVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        r rVar;
        int i9;
        this.f5481a = arrayList;
        this.f5482b = iArr;
        this.f5483c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = sVar;
        int e10 = sVar.e();
        this.f5484e = e10;
        int d = sVar.d();
        this.f5485f = d;
        this.f5486g = z10;
        if (arrayList.isEmpty()) {
            rVar = null;
        } else {
            rVar = (r) arrayList.get(0);
        }
        if (rVar == null || rVar.f5519a != 0 || rVar.f5520b != 0) {
            ?? obj = new Object();
            obj.f5519a = 0;
            obj.f5520b = 0;
            obj.d = false;
            obj.f5521c = 0;
            obj.f5522e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r rVar2 = (r) arrayList.get(size);
            int i10 = rVar2.f5519a;
            int i11 = rVar2.f5521c;
            int i12 = i10 + i11;
            int i13 = rVar2.f5520b + i11;
            if (this.f5486g) {
                while (e10 > i12) {
                    if (iArr[e10 - 1] == 0) {
                        c(e10, d, size, false);
                    }
                    e10--;
                }
                while (d > i13) {
                    if (iArr2[d - 1] == 0) {
                        c(e10, d, size, true);
                    }
                    d--;
                }
            }
            for (int i14 = 0; i14 < rVar2.f5521c; i14++) {
                int i15 = rVar2.f5519a + i14;
                int i16 = rVar2.f5520b + i14;
                if (this.d.a(i15, i16)) {
                    i9 = 1;
                } else {
                    i9 = 2;
                }
                iArr[i15] = (i16 << 5) | i9;
                iArr2[i16] = (i15 << 5) | i9;
            }
            e10 = rVar2.f5519a;
            d = rVar2.f5520b;
        }
    }

    public static p d(int i9, ArrayList arrayList, boolean z10) {
        int i10;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            p pVar = (p) arrayList.get(size);
            if (pVar.f5487a == i9 && pVar.f5489c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    p pVar2 = (p) arrayList.get(size);
                    int i11 = pVar2.f5488b;
                    if (z10) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    pVar2.f5488b = i11 + i10;
                    size++;
                }
                return pVar;
            }
            size--;
        }
        return null;
    }

    public final void a(o0 o0Var) {
        c cVar;
        int[] iArr;
        int i9;
        if (o0Var instanceof c) {
            cVar = (c) o0Var;
        } else {
            cVar = new c(o0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5481a;
        int size = arrayList2.size() - 1;
        int i10 = this.f5484e;
        int i11 = this.f5485f;
        while (size >= 0) {
            r rVar = (r) arrayList2.get(size);
            int i12 = rVar.f5521c;
            int i13 = rVar.f5519a + i12;
            int i14 = rVar.f5520b + i12;
            int[] iArr2 = this.f5482b;
            boolean z10 = this.f5486g;
            s sVar = this.d;
            ArrayList arrayList3 = arrayList2;
            if (i13 < i10) {
                int i15 = i10 - i13;
                if (!z10) {
                    cVar.J0(i13, i15);
                } else {
                    int i16 = i15 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + i16;
                        int i18 = iArr2[i17];
                        int i19 = size;
                        int i20 = i18 & 31;
                        if (i20 != 0) {
                            iArr = iArr2;
                            if (i20 != 4 && i20 != 8) {
                                if (i20 == 16) {
                                    arrayList.add(new p(i17, i17, true));
                                    i9 = i16;
                                } else {
                                    StringBuilder p6 = j3.r0.p(i17, "unknown flag for pos ", " ");
                                    p6.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(p6.toString());
                                }
                            } else {
                                int i21 = i18 >> 5;
                                i9 = i16;
                                p d = d(i21, arrayList, false);
                                cVar.t(i17, d.f5488b - 1);
                                if (i20 == 4) {
                                    sVar.getClass();
                                    cVar.j1(d.f5488b - 1, 1);
                                }
                            }
                        } else {
                            iArr = iArr2;
                            i9 = i16;
                            cVar.J0(i17, 1);
                            int size2 = arrayList.size();
                            int i22 = 0;
                            while (i22 < size2) {
                                Object obj = arrayList.get(i22);
                                i22++;
                                p pVar = (p) obj;
                                pVar.f5488b--;
                            }
                        }
                        i16 = i9 - 1;
                        size = i19;
                        iArr2 = iArr;
                    }
                }
            }
            int i23 = size;
            int[] iArr3 = iArr2;
            if (i14 < i11) {
                int i24 = i11 - i14;
                if (!z10) {
                    cVar.I(i13, i24);
                } else {
                    for (int i25 = i24 - 1; i25 >= 0; i25--) {
                        int i26 = i14 + i25;
                        int i27 = this.f5483c[i26];
                        int i28 = i27 & 31;
                        if (i28 != 0) {
                            if (i28 != 4 && i28 != 8) {
                                if (i28 == 16) {
                                    arrayList.add(new p(i26, i13, false));
                                } else {
                                    StringBuilder p9 = j3.r0.p(i26, "unknown flag for pos ", " ");
                                    p9.append(Long.toBinaryString(i28));
                                    throw new IllegalStateException(p9.toString());
                                }
                            }
                            cVar.t(d(i27 >> 5, arrayList, true).f5488b, i13);
                            if (i28 == 4) {
                                sVar.getClass();
                                cVar.j1(i13, 1);
                            }
                        } else {
                            cVar.I(i13, 1);
                            int size3 = arrayList.size();
                            int i29 = 0;
                            while (i29 < size3) {
                                Object obj2 = arrayList.get(i29);
                                i29++;
                                ((p) obj2).f5488b++;
                            }
                        }
                    }
                }
            }
            for (int i30 = i12 - 1; i30 >= 0; i30--) {
                int i31 = rVar.f5519a + i30;
                if ((iArr3[i31] & 31) == 2) {
                    sVar.getClass();
                    cVar.j1(i31, 1);
                }
            }
            i10 = rVar.f5519a;
            i11 = rVar.f5520b;
            size = i23 - 1;
            arrayList2 = arrayList3;
        }
        cVar.a();
    }

    public final void b(r0 r0Var) {
        a(new android.support.v4.media.c(r0Var, 10));
    }

    public final void c(int i9, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (z10) {
            i10--;
            i13 = i9;
            i12 = i10;
        } else {
            i12 = i9 - 1;
            i13 = i12;
        }
        while (i11 >= 0) {
            r rVar = (r) this.f5481a.get(i11);
            int i14 = rVar.f5519a;
            int i15 = rVar.f5521c;
            int i16 = i14 + i15;
            int i17 = rVar.f5520b + i15;
            int[] iArr = this.f5482b;
            int[] iArr2 = this.f5483c;
            int i18 = 4;
            s sVar = this.d;
            if (z10) {
                for (int i19 = i13 - 1; i19 >= i16; i19--) {
                    if (sVar.b(i19, i12)) {
                        if (sVar.a(i19, i12)) {
                            i18 = 8;
                        }
                        iArr2[i12] = (i19 << 5) | 16;
                        iArr[i19] = (i12 << 5) | i18;
                        return;
                    }
                }
                continue;
            } else {
                for (int i20 = i10 - 1; i20 >= i17; i20--) {
                    if (sVar.b(i12, i20)) {
                        if (sVar.a(i12, i20)) {
                            i18 = 8;
                        }
                        int i21 = i9 - 1;
                        iArr[i21] = (i20 << 5) | 16;
                        iArr2[i20] = (i21 << 5) | i18;
                        return;
                    }
                }
                continue;
            }
            i13 = rVar.f5519a;
            i10 = rVar.f5520b;
            i11--;
        }
    }
}
