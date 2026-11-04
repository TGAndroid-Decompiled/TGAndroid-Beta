package ad;
public enum t0 extends c2 {
    public t0() {
        super("Rcdata", 2);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char i3 = aVar.i();
        if (i3 != 0) {
            if (i3 != '&') {
                if (i3 != '<') {
                    if (i3 != 65535) {
                        mVar.h(aVar.g('&', '<', 0));
                        return;
                    } else {
                        mVar.g(new h());
                        return;
                    }
                }
                mVar.a(c2.f341s);
                return;
            }
            mVar.a(c2.d);
            return;
        }
        mVar.m(this);
        aVar.a();
        mVar.f((char) 65533);
    }
}
