package b8;
public abstract class s1 {
    public static void a(gf.s sVar, gf.s sVar2, int i3) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i3);
            sb2.append(sVar.f12271g);
            gf.p pVar = (gf.p) sVar2.f12269f;
            for (gf.p pVar2 = (gf.p) sVar.f12269f; pVar2 != pVar; pVar2 = (gf.p) pVar2.f12269f) {
                sb2.append(((gf.s) pVar2).f12271g);
                pVar2.g();
            }
            sVar.f12271g = sb2.toString();
        }
    }

    public static void b(gf.p pVar, gf.p pVar2) {
        gf.s sVar = null;
        gf.s sVar2 = null;
        int i3 = 0;
        while (pVar != null) {
            if (pVar instanceof gf.s) {
                sVar2 = (gf.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i3 = sVar2.f12271g.length() + i3;
            } else {
                a(sVar, sVar2, i3);
                sVar = null;
                sVar2 = null;
                i3 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (gf.p) pVar.f12269f;
        }
        a(sVar, sVar2, i3);
    }
}
