package ad;
public enum d1 extends c2 {
    public d1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(m mVar, a aVar) {
        f fVar = mVar.f379n;
        char d = aVar.d();
        b1 b1Var = c2.f332k0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    x xVar = c2.f317a;
                    if (d != '>') {
                        if (d != 65535) {
                            mVar.m(this);
                            StringBuilder sb2 = fVar.f354c;
                            sb2.append("--");
                            sb2.append(d);
                            mVar.f370c = b1Var;
                            return;
                        }
                        mVar.l(this);
                        mVar.i();
                        mVar.f370c = xVar;
                        return;
                    }
                    mVar.i();
                    mVar.f370c = xVar;
                    return;
                }
                mVar.m(this);
                fVar.f354c.append('-');
                return;
            }
            mVar.m(this);
            mVar.f370c = c2.f335n0;
            return;
        }
        mVar.m(this);
        StringBuilder sb3 = fVar.f354c;
        sb3.append("--");
        sb3.append((char) 65533);
        mVar.f370c = b1Var;
    }
}
