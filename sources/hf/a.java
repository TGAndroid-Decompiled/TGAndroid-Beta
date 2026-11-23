package hf;

import gf.e;
import kf.g;
import kf.p;
import kf.s;
public final class a implements nf.a {
    public final char f14191a;

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
        String.valueOf(this.f14191a);
        if (i7 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f18269f; pVar != null && pVar != sVar2; pVar = (p) pVar.f18269f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f18269f;
        gVar.f18269f = pVar2;
        if (pVar2 != null) {
            pVar2.f18268e = gVar;
        }
        gVar.f18268e = sVar;
        sVar.f18269f = gVar;
        p pVar3 = (p) sVar.f18266b;
        gVar.f18266b = pVar3;
        if (((p) gVar.f18269f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char b() {
        return this.f14191a;
    }

    @Override
    public final int c(e eVar, e eVar2) {
        if (eVar.d || eVar2.f13570c) {
            int i7 = eVar2.h;
            if (i7 % 3 != 0 && (eVar.h + i7) % 3 == 0) {
                return 0;
            }
        }
        if (eVar.f13573g >= 2 && eVar2.f13573g >= 2) {
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
        return this.f14191a;
    }

    public a(char c10) {
        this.f14191a = c10;
    }
}
