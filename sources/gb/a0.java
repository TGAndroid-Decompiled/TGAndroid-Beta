package gb;
public final class a0 extends y {
    public final db.o f10433a;
    public final db.g f10434b;
    public final kb.a f10435c;
    public final db.v d;
    public final a4.l f10436e = new a4.l(this, 18);
    public final boolean f10437f;
    public volatile db.u f10438g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f10433a = oVar;
        this.f10434b = gVar;
        this.f10435c = aVar;
        this.d = vVar;
        this.f10437f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f10433a != null) {
            return this;
        }
        db.u uVar = this.f10438g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f10434b.c(this.d, this.f10435c);
        this.f10438g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f10438g;
        if (uVar == null) {
            uVar = this.f10434b.c(this.d, this.f10435c);
            this.f10438g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f10433a;
        if (oVar == null) {
            db.u uVar = this.f10438g;
            if (uVar == null) {
                uVar = this.f10434b.c(this.d, this.f10435c);
                this.f10438g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10437f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f10435c.f14779b, this.f10436e), bVar);
        }
    }
}
