package gb;
public final class a0 extends y {
    public final db.o f8661a;
    public final db.g f8662b;
    public final kb.a f8663c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 20);
    public final boolean f8664f;
    public volatile db.u f8665g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f8661a = oVar;
        this.f8662b = gVar;
        this.f8663c = aVar;
        this.d = vVar;
        this.f8664f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f8661a != null) {
            return this;
        }
        db.u uVar = this.f8665g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f8662b.c(this.d, this.f8663c);
        this.f8665g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f8665g;
        if (uVar == null) {
            uVar = this.f8662b.c(this.d, this.f8663c);
            this.f8665g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f8661a;
        if (oVar == null) {
            db.u uVar = this.f8665g;
            if (uVar == null) {
                uVar = this.f8662b.c(this.d, this.f8663c);
                this.f8665g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f8664f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f8663c.f12420b, this.e), bVar);
        }
    }
}
