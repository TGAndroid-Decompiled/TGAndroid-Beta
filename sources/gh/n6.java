package gh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Utilities.Callback {
    public final v7 f8605a;
    public final long f8606b;
    public final boolean[] f8607c;
    public final Utilities.Callback d;
    public final Context f8608e;
    public final org.telegram.ui.ActionBar.b6 f8609f;
    public final boolean f8610g;
    public final String h;
    public final MessageObject f8611i;
    public final TLRPC.InputInvoice f8612j;
    public final TLRPC.TL_payments_paymentFormStars f8613k;
    public final int f8614l;
    public final long f8615m;

    public n6(v7 v7Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i9, long j11) {
        this.f8605a = v7Var;
        this.f8606b = j10;
        this.f8607c = zArr;
        this.d = callback;
        this.f8608e = context;
        this.f8609f = b6Var;
        this.f8610g = z10;
        this.h = str;
        this.f8611i = messageObject;
        this.f8612j = inputInvoice;
        this.f8613k = tL_payments_paymentFormStars;
        this.f8614l = i9;
        this.f8615m = j11;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v7 v7Var = this.f8605a;
        long j10 = v7Var.f9049f.amount;
        long j11 = this.f8606b;
        boolean[] zArr = this.f8607c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.f8611i;
        TLRPC.InputInvoice inputInvoice = this.f8612j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f8613k;
        int i9 = this.f8614l;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(v7Var.f9045a).starsPurchaseAvailable();
            Context context = this.f8608e;
            org.telegram.ui.ActionBar.b6 b6Var = this.f8609f;
            int i10 = 0;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled");
                    zArr[0] = true;
                }
                v7.e0(context, b6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f8610g) {
                i10 = 9;
            }
            ea eaVar = new ea(context, b6Var, j11, i10, this.h, new u6(v7Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i9, callback2, callback), this.f8615m);
            eaVar.setOnDismissListener(new s5(v7Var, callback, zArr2, zArr, callback2, 1));
            eaVar.show();
            return;
        }
        v7Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new v6(v7Var, i9, callback, zArr, callback2));
    }
}
