package defpackage;

import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class vr0 implements Runnable {
    public final byte a;
    public final i22 b;

    public vr0(i22 i22Var, byte b) {
        this.a = b;
        this.b = i22Var;
    }

    @Override
    public final void run() {
        cv3 cv3Var;
        long j;
        a22 a22Var;
        x62 x62Var;
        byte b = this.a;
        boolean z = true;
        boolean z2 = false;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                i22Var.hide();
                return;
            case 1:
                if (i22Var.W1) {
                    cv3Var = i22Var.M2;
                } else {
                    cv3Var = i22Var.B2;
                }
                if (cv3Var.getEditText().getLineCount() <= 2 || TextUtils.isEmpty(cv3Var.getText().toString().trim())) {
                    z = false;
                }
                i22Var.w1(z);
                return;
            case 2:
                i22Var.A0 = null;
                i22Var.B0 = (byte) 0;
                i22Var.H();
                return;
            case 3:
                i22 i22Var2 = this.b;
                oy1 oy1Var = i22Var2.b2;
                if (oy1Var != null) {
                    j = oy1Var.i();
                } else {
                    j = 0;
                }
                long j2 = j;
                p12 p12Var = i22Var2.F2;
                i22Var2.K2 = j2;
                p12Var.setEffect(j2);
                a22 a22Var2 = i22Var2.v2;
                if (a22Var2 != i22Var2.d2 && a22Var2 != i22Var2.k2) {
                    if (!a22Var2.K(false, 0, 0, j2, i22Var2.a1())) {
                        i22Var2.dismiss();
                    }
                } else {
                    z2 = i22Var2.p1(false, 0, 0, j2, i22Var2.a1());
                }
                oy1 oy1Var2 = i22Var2.b2;
                if (oy1Var2 != null) {
                    oy1Var2.f(!z2);
                    i22Var2.b2 = null;
                    return;
                }
                return;
            case 4:
                i22Var.a(true);
                d dVar = i22Var.Z1;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 5:
                i22Var.o1();
                return;
            default:
                i22Var.q3 = null;
                a22 a22Var3 = i22Var.v2;
                if (a22Var3 != i22Var.d2 && (a22Var = i22Var.w2) != (x62Var = i22Var.k2) && a22Var3 != a22Var && a22Var3 != x62Var) {
                    i22Var.b.removeView(a22Var3);
                }
                i22Var.v2.setVisibility(8);
                i22Var.v2.t();
                i22Var.w2.I();
                i22Var.v2 = i22Var.w2;
                i22Var.w2 = null;
                int[] iArr = i22Var.Y3;
                iArr[0] = iArr[1];
                i22Var.q1(i22Var.W1, false);
                i22Var.G1();
                return;
        }
    }
}
