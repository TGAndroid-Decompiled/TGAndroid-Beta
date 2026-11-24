package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
public final class hs7 implements View.OnClickListener {
    public final byte a;
    public final ls7 b;

    public hs7(ls7 ls7Var, byte b) {
        this.a = b;
        this.b = ls7Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        ls7 ls7Var = this.b;
        switch (b) {
            case 0:
                TextView textView = ls7Var.u1;
                bu5 G = bu5.G(ls7Var.c, ls7Var.J0, textView);
                int[] iArr = ls7.z1;
                for (int i = 0; i < 6; i++) {
                    int i2 = iArr[i];
                    if (i2 == ls7Var.x1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    G.h(new ge7(ls7Var, i2, (byte) 3), jb6.G(i2 / 3600, "GiftOfferHours", new Object[0]), z);
                }
                G.W(5);
                ls7Var.B0(textView, G, true);
                return;
            case 1:
                ls7 ls7Var2 = this.b;
                b61 b61Var = ls7Var2.v1;
                if (b61Var.e0 && !b61Var.R) {
                    if (oc7.r1(ls7Var2.a).u2()) {
                        h5.b(ls7Var2.a);
                        return;
                    }
                    gm.t1(ls7Var2.r1);
                    long j = ls7Var2.w1;
                    int i3 = ls7Var2.x1;
                    b61Var.setLoading(true);
                    int i4 = ls7Var2.a;
                    String str = ls7Var2.l1.slug;
                    js7 js7Var = new js7(ls7Var2, j, i3, (byte) 0);
                    HashMap hashMap = yr7.a;
                    a6a.B(i4);
                    long D = a6a.D();
                    cf7 Y = cf7.Y(i4);
                    Y.a.c(new dd2(Y, D, str, j, i3, js7Var));
                    return;
                }
                return;
            default:
                goc.M0(ls7Var.a, ls7Var.J0, ls7Var.getContext());
                return;
        }
    }
}
