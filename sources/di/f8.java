package di;

import android.content.Context;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class f8 implements w10 {
    public final y8 f8816a;
    public final long f8817b;
    public final boolean[] f8818c;
    public final w10 d;
    public final Context f8819e;
    public final org.telegram.ui.ActionBar.i6 f8820f;
    public final boolean f8821g;
    public final String h;
    public final fj f8822i;
    public final TLRPC.InputInvoice f8823j;
    public final TLRPC.TL_payments_paymentFormStars f8824k;
    public final int f8825l;
    public final long f8826m;

    public f8(y8 y8Var, long j3, boolean[] zArr, w10 w10Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, String str, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.f8816a = y8Var;
        this.f8817b = j3;
        this.f8818c = zArr;
        this.d = w10Var;
        this.f8819e = context;
        this.f8820f = i6Var;
        this.f8821g = z10;
        this.h = str;
        this.f8822i = fjVar;
        this.f8823j = inputInvoice;
        this.f8824k = tL_payments_paymentFormStars;
        this.f8825l = i7;
        this.f8826m = j10;
    }

    @Override
    public final void a(Object obj) {
        w10 w10Var = (w10) obj;
        y8 y8Var = this.f8816a;
        long j3 = y8Var.f10050f.amount;
        long j10 = this.f8817b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f8818c;
        w10 w10Var2 = this.d;
        fj fjVar = this.f8822i;
        TLRPC.InputInvoice inputInvoice = this.f8823j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f8824k;
        int i10 = this.f8825l;
        if (i7 < 0) {
            boolean z10 = mp.u1(y8Var.f10046a).f25802m7;
            Context context = this.f8819e;
            org.telegram.ui.ActionBar.i6 i6Var = this.f8820f;
            int i11 = 0;
            if (z10) {
                if (w10Var != null) {
                    w10Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && w10Var2 != null) {
                    w10Var2.a("cancelled");
                    zArr[0] = true;
                }
                y8.c0(context, i6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f8821g) {
                i11 = 9;
            }
            fb fbVar = new fb(context, i6Var, j10, i11, this.h, new k8(y8Var, zArr2, fjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, w10Var2, w10Var), this.f8826m);
            fbVar.setOnDismissListener(new n6(y8Var, w10Var, zArr2, zArr, w10Var2, 1));
            fbVar.show();
            return;
        }
        y8Var.Y(fjVar, inputInvoice, tL_payments_paymentFormStars, new u6(y8Var, i10, w10Var, zArr, w10Var2));
    }
}
