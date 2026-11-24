package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
public final class dk4 {
    public final LinearLayout a;
    public final int b;
    public final int c;
    public final Context d;
    public final ek4 e;

    public dk4(ek4 ek4Var, Context context, int i) {
        this.e = ek4Var;
        this.d = context;
        this.b = i;
        int L = gl.L(18.0f);
        this.c = L;
        gk4 gk4Var = ek4Var.Q;
        tj4 tj4Var = gk4.p;
        LinearLayout b = gk4Var.b(context, null, true, false, false);
        b.setPadding(L, 0, L, 0);
        this.a = b;
    }
}
