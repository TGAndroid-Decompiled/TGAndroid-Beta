package fd;
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.E0);
        if (g10.length() > 0) {
            kVar.f9127i.f(g10);
        } else {
            kVar.f9127i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        kVar.f9127i.e(d);
                        return;
                    } else {
                        kVar.f9124c = a2.f9082d0;
                        return;
                    }
                }
                int[] c10 = kVar.c('\'', true);
                if (c10 != null) {
                    kVar.f9127i.g(c10);
                    return;
                } else {
                    kVar.f9127i.e('&');
                    return;
                }
            }
            kVar.l(this);
            kVar.f9124c = a2.f9076a;
            return;
        }
        kVar.m(this);
        kVar.f9127i.e((char) 65533);
    }
}
