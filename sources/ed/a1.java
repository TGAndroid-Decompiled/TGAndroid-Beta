package ed;
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8892n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f8867c.append(aVar.g('-', 0));
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f8883c = b2.f8830a;
                return;
            }
            lVar.a(b2.f8845k0);
            return;
        }
        lVar.m(this);
        aVar.a();
        eVar.f8867c.append((char) 65533);
    }
}
