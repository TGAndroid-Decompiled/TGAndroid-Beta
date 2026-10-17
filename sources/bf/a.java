package bf;

import af.f;
import df.g;
import df.p;
import df.s;
public final class a implements gf.a {
    public final char f4346a;

    public a(int i10) {
        this('*');
        switch (i10) {
            case 1:
                this('_');
                return;
            default:
                return;
        }
    }

    @Override
    public final char a() {
        return this.f4346a;
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        g gVar;
        String.valueOf(this.f4346a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f7988f; pVar != null && pVar != sVar2; pVar = (p) pVar.f7988f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f7988f;
        gVar.f7988f = pVar2;
        if (pVar2 != null) {
            pVar2.e = gVar;
        }
        gVar.e = sVar;
        sVar.f7988f = gVar;
        p pVar3 = (p) sVar.f7986b;
        gVar.f7986b = pVar3;
        if (((p) gVar.f7988f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final int d(f fVar, f fVar2) {
        if (fVar.d || fVar2.f564c) {
            int i10 = fVar2.h;
            if (i10 % 3 != 0 && (fVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (fVar.f566g >= 2 && fVar2.f566g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final char e() {
        return this.f4346a;
    }

    public a(char c10) {
        this.f4346a = c10;
    }
}
