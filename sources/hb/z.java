package hb;
public final class z implements eb.v {
    public final lb.a f11779a;
    public final boolean f11780b;
    public final Class f11781c;
    public final eb.o d;

    public z(Object obj, lb.a aVar, boolean z10, Class cls) {
        eb.o oVar;
        boolean z11;
        if (obj instanceof eb.o) {
            oVar = (eb.o) obj;
        } else {
            oVar = null;
        }
        this.d = oVar;
        if (oVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        gb.d.b(z11);
        this.f11779a = aVar;
        this.f11780b = z10;
        this.f11781c = cls;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        boolean isAssignableFrom;
        lb.a aVar2 = this.f11779a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f11780b || aVar2.f15989b != aVar.f15988a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f11781c.isAssignableFrom(aVar.f15988a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
