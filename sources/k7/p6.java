package k7;
public abstract class p6 {
    public static void a(ne.s sVar, ne.s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb = new StringBuilder(i10);
            sb.append(sVar.f15981g);
            ne.p pVar = (ne.p) sVar2.f15979f;
            for (ne.p pVar2 = (ne.p) sVar.f15979f; pVar2 != pVar; pVar2 = (ne.p) pVar2.f15979f) {
                sb.append(((ne.s) pVar2).f15981g);
                pVar2.g();
            }
            sVar.f15981g = sb.toString();
        }
    }

    public static void b(ne.p pVar, ne.p pVar2) {
        ne.s sVar = null;
        ne.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof ne.s) {
                sVar2 = (ne.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f15981g.length() + i10;
            } else {
                a(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (ne.p) pVar.f15979f;
        }
        a(sVar, sVar2, i10);
    }
}
