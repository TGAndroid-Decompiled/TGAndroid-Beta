package defpackage;

import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class vq0 implements Runnable {
    public final byte a;
    public final x02 b;

    public vq0(x02 x02Var, byte b) {
        this.a = b;
        this.b = x02Var;
    }

    @Override
    public final void run() {
        rt3 rt3Var;
        long j;
        p02 p02Var;
        m52 m52Var;
        byte b = this.a;
        boolean z = true;
        boolean z2 = false;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                x02Var.hide();
                return;
            case 1:
                if (x02Var.W1) {
                    rt3Var = x02Var.M2;
                } else {
                    rt3Var = x02Var.B2;
                }
                if (rt3Var.getEditText().getLineCount() <= 2 || TextUtils.isEmpty(rt3Var.getText().toString().trim())) {
                    z = false;
                }
                x02Var.w1(z);
                return;
            case 2:
                x02Var.A0 = null;
                x02Var.B0 = (byte) 0;
                x02Var.I();
                return;
            case 3:
                x02 x02Var2 = this.b;
                bx1 bx1Var = x02Var2.b2;
                if (bx1Var != null) {
                    j = bx1Var.i();
                } else {
                    j = 0;
                }
                long j2 = j;
                e02 e02Var = x02Var2.F2;
                x02Var2.K2 = j2;
                e02Var.setEffect(j2);
                p02 p02Var2 = x02Var2.v2;
                if (p02Var2 != x02Var2.d2 && p02Var2 != x02Var2.k2) {
                    if (!p02Var2.M(false, 0, 0, j2, x02Var2.a1())) {
                        x02Var2.dismiss();
                    }
                } else {
                    z2 = x02Var2.p1(false, 0, 0, j2, x02Var2.a1());
                }
                bx1 bx1Var2 = x02Var2.b2;
                if (bx1Var2 != null) {
                    bx1Var2.f(!z2);
                    x02Var2.b2 = null;
                    return;
                }
                return;
            case 4:
                x02Var.a(true);
                d dVar = x02Var.Z1;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 5:
                x02Var.o1();
                return;
            default:
                x02Var.q3 = null;
                p02 p02Var3 = x02Var.v2;
                if (p02Var3 != x02Var.d2 && (p02Var = x02Var.w2) != (m52Var = x02Var.k2) && p02Var3 != p02Var && p02Var3 != m52Var) {
                    x02Var.b.removeView(p02Var3);
                }
                x02Var.v2.setVisibility(8);
                x02Var.v2.u();
                x02Var.w2.J();
                x02Var.v2 = x02Var.w2;
                x02Var.w2 = null;
                int[] iArr = x02Var.Y3;
                iArr[0] = iArr[1];
                x02Var.q1(x02Var.W1, false);
                x02Var.G1();
                return;
        }
    }
}
