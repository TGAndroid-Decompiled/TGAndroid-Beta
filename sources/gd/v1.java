package gd;
public enum v1 extends a2 {
    public v1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String c10;
        StringBuilder sb2 = kVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f12406a;
        if (p10 != -1) {
            c10 = a.c(cArr, strArr, aVar.e, p10);
            aVar.e += p10;
        } else {
            aVar.b();
            int i10 = aVar.e;
            c10 = a.c(cArr, strArr, i10, aVar.f12408c - i10);
            aVar.e = aVar.f12408c;
        }
        sb2.append(c10);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? fVar = new f2.f(5, 1);
        fVar.f12446c = sb3;
        kVar.g(fVar);
        kVar.f12459c = a2.f12411a;
    }
}
