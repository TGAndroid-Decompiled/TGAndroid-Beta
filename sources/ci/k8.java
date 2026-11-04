package ci;

import android.content.Context;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public final class k8 implements u10 {
    public final e9 f5394a;
    public final long f5395b;
    public final boolean[] f5396c;
    public final u10 d;
    public final Context f5397e;
    public final org.telegram.ui.ActionBar.e6 f5398f;
    public final boolean f5399g;
    public final String h;
    public final zi f5400i;
    public final TLRPC.InputInvoice f5401j;
    public final TLRPC.TL_payments_paymentFormStars f5402k;
    public final int f5403l;
    public final long f5404m;

    public k8(e9 e9Var, long j10, boolean[] zArr, u10 u10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, zi ziVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i3, long j11) {
        this.f5394a = e9Var;
        this.f5395b = j10;
        this.f5396c = zArr;
        this.d = u10Var;
        this.f5397e = context;
        this.f5398f = e6Var;
        this.f5399g = z10;
        this.h = str;
        this.f5400i = ziVar;
        this.f5401j = inputInvoice;
        this.f5402k = tL_payments_paymentFormStars;
        this.f5403l = i3;
        this.f5404m = j11;
    }

    @Override
    public final void a(Object obj) {
        u10 u10Var = (u10) obj;
        e9 e9Var = this.f5394a;
        long j10 = e9Var.f5033f.amount;
        long j11 = this.f5395b;
        int i3 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.f5396c;
        u10 u10Var2 = this.d;
        zi ziVar = this.f5400i;
        TLRPC.InputInvoice inputInvoice = this.f5401j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f5402k;
        int i10 = this.f5403l;
        if (i3 < 0) {
            boolean z10 = hp.s1(e9Var.f5029a).f23042j7;
            Context context = this.f5397e;
            org.telegram.ui.ActionBar.e6 e6Var = this.f5398f;
            int i11 = 0;
            if (z10) {
                if (u10Var != null) {
                    u10Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && u10Var2 != null) {
                    u10Var2.a("cancelled");
                    zArr[0] = true;
                }
                e9.c0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f5399g) {
                i11 = 9;
            }
            mb mbVar = new mb(context, e6Var, j11, i11, this.h, new p8(e9Var, zArr2, ziVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, u10Var2, u10Var), this.f5404m);
            mbVar.setOnDismissListener(new t6(e9Var, u10Var, zArr2, zArr, u10Var2, 1));
            mbVar.show();
            return;
        }
        e9Var.Z(ziVar, inputInvoice, tL_payments_paymentFormStars, new a7(e9Var, i10, u10Var, zArr, u10Var2));
    }
}
