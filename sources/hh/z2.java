package hh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class z2 implements Utilities.Callback {

    public final int f10408a;

    public final i5 f10409b;

    public z2(i5 i5Var, int i10) {
        this.f10408a = i10;
        this.f10409b = i5Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f10408a) {
            case 0:
                i5 i5Var = this.f10409b;
                i5Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    i5Var.skipDismissAnimation();
                }
                i5Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                i5 i5Var2 = this.f10409b;
                i5Var2.getClass();
                if (stargiftupgradepreview != null) {
                    i5Var2.f9458d1 = stargiftupgradepreview.sample_attributes;
                    i5Var2.f9460e1 = stargiftupgradepreview.prices;
                    i5Var2.f9462f1 = stargiftupgradepreview.next_prices;
                    i5Var2.b2();
                    break;
                }
                break;
            case 2:
                this.f10409b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                i5 i5Var3 = this.f10409b;
                i5Var3.G0 = false;
                i5Var3.H0 = true;
                if (savedStarGift != null) {
                    i5Var3.f9454b1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = i5Var3.A0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z10 = tL_messageActionStarGiftUnique.saved;
                            boolean z11 = !savedStarGift.unsaved;
                            if (z10 != z11) {
                                tL_messageActionStarGiftUnique.saved = z11;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z12 = tL_messageActionStarGift.saved;
                            boolean z13 = !savedStarGift.unsaved;
                            if (z12 != z13) {
                                tL_messageActionStarGift.saved = z13;
                            }
                        }
                        i5Var3.i2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
