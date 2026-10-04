package dd;
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8317n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f8292c.append(aVar.g('-', 0));
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f8308c = b2.f8255a;
                return;
            }
            lVar.a(b2.f8270k0);
            return;
        }
        lVar.m(this);
        aVar.a();
        eVar.f8292c.append((char) 65533);
    }
}
