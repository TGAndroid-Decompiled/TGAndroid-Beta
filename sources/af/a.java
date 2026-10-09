package af;

import cf.g;
import cf.p;
import cf.s;
import ze.b;
public final class a implements ff.a {
    public final char f525a;

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
    public final int a(b bVar, b bVar2) {
        if (bVar.d || bVar2.f54372c) {
            int i10 = bVar2.h;
            if (i10 % 3 != 0 && (bVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (bVar.f54375g >= 2 && bVar2.f54375g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        g gVar;
        String.valueOf(this.f525a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f4655f; pVar != null && pVar != sVar2; pVar = (p) pVar.f4655f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f4655f;
        gVar.f4655f = pVar2;
        if (pVar2 != null) {
            pVar2.f4654e = gVar;
        }
        gVar.f4654e = sVar;
        sVar.f4655f = gVar;
        p pVar3 = (p) sVar.f4652b;
        gVar.f4652b = pVar3;
        if (((p) gVar.f4655f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char c() {
        return this.f525a;
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final char e() {
        return this.f525a;
    }

    public a(char c10) {
        this.f525a = c10;
    }
}
