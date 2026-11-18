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
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class h0 extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(qo qoVar, p2 p2Var) {
        long j3;
        TLRPC.User user = qoVar.f26433c;
        if (user != null) {
            l41 K = l41.K(h0.class);
            long j10 = user.f28554id;
            K.C = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.H = user;
            K.I = p2Var;
            return K;
        }
        TLRPC.Chat chat = qoVar.f26432b;
        l41 K2 = l41.K(h0.class);
        if (chat != null) {
            j3 = -chat.f28405id;
        } else {
            j3 = 0;
        }
        K2.C = j3;
        K2.d = (int) (j3 ^ (j3 >>> 32));
        K2.H = chat;
        K2.I = p2Var;
        return K2;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        t2 t2Var = (t2) view;
        t2Var.setDialogCellDelegate((p2) l41Var.I);
        Object obj = l41Var.H;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            t2Var.R0 = v3.e0(j10.f24773t0, chat);
            TLRPC.Dialog U0 = mp.u1(j10.f24773t0).U0(-chat.f28405id);
            if (U0 != null) {
                z11 = false;
            }
            t2Var.Q0 = z11;
            if (U0 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(U0, 0, 0);
                return;
            }
            t2Var.setCustomMessageWithoutRebuild(gd.G(chat.participants_count, "Members", new Object[0]));
            t2Var.d0(-chat.f28405id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            t2Var.R0 = v3.f0(j10.f24773t0, user);
            TLRPC.Dialog U02 = mp.u1(j10.f24773t0).U0(user.f28554id);
            if (U02 != null) {
                z11 = false;
            }
            t2Var.Q0 = z11;
            if (U02 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(U02, 0, 0);
                return;
            }
            t2Var.setCustomMessageWithoutRebuild(gd.M0(2131753154, null));
            t2Var.d0(user.f28554id, null, 0, false, false);
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
        t2 t2Var = new t2(null, context, false, i7, i6Var);
        t2Var.P0 = true;
        return t2Var;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }
}
