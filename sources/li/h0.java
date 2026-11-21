package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.qo;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class h0 extends n41 {
    static {
        n41.h(new n41());
    }

    public static o41 i(qo qoVar, q2 q2Var) {
        long j3;
        TLRPC.User user = qoVar.f26459c;
        if (user != null) {
            o41 K = o41.K(h0.class);
            long j10 = user.f28580id;
            K.C = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.H = user;
            K.I = q2Var;
            return K;
        }
        TLRPC.Chat chat = qoVar.f26458b;
        o41 K2 = o41.K(h0.class);
        if (chat != null) {
            j3 = -chat.f28431id;
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
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        u2 u2Var = (u2) view;
        u2Var.setDialogCellDelegate((q2) o41Var.I);
        Object obj = o41Var.H;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            u2Var.R0 = v3.e0(j10.f24798t0, chat);
            TLRPC.Dialog U0 = mp.u1(j10.f24798t0).U0(-chat.f28431id);
            if (U0 != null) {
                z11 = false;
            }
            u2Var.Q0 = z11;
            if (U0 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.e0(U0, 0, 0);
                return;
            }
            u2Var.setCustomMessageWithoutRebuild(gd.G(chat.participants_count, "Members", new Object[0]));
            u2Var.d0(-chat.f28431id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            u2Var.R0 = v3.f0(j10.f24798t0, user);
            TLRPC.Dialog U02 = mp.u1(j10.f24798t0).U0(user.f28580id);
            if (U02 != null) {
                z11 = false;
            }
            u2Var.Q0 = z11;
            if (U02 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.e0(U02, 0, 0);
                return;
            }
            u2Var.setCustomMessageWithoutRebuild(gd.N0(2131753153, null));
            u2Var.d0(user.f28580id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        u2 u2Var = new u2(null, context, false, i7, h6Var);
        u2Var.P0 = true;
        return u2Var;
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d) {
            return true;
        }
        return false;
    }
}
