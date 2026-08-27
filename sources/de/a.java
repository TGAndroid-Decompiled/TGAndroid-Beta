package de;

import ge.c;
import je.p;
import je.s;

public final class a implements me.a {
    @Override
    public final char a() {
        return '~';
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        ce.a aVar = new ce.a();
        p pVar = (p) sVar.f12927f;
        while (pVar != null && pVar != sVar2) {
            p pVar2 = (p) pVar.f12927f;
            aVar.b(pVar);
            pVar = pVar2;
        }
        aVar.g();
        p pVar3 = (p) sVar.f12927f;
        aVar.f12927f = pVar3;
        if (pVar3 != null) {
            pVar3.f12926e = aVar;
        }
        aVar.f12926e = sVar;
        sVar.f12927f = aVar;
        p pVar4 = (p) sVar.f12924b;
        aVar.f12924b = pVar4;
        if (((p) aVar.f12927f) == null) {
            pVar4.d = aVar;
        }
    }

    @Override
    public final int c(c cVar, c cVar2) {
        return (cVar.f6857g < 2 || cVar2.f6857g < 2) ? 0 : 2;
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
