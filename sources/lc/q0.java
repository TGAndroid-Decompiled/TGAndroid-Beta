package lc;
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.B0);
        if (g10.length() > 0) {
            lVar.f16827i.g(g10);
        } else {
            lVar.f16827i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        lVar.f16827i.f(d);
                        return;
                    }
                    lVar.l(this);
                    lVar.f16823c = b2.f16770a;
                    return;
                }
                int[] c10 = lVar.c('\"', true);
                if (c10 != null) {
                    lVar.f16827i.h(c10);
                    return;
                } else {
                    lVar.f16827i.f('&');
                    return;
                }
            }
            lVar.f16823c = b2.Z;
            return;
        }
        lVar.m(this);
        lVar.f16827i.f((char) 65533);
    }
}
