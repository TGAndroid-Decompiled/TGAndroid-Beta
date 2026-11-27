package defpackage;

import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
public final class cqc implements View.OnAttachStateChangeListener {
    public final cg5 a;
    public final TL_wallet.walletTransaction[] b;
    public final bqc c;
    public final int d;
    public final icc e;
    public final kl7[] f;
    public final String[] h;
    public final boolean[] n;

    public cqc(cg5 cg5Var, TL_wallet.walletTransaction[] wallettransactionArr, bqc bqcVar, int i, icc iccVar, kl7[] kl7VarArr, String[] strArr, boolean[] zArr) {
        this.a = cg5Var;
        this.b = wallettransactionArr;
        this.c = bqcVar;
        this.d = i;
        this.e = iccVar;
        this.f = kl7VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        bqc bqcVar = this.c;
        if (bqcVar != null) {
            int i = this.d;
            jn7.f(i).b(bqcVar, jn7.d4);
            jn7.f(i).b(bqcVar, jn7.e4);
        }
        icc iccVar = this.e;
        if (iccVar != null) {
            this.f[0].n(new b6c(iccVar, this.h, this.n, (byte) 21));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        bqc bqcVar = this.c;
        if (bqcVar != null) {
            int i = this.d;
            jn7.f(i).n(bqcVar, jn7.d4);
            jn7.f(i).n(bqcVar, jn7.e4);
        }
    }
}
