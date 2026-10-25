package bi;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 implements Utilities.Callback {
    public final int f5753a;
    public final h7 f5754b;

    public y3(h7 h7Var, int i10) {
        this.f5753a = i10;
        this.f5754b = h7Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f5753a) {
            case 0:
                h7 h7Var = this.f5754b;
                h7Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    h7Var.skipDismissAnimation();
                }
                h7Var.dismiss();
                return;
            case 1:
                this.f5754b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                h7 h7Var2 = this.f5754b;
                h7Var2.getClass();
                if (stargiftupgradepreview != null) {
                    h7Var2.f4754o1 = stargiftupgradepreview.sample_attributes;
                    h7Var2.f4756p1 = stargiftupgradepreview.prices;
                    h7Var2.f4758q1 = stargiftupgradepreview.next_prices;
                    h7Var2.A2();
                    return;
                }
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                h7 h7Var3 = this.f5754b;
                h7Var3.N0 = false;
                h7Var3.O0 = true;
                if (savedStarGift != null) {
                    h7Var3.f4750m1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = h7Var3.H0;
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
                        h7Var3.K2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
