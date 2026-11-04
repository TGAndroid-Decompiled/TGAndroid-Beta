package ad;
public enum o0 extends c2 {
    public o0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(m mVar, a aVar) {
        String h = aVar.h(c2.H0);
        k kVar = mVar.f374i;
        String str = kVar.f358e;
        if (str != null) {
            h = str.concat(h);
        }
        kVar.f358e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        x xVar = c2.f317a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        mVar.f370c = c2.f318a0;
                                        return;
                                    case '>':
                                        mVar.k();
                                        mVar.f370c = xVar;
                                        return;
                                    default:
                                        mVar.f374i.d(d);
                                        return;
                                }
                            }
                        } else {
                            mVar.l(this);
                            mVar.f370c = xVar;
                            return;
                        }
                    } else {
                        mVar.f370c = c2.f327f0;
                        return;
                    }
                }
                mVar.m(this);
                mVar.f374i.d(d);
                return;
            }
            mVar.f370c = c2.Z;
            return;
        }
        mVar.m(this);
        mVar.f374i.d((char) 65533);
    }
}
