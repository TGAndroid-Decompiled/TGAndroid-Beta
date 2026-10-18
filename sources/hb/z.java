package hb;
public final class z implements eb.v {
    public final lb.a f11781a;
    public final boolean f11782b;
    public final Class f11783c;
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
        this.f11781a = aVar;
        this.f11782b = z10;
        this.f11783c = cls;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        boolean isAssignableFrom;
        lb.a aVar2 = this.f11781a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f11782b || aVar2.f15996b != aVar.f15995a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f11783c.isAssignableFrom(aVar.f15995a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
