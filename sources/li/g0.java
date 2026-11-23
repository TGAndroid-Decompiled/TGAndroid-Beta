package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.qo;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class g0 extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(qo qoVar, q2 q2Var) {
        long j3;
        TLRPC.User user = qoVar.f26543c;
        if (user != null) {
            n41 K = n41.K(g0.class);
            long j10 = user.f28641id;
            K.C = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.H = user;
            K.I = q2Var;
            return K;
        }
        TLRPC.Chat chat = qoVar.f26542b;
        n41 K2 = n41.K(g0.class);
        if (chat != null) {
            j3 = -chat.f28492id;
        } else {
            j3 = 0;
        }
        K2.C = j3;
        K2.d = (int) (j3 ^ (j3 >>> 32));
        K2.H = chat;
        K2.I = q2Var;
        return K2;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        u2 u2Var = (u2) view;
        u2Var.setDialogCellDelegate((q2) n41Var.I);
        Object obj = n41Var.H;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            u2Var.R0 = v3.e0(i10.f24637t0, chat);
            TLRPC.Dialog U0 = mp.u1(i10.f24637t0).U0(-chat.f28492id);
            if (U0 != null) {
                z11 = false;
            }
            u2Var.Q0 = z11;
            if (U0 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.g0(U0, 0, 0);
                return;
            }
            u2Var.setCustomMessageWithoutRebuild(gd.G(chat.participants_count, "Members", new Object[0]));
            u2Var.f0(-chat.f28492id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            u2Var.R0 = v3.f0(i10.f24637t0, user);
            TLRPC.Dialog U02 = mp.u1(i10.f24637t0).U0(user.f28641id);
            if (U02 != null) {
                z11 = false;
            }
            u2Var.Q0 = z11;
            if (U02 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.g0(U02, 0, 0);
                return;
            }
            u2Var.setCustomMessageWithoutRebuild(gd.N0(2131753153, null));
            u2Var.f0(user.f28641id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        u2 u2Var = new u2(null, context, false, i7, i6Var);
        u2Var.P0 = true;
        return u2Var;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d) {
            return true;
        }
        return false;
    }
}
