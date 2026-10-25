package cf;

import bf.e;
import ef.g;
import ef.p;
import ef.s;
public final class a implements hf.a {
    public final char f6286a;

    public a(int i10) {
        this('*');
        switch (i10) {
            case 1:
                this('_');
                return;
            default:
                return;
        }
    }

    @Override
    public final int a(e eVar, e eVar2) {
        if (eVar.d || eVar2.f3914c) {
            int i10 = eVar2.h;
            if (i10 % 3 != 0 && (eVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (eVar.f3916g >= 2 && eVar2.f3916g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final char b() {
        return this.f6286a;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final void d(s sVar, s sVar2, int i10) {
        g gVar;
        String.valueOf(this.f6286a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f9939f; pVar != null && pVar != sVar2; pVar = (p) pVar.f9939f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f9939f;
        gVar.f9939f = pVar2;
        if (pVar2 != null) {
            pVar2.e = gVar;
        }
        gVar.e = sVar;
        sVar.f9939f = gVar;
        p pVar3 = (p) sVar.f9937b;
        gVar.f9937b = pVar3;
        if (((p) gVar.f9939f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char e() {
        return this.f6286a;
    }

    public a(char c10) {
        this.f6286a = c10;
    }
}
