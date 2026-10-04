package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8316n;
        char d = aVar.d();
        a1 a1Var = b2.f8268j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8254a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8291c.append(d);
                        lVar.f8307c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8307c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8307c = wVar;
                return;
            }
            lVar.f8307c = b2.f8267i0;
            return;
        }
        lVar.m(this);
        eVar.f8291c.append((char) 65533);
        lVar.f8307c = a1Var;
    }
}
