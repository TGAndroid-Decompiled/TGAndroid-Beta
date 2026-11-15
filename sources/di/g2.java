package di;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g2 implements RequestDelegate {
    public final int f8587a = 0;
    public final long f8588b;
    public final long f8589c;
    public final Object d;
    public final Object f8590e;
    public final Object f8591f;

    public g2(c6 c6Var, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, z10 z10Var) {
        this.d = c6Var;
        this.f8590e = tL_inputInvoiceStarGiftTransfer;
        this.f8588b = j3;
        this.f8589c = j10;
        this.f8591f = z10Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f8587a) {
            case 0:
                final c6 c6Var = (c6) this.d;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = (TLRPC.TL_inputInvoiceStarGiftTransfer) this.f8590e;
                final z10 z10Var = (z10) this.f8591f;
                final long j3 = this.f8588b;
                final long j10 = this.f8589c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.PaymentForm;
                        c6 c6Var2 = c6.this;
                        z10 z10Var2 = z10Var;
                        if (z10) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                            int i7 = 0;
                            np.s1(c6Var2.f29679a).Y3(paymentForm.users, false);
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
                            ConnectionsManager.getInstance(c6Var2.f29679a).sendRequest(tL_payments_sendStarsForm, new c2(c6Var2, j3, j10, z10Var2, j11));
                            return;
                        }
                        TLRPC.TL_error tL_error2 = tL_error;
                        z10Var2.a(tL_error2);
                        org.telegram.ui.Components.xb Y = c6Var2.k().Y(tL_error2);
                        Y.f41653t = true;
                        Y.j();
                    }
                });
                return;
            default:
                ((GroupCallMessagesController) this.d).lambda$sendCallMessage$6((org.telegram.messenger.voip.f) this.f8590e, (GroupCallMessage) this.f8591f, this.f8588b, this.f8589c, tLObject, tL_error);
                return;
        }
    }

    public g2(GroupCallMessagesController groupCallMessagesController, org.telegram.messenger.voip.f fVar, GroupCallMessage groupCallMessage, long j3, long j10) {
        this.d = groupCallMessagesController;
        this.f8590e = fVar;
        this.f8591f = groupCallMessage;
        this.f8588b = j3;
        this.f8589c = j10;
    }
}
