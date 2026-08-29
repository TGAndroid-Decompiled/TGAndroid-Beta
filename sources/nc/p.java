package nc;
public enum p extends b2 {
    public p() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(l lVar, a aVar) {
        lVar.g("</" + lVar.h.toString());
        aVar.q();
        lVar.f17290c = b2.f17241c;
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            String e10 = aVar.e();
            lVar.f17294i.i(e10);
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
                    lVar.f17290c = b2.f17237a;
                } else {
                    e(lVar, aVar);
                }
            } else if (lVar.n()) {
                lVar.f17290c = b2.f17238a0;
            } else {
                e(lVar, aVar);
            }
        } else if (lVar.n()) {
            lVar.f17290c = b2.S;
        } else {
            e(lVar, aVar);
        }
    }
}
