package defpackage;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class r34 extends FrameLayout {
    public final q34 a;
    public final TransitionSet b;
    public boolean c;

    public r34(Activity activity) {
        super(activity);
        this.c = false;
        setWillNotDraw(false);
        q34 q34Var = new q34(activity);
        this.a = q34Var;
        addView(q34Var, tre.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new a6((byte) 1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) k43.f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z) {
            TransitionManager.beginDelayedTransition(this, this.b);
        }
        q34 q34Var = this.a;
        q34Var.w = 255;
        q34Var.n = -1;
        q34Var.s = 0;
        q34Var.r = hl.L(8.0f);
        ViewGroup.LayoutParams layoutParams = q34Var.getLayoutParams();
        layoutParams.width = -1;
        q34Var.setLayoutParams(layoutParams);
        hl.d3(new vx3(this, onClickListener, (byte) 8), 500L);
    }

    public q34 getEndCloseView() {
        return this.a;
    }
}
