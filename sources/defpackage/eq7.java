package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
public final class eq7 implements View.OnClickListener {
    public final byte a;
    public final iq7 b;

    public eq7(iq7 iq7Var, byte b) {
        this.a = b;
        this.b = iq7Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        iq7 iq7Var = this.b;
        switch (b) {
            case 0:
                TextView textView = iq7Var.u1;
                cs5 G = cs5.G(iq7Var.c, iq7Var.J0, textView);
                int[] iArr = iq7.z1;
                for (int i = 0; i < 6; i++) {
                    int i2 = iArr[i];
                    if (i2 == iq7Var.x1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    G.h(new on7(iq7Var, i2, (byte) 1), k96.G(i2 / 3600, "GiftOfferHours", new Object[0]), z);
                }
                G.W(5);
                iq7Var.B0(textView, G, true);
                return;
            case 1:
                iq7 iq7Var2 = this.b;
                u41 u41Var = iq7Var2.v1;
                if (u41Var.e0 && !u41Var.R) {
                    if (na7.q1(iq7Var2.a).t2()) {
                        h5.b(iq7Var2.a);
                        return;
                    }
                    gl.t1(iq7Var2.r1);
                    long j = iq7Var2.w1;
                    int i3 = iq7Var2.x1;
                    u41Var.setLoading(true);
                    int i4 = iq7Var2.a;
                    String str = iq7Var2.l1.slug;
                    gq7 gq7Var = new gq7(iq7Var2, j, i3, (byte) 0);
                    HashMap hashMap = vp7.a;
                    z3a.B(i4);
                    long D = z3a.D();
                    ad7 Y = ad7.Y(i4);
                    Y.a.c(new sb2(Y, D, str, j, i3, gq7Var));
                    return;
                }
                return;
            default:
                hmc.L0(iq7Var.a, iq7Var.J0, iq7Var.getContext());
                return;
        }
    }
}
