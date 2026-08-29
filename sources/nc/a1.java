package nc;
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f17299n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f17274c.append(aVar.g('-', 0));
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f17290c = b2.f17237a;
                return;
            }
            lVar.a(b2.f17248g0);
            return;
        }
        lVar.m(this);
        aVar.a();
        eVar.f17274c.append((char) 65533);
    }
}
