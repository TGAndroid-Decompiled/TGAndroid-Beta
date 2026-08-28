package lc;
public enum s0 extends b2 {
    public s0() {
        super("Rcdata", 2);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i9 = aVar.i();
        if (i9 != 0) {
            if (i9 != '&') {
                if (i9 != '<') {
                    if (i9 != 65535) {
                        lVar.g(aVar.g('&', '<', 0));
                        return;
                    } else {
                        lVar.h(new g());
                        return;
                    }
                }
                lVar.a(b2.f16794s);
                return;
            }
            lVar.a(b2.d);
            return;
        }
        lVar.m(this);
        aVar.a();
        lVar.f((char) 65533);
    }
}
