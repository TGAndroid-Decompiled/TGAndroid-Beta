package di;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j2 implements RequestDelegate {
    public final int f9069a = 0;
    public final long f9070b;
    public final long f9071c;
    public final Object d;
    public final Object f9072e;
    public final Object f9073f;

    public j2(f6 f6Var, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, x10 x10Var) {
        this.d = f6Var;
        this.f9072e = tL_inputInvoiceStarGiftTransfer;
        this.f9070b = j3;
        this.f9071c = j10;
        this.f9073f = x10Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9069a) {
            case 0:
                final f6 f6Var = (f6) this.d;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = (TLRPC.TL_inputInvoiceStarGiftTransfer) this.f9072e;
                final x10 x10Var = (x10) this.f9073f;
                final long j3 = this.f9070b;
                final long j10 = this.f9071c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.PaymentForm;
                        f6 f6Var2 = f6.this;
                        x10 x10Var2 = x10Var;
                        if (z10) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                            int i7 = 0;
                            mp.u1(f6Var2.f30189a).f4(paymentForm.users, false);
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
                            ConnectionsManager.getInstance(f6Var2.f30189a).sendRequest(tL_payments_sendStarsForm, new g2(f6Var2, j3, j10, x10Var2, j11));
                            return;
                        }
                        TLRPC.TL_error tL_error2 = tL_error;
                        x10Var2.a(tL_error2);
                        org.telegram.ui.Components.gc Z = f6Var2.k().Z(tL_error2);
                        Z.f35471t = true;
                        Z.j();
                    }
                });
                return;
            default:
                ((GroupCallMessagesController) this.d).lambda$sendCallMessage$6((org.telegram.messenger.voip.f) this.f9072e, (GroupCallMessage) this.f9073f, this.f9070b, this.f9071c, tLObject, tL_error);
                return;
        }
    }

    public j2(GroupCallMessagesController groupCallMessagesController, org.telegram.messenger.voip.f fVar, GroupCallMessage groupCallMessage, long j3, long j10) {
        this.d = groupCallMessagesController;
        this.f9072e = fVar;
        this.f9073f = groupCallMessage;
        this.f9070b = j3;
        this.f9071c = j10;
    }
}
