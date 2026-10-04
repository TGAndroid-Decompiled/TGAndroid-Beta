package gb;
public final class a0 extends y {
    public final db.o f10361a;
    public final db.g f10362b;
    public final kb.a f10363c;
    public final db.v d;
    public final a4.m f10364e = new a4.m(this, 17);
    public final boolean f10365f;
    public volatile db.u f10366g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f10361a = oVar;
        this.f10362b = gVar;
        this.f10363c = aVar;
        this.d = vVar;
        this.f10365f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f10361a != null) {
            return this;
        }
        db.u uVar = this.f10366g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f10362b.c(this.d, this.f10363c);
        this.f10366g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f10366g;
        if (uVar == null) {
            uVar = this.f10362b.c(this.d, this.f10363c);
            this.f10366g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f10361a;
        if (oVar == null) {
            db.u uVar = this.f10366g;
            if (uVar == null) {
                uVar = this.f10362b.c(this.d, this.f10363c);
                this.f10366g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10365f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f10363c.f14747b, this.f10364e), bVar);
        }
    }
}
