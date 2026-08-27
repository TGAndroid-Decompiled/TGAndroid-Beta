package f2;

import java.util.ArrayList;
import java.util.Arrays;

public final class m {

    public final ArrayList f5769a;

    public final int[] f5770b;

    public final int[] f5771c;
    public final q d;

    public final int f5772e;

    public final int f5773f;

    public final boolean f5774g;

    public m(q qVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.f5769a = arrayList;
        this.f5770b = iArr;
        this.f5771c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = qVar;
        int iE = qVar.e();
        this.f5772e = iE;
        int iD = qVar.d();
        this.f5773f = iD;
        this.f5774g = z10;
        p pVar = arrayList.isEmpty() ? null : (p) arrayList.get(0);
        if (pVar == null || pVar.f5807a != 0 || pVar.f5808b != 0) {
            p pVar2 = new p();
            pVar2.f5807a = 0;
            pVar2.f5808b = 0;
            pVar2.d = false;
            pVar2.f5809c = 0;
            pVar2.f5810e = false;
            arrayList.add(0, pVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar3 = (p) arrayList.get(size);
            int i10 = pVar3.f5807a;
            int i11 = pVar3.f5809c;
            int i12 = i10 + i11;
            int i13 = pVar3.f5808b + i11;
            if (this.f5774g) {
                while (iE > i12) {
                    if (iArr[iE - 1] == 0) {
                        c(iE, iD, size, false);
                    }
                    iE--;
                }
                while (iD > i13) {
                    if (iArr2[iD - 1] == 0) {
                        c(iE, iD, size, true);
                    }
                    iD--;
                }
            }
            for (int i14 = 0; i14 < pVar3.f5809c; i14++) {
                int i15 = pVar3.f5807a + i14;
                int i16 = pVar3.f5808b + i14;
                int i17 = this.d.a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            iE = pVar3.f5807a;
            iD = pVar3.f5808b;
        }
    }

    public static n d(int i10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            n nVar = (n) arrayList.get(size);
            if (nVar.f5775a == i10 && nVar.f5777c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((n) arrayList.get(size)).f5776b += z10 ? 1 : -1;
                    size++;
                }
                return nVar;
            }
            size--;
        }
        return null;
    }

    public final void a(m0 m0Var) {
        int[] iArr;
        int i10;
        b bVar = m0Var instanceof b ? (b) m0Var : new b(m0Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5769a;
        int size = arrayList2.size() - 1;
        int i11 = this.f5772e;
        int i12 = this.f5773f;
        while (size >= 0) {
            p pVar = (p) arrayList2.get(size);
            int i13 = pVar.f5809c;
            int i14 = pVar.f5807a + i13;
            int i15 = pVar.f5808b + i13;
            int[] iArr2 = this.f5770b;
            boolean z10 = this.f5774g;
            q qVar = this.d;
            ArrayList arrayList3 = arrayList2;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (z10) {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        int i20 = size;
                        int i21 = i19 & 31;
                        if (i21 != 0) {
                            iArr = iArr2;
                            if (i21 == 4 || i21 == 8) {
                                int i22 = i19 >> 5;
                                i10 = i17;
                                n nVarD = d(i22, arrayList, false);
                                bVar.A(i18, nVarD.f5776b - 1);
                                if (i21 == 4) {
                                    int i23 = nVarD.f5776b - 1;
                                    qVar.getClass();
                                    bVar.k1(i23, 1);
                                }
                            } else {
                                if (i21 != 16) {
                                    StringBuilder sbO = i0.a.o(i18, "unknown flag for pos ", " ");
                                    sbO.append(Long.toBinaryString(i21));
                                    throw new IllegalStateException(sbO.toString());
                                }
                                arrayList.add(new n(i18, i18, true));
                                i10 = i17;
                            }
                        } else {
                            iArr = iArr2;
                            i10 = i17;
                            bVar.K0(i18, 1);
                            int size2 = arrayList.size();
                            int i24 = 0;
                            while (i24 < size2) {
                                Object obj = arrayList.get(i24);
                                i24++;
                                ((n) obj).f5776b--;
                            }
                        }
                        i17 = i10 - 1;
                        size = i20;
                        iArr2 = iArr;
                    }
                } else {
                    bVar.K0(i14, i16);
                }
            }
            int i25 = size;
            int[] iArr3 = iArr2;
            if (i15 < i12) {
                int i26 = i12 - i15;
                if (z10) {
                    for (int i27 = i26 - 1; i27 >= 0; i27--) {
                        int i28 = i15 + i27;
                        int i29 = this.f5771c[i28];
                        int i30 = i29 & 31;
                        if (i30 == 0) {
                            bVar.S(i14, 1);
                            int size3 = arrayList.size();
                            int i31 = 0;
                            while (i31 < size3) {
                                Object obj2 = arrayList.get(i31);
                                i31++;
                                ((n) obj2).f5776b++;
                            }
                        } else if (i30 == 4 || i30 == 8) {
                            bVar.A(d(i29 >> 5, arrayList, true).f5776b, i14);
                            if (i30 == 4) {
                                qVar.getClass();
                                bVar.k1(i14, 1);
                            }
                        } else {
                            if (i30 != 16) {
                                StringBuilder sbO2 = i0.a.o(i28, "unknown flag for pos ", " ");
                                sbO2.append(Long.toBinaryString(i30));
                                throw new IllegalStateException(sbO2.toString());
                            }
                            arrayList.add(new n(i28, i14, false));
                        }
                    }
                } else {
                    bVar.S(i14, i26);
                }
            }
            for (int i32 = i13 - 1; i32 >= 0; i32--) {
                int i33 = pVar.f5807a + i32;
                if ((iArr3[i33] & 31) == 2) {
                    qVar.getClass();
                    bVar.k1(i33, 1);
                }
            }
            i11 = pVar.f5807a;
            i12 = pVar.f5808b;
            size = i25 - 1;
            arrayList2 = arrayList3;
        }
        bVar.a();
    }

    public final void b(q0 q0Var) {
        a(new ae.b(q0Var, 12));
    }

    public final void c(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int i15;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            p pVar = (p) this.f5769a.get(i12);
            int i16 = pVar.f5807a;
            int i17 = pVar.f5809c;
            int i18 = i16 + i17;
            int i19 = pVar.f5808b + i17;
            int[] iArr = this.f5770b;
            int[] iArr2 = this.f5771c;
            q qVar = this.d;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i18; i20--) {
                    if (qVar.b(i20, i13)) {
                        i15 = qVar.a(i20, i13) ? 8 : 4;
                        iArr2[i13] = (i20 << 5) | 16;
                        iArr[i20] = (i13 << 5) | i15;
                        return;
                    }
                }
            } else {
                for (int i21 = i11 - 1; i21 >= i19; i21--) {
                    if (qVar.b(i13, i21)) {
                        i15 = qVar.a(i13, i21) ? 8 : 4;
                        int i22 = i10 - 1;
                        iArr[i22] = (i21 << 5) | 16;
                        iArr2[i21] = (i22 << 5) | i15;
                        return;
                    }
                }
            }
            i14 = pVar.f5807a;
            i11 = pVar.f5808b;
            i12--;
        }
    }
}
