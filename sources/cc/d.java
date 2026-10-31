package cc;

import ac.h;
public final class d {
    public final ac.f f4108a;
    public final int f4109b;
    public final int f4110c;
    public final int d;
    public final d e;
    public final int f4111f;

    public d(ac.a aVar, ac.f fVar, int i10, int i11, int i12, d dVar, h hVar) {
        int i13;
        int i14;
        this.f4108a = fVar;
        this.f4109b = i10;
        ac.f fVar2 = ac.f.BYTE;
        if (fVar != fVar2 && dVar != null) {
            i13 = dVar.f4110c;
        } else {
            i13 = i11;
        }
        this.f4110c = i13;
        this.d = i12;
        this.e = dVar;
        boolean z10 = false;
        if (dVar != null) {
            i14 = dVar.f4111f;
        } else {
            i14 = 0;
        }
        if ((fVar == fVar2 && dVar == null && i13 != 0) || (dVar != null && i13 != dVar.f4110c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (dVar == null || fVar != dVar.f4108a || z10) ? i14 + fVar.a(hVar) + 4 : i14;
        int ordinal = fVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i14 += 13;
                    }
                } else {
                    i14 += ((String) aVar.f363b).substring(i10, i12 + i10).getBytes(((wb.d) aVar.f364c).f52782a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                }
                this.f4111f = i14;
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
        this.f4111f = i14;
    }
}
