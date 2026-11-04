package fc;

import b4.n;
public final class d {
    public final dc.d f11554a;
    public final int f11555b;
    public final int f11556c;
    public final int d;
    public final d f11557e;
    public final int f11558f;

    public d(n nVar, dc.d dVar, int i3, int i10, int i11, d dVar2, dc.e eVar) {
        int i12;
        int i13;
        this.f11554a = dVar;
        this.f11555b = i3;
        dc.d dVar3 = dc.d.BYTE;
        if (dVar != dVar3 && dVar2 != null) {
            i12 = dVar2.f11556c;
        } else {
            i12 = i10;
        }
        this.f11556c = i12;
        this.d = i11;
        this.f11557e = dVar2;
        boolean z10 = false;
        if (dVar2 != null) {
            i13 = dVar2.f11558f;
        } else {
            i13 = 0;
        }
        if ((dVar == dVar3 && dVar2 == null && i12 != 0) || (dVar2 != null && i12 != dVar2.f11556c)) {
            z10 = true;
        }
        int i14 = 4;
        i13 = (dVar2 == null || dVar != dVar2.f11554a || z10) ? i13 + dVar.a(eVar) + 4 : i13;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i13 += 13;
                    }
                } else {
                    i13 += ((String) nVar.f2378b).substring(i3, i11 + i3).getBytes(((zb.d) nVar.f2379c).f60358a[i10].charset()).length * 8;
                    if (z10) {
                        i13 += 12;
                    }
                }
                this.f11558f = i13;
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
        this.f11558f = i13;
    }
}
