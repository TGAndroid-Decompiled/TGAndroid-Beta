package fd;
public enum x0 extends a2 {
    public x0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f9135n;
        char d = aVar.d();
        z0 z0Var = a2.f9092j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f9079a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f9115c.append(d);
                        kVar.f9127c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f9127c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f9127c = vVar;
                return;
            }
            kVar.f9127c = a2.f9091i0;
            return;
        }
        kVar.m(this);
        eVar.f9115c.append((char) 65533);
        kVar.f9127c = z0Var;
    }
}
