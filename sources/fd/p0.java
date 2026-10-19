package fd;
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.F0);
        if (g10.length() > 0) {
            kVar.f10572i.f(g10);
        } else {
            kVar.f10572i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        kVar.f10572i.e(d);
                        return;
                    }
                    kVar.l(this);
                    kVar.f10569c = a2.f10521a;
                    return;
                }
                int[] c10 = kVar.c('\"', true);
                if (c10 != null) {
                    kVar.f10572i.g(c10);
                    return;
                } else {
                    kVar.f10572i.e('&');
                    return;
                }
            }
            kVar.f10569c = a2.f10527d0;
            return;
        }
        kVar.m(this);
        kVar.f10572i.e((char) 65533);
    }
}
