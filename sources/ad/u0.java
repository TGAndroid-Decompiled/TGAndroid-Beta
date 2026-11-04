package ad;
public enum u0 extends c2 {
    public u0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(m mVar, a aVar) {
        String h = aVar.h(c2.I0);
        if (h.length() > 0) {
            mVar.f374i.f(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
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
                                            mVar.k();
                                            mVar.f370c = xVar;
                                            return;
                                        default:
                                            mVar.f374i.e(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c2 = mVar.c('>', true);
                                if (c2 != null) {
                                    mVar.f374i.g(c2);
                                    return;
                                } else {
                                    mVar.f374i.e('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        mVar.l(this);
                        mVar.f370c = xVar;
                        return;
                    }
                }
                mVar.m(this);
                mVar.f374i.e(d);
                return;
            }
            mVar.f370c = c2.X;
            return;
        }
        mVar.m(this);
        mVar.f374i.e((char) 65533);
    }
}
