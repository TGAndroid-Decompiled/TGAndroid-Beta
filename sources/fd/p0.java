package fd;
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.F0);
        if (g10.length() > 0) {
            kVar.f10570i.f(g10);
        } else {
            kVar.f10570i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        kVar.f10570i.e(d);
                        return;
                    }
                    kVar.l(this);
                    kVar.f10567c = a2.f10519a;
                    return;
                }
                int[] c10 = kVar.c('\"', true);
                if (c10 != null) {
                    kVar.f10570i.g(c10);
                    return;
                } else {
                    kVar.f10570i.e('&');
                    return;
                }
            }
            kVar.f10567c = a2.f10525d0;
            return;
        }
        kVar.m(this);
        kVar.f10570i.e((char) 65533);
    }
}
