package gd;
public enum o extends a2 {
    public o() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(k kVar, a aVar) {
        kVar.h("</" + kVar.h.toString());
        aVar.q();
        kVar.f12459c = a2.f12415c;
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            String e = aVar.e();
            kVar.f12462i.h(e);
            kVar.h.append(e);
            return;
        }
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(kVar, aVar);
                } else if (kVar.n()) {
                    kVar.k();
                    kVar.f12459c = a2.f12411a;
                } else {
                    e(kVar, aVar);
                }
            } else if (kVar.n()) {
                kVar.f12459c = a2.f12418e0;
            } else {
                e(kVar, aVar);
            }
        } else if (kVar.n()) {
            kVar.f12459c = a2.W;
        } else {
            e(kVar, aVar);
        }
    }
}
