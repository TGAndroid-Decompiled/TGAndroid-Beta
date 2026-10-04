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
                        lVar.f8308c = b2.f8277r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f8308c = b2.f8255a;
                    return;
                }
                lVar.a(b2.f8265f0);
                return;
            }
            lVar.a(b2.f8272n);
            return;
        }
        lVar.a(b2.f8266g0);
    }
}
