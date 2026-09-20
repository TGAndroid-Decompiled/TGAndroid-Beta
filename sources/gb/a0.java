package gb;
public final class a0 extends y {
    public final db.o f9534a;
    public final db.g f9535b;
    public final kb.a f9536c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 21);
    public final boolean f9537f;
    public volatile db.u f9538g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f9534a = oVar;
        this.f9535b = gVar;
        this.f9536c = aVar;
        this.d = vVar;
        this.f9537f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f9534a != null) {
            return this;
        }
        db.u uVar = this.f9538g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f9535b.c(this.d, this.f9536c);
        this.f9538g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f9538g;
        if (uVar == null) {
            uVar = this.f9535b.c(this.d, this.f9536c);
            this.f9538g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f9534a;
        if (oVar == null) {
            db.u uVar = this.f9538g;
            if (uVar == null) {
                uVar = this.f9535b.c(this.d, this.f9536c);
                this.f9538g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f9537f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f9536c.f13578b, this.e), bVar);
        }
    }
}
