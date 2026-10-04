package fb;

import db.u;
public final class e extends u {
    public volatile u f9798a;
    public final boolean f9799b;
    public final boolean f9800c;
    public final db.g d;
    public final kb.a f9801e;
    public final f f9802f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9802f = fVar;
        this.f9799b = z10;
        this.f9800c = z11;
        this.d = gVar;
        this.f9801e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9799b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9798a;
        if (uVar == null) {
            uVar = this.d.c(this.f9802f, this.f9801e);
            this.f9798a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9800c) {
            bVar.i();
            return;
        }
        u uVar = this.f9798a;
        if (uVar == null) {
            uVar = this.d.c(this.f9802f, this.f9801e);
            this.f9798a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
