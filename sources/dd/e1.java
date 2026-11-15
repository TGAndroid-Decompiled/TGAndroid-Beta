package dd;
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8054n;
        char d = aVar.d();
        a1 a1Var = b2.f8007k0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7992a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f8029c;
                        sb2.append("--!");
                        sb2.append(d);
                        lVar.f8045c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8045c = wVar;
                    return;
                }
                lVar.i();
                lVar.f8045c = wVar;
                return;
            }
            eVar.f8029c.append("--!");
            lVar.f8045c = b2.f8008l0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f8029c;
        sb3.append("--!");
        sb3.append((char) 65533);
        lVar.f8045c = a1Var;
    }
}
