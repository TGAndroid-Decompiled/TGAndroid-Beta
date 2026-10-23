package hb;
public final class a0 extends y {
    public final eb.o f11731a;
    public final eb.g f11732b;
    public final lb.a f11733c;
    public final eb.v d;
    public final ya.c e = new ya.c(this, 22);
    public final boolean f11734f;
    public volatile eb.u f11735g;

    public a0(eb.o oVar, eb.g gVar, lb.a aVar, eb.v vVar, boolean z10) {
        this.f11731a = oVar;
        this.f11732b = gVar;
        this.f11733c = aVar;
        this.d = vVar;
        this.f11734f = z10;
    }

    @Override
    public final eb.u a() {
        if (this.f11731a != null) {
            return this;
        }
        eb.u uVar = this.f11735g;
        if (uVar != null) {
            return uVar;
        }
        eb.u c10 = this.f11732b.c(this.d, this.f11733c);
        this.f11735g = c10;
        return c10;
    }

    @Override
    public final Object read(mb.a aVar) {
        eb.u uVar = this.f11735g;
        if (uVar == null) {
            uVar = this.f11732b.c(this.d, this.f11733c);
            this.f11735g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        eb.o oVar = this.f11731a;
        if (oVar == null) {
            eb.u uVar = this.f11735g;
            if (uVar == null) {
                uVar = this.f11732b.c(this.d, this.f11733c);
                this.f11735g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f11734f && obj == null) {
            bVar.i();
        } else {
            gb.d.l(oVar.serialize(obj, this.f11733c.f16058b, this.e), bVar);
        }
    }
}
