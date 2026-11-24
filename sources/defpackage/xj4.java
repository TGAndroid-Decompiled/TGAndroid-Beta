package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class xj4 extends Animation {
    public final byte a;
    public final float b;
    public final float c;
    public final int d;
    public final ek4 e;

    public xj4(ek4 ek4Var, float f, float f2, int i, byte b) {
        this.a = b;
        this.e = ek4Var;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        int i = this.d;
        ek4 ek4Var = this.e;
        float f2 = this.c;
        float f3 = this.b;
        switch (b) {
            case 0:
                float A = tb4.A(f2, f3, f, f3);
                ek4Var.getClass();
                ek4Var.i.setX(A + (ek4Var.f.getWidth() - i));
                float f4 = 1.0f - f;
                ek4Var.l.setAlpha(f4);
                ek4Var.j.setAlpha(f4);
                return;
            default:
                float A2 = tb4.A(f2, f3, f, f3);
                ek4Var.getClass();
                ek4Var.i.setX(A2 + (ek4Var.f.getWidth() - i));
                ek4Var.l.setAlpha(f);
                ek4Var.j.setAlpha(f);
                return;
        }
    }
}
