package ib;
public final class z implements fb.v {
    public final mb.a f13978a;
    public final boolean f13979b;
    public final Class f13980c;
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
        this.f13978a = aVar;
        this.f13979b = z10;
        this.f13980c = cls;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        boolean isAssignableFrom;
        mb.a aVar2 = this.f13978a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f13979b || aVar2.f18407b != aVar.f18406a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f13980c.isAssignableFrom(aVar.f18406a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
