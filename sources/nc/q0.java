package nc;
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.B0);
        if (g10.length() > 0) {
            lVar.f17294i.g(g10);
        } else {
            lVar.f17294i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        lVar.f17294i.f(d);
                        return;
                    }
                    lVar.l(this);
                    lVar.f17290c = b2.f17237a;
                    return;
                }
                int[] c3 = lVar.c('\"', true);
                if (c3 != null) {
                    lVar.f17294i.h(c3);
                    return;
                } else {
                    lVar.f17294i.f('&');
                    return;
                }
            }
            lVar.f17290c = b2.Z;
            return;
        }
        lVar.m(this);
        lVar.f17294i.f((char) 65533);
    }
}
