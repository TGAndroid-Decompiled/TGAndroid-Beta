package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x75 implements RequestDelegate {
    public final byte a = 0;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;

    public x75(vqa vqaVar, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j, long j2, p8c p8cVar) {
        this.d = vqaVar;
        this.e = tL_inputInvoiceStarGiftTransfer;
        this.b = j;
        this.c = j2;
        this.f = p8cVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((GroupCallMessagesController) obj3).lambda$sendCallMessage$6((w75) obj2, (GroupCallMessage) obj, this.b, this.c, tLObject, tL_error);
                return;
            default:
                final vqa vqaVar = (vqa) obj3;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = (TLRPC.TL_inputInvoiceStarGiftTransfer) obj2;
                final p8c p8cVar = (p8c) obj;
                final long j = this.b;
                final long j2 = this.c;
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.PaymentForm;
                        vqa vqaVar2 = vqa.this;
                        p8c p8cVar2 = p8cVar;
                        if (z) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                            int i = 0;
                            na7.q1(vqaVar2.a).b4(paymentForm.users, false);
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
                            ConnectionsManager.getInstance(vqaVar2.a).sendRequest(tL_payments_sendStarsForm, new zna(vqaVar2, j, j2, p8cVar2, j3));
                            return;
                        }
                        TLRPC.TL_error tL_error2 = tL_error;
                        p8cVar2.a(tL_error2);
                        m21 Z = vqaVar2.j().Z(tL_error2);
                        Z.t = true;
                        Z.j();
                    }
                });
                return;
        }
    }

    public x75(GroupCallMessagesController groupCallMessagesController, w75 w75Var, GroupCallMessage groupCallMessage, long j, long j2) {
        this.d = groupCallMessagesController;
        this.e = w75Var;
        this.f = groupCallMessage;
        this.b = j;
        this.c = j2;
    }
}
