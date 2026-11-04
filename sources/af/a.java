package af;

import df.e;
import gf.p;
import gf.s;
public final class a implements kf.a {
    @Override
    public final int a(e eVar, e eVar2) {
        if (eVar.f8857g >= 2 && eVar2.f8857g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final char b() {
        return '~';
    }

    @Override
    public final void c(s sVar, s sVar2, int i3) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f12269f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f12269f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f12269f;
        pVar.f12269f = pVar3;
        if (pVar3 != null) {
            pVar3.f12268e = pVar;
        }
        pVar.f12268e = sVar;
        sVar.f12269f = pVar;
        p pVar4 = (p) sVar.f12266b;
        pVar.f12266b = pVar4;
        if (((p) pVar.f12269f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final int d() {
        return 2;
    }

    @Override
    public final char e() {
        return '~';
    }
}
