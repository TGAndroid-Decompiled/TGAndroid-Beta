package fb;

import db.u;
public final class e extends u {
    public volatile u f9810a;
    public final boolean f9811b;
    public final boolean f9812c;
    public final db.g d;
    public final kb.a f9813e;
    public final f f9814f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9814f = fVar;
        this.f9811b = z10;
        this.f9812c = z11;
        this.d = gVar;
        this.f9813e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9811b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9810a;
        if (uVar == null) {
            uVar = this.d.c(this.f9814f, this.f9813e);
            this.f9810a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9812c) {
            bVar.i();
            return;
        }
        u uVar = this.f9810a;
        if (uVar == null) {
            uVar = this.d.c(this.f9814f, this.f9813e);
            this.f9810a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
