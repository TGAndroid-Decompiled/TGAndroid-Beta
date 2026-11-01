package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ActionBar.t0;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.voip.w1;
import org.telegram.ui.ProfileActivity;
import s4.c1;
import zf.a0;
public final class i extends AnimatorListenerAdapter {
    public final int f4216a;
    public final Object f4217b;
    public final Object f4218c;
    public final Object d;
    public final Object e;

    public i(Object obj, Object obj2, View view, Object obj3, int i10) {
        this.f4216a = i10;
        this.e = obj;
        this.f4217b = obj2;
        this.f4218c = view;
        this.d = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4216a) {
            case 0:
                View view = (View) this.f4218c;
                view.setTranslationY(0.0f);
                if (view instanceof q1) {
                    ((q1) view).getTransitionParams().f23492i = false;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4216a) {
            case 0:
                c1 c1Var = (c1) this.f4217b;
                o oVar = (o) this.e;
                View view = (View) this.f4218c;
                if (view instanceof q1) {
                    ((q1) view).getTransitionParams().f23492i = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (oVar.f47965y.remove(c1Var)) {
                    oVar.u(c1Var);
                    oVar.G();
                    return;
                }
                return;
            case 1:
                ((c1) this.f4217b).f47909a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ps psVar = (ps) this.e;
                ns nsVar = (ns) this.f4218c;
                psVar.d(nsVar.f28957a);
                psVar.f29528y.remove(nsVar.f28957a);
                psVar.A();
                psVar.d(nsVar.f28958b);
                psVar.f29528y.remove(nsVar.f28958b);
                psVar.A();
                return;
            case 2:
                ((au0) this.e).K1 = false;
                View view2 = (View) this.f4218c;
                if (view2.getParent() != null) {
                    ((ts0) this.f4217b).removeView(view2);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 3:
                w1 w1Var = (w1) this.e;
                TextView[] textViewArr = w1Var.f31770a;
                View view3 = (View) this.f4218c;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.f4217b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                w1Var.f31773f = false;
                CharSequence charSequence = w1Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        w1Var.e(true);
                    } else {
                        textViewArr[1].setText(w1Var.e);
                        w1Var.a(textViewArr[0], textViewArr[1], new w5(this, 9));
                    }
                    w1Var.e = null;
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) this.f4217b;
                if (lVar != null) {
                    lVar.setSkipDrawChild(false);
                }
                t0 t0Var = (t0) this.f4218c;
                if (t0Var != null) {
                    t0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f33809e0.setProgressToExpand(0.0f);
                profileActivity.f33779a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.I1 == 2) {
                    profileActivity.I1 = 1;
                    profileActivity.f33809e0.setForegroundAlpha(1.0f);
                    profileActivity.X.setVisibility(8);
                    profileActivity.f33871n0.setAlpha(1.0f);
                    profileActivity.f33871n0.L();
                    profileActivity.f33871n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Y.invalidate();
                profileActivity.f33829g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            default:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view5 = (View) this.f4218c;
                view5.setAlpha(1.0f);
                view5.setTranslationX(0.0f);
                view5.setTranslationY(0.0f);
                view5.setScaleX(1.0f);
                view5.setScaleY(1.0f);
                a0 a0Var = (a0) this.e;
                c1 c1Var2 = (c1) this.f4217b;
                a0Var.d(c1Var2);
                a0Var.A.remove(c1Var2);
                a0Var.G();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4216a) {
            case 0:
                ((o) this.e).getClass();
                return;
            case 1:
                ps psVar = (ps) this.e;
                ns nsVar = (ns) this.f4218c;
                c1 c1Var = nsVar.f28957a;
                psVar.getClass();
                c1 c1Var2 = nsVar.f28958b;
                psVar.getClass();
                return;
            case 5:
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public i(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4216a = i10;
        this.e = obj;
        this.f4218c = obj2;
        this.f4217b = obj3;
        this.d = obj4;
    }

    public i(a0 a0Var, c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4216a = 5;
        this.e = a0Var;
        this.f4217b = c1Var;
        this.d = viewPropertyAnimator;
        this.f4218c = view;
    }

    private final void a(Animator animator) {
    }
}
