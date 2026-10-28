package gd;
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
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
                        StringBuilder sb2 = eVar.f12446c;
                        sb2.append("--!");
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
            eVar.f12446c.append("--!");
            kVar.f12458c = a2.f12424k0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f12446c;
        sb3.append("--!");
        sb3.append((char) 65533);
        kVar.f12458c = z0Var;
    }
}
