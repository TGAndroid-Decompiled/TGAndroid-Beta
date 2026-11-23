package dd;
public enum o0 extends b2 {
    public o0() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.Y;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f8265a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8318c = b2.f8266a0;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8318c = wVar;
                                        return;
                                    default:
                                        lVar.f8322i.j();
                                        aVar.q();
                                        lVar.f8318c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8318c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8318c = b2.f8275f0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8322i.j();
                lVar.f8322i.d(d);
                lVar.f8318c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8322i.d((char) 65533);
        lVar.f8318c = n0Var;
    }
}
