package nc;
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.Y;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        w wVar = b2.f17237a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                if (d != '&') {
                                    if (d != '\'') {
                                        switch (d) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                lVar.m(this);
                                                lVar.k();
                                                lVar.f17290c = wVar;
                                                return;
                                            default:
                                                aVar.q();
                                                lVar.f17290c = t0Var;
                                                return;
                                        }
                                    } else {
                                        lVar.f17290c = b2.X;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    lVar.f17290c = t0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.k();
                            lVar.f17290c = wVar;
                            return;
                        }
                    }
                    lVar.m(this);
                    lVar.f17294i.f(d);
                    lVar.f17290c = t0Var;
                    return;
                }
                lVar.f17290c = b2.W;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f17294i.f((char) 65533);
        lVar.f17290c = t0Var;
    }
}
