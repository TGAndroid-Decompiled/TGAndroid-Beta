package lh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Utilities.Callback {
    public final t7 f12722a;
    public final long f12723b;
    public final boolean[] f12724c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.f6 f12725f;
    public final boolean f12726g;
    public final String h;
    public final MessageObject f12727i;
    public final TLRPC.InputInvoice f12728j;
    public final TLRPC.TL_payments_paymentFormStars f12729k;
    public final int f12730l;
    public final long f12731m;

    public k6(t7 t7Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f12722a = t7Var;
        this.f12723b = j10;
        this.f12724c = zArr;
        this.d = callback;
        this.e = context;
        this.f12725f = f6Var;
        this.f12726g = z4;
        this.h = str;
        this.f12727i = messageObject;
        this.f12728j = inputInvoice;
        this.f12729k = tL_payments_paymentFormStars;
        this.f12730l = i10;
        this.f12731m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t7 t7Var = this.f12722a;
        long j10 = t7Var.f13152f.amount;
        long j11 = this.f12723b;
        boolean[] zArr = this.f12724c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f12727i;
        TLRPC.InputInvoice inputInvoice = this.f12728j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f12729k;
        int i10 = this.f12730l;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(t7Var.f13149a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.f6 f6Var = this.f12725f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                t7.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f12726g) {
                i11 = 9;
            }
            z9 z9Var = new z9(context, f6Var, j11, i11, this.h, new s6(t7Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f12731m);
            z9Var.setOnDismissListener(new p5(t7Var, callback, zArr2, zArr, callback2, 1));
            z9Var.show();
            return;
        }
        t7Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new t6(t7Var, i10, callback, zArr, callback2));
    }
}
