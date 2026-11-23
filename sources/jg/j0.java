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
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f17569a;
    public final Object f17570b;
    public final Object f17571c;
    public final Object d;
    public final Object f17572e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i7) {
        this.f17569a = i7;
        this.f17572e = frameLayout;
        this.d = view;
        this.f17570b = view2;
        this.f17571c = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17569a) {
            case 5:
                View view = (View) this.d;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).getTransitionParams().f32412i = false;
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
        switch (this.f17569a) {
            case 0:
                ((ViewPropertyAnimator) this.f17571c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f17572e;
                v4.f1 f1Var = (v4.f1) this.f17570b;
                k0Var.d(f1Var);
                k0Var.A.remove(f1Var);
                k0Var.G();
                return;
            case 1:
                ((v4.f1) this.f17570b).f59165a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ts tsVar = (ts) this.f17572e;
                rs rsVar = (rs) this.f17571c;
                tsVar.d(rsVar.f39331a);
                tsVar.f40032y.remove(rsVar.f39331a);
                tsVar.A();
                tsVar.d(rsVar.f39332b);
                tsVar.f40032y.remove(rsVar.f39332b);
                tsVar.A();
                return;
            case 2:
                ((jt0) this.f17572e).L1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((ds0) this.f17570b).removeView(view2);
                    ((Bitmap) this.f17571c).recycle();
                    return;
                }
                return;
            case 3:
                k2 k2Var = (k2) this.f17572e;
                TextView[] textViewArr = k2Var.f41146a;
                View view3 = (View) this.d;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.f17570b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.f17571c;
                if (runnable != null) {
                    runnable.run();
                }
                k2Var.f41150f = false;
                CharSequence charSequence = k2Var.f41149e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        k2Var.e(true);
                    } else {
                        textViewArr[1].setText(k2Var.f41149e);
                        k2Var.a(textViewArr[0], textViewArr[1], new oi.c2(this, 22));
                    }
                    k2Var.f41149e = null;
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f17572e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f17570b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f17571c;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f43592f0.setProgressToExpand(0.0f);
                profileActivity.f43553a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f43592f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f43652o0.setAlpha(1.0f);
                    profileActivity.f43652o0.L();
                    profileActivity.f43652o0.setVisibility(0);
                }
                profileActivity.f43559a5 = null;
                profileActivity.f43567b5 = 0.0f;
                profileActivity.Z.invalidate();
                profileActivity.f43643m5 = null;
                profileActivity.f43637l5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            default:
                v4.f1 f1Var2 = (v4.f1) this.f17570b;
                pi.k kVar2 = (pi.k) this.f17572e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view5).getTransitionParams().f32412i = false;
                }
                ((ViewPropertyAnimator) this.f17571c).setListener(null);
                if (kVar2.f59221y.remove(f1Var2)) {
                    kVar2.u(f1Var2);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17569a) {
            case 0:
                return;
            case 1:
                ts tsVar = (ts) this.f17572e;
                rs rsVar = (rs) this.f17571c;
                v4.f1 f1Var = rsVar.f39331a;
                tsVar.getClass();
                v4.f1 f1Var2 = rsVar.f39332b;
                tsVar.getClass();
                return;
            case 5:
                ((pi.k) this.f17572e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f17569a = i7;
        this.f17572e = obj;
        this.f17570b = obj2;
        this.f17571c = obj3;
        this.d = obj4;
    }

    public j0(pi.k kVar, v4.f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17569a = 5;
        this.f17572e = kVar;
        this.f17570b = f1Var;
        this.d = view;
        this.f17571c = viewPropertyAnimator;
    }

    public j0(ts tsVar, rs rsVar, v4.f1 f1Var, AnimatorSet animatorSet) {
        this.f17569a = 1;
        this.f17572e = tsVar;
        this.f17571c = rsVar;
        this.f17570b = f1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
