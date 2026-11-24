package defpackage;

import android.view.View;
import java.util.regex.Pattern;
public final class lx3 extends g4c {
    public final mx3 e;

    public lx3(mx3 mx3Var, String str) {
        super(str, (vib) null);
        this.e = mx3Var;
    }

    @Override
    public final void onClick(View view) {
        mx3 mx3Var = this.e;
        qx3 qx3Var = mx3Var.y;
        Pattern pattern = qx3.P1;
        na7 q1 = na7.q1(qx3Var.a);
        String url = getURL();
        qx3 qx3Var2 = mx3Var.y;
        q1.z3(url, qx3Var2.m1, 1, null);
        qx3Var2.G0();
        qx3Var2.dismiss();
    }
}
