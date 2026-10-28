package gd;
public enum n0 extends a2 {
    public n0() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = a2.X;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        v vVar = a2.f12410a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        kVar.f12458c = a2.Z;
                                        return;
                                    case '>':
                                        kVar.k();
                                        kVar.f12458c = vVar;
                                        return;
                                    default:
                                        kVar.f12461i.j();
                                        aVar.q();
                                        kVar.f12458c = m0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.f12458c = vVar;
                            return;
                        }
                    } else {
                        kVar.f12458c = a2.f12417e0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f12461i.j();
                kVar.f12461i.d(d);
                kVar.f12458c = m0Var;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f12461i.d((char) 65533);
        kVar.f12458c = m0Var;
    }
}
