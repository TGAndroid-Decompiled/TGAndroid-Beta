package fd;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10576n;
        char d = aVar.d();
        z0 z0Var = a2.f10533j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f10520a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f10556c.append(d);
                        kVar.f10568c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f10568c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f10568c = vVar;
                return;
            }
            kVar.f10568c = a2.f10532i0;
            return;
        }
        kVar.m(this);
        eVar.f10556c.append((char) 65533);
        kVar.f10568c = z0Var;
    }
}
