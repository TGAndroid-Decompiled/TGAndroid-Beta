package ai;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ej;
import org.telegram.ui.mh1;
public final class z8 implements Runnable {
    public final int f1792a;
    public final Object f1793b;
    public final Object f1794c;
    public final Object d;
    public final Object e;
    public final Object f1795f;
    public final Object h;

    public z8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f1792a = i10;
        this.f1793b = obj;
        this.f1794c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f1795f = obj5;
        this.h = obj6;
    }

    private final void a() {
        yh.v5 v5Var = (yh.v5) this.f1793b;
        List list = (List) this.f1794c;
        m0 m0Var = (m0) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
        c5.h hVar = (c5.h) this.f1795f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yh.m4(m0Var, 0));
            return;
        }
        c5.o oVar = (c5.o) list.get(0);
        if (oVar.a() == null) {
            AndroidUtilities.runOnUIThread(new yh.m4(m0Var, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(v5Var.f47918a).sendRequest(tL_payments_canPurchaseStore, new mh1(oVar, hVar, m0Var, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void b() {
        yh.v5 v5Var = (yh.v5) this.f1793b;
        Runnable runnable = (Runnable) this.f1794c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f1795f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (!v5Var.e) {
            yh.v5.e("NO_BALANCE");
            runnable.run();
            return;
        }
        v5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
    }

    private final void c() {
        String str;
        yh.v5 v5Var = (yh.v5) this.f1793b;
        TLObject tLObject = (TLObject) this.f1794c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        ej ejVar = (ej) this.f1795f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            v5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, ejVar, null);
        } else {
            if (tL_error == null) {
                str = "NO_PAYMENT_FORM";
            } else {
                str = tL_error.text;
            }
            yh.v5.e(str);
        }
        ejVar.run();
    }

    private final void e() {
        ((boolean[]) this.f1794c)[0] = true;
        ((yh.v5) this.f1793b).a0((MessageObject) this.d, (TLRPC.InputInvoice) this.e, (TLRPC.TL_payments_paymentFormStars) this.f1795f, new yh.w0(1, (Utilities.Callback) this.h));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z8.run():void");
    }

    public z8(org.telegram.ui.wb wbVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.ta taVar) {
        this.f1792a = 5;
        this.f1793b = wbVar;
        this.f1795f = channelParticipant;
        this.f1794c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.h = taVar;
    }
}
