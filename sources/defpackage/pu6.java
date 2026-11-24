package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class pu6 extends Animation {
    public final byte a;
    public final int b;
    public final int c;
    public final View d;

    public pu6(int i, int i2, View view, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = view;
    }

    @Override
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        View view = this.d;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                wu6.o(i2 - ((int) ((i2 - i) * f)), view);
                return;
            default:
                int i3 = i + ((int) ((i2 - i) * f));
                int i4 = rv6.k0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i3;
                view.setLayoutParams(layoutParams);
                return;
        }
    }
}
