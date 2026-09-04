package gi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;
import r0.i1;
import r0.l1;
public final class u implements Utilities.Callback5, r0.n, Utilities.Callback5Return {
    public final int f10785a;
    public final k0 f10786b;

    public u(k0 k0Var, int i10) {
        this.f10785a = i10;
        this.f10786b = k0Var;
    }

    @Override
    public l1 T0(View view, l1 l1Var) {
        i1 i1Var = l1Var.f44711a;
        i0.c f7 = i1Var.f(527);
        k0 k0Var = this.f10786b;
        k0Var.T = f7;
        k0Var.U = i1Var.f(519);
        k0Var.F.j(AndroidUtilities.dp(56.0f) + k0Var.T.f11426b, k0Var.T.d, false);
        k0Var.H.invalidate();
        return l1.f44710b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean canRemoveBotFromCommunity;
        long j3;
        boolean z10;
        boolean z11;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = k0.V;
        Object obj6 = ((h51) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        k0 k0Var = this.f10786b;
        boolean z13 = false;
        if (z12) {
            TLRPC.Chat chat = (TLRPC.Chat) obj6;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, k0Var.f10712f);
            j3 = -chat.f19869id;
            z11 = false;
            z10 = isChannelAndNotMegaGroup;
        } else {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j10 = user.f20016id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, k0Var.f10712f);
                j3 = j10;
                z10 = false;
                z11 = isBot;
            }
            return Boolean.valueOf(z13);
        }
        if (canRemoveBotFromCommunity) {
            n70 F = n70.F(k0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new l(k0Var, z11, z10, j3, 1), true);
            F.W(k0Var.v.d.U0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f10785a;
        k0 k0Var = this.f10786b;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                k0Var.W(h51Var);
                return;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = k0.V;
                k0Var.T(h51Var);
                return;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = k0.V;
                k0Var.W(h51Var);
                return;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                k0.y(k0Var, h51Var, view);
                return;
        }
    }
}
