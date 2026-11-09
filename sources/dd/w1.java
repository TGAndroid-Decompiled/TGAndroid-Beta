package dd;
public enum w1 extends b2 {
    public w1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String c10;
        StringBuilder sb2 = lVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f8594a;
        if (p10 != -1) {
            c10 = a.c(cArr, strArr, aVar.f8597e, p10);
            aVar.f8597e += p10;
        } else {
            aVar.b();
            int i7 = aVar.f8597e;
            c10 = a.c(cArr, strArr, i7, aVar.f8596c - i7);
            aVar.f8597e = aVar.f8596c;
        }
        sb2.append(c10);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? kVar = new k(5, 0);
        kVar.f8636c = sb3;
        lVar.g(kVar);
        lVar.f8653c = b2.f8600a;
    }
}
