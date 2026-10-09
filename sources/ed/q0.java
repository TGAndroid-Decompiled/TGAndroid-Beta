package ed;
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.F0);
        if (g10.length() > 0) {
            lVar.f8890i.f(g10);
        } else {
            lVar.f8890i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        lVar.f8890i.e(d);
                        return;
                    }
                    lVar.l(this);
                    lVar.f8886c = b2.f8833a;
                    return;
                }
                int[] c10 = lVar.c('\"', true);
                if (c10 != null) {
                    lVar.f8890i.g(c10);
                    return;
                } else {
                    lVar.f8890i.e('&');
                    return;
                }
            }
            lVar.f8886c = b2.f8839d0;
            return;
        }
        lVar.m(this);
        lVar.f8890i.e((char) 65533);
    }
}
