package ad;
public enum q extends c2 {
    public q() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(m mVar, a aVar) {
        mVar.h("</" + mVar.h.toString());
        aVar.q();
        mVar.f370c = c2.f321c;
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.o()) {
            String e10 = aVar.e();
            mVar.f374i.h(e10);
            mVar.h.append(e10);
            return;
        }
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(mVar, aVar);
                } else if (mVar.n()) {
                    mVar.k();
                    mVar.f370c = c2.f317a;
                } else {
                    e(mVar, aVar);
                }
            } else if (mVar.n()) {
                mVar.f370c = c2.f327f0;
            } else {
                e(mVar, aVar);
            }
        } else if (mVar.n()) {
            mVar.f370c = c2.X;
        } else {
            e(mVar, aVar);
        }
    }
}
