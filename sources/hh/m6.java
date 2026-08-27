package hh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class m6 implements Utilities.Callback {

    public final u7 f9733a;

    public final long f9734b;

    public final boolean[] f9735c;
    public final Utilities.Callback d;

    public final Context f9736e;

    public final org.telegram.ui.ActionBar.c6 f9737f;

    public final boolean f9738g;
    public final String h;

    public final MessageObject f9739i;

    public final TLRPC.InputInvoice f9740j;

    public final TLRPC.TL_payments_paymentFormStars f9741k;

    public final int f9742l;

    public final long f9743m;

    public m6(u7 u7Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f9733a = u7Var;
        this.f9734b = j10;
        this.f9735c = zArr;
        this.d = callback;
        this.f9736e = context;
        this.f9737f = c6Var;
        this.f9738g = z10;
        this.h = str;
        this.f9739i = messageObject;
        this.f9740j = inputInvoice;
        this.f9741k = tL_payments_paymentFormStars;
        this.f9742l = i10;
        this.f9743m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u7 u7Var = this.f9733a;
        long j10 = u7Var.f10155f.amount;
        long j11 = this.f9734b;
        boolean[] zArr = this.f9735c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f9739i;
        TLRPC.InputInvoice inputInvoice = this.f9740j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f9741k;
        int i10 = this.f9742l;
        if (j10 >= j11) {
            u7Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new u6(u7Var, i10, callback, zArr, callback2));
            return;
        }
        boolean zStarsPurchaseAvailable = MessagesController.getInstance(u7Var.f10151a).starsPurchaseAvailable();
        Context context = this.f9736e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f9737f;
        if (zStarsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            ea eaVar = new ea(context, c6Var, j11, this.f9738g ? 9 : 0, this.h, new t6(u7Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f9743m);
            eaVar.setOnDismissListener(new r5(u7Var, callback, zArr2, zArr, callback2, 1));
            eaVar.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback2 != null) {
            callback2.run("cancelled");
            zArr[0] = true;
        }
        u7.e0(context, c6Var);
    }
}
