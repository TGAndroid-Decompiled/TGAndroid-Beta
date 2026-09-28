package dd;
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        if (h.length() > 0) {
            lVar.f7684i.f(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    w wVar = b2.f7631a;
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
                                            lVar.f7681c = wVar;
                                            return;
                                        default:
                                            lVar.f7684i.e(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c10 = lVar.c('>', true);
                                if (c10 != null) {
                                    lVar.f7684i.g(c10);
                                    return;
                                } else {
                                    lVar.f7684i.e('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        lVar.l(this);
                        lVar.f7681c = wVar;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f7684i.e(d);
                return;
            }
            lVar.f7681c = b2.W;
            return;
        }
        lVar.m(this);
        lVar.f7684i.e((char) 65533);
    }
}
