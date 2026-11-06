package ic;

import ab.q;
import cc.f;
public final class d {
    public final gc.d f15440a;
    public final int f15441b;
    public final int f15442c;
    public final int d;
    public final d f15443e;
    public final int f15444f;

    public d(q qVar, gc.d dVar, int i7, int i10, int i11, d dVar2, gc.e eVar) {
        int i12;
        int i13;
        this.f15440a = dVar;
        this.f15441b = i7;
        gc.d dVar3 = gc.d.BYTE;
        if (dVar != dVar3 && dVar2 != null) {
            i12 = dVar2.f15442c;
        } else {
            i12 = i10;
        }
        this.f15442c = i12;
        this.d = i11;
        this.f15443e = dVar2;
        boolean z9 = false;
        if (dVar2 != null) {
            i13 = dVar2.f15444f;
        } else {
            i13 = 0;
        }
        if ((dVar == dVar3 && dVar2 == null && i12 != 0) || (dVar2 != null && i12 != dVar2.f15442c)) {
            z9 = true;
        }
        int i14 = 4;
        i13 = (dVar2 == null || dVar != dVar2.f15440a || z9) ? i13 + dVar.a(eVar) + 4 : i13;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i13 += 13;
                    }
                } else {
                    i13 += ((String) qVar.f990b).substring(i7, i11 + i7).getBytes(((f) qVar.f991c).f6061a[i10].charset()).length * 8;
                    if (z9) {
                        i13 += 12;
                    }
                }
                this.f15444f = i13;
            } else if (i11 == 1) {
                i14 = 6;
            } else {
                i14 = 11;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                i14 = 7;
            } else {
                i14 = 10;
            }
        }
        i13 += i14;
        this.f15444f = i13;
    }
}
