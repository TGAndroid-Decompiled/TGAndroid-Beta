package jc;

import com.google.firebase.messaging.m;
public final class e {
    public final hc.e f13605a;
    public final int f13606b;
    public final int f13607c;
    public final int d;
    public final e f13608e;
    public final int f13609f;

    public e(m mVar, hc.e eVar, int i10, int i11, int i12, e eVar2, hc.f fVar) {
        int i13;
        int i14;
        this.f13605a = eVar;
        this.f13606b = i10;
        hc.e eVar3 = hc.e.BYTE;
        if (eVar != eVar3 && eVar2 != null) {
            i13 = eVar2.f13607c;
        } else {
            i13 = i11;
        }
        this.f13607c = i13;
        this.d = i12;
        this.f13608e = eVar2;
        boolean z10 = false;
        if (eVar2 != null) {
            i14 = eVar2.f13609f;
        } else {
            i14 = 0;
        }
        if ((eVar == eVar3 && eVar2 == null && i13 != 0) || (eVar2 != null && i13 != eVar2.f13607c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar2 == null || eVar != eVar2.f13605a || z10) ? i14 + eVar.a(fVar) + 4 : i14;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) mVar.f6372b).substring(i10, i12 + i10).getBytes(((dc.e) mVar.f6373c).f6705a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f13609f = i14;
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
        this.f13609f = i14;
    }
}
