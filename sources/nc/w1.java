package nc;
public enum w1 extends b2 {
    public w1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String c3;
        StringBuilder sb2 = lVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f17231a;
        if (p10 != -1) {
            c3 = a.c(cArr, strArr, aVar.f17234e, p10);
            aVar.f17234e += p10;
        } else {
            aVar.b();
            int i10 = aVar.f17234e;
            c3 = a.c(cArr, strArr, i10, aVar.f17233c - i10);
            aVar.f17234e = aVar.f17233c;
        }
        sb2.append(c3);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? kVar = new k(5, 0);
        kVar.f17273c = sb3;
        lVar.h(kVar);
        lVar.f17290c = b2.f17237a;
    }
}
