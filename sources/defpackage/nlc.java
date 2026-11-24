package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class nlc implements TextWatcher {
    public final String[] a;
    public final mhc b;
    public final Runnable[] c;
    public final ox1 d;

    public nlc(String[] strArr, mhc mhcVar, Runnable[] runnableArr, ox1 ox1Var) {
        this.a = strArr;
        this.b = mhcVar;
        this.c = runnableArr;
        this.d = ox1Var;
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
        ox1 ox1Var = this.d;
        gl.r(ox1Var);
        gl.e3(ox1Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
