package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class na5 extends AnimatorListenerAdapter {
    public final ma5 a;
    public final yd b;
    public final WindowManager c;
    public final FrameLayout d;
    public final z81 e;
    public final oa5 f;

    public na5(oa5 oa5Var, ma5 ma5Var, yd ydVar, WindowManager windowManager, FrameLayout frameLayout, z81 z81Var) {
        this.f = oa5Var;
        this.a = ma5Var;
        this.b = ydVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = z81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm7.f(this.f.h).d(new v15(this.a, this.b, this.c, this.d, this.e, (byte) 6));
    }
}
