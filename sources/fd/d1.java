package fd;
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
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
                        StringBuilder sb2 = eVar.f10556c;
                        sb2.append("--!");
                        sb2.append(d);
                        kVar.f10568c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f10568c = vVar;
                    return;
                }
                kVar.i();
                kVar.f10568c = vVar;
                return;
            }
            eVar.f10556c.append("--!");
            kVar.f10568c = a2.f10534k0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f10556c;
        sb3.append("--!");
        sb3.append((char) 65533);
        kVar.f10568c = z0Var;
    }
}
