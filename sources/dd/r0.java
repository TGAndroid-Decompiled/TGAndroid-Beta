package dd;
public enum r0 extends b2 {
    public r0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.E0);
        if (g10.length() > 0) {
            lVar.f8311i.f(g10);
        } else {
            lVar.f8311i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        lVar.f8311i.e(d);
                        return;
                    } else {
                        lVar.f8307c = b2.f8260d0;
                        return;
                    }
                }
                int[] c10 = lVar.c('\'', true);
                if (c10 != null) {
                    lVar.f8311i.g(c10);
                    return;
                } else {
                    lVar.f8311i.e('&');
                    return;
                }
            }
            lVar.l(this);
            lVar.f8307c = b2.f8254a;
            return;
        }
        lVar.m(this);
        lVar.f8311i.e((char) 65533);
    }
}
