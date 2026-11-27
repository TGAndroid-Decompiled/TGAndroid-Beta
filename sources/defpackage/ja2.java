package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ja2 extends nw5 {
    public final TLRPC.Chat x;
    public final ka2 y;

    public ja2(ka2 ka2Var, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = ka2Var;
        this.x = chat2;
    }

    @Override
    public final boolean a(boolean z, lw5 lw5Var) {
        na2 na2Var = this.y.d;
        if (na2Var.Q) {
            return false;
        }
        na2Var.Q = true;
        e(new ea2(this, lw5Var, (byte) 3), new lg(this, this.x, z, (Runnable) lw5Var, (byte) 11));
        return true;
    }

    @Override
    public final boolean b(boolean z, mw5 mw5Var) {
        na2 na2Var = this.y.d;
        if (na2Var.P) {
            return false;
        }
        na2Var.P = true;
        e(new ea2(this, mw5Var, (byte) 3), new lg(this, this.x, z, (Runnable) mw5Var, (byte) 10));
        return true;
    }

    public final void e(ea2 ea2Var, Runnable runnable) {
        na2 na2Var = this.y.d;
        if (!xc2.T(na2Var.f)) {
            na2Var.getMessagesController().R(na2Var.getParentActivity(), this.x.id, na2Var, new q72(this, runnable, (byte) 4), ea2Var);
        } else {
            runnable.run();
        }
    }
}
