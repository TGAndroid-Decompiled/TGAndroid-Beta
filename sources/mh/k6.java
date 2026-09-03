package mh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Utilities.Callback {
    public final t7 f14354a;
    public final long f14355b;
    public final boolean[] f14356c;
    public final Utilities.Callback d;
    public final Context f14357e;
    public final org.telegram.ui.ActionBar.g6 f14358f;
    public final boolean f14359g;
    public final String h;
    public final MessageObject f14360i;
    public final TLRPC.InputInvoice f14361j;
    public final TLRPC.TL_payments_paymentFormStars f14362k;
    public final int f14363l;
    public final long f14364m;

    public k6(t7 t7Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f14354a = t7Var;
        this.f14355b = j10;
        this.f14356c = zArr;
        this.d = callback;
        this.f14357e = context;
        this.f14358f = g6Var;
        this.f14359g = z4;
        this.h = str;
        this.f14360i = messageObject;
        this.f14361j = inputInvoice;
        this.f14362k = tL_payments_paymentFormStars;
        this.f14363l = i10;
        this.f14364m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t7 t7Var = this.f14354a;
        long j10 = t7Var.f14834f.amount;
        long j11 = this.f14355b;
        boolean[] zArr = this.f14356c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f14360i;
        TLRPC.InputInvoice inputInvoice = this.f14361j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f14362k;
        int i10 = this.f14363l;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(t7Var.f14830a).starsPurchaseAvailable();
            Context context = this.f14357e;
            org.telegram.ui.ActionBar.g6 g6Var = this.f14358f;
            int i11 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                t7.e0(context, g6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f14359g) {
                i11 = 9;
            }
            z9 z9Var = new z9(context, g6Var, j11, i11, this.h, new s6(t7Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.f14364m);
            z9Var.setOnDismissListener(new p5(t7Var, callback, zArr2, zArr, callback2, 1));
            z9Var.show();
            return;
        }
        t7Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new t6(t7Var, i10, callback, zArr, callback2));
    }
}
