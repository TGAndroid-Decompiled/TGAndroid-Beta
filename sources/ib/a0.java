package ib;
public final class a0 extends y {
    public final fb.o f13905a;
    public final fb.g f13906b;
    public final mb.a f13907c;
    public final fb.v d;
    public final rb.c e = new rb.c(this, 28);
    public final boolean f13908f;
    public volatile fb.u f13909g;

    public a0(fb.o oVar, fb.g gVar, mb.a aVar, fb.v vVar, boolean z10) {
        this.f13905a = oVar;
        this.f13906b = gVar;
        this.f13907c = aVar;
        this.d = vVar;
        this.f13908f = z10;
    }

    @Override
    public final fb.u a() {
        if (this.f13905a != null) {
            return this;
        }
        fb.u uVar = this.f13909g;
        if (uVar != null) {
            return uVar;
        }
        fb.u c10 = this.f13906b.c(this.d, this.f13907c);
        this.f13909g = c10;
        return c10;
    }

    @Override
    public final Object read(nb.a aVar) {
        fb.u uVar = this.f13909g;
        if (uVar == null) {
            uVar = this.f13906b.c(this.d, this.f13907c);
            this.f13909g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        fb.o oVar = this.f13905a;
        if (oVar == null) {
            fb.u uVar = this.f13909g;
            if (uVar == null) {
                uVar = this.f13906b.c(this.d, this.f13907c);
                this.f13909g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f13908f && obj == null) {
            bVar.i();
        } else {
            hb.d.l(oVar.serialize(obj, this.f13907c.f18408b, this.e), bVar);
        }
    }
}
