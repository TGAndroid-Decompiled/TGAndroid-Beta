package dd;
public enum b1 extends b2 {
    public b1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7704n;
        char d = aVar.d();
        a1 a1Var = b2.f7659j0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f7682c;
                    sb2.append('-');
                    sb2.append(d);
                    lVar.f7696c = a1Var;
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f7696c = b2.f7646a;
                return;
            }
            lVar.f7696c = b2.f7661l0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f7682c;
        sb3.append('-');
        sb3.append((char) 65533);
        lVar.f7696c = a1Var;
    }
}
