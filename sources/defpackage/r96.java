package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r96 implements RequestDelegate {
    public final byte a;
    public final s96 b;

    public r96(s96 s96Var, byte b) {
        this.a = b;
        this.b = s96Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        s96 s96Var = this.b;
        switch (b) {
            case 0:
                int i = s96Var.e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    oc7.r1(i).d4(updates.users, false);
                    oc7.r1(i).X3(updates.chats, false);
                    oc7.r1(i).T3(updates, false);
                    return;
                } else if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                    gm.c3(new q96(s96Var, (byte) 2));
                    return;
                } else {
                    return;
                }
            case 1:
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(s96Var.e).T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(s96Var.e).T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                gm.c3(new dt5(s96Var, tLObject, tL_error, (byte) 12));
                return;
        }
    }
}
