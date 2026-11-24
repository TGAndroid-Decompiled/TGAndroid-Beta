package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class tp2 extends b6c {
    static {
        b6c.h(new b6c());
    }

    public static c6c i(tb7 tb7Var, dg3 dg3Var) {
        long j;
        TLRPC.User user = tb7Var.c;
        if (user != null) {
            c6c K = c6c.K(tp2.class);
            long j2 = user.id;
            K.C = j2;
            K.d = (int) (j2 ^ (j2 >>> 32));
            K.H = user;
            K.I = dg3Var;
            return K;
        }
        TLRPC.Chat chat = tb7Var.b;
        c6c K2 = c6c.K(tp2.class);
        if (chat != null) {
            j = -chat.id;
        } else {
            j = 0;
        }
        K2.C = j;
        K2.d = (int) (j ^ (j >>> 32));
        K2.H = chat;
        K2.I = dg3Var;
        return K2;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        hg3 hg3Var = (hg3) view;
        hg3Var.setDialogCellDelegate((dg3) c6cVar.I);
        Object obj = c6cVar.H;
        boolean z2 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            hg3Var.R0 = sd2.e0(z8c.t0, chat);
            TLRPC.Dialog R0 = oc7.r1(z8c.t0).R0(-chat.id);
            if (R0 != null) {
                z2 = false;
            }
            hg3Var.Q0 = z2;
            if (R0 != null) {
                hg3Var.setCustomMessageWithoutRebuild(null);
                hg3Var.f0(R0, 0, 0);
                return;
            }
            hg3Var.setCustomMessageWithoutRebuild(jb6.G(chat.participants_count, "Members", new Object[0]));
            hg3Var.e0(-chat.id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            hg3Var.R0 = sd2.f0(z8c.t0, user);
            TLRPC.Dialog R02 = oc7.r1(z8c.t0).R0(user.id);
            if (R02 != null) {
                z2 = false;
            }
            hg3Var.Q0 = z2;
            if (R02 != null) {
                hg3Var.setCustomMessageWithoutRebuild(null);
                hg3Var.f0(R02, 0, 0);
                return;
            }
            hg3Var.setCustomMessageWithoutRebuild(jb6.M0(2131753121, null));
            hg3Var.e0(user.id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.d == c6cVar2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        hg3 hg3Var = new hg3(null, context, false, i, ylbVar);
        hg3Var.P0 = true;
        return hg3Var;
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.d == c6cVar2.d) {
            return true;
        }
        return false;
    }
}
