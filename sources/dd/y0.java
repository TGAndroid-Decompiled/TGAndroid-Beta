package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7706n;
        char d = aVar.d();
        a1 a1Var = b2.f7661j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7648a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f7684c.append(d);
                        lVar.f7698c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f7698c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f7698c = wVar;
                return;
            }
            lVar.f7698c = b2.f7660i0;
            return;
        }
        lVar.m(this);
        eVar.f7684c.append((char) 65533);
        lVar.f7698c = a1Var;
    }
}
