package ad;
public enum a1 extends c2 {
    public a1() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(m mVar, a aVar) {
        f fVar = mVar.f379n;
        char d = aVar.d();
        b1 b1Var = c2.f332k0;
        if (d != 0) {
            if (d != '-') {
                x xVar = c2.f317a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f354c.append(d);
                        mVar.f370c = b1Var;
                        return;
                    }
                    mVar.l(this);
                    mVar.i();
                    mVar.f370c = xVar;
                    return;
                }
                mVar.m(this);
                mVar.i();
                mVar.f370c = xVar;
                return;
            }
            mVar.f370c = c2.f331j0;
            return;
        }
        mVar.m(this);
        fVar.f354c.append((char) 65533);
        mVar.f370c = b1Var;
    }
}
