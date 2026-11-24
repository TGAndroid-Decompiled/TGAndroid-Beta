package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class ylb extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final qmb e;

    public ylb(qmb qmbVar, boolean z, int i, int i2, boolean z2) {
        this.e = qmbVar;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qmb qmbVar = this.e;
        qmbVar.t1 = null;
        FrameLayout[] frameLayoutArr = qmbVar.N0;
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
        byte b = qmbVar.b;
        char c = 2;
        if (b != 1 && b != 2) {
            if (i == 1) {
                frameLayoutArr[z ? 1 : 0].setAlpha(0.0f);
                return;
            }
            return;
        }
        rqc[] rqcVarArr = qmbVar.L0;
        if (this.d) {
            c = 0;
        }
        rqcVarArr[c].setVisibility(4);
    }
}
