package di;

import android.content.Context;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class e8 implements x10 {
    public final x8 f8707a;
    public final long f8708b;
    public final boolean[] f8709c;
    public final x10 d;
    public final Context f8710e;
    public final org.telegram.ui.ActionBar.i6 f8711f;
    public final boolean f8712g;
    public final String h;
    public final fj f8713i;
    public final TLRPC.InputInvoice f8714j;
    public final TLRPC.TL_payments_paymentFormStars f8715k;
    public final int f8716l;
    public final long f8717m;

    public e8(x8 x8Var, long j3, boolean[] zArr, x10 x10Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, String str, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.f8707a = x8Var;
        this.f8708b = j3;
        this.f8709c = zArr;
        this.d = x10Var;
        this.f8710e = context;
        this.f8711f = i6Var;
        this.f8712g = z10;
        this.h = str;
        this.f8713i = fjVar;
        this.f8714j = inputInvoice;
        this.f8715k = tL_payments_paymentFormStars;
        this.f8716l = i7;
        this.f8717m = j10;
    }

    @Override
    public final void a(Object obj) {
        x10 x10Var = (x10) obj;
        x8 x8Var = this.f8707a;
        long j3 = x8Var.f10019f.amount;
        long j10 = this.f8708b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f8709c;
        x10 x10Var2 = this.d;
        fj fjVar = this.f8713i;
        TLRPC.InputInvoice inputInvoice = this.f8714j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f8715k;
        int i10 = this.f8716l;
        if (i7 < 0) {
            boolean z10 = mp.u1(x8Var.f10015a).f25707m7;
            Context context = this.f8710e;
            org.telegram.ui.ActionBar.i6 i6Var = this.f8711f;
            int i11 = 0;
            if (z10) {
                if (x10Var != null) {
                    x10Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && x10Var2 != null) {
                    x10Var2.a("cancelled");
                    zArr[0] = true;
                }
                x8.c0(context, i6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f8712g) {
                i11 = 9;
            }
            fb fbVar = new fb(context, i6Var, j10, i11, this.h, new j8(x8Var, zArr2, fjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, x10Var2, x10Var), this.f8717m);
            fbVar.setOnDismissListener(new n6(x8Var, x10Var, zArr2, zArr, x10Var2, 1));
            fbVar.show();
            return;
        }
        x8Var.Y(fjVar, inputInvoice, tL_payments_paymentFormStars, new u6(x8Var, i10, x10Var, zArr, x10Var2));
    }
}
