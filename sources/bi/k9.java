package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class k9 implements c20 {
    public final ea f4214a;
    public final long f4215b;
    public final boolean[] f4216c;
    public final c20 d;
    public final Context f4217e;
    public final org.telegram.ui.ActionBar.g6 f4218f;
    public final boolean f4219g;
    public final String h;
    public final ij f4220i;
    public final TLRPC.InputInvoice f4221j;
    public final TLRPC.TL_payments_paymentFormStars f4222k;
    public final int f4223l;
    public final long f4224m;

    public k9(ea eaVar, long j3, boolean[] zArr, c20 c20Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, String str, ij ijVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.f4214a = eaVar;
        this.f4215b = j3;
        this.f4216c = zArr;
        this.d = c20Var;
        this.f4217e = context;
        this.f4218f = g6Var;
        this.f4219g = z9;
        this.h = str;
        this.f4220i = ijVar;
        this.f4221j = inputInvoice;
        this.f4222k = tL_payments_paymentFormStars;
        this.f4223l = i7;
        this.f4224m = j10;
    }

    @Override
    public final void a(Object obj) {
        c20 c20Var = (c20) obj;
        ea eaVar = this.f4214a;
        long j3 = eaVar.f3811f.amount;
        long j10 = this.f4215b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f4216c;
        c20 c20Var2 = this.d;
        ij ijVar = this.f4220i;
        TLRPC.InputInvoice inputInvoice = this.f4221j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f4222k;
        int i10 = this.f4223l;
        if (i7 < 0) {
            boolean z9 = qp.s1(eaVar.f3807a).f24817j7;
            Context context = this.f4217e;
            org.telegram.ui.ActionBar.g6 g6Var = this.f4218f;
            int i11 = 0;
            if (z9) {
                if (c20Var != null) {
                    c20Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && c20Var2 != null) {
                    c20Var2.a("cancelled");
                    zArr[0] = true;
                }
                ea.c0(context, g6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f4219g) {
                i11 = 9;
            }
            tc tcVar = new tc(context, g6Var, j10, i11, this.h, new p9(eaVar, zArr2, ijVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, c20Var2, c20Var), this.f4224m);
            tcVar.setOnDismissListener(new s7(eaVar, c20Var, zArr2, zArr, c20Var2, 1));
            tcVar.show();
            return;
        }
        eaVar.Z(ijVar, inputInvoice, tL_payments_paymentFormStars, new z7(eaVar, i10, c20Var, zArr, c20Var2));
    }
}
