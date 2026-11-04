package ad;
public enum q0 extends c2 {
    public q0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        u0 u0Var = c2.f323d0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        x xVar = c2.f317a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                if (d != '&') {
                                    if (d != '\'') {
                                        switch (d) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                mVar.m(this);
                                                mVar.k();
                                                mVar.f370c = xVar;
                                                return;
                                            default:
                                                aVar.q();
                                                mVar.f370c = u0Var;
                                                return;
                                        }
                                    } else {
                                        mVar.f370c = c2.f322c0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    mVar.f370c = u0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            mVar.l(this);
                            mVar.k();
                            mVar.f370c = xVar;
                            return;
                        }
                    }
                    mVar.m(this);
                    mVar.f374i.e(d);
                    mVar.f370c = u0Var;
                    return;
                }
                mVar.f370c = c2.f320b0;
                return;
            }
            return;
        }
        mVar.m(this);
        mVar.f374i.e((char) 65533);
        mVar.f370c = u0Var;
    }
}
