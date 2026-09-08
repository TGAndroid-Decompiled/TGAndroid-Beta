package dd;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f6815n;
        char d = aVar.d();
        a1 a1Var = b2.f6767j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f6753a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f6790c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f6806c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f6806c = wVar;
                    return;
                }
                lVar.i();
                lVar.f6806c = wVar;
                return;
            }
            eVar.f6790c.append("--!");
            lVar.f6806c = b2.f6768k0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f6790c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f6806c = a1Var;
    }
}
