package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.uo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class i0 extends x31 {
    static {
        x31.h(new x31());
    }

    public static y31 i(uo uoVar, p2 p2Var) {
        long j3;
        TLRPC.User user = uoVar.f25882c;
        if (user != null) {
            y31 K = y31.K(i0.class);
            long j10 = user.f27105id;
            K.B = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.G = user;
            K.H = p2Var;
            return K;
        }
        TLRPC.Chat chat = uoVar.f25881b;
        y31 K2 = y31.K(i0.class);
        if (chat != null) {
            j3 = -chat.f26956id;
        } else {
            j3 = 0;
        }
        K2.B = j3;
        K2.d = (int) (j3 ^ (j3 >>> 32));
        K2.G = chat;
        K2.H = p2Var;
        return K2;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        t2 t2Var = (t2) view;
        t2Var.setDialogCellDelegate((p2) y31Var.H);
        Object obj = y31Var.G;
        boolean z10 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            t2Var.Q0 = t3.e0(p10.f24470s0, chat);
            TLRPC.Dialog S0 = qp.s1(p10.f24470s0).S0(-chat.f26956id);
            if (S0 != null) {
                z10 = false;
            }
            t2Var.P0 = z10;
            if (S0 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(S0, 0, 0);
                return;
            }
            t2Var.setCustomMessageWithoutRebuild(id.G(chat.participants_count, "Members", new Object[0]));
            t2Var.d0(-chat.f26956id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            t2Var.Q0 = t3.f0(p10.f24470s0, user);
            TLRPC.Dialog S02 = qp.s1(p10.f24470s0).S0(user.f27105id);
            if (S02 != null) {
                z10 = false;
            }
            t2Var.P0 = z10;
            if (S02 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(S02, 0, 0);
                return;
            }
            t2Var.setCustomMessageWithoutRebuild(id.M0(2131753156, null));
            t2Var.d0(user.f27105id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        t2 t2Var = new t2(null, context, false, i7, g6Var);
        t2Var.O0 = true;
        return t2Var;
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            return true;
        }
        return false;
    }
}
