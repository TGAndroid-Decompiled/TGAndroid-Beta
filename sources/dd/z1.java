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
                        lVar.f7694c = b2.f7665r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f7694c = b2.f7644a;
                    return;
                }
                lVar.a(b2.f7653f0);
                return;
            }
            lVar.a(b2.f7660n);
            return;
        }
        lVar.a(b2.f7654g0);
    }
}
