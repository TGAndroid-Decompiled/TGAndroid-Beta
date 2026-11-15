package di;

import android.content.Context;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class b8 implements z10 {
    public final u8 f8257a;
    public final long f8258b;
    public final boolean[] f8259c;
    public final z10 d;
    public final Context f8260e;
    public final org.telegram.ui.ActionBar.e6 f8261f;
    public final boolean f8262g;
    public final String h;
    public final gj f8263i;
    public final TLRPC.InputInvoice f8264j;
    public final TLRPC.TL_payments_paymentFormStars f8265k;
    public final int f8266l;
    public final long f8267m;

    public b8(u8 u8Var, long j3, boolean[] zArr, z10 z10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.f8257a = u8Var;
        this.f8258b = j3;
        this.f8259c = zArr;
        this.d = z10Var;
        this.f8260e = context;
        this.f8261f = e6Var;
        this.f8262g = z10;
        this.h = str;
        this.f8263i = gjVar;
        this.f8264j = inputInvoice;
        this.f8265k = tL_payments_paymentFormStars;
        this.f8266l = i7;
        this.f8267m = j10;
    }

    @Override
    public final void a(Object obj) {
        z10 z10Var = (z10) obj;
        u8 u8Var = this.f8257a;
        long j3 = u8Var.f9533f.amount;
        long j10 = this.f8258b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f8259c;
        z10 z10Var2 = this.d;
        gj gjVar = this.f8263i;
        TLRPC.InputInvoice inputInvoice = this.f8264j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f8265k;
        int i10 = this.f8266l;
        if (i7 < 0) {
            boolean z10 = np.s1(u8Var.f9529a).f25325k7;
            Context context = this.f8260e;
            org.telegram.ui.ActionBar.e6 e6Var = this.f8261f;
            int i11 = 0;
            if (z10) {
                if (z10Var != null) {
                    z10Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && z10Var2 != null) {
                    z10Var2.a("cancelled");
                    zArr[0] = true;
                }
                u8.c0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f8262g) {
                i11 = 9;
            }
            bb bbVar = new bb(context, e6Var, j10, i11, this.h, new g8(u8Var, zArr2, gjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, z10Var2, z10Var), this.f8267m);
            bbVar.setOnDismissListener(new k6(u8Var, z10Var, zArr2, zArr, z10Var2, 1));
            bbVar.show();
            return;
        }
        u8Var.Z(gjVar, inputInvoice, tL_payments_paymentFormStars, new r6(u8Var, i10, z10Var, zArr, z10Var2));
    }
}
