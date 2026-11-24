package defpackage;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class h44 extends FrameLayout {
    public final g44 a;
    public final TransitionSet b;
    public boolean c;

    public h44(Activity activity) {
        super(activity);
        this.c = false;
        setWillNotDraw(false);
        g44 g44Var = new g44(activity);
        this.a = g44Var;
        addView(g44Var, qoe.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new z5((byte) 1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) d53.f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z) {
            TransitionManager.beginDelayedTransition(this, this.b);
        }
        g44 g44Var = this.a;
        g44Var.w = 255;
        g44Var.n = -1;
        g44Var.s = 0;
        g44Var.r = gm.L(8.0f);
        ViewGroup.LayoutParams layoutParams = g44Var.getLayoutParams();
        layoutParams.width = -1;
        g44Var.setLayoutParams(layoutParams);
        gm.d3(new pv3(this, onClickListener, (byte) 12), 500L);
    }

    public g44 getEndCloseView() {
        return this.a;
    }
}
