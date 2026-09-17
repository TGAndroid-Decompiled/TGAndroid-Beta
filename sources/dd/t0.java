package dd;
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        if (h.length() > 0) {
            lVar.f6782i.l(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    w wVar = b2.f6726a;
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
                                            lVar.f6778c = wVar;
                                            return;
                                        default:
                                            lVar.f6782i.j(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c10 = lVar.c('>', true);
                                if (c10 != null) {
                                    lVar.f6782i.m(c10);
                                    return;
                                } else {
                                    lVar.f6782i.j('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        lVar.l(this);
                        lVar.f6778c = wVar;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f6782i.j(d);
                return;
            }
            lVar.f6778c = b2.W;
            return;
        }
        lVar.m(this);
        lVar.f6782i.j((char) 65533);
    }
}
