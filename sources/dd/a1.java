package dd;
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7707n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f7685c.append(aVar.g('-', 0));
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f7699c = b2.f7649a;
                return;
            }
            lVar.a(b2.f7663k0);
            return;
        }
        lVar.m(this);
        aVar.a();
        eVar.f7685c.append((char) 65533);
    }
}
