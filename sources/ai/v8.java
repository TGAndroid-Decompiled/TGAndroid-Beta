package ai;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Utilities.Callback {
    public final ga f2319a;
    public final long f2320b;
    public final boolean[] f2321c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.d6 f2322f;
    public final boolean f2323g;
    public final String h;
    public final MessageObject f2324i;
    public final TLRPC.InputInvoice f2325j;
    public final TLRPC.TL_payments_paymentFormStars f2326k;
    public final int f2327l;
    public final long f2328m;

    public v8(ga gaVar, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f2319a = gaVar;
        this.f2320b = j10;
        this.f2321c = zArr;
        this.d = callback;
        this.e = context;
        this.f2322f = d6Var;
        this.f2323g = z10;
        this.h = str;
        this.f2324i = messageObject;
        this.f2325j = inputInvoice;
        this.f2326k = tL_payments_paymentFormStars;
        this.f2327l = i10;
        this.f2328m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ga gaVar = this.f2319a;
        long j10 = gaVar.f1357f.amount;
        long j11 = this.f2320b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f2321c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f2324i;
        TLRPC.InputInvoice inputInvoice = this.f2325j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f2326k;
        int i11 = this.f2327l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(gaVar.f1354a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.d6 d6Var = this.f2322f;
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
            if (this.f2323g) {
                i12 = 9;
            }
            cd cdVar = new cd(context, d6Var, j11, i12, this.h, new c9(gaVar, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f2328m);
            cdVar.setOnDismissListener(new v7(gaVar, callback, zArr2, zArr, callback2, 1));
            cdVar.show();
            return;
        }
        gaVar.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new d9(gaVar, i11, callback, zArr, callback2));
    }
}
