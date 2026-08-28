package lc;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f16832n;
        char d = aVar.d();
        a1 a1Var = b2.f16780f0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f16770a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f16807c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f16823c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f16823c = wVar;
                    return;
                }
                lVar.i();
                lVar.f16823c = wVar;
                return;
            }
            eVar.f16807c.append("--!");
            lVar.f16823c = b2.f16781g0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f16807c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f16823c = a1Var;
    }
}
