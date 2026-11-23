package a8;
public abstract class aa {
    public static void a(kf.s sVar, kf.s sVar2, int i7) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i7);
            sb2.append(sVar.f18271g);
            kf.p pVar = (kf.p) sVar2.f18269f;
            for (kf.p pVar2 = (kf.p) sVar.f18269f; pVar2 != pVar; pVar2 = (kf.p) pVar2.f18269f) {
                sb2.append(((kf.s) pVar2).f18271g);
                pVar2.g();
            }
            sVar.f18271g = sb2.toString();
        }
    }

    public static void b(kf.p pVar, kf.p pVar2) {
        kf.s sVar = null;
        kf.s sVar2 = null;
        int i7 = 0;
        while (pVar != null) {
            if (pVar instanceof kf.s) {
                sVar2 = (kf.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i7 = sVar2.f18271g.length() + i7;
            } else {
                a(sVar, sVar2, i7);
                sVar = null;
                sVar2 = null;
                i7 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (kf.p) pVar.f18269f;
        }
        a(sVar, sVar2, i7);
    }
}
