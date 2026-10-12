package fb;

import db.u;
public final class f extends u {
    public volatile u f9808a;
    public final boolean f9809b;
    public final boolean f9810c;
    public final db.g d;
    public final kb.a f9811e;
    public final g f9812f;

    public f(g gVar, boolean z10, boolean z11, db.g gVar2, kb.a aVar) {
        this.f9812f = gVar;
        this.f9809b = z10;
        this.f9810c = z11;
        this.d = gVar2;
        this.f9811e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9809b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9808a;
        if (uVar == null) {
            uVar = this.d.c(this.f9812f, this.f9811e);
            this.f9808a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9810c) {
            bVar.i();
            return;
        }
        u uVar = this.f9808a;
        if (uVar == null) {
            uVar = this.d.c(this.f9812f, this.f9811e);
            this.f9808a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
