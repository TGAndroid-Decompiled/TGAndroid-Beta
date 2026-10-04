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
                        w wVar = b2.f8255a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8308c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8308c = wVar;
                                        return;
                                    default:
                                        lVar.f8312i.j();
                                        aVar.q();
                                        lVar.f8308c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8308c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8308c = b2.f8263e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8312i.j();
                lVar.f8312i.d(d);
                lVar.f8308c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8312i.d((char) 65533);
        lVar.f8308c = n0Var;
    }
}
