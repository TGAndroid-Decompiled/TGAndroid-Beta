package ed;
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
                        lVar.f8886c = b2.f8855r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f8886c = b2.f8833a;
                    return;
                }
                lVar.a(b2.f8843f0);
                return;
            }
            lVar.a(b2.f8850n);
            return;
        }
        lVar.a(b2.f8844g0);
    }
}
