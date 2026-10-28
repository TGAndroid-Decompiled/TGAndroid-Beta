package gd;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f12466n;
        char d = aVar.d();
        z0 z0Var = a2.f12423j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f12410a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f12446c.append(d);
                        kVar.f12458c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f12458c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f12458c = vVar;
                return;
            }
            kVar.f12458c = a2.f12422i0;
            return;
        }
        kVar.m(this);
        eVar.f12446c.append((char) 65533);
        kVar.f12458c = z0Var;
    }
}
