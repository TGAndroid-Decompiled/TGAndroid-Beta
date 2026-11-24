package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class mn1 implements View.OnClickListener {
    public final byte a;
    public final yv1 b;
    public final ArrayList c;

    public mn1(yv1 yv1Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yv1 yv1Var = this.b;
                rq1 rq1Var = new rq1(yv1Var, yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, this.c);
                boolean Y7 = yv1Var.Y7();
                rq1Var.i0 = Y7;
                rq1Var.n = Y7;
                rq1Var.p0 = false;
                yv1Var.N5(false);
                yv1Var.showDialog(rq1Var);
                return;
            default:
                yv1 yv1Var2 = this.b;
                if (yv1Var2.getParentActivity() != null && yv1Var2.getParentActivity() != null) {
                    new az3(yv1Var2, yv1Var2.getParentActivity(), yv1Var2.Ba, this.c).show();
                    yv1Var2.N5(true);
                    return;
                }
                return;
        }
    }
}
