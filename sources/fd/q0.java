package fd;
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.E0);
        if (g10.length() > 0) {
            kVar.f10571i.f(g10);
        } else {
            kVar.f10571i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        kVar.f10571i.e(d);
                        return;
                    } else {
                        kVar.f10568c = a2.f10526d0;
                        return;
                    }
                }
                int[] c10 = kVar.c('\'', true);
                if (c10 != null) {
                    kVar.f10571i.g(c10);
                    return;
                } else {
                    kVar.f10571i.e('&');
                    return;
                }
            }
            kVar.l(this);
            kVar.f10568c = a2.f10520a;
            return;
        }
        kVar.m(this);
        kVar.f10571i.e((char) 65533);
    }
}
