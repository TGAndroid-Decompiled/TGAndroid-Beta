package ai;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Utilities.Callback {
    public final ga f2373a;
    public final long f2374b;
    public final boolean[] f2375c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.d6 f2376f;
    public final boolean f2377g;
    public final String h;
    public final MessageObject f2378i;
    public final TLRPC.InputInvoice f2379j;
    public final TLRPC.TL_payments_paymentFormStars f2380k;
    public final int f2381l;
    public final long f2382m;

    public w8(ga gaVar, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f2373a = gaVar;
        this.f2374b = j10;
        this.f2375c = zArr;
        this.d = callback;
        this.e = context;
        this.f2376f = d6Var;
        this.f2377g = z10;
        this.h = str;
        this.f2378i = messageObject;
        this.f2379j = inputInvoice;
        this.f2380k = tL_payments_paymentFormStars;
        this.f2381l = i10;
        this.f2382m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ga gaVar = this.f2373a;
        long j10 = gaVar.f1366f.amount;
        long j11 = this.f2374b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f2375c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f2378i;
        TLRPC.InputInvoice inputInvoice = this.f2379j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f2380k;
        int i11 = this.f2381l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(gaVar.f1363a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f2376f;
            int i12 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                ga.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f2377g) {
                i12 = 9;
            }
            cd cdVar = new cd(context, d6Var, j11, i12, this.h, new d9(gaVar, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f2382m);
            cdVar.setOnDismissListener(new w7(gaVar, callback, zArr2, zArr, callback2, 1));
            cdVar.show();
            return;
        }
        gaVar.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new e9(gaVar, i11, callback, zArr, callback2));
    }
}
