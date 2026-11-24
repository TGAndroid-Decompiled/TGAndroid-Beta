package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class w52 implements p8c {
    public final byte a;
    public final p8c b;

    public w52(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(new qd8((String) obj));
                return;
            case 1:
                mqc mqcVar = (mqc) obj;
                if (mqcVar != null) {
                    p8cVar.a(mqcVar);
                    return;
                }
                return;
            case 2:
                String str = (String) obj;
                w25.m("disconnect session", str);
                p8cVar.a(str);
                return;
            case 3:
                int[] iArr = (int[]) obj;
                boolean z = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z = true;
                }
                p8cVar.a(Boolean.valueOf(z));
                return;
            case 4:
                p8cVar.a((TL_stars.StarGift) obj);
                return;
            default:
                p8cVar.a((Boolean) obj);
                return;
        }
    }
}
