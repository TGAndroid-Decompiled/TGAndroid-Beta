package fb;

import db.u;
public final class e extends u {
    public volatile u f9004a;
    public final boolean f9005b;
    public final boolean f9006c;
    public final db.g d;
    public final kb.a e;
    public final f f9007f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9007f = fVar;
        this.f9005b = z10;
        this.f9006c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9005b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9004a;
        if (uVar == null) {
            uVar = this.d.c(this.f9007f, this.e);
            this.f9004a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9006c) {
            bVar.i();
            return;
        }
        u uVar = this.f9004a;
        if (uVar == null) {
            uVar = this.d.c(this.f9007f, this.e);
            this.f9004a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
