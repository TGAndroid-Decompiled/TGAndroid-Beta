package i7;
public abstract class a6 {
    public static void a(le.s sVar, le.s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f15210g);
            le.p pVar = (le.p) sVar2.f15208f;
            for (le.p pVar2 = (le.p) sVar.f15208f; pVar2 != pVar; pVar2 = (le.p) pVar2.f15208f) {
                sb2.append(((le.s) pVar2).f15210g);
                pVar2.g();
            }
            sVar.f15210g = sb2.toString();
        }
    }

    public static void b(le.p pVar, le.p pVar2) {
        le.s sVar = null;
        le.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof le.s) {
                sVar2 = (le.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f15210g.length() + i10;
            } else {
                a(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (le.p) pVar.f15208f;
        }
        a(sVar, sVar2, i10);
    }
}
