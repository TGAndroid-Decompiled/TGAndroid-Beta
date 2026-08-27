package he;

import ge.c;
import je.g;
import je.p;
import je.s;

public final class a implements me.a {

    public final char f8918a;

    public a(int i10) {
        this('*');
        switch (i10) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override
    public final char a() {
        return this.f8918a;
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        String.valueOf(this.f8918a);
        g gVar = i10 == 1 ? new g(0) : new g(3);
        p pVar = (p) sVar.f12927f;
        while (pVar != null && pVar != sVar2) {
            p pVar2 = (p) pVar.f12927f;
            gVar.b(pVar);
            pVar = pVar2;
        }
        gVar.g();
        p pVar3 = (p) sVar.f12927f;
        gVar.f12927f = pVar3;
        if (pVar3 != null) {
            pVar3.f12926e = gVar;
        }
        gVar.f12926e = sVar;
        sVar.f12927f = gVar;
        p pVar4 = (p) sVar.f12924b;
        gVar.f12924b = pVar4;
        if (((p) gVar.f12927f) == null) {
            pVar4.d = gVar;
        }
    }

    @Override
    public final int c(c cVar, c cVar2) {
        if (cVar.d || cVar2.f6854c) {
            int i10 = cVar2.h;
            if (i10 % 3 != 0 && (cVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        return (cVar.f6857g < 2 || cVar2.f6857g < 2) ? 1 : 2;
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final char e() {
        return this.f8918a;
    }

    public a(char c10) {
        this.f8918a = c10;
    }
}
