package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class m62 implements pcc {
    public final byte a;
    public final pcc b;

    public m62(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(new eh8((String) obj));
                return;
            case 1:
                avc avcVar = (avc) obj;
                if (avcVar != null) {
                    pccVar.a(avcVar);
                    return;
                }
                return;
            case 2:
                String str = (String) obj;
                a55.m("disconnect session", str);
                pccVar.a(str);
                return;
            case 3:
                int[] iArr = (int[]) obj;
                boolean z = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z = true;
                }
                pccVar.a(Boolean.valueOf(z));
                return;
            case 4:
                pccVar.a((TL_stars.StarGift) obj);
                return;
            default:
                pccVar.a((Boolean) obj);
                return;
        }
    }
}
