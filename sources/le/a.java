package le;

import ke.c;
import ne.g;
import ne.p;
import ne.s;
public final class a implements qe.a {
    public final char f12382a;

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
    public final void a(s sVar, s sVar2, int i10) {
        g gVar;
        String.valueOf(this.f12382a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f15979f; pVar != null && pVar != sVar2; pVar = (p) pVar.f15979f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f15979f;
        gVar.f15979f = pVar2;
        if (pVar2 != null) {
            pVar2.f15978e = gVar;
        }
        gVar.f15978e = sVar;
        sVar.f15979f = gVar;
        p pVar3 = (p) sVar.f15976b;
        gVar.f15976b = pVar3;
        if (((p) gVar.f15979f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char b() {
        return this.f12382a;
    }

    @Override
    public final int c(c cVar, c cVar2) {
        if (cVar.d || cVar2.f11111c) {
            int i10 = cVar2.h;
            if (i10 % 3 != 0 && (cVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (cVar.f11114g >= 2 && cVar2.f11114g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final char e() {
        return this.f12382a;
    }

    public a(char c3) {
        this.f12382a = c3;
    }
}
