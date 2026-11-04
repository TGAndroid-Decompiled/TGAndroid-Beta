package ad;
public enum x1 extends c2 {
    public x1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(m mVar, a aVar) {
        String c2;
        StringBuilder sb2 = mVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f308a;
        if (p10 != -1) {
            c2 = a.c(cArr, strArr, aVar.f311e, p10);
            aVar.f311e += p10;
        } else {
            aVar.b();
            int i3 = aVar.f311e;
            c2 = a.c(cArr, strArr, i3, aVar.f310c - i3);
            aVar.f311e = aVar.f310c;
        }
        sb2.append(c2);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? lVar = new l(5, 0);
        lVar.f353c = sb3;
        mVar.g(lVar);
        mVar.f370c = c2.f317a;
    }
}
