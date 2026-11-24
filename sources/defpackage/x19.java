package defpackage;

import android.content.Context;
public final class x19 extends tk4 {
    public final c29 V;

    public x19(c29 c29Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.V = c29Var;
    }

    @Override
    public final int getAdditionalHeight() {
        j37 j37Var;
        c29 c29Var = this.V;
        if (!c29Var.I.isEmpty() && (j37Var = c29Var.K) != null) {
            return gm.L(8.0f) + j37Var.getMeasuredHeight();
        }
        return 0;
    }
}
