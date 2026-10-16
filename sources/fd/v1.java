package fd;
public enum v1 extends a2 {
    public v1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String c10;
        StringBuilder sb2 = kVar.h;
        int p5 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f9074a;
        if (p5 != -1) {
            c10 = a.c(cArr, strArr, aVar.e, p5);
            aVar.e += p5;
        } else {
            aVar.b();
            int i10 = aVar.e;
            c10 = a.c(cArr, strArr, i10, aVar.f9076c - i10);
            aVar.e = aVar.f9076c;
        }
        sb2.append(c10);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb3 = sb2.toString();
        ?? eVar = new f2.e(5, 1);
        eVar.f9114c = sb3;
        kVar.g(eVar);
        kVar.f9127c = a2.f9079a;
    }
}
