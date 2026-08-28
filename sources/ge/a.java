package ge;

import fe.c;
import ie.g;
import ie.p;
import ie.s;
public final class a implements le.a {
    public final char f7746a;

    public a(int i9) {
        this('*');
        switch (i9) {
            case 1:
                this('_');
                return;
            default:
                return;
        }
    }

    @Override
    public final int a(c cVar, c cVar2) {
        if (cVar.d || cVar2.f6054c) {
            int i9 = cVar2.h;
            if (i9 % 3 != 0 && (cVar.h + i9) % 3 == 0) {
                return 0;
            }
        }
        if (cVar.f6057g >= 2 && cVar2.f6057g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final void b(s sVar, s sVar2, int i9) {
        g gVar;
        String.valueOf(this.f7746a);
        if (i9 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f11125f; pVar != null && pVar != sVar2; pVar = (p) pVar.f11125f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f11125f;
        gVar.f11125f = pVar2;
        if (pVar2 != null) {
            pVar2.f11124e = gVar;
        }
        gVar.f11124e = sVar;
        sVar.f11125f = gVar;
        p pVar3 = (p) sVar.f11122b;
        gVar.f11122b = pVar3;
        if (((p) gVar.f11125f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char c() {
        return this.f7746a;
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final char e() {
        return this.f7746a;
    }

    public a(char c10) {
        this.f7746a = c10;
    }
}
