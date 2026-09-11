package dd;
public enum z1 extends b2 {
    public z1() {
        super("TagOpen", 7);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != '!') {
            if (i10 != '/') {
                if (i10 != '?') {
                    if (aVar.o()) {
                        lVar.d(true);
                        lVar.f6778c = b2.f6748r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f6778c = b2.f6726a;
                    return;
                }
                lVar.a(b2.f6736f0);
                return;
            }
            lVar.a(b2.f6743n);
            return;
        }
        lVar.a(b2.f6737g0);
    }
}
