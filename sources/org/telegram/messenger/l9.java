package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l9 implements r10 {
    public final int f25169a;
    public final c1 f25170b;
    public final Object f25171c;
    public final Object d;
    public final Object f25172e;

    public l9(c1 c1Var, Object obj, Object obj2, Object obj3, int i7) {
        this.f25169a = i7;
        this.f25170b = c1Var;
        this.f25171c = obj;
        this.d = obj2;
        this.f25172e = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer num;
        int i7 = this.f25169a;
        Object obj3 = this.f25172e;
        Object obj4 = this.d;
        Object obj5 = this.f25171c;
        c1 c1Var = this.f25170b;
        switch (i7) {
            case 0:
                v9 v9Var = (v9) c1Var;
                bi.n nVar = (bi.n) obj5;
                s9 s9Var = (s9) obj4;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) obj3;
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    nVar.a(Boolean.FALSE, tL_error.text);
                    s9Var.f26739f = false;
                    return;
                } else if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    nVar.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                    s9Var.f26739f = false;
                    return;
                } else {
                    TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                    tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
                    tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
                    v9Var.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new d3.b(1), new m9(v9Var, s9Var, nVar));
                    return;
                }
            case 1:
                si siVar = (si) c1Var;
                qi qiVar = (qi) obj5;
                ri riVar = (ri) obj4;
                y10 y10Var = (y10) obj3;
                TLRPC.messages_FoundStickers messages_foundstickers = (TLRPC.messages_FoundStickers) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                siVar.S1.remove(qiVar);
                if (riVar == null) {
                    riVar = new ri();
                }
                ArrayList arrayList = riVar.f26582a;
                if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
                    TLRPC.TL_messages_foundStickers tL_messages_foundStickers = (TLRPC.TL_messages_foundStickers) messages_foundstickers;
                    arrayList.addAll(tL_messages_foundStickers.stickers);
                    if ((tL_messages_foundStickers.flags & 1) != 0) {
                        num = Integer.valueOf(tL_messages_foundStickers.next_offset);
                    } else {
                        num = null;
                    }
                    riVar.f26583b = num;
                }
                siVar.T1.put(qiVar, riVar);
                y10Var.a(arrayList);
                return;
            default:
                si siVar2 = (si) c1Var;
                y10 y10Var2 = (y10) obj4;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                siVar2.J0.remove((String) obj5);
                if (y10Var2 != null) {
                    y10Var2.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        siVar2.J.k(tL_messages_stickerSet, stickerSet.f28425id);
                        siVar2.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        boolean z10 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                        if (z10) {
                            siVar2.P = tL_messages_stickerSet;
                        }
                        if (z10) {
                            siVar2.Q = tL_messages_stickerSet;
                        }
                    }
                    siVar2.Z1(tL_messages_stickerSet);
                    siVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f28425id), tL_messages_stickerSet);
                    return;
                }
                return;
        }
    }
}
