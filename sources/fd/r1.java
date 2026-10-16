package fd;
public enum r1 extends a2 {
    public r1() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f9134m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                v vVar = a2.f9079a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.e.append(d);
                        return;
                    }
                    kVar.l(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f9127c = vVar;
                    return;
                }
                kVar.m(this);
                fVar.getClass();
                kVar.j();
                kVar.f9127c = vVar;
                return;
            }
            kVar.f9127c = a2.B0;
            return;
        }
        kVar.m(this);
        fVar.e.append((char) 65533);
    }
}
