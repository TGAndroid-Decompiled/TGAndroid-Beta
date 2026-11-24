package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class sr1 extends t09 {
    public final int[] n1;
    public ValueAnimator o1;
    public boolean p1;
    public final mu1 q1;

    public sr1(mu1 mu1Var, mu1 mu1Var2, Activity activity, int i, wjb wjbVar) {
        super(3, i, wjbVar, activity, mu1Var2);
        this.q1 = mu1Var;
        this.n1 = new int[2];
        this.p1 = true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        aVar = ((d) this.q1).actionBar;
        r7 j = aVar.q(null).j(28);
        if (j != null) {
            int[] iArr = this.n1;
            getLocationInWindow(iArr);
            float x = getX();
            float width = getWidth() + x;
            j.getLocationInWindow(iArr);
            float width2 = (j.getWidth() / 2.0f) + iArr[0];
            int L = gl.L(20.0f);
            boolean z2 = k96.a0;
            if (z2) {
                i5 = -1;
            } else {
                i5 = 1;
            }
            float f = width2 + (L * i5);
            boolean z3 = this.p1;
            if (z2) {
                q(!z3, f - x);
            } else {
                q(!z3, f - width);
            }
            this.p1 = false;
        }
    }

    public final void q(boolean z, float f) {
        ValueAnimator valueAnimator = this.o1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o1 = null;
        }
        if (!z) {
            setBubbleOffset(f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V0, f);
        this.o1 = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 28));
        this.o1.setInterpolator(s33.h);
        this.o1.setDuration(420L);
        this.o1.start();
    }
}
