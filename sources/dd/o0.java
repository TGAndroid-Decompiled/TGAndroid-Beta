package dd;
public enum o0 extends b2 {
    public o0() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.X;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f6726a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f6778c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f6778c = wVar;
                                        return;
                                    default:
                                        lVar.f6782i.p();
                                        aVar.q();
                                        lVar.f6778c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f6778c = wVar;
                            return;
                        }
                    } else {
                        lVar.f6778c = b2.f6734e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f6782i.p();
                lVar.f6782i.i(d);
                lVar.f6778c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f6782i.i((char) 65533);
        lVar.f6778c = n0Var;
    }
}
