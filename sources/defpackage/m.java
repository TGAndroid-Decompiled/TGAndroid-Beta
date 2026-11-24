package defpackage;

import org.telegram.tgnet.tl.TL_aicompose;
public final class m implements p8c {
    public final byte a;
    public final a1 b;
    public final z0 c;

    public m(a1 a1Var, z0 z0Var, byte b) {
        this.a = b;
        this.b = a1Var;
        this.c = z0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        z0 z0Var = this.c;
        a1 a1Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                if (a1Var.p2 != null) {
                    z0Var.c(0, true);
                    a1Var.p1(null);
                    return;
                }
                return;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                if (a1Var.p2 != aiComposeTone) {
                    z0Var.d(aiComposeTone, true);
                    a1Var.p1(aiComposeTone);
                    return;
                }
                return;
        }
    }
}
