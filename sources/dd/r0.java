package dd;
public enum r0 extends b2 {
    public r0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.E0);
        if (g10.length() > 0) {
            lVar.f6782i.l(g10);
        } else {
            lVar.f6782i.f6769n = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        lVar.f6782i.j(d);
                        return;
                    } else {
                        lVar.f6778c = b2.f6732d0;
                        return;
                    }
                }
                int[] c10 = lVar.c('\'', true);
                if (c10 != null) {
                    lVar.f6782i.m(c10);
                    return;
                } else {
                    lVar.f6782i.j('&');
                    return;
                }
            }
            lVar.l(this);
            lVar.f6778c = b2.f6726a;
            return;
        }
        lVar.m(this);
        lVar.f6782i.j((char) 65533);
    }
}
