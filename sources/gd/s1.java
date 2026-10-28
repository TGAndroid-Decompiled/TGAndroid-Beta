package gd;
public enum s1 extends a2 {
    public s1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12465m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                v vVar = a2.f12410a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.e.append(d);
                        return;
                    }
                    kVar.l(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f12458c = vVar;
                    return;
                }
                kVar.m(this);
                fVar.getClass();
                kVar.j();
                kVar.f12458c = vVar;
                return;
            }
            kVar.f12458c = a2.B0;
            return;
        }
        kVar.m(this);
        fVar.e.append((char) 65533);
    }
}
