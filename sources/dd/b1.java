package dd;
public enum b1 extends b2 {
    public b1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8362n;
        char d = aVar.d();
        a1 a1Var = b2.f8315k0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f8337c;
                    sb2.append('-');
                    sb2.append(d);
                    lVar.f8353c = a1Var;
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f8353c = b2.f8300a;
                return;
            }
            lVar.f8353c = b2.m0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f8337c;
        sb3.append('-');
        sb3.append((char) 65533);
        lVar.f8353c = a1Var;
    }
}
