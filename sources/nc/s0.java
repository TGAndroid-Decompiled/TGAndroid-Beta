package nc;
public enum s0 extends b2 {
    public s0() {
        super("Rcdata", 2);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '&') {
                if (i10 != '<') {
                    if (i10 != 65535) {
                        lVar.g(aVar.g('&', '<', 0));
                        return;
                    } else {
                        lVar.h(new g());
                        return;
                    }
                }
                lVar.a(b2.f17261s);
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
