package gd;
public enum s0 extends a2 {
    public s0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.H0);
        if (h.length() > 0) {
            kVar.f12462i.f(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    v vVar = a2.f12411a;
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            if (d != '&') {
                                if (d != '\'') {
                                    switch (d) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            kVar.k();
                                            kVar.f12459c = vVar;
                                            return;
                                        default:
                                            kVar.f12462i.e(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c10 = kVar.c('>', true);
                                if (c10 != null) {
                                    kVar.f12462i.g(c10);
                                    return;
                                } else {
                                    kVar.f12462i.e('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        kVar.l(this);
                        kVar.f12459c = vVar;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f12462i.e(d);
                return;
            }
            kVar.f12459c = a2.W;
            return;
        }
        kVar.m(this);
        kVar.f12462i.e((char) 65533);
    }
}
