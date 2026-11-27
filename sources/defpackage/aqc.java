package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class aqc implements TextWatcher {
    public final String[] a;
    public final slc b;
    public final Runnable[] c;
    public final a84 d;

    public aqc(String[] strArr, slc slcVar, Runnable[] runnableArr, a84 a84Var) {
        this.a = strArr;
        this.b = slcVar;
        this.c = runnableArr;
        this.d = a84Var;
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
        a84 a84Var = this.d;
        hl.r(a84Var);
        hl.d3(a84Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
