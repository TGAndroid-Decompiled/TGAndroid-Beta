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
        char[] cArr = aVar.f7986a;
        if (p10 != -1) {
            c10 = a.c(cArr, strArr, aVar.f7989e, p10);
            aVar.f7989e += p10;
        } else {
            aVar.b();
            int i7 = aVar.f7989e;
            c10 = a.c(cArr, strArr, i7, aVar.f7988c - i7);
            aVar.f7989e = aVar.f7988c;
        }
        sb2.append(c10);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? kVar = new k(5, 0);
        kVar.f8028c = sb3;
        lVar.g(kVar);
        lVar.f8045c = b2.f7992a;
    }
}
