package hf;

import gf.e;
import kf.g;
import kf.p;
import kf.s;
public final class a implements nf.a {
    public final char f14488a;

    public a(int i7) {
        this('*');
        switch (i7) {
            case 1:
                this('_');
                return;
            default:
                return;
        }
    }

    @Override
    public final void a(s sVar, s sVar2, int i7) {
        g gVar;
        String.valueOf(this.f14488a);
        if (i7 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f17281f; pVar != null && pVar != sVar2; pVar = (p) pVar.f17281f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f17281f;
        gVar.f17281f = pVar2;
        if (pVar2 != null) {
            pVar2.f17280e = gVar;
        }
        gVar.f17280e = sVar;
        sVar.f17281f = gVar;
        p pVar3 = (p) sVar.f17278b;
        gVar.f17278b = pVar3;
        if (((p) gVar.f17281f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char b() {
        return this.f14488a;
    }

    @Override
    public final int c(e eVar, e eVar2) {
        if (eVar.d || eVar2.f13882c) {
            int i7 = eVar2.h;
            if (i7 % 3 != 0 && (eVar.h + i7) % 3 == 0) {
                return 0;
            }
        }
        if (eVar.f13885g >= 2 && eVar2.f13885g >= 2) {
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
        return this.f14488a;
    }

    public a(char c10) {
        this.f14488a = c10;
    }
}
