package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n1 implements y10 {
    public final int f9384a;
    public final f6 f9385b;

    public n1(f6 f6Var, int i7) {
        this.f9384a = i7;
        this.f9385b = f6Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.f9384a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f9385b.dismiss();
                return;
            case 1:
                f6 f6Var = this.f9385b;
                f6Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    f6Var.O0 = true;
                }
                f6Var.dismiss();
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                f6 f6Var2 = this.f9385b;
                f6Var2.getClass();
                if (stargiftupgradepreview != null) {
                    f6Var2.f8820n3 = stargiftupgradepreview.sample_attributes;
                    f6Var2.f8822o3 = stargiftupgradepreview.prices;
                    f6Var2.f8824p3 = stargiftupgradepreview.next_prices;
                    f6Var2.n2();
                    return;
                }
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                f6 f6Var3 = this.f9385b;
                f6Var3.J2 = false;
                f6Var3.K2 = true;
                if (savedStarGift != null) {
                    f6Var3.f8816l3 = Boolean.valueOf(savedStarGift.unsaved);
                    gj gjVar = f6Var3.D2;
                    if (gjVar != null && (message = gjVar.f24213k) != null) {
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
                        f6Var3.v2(gjVar, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
