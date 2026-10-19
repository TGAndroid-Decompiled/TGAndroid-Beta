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
                        v vVar = a2.f10521a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        kVar.k();
                                        kVar.f10569c = vVar;
                                        return;
                                    default:
                                        kVar.f10572i.j();
                                        aVar.q();
                                        kVar.f10569c = m0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.f10569c = vVar;
                            return;
                        }
                    } else {
                        kVar.f10569c = a2.f10528e0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f10572i.j();
                kVar.f10572i.d(d);
                kVar.f10569c = m0Var;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f10572i.j();
        aVar.q();
        kVar.f10569c = m0Var;
    }
}
