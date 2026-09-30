package fb;

import db.u;
public final class e extends u {
    public volatile u f9003a;
    public final boolean f9004b;
    public final boolean f9005c;
    public final db.g d;
    public final kb.a e;
    public final f f9006f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9006f = fVar;
        this.f9004b = z10;
        this.f9005c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9004b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9003a;
        if (uVar == null) {
            uVar = this.d.c(this.f9006f, this.e);
            this.f9003a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9005c) {
            bVar.i();
            return;
        }
        u uVar = this.f9003a;
        if (uVar == null) {
            uVar = this.d.c(this.f9006f, this.e);
            this.f9003a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
