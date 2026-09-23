package dd;
public enum p extends b2 {
    public p() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(l lVar, a aVar) {
        lVar.h("</" + lVar.h.toString());
        aVar.q();
        lVar.f7682c = b2.f7636c;
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            String e = aVar.e();
            lVar.f7685i.h(e);
            lVar.h.append(e);
            return;
        }
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(lVar, aVar);
                } else if (lVar.n()) {
                    lVar.k();
                    lVar.f7682c = b2.f7632a;
                } else {
                    e(lVar, aVar);
                }
            } else if (lVar.n()) {
                lVar.f7682c = b2.f7639e0;
            } else {
                e(lVar, aVar);
            }
        } else if (lVar.n()) {
            lVar.f7682c = b2.W;
        } else {
            e(lVar, aVar);
        }
    }
}
