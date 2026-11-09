package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f16810a;
    public final Object f16811b;
    public final Object f16812c;
    public final Object d;
    public final Object f16813e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i7) {
        this.f16810a = i7;
        this.f16813e = frameLayout;
        this.f16812c = view;
        this.f16811b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16810a) {
            case 1:
                View view = (View) this.f16812c;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).getTransitionParams().f30806i = false;
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
        switch (this.f16810a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f16812c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f16813e;
                v4.d1 d1Var = (v4.d1) this.f16811b;
                k0Var.d(d1Var);
                k0Var.A.remove(d1Var);
                k0Var.G();
                return;
            case 1:
                v4.d1 d1Var2 = (v4.d1) this.f16811b;
                mi.l lVar = (mi.l) this.f16813e;
                View view2 = (View) this.f16812c;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view2).getTransitionParams().f30806i = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (lVar.f57121y.remove(d1Var2)) {
                    lVar.u(d1Var2);
                    lVar.G();
                    return;
                }
                return;
            case 2:
                ((v4.d1) this.f16811b).f57056a.setAlpha(1.0f);
                ((AnimatorSet) this.f16812c).removeAllListeners();
                es esVar = (es) this.f16813e;
                cs csVar = (cs) this.d;
                esVar.d(csVar.f32747a);
                esVar.f33490y.remove(csVar.f32747a);
                esVar.A();
                esVar.d(csVar.f32748b);
                esVar.f33490y.remove(csVar.f32748b);
                esVar.A();
                return;
            case 3:
                ((zs0) this.f16813e).K1 = false;
                View view3 = (View) this.f16812c;
                if (view3.getParent() != null) {
                    ((ur0) this.f16811b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                h2 h2Var = (h2) this.f16813e;
                TextView[] textViewArr = h2Var.f39333a;
                View view4 = (View) this.f16812c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f16811b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                h2Var.f39337f = false;
                CharSequence charSequence = h2Var.f39336e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        h2Var.e(true);
                    } else {
                        textViewArr[1].setText(h2Var.f39336e);
                        h2Var.a(textViewArr[0], textViewArr[1], new o5(this, 6));
                    }
                    h2Var.f39336e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f16812c;
                ProfileActivity profileActivity = (ProfileActivity) this.f16813e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f16811b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.d;
                if (r0Var != null) {
                    r0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f41729e0.setProgressToExpand(0.0f);
                profileActivity.f41698a.setLayerType(0, null);
                runnable2.run();
                if (profileActivity.I1 == 2) {
                    profileActivity.I1 = 1;
                    profileActivity.f41729e0.setForegroundAlpha(1.0f);
                    profileActivity.X.setVisibility(8);
                    profileActivity.f41791n0.setAlpha(1.0f);
                    profileActivity.f41791n0.L();
                    profileActivity.f41791n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.X4 = 0.0f;
                profileActivity.Y.invalidate();
                profileActivity.f41763i5 = null;
                profileActivity.f41756h5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16810a) {
            case 0:
                return;
            case 1:
                ((mi.l) this.f16813e).getClass();
                return;
            case 2:
                es esVar = (es) this.f16813e;
                cs csVar = (cs) this.d;
                v4.d1 d1Var = csVar.f32747a;
                esVar.getClass();
                v4.d1 d1Var2 = csVar.f32748b;
                esVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f16810a = i7;
        this.f16813e = obj;
        this.f16811b = obj2;
        this.d = obj3;
        this.f16812c = obj4;
    }

    public j0(mi.l lVar, v4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f16810a = 1;
        this.f16813e = lVar;
        this.f16811b = d1Var;
        this.f16812c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(es esVar, cs csVar, v4.d1 d1Var, AnimatorSet animatorSet) {
        this.f16810a = 2;
        this.f16813e = esVar;
        this.d = csVar;
        this.f16811b = d1Var;
        this.f16812c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
