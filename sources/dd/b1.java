package dd;
public enum b1 extends b2 {
    public b1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7689n;
        char d = aVar.d();
        a1 a1Var = b2.f7644j0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f7667c;
                    sb2.append('-');
                    sb2.append(d);
                    lVar.f7681c = a1Var;
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f7681c = b2.f7631a;
                return;
            }
            lVar.f7681c = b2.f7646l0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f7667c;
        sb3.append('-');
        sb3.append((char) 65533);
        lVar.f7681c = a1Var;
    }
}
