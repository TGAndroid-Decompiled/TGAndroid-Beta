package hb;
public final class a0 extends y {
    public final eb.o f11706a;
    public final eb.g f11707b;
    public final lb.a f11708c;
    public final eb.v d;
    public final ya.d e = new ya.d(this, 22);
    public final boolean f11709f;
    public volatile eb.u f11710g;

    public a0(eb.o oVar, eb.g gVar, lb.a aVar, eb.v vVar, boolean z10) {
        this.f11706a = oVar;
        this.f11707b = gVar;
        this.f11708c = aVar;
        this.d = vVar;
        this.f11709f = z10;
    }

    @Override
    public final eb.u a() {
        if (this.f11706a != null) {
            return this;
        }
        eb.u uVar = this.f11710g;
        if (uVar != null) {
            return uVar;
        }
        eb.u c10 = this.f11707b.c(this.d, this.f11708c);
        this.f11710g = c10;
        return c10;
    }

    @Override
    public final Object read(mb.a aVar) {
        eb.u uVar = this.f11710g;
        if (uVar == null) {
            uVar = this.f11707b.c(this.d, this.f11708c);
            this.f11710g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        eb.o oVar = this.f11706a;
        if (oVar == null) {
            eb.u uVar = this.f11710g;
            if (uVar == null) {
                uVar = this.f11707b.c(this.d, this.f11708c);
                this.f11710g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f11709f && obj == null) {
            bVar.i();
        } else {
            gb.d.l(oVar.serialize(obj, this.f11708c.f15997b, this.e), bVar);
        }
    }
}
