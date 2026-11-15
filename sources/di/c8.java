package di;

import android.content.Context;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class c8 implements z10 {
    public final v8 f8364a;
    public final long f8365b;
    public final boolean[] f8366c;
    public final z10 d;
    public final Context f8367e;
    public final org.telegram.ui.ActionBar.e6 f8368f;
    public final boolean f8369g;
    public final String h;
    public final gj f8370i;
    public final TLRPC.InputInvoice f8371j;
    public final TLRPC.TL_payments_paymentFormStars f8372k;
    public final int f8373l;
    public final long f8374m;

    public c8(v8 v8Var, long j3, boolean[] zArr, z10 z10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.f8364a = v8Var;
        this.f8365b = j3;
        this.f8366c = zArr;
        this.d = z10Var;
        this.f8367e = context;
        this.f8368f = e6Var;
        this.f8369g = z10;
        this.h = str;
        this.f8370i = gjVar;
        this.f8371j = inputInvoice;
        this.f8372k = tL_payments_paymentFormStars;
        this.f8373l = i7;
        this.f8374m = j10;
    }

    @Override
    public final void a(Object obj) {
        z10 z10Var = (z10) obj;
        v8 v8Var = this.f8364a;
        long j3 = v8Var.f9602f.amount;
        long j10 = this.f8365b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f8366c;
        z10 z10Var2 = this.d;
        gj gjVar = this.f8370i;
        TLRPC.InputInvoice inputInvoice = this.f8371j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f8372k;
        int i10 = this.f8373l;
        if (i7 < 0) {
            boolean z10 = np.s1(v8Var.f9598a).f25322k7;
            Context context = this.f8367e;
            org.telegram.ui.ActionBar.e6 e6Var = this.f8368f;
            int i11 = 0;
            if (z10) {
                if (z10Var != null) {
                    z10Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && z10Var2 != null) {
                    z10Var2.a("cancelled");
                    zArr[0] = true;
                }
                v8.c0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f8369g) {
                i11 = 9;
            }
            cb cbVar = new cb(context, e6Var, j10, i11, this.h, new h8(v8Var, zArr2, gjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, z10Var2, z10Var), this.f8374m);
            cbVar.setOnDismissListener(new k6(v8Var, z10Var, zArr2, zArr, z10Var2, 1));
            cbVar.show();
            return;
        }
        v8Var.Z(gjVar, inputInvoice, tL_payments_paymentFormStars, new r6(v8Var, i10, z10Var, zArr, z10Var2));
    }
}
