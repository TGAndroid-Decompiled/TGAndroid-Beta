package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w95 implements RequestDelegate {
    public final byte a = 0;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;

    public w95(wsa wsaVar, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j, long j2, qac qacVar) {
        this.d = wsaVar;
        this.e = tL_inputInvoiceStarGiftTransfer;
        this.b = j;
        this.c = j2;
        this.f = qacVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((GroupCallMessagesController) obj3).lambda$sendCallMessage$6((v95) obj2, (GroupCallMessage) obj, this.b, this.c, tLObject, tL_error);
                return;
            default:
                final wsa wsaVar = (wsa) obj3;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = (TLRPC.TL_inputInvoiceStarGiftTransfer) obj2;
                final qac qacVar = (qac) obj;
                final long j = this.b;
                final long j2 = this.c;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.PaymentForm;
                        wsa wsaVar2 = wsa.this;
                        qac qacVar2 = qacVar;
                        if (z) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                            int i = 0;
                            oc7.r1(wsaVar2.a).d4(paymentForm.users, false);
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                            int size = arrayList.size();
                            long j3 = 0;
                            while (i < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                                i++;
                                j3 += tL_labeledPrice.amount;
                            }
                            ConnectionsManager.getInstance(wsaVar2.a).sendRequest(tL_payments_sendStarsForm, new zpa(wsaVar2, j, j2, qacVar2, j3));
                            return;
                        }
                        TLRPC.TL_error tL_error2 = tL_error;
                        qacVar2.a(tL_error2);
                        u31 Z = wsaVar2.j().Z(tL_error2);
                        Z.u = true;
                        Z.j();
                    }
                });
                return;
        }
    }

    public w95(GroupCallMessagesController groupCallMessagesController, v95 v95Var, GroupCallMessage groupCallMessage, long j, long j2) {
        this.d = groupCallMessagesController;
        this.e = v95Var;
        this.f = groupCallMessage;
        this.b = j;
        this.c = j2;
    }
}
