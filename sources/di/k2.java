package di;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k2 implements RequestDelegate {
    public final int f9125a = 0;
    public final long f9126b;
    public final long f9127c;
    public final Object d;
    public final Object f9128e;
    public final Object f9129f;

    public k2(f6 f6Var, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, w10 w10Var) {
        this.d = f6Var;
        this.f9128e = tL_inputInvoiceStarGiftTransfer;
        this.f9126b = j3;
        this.f9127c = j10;
        this.f9129f = w10Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9125a) {
            case 0:
                final f6 f6Var = (f6) this.d;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = (TLRPC.TL_inputInvoiceStarGiftTransfer) this.f9128e;
                final w10 w10Var = (w10) this.f9129f;
                final long j3 = this.f9126b;
                final long j10 = this.f9127c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.PaymentForm;
                        f6 f6Var2 = f6.this;
                        w10 w10Var2 = w10Var;
                        if (z10) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                            int i7 = 0;
                            mp.u1(f6Var2.f30223a).f4(paymentForm.users, false);
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
                            ConnectionsManager.getInstance(f6Var2.f30223a).sendRequest(tL_payments_sendStarsForm, new h2(f6Var2, j3, j10, w10Var2, j11));
                            return;
                        }
                        TLRPC.TL_error tL_error2 = tL_error;
                        w10Var2.a(tL_error2);
                        org.telegram.ui.Components.fc Z = f6Var2.k().Z(tL_error2);
                        Z.f35101t = true;
                        Z.j();
                    }
                });
                return;
            default:
                ((GroupCallMessagesController) this.d).lambda$sendCallMessage$6((org.telegram.messenger.voip.f) this.f9128e, (GroupCallMessage) this.f9129f, this.f9126b, this.f9127c, tLObject, tL_error);
                return;
        }
    }

    public k2(GroupCallMessagesController groupCallMessagesController, org.telegram.messenger.voip.f fVar, GroupCallMessage groupCallMessage, long j3, long j10) {
        this.d = groupCallMessagesController;
        this.f9128e = fVar;
        this.f9129f = groupCallMessage;
        this.f9126b = j3;
        this.f9127c = j10;
    }
}
