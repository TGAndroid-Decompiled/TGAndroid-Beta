package defpackage;

import android.content.Context;
public final class j39 extends tk4 {
    public final o39 V;

    public j39(o39 o39Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.V = o39Var;
    }

    @Override
    public final int getAdditionalHeight() {
        q37 q37Var;
        o39 o39Var = this.V;
        if (!o39Var.I.isEmpty() && (q37Var = o39Var.K) != null) {
            return hl.L(8.0f) + q37Var.getMeasuredHeight();
        }
        return 0;
    }
}
