package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.ProfileActivity;
public final class g0 extends AnimatorListenerAdapter {
    public final int f17029a;
    public final Object f17030b;
    public final Object f17031c;
    public final Object d;
    public final Object f17032e;

    public g0(FrameLayout frameLayout, View view, View view2, Object obj, int i3) {
        this.f17029a = i3;
        this.f17032e = frameLayout;
        this.f17031c = view;
        this.f17030b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17029a) {
            case 1:
                View view = (View) this.f17031c;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).getTransitionParams().f30875i = false;
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
        switch (this.f17029a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f17031c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                h0 h0Var = (h0) this.f17032e;
                u4.d1 d1Var = (u4.d1) this.f17030b;
                h0Var.d(d1Var);
                h0Var.A.remove(d1Var);
                h0Var.G();
                return;
            case 1:
                u4.d1 d1Var2 = (u4.d1) this.f17030b;
                ni.l lVar = (ni.l) this.f17032e;
                View view2 = (View) this.f17031c;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view2).getTransitionParams().f30875i = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (lVar.f55606y.remove(d1Var2)) {
                    lVar.u(d1Var2);
                    lVar.G();
                    return;
                }
                return;
            case 2:
                ((u4.d1) this.f17030b).f55540a.setAlpha(1.0f);
                ((AnimatorSet) this.f17031c).removeAllListeners();
                es esVar = (es) this.f17032e;
                cs csVar = (cs) this.d;
                esVar.d(csVar.f32826a);
                esVar.f33462y.remove(csVar.f32826a);
                esVar.A();
                esVar.d(csVar.f32827b);
                esVar.f33462y.remove(csVar.f32827b);
                esVar.A();
                return;
            case 3:
                ((ws0) this.f17032e).L1 = false;
                View view3 = (View) this.f17031c;
                if (view3.getParent() != null) {
                    ((rr0) this.f17030b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.voip.w1 w1Var = (org.telegram.ui.Components.voip.w1) this.f17032e;
                TextView[] textViewArr = w1Var.f39662a;
                View view4 = (View) this.f17031c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f17030b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                w1Var.f39666f = false;
                CharSequence charSequence = w1Var.f39665e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        w1Var.e(true);
                    } else {
                        textViewArr[1].setText(w1Var.f39665e);
                        w1Var.a(textViewArr[0], textViewArr[1], new d4(this, 13));
                    }
                    w1Var.f39665e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f17031c;
                ProfileActivity profileActivity = (ProfileActivity) this.f17032e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f17030b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.d;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f41758f0.setProgressToExpand(0.0f);
                profileActivity.f41719a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f41758f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f41817o0.setAlpha(1.0f);
                    profileActivity.f41817o0.L();
                    profileActivity.f41817o0.setVisibility(0);
                }
                profileActivity.X4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f41777h5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17029a) {
            case 0:
                return;
            case 1:
                ((ni.l) this.f17032e).getClass();
                return;
            case 2:
                es esVar = (es) this.f17032e;
                cs csVar = (cs) this.d;
                u4.d1 d1Var = csVar.f32826a;
                esVar.getClass();
                u4.d1 d1Var2 = csVar.f32827b;
                esVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public g0(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f17029a = i3;
        this.f17032e = obj;
        this.f17030b = obj2;
        this.d = obj3;
        this.f17031c = obj4;
    }

    public g0(ni.l lVar, u4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17029a = 1;
        this.f17032e = lVar;
        this.f17030b = d1Var;
        this.f17031c = view;
        this.d = viewPropertyAnimator;
    }

    public g0(es esVar, cs csVar, u4.d1 d1Var, AnimatorSet animatorSet) {
        this.f17029a = 2;
        this.f17032e = esVar;
        this.d = csVar;
        this.f17030b = d1Var;
        this.f17031c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
