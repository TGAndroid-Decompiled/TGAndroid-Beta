package lc;
public enum z1 extends b2 {
    public z1() {
        super("TagOpen", 7);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i9 = aVar.i();
        if (i9 != '!') {
            if (i9 != '/') {
                if (i9 != '?') {
                    if (aVar.o()) {
                        lVar.d(true);
                        lVar.f16823c = b2.f16792r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f16823c = b2.f16770a;
                    return;
                }
                lVar.a(b2.f16773b0);
                return;
            }
            lVar.a(b2.f16787n);
            return;
        }
        lVar.a(b2.f16775c0);
    }
}
