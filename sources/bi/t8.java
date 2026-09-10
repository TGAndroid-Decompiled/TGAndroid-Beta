package bi;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p90;
public final class t8 implements e2.h {
    public final int f3685a;
    public final Object f3686b;
    public final Object f3687c;
    public final Object d;

    public t8(Object obj, Object obj2, Object obj3, int i10) {
        this.f3685a = i10;
        this.f3686b = obj;
        this.f3687c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.f3685a) {
            case 0:
                s8 s8Var = (s8) this.f3686b;
                MessagesController messagesController = (MessagesController) this.f3687c;
                String str = (String) this.d;
                Long l4 = (Long) obj;
                if (l4 == null) {
                    s8Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    s8Var.run(new u8(str, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    s8Var.run(new v8(str, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f3687c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                ((org.telegram.ui.ActionBar.d2) this.f3686b).dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    return;
                }
                return;
            case 2:
                qg.k0 k0Var = (qg.k0) this.f3686b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                k0Var.getClass();
                boolean z10 = false;
                ((p90) this.f3687c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    k0Var.f40765b0.boosts++;
                    if (k0Var.f40771h0 == 32 && (t12 = k0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    k0Var.z1();
                    k0Var.F1(tL_premium_boostsStatus, k0Var.f40768e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.f40766c0;
                    if (k0Var.f40765b0.next_level_boosts <= 0) {
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
                ((u2.m0) obj).c(((a5.a) this.f3686b).f275b, (u2.g0) this.f3687c, (u2.c0) this.d);
                return;
        }
    }
}
