package defpackage;

import android.content.Context;
import android.view.View;
public final class hv4 extends vqa {
    public final byte y3 = 0;
    public final fy0 z3;

    public hv4(tv4 tv4Var, Context context, int i, long j, wjb wjbVar) {
        super(context, i, j, wjbVar, null);
        this.z3 = tv4Var;
    }

    @Override
    public final int P() {
        switch (this.y3) {
            case 1:
                return ((vqa) this.z3).P();
            default:
                return super.P();
        }
    }

    @Override
    public final u21 j() {
        switch (this.y3) {
            case 0:
                tv4 tv4Var = (tv4) this.z3;
                return new u21(tv4Var.c, tv4Var.J0);
            default:
                return super.j();
        }
    }

    public hv4(vqa vqaVar, Context context, int i, long j, wjb wjbVar, View view) {
        super(context, i, j, wjbVar, view);
        this.z3 = vqaVar;
    }
}
