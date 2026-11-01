package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.z70;
public final class o9 implements k20 {
    public final int f17402a;
    public final f1 f17403b;
    public final Object f17404c;
    public final Object d;
    public final Object e;

    public o9(f1 f1Var, Object obj, Object obj2, Object obj3, int i10) {
        this.f17402a = i10;
        this.f17403b = f1Var;
        this.f17404c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer num;
        int i10 = this.f17402a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f17404c;
        f1 f1Var = this.f17403b;
        switch (i10) {
            case 0:
                y9 y9Var = (y9) f1Var;
                z70 z70Var = (z70) obj5;
                v9 v9Var = (v9) obj4;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) obj3;
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    z70Var.a(Boolean.FALSE, tL_error.text);
                    v9Var.f18601f = false;
                    return;
                } else if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    z70Var.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                    v9Var.f18601f = false;
                    return;
                } else {
                    TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                    tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
                    tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
                    y9Var.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new a3.b(1), new p9(y9Var, v9Var, z70Var));
                    return;
                }
            case 1:
                vi viVar = (vi) f1Var;
                ti tiVar = (ti) obj5;
                ui uiVar = (ui) obj4;
                r20 r20Var = (r20) obj3;
                TLRPC.messages_FoundStickers messages_foundstickers = (TLRPC.messages_FoundStickers) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                viVar.P1.remove(tiVar);
                if (uiVar == null) {
                    uiVar = new ui();
                }
                ArrayList arrayList = uiVar.f18433a;
                if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
                    TLRPC.TL_messages_foundStickers tL_messages_foundStickers = (TLRPC.TL_messages_foundStickers) messages_foundstickers;
                    arrayList.addAll(tL_messages_foundStickers.stickers);
                    if ((tL_messages_foundStickers.flags & 1) != 0) {
                        num = Integer.valueOf(tL_messages_foundStickers.next_offset);
                    } else {
                        num = null;
                    }
                    uiVar.f18434b = num;
                }
                viVar.Q1.put(tiVar, uiVar);
                r20Var.a(arrayList);
                return;
            default:
                vi viVar2 = (vi) f1Var;
                r20 r20Var2 = (r20) obj4;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                viVar2.I0.remove((String) obj5);
                if (r20Var2 != null) {
                    r20Var2.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        viVar2.I.k(tL_messages_stickerSet, stickerSet.f19821id);
                        viVar2.N.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        boolean z10 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                        if (z10) {
                            viVar2.O = tL_messages_stickerSet;
                        }
                        if (z10) {
                            viVar2.P = tL_messages_stickerSet;
                        }
                    }
                    viVar2.U1(tL_messages_stickerSet);
                    viVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.f19821id), tL_messages_stickerSet);
                    return;
                }
                return;
        }
    }
}
