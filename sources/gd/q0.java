package gd;
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g7 = aVar.g(a2.E0);
        if (g7.length() > 0) {
            kVar.f12461i.f(g7);
        } else {
            kVar.f12461i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        kVar.f12461i.e(d);
                        return;
                    } else {
                        kVar.f12458c = a2.f12416d0;
                        return;
                    }
                }
                int[] c10 = kVar.c('\'', true);
                if (c10 != null) {
                    kVar.f12461i.g(c10);
                    return;
                } else {
                    kVar.f12461i.e('&');
                    return;
                }
            }
            kVar.l(this);
            kVar.f12458c = a2.f12410a;
            return;
        }
        kVar.m(this);
        kVar.f12461i.e((char) 65533);
    }
}
