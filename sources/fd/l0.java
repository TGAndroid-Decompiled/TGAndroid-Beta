package fd;
public enum l0 extends a2 {
    public l0() {
        super("BeforeAttributeName", 33);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = a2.X;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        v vVar = a2.f9076a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        kVar.k();
                                        kVar.f9124c = vVar;
                                        return;
                                    default:
                                        kVar.f9127i.j();
                                        aVar.q();
                                        kVar.f9124c = m0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.f9124c = vVar;
                            return;
                        }
                    } else {
                        kVar.f9124c = a2.f9083e0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f9127i.j();
                kVar.f9127i.d(d);
                kVar.f9124c = m0Var;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f9127i.j();
        aVar.q();
        kVar.f9124c = m0Var;
    }
}
