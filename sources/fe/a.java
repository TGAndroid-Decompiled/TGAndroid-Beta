package fe;

import ie.c;
import le.p;
import le.s;
public final class a implements oe.a {
    @Override
    public final void a(s sVar, s sVar2, int i10) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f15208f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f15208f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f15208f;
        pVar.f15208f = pVar3;
        if (pVar3 != null) {
            pVar3.f15207e = pVar;
        }
        pVar.f15207e = sVar;
        sVar.f15208f = pVar;
        p pVar4 = (p) sVar.f15205b;
        pVar.f15205b = pVar4;
        if (((p) pVar.f15208f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final char b() {
        return '~';
    }

    @Override
    public final int c(c cVar, c cVar2) {
        if (cVar.f8894g >= 2 && cVar2.f8894g >= 2) {
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
