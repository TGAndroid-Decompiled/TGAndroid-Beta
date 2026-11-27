package defpackage;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class f02 implements qs3 {
    public final byte a = 1;
    public final boolean b;
    public final float c;
    public final float d;
    public final KeyEvent.Callback e;

    public f02(n12 n12Var, float f, float f2, boolean z) {
        this.e = n12Var;
        this.c = f;
        this.d = f2;
        this.b = z;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        float f3 = this.d;
        float f4 = this.c;
        boolean z = this.b;
        KeyEvent.Callback callback = this.e;
        switch (b) {
            case 0:
                n12 n12Var = (n12) callback;
                LinearLayout linearLayout = n12Var.i3;
                LinearLayout linearLayout2 = n12Var.k3;
                float f5 = f / 500.0f;
                y02 y02Var = n12Var.Y1;
                f12 f12Var = n12Var.v2;
                Float valueOf = Float.valueOf(f5);
                y02Var.getClass();
                y02Var.a(f12Var, valueOf);
                n12Var.U2.setAlpha(hl.R1(f4, f3, f5));
                n12Var.I1(n12Var.v2, 0);
                n12Var.I1(n12Var.w2, 0);
                if (!(n12Var.w2 instanceof c62) || z) {
                    f5 = 1.0f - f5;
                }
                float i = Utilities.i(f5, 1.0f, 0.0f);
                linearLayout2.setAlpha(i);
                float f6 = 1.0f - i;
                linearLayout.setAlpha(f6);
                linearLayout.setTranslationX(i * (-hl.L(16.0f)));
                linearLayout2.setTranslationX(f6 * hl.L(16.0f));
                return;
            default:
                c8a c8aVar = (c8a) callback;
                if (z) {
                    if (f > f4 / 2.0f || !c8aVar.s) {
                        return;
                    }
                } else if (f < f3 / 2.0f || !c8aVar.r) {
                    return;
                }
                c8aVar.s = !z;
                c8aVar.r = z;
                return;
        }
    }

    public f02(c8a c8aVar, boolean z, float f, float f2) {
        this.e = c8aVar;
        this.b = z;
        this.c = f;
        this.d = f2;
    }
}
