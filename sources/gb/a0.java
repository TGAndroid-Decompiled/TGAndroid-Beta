package gb;
public final class a0 extends y {
    public final db.o f9521a;
    public final db.g f9522b;
    public final kb.a f9523c;
    public final db.v d;
    public final a6.i e = new a6.i(this, 21);
    public final boolean f9524f;
    public volatile db.u f9525g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f9521a = oVar;
        this.f9522b = gVar;
        this.f9523c = aVar;
        this.d = vVar;
        this.f9524f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f9521a != null) {
            return this;
        }
        db.u uVar = this.f9525g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f9522b.c(this.d, this.f9523c);
        this.f9525g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f9525g;
        if (uVar == null) {
            uVar = this.f9522b.c(this.d, this.f9523c);
            this.f9525g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f9521a;
        if (oVar == null) {
            db.u uVar = this.f9525g;
            if (uVar == null) {
                uVar = this.f9522b.c(this.d, this.f9523c);
                this.f9525g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f9524f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f9523c.f13566b, this.e), bVar);
        }
    }
}
