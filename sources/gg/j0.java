package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f10661a;
    public final Object f10662b;
    public final Object f10663c;
    public final Object d;
    public final Object f10664e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f10661a = i10;
        this.f10664e = frameLayout;
        this.f10663c = view;
        this.f10662b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f10661a) {
            case 1:
                View view = (View) this.f10663c;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).getTransitionParams().h = false;
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
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f10661a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f10663c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f10664e;
                s4.d1 d1Var = (s4.d1) this.f10662b;
                k0Var.d(d1Var);
                k0Var.A.remove(d1Var);
                k0Var.G();
                return;
            case 1:
                s4.d1 d1Var2 = (s4.d1) this.f10662b;
                ji.n nVar = (ji.n) this.f10664e;
                View view2 = (View) this.f10663c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f47851y.remove(d1Var2)) {
                    nVar.u(d1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.d1) this.f10662b).f47782a.setAlpha(1.0f);
                ((AnimatorSet) this.f10663c).removeAllListeners();
                st stVar = (st) this.f10664e;
                qt qtVar = (qt) this.d;
                stVar.d(qtVar.f30321a);
                stVar.f30941y.remove(qtVar.f30321a);
                stVar.A();
                stVar.d(qtVar.f30322b);
                stVar.f30941y.remove(qtVar.f30322b);
                stVar.A();
                return;
            case 3:
                ((cw0) this.f10664e).H1 = false;
                View view3 = (View) this.f10663c;
                if (view3.getParent() != null) {
                    ((vu0) this.f10662b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                q2 q2Var = (q2) this.f10664e;
                TextView[] textViewArr = q2Var.f32286a;
                View view4 = (View) this.f10663c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f10662b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                q2Var.f32290f = false;
                CharSequence charSequence = q2Var.f32289e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.f32289e);
                        q2Var.a(textViewArr[0], textViewArr[1], new i2.h0(this, 24));
                    }
                    q2Var.f32289e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f10663c;
                ProfileActivity profileActivity = (ProfileActivity) this.f10664e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f10662b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.d;
                if (u0Var != null) {
                    u0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f34304e0.setProgressToExpand(0.0f);
                profileActivity.f34273a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((m2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.y o9 = kVar.o();
                    ArrayList arrayList = o9.f21724e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    o9.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f34304e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f34365n0.setAlpha(1.0f);
                    profileActivity.f34365n0.L();
                    profileActivity.f34365n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f34324g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10661a) {
            case 0:
                return;
            case 1:
                ((ji.n) this.f10664e).getClass();
                return;
            case 2:
                st stVar = (st) this.f10664e;
                qt qtVar = (qt) this.d;
                s4.d1 d1Var = qtVar.f30321a;
                stVar.getClass();
                s4.d1 d1Var2 = qtVar.f30322b;
                stVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10661a = i10;
        this.f10664e = obj;
        this.f10662b = obj2;
        this.d = obj3;
        this.f10663c = obj4;
    }

    public j0(ji.n nVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10661a = 1;
        this.f10664e = nVar;
        this.f10662b = d1Var;
        this.f10663c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(st stVar, qt qtVar, s4.d1 d1Var, AnimatorSet animatorSet) {
        this.f10661a = 2;
        this.f10664e = stVar;
        this.d = qtVar;
        this.f10662b = d1Var;
        this.f10663c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
