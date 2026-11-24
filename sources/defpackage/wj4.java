package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class wj4 extends Animation {
    public final byte a;
    public final int b;
    public final int c;
    public final float d;
    public final ek4 e;

    public wj4(ek4 ek4Var, int i, int i2, float f, byte b) {
        this.a = b;
        this.e = ek4Var;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    @Override
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        float f2 = this.d;
        ek4 ek4Var = this.e;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                int i3 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout = ek4Var.f;
                ek4.l(relativeLayout, relativeLayout.getLayoutParams().width, i + i3);
                if (ek4Var.M) {
                    RelativeLayout relativeLayout2 = ek4Var.f;
                    relativeLayout2.setY(f2 - relativeLayout2.getHeight());
                    ek4Var.g();
                    return;
                }
                return;
            case 1:
                RelativeLayout relativeLayout3 = ek4Var.f;
                ek4.l(relativeLayout3, ((int) (f * (i2 - i))) + i, relativeLayout3.getLayoutParams().height);
                RelativeLayout relativeLayout4 = ek4Var.f;
                relativeLayout4.setX(f2 - relativeLayout4.getWidth());
                ek4Var.g.setX(relativeLayout4.getWidth() - i);
                ek4Var.h.setX(relativeLayout4.getWidth() - i2);
                return;
            case 2:
                int i4 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout5 = ek4Var.f;
                ek4.l(relativeLayout5, relativeLayout5.getLayoutParams().width, i4 + i);
                if (ek4Var.M) {
                    RelativeLayout relativeLayout6 = ek4Var.f;
                    relativeLayout6.setY(f2 - (relativeLayout6.getHeight() - i));
                    ek4Var.g();
                    return;
                }
                return;
            default:
                RelativeLayout relativeLayout7 = ek4Var.f;
                ek4.l(relativeLayout7, ((int) (f * (i2 - i))) + i, relativeLayout7.getLayoutParams().height);
                RelativeLayout relativeLayout8 = ek4Var.f;
                relativeLayout8.setX(f2 - relativeLayout8.getWidth());
                ek4Var.g.setX(relativeLayout8.getWidth() - i2);
                ek4Var.h.setX(relativeLayout8.getWidth() - i);
                return;
        }
    }

    public wj4(ek4 ek4Var, int i, int i2, float f, float f2, byte b) {
        this.a = b;
        this.e = ek4Var;
        this.b = i;
        this.c = i2;
        this.d = f2;
    }
}
