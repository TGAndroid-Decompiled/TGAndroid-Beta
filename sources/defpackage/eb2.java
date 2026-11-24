package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class eb2 extends iw5 {
    public final TLRPC.Chat x;
    public final fb2 y;

    public eb2(fb2 fb2Var, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = fb2Var;
        this.x = chat2;
    }

    @Override
    public final boolean a(boolean z, gw5 gw5Var) {
        ib2 ib2Var = this.y.d;
        if (ib2Var.Q) {
            return false;
        }
        ib2Var.Q = true;
        e(new ra2(this, gw5Var, (byte) 5), new rh(this, this.x, z, (Runnable) gw5Var, (byte) 11));
        return true;
    }

    @Override
    public final boolean b(boolean z, hw5 hw5Var) {
        ib2 ib2Var = this.y.d;
        if (ib2Var.P) {
            return false;
        }
        ib2Var.P = true;
        e(new ra2(this, hw5Var, (byte) 5), new rh(this, this.x, z, (Runnable) hw5Var, (byte) 10));
        return true;
    }

    public final void e(ra2 ra2Var, Runnable runnable) {
        ib2 ib2Var = this.y.d;
        if (!sd2.T(ib2Var.f)) {
            ib2Var.getMessagesController().P(ib2Var.getParentActivity(), this.x.id, ib2Var, new x92(this, runnable, (byte) 3), ra2Var);
        } else {
            runnable.run();
        }
    }
}
