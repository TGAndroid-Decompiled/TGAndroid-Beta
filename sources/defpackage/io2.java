package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class io2 extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(s97 s97Var, qe3 qe3Var) {
        long j;
        TLRPC.User user = s97Var.c;
        if (user != null) {
            c4c K = c4c.K(io2.class);
            long j2 = user.id;
            K.C = j2;
            K.d = (int) (j2 ^ (j2 >>> 32));
            K.H = user;
            K.I = qe3Var;
            return K;
        }
        TLRPC.Chat chat = s97Var.b;
        c4c K2 = c4c.K(io2.class);
        if (chat != null) {
            j = -chat.id;
        } else {
            j = 0;
        }
        K2.C = j;
        K2.d = (int) (j ^ (j >>> 32));
        K2.H = chat;
        K2.I = qe3Var;
        return K2;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ue3 ue3Var = (ue3) view;
        ue3Var.setDialogCellDelegate((qe3) c4cVar.I);
        Object obj = c4cVar.H;
        boolean z2 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            ue3Var.R0 = hc2.e0(y6c.t0, chat);
            TLRPC.Dialog Q0 = na7.q1(y6c.t0).Q0(-chat.id);
            if (Q0 != null) {
                z2 = false;
            }
            ue3Var.Q0 = z2;
            if (Q0 != null) {
                ue3Var.setCustomMessageWithoutRebuild(null);
                ue3Var.g0(Q0, 0, 0);
                return;
            }
            ue3Var.setCustomMessageWithoutRebuild(k96.G(chat.participants_count, "Members", new Object[0]));
            ue3Var.f0(-chat.id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            ue3Var.R0 = hc2.f0(y6c.t0, user);
            TLRPC.Dialog Q02 = na7.q1(y6c.t0).Q0(user.id);
            if (Q02 != null) {
                z2 = false;
            }
            ue3Var.Q0 = z2;
            if (Q02 != null) {
                ue3Var.setCustomMessageWithoutRebuild(null);
                ue3Var.g0(Q02, 0, 0);
                return;
            }
            ue3Var.setCustomMessageWithoutRebuild(k96.M0(2131753153, null));
            ue3Var.f0(user.id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.d == c4cVar2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        ue3 ue3Var = new ue3(null, context, false, i, wjbVar);
        ue3Var.P0 = true;
        return ue3Var;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.d == c4cVar2.d) {
            return true;
        }
        return false;
    }
}
