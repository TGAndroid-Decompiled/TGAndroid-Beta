package jc;

import com.google.firebase.messaging.m;
import hc.g;
public final class e {
    public final hc.f f11854a;
    public final int f11855b;
    public final int f11856c;
    public final int d;
    public final e e;
    public final int f11857f;

    public e(m mVar, hc.f fVar, int i10, int i11, int i12, e eVar, g gVar) {
        int i13;
        int i14;
        this.f11854a = fVar;
        this.f11855b = i10;
        hc.f fVar2 = hc.f.BYTE;
        if (fVar != fVar2 && eVar != null) {
            i13 = eVar.f11856c;
        } else {
            i13 = i11;
        }
        this.f11856c = i13;
        this.d = i12;
        this.e = eVar;
        boolean z10 = false;
        if (eVar != null) {
            i14 = eVar.f11857f;
        } else {
            i14 = 0;
        }
        if ((fVar == fVar2 && eVar == null && i13 != 0) || (eVar != null && i13 != eVar.f11856c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar == null || fVar != eVar.f11854a || z10) ? i14 + fVar.a(gVar) + 4 : i14;
        int ordinal = fVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) mVar.f6101b).substring(i10, i12 + i10).getBytes(((dc.e) mVar.f6102c).f6401a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f11857f = i14;
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
        this.f11857f = i14;
    }
}
