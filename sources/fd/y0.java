package fd;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10577n;
        char d = aVar.d();
        z0 z0Var = a2.f10534j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f10521a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f10557c.append(d);
                        kVar.f10569c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f10569c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f10569c = vVar;
                return;
            }
            kVar.f10569c = a2.f10533i0;
            return;
        }
        kVar.m(this);
        eVar.f10557c.append((char) 65533);
        kVar.f10569c = z0Var;
    }
}
