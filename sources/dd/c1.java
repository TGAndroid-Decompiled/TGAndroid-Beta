package dd;
public enum c1 extends b2 {
    public c1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8327n;
        char d = aVar.d();
        a1 a1Var = b2.f8280k0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    w wVar = b2.f8265a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            StringBuilder sb2 = eVar.f8302c;
                            sb2.append("--");
                            sb2.append(d);
                            lVar.f8318c = a1Var;
                            return;
                        }
                        lVar.l(this);
                        lVar.i();
                        lVar.f8318c = wVar;
                        return;
                    }
                    lVar.i();
                    lVar.f8318c = wVar;
                    return;
                }
                lVar.m(this);
                eVar.f8302c.append('-');
                return;
            }
            lVar.m(this);
            lVar.f8318c = b2.f8283n0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f8302c;
        sb3.append("--");
        sb3.append((char) 65533);
        lVar.f8318c = a1Var;
    }
}
