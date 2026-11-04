package ad;
public enum a2 extends c2 {
    public a2() {
        super("TagOpen", 7);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char i3 = aVar.i();
        if (i3 != '!') {
            if (i3 != '/') {
                if (i3 != '?') {
                    if (aVar.o()) {
                        mVar.d(true);
                        mVar.f370c = c2.f339r;
                        return;
                    }
                    mVar.m(this);
                    mVar.f('<');
                    mVar.f370c = c2.f317a;
                    return;
                }
                mVar.a(c2.f328g0);
                return;
            }
            mVar.a(c2.f334n);
            return;
        }
        mVar.a(c2.f329h0);
    }
}
