package hf;

import gf.e;
import kf.g;
import kf.p;
import kf.s;
public final class a implements nf.a {
    public final char f13845a;

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
        String.valueOf(this.f13845a);
        if (i7 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f17843f; pVar != null && pVar != sVar2; pVar = (p) pVar.f17843f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f17843f;
        gVar.f17843f = pVar2;
        if (pVar2 != null) {
            pVar2.f17842e = gVar;
        }
        gVar.f17842e = sVar;
        sVar.f17843f = gVar;
        p pVar3 = (p) sVar.f17840b;
        gVar.f17840b = pVar3;
        if (((p) gVar.f17843f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char b() {
        return this.f13845a;
    }

    @Override
    public final int c(e eVar, e eVar2) {
        if (eVar.d || eVar2.f13226c) {
            int i7 = eVar2.h;
            if (i7 % 3 != 0 && (eVar.h + i7) % 3 == 0) {
                return 0;
            }
        }
        if (eVar.f13229g >= 2 && eVar2.f13229g >= 2) {
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
        return this.f13845a;
    }

    public a(char c10) {
        this.f13845a = c10;
    }
}
