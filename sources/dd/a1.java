package dd;
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8054n;
        char i7 = aVar.i();
        if (i7 != 0) {
            if (i7 != '-') {
                if (i7 != 65535) {
                    eVar.f8029c.append(aVar.g('-', 0));
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f8045c = b2.f7992a;
                return;
            }
            lVar.a(b2.f8008l0);
            return;
        }
        lVar.m(this);
        aVar.a();
        eVar.f8029c.append((char) 65533);
    }
}
