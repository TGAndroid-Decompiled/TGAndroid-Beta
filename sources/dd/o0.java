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
                        w wVar = b2.f7632a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f7682c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f7682c = wVar;
                                        return;
                                    default:
                                        lVar.f7685i.j();
                                        aVar.q();
                                        lVar.f7682c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f7682c = wVar;
                            return;
                        }
                    } else {
                        lVar.f7682c = b2.f7639e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f7685i.j();
                lVar.f7685i.d(d);
                lVar.f7682c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f7685i.d((char) 65533);
        lVar.f7682c = n0Var;
    }
}
