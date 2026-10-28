package ib;
public final class a0 extends y {
    public final fb.o f13904a;
    public final fb.g f13905b;
    public final mb.a f13906c;
    public final fb.v d;
    public final rb.c e = new rb.c(this, 28);
    public final boolean f13907f;
    public volatile fb.u f13908g;

    public a0(fb.o oVar, fb.g gVar, mb.a aVar, fb.v vVar, boolean z10) {
        this.f13904a = oVar;
        this.f13905b = gVar;
        this.f13906c = aVar;
        this.d = vVar;
        this.f13907f = z10;
    }

    @Override
    public final fb.u a() {
        if (this.f13904a != null) {
            return this;
        }
        fb.u uVar = this.f13908g;
        if (uVar != null) {
            return uVar;
        }
        fb.u c10 = this.f13905b.c(this.d, this.f13906c);
        this.f13908g = c10;
        return c10;
    }

    @Override
    public final Object read(nb.a aVar) {
        fb.u uVar = this.f13908g;
        if (uVar == null) {
            uVar = this.f13905b.c(this.d, this.f13906c);
            this.f13908g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        fb.o oVar = this.f13904a;
        if (oVar == null) {
            fb.u uVar = this.f13908g;
            if (uVar == null) {
                uVar = this.f13905b.c(this.d, this.f13906c);
                this.f13908g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f13907f && obj == null) {
            bVar.i();
        } else {
            hb.d.l(oVar.serialize(obj, this.f13906c.f18407b, this.e), bVar);
        }
    }
}
