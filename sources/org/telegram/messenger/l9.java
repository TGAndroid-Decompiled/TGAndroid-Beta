package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l9 implements s10 {
    public final int f24811a;
    public final c1 f24812b;
    public final Object f24813c;
    public final Object d;
    public final Object f24814e;

    public l9(c1 c1Var, Object obj, Object obj2, Object obj3, int i7) {
        this.f24811a = i7;
        this.f24812b = c1Var;
        this.f24813c = obj;
        this.d = obj2;
        this.f24814e = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer num;
        int i7 = this.f24811a;
        Object obj3 = this.f24814e;
        Object obj4 = this.d;
        Object obj5 = this.f24813c;
        c1 c1Var = this.f24812b;
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
                    s9Var.f26422f = false;
                    return;
                } else if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    nVar.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                    s9Var.f26422f = false;
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
                z10 z10Var = (z10) obj3;
                TLRPC.messages_FoundStickers messages_foundstickers = (TLRPC.messages_FoundStickers) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                siVar.Q1.remove(qiVar);
                if (riVar == null) {
                    riVar = new ri();
                }
                ArrayList arrayList = riVar.f26295a;
                if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
                    TLRPC.TL_messages_foundStickers tL_messages_foundStickers = (TLRPC.TL_messages_foundStickers) messages_foundstickers;
                    arrayList.addAll(tL_messages_foundStickers.stickers);
                    if ((tL_messages_foundStickers.flags & 1) != 0) {
                        num = Integer.valueOf(tL_messages_foundStickers.next_offset);
                    } else {
                        num = null;
                    }
                    riVar.f26296b = num;
                }
                siVar.R1.put(qiVar, riVar);
                z10Var.a(arrayList);
                return;
            default:
                si siVar2 = (si) c1Var;
                z10 z10Var2 = (z10) obj4;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                siVar2.J0.remove((String) obj5);
                if (z10Var2 != null) {
                    z10Var2.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        siVar2.J.k(tL_messages_stickerSet, stickerSet.f28078id);
                        siVar2.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        boolean z10 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                        if (z10) {
                            siVar2.P = tL_messages_stickerSet;
                        }
                        if (z10) {
                            siVar2.Q = tL_messages_stickerSet;
                        }
                    }
                    siVar2.U1(tL_messages_stickerSet);
                    siVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f28078id), tL_messages_stickerSet);
                    return;
                }
                return;
        }
    }
}
