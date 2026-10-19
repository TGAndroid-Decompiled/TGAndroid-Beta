package gb;

import eb.u;
public final class e extends u {
    public volatile u f10952a;
    public final boolean f10953b;
    public final boolean f10954c;
    public final eb.g d;
    public final lb.a e;
    public final f f10955f;

    public e(f fVar, boolean z10, boolean z11, eb.g gVar, lb.a aVar) {
        this.f10955f = fVar;
        this.f10953b = z10;
        this.f10954c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        if (this.f10953b) {
            aVar.C();
            return null;
        }
        u uVar = this.f10952a;
        if (uVar == null) {
            uVar = this.d.c(this.f10955f, this.e);
            this.f10952a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        if (this.f10954c) {
            bVar.i();
            return;
        }
        u uVar = this.f10952a;
        if (uVar == null) {
            uVar = this.d.c(this.f10955f, this.e);
            this.f10952a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
