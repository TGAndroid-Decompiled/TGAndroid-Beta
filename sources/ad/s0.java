package ad;
public enum s0 extends c2 {
    public s0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(m mVar, a aVar) {
        String g7 = aVar.g(c2.F0);
        if (g7.length() > 0) {
            mVar.f374i.f(g7);
        } else {
            mVar.f374i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        mVar.f374i.e(d);
                        return;
                    } else {
                        mVar.f370c = c2.f325e0;
                        return;
                    }
                }
                int[] c2 = mVar.c('\'', true);
                if (c2 != null) {
                    mVar.f374i.g(c2);
                    return;
                } else {
                    mVar.f374i.e('&');
                    return;
                }
            }
            mVar.l(this);
            mVar.f370c = c2.f317a;
            return;
        }
        mVar.m(this);
        mVar.f374i.e((char) 65533);
    }
}
