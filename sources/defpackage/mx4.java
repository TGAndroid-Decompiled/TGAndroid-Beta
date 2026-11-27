package defpackage;

import android.content.Context;
import android.view.View;
public final class mx4 extends wua {
    public final byte y3 = 1;
    public final ny0 z3;

    public mx4(yx4 yx4Var, Context context, int i, long j, vnb vnbVar) {
        super(context, i, j, vnbVar, null);
        this.z3 = yx4Var;
    }

    @Override
    public final int O() {
        switch (this.y3) {
            case 1:
                return ((wua) this.z3).O();
            default:
                return super.O();
        }
    }

    @Override
    public final d31 j() {
        switch (this.y3) {
            case 0:
                yx4 yx4Var = (yx4) this.z3;
                return new d31(yx4Var.c, yx4Var.J0);
            default:
                return super.j();
        }
    }

    public mx4(wua wuaVar, Context context, int i, long j, vnb vnbVar, View view) {
        super(context, i, j, vnbVar, view);
        this.z3 = wuaVar;
    }
}
