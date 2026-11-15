package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n1 implements z10 {
    public final int f9071a;
    public final c6 f9072b;

    public n1(c6 c6Var, int i7) {
        this.f9071a = i7;
        this.f9072b = c6Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.f9071a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f9072b.dismiss();
                return;
            case 1:
                c6 c6Var = this.f9072b;
                c6Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    c6Var.O0 = true;
                }
                c6Var.dismiss();
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                c6 c6Var2 = this.f9072b;
                c6Var2.getClass();
                if (stargiftupgradepreview != null) {
                    c6Var2.f8327k3 = stargiftupgradepreview.sample_attributes;
                    c6Var2.f8329l3 = stargiftupgradepreview.prices;
                    c6Var2.f8331m3 = stargiftupgradepreview.next_prices;
                    c6Var2.b2();
                    return;
                }
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                c6 c6Var3 = this.f9072b;
                c6Var3.J2 = false;
                c6Var3.K2 = true;
                if (savedStarGift != null) {
                    c6Var3.f8324i3 = Boolean.valueOf(savedStarGift.unsaved);
                    gj gjVar = c6Var3.D2;
                    if (gjVar != null && (message = gjVar.f23819k) != null) {
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
                        c6Var3.j2(gjVar, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
