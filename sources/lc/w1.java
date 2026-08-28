package lc;
public enum w1 extends b2 {
    public w1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String c10;
        StringBuilder sb2 = lVar.h;
        int p6 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f16764a;
        if (p6 != -1) {
            c10 = a.c(cArr, strArr, aVar.f16767e, p6);
            aVar.f16767e += p6;
        } else {
            aVar.b();
            int i9 = aVar.f16767e;
            c10 = a.c(cArr, strArr, i9, aVar.f16766c - i9);
            aVar.f16767e = aVar.f16766c;
        }
        sb2.append(c10);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? kVar = new k(5, 0);
        kVar.f16806c = sb3;
        lVar.h(kVar);
        lVar.f16823c = b2.f16770a;
    }
}
