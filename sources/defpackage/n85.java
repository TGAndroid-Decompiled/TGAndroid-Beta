package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class n85 extends AnimatorListenerAdapter {
    public final m85 a;
    public final yc b;
    public final WindowManager c;
    public final FrameLayout d;
    public final r71 e;
    public final o85 f;

    public n85(o85 o85Var, m85 m85Var, yc ycVar, WindowManager windowManager, FrameLayout frameLayout, r71 r71Var) {
        this.f = o85Var;
        this.a = m85Var;
        this.b = ycVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = r71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kk7.f(this.f.h).d(new vz4(this.a, this.b, this.c, this.d, this.e, (byte) 6));
    }
}
