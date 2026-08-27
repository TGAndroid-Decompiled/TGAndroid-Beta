package mc;

public final enum w1 extends b2 {
    public w1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String strC;
        StringBuilder sb2 = lVar.h;
        int iP = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f17948a;
        if (iP != -1) {
            strC = a.c(cArr, strArr, aVar.f17951e, iP);
            aVar.f17951e += iP;
        } else {
            aVar.b();
            int i10 = aVar.f17951e;
            strC = a.c(cArr, strArr, i10, aVar.f17950c - i10);
            aVar.f17951e = aVar.f17950c;
        }
        sb2.append(strC);
        if (aVar.k("]]>") || aVar.j()) {
            String string = sb2.toString();
            c cVar = new c(5, 0);
            cVar.f17990c = string;
            lVar.h(cVar);
            lVar.f18007c = b2.f17954a;
        }
    }
}
