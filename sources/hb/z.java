package hb;
public final class z implements eb.v {
    public final lb.a f11805a;
    public final boolean f11806b;
    public final Class f11807c;
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
        this.f11805a = aVar;
        this.f11806b = z10;
        this.f11807c = cls;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        boolean isAssignableFrom;
        lb.a aVar2 = this.f11805a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f11806b || aVar2.f16058b != aVar.f16057a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f11807c.isAssignableFrom(aVar.f16057a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
