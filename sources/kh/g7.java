package kh;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o80;
public final class g7 implements d5.d {
    public final int f15317a;
    public final Object f15318b;
    public final Object f15319c;
    public final Object d;

    public g7(Object obj, Object obj2, Object obj3, int i9) {
        this.f15317a = i9;
        this.f15318b = obj;
        this.f15319c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.f15317a) {
            case 0:
                f7 f7Var = (f7) this.f15318b;
                MessagesController messagesController = (MessagesController) this.f15319c;
                String str = (String) this.d;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    f7Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l10.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    f7Var.run(new h7(str, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    f7Var.run(new i7(str, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.f15319c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                ((org.telegram.ui.ActionBar.c2) this.f15318b).dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    return;
                }
                return;
            default:
                zf.j0 j0Var = (zf.j0) this.f15318b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j0Var.getClass();
                boolean z10 = false;
                ((o80) this.f15319c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.X.boosts++;
                    if (j0Var.f50535d0 == 32 && (t12 = j0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    j0Var.z1();
                    j0Var.F1(tL_premium_boostsStatus, j0Var.f50532a0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.Y;
                    if (j0Var.X.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    canApplyBoost.isMaxLvl = z10;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    j0Var.B1();
                    return;
                }
                return;
        }
    }
}
