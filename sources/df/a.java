package df;

import gf.e;
import kf.p;
import kf.s;
public final class a implements nf.a {
    @Override
    public final void a(s sVar, s sVar2, int i7) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f18232f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f18232f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f18232f;
        pVar.f18232f = pVar3;
        if (pVar3 != null) {
            pVar3.f18231e = pVar;
        }
        pVar.f18231e = sVar;
        sVar.f18232f = pVar;
        p pVar4 = (p) sVar.f18229b;
        pVar.f18229b = pVar4;
        if (((p) pVar.f18232f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final char b() {
        return '~';
    }

    @Override
    public final int c(e eVar, e eVar2) {
        if (eVar.f13536g >= 2 && eVar2.f13536g >= 2) {
            return 2;
        }
        return 0;
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
