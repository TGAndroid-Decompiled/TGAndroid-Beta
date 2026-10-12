package hb;
public final class z implements eb.v {
    public final lb.a f10470a;
    public final boolean f10471b;
    public final Class f10472c;
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
        this.f10470a = aVar;
        this.f10471b = z10;
        this.f10472c = cls;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        boolean isAssignableFrom;
        lb.a aVar2 = this.f10470a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f10471b || aVar2.f14654b != aVar.f14653a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f10472c.isAssignableFrom(aVar.f14653a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
