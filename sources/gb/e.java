package gb;

import eb.u;
public final class e extends u {
    public volatile u f10955a;
    public final boolean f10956b;
    public final boolean f10957c;
    public final eb.g d;
    public final lb.a e;
    public final f f10958f;

    public e(f fVar, boolean z10, boolean z11, eb.g gVar, lb.a aVar) {
        this.f10958f = fVar;
        this.f10956b = z10;
        this.f10957c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        if (this.f10956b) {
            aVar.C();
            return null;
        }
        u uVar = this.f10955a;
        if (uVar == null) {
            uVar = this.d.c(this.f10958f, this.e);
            this.f10955a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        if (this.f10957c) {
            bVar.i();
            return;
        }
        u uVar = this.f10955a;
        if (uVar == null) {
            uVar = this.d.c(this.f10958f, this.e);
            this.f10955a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
