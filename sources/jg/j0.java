package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.os;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.voip.l2;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f17637a;
    public final Object f17638b;
    public final Object f17639c;
    public final Object d;
    public final Object f17640e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i7) {
        this.f17637a = i7;
        this.f17640e = frameLayout;
        this.d = view;
        this.f17638b = view2;
        this.f17639c = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17637a) {
            case 5:
                View view = (View) this.d;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).getTransitionParams().f32479i = false;
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
        switch (this.f17637a) {
            case 0:
                ((ViewPropertyAnimator) this.f17639c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f17640e;
                v4.f1 f1Var = (v4.f1) this.f17638b;
                k0Var.d(f1Var);
                k0Var.A.remove(f1Var);
                k0Var.G();
                return;
            case 1:
                ((v4.f1) this.f17638b).f59245a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                qs qsVar = (qs) this.f17640e;
                os osVar = (os) this.f17639c;
                qsVar.d(osVar.f38260a);
                qsVar.f38993y.remove(osVar.f38260a);
                qsVar.A();
                qsVar.d(osVar.f38261b);
                qsVar.f38993y.remove(osVar.f38261b);
                qsVar.A();
                return;
            case 2:
                ((it0) this.f17640e).L1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((ds0) this.f17638b).removeView(view2);
                    ((Bitmap) this.f17639c).recycle();
                    return;
                }
                return;
            case 3:
                l2 l2Var = (l2) this.f17640e;
                TextView[] textViewArr = l2Var.f41039a;
                View view3 = (View) this.d;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.f17638b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.f17639c;
                if (runnable != null) {
                    runnable.run();
                }
                l2Var.f41043f = false;
                CharSequence charSequence = l2Var.f41042e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        l2Var.e(true);
                    } else {
                        textViewArr[1].setText(l2Var.f41042e);
                        l2Var.a(textViewArr[0], textViewArr[1], new oi.c2(this, 22));
                    }
                    l2Var.f41042e = null;
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f17640e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f17638b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f17639c;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f43673f0.setProgressToExpand(0.0f);
                profileActivity.f43634a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f43673f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f43733o0.setAlpha(1.0f);
                    profileActivity.f43733o0.L();
                    profileActivity.f43733o0.setVisibility(0);
                }
                profileActivity.f43640a5 = null;
                profileActivity.f43648b5 = 0.0f;
                profileActivity.Z.invalidate();
                profileActivity.f43724m5 = null;
                profileActivity.f43718l5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            default:
                v4.f1 f1Var2 = (v4.f1) this.f17638b;
                pi.k kVar2 = (pi.k) this.f17640e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view5).getTransitionParams().f32479i = false;
                }
                ((ViewPropertyAnimator) this.f17639c).setListener(null);
                if (kVar2.f59305y.remove(f1Var2)) {
                    kVar2.u(f1Var2);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17637a) {
            case 0:
                return;
            case 1:
                qs qsVar = (qs) this.f17640e;
                os osVar = (os) this.f17639c;
                v4.f1 f1Var = osVar.f38260a;
                qsVar.getClass();
                v4.f1 f1Var2 = osVar.f38261b;
                qsVar.getClass();
                return;
            case 5:
                ((pi.k) this.f17640e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f17637a = i7;
        this.f17640e = obj;
        this.f17638b = obj2;
        this.f17639c = obj3;
        this.d = obj4;
    }

    public j0(pi.k kVar, v4.f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17637a = 5;
        this.f17640e = kVar;
        this.f17638b = f1Var;
        this.d = view;
        this.f17639c = viewPropertyAnimator;
    }

    public j0(qs qsVar, os osVar, v4.f1 f1Var, AnimatorSet animatorSet) {
        this.f17637a = 1;
        this.f17640e = qsVar;
        this.f17639c = osVar;
        this.f17638b = f1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
