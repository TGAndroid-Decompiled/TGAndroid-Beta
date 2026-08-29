package nc;
public enum o0 extends b2 {
    public o0() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.T;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f17237a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f17290c = b2.V;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f17290c = wVar;
                                        return;
                                    default:
                                        lVar.f17294i.k();
                                        aVar.q();
                                        lVar.f17290c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f17290c = wVar;
                            return;
                        }
                    } else {
                        lVar.f17290c = b2.f17238a0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f17294i.k();
                lVar.f17294i.e(d);
                lVar.f17290c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f17294i.e((char) 65533);
        lVar.f17290c = n0Var;
    }
}
