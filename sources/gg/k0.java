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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.ProfileActivity;
public final class k0 extends AnimatorListenerAdapter {
    public final int f9812a;
    public final Object f9813b;
    public final Object f9814c;
    public final Object d;
    public final Object e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f9812a = i10;
        this.e = frameLayout;
        this.f9814c = view;
        this.f9813b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f9812a) {
            case 1:
                View view = (View) this.f9814c;
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
        switch (this.f9812a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f9814c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.e;
                s4.c1 c1Var = (s4.c1) this.f9813b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                return;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.f9813b;
                ji.n nVar = (ji.n) this.e;
                View view2 = (View) this.f9814c;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f42768y.remove(c1Var2)) {
                    nVar.u(c1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.c1) this.f9813b).f42702a.setAlpha(1.0f);
                ((AnimatorSet) this.f9814c).removeAllListeners();
                at atVar = (at) this.e;
                ys ysVar = (ys) this.d;
                atVar.d(ysVar.f30316a);
                atVar.f22483y.remove(ysVar.f30316a);
                atVar.A();
                atVar.d(ysVar.f30317b);
                atVar.f22483y.remove(ysVar.f30317b);
                atVar.A();
                return;
            case 3:
                ((zu0) this.e).H1 = false;
                View view3 = (View) this.f9814c;
                if (view3.getParent() != null) {
                    ((st0) this.f9813b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                p2 p2Var = (p2) this.e;
                TextView[] textViewArr = p2Var.f29141a;
                View view4 = (View) this.f9814c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f9813b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                p2Var.f29144f = false;
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
                Runnable runnable2 = (Runnable) this.f9814c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f9813b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.d;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f31285e0.setProgressToExpand(0.0f);
                profileActivity.f31255a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((o2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.a0 n10 = kVar.n();
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
                    profileActivity.f31285e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f31346n0.setAlpha(1.0f);
                    profileActivity.f31346n0.L();
                    profileActivity.f31346n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f31305g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9812a) {
            case 0:
                return;
            case 1:
                ((ji.n) this.e).getClass();
                return;
            case 2:
                at atVar = (at) this.e;
                ys ysVar = (ys) this.d;
                s4.c1 c1Var = ysVar.f30316a;
                atVar.getClass();
                s4.c1 c1Var2 = ysVar.f30317b;
                atVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f9812a = i10;
        this.e = obj;
        this.f9813b = obj2;
        this.d = obj3;
        this.f9814c = obj4;
    }

    public k0(ji.n nVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9812a = 1;
        this.e = nVar;
        this.f9813b = c1Var;
        this.f9814c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(at atVar, ys ysVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.f9812a = 2;
        this.e = atVar;
        this.d = ysVar;
        this.f9813b = c1Var;
        this.f9814c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
