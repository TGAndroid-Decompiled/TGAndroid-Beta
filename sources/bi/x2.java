package bi;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x2 implements RequestDelegate {
    public final int f5018a = 0;
    public final long f5019b;
    public final long f5020c;
    public final Object d;
    public final Object f5021e;
    public final Object f5022f;

    public x2(k7 k7Var, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, c20 c20Var) {
        this.d = k7Var;
        this.f5021e = tL_inputInvoiceStarGiftTransfer;
        this.f5019b = j3;
        this.f5020c = j10;
        this.f5022f = c20Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f5018a) {
            case 0:
                final k7 k7Var = (k7) this.d;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = (TLRPC.TL_inputInvoiceStarGiftTransfer) this.f5021e;
                final c20 c20Var = (c20) this.f5022f;
                final long j3 = this.f5019b;
                final long j10 = this.f5020c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z9 = tLObject2 instanceof TLRPC.PaymentForm;
                        k7 k7Var2 = k7.this;
                        c20 c20Var2 = c20Var;
                        if (z9) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                            int i7 = 0;
                            qp.s1(k7Var2.f28669a).Y3(paymentForm.users, false);
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                            int size = arrayList.size();
                            long j11 = 0;
                            while (i7 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                                i7++;
                                j11 += tL_labeledPrice.amount;
                            }
                            ConnectionsManager.getInstance(k7Var2.f28669a).sendRequest(tL_payments_sendStarsForm, new t2(k7Var2, j3, j10, c20Var2, j11));
                            return;
                        }
                        TLRPC.TL_error tL_error2 = tL_error;
                        c20Var2.a(tL_error2);
                        org.telegram.ui.Components.bc Y = k7Var2.k().Y(tL_error2);
                        Y.f32213t = true;
                        Y.j();
                    }
                });
                return;
            default:
                ((GroupCallMessagesController) this.d).lambda$sendCallMessage$6((org.telegram.messenger.voip.f) this.f5021e, (GroupCallMessage) this.f5022f, this.f5019b, this.f5020c, tLObject, tL_error);
                return;
        }
    }

    public x2(GroupCallMessagesController groupCallMessagesController, org.telegram.messenger.voip.f fVar, GroupCallMessage groupCallMessage, long j3, long j10) {
        this.d = groupCallMessagesController;
        this.f5021e = fVar;
        this.f5022f = groupCallMessage;
        this.f5019b = j3;
        this.f5020c = j10;
    }
}
