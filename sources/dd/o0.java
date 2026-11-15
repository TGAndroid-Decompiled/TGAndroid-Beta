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
                        w wVar = b2.f7992a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8045c = b2.f7993a0;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8045c = wVar;
                                        return;
                                    default:
                                        lVar.f8049i.j();
                                        aVar.q();
                                        lVar.f8045c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8045c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8045c = b2.f8002f0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8049i.j();
                lVar.f8049i.d(d);
                lVar.f8045c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8049i.d((char) 65533);
        lVar.f8045c = n0Var;
    }
}
