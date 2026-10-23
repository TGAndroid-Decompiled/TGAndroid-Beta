package ai;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Utilities.Callback {
    public final ha f2376a;
    public final long f2377b;
    public final boolean[] f2378c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.g6 f2379f;
    public final boolean f2380g;
    public final String h;
    public final MessageObject f2381i;
    public final TLRPC.InputInvoice f2382j;
    public final TLRPC.TL_payments_paymentFormStars f2383k;
    public final int f2384l;
    public final long f2385m;

    public w8(ha haVar, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f2376a = haVar;
        this.f2377b = j10;
        this.f2378c = zArr;
        this.d = callback;
        this.e = context;
        this.f2379f = g6Var;
        this.f2380g = z10;
        this.h = str;
        this.f2381i = messageObject;
        this.f2382j = inputInvoice;
        this.f2383k = tL_payments_paymentFormStars;
        this.f2384l = i10;
        this.f2385m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ha haVar = this.f2376a;
        long j10 = haVar.f1416f.amount;
        long j11 = this.f2377b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f2378c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f2381i;
        TLRPC.InputInvoice inputInvoice = this.f2382j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f2383k;
        int i11 = this.f2384l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(haVar.f1413a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.g6 g6Var = this.f2379f;
            int i12 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                ha.e0(context, g6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f2380g) {
                i12 = 9;
            }
            dd ddVar = new dd(context, g6Var, j11, i12, this.h, new d9(haVar, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f2385m);
            ddVar.setOnDismissListener(new w7(haVar, callback, zArr2, zArr, callback2, 1));
            ddVar.show();
            return;
        }
        haVar.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new e9(haVar, i11, callback, zArr, callback2));
    }
}
