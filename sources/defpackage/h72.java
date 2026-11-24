package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class h72 implements qac {
    public final byte a;
    public final qac b;

    public h72(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(new sf8((String) obj));
                return;
            case 1:
                osc oscVar = (osc) obj;
                if (oscVar != null) {
                    qacVar.a(oscVar);
                    return;
                }
                return;
            case 2:
                String str = (String) obj;
                w45.m("disconnect session", str);
                qacVar.a(str);
                return;
            case 3:
                int[] iArr = (int[]) obj;
                boolean z = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z = true;
                }
                qacVar.a(Boolean.valueOf(z));
                return;
            case 4:
                qacVar.a((TL_stars.StarGift) obj);
                return;
            default:
                qacVar.a((Boolean) obj);
                return;
        }
    }
}
