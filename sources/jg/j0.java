package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.voip.l2;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f17158a;
    public final Object f17159b;
    public final Object f17160c;
    public final Object d;
    public final Object f17161e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i7) {
        this.f17158a = i7;
        this.f17161e = frameLayout;
        this.d = view;
        this.f17159b = view2;
        this.f17160c = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17158a) {
            case 5:
                View view = (View) this.d;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).getTransitionParams().f31951i = false;
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
        switch (this.f17158a) {
            case 0:
                ((ViewPropertyAnimator) this.f17160c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f17161e;
                v4.e1 e1Var = (v4.e1) this.f17159b;
                k0Var.d(e1Var);
                k0Var.A.remove(e1Var);
                k0Var.G();
                return;
            case 1:
                ((v4.e1) this.f17159b).f58535a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ks ksVar = (ks) this.f17161e;
                is isVar = (is) this.f17160c;
                ksVar.d(isVar.f35697a);
                ksVar.f36592y.remove(isVar.f35697a);
                ksVar.A();
                ksVar.d(isVar.f35698b);
                ksVar.f36592y.remove(isVar.f35698b);
                ksVar.A();
                return;
            case 2:
                ((ys0) this.f17161e).L1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((tr0) this.f17159b).removeView(view2);
                    ((Bitmap) this.f17160c).recycle();
                    return;
                }
                return;
            case 3:
                l2 l2Var = (l2) this.f17161e;
                TextView[] textViewArr = l2Var.f40763a;
                View view3 = (View) this.d;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.f17159b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.f17160c;
                if (runnable != null) {
                    runnable.run();
                }
                l2Var.f40767f = false;
                CharSequence charSequence = l2Var.f40766e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        l2Var.e(true);
                    } else {
                        textViewArr[1].setText(l2Var.f40766e);
                        l2Var.a(textViewArr[0], textViewArr[1], new org.telegram.ui.ActionBar.r0(this, 19));
                    }
                    l2Var.f40766e = null;
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f17161e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f17159b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f17160c;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f43101f0.setProgressToExpand(0.0f);
                profileActivity.f43062a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f43101f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f43161o0.setAlpha(1.0f);
                    profileActivity.f43161o0.L();
                    profileActivity.f43161o0.setVisibility(0);
                }
                profileActivity.Y4 = null;
                profileActivity.Z4 = 0.0f;
                profileActivity.Z.invalidate();
                profileActivity.f43140k5 = null;
                profileActivity.f43133j5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            default:
                v4.e1 e1Var2 = (v4.e1) this.f17159b;
                pi.k kVar2 = (pi.k) this.f17161e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view5).getTransitionParams().f31951i = false;
                }
                ((ViewPropertyAnimator) this.f17160c).setListener(null);
                if (kVar2.f58595y.remove(e1Var2)) {
                    kVar2.u(e1Var2);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17158a) {
            case 0:
                return;
            case 1:
                ks ksVar = (ks) this.f17161e;
                is isVar = (is) this.f17160c;
                v4.e1 e1Var = isVar.f35697a;
                ksVar.getClass();
                v4.e1 e1Var2 = isVar.f35698b;
                ksVar.getClass();
                return;
            case 5:
                ((pi.k) this.f17161e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f17158a = i7;
        this.f17161e = obj;
        this.f17159b = obj2;
        this.f17160c = obj3;
        this.d = obj4;
    }

    public j0(pi.k kVar, v4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17158a = 5;
        this.f17161e = kVar;
        this.f17159b = e1Var;
        this.d = view;
        this.f17160c = viewPropertyAnimator;
    }

    public j0(ks ksVar, is isVar, v4.e1 e1Var, AnimatorSet animatorSet) {
        this.f17158a = 1;
        this.f17161e = ksVar;
        this.f17160c = isVar;
        this.f17159b = e1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
