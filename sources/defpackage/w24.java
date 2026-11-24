package defpackage;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class w24 extends FrameLayout {
    public final v24 a;
    public final TransitionSet b;
    public boolean c;

    public w24(Activity activity) {
        super(activity);
        this.c = false;
        setWillNotDraw(false);
        v24 v24Var = new v24(activity);
        this.a = v24Var;
        addView(v24Var, nme.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new z5((byte) 1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) s33.f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z) {
            TransitionManager.beginDelayedTransition(this, this.b);
        }
        v24 v24Var = this.a;
        v24Var.w = 255;
        v24Var.n = -1;
        v24Var.s = 0;
        v24Var.r = gl.L(8.0f);
        ViewGroup.LayoutParams layoutParams = v24Var.getLayoutParams();
        layoutParams.width = -1;
        v24Var.setLayoutParams(layoutParams);
        gl.e3(new eu3(this, onClickListener, (byte) 11), 500L);
    }

    public v24 getEndCloseView() {
        return this.a;
    }
}
