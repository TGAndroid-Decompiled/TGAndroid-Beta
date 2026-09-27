package fb;

import db.u;
public final class e extends u {
    public volatile u f9006a;
    public final boolean f9007b;
    public final boolean f9008c;
    public final db.g d;
    public final kb.a e;
    public final f f9009f;

    public e(f fVar, boolean z10, boolean z11, db.g gVar, kb.a aVar) {
        this.f9009f = fVar;
        this.f9007b = z10;
        this.f9008c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (this.f9007b) {
            aVar.C();
            return null;
        }
        u uVar = this.f9006a;
        if (uVar == null) {
            uVar = this.d.c(this.f9009f, this.e);
            this.f9006a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (this.f9008c) {
            bVar.i();
            return;
        }
        u uVar = this.f9006a;
        if (uVar == null) {
            uVar = this.d.c(this.f9009f, this.e);
            this.f9006a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
