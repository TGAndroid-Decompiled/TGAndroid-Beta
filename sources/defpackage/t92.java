package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class t92 extends ju5 {
    public final TLRPC.Chat x;
    public final u92 y;

    public t92(u92 u92Var, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = u92Var;
        this.x = chat2;
    }

    @Override
    public final boolean a(boolean z, hu5 hu5Var) {
        x92 x92Var = this.y.d;
        if (x92Var.Q) {
            return false;
        }
        x92Var.Q = true;
        e(new n92(this, hu5Var, (byte) 4), new qg(this, this.x, z, (Runnable) hu5Var, (byte) 11));
        return true;
    }

    @Override
    public final boolean b(boolean z, iu5 iu5Var) {
        x92 x92Var = this.y.d;
        if (x92Var.P) {
            return false;
        }
        x92Var.P = true;
        e(new n92(this, iu5Var, (byte) 4), new qg(this, this.x, z, (Runnable) iu5Var, (byte) 10));
        return true;
    }

    public final void e(n92 n92Var, Runnable runnable) {
        x92 x92Var = this.y.d;
        if (!hc2.T(x92Var.f)) {
            x92Var.getMessagesController().P(x92Var.getParentActivity(), this.x.id, x92Var, new v82(this, runnable, (byte) 2), n92Var);
        } else {
            runnable.run();
        }
    }
}
