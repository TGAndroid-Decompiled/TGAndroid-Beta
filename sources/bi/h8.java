package bi;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dj;
import org.telegram.ui.lh1;
public final class h8 implements Runnable {
    public final int f3095a;
    public final Object f3096b;
    public final Object f3097c;
    public final Object d;
    public final Object f3098e;
    public final Object f3099f;
    public final Object h;

    public h8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3095a = i10;
        this.f3096b = obj;
        this.f3097c = obj2;
        this.d = obj3;
        this.f3098e = obj4;
        this.f3099f = obj5;
        this.h = obj6;
    }

    private final void a() {
        zh.s5 s5Var = (zh.s5) this.f3096b;
        List list = (List) this.f3097c;
        f0 f0Var = (f0) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f3098e;
        c5.h hVar = (c5.h) this.f3099f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new zh.i4(f0Var, 0));
            return;
        }
        c5.o oVar = (c5.o) list.get(0);
        if (oVar.a() == null) {
            AndroidUtilities.runOnUIThread(new zh.i4(f0Var, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(s5Var.f52597a).sendRequest(tL_payments_canPurchaseStore, new lh1(oVar, hVar, f0Var, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void b() {
        zh.s5 s5Var = (zh.s5) this.f3096b;
        Runnable runnable = (Runnable) this.f3097c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f3098e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f3099f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (!s5Var.f52600e) {
            zh.s5.e("NO_BALANCE");
            runnable.run();
            return;
        }
        s5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
    }

    private final void c() {
        String str;
        zh.s5 s5Var = (zh.s5) this.f3096b;
        TLObject tLObject = (TLObject) this.f3097c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f3098e;
        dj djVar = (dj) this.f3099f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            s5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, djVar, null);
        } else {
            if (tL_error == null) {
                str = "NO_PAYMENT_FORM";
            } else {
                str = tL_error.text;
            }
            zh.s5.e(str);
        }
        djVar.run();
    }

    private final void e() {
        ((boolean[]) this.f3097c)[0] = true;
        ((zh.s5) this.f3096b).a0((MessageObject) this.d, (TLRPC.InputInvoice) this.f3098e, (TLRPC.TL_payments_paymentFormStars) this.f3099f, new zh.w0(1, (Utilities.Callback) this.h));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.h8.run():void");
    }

    public h8(org.telegram.ui.ub ubVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.sa saVar) {
        this.f3095a = 5;
        this.f3096b = ubVar;
        this.f3099f = channelParticipant;
        this.f3097c = arrayList;
        this.d = arrayList2;
        this.f3098e = arrayList3;
        this.h = saVar;
    }
}
