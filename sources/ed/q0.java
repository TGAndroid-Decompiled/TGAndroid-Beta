package ed;
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.F0);
        if (g10.length() > 0) {
            lVar.f8889i.f(g10);
        } else {
            lVar.f8889i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        lVar.f8889i.e(d);
                        return;
                    }
                    lVar.l(this);
                    lVar.f8885c = b2.f8832a;
                    return;
                }
                int[] c10 = lVar.c('\"', true);
                if (c10 != null) {
                    lVar.f8889i.g(c10);
                    return;
                } else {
                    lVar.f8889i.e('&');
                    return;
                }
            }
            lVar.f8885c = b2.f8838d0;
            return;
        }
        lVar.m(this);
        lVar.f8889i.e((char) 65533);
    }
}
