package gb;

import eb.u;
public final class e extends u {
    public volatile u f10971a;
    public final boolean f10972b;
    public final boolean f10973c;
    public final eb.g d;
    public final lb.a e;
    public final f f10974f;

    public e(f fVar, boolean z10, boolean z11, eb.g gVar, lb.a aVar) {
        this.f10974f = fVar;
        this.f10972b = z10;
        this.f10973c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        if (this.f10972b) {
            aVar.C();
            return null;
        }
        u uVar = this.f10971a;
        if (uVar == null) {
            uVar = this.d.c(this.f10974f, this.e);
            this.f10971a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        if (this.f10973c) {
            bVar.i();
            return;
        }
        u uVar = this.f10971a;
        if (uVar == null) {
            uVar = this.d.c(this.f10974f, this.e);
            this.f10971a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
