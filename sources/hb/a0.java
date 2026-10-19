package hb;
public final class a0 extends y {
    public final eb.o f11704a;
    public final eb.g f11705b;
    public final lb.a f11706c;
    public final eb.v d;
    public final ya.d e = new ya.d(this, 22);
    public final boolean f11707f;
    public volatile eb.u f11708g;

    public a0(eb.o oVar, eb.g gVar, lb.a aVar, eb.v vVar, boolean z10) {
        this.f11704a = oVar;
        this.f11705b = gVar;
        this.f11706c = aVar;
        this.d = vVar;
        this.f11707f = z10;
    }

    @Override
    public final eb.u a() {
        if (this.f11704a != null) {
            return this;
        }
        eb.u uVar = this.f11708g;
        if (uVar != null) {
            return uVar;
        }
        eb.u c10 = this.f11705b.c(this.d, this.f11706c);
        this.f11708g = c10;
        return c10;
    }

    @Override
    public final Object read(mb.a aVar) {
        eb.u uVar = this.f11708g;
        if (uVar == null) {
            uVar = this.f11705b.c(this.d, this.f11706c);
            this.f11708g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        eb.o oVar = this.f11704a;
        if (oVar == null) {
            eb.u uVar = this.f11708g;
            if (uVar == null) {
                uVar = this.f11705b.c(this.d, this.f11706c);
                this.f11708g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f11707f && obj == null) {
            bVar.i();
        } else {
            gb.d.l(oVar.serialize(obj, this.f11706c.f15995b, this.e), bVar);
        }
    }
}
