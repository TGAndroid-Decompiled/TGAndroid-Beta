package gb;
public final class a0 extends y {
    public final db.o f9533a;
    public final db.g f9534b;
    public final kb.a f9535c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 21);
    public final boolean f9536f;
    public volatile db.u f9537g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f9533a = oVar;
        this.f9534b = gVar;
        this.f9535c = aVar;
        this.d = vVar;
        this.f9536f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f9533a != null) {
            return this;
        }
        db.u uVar = this.f9537g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f9534b.c(this.d, this.f9535c);
        this.f9537g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f9537g;
        if (uVar == null) {
            uVar = this.f9534b.c(this.d, this.f9535c);
            this.f9537g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f9533a;
        if (oVar == null) {
            db.u uVar = this.f9537g;
            if (uVar == null) {
                uVar = this.f9534b.c(this.d, this.f9535c);
                this.f9537g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f9536f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f9535c.f13577b, this.e), bVar);
        }
    }
}
