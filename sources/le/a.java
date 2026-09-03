package le;

import ke.c;
import ne.g;
import ne.p;
import ne.s;
public final class a implements qe.a {
    public final char f12053a;

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
        String.valueOf(this.f12053a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f14942f; pVar != null && pVar != sVar2; pVar = (p) pVar.f14942f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f14942f;
        gVar.f14942f = pVar2;
        if (pVar2 != null) {
            pVar2.e = gVar;
        }
        gVar.e = sVar;
        sVar.f14942f = gVar;
        p pVar3 = (p) sVar.f14940b;
        gVar.f14940b = pVar3;
        if (((p) gVar.f14942f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char b() {
        return this.f12053a;
    }

    @Override
    public final int c(c cVar, c cVar2) {
        if (cVar.d || cVar2.f10319c) {
            int i10 = cVar2.h;
            if (i10 % 3 != 0 && (cVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (cVar.f10321g >= 2 && cVar2.f10321g >= 2) {
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
        return this.f12053a;
    }

    public a(char c3) {
        this.f12053a = c3;
    }
}
