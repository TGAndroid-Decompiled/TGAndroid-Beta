package fb;

import db.u;
public final class e extends u {
    public volatile u f9809a;
    public final boolean f9810b;
    public final boolean f9811c;
    public final db.g d;
    public final kb.a f9812e;
    public final f f9813f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9813f = fVar;
        this.f9810b = z10;
        this.f9811c = z11;
        this.d = gVar;
        this.f9812e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9810b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9809a;
        if (uVar == null) {
            uVar = this.d.c(this.f9813f, this.f9812e);
            this.f9809a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9811c) {
            bVar.i();
            return;
        }
        u uVar = this.f9809a;
        if (uVar == null) {
            uVar = this.d.c(this.f9813f, this.f9812e);
            this.f9809a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
