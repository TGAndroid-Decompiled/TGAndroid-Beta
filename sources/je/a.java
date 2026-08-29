package je;

import ie.c;
import le.g;
import le.p;
import le.s;
public final class a implements oe.a {
    public final char f11546a;

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
    public final void a(s sVar, s sVar2, int i10) {
        g gVar;
        String.valueOf(this.f11546a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f15208f; pVar != null && pVar != sVar2; pVar = (p) pVar.f15208f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f15208f;
        gVar.f15208f = pVar2;
        if (pVar2 != null) {
            pVar2.f15207e = gVar;
        }
        gVar.f15207e = sVar;
        sVar.f15208f = gVar;
        p pVar3 = (p) sVar.f15205b;
        gVar.f15205b = pVar3;
        if (((p) gVar.f15208f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char b() {
        return this.f11546a;
    }

    @Override
    public final int c(c cVar, c cVar2) {
        if (cVar.d || cVar2.f8891c) {
            int i10 = cVar2.h;
            if (i10 % 3 != 0 && (cVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (cVar.f8894g >= 2 && cVar2.f8894g >= 2) {
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
        return this.f11546a;
    }

    public a(char c3) {
        this.f11546a = c3;
    }
}
