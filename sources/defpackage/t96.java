package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t96 implements RequestDelegate {
    public final byte a;
    public final w96 b;

    public t96(w96 w96Var, byte b) {
        this.a = b;
        this.b = w96Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        w96 w96Var = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.Updates) {
                    uc7.s1(w96Var.e).Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                hl.c3(new ls5(w96Var, tLObject, tL_error, (byte) 15));
                return;
            case 2:
                int i = w96Var.e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7.s1(i).j4(updates.users, false);
                    uc7.s1(i).c4(updates.chats, false);
                    uc7.s1(i).Y3(updates, false);
                    return;
                } else if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                    hl.c3(new u96(w96Var, (byte) 7));
                    return;
                } else {
                    return;
                }
            default:
                if (tLObject instanceof TLRPC.Updates) {
                    uc7.s1(w96Var.e).Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
        }
    }
}
