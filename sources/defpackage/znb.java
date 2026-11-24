package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class znb extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final rob e;

    public znb(rob robVar, boolean z, int i, int i2, boolean z2) {
        this.e = robVar;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rob robVar = this.e;
        robVar.t1 = null;
        FrameLayout[] frameLayoutArr = robVar.N0;
        int i = this.c;
        boolean z = this.b;
        if (this.a) {
            if (frameLayoutArr[z ? 1 : 0].getVisibility() == 0) {
                frameLayoutArr[z ? 1 : 0].setAlpha(1.0f);
                frameLayoutArr[z ? 1 : 0].setVisibility(4);
            }
        } else {
            frameLayoutArr[i].setVisibility(4);
        }
        byte b = robVar.b;
        char c = 2;
        if (b != 1 && b != 2) {
            if (i == 1) {
                frameLayoutArr[z ? 1 : 0].setAlpha(0.0f);
                return;
            }
            return;
        }
        tsc[] tscVarArr = robVar.L0;
        if (this.d) {
            c = 0;
        }
        tscVarArr[c].setVisibility(4);
    }
}
