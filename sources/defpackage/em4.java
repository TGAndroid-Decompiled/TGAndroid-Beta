package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
public final class em4 {
    public final LinearLayout a;
    public final int b;
    public final int c;
    public final Context d;
    public final fm4 e;

    public em4(fm4 fm4Var, Context context, int i) {
        this.e = fm4Var;
        this.d = context;
        this.b = i;
        int L = gm.L(18.0f);
        this.c = L;
        hm4 hm4Var = fm4Var.Q;
        ul4 ul4Var = hm4.p;
        LinearLayout b = hm4Var.b(context, null, true, false, false);
        b.setPadding(L, 0, L, 0);
        this.a = b;
    }
}
