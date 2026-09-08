package di;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.g90;
public final class s7 implements e2.h {
    public final int f8153a;
    public final Object f8154b;
    public final Object f8155c;
    public final Object d;

    public s7(Object obj, Object obj2, Object obj3, int i10) {
        this.f8153a = i10;
        this.f8154b = obj;
        this.f8155c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.f8153a) {
            case 0:
                r7 r7Var = (r7) this.f8154b;
                MessagesController messagesController = (MessagesController) this.f8155c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f8155c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                ((org.telegram.ui.ActionBar.b2) this.f8154b).dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    return;
                }
                return;
            case 2:
                sg.k0 k0Var = (sg.k0) this.f8154b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                k0Var.getClass();
                boolean z10 = false;
                ((g90) this.f8155c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    k0Var.f46159b0.boosts++;
                    if (k0Var.f46165h0 == 32 && (t12 = k0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    k0Var.z1();
                    k0Var.F1(tL_premium_boostsStatus, k0Var.f46162e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.f46160c0;
                    if (k0Var.f46159b0.next_level_boosts <= 0) {
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
                ((u2.k0) obj).c(((a5.a) this.f8154b).f297b, (u2.f0) this.f8155c, (u2.b0) this.d);
                return;
        }
    }
}
