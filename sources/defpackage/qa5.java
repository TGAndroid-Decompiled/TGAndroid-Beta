package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class qa5 extends AnimatorListenerAdapter {
    public final pa5 a;
    public final zc b;
    public final WindowManager c;
    public final FrameLayout d;
    public final z71 e;
    public final ra5 f;

    public qa5(ra5 ra5Var, pa5 pa5Var, zc zcVar, WindowManager windowManager, FrameLayout frameLayout, z71 z71Var) {
        this.f = ra5Var;
        this.a = pa5Var;
        this.b = zcVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = z71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jn7.f(this.f.h).d(new tw4(this.a, this.b, this.c, this.d, this.e, (byte) 7));
    }
}
