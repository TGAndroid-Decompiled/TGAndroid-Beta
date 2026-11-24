package defpackage;

import android.content.Context;
public final class vz8 extends pi4 {
    public final a09 V;

    public vz8(a09 a09Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.V = a09Var;
    }

    @Override
    public final int getAdditionalHeight() {
        j17 j17Var;
        a09 a09Var = this.V;
        if (!a09Var.I.isEmpty() && (j17Var = a09Var.K) != null) {
            return gl.L(8.0f) + j17Var.getMeasuredHeight();
        }
        return 0;
    }
}
