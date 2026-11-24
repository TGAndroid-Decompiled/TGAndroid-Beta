package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qsa implements p8c {
    public final gta a;
    public final long b;
    public final boolean[] c;
    public final p8c d;
    public final Context e;
    public final wjb f;
    public final boolean g;
    public final String h;
    public final k27 i;
    public final TLRPC.InputInvoice j;
    public final TLRPC.TL_payments_paymentFormStars k;
    public final int l;
    public final long m;

    public qsa(gta gtaVar, long j, boolean[] zArr, p8c p8cVar, Context context, wjb wjbVar, boolean z, String str, k27 k27Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i, long j2) {
        this.a = gtaVar;
        this.b = j;
        this.c = zArr;
        this.d = p8cVar;
        this.e = context;
        this.f = wjbVar;
        this.g = z;
        this.h = str;
        this.i = k27Var;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i;
        this.m = j2;
    }

    @Override
    public final void a(Object obj) {
        p8c p8cVar = (p8c) obj;
        gta gtaVar = this.a;
        long j = gtaVar.f.amount;
        long j2 = this.b;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        boolean[] zArr = this.c;
        p8c p8cVar2 = this.d;
        k27 k27Var = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i2 = this.l;
        if (i < 0) {
            boolean a5 = na7.q1(gtaVar.a).a5();
            Context context = this.e;
            wjb wjbVar = this.f;
            int i3 = 0;
            if (!a5) {
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                if (!zArr[0] && p8cVar2 != null) {
                    p8cVar2.a("cancelled");
                    zArr[0] = true;
                }
                gta.c0(context, wjbVar);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.g) {
                i3 = 9;
            }
            zua zuaVar = new zua(context, wjbVar, j2, i3, this.h, new nx1(gtaVar, zArr2, k27Var, inputInvoice, tL_payments_paymentFormStars, zArr, i2, p8cVar2, p8cVar), this.m);
            zuaVar.setOnDismissListener(new cu0(gtaVar, p8cVar, zArr2, zArr, p8cVar2, (byte) 3));
            zuaVar.show();
            return;
        }
        gtaVar.X(k27Var, inputInvoice, tL_payments_paymentFormStars, new ora(gtaVar, i2, p8cVar, zArr, p8cVar2));
    }
}
