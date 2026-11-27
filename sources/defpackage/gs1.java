package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class gs1 extends i49 {
    public final int[] n1;
    public ValueAnimator o1;
    public boolean p1;
    public final zu1 q1;

    public gs1(zu1 zu1Var, zu1 zu1Var2, Activity activity, int i, vnb vnbVar) {
        super(3, i, vnbVar, activity, zu1Var2);
        this.q1 = zu1Var;
        this.n1 = new int[2];
        this.p1 = true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        aVar = ((e) this.q1).actionBar;
        s7 j = aVar.q(null).j(28);
        if (j != null) {
            int[] iArr = this.n1;
            getLocationInWindow(iArr);
            float x = getX();
            float width = getWidth() + x;
            j.getLocationInWindow(iArr);
            float width2 = (j.getWidth() / 2.0f) + iArr[0];
            int L = hl.L(20.0f);
            boolean z2 = ob6.a0;
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
        ofFloat.addUpdateListener(new g0(this, (byte) 29));
        this.o1.setInterpolator(k43.h);
        this.o1.setDuration(420L);
        this.o1.start();
    }
}
