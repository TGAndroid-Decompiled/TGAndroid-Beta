package defpackage;

import android.view.View;
import java.util.regex.Pattern;
public final class gy3 extends f8c {
    public final hy3 e;

    public gy3(hy3 hy3Var, String str) {
        super(str, (rmb) null);
        this.e = hy3Var;
    }

    @Override
    public final void onClick(View view) {
        hy3 hy3Var = this.e;
        ly3 ly3Var = hy3Var.y;
        Pattern pattern = ly3.P1;
        uc7 s1 = uc7.s1(ly3Var.a);
        String url = getURL();
        ly3 ly3Var2 = hy3Var.y;
        s1.H3(url, ly3Var2.m1, 1, null);
        ly3Var2.H0();
        ly3Var2.dismiss();
    }
}
