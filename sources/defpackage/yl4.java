package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class yl4 extends Animation {
    public final byte a;
    public final float b;
    public final float c;
    public final int d;
    public final fm4 e;

    public yl4(fm4 fm4Var, float f, float f2, int i, byte b) {
        this.a = b;
        this.e = fm4Var;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        int i = this.d;
        fm4 fm4Var = this.e;
        float f2 = this.c;
        float f3 = this.b;
        switch (b) {
            case 0:
                float A = td4.A(f2, f3, f, f3);
                fm4Var.getClass();
                fm4Var.i.setX(A + (fm4Var.f.getWidth() - i));
                float f4 = 1.0f - f;
                fm4Var.l.setAlpha(f4);
                fm4Var.j.setAlpha(f4);
                return;
            default:
                float A2 = td4.A(f2, f3, f, f3);
                fm4Var.getClass();
                fm4Var.i.setX(A2 + (fm4Var.f.getWidth() - i));
                fm4Var.l.setAlpha(f);
                fm4Var.j.setAlpha(f);
                return;
        }
    }
}
