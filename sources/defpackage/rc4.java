package defpackage;

import org.telegram.tgnet.tl.TL_chatlists;
public final class rc4 implements p8c {
    public final byte a;
    public final pd4 b;

    public rc4(pd4 pd4Var, byte b) {
        this.a = b;
        this.b = pd4Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        pd4 pd4Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                pd4Var.finishFragment();
                return;
            case 1:
            case 3:
                pd4Var.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            case 2:
            default:
                pd4Var.q0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
