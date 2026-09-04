package gb;
public final class a0 extends y {
    public final db.o f10497a;
    public final db.g f10498b;
    public final kb.a f10499c;
    public final db.v d;
    public final a4.m f10500e = new a4.m(this, 22);
    public final boolean f10501f;
    public volatile db.u f10502g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f10497a = oVar;
        this.f10498b = gVar;
        this.f10499c = aVar;
        this.d = vVar;
        this.f10501f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f10497a != null) {
            return this;
        }
        db.u uVar = this.f10502g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f10498b.c(this.d, this.f10499c);
        this.f10502g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f10502g;
        if (uVar == null) {
            uVar = this.f10498b.c(this.d, this.f10499c);
            this.f10502g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f10497a;
        if (oVar == null) {
            db.u uVar = this.f10502g;
            if (uVar == null) {
                uVar = this.f10498b.c(this.d, this.f10499c);
                this.f10502g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10501f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f10499c.f14889b, this.f10500e), bVar);
        }
    }
}
