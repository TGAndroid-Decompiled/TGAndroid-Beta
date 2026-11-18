package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f17541a;
    public final Object f17542b;
    public final Object f17543c;
    public final Object d;
    public final Object f17544e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i7) {
        this.f17541a = i7;
        this.f17544e = frameLayout;
        this.d = view;
        this.f17542b = view2;
        this.f17543c = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17541a) {
            case 5:
                View view = (View) this.d;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).getTransitionParams().f32381i = false;
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
        switch (this.f17541a) {
            case 0:
                ((ViewPropertyAnimator) this.f17543c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f17544e;
                v4.f1 f1Var = (v4.f1) this.f17542b;
                k0Var.d(f1Var);
                k0Var.A.remove(f1Var);
                k0Var.G();
                return;
            case 1:
                ((v4.f1) this.f17542b).f59123a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                rs rsVar = (rs) this.f17544e;
                ps psVar = (ps) this.f17543c;
                rsVar.d(psVar.f38538a);
                rsVar.f39290y.remove(psVar.f38538a);
                rsVar.A();
                rsVar.d(psVar.f38539b);
                rsVar.f39290y.remove(psVar.f38539b);
                rsVar.A();
                return;
            case 2:
                ((gt0) this.f17544e).L1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((bs0) this.f17542b).removeView(view2);
                    ((Bitmap) this.f17543c).recycle();
                    return;
                }
                return;
            case 3:
                k2 k2Var = (k2) this.f17544e;
                TextView[] textViewArr = k2Var.f41009a;
                View view3 = (View) this.d;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.f17542b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.f17543c;
                if (runnable != null) {
                    runnable.run();
                }
                k2Var.f41013f = false;
                CharSequence charSequence = k2Var.f41012e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        k2Var.e(true);
                    } else {
                        textViewArr[1].setText(k2Var.f41012e);
                        k2Var.a(textViewArr[0], textViewArr[1], new oi.a2(this, 22));
                    }
                    k2Var.f41012e = null;
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f17544e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f17542b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f17543c;
                if (r0Var != null) {
                    r0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f43547f0.setProgressToExpand(0.0f);
                profileActivity.f43508a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f43547f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f43607o0.setAlpha(1.0f);
                    profileActivity.f43607o0.L();
                    profileActivity.f43607o0.setVisibility(0);
                }
                profileActivity.f43514a5 = null;
                profileActivity.f43522b5 = 0.0f;
                profileActivity.Z.invalidate();
                profileActivity.f43598m5 = null;
                profileActivity.f43592l5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            default:
                v4.f1 f1Var2 = (v4.f1) this.f17542b;
                pi.k kVar2 = (pi.k) this.f17544e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view5).getTransitionParams().f32381i = false;
                }
                ((ViewPropertyAnimator) this.f17543c).setListener(null);
                if (kVar2.f59179y.remove(f1Var2)) {
                    kVar2.u(f1Var2);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17541a) {
            case 0:
                return;
            case 1:
                rs rsVar = (rs) this.f17544e;
                ps psVar = (ps) this.f17543c;
                v4.f1 f1Var = psVar.f38538a;
                rsVar.getClass();
                v4.f1 f1Var2 = psVar.f38539b;
                rsVar.getClass();
                return;
            case 5:
                ((pi.k) this.f17544e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f17541a = i7;
        this.f17544e = obj;
        this.f17542b = obj2;
        this.f17543c = obj3;
        this.d = obj4;
    }

    public j0(pi.k kVar, v4.f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f17541a = 5;
        this.f17544e = kVar;
        this.f17542b = f1Var;
        this.d = view;
        this.f17543c = viewPropertyAnimator;
    }

    public j0(rs rsVar, ps psVar, v4.f1 f1Var, AnimatorSet animatorSet) {
        this.f17541a = 1;
        this.f17544e = rsVar;
        this.f17543c = psVar;
        this.f17542b = f1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
