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
    public final int f17535a;
    public final Object f17536b;
    public final Object f17537c;
    public final Object d;
    public final Object f17538e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i7) {
        this.f17535a = i7;
        this.f17538e = frameLayout;
        this.d = view;
        this.f17536b = view2;
        this.f17537c = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17535a) {
            case 5:
                View view = (View) this.d;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).getTransitionParams().f32378i = false;
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
        switch (this.f17535a) {
            case 0:
                ((ViewPropertyAnimator) this.f17537c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f17538e;
                v4.e1 e1Var = (v4.e1) this.f17536b;
                k0Var.d(e1Var);
                k0Var.A.remove(e1Var);
                k0Var.G();
                return;
            case 1:
                ((v4.e1) this.f17536b).f59111a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ts tsVar = (ts) this.f17538e;
                rs rsVar = (rs) this.f17537c;
                tsVar.d(rsVar.f39286a);
                tsVar.f40010y.remove(rsVar.f39286a);
                tsVar.A();
                tsVar.d(rsVar.f39287b);
                tsVar.f40010y.remove(rsVar.f39287b);
                tsVar.A();
                return;
            case 2:
                ((jt0) this.f17538e).L1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((ds0) this.f17536b).removeView(view2);
                    ((Bitmap) this.f17537c).recycle();
                    return;
                }
                return;
            case 3:
                k2 k2Var = (k2) this.f17538e;
                TextView[] textViewArr = k2Var.f41107a;
                View view3 = (View) this.d;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.f17536b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.f17537c;
                if (runnable != null) {
                    runnable.run();
                }
                k2Var.f41111f = false;
                CharSequence charSequence = k2Var.f41110e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        k2Var.e(true);
                    } else {
                        textViewArr[1].setText(k2Var.f41110e);
                        k2Var.a(textViewArr[0], textViewArr[1], new org.telegram.tgnet.m(this, 21));
                    }
                    k2Var.f41110e = null;
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f17538e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f17536b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f17537c;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f43557f0.setProgressToExpand(0.0f);
                profileActivity.f43518a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f43557f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f43617o0.setAlpha(1.0f);
                    profileActivity.f43617o0.L();
                    profileActivity.f43617o0.setVisibility(0);
                }
                profileActivity.f43524a5 = null;
                profileActivity.f43532b5 = 0.0f;
                profileActivity.Z.invalidate();
                profileActivity.f43608m5 = null;
                profileActivity.f43602l5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            default:
                v4.e1 e1Var2 = (v4.e1) this.f17536b;
                pi.k kVar2 = (pi.k) this.f17538e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view5).getTransitionParams().f32378i = false;
                }
                ((ViewPropertyAnimator) this.f17537c).setListener(null);
                if (kVar2.f59170y.remove(e1Var2)) {
                    kVar2.u(e1Var2);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17535a) {
            case 0:
                return;
            case 1:
                ts tsVar = (ts) this.f17538e;
                rs rsVar = (rs) this.f17537c;
                v4.e1 e1Var = rsVar.f39286a;
                tsVar.getClass();
                v4.e1 e1Var2 = rsVar.f39287b;
                tsVar.getClass();
                return;
            case 5:
                ((pi.k) this.f17538e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f17535a = i7;
        this.f17538e = obj;
        this.f17536b = obj2;
        this.f17537c = obj3;
        this.d = obj4;
    }

    public j0(pi.k kVar, v4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17535a = 5;
        this.f17538e = kVar;
        this.f17536b = e1Var;
        this.d = view;
        this.f17537c = viewPropertyAnimator;
    }

    public j0(ts tsVar, rs rsVar, v4.e1 e1Var, AnimatorSet animatorSet) {
        this.f17535a = 1;
        this.f17538e = tsVar;
        this.f17537c = rsVar;
        this.f17536b = e1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
