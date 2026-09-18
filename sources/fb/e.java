package fb;

import db.u;
public final class e extends u {
    public volatile u f9021a;
    public final boolean f9022b;
    public final boolean f9023c;
    public final db.g d;
    public final kb.a e;
    public final f f9024f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9024f = fVar;
        this.f9022b = z10;
        this.f9023c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9022b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9021a;
        if (uVar == null) {
            uVar = this.d.c(this.f9024f, this.e);
            this.f9021a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9023c) {
            bVar.i();
            return;
        }
        u uVar = this.f9021a;
        if (uVar == null) {
            uVar = this.d.c(this.f9024f, this.e);
            this.f9021a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
