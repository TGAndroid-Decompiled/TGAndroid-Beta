package dd;
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.F0);
        if (g10.length() > 0) {
            lVar.f6782i.l(g10);
        } else {
            lVar.f6782i.f6769n = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        lVar.f6782i.j(d);
                        return;
                    }
                    lVar.l(this);
                    lVar.f6778c = b2.f6726a;
                    return;
                }
                int[] c10 = lVar.c('\"', true);
                if (c10 != null) {
                    lVar.f6782i.m(c10);
                    return;
                } else {
                    lVar.f6782i.j('&');
                    return;
                }
            }
            lVar.f6778c = b2.f6732d0;
            return;
        }
        lVar.m(this);
        lVar.f6782i.j((char) 65533);
    }
}
