package nc;
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
                        lVar.f17290c = b2.f17259r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f17290c = b2.f17237a;
                    return;
                }
                lVar.a(b2.f17240b0);
                return;
            }
            lVar.a(b2.f17254n);
            return;
        }
        lVar.a(b2.f17242c0);
    }
}
