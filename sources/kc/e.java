package kc;
public final class e {
    public final ic.e f14215a;
    public final int f14216b;
    public final int f14217c;
    public final int d;
    public final e e;
    public final int f14218f;

    public e(c2.b bVar, ic.e eVar, int i10, int i11, int i12, e eVar2, ic.f fVar) {
        int i13;
        int i14;
        this.f14215a = eVar;
        this.f14216b = i10;
        ic.e eVar3 = ic.e.BYTE;
        if (eVar != eVar3 && eVar2 != null) {
            i13 = eVar2.f14217c;
        } else {
            i13 = i11;
        }
        this.f14217c = i13;
        this.d = i12;
        this.e = eVar2;
        boolean z10 = false;
        if (eVar2 != null) {
            i14 = eVar2.f14218f;
        } else {
            i14 = 0;
        }
        if ((eVar == eVar3 && eVar2 == null && i13 != 0) || (eVar2 != null && i13 != eVar2.f14217c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar2 == null || eVar != eVar2.f14215a || z10) ? i14 + eVar.a(fVar) + 4 : i14;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) bVar.f4119b).substring(i10, i12 + i10).getBytes(((ec.d) bVar.f4120c).f8707a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f14218f = i14;
            } else if (i12 == 1) {
                i15 = 6;
            } else {
                i15 = 11;
            }
        } else if (i12 != 1) {
            if (i12 == 2) {
                i15 = 7;
            } else {
                i15 = 10;
            }
        }
        i14 += i15;
        this.f14218f = i14;
    }
}
