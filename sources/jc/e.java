package jc;

import com.google.firebase.messaging.m;
public final class e {
    public final hc.e f13631a;
    public final int f13632b;
    public final int f13633c;
    public final int d;
    public final e f13634e;
    public final int f13635f;

    public e(m mVar, hc.e eVar, int i10, int i11, int i12, e eVar2, hc.f fVar) {
        int i13;
        int i14;
        this.f13631a = eVar;
        this.f13632b = i10;
        hc.e eVar3 = hc.e.BYTE;
        if (eVar != eVar3 && eVar2 != null) {
            i13 = eVar2.f13633c;
        } else {
            i13 = i11;
        }
        this.f13633c = i13;
        this.d = i12;
        this.f13634e = eVar2;
        boolean z10 = false;
        if (eVar2 != null) {
            i14 = eVar2.f13635f;
        } else {
            i14 = 0;
        }
        if ((eVar == eVar3 && eVar2 == null && i13 != 0) || (eVar2 != null && i13 != eVar2.f13633c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar2 == null || eVar != eVar2.f13631a || z10) ? i14 + eVar.a(fVar) + 4 : i14;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) mVar.f6399b).substring(i10, i12 + i10).getBytes(((dc.e) mVar.f6400c).f6732a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f13635f = i14;
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
        this.f13635f = i14;
    }
}
