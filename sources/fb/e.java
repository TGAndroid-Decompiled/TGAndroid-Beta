package fb;

import db.u;
public final class e extends u {
    public volatile u f9799a;
    public final boolean f9800b;
    public final boolean f9801c;
    public final db.g d;
    public final kb.a f9802e;
    public final f f9803f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9803f = fVar;
        this.f9800b = z10;
        this.f9801c = z11;
        this.d = gVar;
        this.f9802e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9800b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9799a;
        if (uVar == null) {
            uVar = this.d.c(this.f9803f, this.f9802e);
            this.f9799a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9801c) {
            bVar.i();
            return;
        }
        u uVar = this.f9799a;
        if (uVar == null) {
            uVar = this.d.c(this.f9803f, this.f9802e);
            this.f9799a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
