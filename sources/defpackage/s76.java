package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s76 implements RequestDelegate {
    public final byte a;
    public final t76 b;

    public s76(t76 t76Var, byte b) {
        this.a = b;
        this.b = t76Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        t76 t76Var = this.b;
        switch (b) {
            case 0:
                int i = t76Var.e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7.q1(i).a4(updates.users, false);
                    na7.q1(i).U3(updates.chats, false);
                    na7.q1(i).Q3(updates, false);
                    return;
                } else if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                    gl.d3(new r76(t76Var, (byte) 2));
                    return;
                } else {
                    return;
                }
            case 1:
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(t76Var.e).Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(t76Var.e).Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                gl.d3(new sx5((byte) 10, t76Var, tL_error, tLObject));
                return;
        }
    }
}
