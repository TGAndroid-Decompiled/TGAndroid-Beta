package fd;
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
                        v vVar = a2.f10536a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        kVar.f10584c = a2.Z;
                                        return;
                                    case '>':
                                        kVar.k();
                                        kVar.f10584c = vVar;
                                        return;
                                    default:
                                        kVar.f10587i.j();
                                        aVar.q();
                                        kVar.f10584c = m0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.f10584c = vVar;
                            return;
                        }
                    } else {
                        kVar.f10584c = a2.f10543e0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f10587i.j();
                kVar.f10587i.d(d);
                kVar.f10584c = m0Var;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f10587i.d((char) 65533);
        kVar.f10584c = m0Var;
    }
}
