package gb;
public final class a0 extends y {
    public final db.o f10525a;
    public final db.g f10526b;
    public final kb.a f10527c;
    public final db.v d;
    public final a4.m f10528e = new a4.m(this, 22);
    public final boolean f10529f;
    public volatile db.u f10530g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f10525a = oVar;
        this.f10526b = gVar;
        this.f10527c = aVar;
        this.d = vVar;
        this.f10529f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f10525a != null) {
            return this;
        }
        db.u uVar = this.f10530g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f10526b.c(this.d, this.f10527c);
        this.f10530g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f10530g;
        if (uVar == null) {
            uVar = this.f10526b.c(this.d, this.f10527c);
            this.f10530g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f10525a;
        if (oVar == null) {
            db.u uVar = this.f10530g;
            if (uVar == null) {
                uVar = this.f10526b.c(this.d, this.f10527c);
                this.f10530g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10529f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f10527c.f14915b, this.f10528e), bVar);
        }
    }
}
