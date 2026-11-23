package di;

import android.content.Context;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class f8 implements y10 {
    public final y8 f8817a;
    public final long f8818b;
    public final boolean[] f8819c;
    public final y10 d;
    public final Context f8820e;
    public final org.telegram.ui.ActionBar.h6 f8821f;
    public final boolean f8822g;
    public final String h;
    public final gj f8823i;
    public final TLRPC.InputInvoice f8824j;
    public final TLRPC.TL_payments_paymentFormStars f8825k;
    public final int f8826l;
    public final long f8827m;

    public f8(y8 y8Var, long j3, boolean[] zArr, y10 y10Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, String str, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.f8817a = y8Var;
        this.f8818b = j3;
        this.f8819c = zArr;
        this.d = y10Var;
        this.f8820e = context;
        this.f8821f = h6Var;
        this.f8822g = z10;
        this.h = str;
        this.f8823i = gjVar;
        this.f8824j = inputInvoice;
        this.f8825k = tL_payments_paymentFormStars;
        this.f8826l = i7;
        this.f8827m = j10;
    }

    @Override
    public final void a(Object obj) {
        y10 y10Var = (y10) obj;
        y8 y8Var = this.f8817a;
        long j3 = y8Var.f10052f.amount;
        long j10 = this.f8818b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.f8819c;
        y10 y10Var2 = this.d;
        gj gjVar = this.f8823i;
        TLRPC.InputInvoice inputInvoice = this.f8824j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.f8825k;
        int i10 = this.f8826l;
        if (i7 < 0) {
            boolean z10 = np.u1(y8Var.f10048a).f25870m7;
            Context context = this.f8820e;
            org.telegram.ui.ActionBar.h6 h6Var = this.f8821f;
            int i11 = 0;
            if (z10) {
                if (y10Var != null) {
                    y10Var.a(Boolean.FALSE);
                }
                if (!zArr[0] && y10Var2 != null) {
                    y10Var2.a("cancelled");
                    zArr[0] = true;
                }
                y8.c0(context, h6Var);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.f8822g) {
                i11 = 9;
            }
            fb fbVar = new fb(context, h6Var, j10, i11, this.h, new k8(y8Var, zArr2, gjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, y10Var2, y10Var), this.f8827m);
            fbVar.setOnDismissListener(new n6(y8Var, y10Var, zArr2, zArr, y10Var2, 1));
            fbVar.show();
            return;
        }
        y8Var.Y(gjVar, inputInvoice, tL_payments_paymentFormStars, new u6(y8Var, i10, y10Var, zArr, y10Var2));
    }
}
