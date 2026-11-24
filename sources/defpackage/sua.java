package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class sua implements qac {
    public final jva a;
    public final long b;
    public final boolean[] c;
    public final qac d;
    public final Context e;
    public final ylb f;
    public final boolean g;
    public final String h;
    public final k47 i;
    public final TLRPC.InputInvoice j;
    public final TLRPC.TL_payments_paymentFormStars k;
    public final int l;
    public final long m;

    public sua(jva jvaVar, long j, boolean[] zArr, qac qacVar, Context context, ylb ylbVar, boolean z, String str, k47 k47Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i, long j2) {
        this.a = jvaVar;
        this.b = j;
        this.c = zArr;
        this.d = qacVar;
        this.e = context;
        this.f = ylbVar;
        this.g = z;
        this.h = str;
        this.i = k47Var;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i;
        this.m = j2;
    }

    @Override
    public final void a(Object obj) {
        qac qacVar = (qac) obj;
        jva jvaVar = this.a;
        long j = jvaVar.f.amount;
        long j2 = this.b;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        boolean[] zArr = this.c;
        qac qacVar2 = this.d;
        k47 k47Var = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i2 = this.l;
        if (i < 0) {
            boolean c5 = oc7.r1(jvaVar.a).c5();
            Context context = this.e;
            ylb ylbVar = this.f;
            int i3 = 0;
            if (!c5) {
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                if (!zArr[0] && qacVar2 != null) {
                    qacVar2.a("cancelled");
                    zArr[0] = true;
                }
                jva.c0(context, ylbVar);
                return;
            }
            boolean[] zArr2 = {false};
            if (this.g) {
                i3 = 9;
            }
            dxa dxaVar = new dxa(context, ylbVar, j2, i3, this.h, new az1(jvaVar, zArr2, k47Var, inputInvoice, tL_payments_paymentFormStars, zArr, i2, qacVar2, qacVar), this.m);
            dxaVar.setOnDismissListener(new lv0(jvaVar, qacVar, zArr2, zArr, qacVar2, (byte) 3));
            dxaVar.show();
            return;
        }
        jvaVar.X(k47Var, inputInvoice, tL_payments_paymentFormStars, new pta(jvaVar, i2, qacVar, zArr, qacVar2));
    }
}
