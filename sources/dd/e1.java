package dd;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
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
                        StringBuilder sb2 = eVar.f7684c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f7698c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f7698c = wVar;
                    return;
                }
                lVar.i();
                lVar.f7698c = wVar;
                return;
            }
            eVar.f7684c.append("--!");
            lVar.f7698c = b2.f7662k0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f7684c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f7698c = a1Var;
    }
}
