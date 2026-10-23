package hi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m61;
import r0.h1;
import r0.k1;
public final class u implements Utilities.Callback5, r0.n, Utilities.Callback5Return {
    public final int f12268a;
    public final k0 f12269b;

    public u(k0 k0Var, int i10) {
        this.f12268a = i10;
        this.f12269b = k0Var;
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        h1 h1Var = k1Var.f45251a;
        i0.b f7 = h1Var.f(527);
        k0 k0Var = this.f12269b;
        k0Var.T = f7;
        k0Var.U = h1Var.f(519);
        k0Var.F.j(AndroidUtilities.dp(56.0f) + k0Var.T.f12316b, k0Var.T.d, false);
        k0Var.H.invalidate();
        return k1.f45250b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean canRemoveBotFromCommunity;
        long j10;
        boolean z10;
        boolean z11;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = k0.V;
        Object obj6 = ((m61) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        k0 k0Var = this.f12269b;
        boolean z13 = false;
        if (z12) {
            TLRPC.Chat chat = (TLRPC.Chat) obj6;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, k0Var.f12201f);
            j10 = -chat.f20343id;
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.f20490id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, k0Var.f12201f);
                j10 = j11;
                z10 = isBot;
                z11 = false;
            }
            return Boolean.valueOf(z13);
        }
        if (canRemoveBotFromCommunity) {
            j80 F = j80.F(k0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new l(k0Var, z10, z11, j10, 1), true);
            F.W(k0Var.v.d.W0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f12268a;
        k0 k0Var = this.f12269b;
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                k0Var.g0(m61Var);
                return;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = k0.V;
                k0Var.d0(m61Var);
                return;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = k0.V;
                k0Var.g0(m61Var);
                return;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                k0.C(k0Var, m61Var, view);
                return;
        }
    }
}
