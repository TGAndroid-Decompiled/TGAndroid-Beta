package dd;
public enum r0 extends b2 {
    public r0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.E0);
        if (g10.length() > 0) {
            lVar.f7701i.f(g10);
        } else {
            lVar.f7701i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        lVar.f7701i.e(d);
                        return;
                    } else {
                        lVar.f7698c = b2.f7654d0;
                        return;
                    }
                }
                int[] c10 = lVar.c('\'', true);
                if (c10 != null) {
                    lVar.f7701i.g(c10);
                    return;
                } else {
                    lVar.f7701i.e('&');
                    return;
                }
            }
            lVar.l(this);
            lVar.f7698c = b2.f7648a;
            return;
        }
        lVar.m(this);
        lVar.f7701i.e((char) 65533);
    }
}
