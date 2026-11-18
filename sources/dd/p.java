package dd;
public enum p extends b2 {
    public p() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(l lVar, a aVar) {
        lVar.h("</" + lVar.h.toString());
        aVar.q();
        lVar.f8324c = b2.f8275c;
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            String e10 = aVar.e();
            lVar.f8328i.h(e10);
            lVar.h.append(e10);
            return;
        }
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(lVar, aVar);
                } else if (lVar.n()) {
                    lVar.k();
                    lVar.f8324c = b2.f8271a;
                } else {
                    e(lVar, aVar);
                }
            } else if (lVar.n()) {
                lVar.f8324c = b2.f8281f0;
            } else {
                e(lVar, aVar);
            }
        } else if (lVar.n()) {
            lVar.f8324c = b2.X;
        } else {
            e(lVar, aVar);
        }
    }
}
