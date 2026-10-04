package jc;

import com.google.firebase.messaging.m;
public final class e {
    public final hc.e f14078a;
    public final int f14079b;
    public final int f14080c;
    public final int d;
    public final e f14081e;
    public final int f14082f;

    public e(m mVar, hc.e eVar, int i10, int i11, int i12, e eVar2, hc.f fVar) {
        int i13;
        int i14;
        this.f14078a = eVar;
        this.f14079b = i10;
        hc.e eVar3 = hc.e.BYTE;
        if (eVar != eVar3 && eVar2 != null) {
            i13 = eVar2.f14080c;
        } else {
            i13 = i11;
        }
        this.f14080c = i13;
        this.d = i12;
        this.f14081e = eVar2;
        boolean z10 = false;
        if (eVar2 != null) {
            i14 = eVar2.f14082f;
        } else {
            i14 = 0;
        }
        if ((eVar == eVar3 && eVar2 == null && i13 != 0) || (eVar2 != null && i13 != eVar2.f14080c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar2 == null || eVar != eVar2.f14078a || z10) ? i14 + eVar.a(fVar) + 4 : i14;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) mVar.f7902b).substring(i10, i12 + i10).getBytes(((dc.e) mVar.f7903c).f8233a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f14082f = i14;
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
        this.f14082f = i14;
    }
}
