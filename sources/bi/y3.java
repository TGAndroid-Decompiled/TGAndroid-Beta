package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 implements c20 {
    public final int f5072a;
    public final k7 f5073b;

    public y3(k7 k7Var, int i7) {
        this.f5072a = i7;
        this.f5073b = k7Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.f5072a) {
            case 0:
                k7 k7Var = this.f5073b;
                k7Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    k7Var.N0 = true;
                }
                k7Var.dismiss();
                return;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f5073b.dismiss();
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                k7 k7Var2 = this.f5073b;
                k7Var2.getClass();
                if (stargiftupgradepreview != null) {
                    k7Var2.j3 = stargiftupgradepreview.sample_attributes;
                    k7Var2.f4180k3 = stargiftupgradepreview.prices;
                    k7Var2.f4182l3 = stargiftupgradepreview.next_prices;
                    k7Var2.Z1();
                    return;
                }
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                k7 k7Var3 = this.f5073b;
                k7Var3.I2 = false;
                k7Var3.J2 = true;
                if (savedStarGift != null) {
                    k7Var3.f4175h3 = Boolean.valueOf(savedStarGift.unsaved);
                    ij ijVar = k7Var3.C2;
                    if (ijVar != null && (message = ijVar.f23266k) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z9 = tL_messageActionStarGiftUnique.saved;
                            boolean z10 = !savedStarGift.unsaved;
                            if (z9 != z10) {
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
                        k7Var3.h2(ijVar, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
