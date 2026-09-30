package gb;
public final class z implements db.v {
    public final kb.a f9589a;
    public final boolean f9590b;
    public final Class f9591c;
    public final db.o d;

    public z(Object obj, kb.a aVar, boolean z10, Class cls) {
        db.o oVar;
        boolean z11;
        if (obj instanceof db.o) {
            oVar = (db.o) obj;
        } else {
            oVar = null;
        }
        this.d = oVar;
        if (oVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        fb.d.b(z11);
        this.f9589a = aVar;
        this.f9590b = z10;
        this.f9591c = cls;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        boolean isAssignableFrom;
        kb.a aVar2 = this.f9589a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f9590b || aVar2.f13564b != aVar.f13563a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f9591c.isAssignableFrom(aVar.f13563a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
