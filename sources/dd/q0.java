package dd;
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.F0);
        if (g10.length() > 0) {
            lVar.f7684i.f(g10);
        } else {
            lVar.f7684i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        lVar.f7684i.e(d);
                        return;
                    }
                    lVar.l(this);
                    lVar.f7681c = b2.f7631a;
                    return;
                }
                int[] c10 = lVar.c('\"', true);
                if (c10 != null) {
                    lVar.f7684i.g(c10);
                    return;
                } else {
                    lVar.f7684i.e('&');
                    return;
                }
            }
            lVar.f7681c = b2.f7637d0;
            return;
        }
        lVar.m(this);
        lVar.f7684i.e((char) 65533);
    }
}
