package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g9 implements n10 {
    public final int f22675a;
    public final c1 f22676b;
    public final Object f22677c;
    public final Object d;
    public final Object f22678e;

    public g9(c1 c1Var, Object obj, Object obj2, Object obj3, int i3) {
        this.f22675a = i3;
        this.f22676b = c1Var;
        this.f22677c = obj;
        this.d = obj2;
        this.f22678e = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer num;
        int i3 = this.f22675a;
        Object obj3 = this.f22678e;
        Object obj4 = this.d;
        Object obj5 = this.f22677c;
        c1 c1Var = this.f22676b;
        switch (i3) {
            case 0:
                q9 q9Var = (q9) c1Var;
                ai.r rVar = (ai.r) obj5;
                n9 n9Var = (n9) obj4;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) obj3;
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    rVar.a(Boolean.FALSE, tL_error.text);
                    n9Var.f24338f = false;
                    return;
                } else if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    rVar.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                    n9Var.f24338f = false;
                    return;
                } else {
                    TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                    tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
                    tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
                    q9Var.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new c3.b(1), new h9(q9Var, n9Var, rVar));
                    return;
                }
            case 1:
                li liVar = (li) c1Var;
                ji jiVar = (ji) obj5;
                ki kiVar = (ki) obj4;
                u10 u10Var = (u10) obj3;
                TLRPC.messages_FoundStickers messages_foundstickers = (TLRPC.messages_FoundStickers) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                liVar.Q1.remove(jiVar);
                if (kiVar == null) {
                    kiVar = new ki();
                }
                ArrayList arrayList = kiVar.f23830a;
                if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
                    TLRPC.TL_messages_foundStickers tL_messages_foundStickers = (TLRPC.TL_messages_foundStickers) messages_foundstickers;
                    arrayList.addAll(tL_messages_foundStickers.stickers);
                    if ((tL_messages_foundStickers.flags & 1) != 0) {
                        num = Integer.valueOf(tL_messages_foundStickers.next_offset);
                    } else {
                        num = null;
                    }
                    kiVar.f23831b = num;
                }
                liVar.R1.put(jiVar, kiVar);
                u10Var.a(arrayList);
                return;
            default:
                li liVar2 = (li) c1Var;
                u10 u10Var2 = (u10) obj4;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                liVar2.J0.remove((String) obj5);
                if (u10Var2 != null) {
                    u10Var2.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        liVar2.J.k(tL_messages_stickerSet, stickerSet.f27028id);
                        liVar2.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        boolean z10 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                        if (z10) {
                            liVar2.P = tL_messages_stickerSet;
                        }
                        if (z10) {
                            liVar2.Q = tL_messages_stickerSet;
                        }
                    }
                    liVar2.U1(tL_messages_stickerSet);
                    liVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f27028id), tL_messages_stickerSet);
                    return;
                }
                return;
        }
    }
}
