package gb;

import eb.u;
public final class e extends u {
    public volatile u f10953a;
    public final boolean f10954b;
    public final boolean f10955c;
    public final eb.g d;
    public final lb.a e;
    public final f f10956f;

    public e(f fVar, boolean z10, boolean z11, eb.g gVar, lb.a aVar) {
        this.f10956f = fVar;
        this.f10954b = z10;
        this.f10955c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        if (this.f10954b) {
            aVar.C();
            return null;
        }
        u uVar = this.f10953a;
        if (uVar == null) {
            uVar = this.d.c(this.f10956f, this.e);
            this.f10953a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        if (this.f10955c) {
            bVar.i();
            return;
        }
        u uVar = this.f10953a;
        if (uVar == null) {
            uVar = this.d.c(this.f10956f, this.e);
            this.f10953a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
