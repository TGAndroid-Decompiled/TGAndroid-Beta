package ci;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f90;
public final class s7 implements e2.h {
    public final int f5518a;
    public final Object f5519b;
    public final Object f5520c;
    public final Object d;

    public s7(Object obj, Object obj2, Object obj3, int i10) {
        this.f5518a = i10;
        this.f5519b = obj;
        this.f5520c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.f5518a) {
            case 0:
                r7 r7Var = (r7) this.f5519b;
                MessagesController messagesController = (MessagesController) this.f5520c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f5520c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                ((org.telegram.ui.ActionBar.c2) this.f5519b).dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    return;
                }
                return;
            case 2:
                rg.j0 j0Var = (rg.j0) this.f5519b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j0Var.getClass();
                boolean z10 = false;
                ((f90) this.f5520c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.f42333b0.boosts++;
                    if (j0Var.f42339h0 == 32 && (t12 = j0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    j0Var.z1();
                    j0Var.F1(tL_premium_boostsStatus, j0Var.f42336e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f42334c0;
                    if (j0Var.f42333b0.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    canApplyBoost.isMaxLvl = z10;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    j0Var.B1();
                    return;
                }
                return;
            default:
                ((u2.k0) obj).c(((a5.a) this.f5519b).f277b, (u2.f0) this.f5520c, (u2.b0) this.d);
                return;
        }
    }
}
