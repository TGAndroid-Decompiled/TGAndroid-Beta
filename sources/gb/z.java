package gb;
public final class z implements db.v {
    public final kb.a f8735a;
    public final boolean f8736b;
    public final Class f8737c;
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
        this.f8735a = aVar;
        this.f8736b = z10;
        this.f8737c = cls;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        boolean isAssignableFrom;
        kb.a aVar2 = this.f8735a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f8736b || aVar2.f12420b != aVar.f12419a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f8737c.isAssignableFrom(aVar.f12419a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
