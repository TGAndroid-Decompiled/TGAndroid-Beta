package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class cm4 extends Animation {
    public final byte a;
    public final float b;
    public final float c;
    public final int d;
    public final jm4 e;

    public cm4(jm4 jm4Var, float f, float f2, int i, byte b) {
        this.a = b;
        this.e = jm4Var;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        int i = this.d;
        jm4 jm4Var = this.e;
        float f2 = this.c;
        float f3 = this.b;
        switch (b) {
            case 0:
                float A = qd4.A(f2, f3, f, f3);
                jm4Var.getClass();
                jm4Var.i.setX(A + (jm4Var.f.getWidth() - i));
                float f4 = 1.0f - f;
                jm4Var.l.setAlpha(f4);
                jm4Var.j.setAlpha(f4);
                return;
            default:
                float A2 = qd4.A(f2, f3, f, f3);
                jm4Var.getClass();
                jm4Var.i.setX(A2 + (jm4Var.f.getWidth() - i));
                jm4Var.l.setAlpha(f);
                jm4Var.j.setAlpha(f);
                return;
        }
    }
}
