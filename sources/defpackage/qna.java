package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qna implements p8c {
    public final byte a;
    public final vqa b;

    public qna(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Message message;
        byte b = this.a;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).booleanValue();
                vqaVar.dismiss();
                return;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    vqaVar.O0 = true;
                }
                vqaVar.dismiss();
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                if (stargiftupgradepreview == null) {
                    vqaVar.getClass();
                    return;
                }
                vqaVar.m3 = stargiftupgradepreview.sample_attributes;
                vqaVar.n3 = stargiftupgradepreview.prices;
                vqaVar.o3 = stargiftupgradepreview.next_prices;
                vqaVar.e2();
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                vqaVar.I2 = false;
                vqaVar.J2 = true;
                if (savedStarGift != null) {
                    vqaVar.k3 = Boolean.valueOf(savedStarGift.unsaved);
                    k27 k27Var = vqaVar.C2;
                    if (k27Var != null && (message = k27Var.k) != null) {
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
                        vqaVar.l2(k27Var, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
