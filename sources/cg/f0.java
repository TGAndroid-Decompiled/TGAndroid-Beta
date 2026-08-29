package cg;

import nh.u6;
import nh.v6;
import nh.w6;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b90;
public final class f0 implements f5.d {
    public final int f3115a;
    public final Object f3116b;
    public final Object f3117c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f3115a = i10;
        this.f3116b = obj;
        this.f3117c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.f3115a) {
            case 0:
                v0 v0Var = (v0) this.f3116b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v0Var.getClass();
                boolean z10 = false;
                ((b90) this.f3117c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    v0Var.X.boosts++;
                    if (v0Var.f3404d0 == 32 && (t12 = v0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    v0Var.z1();
                    v0Var.F1(tL_premium_boostsStatus, v0Var.f3401a0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Y;
                    if (v0Var.X.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    canApplyBoost.isMaxLvl = z10;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    v0Var.B1();
                    return;
                }
                return;
            case 1:
                u6 u6Var = (u6) this.f3116b;
                MessagesController messagesController = (MessagesController) this.f3117c;
                String str = (String) this.d;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    u6Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l10.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    u6Var.run(new v6(str, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    u6Var.run(new w6(str, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f3117c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                ((org.telegram.ui.ActionBar.c2) this.f3116b).dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    return;
                }
                return;
        }
    }
}
