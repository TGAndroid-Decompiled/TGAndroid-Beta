package gb;
public final class a0 extends y {
    public final db.o f10434a;
    public final db.g f10435b;
    public final kb.a f10436c;
    public final db.v d;
    public final a4.l f10437e = new a4.l(this, 18);
    public final boolean f10438f;
    public volatile db.u f10439g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f10434a = oVar;
        this.f10435b = gVar;
        this.f10436c = aVar;
        this.d = vVar;
        this.f10438f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f10434a != null) {
            return this;
        }
        db.u uVar = this.f10439g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f10435b.c(this.d, this.f10436c);
        this.f10439g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f10439g;
        if (uVar == null) {
            uVar = this.f10435b.c(this.d, this.f10436c);
            this.f10439g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f10434a;
        if (oVar == null) {
            db.u uVar = this.f10439g;
            if (uVar == null) {
                uVar = this.f10435b.c(this.d, this.f10436c);
                this.f10439g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10438f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f10436c.f14780b, this.f10437e), bVar);
        }
    }
}
