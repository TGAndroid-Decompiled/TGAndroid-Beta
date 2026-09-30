package dd;
public enum c1 extends b2 {
    public c1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7701n;
        char d = aVar.d();
        a1 a1Var = b2.f7656j0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    w wVar = b2.f7643a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            StringBuilder sb2 = eVar.f7679c;
                            sb2.append("--");
                            sb2.append(d);
                            lVar.f7693c = a1Var;
                            return;
                        }
                        lVar.l(this);
                        lVar.i();
                        lVar.f7693c = wVar;
                        return;
                    }
                    lVar.i();
                    lVar.f7693c = wVar;
                    return;
                }
                lVar.m(this);
                eVar.f7679c.append('-');
                return;
            }
            lVar.m(this);
            lVar.f7693c = b2.m0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f7679c;
        sb3.append("--");
        sb3.append((char) 65533);
        lVar.f7693c = a1Var;
    }
}
