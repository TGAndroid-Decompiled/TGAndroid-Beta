package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.qo;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class h0 extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(qo qoVar, q2 q2Var) {
        long j3;
        TLRPC.User user = qoVar.f26431c;
        if (user != null) {
            l41 K = l41.K(h0.class);
            long j10 = user.f28552id;
            K.C = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.H = user;
            K.I = q2Var;
            return K;
        }
        TLRPC.Chat chat = qoVar.f26430b;
        l41 K2 = l41.K(h0.class);
        if (chat != null) {
            j3 = -chat.f28403id;
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
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        u2 u2Var = (u2) view;
        u2Var.setDialogCellDelegate((q2) l41Var.I);
        Object obj = l41Var.H;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            u2Var.R0 = v3.e0(j10.f24770t0, chat);
            TLRPC.Dialog U0 = mp.u1(j10.f24770t0).U0(-chat.f28403id);
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
            u2Var.d0(-chat.f28403id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            u2Var.R0 = v3.f0(j10.f24770t0, user);
            TLRPC.Dialog U02 = mp.u1(j10.f24770t0).U0(user.f28552id);
            if (U02 != null) {
                z11 = false;
            }
            u2Var.Q0 = z11;
            if (U02 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.e0(U02, 0, 0);
                return;
            }
            u2Var.setCustomMessageWithoutRebuild(gd.M0(2131753154, null));
            u2Var.d0(user.f28552id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        u2 u2Var = new u2(null, context, false, i7, i6Var);
        u2Var.P0 = true;
        return u2Var;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }
}
