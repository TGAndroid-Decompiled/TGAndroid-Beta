package nc;
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.D0);
        if (h.length() > 0) {
            lVar.f17294i.g(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
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
                                            lVar.k();
                                            lVar.f17290c = wVar;
                                            return;
                                        default:
                                            lVar.f17294i.f(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c3 = lVar.c('>', true);
                                if (c3 != null) {
                                    lVar.f17294i.h(c3);
                                    return;
                                } else {
                                    lVar.f17294i.f('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        lVar.l(this);
                        lVar.f17290c = wVar;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f17294i.f(d);
                return;
            }
            lVar.f17290c = b2.S;
            return;
        }
        lVar.m(this);
        lVar.f17294i.f((char) 65533);
    }
}
