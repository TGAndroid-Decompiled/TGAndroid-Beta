package fd;
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
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
                        StringBuilder sb2 = eVar.f9112c;
                        sb2.append("--!");
                        sb2.append(d);
                        kVar.f9124c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f9124c = vVar;
                    return;
                }
                kVar.i();
                kVar.f9124c = vVar;
                return;
            }
            eVar.f9112c.append("--!");
            kVar.f9124c = a2.f9090k0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f9112c;
        sb3.append("--!");
        sb3.append((char) 65533);
        kVar.f9124c = z0Var;
    }
}
