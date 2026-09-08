package fb;

import db.u;
public final class e extends u {
    public volatile u f9450a;
    public final boolean f9451b;
    public final boolean f9452c;
    public final db.g d;
    public final kb.a f9453e;
    public final f f9454f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9454f = fVar;
        this.f9451b = z10;
        this.f9452c = z11;
        this.d = gVar;
        this.f9453e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9451b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9450a;
        if (uVar == null) {
            uVar = this.d.c(this.f9454f, this.f9453e);
            this.f9450a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9452c) {
            bVar.i();
            return;
        }
        u uVar = this.f9450a;
        if (uVar == null) {
            uVar = this.d.c(this.f9454f, this.f9453e);
            this.f9450a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
