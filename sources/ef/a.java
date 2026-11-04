package ef;

import df.e;
import gf.g;
import gf.p;
import gf.s;
public final class a implements kf.a {
    public final char f9967a;

    public a(int i3) {
        this('*');
        switch (i3) {
            case 1:
                this('_');
                return;
            default:
                return;
        }
    }

    @Override
    public final int a(e eVar, e eVar2) {
        if (eVar.d || eVar2.f8854c) {
            int i3 = eVar2.h;
            if (i3 % 3 != 0 && (eVar.h + i3) % 3 == 0) {
                return 0;
            }
        }
        if (eVar.f8857g >= 2 && eVar2.f8857g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final char b() {
        return this.f9967a;
    }

    @Override
    public final void c(s sVar, s sVar2, int i3) {
        g gVar;
        String.valueOf(this.f9967a);
        if (i3 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f12269f; pVar != null && pVar != sVar2; pVar = (p) pVar.f12269f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f12269f;
        gVar.f12269f = pVar2;
        if (pVar2 != null) {
            pVar2.f12268e = gVar;
        }
        gVar.f12268e = sVar;
        sVar.f12269f = gVar;
        p pVar3 = (p) sVar.f12266b;
        gVar.f12266b = pVar3;
        if (((p) gVar.f12269f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final char e() {
        return this.f9967a;
    }

    public a(char c2) {
        this.f9967a = c2;
    }
}
