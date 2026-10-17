package hb;
public final class a0 extends y {
    public final eb.o f11705a;
    public final eb.g f11706b;
    public final lb.a f11707c;
    public final eb.v d;
    public final ya.c e = new ya.c(this, 22);
    public final boolean f11708f;
    public volatile eb.u f11709g;

    public a0(eb.o oVar, eb.g gVar, lb.a aVar, eb.v vVar, boolean z10) {
        this.f11705a = oVar;
        this.f11706b = gVar;
        this.f11707c = aVar;
        this.d = vVar;
        this.f11708f = z10;
    }

    @Override
    public final eb.u a() {
        if (this.f11705a != null) {
            return this;
        }
        eb.u uVar = this.f11709g;
        if (uVar != null) {
            return uVar;
        }
        eb.u c10 = this.f11706b.c(this.d, this.f11707c);
        this.f11709g = c10;
        return c10;
    }

    @Override
    public final Object read(mb.a aVar) {
        eb.u uVar = this.f11709g;
        if (uVar == null) {
            uVar = this.f11706b.c(this.d, this.f11707c);
            this.f11709g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        eb.o oVar = this.f11705a;
        if (oVar == null) {
            eb.u uVar = this.f11709g;
            if (uVar == null) {
                uVar = this.f11706b.c(this.d, this.f11707c);
                this.f11709g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f11708f && obj == null) {
            bVar.i();
        } else {
            gb.d.l(oVar.serialize(obj, this.f11707c.f15989b, this.e), bVar);
        }
    }
}
