package gb;
public final class a0 extends y {
    public final db.o f10362a;
    public final db.g f10363b;
    public final kb.a f10364c;
    public final db.v d;
    public final a4.m f10365e = new a4.m(this, 17);
    public final boolean f10366f;
    public volatile db.u f10367g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f10362a = oVar;
        this.f10363b = gVar;
        this.f10364c = aVar;
        this.d = vVar;
        this.f10366f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f10362a != null) {
            return this;
        }
        db.u uVar = this.f10367g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f10363b.c(this.d, this.f10364c);
        this.f10367g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f10367g;
        if (uVar == null) {
            uVar = this.f10363b.c(this.d, this.f10364c);
            this.f10367g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f10362a;
        if (oVar == null) {
            db.u uVar = this.f10367g;
            if (uVar == null) {
                uVar = this.f10363b.c(this.d, this.f10364c);
                this.f10367g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10366f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f10364c.f14748b, this.f10365e), bVar);
        }
    }
}
