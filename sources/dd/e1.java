package dd;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8667n;
        char d = aVar.d();
        a1 a1Var = b2.f8619j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8605a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f8642c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f8658c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8658c = wVar;
                    return;
                }
                lVar.i();
                lVar.f8658c = wVar;
                return;
            }
            eVar.f8642c.append("--!");
            lVar.f8658c = b2.f8620k0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f8642c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f8658c = a1Var;
    }
}
