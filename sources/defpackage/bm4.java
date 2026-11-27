package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class bm4 extends Animation {
    public final byte a;
    public final int b;
    public final int c;
    public final float d;
    public final jm4 e;

    public bm4(jm4 jm4Var, int i, int i2, float f, byte b) {
        this.a = b;
        this.e = jm4Var;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    @Override
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        float f2 = this.d;
        jm4 jm4Var = this.e;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                int i3 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout = jm4Var.f;
                jm4.l(relativeLayout, relativeLayout.getLayoutParams().width, i + i3);
                if (jm4Var.M) {
                    RelativeLayout relativeLayout2 = jm4Var.f;
                    relativeLayout2.setY(f2 - relativeLayout2.getHeight());
                    jm4Var.g();
                    return;
                }
                return;
            case 1:
                RelativeLayout relativeLayout3 = jm4Var.f;
                jm4.l(relativeLayout3, ((int) (f * (i2 - i))) + i, relativeLayout3.getLayoutParams().height);
                RelativeLayout relativeLayout4 = jm4Var.f;
                relativeLayout4.setX(f2 - relativeLayout4.getWidth());
                jm4Var.g.setX(relativeLayout4.getWidth() - i);
                jm4Var.h.setX(relativeLayout4.getWidth() - i2);
                return;
            case 2:
                int i4 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout5 = jm4Var.f;
                jm4.l(relativeLayout5, relativeLayout5.getLayoutParams().width, i4 + i);
                if (jm4Var.M) {
                    RelativeLayout relativeLayout6 = jm4Var.f;
                    relativeLayout6.setY(f2 - (relativeLayout6.getHeight() - i));
                    jm4Var.g();
                    return;
                }
                return;
            default:
                RelativeLayout relativeLayout7 = jm4Var.f;
                jm4.l(relativeLayout7, ((int) (f * (i2 - i))) + i, relativeLayout7.getLayoutParams().height);
                RelativeLayout relativeLayout8 = jm4Var.f;
                relativeLayout8.setX(f2 - relativeLayout8.getWidth());
                jm4Var.g.setX(relativeLayout8.getWidth() - i2);
                jm4Var.h.setX(relativeLayout8.getWidth() - i);
                return;
        }
    }

    public bm4(jm4 jm4Var, int i, int i2, float f, float f2, byte b) {
        this.a = b;
        this.e = jm4Var;
        this.b = i;
        this.c = i2;
        this.d = f2;
    }
}
