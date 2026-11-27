package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class twa implements pcc {
    public final jxa a;
    public final long b;
    public final boolean[] c;
    public final pcc d;
    public final Context e;
    public final vnb f;
    public final boolean g;
    public final String h;
    public final r47 i;
    public final TLRPC.InputInvoice j;
    public final TLRPC.TL_payments_paymentFormStars k;
    public final int l;
    public final long m;

    public twa(jxa jxaVar, long j, boolean[] zArr, pcc pccVar, Context context, vnb vnbVar, boolean z, String str, r47 r47Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i, long j2) {
        this.a = jxaVar;
        this.b = j;
        this.c = zArr;
        this.d = pccVar;
        this.e = context;
        this.f = vnbVar;
        this.g = z;
        this.h = str;
        this.i = r47Var;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i;
        this.m = j2;
    }

    @Override
    public final void a(Object obj) {
        pcc pccVar = (pcc) obj;
        jxa jxaVar = this.a;
        long j = jxaVar.f.amount;
        long j2 = this.b;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        boolean[] zArr = this.c;
        pcc pccVar2 = this.d;
        r47 r47Var = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i2 = this.l;
        if (i < 0) {
            boolean i5 = uc7.s1(jxaVar.a).i5();
            Context context = this.e;
            vnb vnbVar = this.f;
            int i3 = 0;
            if (!i5) {
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                if (!zArr[0] && pccVar2 != null) {
                    pccVar2.a("cancelled");
                    zArr[0] = true;
                }
                jxa.d0(context, vnbVar);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.g) {
                i3 = 9;
            }
            dza dzaVar = new dza(context, vnbVar, j2, i3, this.h, new zx1(jxaVar, zArr2, r47Var, inputInvoice, tL_payments_paymentFormStars, zArr, i2, pccVar2, pccVar), this.m);
            dzaVar.setOnDismissListener(new mu0(jxaVar, pccVar, zArr2, zArr, pccVar2, (byte) 3));
            dzaVar.show();
            return;
        }
        jxaVar.Y(r47Var, inputInvoice, tL_payments_paymentFormStars, new sva(jxaVar, i2, pccVar, zArr, pccVar2));
    }
}
