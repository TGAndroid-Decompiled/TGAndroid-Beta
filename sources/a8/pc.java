package a8;
public abstract class pc {
    public static void a(ef.s sVar, ef.s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f9940g);
            ef.p pVar = (ef.p) sVar2.f9938f;
            for (ef.p pVar2 = (ef.p) sVar.f9938f; pVar2 != pVar; pVar2 = (ef.p) pVar2.f9938f) {
                sb2.append(((ef.s) pVar2).f9940g);
                pVar2.g();
            }
            sVar.f9940g = sb2.toString();
        }
    }

    public static void b(ef.p pVar, ef.p pVar2) {
        ef.s sVar = null;
        ef.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof ef.s) {
                sVar2 = (ef.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f9940g.length() + i10;
            } else {
                a(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (ef.p) pVar.f9938f;
        }
        a(sVar, sVar2, i10);
    }
}
