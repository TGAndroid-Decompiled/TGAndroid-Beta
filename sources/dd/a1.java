package dd;
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8667n;
        char i7 = aVar.i();
        if (i7 != 0) {
            if (i7 != '-') {
                if (i7 != 65535) {
                    eVar.f8642c.append(aVar.g('-', 0));
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f8658c = b2.f8605a;
                return;
            }
            lVar.a(b2.f8620k0);
            return;
        }
        lVar.m(this);
        aVar.a();
        eVar.f8642c.append((char) 65533);
    }
}
