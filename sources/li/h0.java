package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ro;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class h0 extends a41 {
    static {
        a41.h(new a41());
    }

    public static b41 i(ro roVar, p2 p2Var) {
        long j3;
        TLRPC.User user = roVar.f26321c;
        if (user != null) {
            b41 K = b41.K(h0.class);
            long j10 = user.f28200id;
            K.B = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.G = user;
            K.H = p2Var;
            return K;
        }
        TLRPC.Chat chat = roVar.f26320b;
        b41 K2 = b41.K(h0.class);
        if (chat != null) {
            j3 = -chat.f28051id;
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
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        t2 t2Var = (t2) view;
        t2Var.setDialogCellDelegate((p2) b41Var.H);
        Object obj = b41Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            t2Var.R0 = t3.e0(m10.f24934t0, chat);
            TLRPC.Dialog S0 = np.s1(m10.f24934t0).S0(-chat.f28051id);
            if (S0 != null) {
                z11 = false;
            }
            t2Var.Q0 = z11;
            if (S0 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.g0(S0, 0, 0);
                return;
            }
            t2Var.setCustomMessageWithoutRebuild(hd.G(chat.participants_count, "Members", new Object[0]));
            t2Var.f0(-chat.f28051id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            t2Var.R0 = t3.f0(m10.f24934t0, user);
            TLRPC.Dialog S02 = np.s1(m10.f24934t0).S0(user.f28200id);
            if (S02 != null) {
                z11 = false;
            }
            t2Var.Q0 = z11;
            if (S02 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.g0(S02, 0, 0);
                return;
            }
            t2Var.setCustomMessageWithoutRebuild(hd.M0(2131753156, null));
            t2Var.f0(user.f28200id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        t2 t2Var = new t2(null, context, false, i7, e6Var);
        t2Var.P0 = true;
        return t2Var;
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d) {
            return true;
        }
        return false;
    }
}
