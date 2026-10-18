package hb;
public final class a0 extends y {
    public final eb.o f11707a;
    public final eb.g f11708b;
    public final lb.a f11709c;
    public final eb.v d;
    public final ya.c e = new ya.c(this, 22);
    public final boolean f11710f;
    public volatile eb.u f11711g;

    public a0(eb.o oVar, eb.g gVar, lb.a aVar, eb.v vVar, boolean z10) {
        this.f11707a = oVar;
        this.f11708b = gVar;
        this.f11709c = aVar;
        this.d = vVar;
        this.f11710f = z10;
    }

    @Override
    public final eb.u a() {
        if (this.f11707a != null) {
            return this;
        }
        eb.u uVar = this.f11711g;
        if (uVar != null) {
            return uVar;
        }
        eb.u c10 = this.f11708b.c(this.d, this.f11709c);
        this.f11711g = c10;
        return c10;
    }

    @Override
    public final Object read(mb.a aVar) {
        eb.u uVar = this.f11711g;
        if (uVar == null) {
            uVar = this.f11708b.c(this.d, this.f11709c);
            this.f11711g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        eb.o oVar = this.f11707a;
        if (oVar == null) {
            eb.u uVar = this.f11711g;
            if (uVar == null) {
                uVar = this.f11708b.c(this.d, this.f11709c);
                this.f11711g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f11710f && obj == null) {
            bVar.i();
        } else {
            gb.d.l(oVar.serialize(obj, this.f11709c.f15996b, this.e), bVar);
        }
    }
}
