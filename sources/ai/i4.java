package ai;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i4 implements Utilities.Callback {
    public final int f1500a;
    public final k7 f1501b;

    public i4(k7 k7Var, int i10) {
        this.f1500a = i10;
        this.f1501b = k7Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f1500a) {
            case 0:
                k7 k7Var = this.f1501b;
                k7Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    k7Var.skipDismissAnimation();
                }
                k7Var.dismiss();
                return;
            case 1:
                this.f1501b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                k7 k7Var2 = this.f1501b;
                k7Var2.getClass();
                if (stargiftupgradepreview != null) {
                    k7Var2.f1692o1 = stargiftupgradepreview.sample_attributes;
                    k7Var2.f1694p1 = stargiftupgradepreview.prices;
                    k7Var2.f1696q1 = stargiftupgradepreview.next_prices;
                    k7Var2.s2();
                    return;
                }
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                k7 k7Var3 = this.f1501b;
                k7Var3.N0 = false;
                k7Var3.O0 = true;
                if (savedStarGift != null) {
                    k7Var3.f1688m1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = k7Var3.H0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z10 = tL_messageActionStarGiftUnique.saved;
                            boolean z11 = !savedStarGift.unsaved;
                            if (z10 != z11) {
                                tL_messageActionStarGiftUnique.saved = z11;
                            } else {
                                return;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z12 = tL_messageActionStarGift.saved;
                            boolean z13 = !savedStarGift.unsaved;
                            if (z12 != z13) {
                                tL_messageActionStarGift.saved = z13;
                            } else {
                                return;
                            }
                        }
                        k7Var3.B2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
