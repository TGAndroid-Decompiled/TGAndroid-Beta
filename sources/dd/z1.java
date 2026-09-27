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
                        lVar.f7683c = b2.f7654r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f7683c = b2.f7633a;
                    return;
                }
                lVar.a(b2.f7642f0);
                return;
            }
            lVar.a(b2.f7649n);
            return;
        }
        lVar.a(b2.f7643g0);
    }
}
