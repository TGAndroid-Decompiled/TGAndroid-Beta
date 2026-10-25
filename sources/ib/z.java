package ib;
public final class z implements fb.v {
    public final mb.a f13979a;
    public final boolean f13980b;
    public final Class f13981c;
    public final fb.o d;

    public z(Object obj, mb.a aVar, boolean z10, Class cls) {
        fb.o oVar;
        boolean z11;
        if (obj instanceof fb.o) {
            oVar = (fb.o) obj;
        } else {
            oVar = null;
        }
        this.d = oVar;
        if (oVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        hb.d.b(z11);
        this.f13979a = aVar;
        this.f13980b = z10;
        this.f13981c = cls;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        boolean isAssignableFrom;
        mb.a aVar2 = this.f13979a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f13980b || aVar2.f18408b != aVar.f18407a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f13981c.isAssignableFrom(aVar.f18407a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
