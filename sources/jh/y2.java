package jh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y2 implements Utilities.Callback {
    public final int f13112a;
    public final h5 f13113b;

    public y2(h5 h5Var, int i10) {
        this.f13112a = i10;
        this.f13113b = h5Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f13112a) {
            case 0:
                h5 h5Var = this.f13113b;
                h5Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    h5Var.skipDismissAnimation();
                }
                h5Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                h5 h5Var2 = this.f13113b;
                h5Var2.getClass();
                if (stargiftupgradepreview != null) {
                    h5Var2.f12170d1 = stargiftupgradepreview.sample_attributes;
                    h5Var2.f12172e1 = stargiftupgradepreview.prices;
                    h5Var2.f12174f1 = stargiftupgradepreview.next_prices;
                    h5Var2.b2();
                    return;
                }
                return;
            case 2:
                this.f13113b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                h5 h5Var3 = this.f13113b;
                h5Var3.G0 = false;
                h5Var3.H0 = true;
                if (savedStarGift != null) {
                    h5Var3.f12166b1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = h5Var3.A0;
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
                        h5Var3.i2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
