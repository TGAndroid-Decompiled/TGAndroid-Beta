package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h4 extends AnimatorListenerAdapter {
    public final int f10657a;
    public final boolean f10658b;
    public final r5 f10659c;

    public h4(r5 r5Var, boolean z4, int i10) {
        this.f10657a = i10;
        this.f10659c = r5Var;
        this.f10658b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10657a) {
            case 0:
                if (!this.f10658b) {
                    this.f10659c.f10788y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f10658b) {
                    this.f10659c.f10786w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
