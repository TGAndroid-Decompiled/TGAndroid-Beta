package fd;
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.F0);
        if (g10.length() > 0) {
            kVar.f9130i.f(g10);
        } else {
            kVar.f9130i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        kVar.f9130i.e(d);
                        return;
                    }
                    kVar.l(this);
                    kVar.f9127c = a2.f9079a;
                    return;
                }
                int[] c10 = kVar.c('\"', true);
                if (c10 != null) {
                    kVar.f9130i.g(c10);
                    return;
                } else {
                    kVar.f9130i.e('&');
                    return;
                }
            }
            kVar.f9127c = a2.f9085d0;
            return;
        }
        kVar.m(this);
        kVar.f9130i.e((char) 65533);
    }
}
