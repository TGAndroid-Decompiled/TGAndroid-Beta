package ci;

import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k3 implements u10 {
    public final int f5377a;
    public final l6 f5378b;

    public k3(l6 l6Var, int i3) {
        this.f5377a = i3;
        this.f5378b = l6Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.f5377a) {
            case 0:
                l6 l6Var = this.f5378b;
                l6Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    l6Var.O0 = true;
                }
                l6Var.dismiss();
                return;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f5378b.dismiss();
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                l6 l6Var2 = this.f5378b;
                l6Var2.getClass();
                if (stargiftupgradepreview != null) {
                    l6Var2.f5460h3 = stargiftupgradepreview.sample_attributes;
                    l6Var2.i3 = stargiftupgradepreview.prices;
                    l6Var2.f5463j3 = stargiftupgradepreview.next_prices;
                    l6Var2.a2();
                    return;
                }
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                l6 l6Var3 = this.f5378b;
                l6Var3.G2 = false;
                l6Var3.H2 = true;
                if (savedStarGift != null) {
                    l6Var3.f5456f3 = Boolean.valueOf(savedStarGift.unsaved);
                    zi ziVar = l6Var3.A2;
                    if (ziVar != null && (message = ziVar.f26868k) != null) {
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
                        l6Var3.i2(ziVar, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
