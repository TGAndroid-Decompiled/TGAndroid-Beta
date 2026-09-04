package fb;

import db.u;
public final class e extends u {
    public volatile u f9422a;
    public final boolean f9423b;
    public final boolean f9424c;
    public final db.g d;
    public final kb.a f9425e;
    public final f f9426f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9426f = fVar;
        this.f9423b = z10;
        this.f9424c = z11;
        this.d = gVar;
        this.f9425e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9423b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9422a;
        if (uVar == null) {
            uVar = this.d.c(this.f9426f, this.f9425e);
            this.f9422a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9424c) {
            bVar.i();
            return;
        }
        u uVar = this.f9422a;
        if (uVar == null) {
            uVar = this.d.c(this.f9426f, this.f9425e);
            this.f9422a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
