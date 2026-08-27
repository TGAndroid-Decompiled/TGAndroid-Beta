package mc;

public final enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f18016n;
        char cI = aVar.i();
        if (cI == 0) {
            lVar.m(this);
            aVar.a();
            eVar.f17991c.append((char) 65533);
        } else if (cI == '-') {
            lVar.a(b2.f17965g0);
        } else {
            if (cI != 65535) {
                eVar.f17991c.append(aVar.g('-', 0));
                return;
            }
            lVar.l(this);
            lVar.i();
            lVar.f18007c = b2.f17954a;
        }
    }
}
