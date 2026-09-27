package gb;
public final class z implements db.v {
    public final kb.a f9595a;
    public final boolean f9596b;
    public final Class f9597c;
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
        this.f9595a = aVar;
        this.f9596b = z10;
        this.f9597c = cls;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        boolean isAssignableFrom;
        kb.a aVar2 = this.f9595a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f9596b || aVar2.f13566b != aVar.f13565a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f9597c.isAssignableFrom(aVar.f13565a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
