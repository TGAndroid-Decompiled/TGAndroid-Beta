package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class bq1 extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final yv1 d;

    public bq1(yv1 yv1Var, boolean z, boolean z2, boolean z3) {
        this.d = yv1Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        yv1 yv1Var = this.d;
        yv1Var.b3 = null;
        ImageView imageView = yv1Var.Y2;
        int i3 = 4;
        if (this.a) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = yv1Var.a3;
        if (this.b) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        imageView2.setVisibility(i2);
        RadialProgressView radialProgressView = yv1Var.Z2;
        if (this.c) {
            i3 = 0;
        }
        radialProgressView.setVisibility(i3);
    }
}
