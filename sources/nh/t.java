package nh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x60;
import r0.j1;
import r0.m1;
public final class t implements Utilities.Callback5, r0.o, Utilities.Callback5Return {
    public final int f18724a;
    public final j0 f18725b;

    public t(j0 j0Var, int i9) {
        this.f18724a = i9;
        this.f18725b = j0Var;
    }

    @Override
    public m1 L0(View view, m1 m1Var) {
        j1 j1Var = m1Var.f46929a;
        i0.b f10 = j1Var.f(527);
        j0 j0Var = this.f18725b;
        j0Var.P = f10;
        j0Var.Q = j1Var.f(519);
        j0Var.B.j(AndroidUtilities.dp(56.0f) + j0Var.P.f10849b, j0Var.P.d, false);
        j0Var.D.invalidate();
        return m1.f46928b;
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
        int i9 = j0.R;
        Object obj6 = ((l41) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        j0 j0Var = this.f18725b;
        boolean z13 = false;
        if (z12) {
            TLRPC.Chat chat = (TLRPC.Chat) obj6;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, j0Var.f18652f);
            j10 = -chat.f22380id;
            z11 = false;
            z10 = isChannelAndNotMegaGroup;
        } else {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.f22527id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, j0Var.f18652f);
                j10 = j11;
                z10 = false;
                z11 = isBot;
            }
            return Boolean.valueOf(z13);
        }
        if (canRemoveBotFromCommunity) {
            x60 F = x60.F(j0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new l(j0Var, z11, z10, j10, 1), true);
            F.W(j0Var.v.d.V0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i9 = this.f18724a;
        j0 j0Var = this.f18725b;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i9) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                j0Var.V(l41Var);
                return;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i10 = j0.R;
                j0Var.S(l41Var);
                return;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = j0.R;
                j0Var.V(l41Var);
                return;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                j0.y(j0Var, l41Var, view);
                return;
        }
    }
}
