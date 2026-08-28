package lc;
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f16832n;
        char i9 = aVar.i();
        if (i9 != 0) {
            if (i9 != '-') {
                if (i9 != 65535) {
                    eVar.f16807c.append(aVar.g('-', 0));
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f16823c = b2.f16770a;
                return;
            }
            lVar.a(b2.f16781g0);
            return;
        }
        lVar.m(this);
        aVar.a();
        eVar.f16807c.append((char) 65533);
    }
}
