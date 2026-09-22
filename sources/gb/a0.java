package gb;
public final class a0 extends y {
    public final db.o f9530a;
    public final db.g f9531b;
    public final kb.a f9532c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 21);
    public final boolean f9533f;
    public volatile db.u f9534g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f9530a = oVar;
        this.f9531b = gVar;
        this.f9532c = aVar;
        this.d = vVar;
        this.f9533f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f9530a != null) {
            return this;
        }
        db.u uVar = this.f9534g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f9531b.c(this.d, this.f9532c);
        this.f9534g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f9534g;
        if (uVar == null) {
            uVar = this.f9531b.c(this.d, this.f9532c);
            this.f9534g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f9530a;
        if (oVar == null) {
            db.u uVar = this.f9534g;
            if (uVar == null) {
                uVar = this.f9531b.c(this.d, this.f9532c);
                this.f9534g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f9533f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f9532c.f13578b, this.e), bVar);
        }
    }
}
