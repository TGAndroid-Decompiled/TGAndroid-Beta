package dd;
public enum b1 extends b2 {
    public b1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7701n;
        char d = aVar.d();
        a1 a1Var = b2.f7656j0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f7679c;
                    sb2.append('-');
                    sb2.append(d);
                    lVar.f7693c = a1Var;
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f7693c = b2.f7643a;
                return;
            }
            lVar.f7693c = b2.f7658l0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f7679c;
        sb3.append('-');
        sb3.append((char) 65533);
        lVar.f7693c = a1Var;
    }
}
