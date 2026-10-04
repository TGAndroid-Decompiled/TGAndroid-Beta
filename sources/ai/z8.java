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
import org.telegram.ui.bj;
import org.telegram.ui.fh1;
public final class z8 implements Runnable {
    public final int f1939a;
    public final Object f1940b;
    public final Object f1941c;
    public final Object d;
    public final Object f1942e;
    public final Object f1943f;
    public final Object h;

    public z8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f1939a = i10;
        this.f1940b = obj;
        this.f1941c = obj2;
        this.d = obj3;
        this.f1942e = obj4;
        this.f1943f = obj5;
        this.h = obj6;
    }

    private final void a() {
        yh.t5 t5Var = (yh.t5) this.f1940b;
        List list = (List) this.f1941c;
        m0 m0Var = (m0) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f1942e;
        c5.h hVar = (c5.h) this.f1943f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yh.j4(m0Var, 0));
            return;
        }
        c5.o oVar = (c5.o) list.get(0);
        if (oVar.a() == null) {
            AndroidUtilities.runOnUIThread(new yh.j4(m0Var, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(t5Var.f52010a).sendRequest(tL_payments_canPurchaseStore, new fh1(oVar, hVar, m0Var, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void b() {
        yh.t5 t5Var = (yh.t5) this.f1940b;
        Runnable runnable = (Runnable) this.f1941c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f1942e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f1943f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (!t5Var.f52013e) {
            yh.t5.e("NO_BALANCE");
            runnable.run();
            return;
        }
        t5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
    }

    private final void c() {
        String str;
        yh.t5 t5Var = (yh.t5) this.f1940b;
        TLObject tLObject = (TLObject) this.f1941c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f1942e;
        bj bjVar = (bj) this.f1943f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            t5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, bjVar, null);
        } else {
            if (tL_error == null) {
                str = "NO_PAYMENT_FORM";
            } else {
                str = tL_error.text;
            }
            yh.t5.e(str);
        }
        bjVar.run();
    }

    private final void e() {
        ((boolean[]) this.f1941c)[0] = true;
        ((yh.t5) this.f1940b).a0((MessageObject) this.d, (TLRPC.InputInvoice) this.f1942e, (TLRPC.TL_payments_paymentFormStars) this.f1943f, new yh.w0(1, (Utilities.Callback) this.h));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z8.run():void");
    }

    public z8(org.telegram.ui.wb wbVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.ta taVar) {
        this.f1939a = 5;
        this.f1940b = wbVar;
        this.f1943f = channelParticipant;
        this.f1941c = arrayList;
        this.d = arrayList2;
        this.f1942e = arrayList3;
        this.h = taVar;
    }
}
