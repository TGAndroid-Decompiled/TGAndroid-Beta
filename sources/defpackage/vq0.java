package defpackage;

import android.text.TextUtils;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
public final class vq0 implements Runnable {
    public final byte a;
    public final n12 b;

    public vq0(n12 n12Var, byte b) {
        this.a = b;
        this.b = n12Var;
    }

    @Override
    public final void run() {
        iu3 iu3Var;
        long j;
        f12 f12Var;
        c62 c62Var;
        byte b = this.a;
        boolean z = true;
        boolean z2 = false;
        n12 n12Var = this.b;
        switch (b) {
            case 0:
                n12Var.hide();
                return;
            case 1:
                if (n12Var.W1) {
                    iu3Var = n12Var.M2;
                } else {
                    iu3Var = n12Var.B2;
                }
                if (iu3Var.getEditText().getLineCount() <= 2 || TextUtils.isEmpty(iu3Var.getText().toString().trim())) {
                    z = false;
                }
                n12Var.x1(z);
                return;
            case 2:
                n12Var.A0 = null;
                n12Var.B0 = (byte) 0;
                n12Var.H();
                return;
            case 3:
                n12 n12Var2 = this.b;
                ox1 ox1Var = n12Var2.b2;
                if (ox1Var != null) {
                    j = ox1Var.i();
                } else {
                    j = 0;
                }
                long j2 = j;
                u02 u02Var = n12Var2.F2;
                n12Var2.K2 = j2;
                u02Var.setEffect(j2);
                f12 f12Var2 = n12Var2.v2;
                if (f12Var2 != n12Var2.d2 && f12Var2 != n12Var2.k2) {
                    if (!f12Var2.K(false, 0, 0, j2, n12Var2.b1())) {
                        n12Var2.dismiss();
                    }
                } else {
                    z2 = n12Var2.q1(false, 0, 0, j2, n12Var2.b1());
                }
                ox1 ox1Var2 = n12Var2.b2;
                if (ox1Var2 != null) {
                    ox1Var2.f(!z2);
                    n12Var2.b2 = null;
                    return;
                }
                return;
            case 4:
                n12Var.p1();
                return;
            case 5:
                n12Var.a(true);
                e eVar = n12Var.Z1;
                if (eVar != null) {
                    eVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            default:
                n12Var.q3 = null;
                f12 f12Var3 = n12Var.v2;
                if (f12Var3 != n12Var.d2 && (f12Var = n12Var.w2) != (c62Var = n12Var.k2) && f12Var3 != f12Var && f12Var3 != c62Var) {
                    n12Var.b.removeView(f12Var3);
                }
                n12Var.v2.setVisibility(8);
                n12Var.v2.u();
                n12Var.w2.I();
                n12Var.v2 = n12Var.w2;
                n12Var.w2 = null;
                int[] iArr = n12Var.Y3;
                iArr[0] = iArr[1];
                n12Var.r1(n12Var.W1, false);
                n12Var.H1();
                return;
        }
    }
}
