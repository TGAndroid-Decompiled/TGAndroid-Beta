package dd;
public enum b1 extends b2 {
    public b1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7707n;
        char d = aVar.d();
        a1 a1Var = b2.f7662j0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f7685c;
                    sb2.append('-');
                    sb2.append(d);
                    lVar.f7699c = a1Var;
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f7699c = b2.f7649a;
                return;
            }
            lVar.f7699c = b2.f7664l0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f7685c;
        sb3.append('-');
        sb3.append((char) 65533);
        lVar.f7699c = a1Var;
    }
}
