package dd;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8664n;
        char d = aVar.d();
        a1 a1Var = b2.f8616j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8602a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f8639c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f8655c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8655c = wVar;
                    return;
                }
                lVar.i();
                lVar.f8655c = wVar;
                return;
            }
            eVar.f8639c.append("--!");
            lVar.f8655c = b2.f8617k0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f8639c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f8655c = a1Var;
    }
}
