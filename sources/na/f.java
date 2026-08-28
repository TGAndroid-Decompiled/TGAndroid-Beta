package na;

import la.u;
public final class f extends u {
    public volatile u f18530a;
    public final boolean f18531b;
    public final boolean f18532c;
    public final la.g d;
    public final sa.a f18533e;
    public final g f18534f;

    public f(g gVar, boolean z10, boolean z11, la.g gVar2, sa.a aVar) {
        this.f18534f = gVar;
        this.f18531b = z10;
        this.f18532c = z11;
        this.d = gVar2;
        this.f18533e = aVar;
    }

    @Override
    public final Object read(ta.a aVar) {
        if (this.f18531b) {
            aVar.C();
            return null;
        }
        u uVar = this.f18530a;
        if (uVar == null) {
            uVar = this.d.c(this.f18534f, this.f18533e);
            this.f18530a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        if (this.f18532c) {
            cVar.i();
            return;
        }
        u uVar = this.f18530a;
        if (uVar == null) {
            uVar = this.d.c(this.f18534f, this.f18533e);
            this.f18530a = uVar;
        }
        uVar.write(cVar, obj);
    }
}
