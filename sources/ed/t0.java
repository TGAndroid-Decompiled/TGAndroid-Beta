package ed;
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        if (h.length() > 0) {
            lVar.f8890i.f(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    w wVar = b2.f8833a;
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            if (d != '&') {
                                if (d != '\'') {
                                    switch (d) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            lVar.k();
                                            lVar.f8886c = wVar;
                                            return;
                                        default:
                                            lVar.f8890i.e(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c10 = lVar.c('>', true);
                                if (c10 != null) {
                                    lVar.f8890i.g(c10);
                                    return;
                                } else {
                                    lVar.f8890i.e('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        lVar.l(this);
                        lVar.f8886c = wVar;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8890i.e(d);
                return;
            }
            lVar.f8886c = b2.W;
            return;
        }
        lVar.m(this);
        lVar.f8890i.e((char) 65533);
    }
}
