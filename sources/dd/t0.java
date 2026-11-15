package dd;
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.I0);
        if (h.length() > 0) {
            lVar.f8046i.f(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    w wVar = b2.f7989a;
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
                                            lVar.f8042c = wVar;
                                            return;
                                        default:
                                            lVar.f8046i.e(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c10 = lVar.c('>', true);
                                if (c10 != null) {
                                    lVar.f8046i.g(c10);
                                    return;
                                } else {
                                    lVar.f8046i.e('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        lVar.l(this);
                        lVar.f8042c = wVar;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8046i.e(d);
                return;
            }
            lVar.f8042c = b2.X;
            return;
        }
        lVar.m(this);
        lVar.f8046i.e((char) 65533);
    }
}
