package fd;
public enum b1 extends a2 {
    public b1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f9135n;
        char d = aVar.d();
        z0 z0Var = a2.f9092j0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    v vVar = a2.f9079a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            StringBuilder sb2 = eVar.f9115c;
                            sb2.append("--");
                            sb2.append(d);
                            kVar.f9127c = z0Var;
                            return;
                        }
                        kVar.l(this);
                        kVar.i();
                        kVar.f9127c = vVar;
                        return;
                    }
                    kVar.i();
                    kVar.f9127c = vVar;
                    return;
                }
                kVar.m(this);
                eVar.f9115c.append('-');
                return;
            }
            kVar.m(this);
            kVar.f9127c = a2.m0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f9115c;
        sb3.append("--");
        sb3.append((char) 65533);
        kVar.f9127c = z0Var;
    }
}
