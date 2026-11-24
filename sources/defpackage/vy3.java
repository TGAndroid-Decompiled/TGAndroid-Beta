package defpackage;

import android.view.View;
import java.util.regex.Pattern;
public final class vy3 extends g6c {
    public final wy3 e;

    public vy3(wy3 wy3Var, String str) {
        super(str, (wkb) null);
        this.e = wy3Var;
    }

    @Override
    public final void onClick(View view) {
        wy3 wy3Var = this.e;
        az3 az3Var = wy3Var.y;
        Pattern pattern = az3.P1;
        oc7 r1 = oc7.r1(az3Var.a);
        String url = getURL();
        az3 az3Var2 = wy3Var.y;
        r1.C3(url, az3Var2.m1, 1, null);
        az3Var2.G0();
        az3Var2.dismiss();
    }
}
