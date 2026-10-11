package ed;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8894n;
        char d = aVar.d();
        a1 a1Var = b2.f8846j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8832a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f8869c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f8885c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8885c = wVar;
                    return;
                }
                lVar.i();
                lVar.f8885c = wVar;
                return;
            }
            eVar.f8869c.append("--!");
            lVar.f8885c = b2.f8847k0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f8869c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f8885c = a1Var;
    }
}
