package fd;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10578n;
        char d = aVar.d();
        z0 z0Var = a2.f10535j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f10522a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f10558c.append(d);
                        kVar.f10570c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f10570c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f10570c = vVar;
                return;
            }
            kVar.f10570c = a2.f10534i0;
            return;
        }
        kVar.m(this);
        eVar.f10558c.append((char) 65533);
        kVar.f10570c = z0Var;
    }
}
