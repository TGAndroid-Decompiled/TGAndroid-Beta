package gb;
public final class z implements db.v {
    public final kb.a f10575a;
    public final boolean f10576b;
    public final Class f10577c;
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
        this.f10575a = aVar;
        this.f10576b = z10;
        this.f10577c = cls;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        boolean isAssignableFrom;
        kb.a aVar2 = this.f10575a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f10576b || aVar2.f14889b != aVar.f14888a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f10577c.isAssignableFrom(aVar.f14888a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
