package dd;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
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
                        StringBuilder sb2 = eVar.f8291c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f8307c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8307c = wVar;
                    return;
                }
                lVar.i();
                lVar.f8307c = wVar;
                return;
            }
            eVar.f8291c.append("--!");
            lVar.f8307c = b2.f8269k0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f8291c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f8307c = a1Var;
    }
}
