package ce;

import fe.c;
import ie.p;
import ie.s;
public final class a implements le.a {
    @Override
    public final int a(c cVar, c cVar2) {
        if (cVar.f6057g >= 2 && cVar2.f6057g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void b(s sVar, s sVar2, int i9) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f11125f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f11125f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f11125f;
        pVar.f11125f = pVar3;
        if (pVar3 != null) {
            pVar3.f11124e = pVar;
        }
        pVar.f11124e = sVar;
        sVar.f11125f = pVar;
        p pVar4 = (p) sVar.f11122b;
        pVar.f11122b = pVar4;
        if (((p) pVar.f11125f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final char c() {
        return '~';
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
