package a8;
public abstract class z9 {
    public static void a(kf.s sVar, kf.s sVar2, int i7) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i7);
            sb2.append(sVar.f17845g);
            kf.p pVar = (kf.p) sVar2.f17843f;
            for (kf.p pVar2 = (kf.p) sVar.f17843f; pVar2 != pVar; pVar2 = (kf.p) pVar2.f17843f) {
                sb2.append(((kf.s) pVar2).f17845g);
                pVar2.g();
            }
            sVar.f17845g = sb2.toString();
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
                i7 = sVar2.f17845g.length() + i7;
            } else {
                a(sVar, sVar2, i7);
                sVar = null;
                sVar2 = null;
                i7 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (kf.p) pVar.f17843f;
        }
        a(sVar, sVar2, i7);
    }
}
