package gd;
public enum b1 extends a2 {
    public b1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f12466n;
        char d = aVar.d();
        z0 z0Var = a2.f12423j0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    v vVar = a2.f12410a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            StringBuilder sb2 = eVar.f12446c;
                            sb2.append("--");
                            sb2.append(d);
                            kVar.f12458c = z0Var;
                            return;
                        }
                        kVar.l(this);
                        kVar.i();
                        kVar.f12458c = vVar;
                        return;
                    }
                    kVar.i();
                    kVar.f12458c = vVar;
                    return;
                }
                kVar.m(this);
                eVar.f12446c.append('-');
                return;
            }
            kVar.m(this);
            kVar.f12458c = a2.m0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f12446c;
        sb3.append("--");
        sb3.append((char) 65533);
        kVar.f12458c = z0Var;
    }
}
