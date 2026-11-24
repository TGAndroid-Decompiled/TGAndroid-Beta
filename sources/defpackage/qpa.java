package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qpa implements qac {
    public final byte a;
    public final wsa b;

    public qpa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Message message;
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).booleanValue();
                wsaVar.dismiss();
                return;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    wsaVar.O0 = true;
                }
                wsaVar.dismiss();
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                if (stargiftupgradepreview == null) {
                    wsaVar.getClass();
                    return;
                }
                wsaVar.m3 = stargiftupgradepreview.sample_attributes;
                wsaVar.n3 = stargiftupgradepreview.prices;
                wsaVar.o3 = stargiftupgradepreview.next_prices;
                wsaVar.e2();
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                wsaVar.I2 = false;
                wsaVar.J2 = true;
                if (savedStarGift != null) {
                    wsaVar.k3 = Boolean.valueOf(savedStarGift.unsaved);
                    k47 k47Var = wsaVar.C2;
                    if (k47Var != null && (message = k47Var.k) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z = tL_messageActionStarGiftUnique.saved;
                            boolean z2 = !savedStarGift.unsaved;
                            if (z != z2) {
                                tL_messageActionStarGiftUnique.saved = z2;
                            } else {
                                return;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z3 = tL_messageActionStarGift.saved;
                            boolean z4 = !savedStarGift.unsaved;
                            if (z3 != z4) {
                                tL_messageActionStarGift.saved = z4;
                            } else {
                                return;
                            }
                        }
                        wsaVar.l2(k47Var, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
