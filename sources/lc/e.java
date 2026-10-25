package lc;
public final class e {
    public final jc.e f16977a;
    public final int f16978b;
    public final int f16979c;
    public final int d;
    public final e e;
    public final int f16980f;

    public e(c2.b bVar, jc.e eVar, int i10, int i11, int i12, e eVar2, jc.f fVar) {
        int i13;
        int i14;
        this.f16977a = eVar;
        this.f16978b = i10;
        jc.e eVar3 = jc.e.BYTE;
        if (eVar != eVar3 && eVar2 != null) {
            i13 = eVar2.f16979c;
        } else {
            i13 = i11;
        }
        this.f16979c = i13;
        this.d = i12;
        this.e = eVar2;
        boolean z10 = false;
        if (eVar2 != null) {
            i14 = eVar2.f16980f;
        } else {
            i14 = 0;
        }
        if ((eVar == eVar3 && eVar2 == null && i13 != 0) || (eVar2 != null && i13 != eVar2.f16979c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar2 == null || eVar != eVar2.f16977a || z10) ? i14 + eVar.a(fVar) + 4 : i14;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) bVar.f5930b).substring(i10, i12 + i10).getBytes(((fc.d) bVar.f5931c).f10412a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f16980f = i14;
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
        this.f16980f = i14;
    }
}
