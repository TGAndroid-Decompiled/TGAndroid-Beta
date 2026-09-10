package fb;

import db.u;
public final class e extends u {
    public volatile u f7903a;
    public final boolean f7904b;
    public final boolean f7905c;
    public final db.g d;
    public final kb.a e;
    public final f f7906f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f7906f = fVar;
        this.f7904b = z10;
        this.f7905c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f7904b) {
            aVar.C();
            return null;
        }
        u uVar = this.f7903a;
        if (uVar == null) {
            uVar = this.d.c(this.f7906f, this.e);
            this.f7903a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f7905c) {
            bVar.i();
            return;
        }
        u uVar = this.f7903a;
        if (uVar == null) {
            uVar = this.d.c(this.f7906f, this.e);
            this.f7903a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
