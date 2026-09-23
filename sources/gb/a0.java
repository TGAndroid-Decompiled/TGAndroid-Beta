package gb;
public final class a0 extends y {
    public final db.o f9516a;
    public final db.g f9517b;
    public final kb.a f9518c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 21);
    public final boolean f9519f;
    public volatile db.u f9520g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f9516a = oVar;
        this.f9517b = gVar;
        this.f9518c = aVar;
        this.d = vVar;
        this.f9519f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f9516a != null) {
            return this;
        }
        db.u uVar = this.f9520g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f9517b.c(this.d, this.f9518c);
        this.f9520g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f9520g;
        if (uVar == null) {
            uVar = this.f9517b.c(this.d, this.f9518c);
            this.f9520g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f9516a;
        if (oVar == null) {
            db.u uVar = this.f9520g;
            if (uVar == null) {
                uVar = this.f9517b.c(this.d, this.f9518c);
                this.f9520g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f9519f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f9518c.f13566b, this.e), bVar);
        }
    }
}
