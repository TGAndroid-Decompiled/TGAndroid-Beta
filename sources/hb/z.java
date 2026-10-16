package hb;
public final class z implements eb.v {
    public final lb.a f10474a;
    public final boolean f10475b;
    public final Class f10476c;
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
        this.f10474a = aVar;
        this.f10475b = z10;
        this.f10476c = cls;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        boolean isAssignableFrom;
        lb.a aVar2 = this.f10474a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f10475b || aVar2.f14654b != aVar.f14653a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f10476c.isAssignableFrom(aVar.f14653a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
