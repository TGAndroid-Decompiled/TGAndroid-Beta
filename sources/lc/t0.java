package lc;
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.D0);
        if (h.length() > 0) {
            lVar.f16827i.g(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    w wVar = b2.f16770a;
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
                                            lVar.f16823c = wVar;
                                            return;
                                        default:
                                            lVar.f16827i.f(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c10 = lVar.c('>', true);
                                if (c10 != null) {
                                    lVar.f16827i.h(c10);
                                    return;
                                } else {
                                    lVar.f16827i.f('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        lVar.l(this);
                        lVar.f16823c = wVar;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f16827i.f(d);
                return;
            }
            lVar.f16823c = b2.S;
            return;
        }
        lVar.m(this);
        lVar.f16827i.f((char) 65533);
    }
}
