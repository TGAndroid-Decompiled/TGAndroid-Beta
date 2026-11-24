package defpackage;

import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
public final class onc implements View.OnAttachStateChangeListener {
    public final zf5 a;
    public final TL_wallet.walletTransaction[] b;
    public final nnc c;
    public final int d;
    public final jac e;
    public final el7[] f;
    public final String[] h;
    public final boolean[] n;

    public onc(zf5 zf5Var, TL_wallet.walletTransaction[] wallettransactionArr, nnc nncVar, int i, jac jacVar, el7[] el7VarArr, String[] strArr, boolean[] zArr) {
        this.a = zf5Var;
        this.b = wallettransactionArr;
        this.c = nncVar;
        this.d = i;
        this.e = jacVar;
        this.f = el7VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        nnc nncVar = this.c;
        if (nncVar != null) {
            int i = this.d;
            nm7.f(i).b(nncVar, nm7.e4);
            nm7.f(i).b(nncVar, nm7.f4);
        }
        jac jacVar = this.e;
        if (jacVar != null) {
            this.f[0].n(new gcc(jacVar, this.h, this.n, (byte) 14));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        nnc nncVar = this.c;
        if (nncVar != null) {
            int i = this.d;
            nm7.f(i).n(nncVar, nm7.e4);
            nm7.f(i).n(nncVar, nm7.f4);
        }
    }
}
