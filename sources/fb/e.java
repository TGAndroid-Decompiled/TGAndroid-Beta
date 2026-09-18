package fb;

import db.u;
public final class e extends u {
    public volatile u f9020a;
    public final boolean f9021b;
    public final boolean f9022c;
    public final db.g d;
    public final kb.a e;
    public final f f9023f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9023f = fVar;
        this.f9021b = z10;
        this.f9022c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9021b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9020a;
        if (uVar == null) {
            uVar = this.d.c(this.f9023f, this.e);
            this.f9020a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9022c) {
            bVar.i();
            return;
        }
        u uVar = this.f9020a;
        if (uVar == null) {
            uVar = this.d.c(this.f9023f, this.e);
            this.f9020a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
