package mc;

public final enum p extends b2 {
    public p() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(l lVar, a aVar) {
        lVar.g("</" + lVar.h.toString());
        aVar.q();
        lVar.f18007c = b2.f17958c;
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            String strE = aVar.e();
            lVar.f18011i.i(strE);
            lVar.h.append(strE);
            return;
        }
        char cD = aVar.d();
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            if (lVar.n()) {
                lVar.f18007c = b2.S;
                return;
            } else {
                e(lVar, aVar);
                return;
            }
        }
        if (cD == '/') {
            if (lVar.n()) {
                lVar.f18007c = b2.f17955a0;
                return;
            } else {
                e(lVar, aVar);
                return;
            }
        }
        if (cD != '>') {
            e(lVar, aVar);
        } else if (!lVar.n()) {
            e(lVar, aVar);
        } else {
            lVar.k();
            lVar.f18007c = b2.f17954a;
        }
    }
}
