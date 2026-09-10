package dd;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f6478n;
        char d = aVar.d();
        a1 a1Var = b2.f6433j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f6420a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f6456c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f6470c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f6470c = wVar;
                    return;
                }
                lVar.i();
                lVar.f6470c = wVar;
                return;
            }
            eVar.f6456c.append("--!");
            lVar.f6470c = b2.f6434k0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f6456c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f6470c = a1Var;
    }
}
