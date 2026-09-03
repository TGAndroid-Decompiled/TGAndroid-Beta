package lh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y2 implements Utilities.Callback {
    public final int f13364a;
    public final g5 f13365b;

    public y2(g5 g5Var, int i10) {
        this.f13364a = i10;
        this.f13365b = g5Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f13364a) {
            case 0:
                g5 g5Var = this.f13365b;
                g5Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    g5Var.skipDismissAnimation();
                }
                g5Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                g5 g5Var2 = this.f13365b;
                g5Var2.getClass();
                if (stargiftupgradepreview != null) {
                    g5Var2.f12459e1 = stargiftupgradepreview.sample_attributes;
                    g5Var2.f12461f1 = stargiftupgradepreview.prices;
                    g5Var2.f12463g1 = stargiftupgradepreview.next_prices;
                    g5Var2.b2();
                    return;
                }
                return;
            case 2:
                this.f13365b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                g5 g5Var3 = this.f13365b;
                g5Var3.H0 = false;
                g5Var3.I0 = true;
                if (savedStarGift != null) {
                    g5Var3.f12455c1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = g5Var3.B0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z4 = tL_messageActionStarGiftUnique.saved;
                            boolean z10 = !savedStarGift.unsaved;
                            if (z4 != z10) {
                                tL_messageActionStarGiftUnique.saved = z10;
                            } else {
                                return;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z11 = tL_messageActionStarGift.saved;
                            boolean z12 = !savedStarGift.unsaved;
                            if (z11 != z12) {
                                tL_messageActionStarGift.saved = z12;
                            } else {
                                return;
                            }
                        }
                        g5Var3.i2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
