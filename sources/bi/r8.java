package bi;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r8 implements Utilities.Callback {
    public final ca f5351a;
    public final long f5352b;
    public final boolean[] f5353c;
    public final Utilities.Callback d;
    public final Context e;
    public final org.telegram.ui.ActionBar.u6 f5354f;
    public final boolean f5355g;
    public final String h;
    public final MessageObject f5356i;
    public final TLRPC.InputInvoice f5357j;
    public final TLRPC.TL_payments_paymentFormStars f5358k;
    public final int f5359l;
    public final long f5360m;

    public r8(ca caVar, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.f5351a = caVar;
        this.f5352b = j10;
        this.f5353c = zArr;
        this.d = callback;
        this.e = context;
        this.f5354f = u6Var;
        this.f5355g = z10;
        this.h = str;
        this.f5356i = messageObject;
        this.f5357j = inputInvoice;
        this.f5358k = tL_payments_paymentFormStars;
        this.f5359l = i10;
        this.f5360m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ca caVar = this.f5351a;
        long j10 = caVar.f4444f.amount;
        long j11 = this.f5352b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f5353c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f5356i;
        TLRPC.InputInvoice inputInvoice = this.f5357j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f5358k;
        int i11 = this.f5359l;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(caVar.f4441a).starsPurchaseAvailable();
            Context context = this.e;
            org.telegram.ui.ActionBar.u6 u6Var = this.f5354f;
            int i12 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                ca.e0(context, u6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f5355g) {
                i12 = 9;
            }
            tc tcVar = new tc(context, u6Var, j11, i12, this.h, new y8(caVar, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i11, callback2, callback), this.f5360m);
            tcVar.setOnDismissListener(new s7(caVar, callback, zArr2, zArr, callback2, 1));
            tcVar.show();
            return;
        }
        caVar.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new z8(caVar, i11, callback, zArr, callback2));
    }
}
