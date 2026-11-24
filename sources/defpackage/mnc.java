package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class mnc implements TextWatcher {
    public final String[] a;
    public final qhc b;
    public final Runnable[] c;
    public final bz1 d;

    public mnc(String[] strArr, qhc qhcVar, Runnable[] runnableArr, bz1 bz1Var) {
        this.a = strArr;
        this.b = qhcVar;
        this.c = runnableArr;
        this.d = bz1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.a[0] = editable.toString();
        this.b.run();
        Runnable[] runnableArr = this.c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        bz1 bz1Var = this.d;
        gm.r(bz1Var);
        gm.d3(bz1Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
