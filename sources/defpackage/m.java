package defpackage;

import org.telegram.tgnet.tl.TL_aicompose;
public final class m implements pcc {
    public final byte a;
    public final b1 b;
    public final a1 c;

    public m(b1 b1Var, a1 a1Var, byte b) {
        this.a = b;
        this.b = b1Var;
        this.c = a1Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        a1 a1Var = this.c;
        b1 b1Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                if (b1Var.p2 != null) {
                    a1Var.c(0, true);
                    b1Var.r1(null);
                    return;
                }
                return;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                if (b1Var.p2 != aiComposeTone) {
                    a1Var.d(aiComposeTone, true);
                    b1Var.r1(aiComposeTone);
                    return;
                }
                return;
        }
    }
}
