package oa;
public final class z implements la.v {
    public final sa.a f19184a;
    public final boolean f19185b;
    public final Class f19186c;
    public final la.o d;

    public z(Object obj, sa.a aVar, boolean z10, Class cls) {
        la.o oVar;
        boolean z11;
        if (obj instanceof la.o) {
            oVar = (la.o) obj;
        } else {
            oVar = null;
        }
        this.d = oVar;
        if (oVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        na.d.b(z11);
        this.f19184a = aVar;
        this.f19185b = z10;
        this.f19186c = cls;
    }

    @Override
    public final la.u create(la.g gVar, sa.a aVar) {
        boolean isAssignableFrom;
        sa.a aVar2 = this.f19184a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f19185b || aVar2.f47503b != aVar.f47502a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f19186c.isAssignableFrom(aVar.f47502a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
