package h7;

public abstract class z {
    public static void a(je.s sVar, je.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.f12929g);
        je.p pVar = (je.p) sVar.f12927f;
        je.p pVar2 = (je.p) sVar2.f12927f;
        while (pVar != pVar2) {
            sb2.append(((je.s) pVar).f12929g);
            je.p pVar3 = (je.p) pVar.f12927f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.f12929g = sb2.toString();
    }

    public static void b(je.p pVar, je.p pVar2) {
        je.s sVar = null;
        je.s sVar2 = null;
        int length = 0;
        while (pVar != null) {
            if (pVar instanceof je.s) {
                sVar2 = (je.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                length = sVar2.f12929g.length() + length;
            } else {
                a(sVar, sVar2, length);
                sVar = null;
                sVar2 = null;
                length = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (je.p) pVar.f12927f;
            }
        }
        a(sVar, sVar2, length);
    }
}
