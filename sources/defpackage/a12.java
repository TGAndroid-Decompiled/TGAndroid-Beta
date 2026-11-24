package defpackage;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class a12 implements it3 {
    public final byte a = 0;
    public final boolean b;
    public final float c;
    public final float d;
    public final KeyEvent.Callback e;

    public a12(i22 i22Var, float f, float f2, boolean z) {
        this.e = i22Var;
        this.c = f;
        this.d = f2;
        this.b = z;
    }

    @Override
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        float f3 = this.d;
        float f4 = this.c;
        boolean z = this.b;
        KeyEvent.Callback callback = this.e;
        switch (b) {
            case 0:
                i22 i22Var = (i22) callback;
                LinearLayout linearLayout = i22Var.i3;
                LinearLayout linearLayout2 = i22Var.k3;
                float f5 = f / 500.0f;
                t12 t12Var = i22Var.Y1;
                a22 a22Var = i22Var.v2;
                Float valueOf = Float.valueOf(f5);
                t12Var.getClass();
                t12Var.a(a22Var, valueOf);
                i22Var.U2.setAlpha(gm.R1(f4, f3, f5));
                i22Var.H1(i22Var.v2, 0);
                i22Var.H1(i22Var.w2, 0);
                if (!(i22Var.w2 instanceof x62) || z) {
                    f5 = 1.0f - f5;
                }
                float i = Utilities.i(f5, 1.0f, 0.0f);
                linearLayout2.setAlpha(i);
                float f6 = 1.0f - i;
                linearLayout.setAlpha(f6);
                linearLayout.setTranslationX(i * (-gm.L(16.0f)));
                linearLayout2.setTranslationX(f6 * gm.L(16.0f));
                return;
            default:
                m6a m6aVar = (m6a) callback;
                if (z) {
                    if (f > f4 / 2.0f || !m6aVar.s) {
                        return;
                    }
                } else if (f < f3 / 2.0f || !m6aVar.r) {
                    return;
                }
                m6aVar.s = !z;
                m6aVar.r = z;
                return;
        }
    }

    public a12(m6a m6aVar, boolean z, float f, float f2) {
        this.e = m6aVar;
        this.b = z;
        this.c = f;
        this.d = f2;
    }
}
