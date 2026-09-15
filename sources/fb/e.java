package fb;

import db.u;
public final class e extends u {
    public volatile u f9016a;
    public final boolean f9017b;
    public final boolean f9018c;
    public final db.g d;
    public final kb.a e;
    public final f f9019f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9019f = fVar;
        this.f9017b = z10;
        this.f9018c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9017b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9016a;
        if (uVar == null) {
            uVar = this.d.c(this.f9019f, this.e);
            this.f9016a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9018c) {
            bVar.i();
            return;
        }
        u uVar = this.f9016a;
        if (uVar == null) {
            uVar = this.d.c(this.f9019f, this.e);
            this.f9016a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
