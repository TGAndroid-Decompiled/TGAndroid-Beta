package gd;
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g7 = aVar.g(a2.F0);
        if (g7.length() > 0) {
            kVar.f12462i.f(g7);
        } else {
            kVar.f12462i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        kVar.f12462i.e(d);
                        return;
                    }
                    kVar.l(this);
                    kVar.f12459c = a2.f12411a;
                    return;
                }
                int[] c10 = kVar.c('\"', true);
                if (c10 != null) {
                    kVar.f12462i.g(c10);
                    return;
                } else {
                    kVar.f12462i.e('&');
                    return;
                }
            }
            kVar.f12459c = a2.f12417d0;
            return;
        }
        kVar.m(this);
        kVar.f12462i.e((char) 65533);
    }
}
