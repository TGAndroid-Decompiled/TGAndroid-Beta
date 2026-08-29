package jh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Utilities.Callback {
    public final s7 f12367a;
    public final long f12368b;
    public final boolean[] f12369c;
    public final Utilities.Callback d;
    public final Context f12370e;
    public final org.telegram.ui.ActionBar.c6 f12371f;
    public final boolean f12372g;
    public final String h;
    public final MessageObject f12373i;
    public final TLRPC.InputInvoice f12374j;
    public final TLRPC.TL_payments_paymentFormStars f12375k;
    public final int f12376l;
    public final long f12377m;

    public k6(s7 s7Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f12367a = s7Var;
        this.f12368b = j10;
        this.f12369c = zArr;
        this.d = callback;
        this.f12370e = context;
        this.f12371f = c6Var;
        this.f12372g = z10;
        this.h = str;
        this.f12373i = messageObject;
        this.f12374j = inputInvoice;
        this.f12375k = tL_payments_paymentFormStars;
        this.f12376l = i10;
        this.f12377m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s7 s7Var = this.f12367a;
        long j10 = s7Var.f12791f.amount;
        long j11 = this.f12368b;
        boolean[] zArr = this.f12369c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f12373i;
        TLRPC.InputInvoice inputInvoice = this.f12374j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f12375k;
        int i10 = this.f12376l;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(s7Var.f12787a).starsPurchaseAvailable();
            Context context = this.f12370e;
            org.telegram.ui.ActionBar.c6 c6Var = this.f12371f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                s7.e0(context, c6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f12372g) {
                i11 = 9;
            }
            y9 y9Var = new y9(context, c6Var, j11, i11, this.h, new r6(s7Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f12377m);
            y9Var.setOnDismissListener(new p5(s7Var, callback, zArr2, zArr, callback2, 1));
            y9Var.show();
            return;
        }
        s7Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new s6(s7Var, i10, callback, zArr, callback2));
    }
}
