package ag;

import lh.e7;
import lh.f7;
import lh.g7;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s80;

public final class o0 implements d5.d {

    public final int f578a;

    public final Object f579b;

    public final Object f580c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i10) {
        this.f578a = i10;
        this.f579b = obj;
        this.f580c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.ChatFull chatFullT1;
        switch (this.f578a) {
            case 0:
                i1 i1Var = (i1) this.f579b;
                s80 s80Var = (s80) this.f580c;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                i1Var.getClass();
                s80Var.setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    i1Var.X.boosts++;
                    if (i1Var.f432d0 == 32 && (chatFullT1 = i1Var.t1()) != null) {
                        chatFullT1.boosts_applied++;
                    }
                    i1Var.z1();
                    i1Var.F1(tL_premium_boostsStatus, i1Var.f429a0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = i1Var.Y;
                    canApplyBoost.isMaxLvl = i1Var.X.next_level_boosts <= 0;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    i1Var.B1();
                    break;
                }
                break;
            case 1:
                e7 e7Var = (e7) this.f579b;
                MessagesController messagesController = (MessagesController) this.f580c;
                String str = (String) this.d;
                Long l10 = (Long) obj;
                if (l10 != null) {
                    TLObject userOrChat = messagesController.getUserOrChat(l10.longValue());
                    if (userOrChat instanceof TLRPC.User) {
                        e7Var.run(new f7(str, (TLRPC.User) userOrChat));
                    } else if (userOrChat instanceof TLRPC.Chat) {
                        e7Var.run(new g7(str, (TLRPC.Chat) userOrChat));
                    }
                } else {
                    e7Var.run(null);
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f579b;
                Utilities.Callback callback = (Utilities.Callback) this.f580c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                b2Var.dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    break;
                }
                break;
        }
    }
}
