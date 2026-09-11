package di;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.g90;
public final class s7 implements e2.h {
    public final int f8125a;
    public final Object f8126b;
    public final Object f8127c;
    public final Object d;

    public s7(Object obj, Object obj2, Object obj3, int i10) {
        this.f8125a = i10;
        this.f8126b = obj;
        this.f8127c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.f8125a) {
            case 0:
                r7 r7Var = (r7) this.f8126b;
                MessagesController messagesController = (MessagesController) this.f8127c;
                String str = (String) this.d;
                Long l4 = (Long) obj;
                if (l4 == null) {
                    r7Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    r7Var.run(new t7(str, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    r7Var.run(new u7(str, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f8127c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                ((org.telegram.ui.ActionBar.b2) this.f8126b).dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    return;
                }
                return;
            case 2:
                sg.k0 k0Var = (sg.k0) this.f8126b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                k0Var.getClass();
                boolean z10 = false;
                ((g90) this.f8127c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    k0Var.f46131b0.boosts++;
                    if (k0Var.f46137h0 == 32 && (t12 = k0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    k0Var.z1();
                    k0Var.F1(tL_premium_boostsStatus, k0Var.f46134e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.f46132c0;
                    if (k0Var.f46131b0.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    canApplyBoost.isMaxLvl = z10;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    k0Var.B1();
                    return;
                }
                return;
            default:
                ((u2.k0) obj).c(((a5.a) this.f8126b).f285b, (u2.f0) this.f8127c, (u2.b0) this.d);
                return;
        }
    }
}
