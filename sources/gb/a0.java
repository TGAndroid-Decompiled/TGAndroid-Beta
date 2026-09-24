package gb;
public final class a0 extends y {
    public final db.o f9515a;
    public final db.g f9516b;
    public final kb.a f9517c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 21);
    public final boolean f9518f;
    public volatile db.u f9519g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f9515a = oVar;
        this.f9516b = gVar;
        this.f9517c = aVar;
        this.d = vVar;
        this.f9518f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f9515a != null) {
            return this;
        }
        db.u uVar = this.f9519g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f9516b.c(this.d, this.f9517c);
        this.f9519g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f9519g;
        if (uVar == null) {
            uVar = this.f9516b.c(this.d, this.f9517c);
            this.f9519g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f9515a;
        if (oVar == null) {
            db.u uVar = this.f9519g;
            if (uVar == null) {
                uVar = this.f9516b.c(this.d, this.f9517c);
                this.f9519g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f9518f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f9517c.f13564b, this.e), bVar);
        }
    }
}
