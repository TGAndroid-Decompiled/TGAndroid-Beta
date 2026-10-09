package ed;
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
        char[] cArr = aVar.f8827a;
        if (p5 != -1) {
            c10 = a.c(cArr, strArr, aVar.f8830e, p5);
            aVar.f8830e += p5;
        } else {
            aVar.b();
            int i10 = aVar.f8830e;
            c10 = a.c(cArr, strArr, i10, aVar.f8829c - i10);
            aVar.f8830e = aVar.f8829c;
        }
        sb2.append(c10);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? kVar = new k(5, 0);
        kVar.f8869c = sb3;
        lVar.g(kVar);
        lVar.f8886c = b2.f8833a;
    }
}
