package jc;

import com.google.firebase.messaging.m;
public final class e {
    public final hc.e f14116a;
    public final int f14117b;
    public final int f14118c;
    public final int d;
    public final e f14119e;
    public final int f14120f;

    public e(m mVar, hc.e eVar, int i10, int i11, int i12, e eVar2, hc.f fVar) {
        int i13;
        int i14;
        this.f14116a = eVar;
        this.f14117b = i10;
        hc.e eVar3 = hc.e.BYTE;
        if (eVar != eVar3 && eVar2 != null) {
            i13 = eVar2.f14118c;
        } else {
            i13 = i11;
        }
        this.f14118c = i13;
        this.d = i12;
        this.f14119e = eVar2;
        boolean z10 = false;
        if (eVar2 != null) {
            i14 = eVar2.f14120f;
        } else {
            i14 = 0;
        }
        if ((eVar == eVar3 && eVar2 == null && i13 != 0) || (eVar2 != null && i13 != eVar2.f14118c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar2 == null || eVar != eVar2.f14116a || z10) ? i14 + eVar.a(fVar) + 4 : i14;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) mVar.f7952b).substring(i10, i12 + i10).getBytes(((dc.e) mVar.f7953c).f8286a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f14120f = i14;
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
        this.f14120f = i14;
    }
}
