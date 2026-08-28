package gh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z2 implements Utilities.Callback {
    public final int f9248a;
    public final k5 f9249b;

    public z2(k5 k5Var, int i9) {
        this.f9248a = i9;
        this.f9249b = k5Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f9248a) {
            case 0:
                k5 k5Var = this.f9249b;
                k5Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    k5Var.skipDismissAnimation();
                }
                k5Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                k5 k5Var2 = this.f9249b;
                k5Var2.getClass();
                if (stargiftupgradepreview != null) {
                    k5Var2.f8404d1 = stargiftupgradepreview.sample_attributes;
                    k5Var2.f8406e1 = stargiftupgradepreview.prices;
                    k5Var2.f8408f1 = stargiftupgradepreview.next_prices;
                    k5Var2.b2();
                    return;
                }
                return;
            case 2:
                this.f9249b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                k5 k5Var3 = this.f9249b;
                k5Var3.G0 = false;
                k5Var3.H0 = true;
                if (savedStarGift != null) {
                    k5Var3.f8400b1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = k5Var3.A0;
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
                        k5Var3.i2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
