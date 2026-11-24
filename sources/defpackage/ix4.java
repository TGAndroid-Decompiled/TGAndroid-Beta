package defpackage;

import android.content.Context;
import android.view.View;
public final class ix4 extends wsa {
    public final byte y3 = 0;
    public final mz0 z3;

    public ix4(ux4 ux4Var, Context context, int i, long j, ylb ylbVar) {
        super(context, i, j, ylbVar, null);
        this.z3 = ux4Var;
    }

    @Override
    public final int O() {
        switch (this.y3) {
            case 1:
                return ((wsa) this.z3).O();
            default:
                return super.O();
        }
    }

    @Override
    public final c41 j() {
        switch (this.y3) {
            case 0:
                ux4 ux4Var = (ux4) this.z3;
                return new c41(ux4Var.c, ux4Var.J0);
            default:
                return super.j();
        }
    }

    public ix4(wsa wsaVar, Context context, int i, long j, ylb ylbVar, View view) {
        super(context, i, j, ylbVar, view);
        this.z3 = wsaVar;
    }
}
