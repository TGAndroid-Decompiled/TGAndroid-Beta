package nc;
public enum b1 extends b2 {
    public b1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f17299n;
        char d = aVar.d();
        a1 a1Var = b2.f17247f0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f17274c;
                    sb2.append('-');
                    sb2.append(d);
                    lVar.f17290c = a1Var;
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f17290c = b2.f17237a;
                return;
            }
            lVar.f17290c = b2.f17249h0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f17274c;
        sb3.append('-');
        sb3.append((char) 65533);
        lVar.f17290c = a1Var;
    }
}
