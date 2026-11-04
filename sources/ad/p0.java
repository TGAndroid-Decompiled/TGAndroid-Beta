package ad;
public enum p0 extends c2 {
    public p0() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        o0 o0Var = c2.Y;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        x xVar = c2.f317a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        mVar.f370c = c2.f318a0;
                                        return;
                                    case '>':
                                        mVar.k();
                                        mVar.f370c = xVar;
                                        return;
                                    default:
                                        mVar.f374i.j();
                                        aVar.q();
                                        mVar.f370c = o0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            mVar.l(this);
                            mVar.f370c = xVar;
                            return;
                        }
                    } else {
                        mVar.f370c = c2.f327f0;
                        return;
                    }
                }
                mVar.m(this);
                mVar.f374i.j();
                mVar.f374i.d(d);
                mVar.f370c = o0Var;
                return;
            }
            return;
        }
        mVar.m(this);
        mVar.f374i.d((char) 65533);
        mVar.f370c = o0Var;
    }
}
