package he;

import ke.c;
import ne.p;
import ne.s;
public final class a implements qe.a {
    @Override
    public final void a(s sVar, s sVar2, int i10) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f15979f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f15979f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f15979f;
        pVar.f15979f = pVar3;
        if (pVar3 != null) {
            pVar3.f15978e = pVar;
        }
        pVar.f15978e = sVar;
        sVar.f15979f = pVar;
        p pVar4 = (p) sVar.f15976b;
        pVar.f15976b = pVar4;
        if (((p) pVar.f15979f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final char b() {
        return '~';
    }

    @Override
    public final int c(c cVar, c cVar2) {
        if (cVar.f11114g >= 2 && cVar2.f11114g >= 2) {
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
