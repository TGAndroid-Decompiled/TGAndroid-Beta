package gb;
public final class a0 extends y {
    public final db.o f9529a;
    public final db.g f9530b;
    public final kb.a f9531c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 21);
    public final boolean f9532f;
    public volatile db.u f9533g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f9529a = oVar;
        this.f9530b = gVar;
        this.f9531c = aVar;
        this.d = vVar;
        this.f9532f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f9529a != null) {
            return this;
        }
        db.u uVar = this.f9533g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f9530b.c(this.d, this.f9531c);
        this.f9533g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f9533g;
        if (uVar == null) {
            uVar = this.f9530b.c(this.d, this.f9531c);
            this.f9533g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f9529a;
        if (oVar == null) {
            db.u uVar = this.f9533g;
            if (uVar == null) {
                uVar = this.f9530b.c(this.d, this.f9531c);
                this.f9533g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f9532f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f9531c.f13576b, this.e), bVar);
        }
    }
}
