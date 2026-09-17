package dd;
public enum p extends b2 {
    public p() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(l lVar, a aVar) {
        lVar.h("</" + lVar.h.toString());
        aVar.q();
        lVar.f6806c = b2.f6757c;
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            String e7 = aVar.e();
            lVar.f6810i.h(e7);
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
                    lVar.f6806c = b2.f6753a;
                } else {
                    e(lVar, aVar);
                }
            } else if (lVar.n()) {
                lVar.f6806c = b2.f6761e0;
            } else {
                e(lVar, aVar);
            }
        } else if (lVar.n()) {
            lVar.f6806c = b2.W;
        } else {
            e(lVar, aVar);
        }
    }
}
