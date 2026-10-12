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
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f10660a;
    public final Object f10661b;
    public final Object f10662c;
    public final Object d;
    public final Object f10663e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f10660a = i10;
        this.f10663e = frameLayout;
        this.f10662c = view;
        this.f10661b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f10660a) {
            case 1:
                View view = (View) this.f10662c;
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
        switch (this.f10660a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f10662c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f10663e;
                s4.d1 d1Var = (s4.d1) this.f10661b;
                k0Var.d(d1Var);
                k0Var.A.remove(d1Var);
                k0Var.G();
                return;
            case 1:
                s4.d1 d1Var2 = (s4.d1) this.f10661b;
                ji.n nVar = (ji.n) this.f10663e;
                View view2 = (View) this.f10662c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f47958y.remove(d1Var2)) {
                    nVar.u(d1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.d1) this.f10661b).f47889a.setAlpha(1.0f);
                ((AnimatorSet) this.f10662c).removeAllListeners();
                tt ttVar = (tt) this.f10663e;
                rt rtVar = (rt) this.d;
                ttVar.d(rtVar.f30238a);
                ttVar.f30976y.remove(rtVar.f30238a);
                ttVar.A();
                ttVar.d(rtVar.f30239b);
                ttVar.f30976y.remove(rtVar.f30239b);
                ttVar.A();
                return;
            case 3:
                ((hw0) this.f10663e).H1 = false;
                View view3 = (View) this.f10662c;
                if (view3.getParent() != null) {
                    ((av0) this.f10661b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                q2 q2Var = (q2) this.f10663e;
                TextView[] textViewArr = q2Var.f31921a;
                View view4 = (View) this.f10662c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f10661b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                q2Var.f31925f = false;
                CharSequence charSequence = q2Var.f31924e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.f31924e);
                        q2Var.a(textViewArr[0], textViewArr[1], new i2.h0(this, 24));
                    }
                    q2Var.f31924e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f10662c;
                ProfileActivity profileActivity = (ProfileActivity) this.f10663e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f10661b;
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
                profileActivity.f34079e0.setProgressToExpand(0.0f);
                profileActivity.f34048a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((m2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.y p5 = kVar.p();
                    ArrayList arrayList = p5.f21462e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    p5.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f34079e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f34140n0.setAlpha(1.0f);
                    profileActivity.f34140n0.L();
                    profileActivity.f34140n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f34099g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10660a) {
            case 0:
                return;
            case 1:
                ((ji.n) this.f10663e).getClass();
                return;
            case 2:
                tt ttVar = (tt) this.f10663e;
                rt rtVar = (rt) this.d;
                s4.d1 d1Var = rtVar.f30238a;
                ttVar.getClass();
                s4.d1 d1Var2 = rtVar.f30239b;
                ttVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10660a = i10;
        this.f10663e = obj;
        this.f10661b = obj2;
        this.d = obj3;
        this.f10662c = obj4;
    }

    public j0(ji.n nVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10660a = 1;
        this.f10663e = nVar;
        this.f10661b = d1Var;
        this.f10662c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(tt ttVar, rt rtVar, s4.d1 d1Var, AnimatorSet animatorSet) {
        this.f10660a = 2;
        this.f10663e = ttVar;
        this.d = rtVar;
        this.f10661b = d1Var;
        this.f10662c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
