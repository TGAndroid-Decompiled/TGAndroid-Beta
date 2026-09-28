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
                        w wVar = b2.f7631a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f7681c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f7681c = wVar;
                                        return;
                                    default:
                                        lVar.f7684i.j();
                                        aVar.q();
                                        lVar.f7681c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f7681c = wVar;
                            return;
                        }
                    } else {
                        lVar.f7681c = b2.f7638e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f7684i.j();
                lVar.f7684i.d(d);
                lVar.f7681c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f7684i.d((char) 65533);
        lVar.f7681c = n0Var;
    }
}
