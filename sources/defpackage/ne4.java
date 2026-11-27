package defpackage;

import org.telegram.tgnet.tl.TL_chatlists;
public final class ne4 implements pcc {
    public final byte a;
    public final nf4 b;

    public ne4(nf4 nf4Var, byte b) {
        this.a = b;
        this.b = nf4Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        nf4 nf4Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                nf4Var.finishFragment();
                return;
            case 1:
            case 3:
                nf4Var.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            case 2:
            default:
                nf4Var.q0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
