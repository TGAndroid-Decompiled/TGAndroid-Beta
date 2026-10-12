package gb;
public final class a0 extends y {
    public final db.o f10432a;
    public final db.g f10433b;
    public final kb.a f10434c;
    public final db.v d;
    public final a4.l f10435e = new a4.l(this, 18);
    public final boolean f10436f;
    public volatile db.u f10437g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.f10432a = oVar;
        this.f10433b = gVar;
        this.f10434c = aVar;
        this.d = vVar;
        this.f10436f = z10;
    }

    @Override
    public final db.u a() {
        if (this.f10432a != null) {
            return this;
        }
        db.u uVar = this.f10437g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.f10433b.c(this.d, this.f10434c);
        this.f10437g = c10;
        return c10;
    }

    @Override
    public final Object read(lb.a aVar) {
        db.u uVar = this.f10437g;
        if (uVar == null) {
            uVar = this.f10433b.c(this.d, this.f10434c);
            this.f10437g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.f10432a;
        if (oVar == null) {
            db.u uVar = this.f10437g;
            if (uVar == null) {
                uVar = this.f10433b.c(this.d, this.f10434c);
                this.f10437g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f10436f && obj == null) {
            bVar.i();
        } else {
            fb.d.l(oVar.serialize(obj, this.f10434c.f14777b, this.f10435e), bVar);
        }
    }
}
