package oa;
public final class a0 extends y {
    public final la.o f19106a;
    public final la.g f19107b;
    public final sa.a f19108c;
    public final la.v d;
    public final n5.a0 f19109e = new n5.a0(this, 4);
    public final boolean f19110f;
    public volatile la.u f19111g;

    public a0(la.o oVar, la.g gVar, sa.a aVar, la.v vVar, boolean z10) {
        this.f19106a = oVar;
        this.f19107b = gVar;
        this.f19108c = aVar;
        this.d = vVar;
        this.f19110f = z10;
    }

    @Override
    public final la.u a() {
        if (this.f19106a != null) {
            return this;
        }
        la.u uVar = this.f19111g;
        if (uVar != null) {
            return uVar;
        }
        la.u c10 = this.f19107b.c(this.d, this.f19108c);
        this.f19111g = c10;
        return c10;
    }

    @Override
    public final Object read(ta.a aVar) {
        la.u uVar = this.f19111g;
        if (uVar == null) {
            uVar = this.f19107b.c(this.d, this.f19108c);
            this.f19111g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        la.o oVar = this.f19106a;
        if (oVar == null) {
            la.u uVar = this.f19111g;
            if (uVar == null) {
                uVar = this.f19107b.c(this.d, this.f19108c);
                this.f19111g = uVar;
            }
            uVar.write(cVar, obj);
        } else if (this.f19110f && obj == null) {
            cVar.i();
        } else {
            na.d.l(oVar.serialize(obj, this.f19108c.f47503b, this.f19109e), cVar);
        }
    }
}
