package defpackage;

import org.telegram.tgnet.tl.TL_chatlists;
public final class re4 implements qac {
    public final byte a;
    public final qf4 b;

    public re4(qf4 qf4Var, byte b) {
        this.a = b;
        this.b = qf4Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        qf4 qf4Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                qf4Var.finishFragment();
                return;
            case 1:
            case 3:
                qf4Var.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            case 2:
            default:
                qf4Var.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
