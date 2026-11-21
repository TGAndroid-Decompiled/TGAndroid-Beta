package di;

import android.content.Context;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class f8 implements x10 {
    public final y8 f8852a;
    public final long f8853b;
    public final boolean[] f8854c;
    public final x10 d;
    public final Context f8855e;
    public final org.telegram.ui.ActionBar.h6 f8856f;
    public final boolean f8857g;
    public final String h;
    public final fj f8858i;
    public final TLRPC.InputInvoice f8859j;
    public final TLRPC.TL_payments_paymentFormStars f8860k;
    public final int f8861l;
    public final long f8862m;

    public f8(y8 y8Var, long j3, boolean[] zArr, x10 x10Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, String str, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.f8852a = y8Var;
        this.f8853b = j3;
        this.f8854c = zArr;
        this.d = x10Var;
        this.f8855e = context;
        this.f8856f = h6Var;
        this.f8857g = z10;
        this.h = str;
        this.f8858i = fjVar;
        this.f8859j = inputInvoice;
        this.f8860k = tL_payments_paymentFormStars;
        this.f8861l = i7;
        this.f8862m = j10;
    }

    @Override
    public final void a(Object obj) {
        x10 x10Var = (x10) obj;
        y8 y8Var = this.f8852a;
        long j3 = y8Var.f10086f.amount;
        long j10 = this.f8853b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f8854c;
        x10 x10Var2 = this.d;
        fj fjVar = this.f8858i;
        TLRPC.InputInvoice inputInvoice = this.f8859j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f8860k;
        int i10 = this.f8861l;
        if (i7 < 0) {
            boolean z10 = mp.u1(y8Var.f10082a).f25735m7;
            Context context = this.f8855e;
            org.telegram.ui.ActionBar.h6 h6Var = this.f8856f;
            int i11 = 0;
            if (z10) {
                if (x10Var != null) {
                    x10Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && x10Var2 != null) {
                    x10Var2.a("cancelled");
                    zArr[0] = true;
                }
                y8.c0(context, h6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f8857g) {
                i11 = 9;
            }
            fb fbVar = new fb(context, h6Var, j10, i11, this.h, new k8(y8Var, zArr2, fjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, x10Var2, x10Var), this.f8862m);
            fbVar.setOnDismissListener(new n6(y8Var, x10Var, zArr2, zArr, x10Var2, 1));
            fbVar.show();
            return;
        }
        y8Var.Y(fjVar, inputInvoice, tL_payments_paymentFormStars, new u6(y8Var, i10, x10Var, zArr, x10Var2));
    }
}
