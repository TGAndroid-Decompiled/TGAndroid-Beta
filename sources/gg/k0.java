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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.ProfileActivity;
public final class k0 extends AnimatorListenerAdapter {
    public final int f9807a;
    public final Object f9808b;
    public final Object f9809c;
    public final Object d;
    public final Object e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f9807a = i10;
        this.e = frameLayout;
        this.f9809c = view;
        this.f9808b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f9807a) {
            case 1:
                View view = (View) this.f9809c;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).getTransitionParams().h = false;
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
        switch (this.f9807a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f9809c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.e;
                s4.c1 c1Var = (s4.c1) this.f9808b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                return;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.f9808b;
                ji.n nVar = (ji.n) this.e;
                View view2 = (View) this.f9809c;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f42741y.remove(c1Var2)) {
                    nVar.u(c1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.c1) this.f9808b).f42675a.setAlpha(1.0f);
                ((AnimatorSet) this.f9809c).removeAllListeners();
                at atVar = (at) this.e;
                ys ysVar = (ys) this.d;
                atVar.d(ysVar.f30326a);
                atVar.f22481y.remove(ysVar.f30326a);
                atVar.A();
                atVar.d(ysVar.f30327b);
                atVar.f22481y.remove(ysVar.f30327b);
                atVar.A();
                return;
            case 3:
                ((yu0) this.e).H1 = false;
                View view3 = (View) this.f9809c;
                if (view3.getParent() != null) {
                    ((rt0) this.f9808b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                p2 p2Var = (p2) this.e;
                TextView[] textViewArr = p2Var.f29161a;
                View view4 = (View) this.f9809c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f9808b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                p2Var.f29164f = false;
                CharSequence charSequence = p2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        p2Var.e(true);
                    } else {
                        textViewArr[1].setText(p2Var.e);
                        p2Var.a(textViewArr[0], textViewArr[1], new i2.g0(this, 24));
                    }
                    p2Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f9809c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f9808b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.d;
                if (v0Var != null) {
                    v0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f31268e0.setProgressToExpand(0.0f);
                profileActivity.f31238a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((n2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z n10 = kVar.n();
                    ArrayList arrayList = n10.e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f31268e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f31329n0.setAlpha(1.0f);
                    profileActivity.f31329n0.L();
                    profileActivity.f31329n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f31288g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9807a) {
            case 0:
                return;
            case 1:
                ((ji.n) this.e).getClass();
                return;
            case 2:
                at atVar = (at) this.e;
                ys ysVar = (ys) this.d;
                s4.c1 c1Var = ysVar.f30326a;
                atVar.getClass();
                s4.c1 c1Var2 = ysVar.f30327b;
                atVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f9807a = i10;
        this.e = obj;
        this.f9808b = obj2;
        this.d = obj3;
        this.f9809c = obj4;
    }

    public k0(ji.n nVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9807a = 1;
        this.e = nVar;
        this.f9808b = c1Var;
        this.f9809c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(at atVar, ys ysVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.f9807a = 2;
        this.e = atVar;
        this.d = ysVar;
        this.f9808b = c1Var;
        this.f9809c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
