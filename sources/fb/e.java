package fb;

import db.u;
public final class e extends u {
    public volatile u f9018a;
    public final boolean f9019b;
    public final boolean f9020c;
    public final db.g d;
    public final kb.a e;
    public final f f9021f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9021f = fVar;
        this.f9019b = z10;
        this.f9020c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9019b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9018a;
        if (uVar == null) {
            uVar = this.d.c(this.f9021f, this.e);
            this.f9018a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9020c) {
            bVar.i();
            return;
        }
        u uVar = this.f9018a;
        if (uVar == null) {
            uVar = this.d.c(this.f9021f, this.e);
            this.f9018a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
