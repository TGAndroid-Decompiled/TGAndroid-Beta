package ed;
public enum p extends b2 {
    public p() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(l lVar, a aVar) {
        lVar.h("</" + lVar.h.toString());
        aVar.q();
        lVar.f8886c = b2.f8837c;
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            String e7 = aVar.e();
            lVar.f8890i.h(e7);
            lVar.h.append(e7);
            return;
        }
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(lVar, aVar);
                } else if (lVar.n()) {
                    lVar.k();
                    lVar.f8886c = b2.f8833a;
                } else {
                    e(lVar, aVar);
                }
            } else if (lVar.n()) {
                lVar.f8886c = b2.f8841e0;
            } else {
                e(lVar, aVar);
            }
        } else if (lVar.n()) {
            lVar.f8886c = b2.W;
        } else {
            e(lVar, aVar);
        }
    }
}
