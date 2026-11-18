package dd;
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8336n;
        char i7 = aVar.i();
        if (i7 != 0) {
            if (i7 != '-') {
                if (i7 != 65535) {
                    eVar.f8311c.append(aVar.g('-', 0));
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f8327c = b2.f8274a;
                return;
            }
            lVar.a(b2.f8290l0);
            return;
        }
        lVar.m(this);
        aVar.a();
        eVar.f8311c.append((char) 65533);
    }
}
