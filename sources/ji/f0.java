package ji;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.lo;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class f0 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(lo loVar, p2 p2Var) {
        long j10;
        TLRPC.User user = loVar.f24093c;
        if (user != null) {
            r31 K = r31.K(f0.class);
            long j11 = user.f27150id;
            K.B = j11;
            K.d = (int) (j11 ^ (j11 >>> 32));
            K.G = user;
            K.H = p2Var;
            return K;
        }
        TLRPC.Chat chat = loVar.f24092b;
        r31 K2 = r31.K(f0.class);
        if (chat != null) {
            j10 = -chat.f27001id;
        } else {
            j10 = 0;
        }
        K2.B = j10;
        K2.d = (int) (j10 ^ (j10 >>> 32));
        K2.G = chat;
        K2.H = p2Var;
        return K2;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        t2 t2Var = (t2) view;
        t2Var.setDialogCellDelegate((p2) r31Var.H);
        Object obj = r31Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            t2Var.R0 = t3.e0(h10.f22829t0, chat);
            TLRPC.Dialog S0 = hp.s1(h10.f22829t0).S0(-chat.f27001id);
            if (S0 != null) {
                z11 = false;
            }
            t2Var.Q0 = z11;
            if (S0 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(S0, 0, 0);
                return;
            }
            t2Var.setCustomMessageWithoutRebuild(bd.G(chat.participants_count, "Members", new Object[0]));
            t2Var.d0(-chat.f27001id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            t2Var.R0 = t3.f0(h10.f22829t0, user);
            TLRPC.Dialog S02 = hp.s1(h10.f22829t0).S0(user.f27150id);
            if (S02 != null) {
                z11 = false;
            }
            t2Var.Q0 = z11;
            if (S02 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(S02, 0, 0);
                return;
            }
            t2Var.setCustomMessageWithoutRebuild(bd.M0(2131753156, null));
            t2Var.d0(user.f27150id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        t2 t2Var = new t2(null, context, false, i3, e6Var);
        t2Var.P0 = true;
        return t2Var;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }
}
