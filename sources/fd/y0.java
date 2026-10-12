package fd;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f9132n;
        char d = aVar.d();
        z0 z0Var = a2.f9089j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f9076a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f9112c.append(d);
                        kVar.f9124c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f9124c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f9124c = vVar;
                return;
            }
            kVar.f9124c = a2.f9088i0;
            return;
        }
        kVar.m(this);
        eVar.f9112c.append((char) 65533);
        kVar.f9124c = z0Var;
    }
}
