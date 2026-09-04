package dd;
public enum c1 extends b2 {
    public c1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f6787n;
        char d = aVar.d();
        a1 a1Var = b2.f6740j0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    w wVar = b2.f6726a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            StringBuilder sb2 = eVar.f6763c;
                            sb2.append("--");
                            sb2.append(d);
                            lVar.f6778c = a1Var;
                            return;
                        }
                        lVar.l(this);
                        lVar.i();
                        lVar.f6778c = wVar;
                        return;
                    }
                    lVar.i();
                    lVar.f6778c = wVar;
                    return;
                }
                lVar.m(this);
                eVar.f6763c.append('-');
                return;
            }
            lVar.m(this);
            lVar.f6778c = b2.m0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f6763c;
        sb3.append("--");
        sb3.append((char) 65533);
        lVar.f6778c = a1Var;
    }
}
