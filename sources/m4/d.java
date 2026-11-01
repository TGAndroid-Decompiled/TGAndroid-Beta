package m4;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import v7.t6;
public final class d {
    public int f12714a;
    public final int f12715b;
    public final boolean f12716c;
    public Object d;
    public final Cloneable e;
    public Serializable f12717f;
    public Object f12718g;

    public d() {
        this.f12715b = 0;
        this.e = Bundle.EMPTY;
        this.f12714a = -1;
        this.f12716c = true;
    }

    public static s4.k e(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            s4.k kVar = (s4.k) arrayList.get(size);
            if (kVar.f47970a == i10 && kVar.f47972c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    s4.k kVar2 = (s4.k) arrayList.get(size);
                    int i12 = kVar2.f47971b;
                    if (z10) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    kVar2.f47971b = i12 + i11;
                    size++;
                }
                return kVar;
            }
            size--;
        }
        return null;
    }

    public e a() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        int i10 = 1;
        if (((p1) this.d) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f12714a == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = true;
        }
        t6.o("Exactly one of sessionCommand and playerCommand should be set", z12);
        if (((i9.a) this.f12717f) == null) {
            int i11 = this.f12714a;
            if (i11 != 1) {
                if (i11 != 11 && i11 != 7) {
                    i10 = 6;
                    if (i11 != 6) {
                        if (i11 == 12 || i11 == 9 || i11 == 8) {
                            i10 = 3;
                        }
                    }
                }
                i10 = 2;
            }
            this.f12717f = new i9.a(new int[]{i10});
        }
        return new e((p1) this.d, this.f12714a, this.f12715b, (Bundle) this.e, this.f12716c, (i9.a) this.f12717f, this.f12718g);
    }

    public void b(s4.c0 c0Var) {
        s4.b bVar;
        s4.n nVar;
        int i10;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        s4.n nVar2 = (s4.n) this.f12718g;
        if (c0Var instanceof s4.b) {
            bVar = (s4.b) c0Var;
        } else {
            bVar = new s4.b(c0Var);
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f12714a;
        int size = arrayList.size() - 1;
        int i12 = this.f12715b;
        while (size >= 0) {
            s4.m mVar = (s4.m) arrayList.get(size);
            int i13 = mVar.f47987c;
            int i14 = mVar.f47985a + i13;
            int i15 = mVar.f47986b + i13;
            boolean z10 = this.f12716c;
            int[] iArr2 = iArr;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (!z10) {
                    bVar.Q0(i14, i16);
                } else {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        ArrayList arrayList3 = arrayList;
                        int i20 = i19 & 31;
                        if (i20 != 0) {
                            nVar = nVar2;
                            if (i20 != 4 && i20 != 8) {
                                if (i20 == 16) {
                                    arrayList2.add(new s4.k(i18, i18, true));
                                    i10 = i17;
                                } else {
                                    StringBuilder l4 = i0.a.l(i18, "unknown flag for pos ", " ");
                                    l4.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(l4.toString());
                                }
                            } else {
                                int i21 = i19 >> 5;
                                i10 = i17;
                                s4.k e = e(i21, arrayList2, false);
                                bVar.E(i18, e.f47971b - 1);
                                if (i20 == 4) {
                                    nVar.getClass();
                                    bVar.x1(e.f47971b - 1, 1);
                                }
                            }
                        } else {
                            nVar = nVar2;
                            i10 = i17;
                            boolean z11 = true;
                            bVar.Q0(i18, 1);
                            int size2 = arrayList2.size();
                            int i22 = 0;
                            while (i22 < size2) {
                                Object obj = arrayList2.get(i22);
                                i22++;
                                s4.k kVar = (s4.k) obj;
                                kVar.f47971b--;
                                z11 = true;
                            }
                        }
                        i17 = i10 - 1;
                        arrayList = arrayList3;
                        nVar2 = nVar;
                    }
                }
            }
            ArrayList arrayList4 = arrayList;
            s4.n nVar3 = nVar2;
            if (i15 < i12) {
                int i23 = i12 - i15;
                if (!z10) {
                    bVar.n0(i14, i23);
                } else {
                    for (int i24 = i23 - 1; i24 >= 0; i24--) {
                        int i25 = i15 + i24;
                        int i26 = ((int[]) this.f12717f)[i25];
                        int i27 = i26 & 31;
                        if (i27 != 0) {
                            if (i27 != 4 && i27 != 8) {
                                if (i27 == 16) {
                                    arrayList2.add(new s4.k(i25, i14, false));
                                } else {
                                    StringBuilder l10 = i0.a.l(i25, "unknown flag for pos ", " ");
                                    l10.append(Long.toBinaryString(i27));
                                    throw new IllegalStateException(l10.toString());
                                }
                            }
                            bVar.E(e(i26 >> 5, arrayList2, true).f47971b, i14);
                            if (i27 == 4) {
                                nVar3.getClass();
                                bVar.x1(i14, 1);
                            }
                        } else {
                            boolean z12 = true;
                            bVar.n0(i14, 1);
                            int size3 = arrayList2.size();
                            int i28 = 0;
                            while (i28 < size3) {
                                Object obj2 = arrayList2.get(i28);
                                i28++;
                                ((s4.k) obj2).f47971b++;
                                z12 = true;
                            }
                        }
                    }
                }
            }
            for (int i29 = i13 - 1; i29 >= 0; i29--) {
                int i30 = mVar.f47985a + i29;
                if ((iArr2[i30] & 31) == 2) {
                    nVar3.getClass();
                    bVar.x1(i30, 1);
                }
            }
            i11 = mVar.f47985a;
            i12 = mVar.f47986b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            nVar2 = nVar3;
        }
        bVar.a();
    }

    public void c(s4.g0 g0Var) {
        b(new l2.f(g0Var, 27));
    }

    public void d(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f12717f;
        s4.n nVar = (s4.n) this.f12718g;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            s4.m mVar = (s4.m) ((ArrayList) this.d).get(i12);
            int i15 = mVar.f47985a;
            int i16 = mVar.f47987c;
            int i17 = i15 + i16;
            int i18 = mVar.f47986b + i16;
            int i19 = 4;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i17; i20--) {
                    if (nVar.b(i20, i13)) {
                        if (nVar.a(i20, i13)) {
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
                    if (nVar.b(i13, i21)) {
                        if (nVar.a(i13, i21)) {
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
            i14 = mVar.f47985a;
            i11 = mVar.f47986b;
            i12--;
        }
    }

    public d(s4.n nVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.e = iArr;
        this.f12717f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f12718g = nVar;
        int e = nVar.e();
        this.f12714a = e;
        int d = nVar.d();
        this.f12715b = d;
        this.f12716c = z10;
        s4.m mVar = arrayList.isEmpty() ? null : (s4.m) arrayList.get(0);
        if (mVar == null || mVar.f47985a != 0 || mVar.f47986b != 0) {
            ?? obj = new Object();
            obj.f47985a = 0;
            obj.f47986b = 0;
            obj.d = false;
            obj.f47987c = 0;
            obj.e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.m mVar2 = (s4.m) arrayList.get(size);
            int i10 = mVar2.f47985a;
            int i11 = mVar2.f47987c;
            int i12 = i10 + i11;
            int i13 = mVar2.f47986b + i11;
            if (this.f12716c) {
                while (e > i12) {
                    if (iArr[e - 1] == 0) {
                        d(e, d, size, false);
                    }
                    e--;
                }
                while (d > i13) {
                    if (iArr2[d - 1] == 0) {
                        d(e, d, size, true);
                    }
                    d--;
                }
            }
            for (int i14 = 0; i14 < mVar2.f47987c; i14++) {
                int i15 = mVar2.f47985a + i14;
                int i16 = mVar2.f47986b + i14;
                int i17 = ((s4.n) this.f12718g).a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            e = mVar2.f47985a;
            d = mVar2.f47986b;
        }
    }
}
