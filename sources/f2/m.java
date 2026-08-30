package f2;

import java.util.ArrayList;
import java.util.Arrays;
import kh.a2;
public final class m {
    public final ArrayList f5802a;
    public final int[] f5803b;
    public final int[] f5804c;
    public final q d;
    public final int e;
    public final int f5805f;
    public final boolean f5806g;

    public m(q qVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z4) {
        p pVar;
        int i10;
        this.f5802a = arrayList;
        this.f5803b = iArr;
        this.f5804c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = qVar;
        int e = qVar.e();
        this.e = e;
        int d = qVar.d();
        this.f5805f = d;
        this.f5806g = z4;
        if (arrayList.isEmpty()) {
            pVar = null;
        } else {
            pVar = (p) arrayList.get(0);
        }
        if (pVar == null || pVar.f5820a != 0 || pVar.f5821b != 0) {
            ?? obj = new Object();
            obj.f5820a = 0;
            obj.f5821b = 0;
            obj.d = false;
            obj.f5822c = 0;
            obj.e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar2 = (p) arrayList.get(size);
            int i11 = pVar2.f5820a;
            int i12 = pVar2.f5822c;
            int i13 = i11 + i12;
            int i14 = pVar2.f5821b + i12;
            if (this.f5806g) {
                while (e > i13) {
                    if (iArr[e - 1] == 0) {
                        c(e, d, size, false);
                    }
                    e--;
                }
                while (d > i14) {
                    if (iArr2[d - 1] == 0) {
                        c(e, d, size, true);
                    }
                    d--;
                }
            }
            for (int i15 = 0; i15 < pVar2.f5822c; i15++) {
                int i16 = pVar2.f5820a + i15;
                int i17 = pVar2.f5821b + i15;
                if (this.d.a(i16, i17)) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                iArr[i16] = (i17 << 5) | i10;
                iArr2[i17] = (i16 << 5) | i10;
            }
            e = pVar2.f5820a;
            d = pVar2.f5821b;
        }
    }

    public static n d(int i10, ArrayList arrayList, boolean z4) {
        int i11;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            n nVar = (n) arrayList.get(size);
            if (nVar.f5809a == i10 && nVar.f5811c == z4) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    n nVar2 = (n) arrayList.get(size);
                    int i12 = nVar2.f5810b;
                    if (z4) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    nVar2.f5810b = i12 + i11;
                    size++;
                }
                return nVar;
            }
            size--;
        }
        return null;
    }

    public final void a(k0 k0Var) {
        b bVar;
        int[] iArr;
        int i10;
        if (k0Var instanceof b) {
            bVar = (b) k0Var;
        } else {
            bVar = new b(k0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5802a;
        int size = arrayList2.size() - 1;
        int i11 = this.e;
        int i12 = this.f5805f;
        while (size >= 0) {
            p pVar = (p) arrayList2.get(size);
            int i13 = pVar.f5822c;
            int i14 = pVar.f5820a + i13;
            int i15 = pVar.f5821b + i13;
            int[] iArr2 = this.f5803b;
            boolean z4 = this.f5806g;
            q qVar = this.d;
            ArrayList arrayList3 = arrayList2;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (!z4) {
                    bVar.M0(i14, i16);
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
                                    StringBuilder m9 = a2.m(i18, "unknown flag for pos ", " ");
                                    m9.append(Long.toBinaryString(i21));
                                    throw new IllegalStateException(m9.toString());
                                }
                            } else {
                                int i22 = i19 >> 5;
                                i10 = i17;
                                n d = d(i22, arrayList, false);
                                bVar.D(i18, d.f5810b - 1);
                                if (i21 == 4) {
                                    qVar.getClass();
                                    bVar.k1(d.f5810b - 1, 1);
                                }
                            }
                        } else {
                            iArr = iArr2;
                            i10 = i17;
                            bVar.M0(i18, 1);
                            int size2 = arrayList.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj = arrayList.get(i23);
                                i23++;
                                n nVar = (n) obj;
                                nVar.f5810b--;
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
                if (!z4) {
                    bVar.e0(i14, i25);
                } else {
                    for (int i26 = i25 - 1; i26 >= 0; i26--) {
                        int i27 = i15 + i26;
                        int i28 = this.f5804c[i27];
                        int i29 = i28 & 31;
                        if (i29 != 0) {
                            if (i29 != 4 && i29 != 8) {
                                if (i29 == 16) {
                                    arrayList.add(new n(i27, i14, false));
                                } else {
                                    StringBuilder m10 = a2.m(i27, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i29));
                                    throw new IllegalStateException(m10.toString());
                                }
                            }
                            bVar.D(d(i28 >> 5, arrayList, true).f5810b, i14);
                            if (i29 == 4) {
                                qVar.getClass();
                                bVar.k1(i14, 1);
                            }
                        } else {
                            bVar.e0(i14, 1);
                            int size3 = arrayList.size();
                            int i30 = 0;
                            while (i30 < size3) {
                                Object obj2 = arrayList.get(i30);
                                i30++;
                                ((n) obj2).f5810b++;
                            }
                        }
                    }
                }
            }
            for (int i31 = i13 - 1; i31 >= 0; i31--) {
                int i32 = pVar.f5820a + i31;
                if ((iArr3[i32] & 31) == 2) {
                    qVar.getClass();
                    bVar.k1(i32, 1);
                }
            }
            i11 = pVar.f5820a;
            i12 = pVar.f5821b;
            size = i24 - 1;
            arrayList2 = arrayList3;
        }
        bVar.a();
    }

    public final void b(o0 o0Var) {
        a(new ja.c(o0Var, 7));
    }

    public final void c(int i10, int i11, int i12, boolean z4) {
        int i13;
        int i14;
        if (z4) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            p pVar = (p) this.f5802a.get(i12);
            int i15 = pVar.f5820a;
            int i16 = pVar.f5822c;
            int i17 = i15 + i16;
            int i18 = pVar.f5821b + i16;
            int[] iArr = this.f5803b;
            int[] iArr2 = this.f5804c;
            int i19 = 4;
            q qVar = this.d;
            if (z4) {
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
            i14 = pVar.f5820a;
            i11 = pVar.f5821b;
            i12--;
        }
    }
}
