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
                        lVar.f6806c = b2.f6775r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f6806c = b2.f6753a;
                    return;
                }
                lVar.a(b2.f6763f0);
                return;
            }
            lVar.a(b2.f6770n);
            return;
        }
        lVar.a(b2.f6764g0);
    }
}
