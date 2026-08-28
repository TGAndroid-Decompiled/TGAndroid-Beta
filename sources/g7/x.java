package g7;
public abstract class x {
    public static void a(ie.s sVar, ie.s sVar2, int i9) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i9);
            sb2.append(sVar.f11127g);
            ie.p pVar = (ie.p) sVar2.f11125f;
            for (ie.p pVar2 = (ie.p) sVar.f11125f; pVar2 != pVar; pVar2 = (ie.p) pVar2.f11125f) {
                sb2.append(((ie.s) pVar2).f11127g);
                pVar2.g();
            }
            sVar.f11127g = sb2.toString();
        }
    }

    public static void b(ie.p pVar, ie.p pVar2) {
        ie.s sVar = null;
        ie.s sVar2 = null;
        int i9 = 0;
        while (pVar != null) {
            if (pVar instanceof ie.s) {
                sVar2 = (ie.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i9 = sVar2.f11127g.length() + i9;
            } else {
                a(sVar, sVar2, i9);
                sVar = null;
                sVar2 = null;
                i9 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (ie.p) pVar.f11125f;
        }
        a(sVar, sVar2, i9);
    }
}
