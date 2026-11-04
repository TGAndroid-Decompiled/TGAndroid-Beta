package o4;

import android.os.Bundle;
import b8.zb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.nh;
public final class c {
    public int f20593a;
    public final int f20594b;
    public final boolean f20595c;
    public Object d;
    public final Cloneable f20596e;
    public Serializable f20597f;
    public Object f20598g;

    public c() {
        this.f20594b = 0;
        this.f20596e = Bundle.EMPTY;
        this.f20593a = -1;
        this.f20595c = true;
    }

    public static u4.l e(int i3, ArrayList arrayList, boolean z10) {
        int i10;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            u4.l lVar = (u4.l) arrayList.get(size);
            if (lVar.f55608a == i3 && lVar.f55610c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    u4.l lVar2 = (u4.l) arrayList.get(size);
                    int i11 = lVar2.f55609b;
                    if (z10) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    lVar2.f55609b = i11 + i10;
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
        int i3 = 1;
        if (((n1) this.d) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f20593a == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = true;
        }
        zb.o("Exactly one of sessionCommand and playerCommand should be set", z12);
        if (((k9.a) this.f20597f) == null) {
            int i10 = this.f20593a;
            if (i10 != 1) {
                if (i10 != 11 && i10 != 7) {
                    i3 = 6;
                    if (i10 != 6) {
                        if (i10 == 12 || i10 == 9 || i10 == 8) {
                            i3 = 3;
                        }
                    }
                }
                i3 = 2;
            }
            this.f20597f = new k9.a(new int[]{i3});
        }
        return new d((n1) this.d, this.f20593a, this.f20594b, (Bundle) this.f20596e, this.f20595c, (k9.a) this.f20597f, this.f20598g);
    }

    public void b(u4.d0 d0Var) {
        u4.c cVar;
        u4.o oVar;
        int i3;
        int[] iArr = (int[]) this.f20596e;
        ArrayList arrayList = (ArrayList) this.d;
        u4.o oVar2 = (u4.o) this.f20598g;
        if (d0Var instanceof u4.c) {
            cVar = (u4.c) d0Var;
        } else {
            cVar = new u4.c(d0Var);
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.f20593a;
        int size = arrayList.size() - 1;
        int i11 = this.f20594b;
        while (size >= 0) {
            u4.n nVar = (u4.n) arrayList.get(size);
            int i12 = nVar.f55626c;
            int i13 = nVar.f55624a + i12;
            int i14 = nVar.f55625b + i12;
            boolean z10 = this.f20595c;
            int[] iArr2 = iArr;
            if (i13 < i10) {
                int i15 = i10 - i13;
                if (!z10) {
                    cVar.O0(i13, i15);
                } else {
                    int i16 = i15 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + i16;
                        int i18 = iArr2[i17];
                        ArrayList arrayList3 = arrayList;
                        int i19 = i18 & 31;
                        if (i19 != 0) {
                            oVar = oVar2;
                            if (i19 != 4 && i19 != 8) {
                                if (i19 == 16) {
                                    arrayList2.add(new u4.l(i17, i17, true));
                                    i3 = i16;
                                } else {
                                    StringBuilder m10 = k2.p1.m(i17, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i19));
                                    throw new IllegalStateException(m10.toString());
                                }
                            } else {
                                int i20 = i18 >> 5;
                                i3 = i16;
                                u4.l e10 = e(i20, arrayList2, false);
                                cVar.E(i17, e10.f55609b - 1);
                                if (i19 == 4) {
                                    oVar.getClass();
                                    cVar.j1(e10.f55609b - 1, 1);
                                }
                            }
                        } else {
                            oVar = oVar2;
                            i3 = i16;
                            boolean z11 = true;
                            cVar.O0(i17, 1);
                            int size2 = arrayList2.size();
                            int i21 = 0;
                            while (i21 < size2) {
                                Object obj = arrayList2.get(i21);
                                i21++;
                                u4.l lVar = (u4.l) obj;
                                lVar.f55609b--;
                                z11 = true;
                            }
                        }
                        i16 = i3 - 1;
                        arrayList = arrayList3;
                        oVar2 = oVar;
                    }
                }
            }
            ArrayList arrayList4 = arrayList;
            u4.o oVar3 = oVar2;
            if (i14 < i11) {
                int i22 = i11 - i14;
                if (!z10) {
                    cVar.l0(i13, i22);
                } else {
                    for (int i23 = i22 - 1; i23 >= 0; i23--) {
                        int i24 = i14 + i23;
                        int i25 = ((int[]) this.f20597f)[i24];
                        int i26 = i25 & 31;
                        if (i26 != 0) {
                            if (i26 != 4 && i26 != 8) {
                                if (i26 == 16) {
                                    arrayList2.add(new u4.l(i24, i13, false));
                                } else {
                                    StringBuilder m11 = k2.p1.m(i24, "unknown flag for pos ", " ");
                                    m11.append(Long.toBinaryString(i26));
                                    throw new IllegalStateException(m11.toString());
                                }
                            }
                            cVar.E(e(i25 >> 5, arrayList2, true).f55609b, i13);
                            if (i26 == 4) {
                                oVar3.getClass();
                                cVar.j1(i13, 1);
                            }
                        } else {
                            boolean z12 = true;
                            cVar.l0(i13, 1);
                            int size3 = arrayList2.size();
                            int i27 = 0;
                            while (i27 < size3) {
                                Object obj2 = arrayList2.get(i27);
                                i27++;
                                ((u4.l) obj2).f55609b++;
                                z12 = true;
                            }
                        }
                    }
                }
            }
            for (int i28 = i12 - 1; i28 >= 0; i28--) {
                int i29 = nVar.f55624a + i28;
                if ((iArr2[i29] & 31) == 2) {
                    oVar3.getClass();
                    cVar.j1(i29, 1);
                }
            }
            i10 = nVar.f55624a;
            i11 = nVar.f55625b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            oVar2 = oVar3;
        }
        cVar.a();
    }

    public void c(u4.h0 h0Var) {
        b(new nh(h0Var, 21));
    }

    public void d(int i3, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int[] iArr = (int[]) this.f20596e;
        int[] iArr2 = (int[]) this.f20597f;
        u4.o oVar = (u4.o) this.f20598g;
        if (z10) {
            i10--;
            i13 = i3;
            i12 = i10;
        } else {
            i12 = i3 - 1;
            i13 = i12;
        }
        while (i11 >= 0) {
            u4.n nVar = (u4.n) ((ArrayList) this.d).get(i11);
            int i14 = nVar.f55624a;
            int i15 = nVar.f55626c;
            int i16 = i14 + i15;
            int i17 = nVar.f55625b + i15;
            int i18 = 4;
            if (z10) {
                for (int i19 = i13 - 1; i19 >= i16; i19--) {
                    if (oVar.b(i19, i12)) {
                        if (oVar.a(i19, i12)) {
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
                    if (oVar.b(i12, i20)) {
                        if (oVar.a(i12, i20)) {
                            i18 = 8;
                        }
                        int i21 = i3 - 1;
                        iArr[i21] = (i20 << 5) | 16;
                        iArr2[i20] = (i21 << 5) | i18;
                        return;
                    }
                }
                continue;
            }
            i13 = nVar.f55624a;
            i10 = nVar.f55625b;
            i11--;
        }
    }

    public c(u4.o oVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.f20596e = iArr;
        this.f20597f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f20598g = oVar;
        int e10 = oVar.e();
        this.f20593a = e10;
        int d = oVar.d();
        this.f20594b = d;
        this.f20595c = z10;
        u4.n nVar = arrayList.isEmpty() ? null : (u4.n) arrayList.get(0);
        if (nVar == null || nVar.f55624a != 0 || nVar.f55625b != 0) {
            ?? obj = new Object();
            obj.f55624a = 0;
            obj.f55625b = 0;
            obj.d = false;
            obj.f55626c = 0;
            obj.f55627e = false;
            arrayList.add(0, obj);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u4.n nVar2 = (u4.n) arrayList.get(size);
            int i3 = nVar2.f55624a;
            int i10 = nVar2.f55626c;
            int i11 = i3 + i10;
            int i12 = nVar2.f55625b + i10;
            if (this.f20595c) {
                while (e10 > i11) {
                    if (iArr[e10 - 1] == 0) {
                        d(e10, d, size, false);
                    }
                    e10--;
                }
                while (d > i12) {
                    if (iArr2[d - 1] == 0) {
                        d(e10, d, size, true);
                    }
                    d--;
                }
            }
            for (int i13 = 0; i13 < nVar2.f55626c; i13++) {
                int i14 = nVar2.f55624a + i13;
                int i15 = nVar2.f55625b + i13;
                int i16 = ((u4.o) this.f20598g).a(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 5) | i16;
                iArr2[i15] = (i14 << 5) | i16;
            }
            e10 = nVar2.f55624a;
            d = nVar2.f55625b;
        }
    }
}
