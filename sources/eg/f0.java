package eg;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i90;
import ph.a6;
import ph.y5;
import ph.z5;
public final class f0 implements h5.d {
    public final int f5275a;
    public final Object f5276b;
    public final Object f5277c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f5275a = i10;
        this.f5276b = obj;
        this.f5277c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.f5275a) {
            case 0:
                v0 v0Var = (v0) this.f5276b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v0Var.getClass();
                boolean z4 = false;
                ((i90) this.f5277c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    v0Var.Y.boosts++;
                    if (v0Var.f5527e0 == 32 && (t12 = v0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    v0Var.z1();
                    v0Var.F1(tL_premium_boostsStatus, v0Var.f5524b0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Z;
                    if (v0Var.Y.next_level_boosts <= 0) {
                        z4 = true;
                    }
                    canApplyBoost.isMaxLvl = z4;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    v0Var.B1();
                    return;
                }
                return;
            case 1:
                y5 y5Var = (y5) this.f5276b;
                MessagesController messagesController = (MessagesController) this.f5277c;
                String str = (String) this.d;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    y5Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l10.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    y5Var.run(new z5(str, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    y5Var.run(new a6(str, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f5277c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                ((org.telegram.ui.ActionBar.d2) this.f5276b).dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    return;
                }
                return;
        }
    }
}
