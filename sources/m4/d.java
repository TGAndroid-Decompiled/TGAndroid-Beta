package m4;

import a8.yb;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import li.e3;
public final class d {
    public int f18017a;
    public final int f18018b;
    public final boolean f18019c;
    public Object d;
    public final Cloneable e;
    public Serializable f18020f;
    public Object f18021g;

    public d() {
        this.f18018b = 0;
        this.e = Bundle.EMPTY;
        this.f18017a = -1;
        this.f18019c = true;
    }

    public static s4.m e(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            s4.m mVar = (s4.m) arrayList.get(size);
            if (mVar.f47798a == i10 && mVar.f47800c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    s4.m mVar2 = (s4.m) arrayList.get(size);
                    int i12 = mVar2.f47799b;
                    if (z10) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    mVar2.f47799b = i12 + i11;
                    size++;
                }
                return mVar;
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
        if (this.f18017a == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = true;
        }
        yb.o("Exactly one of sessionCommand and playerCommand should be set", z12);
        if (((j9.a) this.f18020f) == null) {
            int i11 = this.f18017a;
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
            this.f18020f = new j9.a(new int[]{i10});
        }
        return new e((p1) this.d, this.f18017a, this.f18018b, (Bundle) this.e, this.f18019c, (j9.a) this.f18020f, this.f18021g);
    }

    public void b(s4.e0 e0Var) {
        s4.c cVar;
        s4.p pVar;
        int i10;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        s4.p pVar2 = (s4.p) this.f18021g;
        if (e0Var instanceof s4.c) {
            cVar = (s4.c) e0Var;
        } else {
            cVar = new s4.c(e0Var);
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f18017a;
        int size = arrayList.size() - 1;
        int i12 = this.f18018b;
        while (size >= 0) {
            s4.o oVar = (s4.o) arrayList.get(size);
            int i13 = oVar.f47815c;
            int i14 = oVar.f47813a + i13;
            int i15 = oVar.f47814b + i13;
            boolean z10 = this.f18019c;
            int[] iArr2 = iArr;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (!z10) {
                    cVar.N0(i14, i16);
                } else {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        ArrayList arrayList3 = arrayList;
                        int i20 = i19 & 31;
                        if (i20 != 0) {
                            pVar = pVar2;
                            if (i20 != 4 && i20 != 8) {
                                if (i20 == 16) {
                                    arrayList2.add(new s4.m(i18, i18, true));
                                    i10 = i17;
                                } else {
                                    StringBuilder k10 = ic.a.k(i18, "unknown flag for pos ", " ");
                                    k10.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(k10.toString());
                                }
                            } else {
                                int i21 = i19 >> 5;
                                i10 = i17;
                                s4.m e = e(i21, arrayList2, false);
                                cVar.A(i18, e.f47799b - 1);
                                if (i20 == 4) {
                                    pVar.getClass();
                                    cVar.g1(e.f47799b - 1, 1);
                                }
                            }
                        } else {
                            pVar = pVar2;
                            i10 = i17;
                            boolean z11 = true;
                            cVar.N0(i18, 1);
                            int size2 = arrayList2.size();
                            int i22 = 0;
                            while (i22 < size2) {
                                Object obj = arrayList2.get(i22);
                                i22++;
                                s4.m mVar = (s4.m) obj;
                                mVar.f47799b--;
                                z11 = true;
                            }
                        }
                        i17 = i10 - 1;
                        arrayList = arrayList3;
                        pVar2 = pVar;
                    }
                }
            }
            ArrayList arrayList4 = arrayList;
            s4.p pVar3 = pVar2;
            if (i15 < i12) {
                int i23 = i12 - i15;
                if (!z10) {
                    cVar.i0(i14, i23);
                } else {
                    for (int i24 = i23 - 1; i24 >= 0; i24--) {
                        int i25 = i15 + i24;
                        int i26 = ((int[]) this.f18020f)[i25];
                        int i27 = i26 & 31;
                        if (i27 != 0) {
                            if (i27 != 4 && i27 != 8) {
                                if (i27 == 16) {
                                    arrayList2.add(new s4.m(i25, i14, false));
                                } else {
                                    StringBuilder k11 = ic.a.k(i25, "unknown flag for pos ", " ");
                                    k11.append(Long.toBinaryString(i27));
                                    throw new IllegalStateException(k11.toString());
                                }
                            }
                            cVar.A(e(i26 >> 5, arrayList2, true).f47799b, i14);
                            if (i27 == 4) {
                                pVar3.getClass();
                                cVar.g1(i14, 1);
                            }
                        } else {
                            boolean z12 = true;
                            cVar.i0(i14, 1);
                            int size3 = arrayList2.size();
                            int i28 = 0;
                            while (i28 < size3) {
                                Object obj2 = arrayList2.get(i28);
                                i28++;
                                ((s4.m) obj2).f47799b++;
                                z12 = true;
                            }
                        }
                    }
                }
            }
            for (int i29 = i13 - 1; i29 >= 0; i29--) {
                int i30 = oVar.f47813a + i29;
                if ((iArr2[i30] & 31) == 2) {
                    pVar3.getClass();
                    cVar.g1(i30, 1);
                }
            }
            i11 = oVar.f47813a;
            i12 = oVar.f47814b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            pVar2 = pVar3;
        }
        cVar.a();
    }

    public void c(s4.h0 h0Var) {
        b(new e3(h0Var, 17));
    }

    public void d(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f18020f;
        s4.p pVar = (s4.p) this.f18021g;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            s4.o oVar = (s4.o) ((ArrayList) this.d).get(i12);
            int i15 = oVar.f47813a;
            int i16 = oVar.f47815c;
            int i17 = i15 + i16;
            int i18 = oVar.f47814b + i16;
            int i19 = 4;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i17; i20--) {
                    if (pVar.b(i20, i13)) {
                        if (pVar.a(i20, i13)) {
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
                    if (pVar.b(i13, i21)) {
                        if (pVar.a(i13, i21)) {
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
            i14 = oVar.f47813a;
            i11 = oVar.f47814b;
            i12--;
        }
    }

    public d(s4.p pVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.e = iArr;
        this.f18020f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f18021g = pVar;
        int e = pVar.e();
        this.f18017a = e;
        int d = pVar.d();
        this.f18018b = d;
        this.f18019c = z10;
        s4.o oVar = arrayList.isEmpty() ? null : (s4.o) arrayList.get(0);
        if (oVar == null || oVar.f47813a != 0 || oVar.f47814b != 0) {
            ?? obj = new Object();
            obj.f47813a = 0;
            obj.f47814b = 0;
            obj.d = false;
            obj.f47815c = 0;
            obj.e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.o oVar2 = (s4.o) arrayList.get(size);
            int i10 = oVar2.f47813a;
            int i11 = oVar2.f47815c;
            int i12 = i10 + i11;
            int i13 = oVar2.f47814b + i11;
            if (this.f18019c) {
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
            for (int i14 = 0; i14 < oVar2.f47815c; i14++) {
                int i15 = oVar2.f47813a + i14;
                int i16 = oVar2.f47814b + i14;
                int i17 = ((s4.p) this.f18021g).a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            e = oVar2.f47813a;
            d = oVar2.f47814b;
        }
    }
}
