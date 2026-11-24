package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class ls1 extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final mu1 d;

    public ls1(mu1 mu1Var, boolean z, boolean z2, boolean z3) {
        this.d = mu1Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        mu1 mu1Var = this.d;
        mu1Var.b3 = null;
        ImageView imageView = mu1Var.Y2;
        int i3 = 4;
        if (this.a) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = mu1Var.a3;
        if (this.b) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        imageView2.setVisibility(i2);
        RadialProgressView radialProgressView = mu1Var.Z2;
        if (this.c) {
            i3 = 0;
        }
        radialProgressView.setVisibility(i3);
    }
}
