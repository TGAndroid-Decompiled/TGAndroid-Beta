package m4;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import v7.u6;
public final class c {
    public int f16489a;
    public final int f16490b;
    public final boolean f16491c;
    public Object d;
    public final Cloneable e;
    public Serializable f16492f;
    public Object f16493g;

    public c() {
        this.f16490b = 0;
        this.e = Bundle.EMPTY;
        this.f16489a = -1;
        this.f16491c = true;
    }

    public static s4.l e(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            s4.l lVar = (s4.l) arrayList.get(size);
            if (lVar.f45991a == i10 && lVar.f45993c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    s4.l lVar2 = (s4.l) arrayList.get(size);
                    int i12 = lVar2.f45992b;
                    if (z10) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    lVar2.f45992b = i12 + i11;
                    size++;
                }
                return lVar;
            }
            size--;
        }
        return null;
    }

    public d a() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        int i10 = 1;
        if (((o1) this.d) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f16489a == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = true;
        }
        u6.o("Exactly one of sessionCommand and playerCommand should be set", z12);
        if (((i9.a) this.f16492f) == null) {
            int i11 = this.f16489a;
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
            this.f16492f = new i9.a(new int[]{i10});
        }
        return new d((o1) this.d, this.f16489a, this.f16490b, (Bundle) this.e, this.f16491c, (i9.a) this.f16492f, this.f16493g);
    }

    public void b(s4.d0 d0Var) {
        s4.c cVar;
        s4.o oVar;
        int i10;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        s4.o oVar2 = (s4.o) this.f16493g;
        if (d0Var instanceof s4.c) {
            cVar = (s4.c) d0Var;
        } else {
            cVar = new s4.c(d0Var);
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f16489a;
        int size = arrayList.size() - 1;
        int i12 = this.f16490b;
        while (size >= 0) {
            s4.n nVar = (s4.n) arrayList.get(size);
            int i13 = nVar.f46008c;
            int i14 = nVar.f46006a + i13;
            int i15 = nVar.f46007b + i13;
            boolean z10 = this.f16491c;
            int[] iArr2 = iArr;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (!z10) {
                    cVar.t0(i14, i16);
                } else {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        ArrayList arrayList3 = arrayList;
                        int i20 = i19 & 31;
                        if (i20 != 0) {
                            oVar = oVar2;
                            if (i20 != 4 && i20 != 8) {
                                if (i20 == 16) {
                                    arrayList2.add(new s4.l(i18, i18, true));
                                    i10 = i17;
                                } else {
                                    StringBuilder l4 = i2.e.l(i18, "unknown flag for pos ", " ");
                                    l4.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(l4.toString());
                                }
                            } else {
                                int i21 = i19 >> 5;
                                i10 = i17;
                                s4.l e = e(i21, arrayList2, false);
                                cVar.y(i18, e.f45992b - 1);
                                if (i20 == 4) {
                                    oVar.getClass();
                                    cVar.a1(e.f45992b - 1, 1);
                                }
                            }
                        } else {
                            oVar = oVar2;
                            i10 = i17;
                            boolean z11 = true;
                            cVar.t0(i18, 1);
                            int size2 = arrayList2.size();
                            int i22 = 0;
                            while (i22 < size2) {
                                Object obj = arrayList2.get(i22);
                                i22++;
                                s4.l lVar = (s4.l) obj;
                                lVar.f45992b--;
                                z11 = true;
                            }
                        }
                        i17 = i10 - 1;
                        arrayList = arrayList3;
                        oVar2 = oVar;
                    }
                }
            }
            ArrayList arrayList4 = arrayList;
            s4.o oVar3 = oVar2;
            if (i15 < i12) {
                int i23 = i12 - i15;
                if (!z10) {
                    cVar.X(i14, i23);
                } else {
                    for (int i24 = i23 - 1; i24 >= 0; i24--) {
                        int i25 = i15 + i24;
                        int i26 = ((int[]) this.f16492f)[i25];
                        int i27 = i26 & 31;
                        if (i27 != 0) {
                            if (i27 != 4 && i27 != 8) {
                                if (i27 == 16) {
                                    arrayList2.add(new s4.l(i25, i14, false));
                                } else {
                                    StringBuilder l10 = i2.e.l(i25, "unknown flag for pos ", " ");
                                    l10.append(Long.toBinaryString(i27));
                                    throw new IllegalStateException(l10.toString());
                                }
                            }
                            cVar.y(e(i26 >> 5, arrayList2, true).f45992b, i14);
                            if (i27 == 4) {
                                oVar3.getClass();
                                cVar.a1(i14, 1);
                            }
                        } else {
                            boolean z12 = true;
                            cVar.X(i14, 1);
                            int size3 = arrayList2.size();
                            int i28 = 0;
                            while (i28 < size3) {
                                Object obj2 = arrayList2.get(i28);
                                i28++;
                                ((s4.l) obj2).f45992b++;
                                z12 = true;
                            }
                        }
                    }
                }
            }
            for (int i29 = i13 - 1; i29 >= 0; i29--) {
                int i30 = nVar.f46006a + i29;
                if ((iArr2[i30] & 31) == 2) {
                    oVar3.getClass();
                    cVar.a1(i30, 1);
                }
            }
            i11 = nVar.f46006a;
            i12 = nVar.f46007b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            oVar2 = oVar3;
        }
        cVar.a();
    }

    public void c(s4.g0 g0Var) {
        b(new le.b(g0Var, 20));
    }

    public void d(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f16492f;
        s4.o oVar = (s4.o) this.f16493g;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            s4.n nVar = (s4.n) ((ArrayList) this.d).get(i12);
            int i15 = nVar.f46006a;
            int i16 = nVar.f46008c;
            int i17 = i15 + i16;
            int i18 = nVar.f46007b + i16;
            int i19 = 4;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i17; i20--) {
                    if (oVar.b(i20, i13)) {
                        if (oVar.a(i20, i13)) {
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
                    if (oVar.b(i13, i21)) {
                        if (oVar.a(i13, i21)) {
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
            i14 = nVar.f46006a;
            i11 = nVar.f46007b;
            i12--;
        }
    }

    public c(s4.o oVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.e = iArr;
        this.f16492f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f16493g = oVar;
        int e = oVar.e();
        this.f16489a = e;
        int d = oVar.d();
        this.f16490b = d;
        this.f16491c = z10;
        s4.n nVar = arrayList.isEmpty() ? null : (s4.n) arrayList.get(0);
        if (nVar == null || nVar.f46006a != 0 || nVar.f46007b != 0) {
            ?? obj = new Object();
            obj.f46006a = 0;
            obj.f46007b = 0;
            obj.d = false;
            obj.f46008c = 0;
            obj.e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.n nVar2 = (s4.n) arrayList.get(size);
            int i10 = nVar2.f46006a;
            int i11 = nVar2.f46008c;
            int i12 = i10 + i11;
            int i13 = nVar2.f46007b + i11;
            if (this.f16491c) {
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
            for (int i14 = 0; i14 < nVar2.f46008c; i14++) {
                int i15 = nVar2.f46006a + i14;
                int i16 = nVar2.f46007b + i14;
                int i17 = ((s4.o) this.f16493g).a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            e = nVar2.f46006a;
            d = nVar2.f46007b;
        }
    }
}
