package oh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.n41;
import r0.j1;
import r0.m1;

public final class t implements Utilities.Callback5, r0.o, Utilities.Callback5Return {

    public final int f19573a;

    public final j0 f19574b;

    public t(j0 j0Var, int i10) {
        this.f19573a = i10;
        this.f19574b = j0Var;
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        j1 j1Var = m1Var.f46619a;
        i0.c cVarF = j1Var.f(527);
        j0 j0Var = this.f19574b;
        j0Var.P = cVarF;
        j0Var.Q = j1Var.f(519);
        j0Var.B.j(AndroidUtilities.dp(56.0f) + j0Var.P.f10490b, j0Var.P.d, false);
        j0Var.D.invalidate();
        return m1.f46618b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zCanRemoveBotFromCommunity;
        long j10;
        boolean z10;
        boolean z11;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = j0.R;
        Object obj6 = ((n41) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        j0 j0Var = this.f19574b;
        boolean z13 = false;
        if (!z12) {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.f22527id;
                boolean zIsBot = UserObject.isBot(user);
                zCanRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, j0Var.f19501f);
                j10 = j11;
                z10 = false;
                z11 = zIsBot;
            }
            return Boolean.valueOf(z13);
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj6;
        long j12 = -chat.f22380id;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        zCanRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, j0Var.f19501f);
        j10 = j12;
        z11 = false;
        z10 = zIsChannelAndNotMegaGroup;
        if (zCanRemoveBotFromCommunity) {
            b70 b70VarF = b70.F(j0Var.container, null, view);
            b70VarF.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new l(j0Var, z11, z10, j10, 1), true);
            b70VarF.W(j0Var.v.d.V0(view, true));
            b70VarF.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f19573a;
        j0 j0Var = this.f19574b;
        n41 n41Var = (n41) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                j0Var.W(n41Var);
                break;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = j0.R;
                j0Var.T(n41Var);
                break;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = j0.R;
                j0Var.W(n41Var);
                break;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                j0.z(j0Var, n41Var, view);
                break;
        }
    }
}
