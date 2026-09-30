package gb;
public final class a0 extends y {
    public final db.o f9527a;
    public final db.g f9528b;
    public final kb.a f9529c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 21);
    public final boolean f9530f;
    public volatile db.u f9531g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f9527a = oVar;
        this.f9528b = gVar;
        this.f9529c = aVar;
        this.d = vVar;
        this.f9530f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f9527a != null) {
            return this;
        }
        db.u uVar = this.f9531g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f9528b.c(this.d, this.f9529c);
        this.f9531g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f9531g;
        if (uVar == null) {
            uVar = this.f9528b.c(this.d, this.f9529c);
            this.f9531g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f9527a;
        if (oVar == null) {
            db.u uVar = this.f9531g;
            if (uVar == null) {
                uVar = this.f9528b.c(this.d, this.f9529c);
                this.f9531g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f9530f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f9529c.f13579b, this.e), bVar);
        }
    }
}
