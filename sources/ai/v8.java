package ai;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Utilities.Callback {
    public final fa f2317a;
    public final long f2318b;
    public final boolean[] f2319c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.d6 f2320f;
    public final boolean f2321g;
    public final String h;
    public final MessageObject f2322i;
    public final TLRPC.InputInvoice f2323j;
    public final TLRPC.TL_payments_paymentFormStars f2324k;
    public final int f2325l;
    public final long f2326m;

    public v8(fa faVar, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f2317a = faVar;
        this.f2318b = j10;
        this.f2319c = zArr;
        this.d = callback;
        this.e = context;
        this.f2320f = d6Var;
        this.f2321g = z10;
        this.h = str;
        this.f2322i = messageObject;
        this.f2323j = inputInvoice;
        this.f2324k = tL_payments_paymentFormStars;
        this.f2325l = i10;
        this.f2326m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        fa faVar = this.f2317a;
        long j10 = faVar.f1314f.amount;
        long j11 = this.f2318b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f2319c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f2322i;
        TLRPC.InputInvoice inputInvoice = this.f2323j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f2324k;
        int i11 = this.f2325l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(faVar.f1311a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f2320f;
            int i12 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                fa.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f2321g) {
                i12 = 9;
            }
            bd bdVar = new bd(context, d6Var, j11, i12, this.h, new c9(faVar, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f2326m);
            bdVar.setOnDismissListener(new v7(faVar, callback, zArr2, zArr, callback2, 1));
            bdVar.show();
            return;
        }
        faVar.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new d9(faVar, i11, callback, zArr, callback2));
    }
}
