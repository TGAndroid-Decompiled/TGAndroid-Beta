package ai;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d4 implements Utilities.Callback {
    public final int f1128a;
    public final l7 f1129b;

    public d4(l7 l7Var, int i10) {
        this.f1128a = i10;
        this.f1129b = l7Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f1128a) {
            case 0:
                l7 l7Var = this.f1129b;
                l7Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    l7Var.skipDismissAnimation();
                }
                l7Var.dismiss();
                return;
            case 1:
                this.f1129b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                l7 l7Var2 = this.f1129b;
                l7Var2.getClass();
                if (stargiftupgradepreview != null) {
                    l7Var2.f1737o1 = stargiftupgradepreview.sample_attributes;
                    l7Var2.f1739p1 = stargiftupgradepreview.prices;
                    l7Var2.f1741q1 = stargiftupgradepreview.next_prices;
                    l7Var2.A2();
                    return;
                }
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                l7 l7Var3 = this.f1129b;
                l7Var3.N0 = false;
                l7Var3.O0 = true;
                if (savedStarGift != null) {
                    l7Var3.f1733m1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = l7Var3.H0;
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
                        l7Var3.K2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
