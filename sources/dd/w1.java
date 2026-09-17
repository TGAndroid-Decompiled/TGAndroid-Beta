package dd;
public enum w1 extends b2 {
    public w1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String c10;
        StringBuilder sb2 = lVar.h;
        int p5 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f6720a;
        if (p5 != -1) {
            c10 = a.c(cArr, strArr, aVar.f6723e, p5);
            aVar.f6723e += p5;
        } else {
            aVar.b();
            int i10 = aVar.f6723e;
            c10 = a.c(cArr, strArr, i10, aVar.f6722c - i10);
            aVar.f6723e = aVar.f6722c;
        }
        sb2.append(c10);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? kVar = new k(5, 0);
        kVar.f6762c = sb3;
        lVar.g(kVar);
        lVar.f6778c = b2.f6726a;
    }
}
