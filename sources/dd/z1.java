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
                        lVar.f7681c = b2.f7652r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f7681c = b2.f7631a;
                    return;
                }
                lVar.a(b2.f7640f0);
                return;
            }
            lVar.a(b2.f7647n);
            return;
        }
        lVar.a(b2.f7641g0);
    }
}
