package ic;

import ab.q;
import gc.f;
public final class d {
    public final gc.e f15900a;
    public final int f15901b;
    public final int f15902c;
    public final int d;
    public final d f15903e;
    public final int f15904f;

    public d(q qVar, gc.e eVar, int i7, int i10, int i11, d dVar, f fVar) {
        int i12;
        int i13;
        this.f15900a = eVar;
        this.f15901b = i7;
        gc.e eVar2 = gc.e.BYTE;
        if (eVar != eVar2 && dVar != null) {
            i12 = dVar.f15902c;
        } else {
            i12 = i10;
        }
        this.f15902c = i12;
        this.d = i11;
        this.f15903e = dVar;
        boolean z10 = false;
        if (dVar != null) {
            i13 = dVar.f15904f;
        } else {
            i13 = 0;
        }
        if ((eVar == eVar2 && dVar == null && i12 != 0) || (dVar != null && i12 != dVar.f15902c)) {
            z10 = true;
        }
        int i14 = 4;
        i13 = (dVar == null || eVar != dVar.f15900a || z10) ? i13 + eVar.a(fVar) + 4 : i13;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i13 += 13;
                    }
                } else {
                    i13 += ((String) qVar.f989b).substring(i7, i11 + i7).getBytes(((cc.f) qVar.f990c).f4889a[i10].charset()).length * 8;
                    if (z10) {
                        i13 += 12;
                    }
                }
                this.f15904f = i13;
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
        this.f15904f = i13;
    }
}
