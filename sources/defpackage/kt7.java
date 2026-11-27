package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
public final class kt7 implements View.OnClickListener {
    public final byte a;
    public final ot7 b;

    public kt7(ot7 ot7Var, byte b) {
        this.a = b;
        this.b = ot7Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        ot7 ot7Var = this.b;
        switch (b) {
            case 0:
                TextView textView = ot7Var.u1;
                fu5 G = fu5.G(ot7Var.c, ot7Var.J0, textView);
                int[] iArr = ot7.z1;
                for (int i = 0; i < 6; i++) {
                    int i2 = iArr[i];
                    if (i2 == ot7Var.x1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    G.h(new me7(ot7Var, i2, (byte) 4), ob6.G(i2 / 3600, "GiftOfferHours", new Object[0]), z);
                }
                G.W(5);
                ot7Var.C0(textView, G, true);
                return;
            case 1:
                ot7 ot7Var2 = this.b;
                c51 c51Var = ot7Var2.v1;
                if (c51Var.e0 && !c51Var.R) {
                    if (uc7.s1(ot7Var2.a).x2()) {
                        i5.b(ot7Var2.a);
                        return;
                    }
                    hl.t1(ot7Var2.r1);
                    long j = ot7Var2.w1;
                    int i3 = ot7Var2.x1;
                    c51Var.setLoading(true);
                    int i4 = ot7Var2.a;
                    String str = ot7Var2.l1.slug;
                    mt7 mt7Var = new mt7(ot7Var2, j, i3, (byte) 0);
                    HashMap hashMap = vs7.a;
                    r7a.B(i4);
                    long D = r7a.D();
                    jf7 Y = jf7.Y(i4);
                    Y.a.c(new ic2(Y, D, str, j, i3, mt7Var));
                    return;
                }
                return;
            default:
                uqc.L0(ot7Var.a, ot7Var.J0, ot7Var.getContext());
                return;
        }
    }
}
