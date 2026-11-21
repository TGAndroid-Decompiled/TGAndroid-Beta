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
    public final int f17566a;
    public final Object f17567b;
    public final Object f17568c;
    public final Object d;
    public final Object f17569e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i7) {
        this.f17566a = i7;
        this.f17569e = frameLayout;
        this.d = view;
        this.f17567b = view2;
        this.f17568c = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17566a) {
            case 5:
                View view = (View) this.d;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).getTransitionParams().f32409i = false;
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
        switch (this.f17566a) {
            case 0:
                ((ViewPropertyAnimator) this.f17568c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f17569e;
                v4.f1 f1Var = (v4.f1) this.f17567b;
                k0Var.d(f1Var);
                k0Var.A.remove(f1Var);
                k0Var.G();
                return;
            case 1:
                ((v4.f1) this.f17567b).f59161a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ts tsVar = (ts) this.f17569e;
                rs rsVar = (rs) this.f17568c;
                tsVar.d(rsVar.f39321a);
                tsVar.f40039y.remove(rsVar.f39321a);
                tsVar.A();
                tsVar.d(rsVar.f39322b);
                tsVar.f40039y.remove(rsVar.f39322b);
                tsVar.A();
                return;
            case 2:
                ((jt0) this.f17569e).L1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((ds0) this.f17567b).removeView(view2);
                    ((Bitmap) this.f17568c).recycle();
                    return;
                }
                return;
            case 3:
                k2 k2Var = (k2) this.f17569e;
                TextView[] textViewArr = k2Var.f41144a;
                View view3 = (View) this.d;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.f17567b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.f17568c;
                if (runnable != null) {
                    runnable.run();
                }
                k2Var.f41148f = false;
                CharSequence charSequence = k2Var.f41147e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        k2Var.e(true);
                    } else {
                        textViewArr[1].setText(k2Var.f41147e);
                        k2Var.a(textViewArr[0], textViewArr[1], new oi.c2(this, 22));
                    }
                    k2Var.f41147e = null;
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f17569e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f17567b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f17568c;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f43588f0.setProgressToExpand(0.0f);
                profileActivity.f43549a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f43588f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f43648o0.setAlpha(1.0f);
                    profileActivity.f43648o0.L();
                    profileActivity.f43648o0.setVisibility(0);
                }
                profileActivity.f43555a5 = null;
                profileActivity.f43563b5 = 0.0f;
                profileActivity.Z.invalidate();
                profileActivity.f43639m5 = null;
                profileActivity.f43633l5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            default:
                v4.f1 f1Var2 = (v4.f1) this.f17567b;
                pi.k kVar2 = (pi.k) this.f17569e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view5).getTransitionParams().f32409i = false;
                }
                ((ViewPropertyAnimator) this.f17568c).setListener(null);
                if (kVar2.f59217y.remove(f1Var2)) {
                    kVar2.u(f1Var2);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17566a) {
            case 0:
                return;
            case 1:
                ts tsVar = (ts) this.f17569e;
                rs rsVar = (rs) this.f17568c;
                v4.f1 f1Var = rsVar.f39321a;
                tsVar.getClass();
                v4.f1 f1Var2 = rsVar.f39322b;
                tsVar.getClass();
                return;
            case 5:
                ((pi.k) this.f17569e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f17566a = i7;
        this.f17569e = obj;
        this.f17567b = obj2;
        this.f17568c = obj3;
        this.d = obj4;
    }

    public j0(pi.k kVar, v4.f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17566a = 5;
        this.f17569e = kVar;
        this.f17567b = f1Var;
        this.d = view;
        this.f17568c = viewPropertyAnimator;
    }

    public j0(ts tsVar, rs rsVar, v4.f1 f1Var, AnimatorSet animatorSet) {
        this.f17566a = 1;
        this.f17569e = tsVar;
        this.f17568c = rsVar;
        this.f17567b = f1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
