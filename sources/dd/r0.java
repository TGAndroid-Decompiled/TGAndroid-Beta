package dd;
public enum r0 extends b2 {
    public r0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.E0);
        if (g10.length() > 0) {
            lVar.f7699i.f(g10);
        } else {
            lVar.f7699i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        lVar.f7699i.e(d);
                        return;
                    } else {
                        lVar.f7696c = b2.f7652d0;
                        return;
                    }
                }
                int[] c10 = lVar.c('\'', true);
                if (c10 != null) {
                    lVar.f7699i.g(c10);
                    return;
                } else {
                    lVar.f7699i.e('&');
                    return;
                }
            }
            lVar.l(this);
            lVar.f7696c = b2.f7646a;
            return;
        }
        lVar.m(this);
        lVar.f7699i.e((char) 65533);
    }
}
