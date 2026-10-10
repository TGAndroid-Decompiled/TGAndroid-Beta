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
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f10662a;
    public final Object f10663b;
    public final Object f10664c;
    public final Object d;
    public final Object f10665e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f10662a = i10;
        this.f10665e = frameLayout;
        this.f10664c = view;
        this.f10663b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f10662a) {
            case 1:
                View view = (View) this.f10664c;
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
        switch (this.f10662a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f10664c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.f10665e;
                s4.d1 d1Var = (s4.d1) this.f10663b;
                k0Var.d(d1Var);
                k0Var.A.remove(d1Var);
                k0Var.G();
                return;
            case 1:
                s4.d1 d1Var2 = (s4.d1) this.f10663b;
                ji.n nVar = (ji.n) this.f10665e;
                View view2 = (View) this.f10664c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f47771y.remove(d1Var2)) {
                    nVar.u(d1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.d1) this.f10663b).f47702a.setAlpha(1.0f);
                ((AnimatorSet) this.f10664c).removeAllListeners();
                st stVar = (st) this.f10665e;
                qt qtVar = (qt) this.d;
                stVar.d(qtVar.f30287a);
                stVar.f30861y.remove(qtVar.f30287a);
                stVar.A();
                stVar.d(qtVar.f30288b);
                stVar.f30861y.remove(qtVar.f30288b);
                stVar.A();
                return;
            case 3:
                ((cw0) this.f10665e).H1 = false;
                View view3 = (View) this.f10664c;
                if (view3.getParent() != null) {
                    ((vu0) this.f10663b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                p2 p2Var = (p2) this.f10665e;
                TextView[] textViewArr = p2Var.f32228a;
                View view4 = (View) this.f10664c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f10663b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                p2Var.f32232f = false;
                CharSequence charSequence = p2Var.f32231e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        p2Var.e(true);
                    } else {
                        textViewArr[1].setText(p2Var.f32231e);
                        p2Var.a(textViewArr[0], textViewArr[1], new i2.h0(this, 25));
                    }
                    p2Var.f32231e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f10664c;
                ProfileActivity profileActivity = (ProfileActivity) this.f10665e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f10663b;
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
                profileActivity.f34280e0.setProgressToExpand(0.0f);
                profileActivity.f34249a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((n2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z o9 = kVar.o();
                    ArrayList arrayList = o9.f21740e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    o9.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f34280e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f34341n0.setAlpha(1.0f);
                    profileActivity.f34341n0.L();
                    profileActivity.f34341n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f34300g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10662a) {
            case 0:
                return;
            case 1:
                ((ji.n) this.f10665e).getClass();
                return;
            case 2:
                st stVar = (st) this.f10665e;
                qt qtVar = (qt) this.d;
                s4.d1 d1Var = qtVar.f30287a;
                stVar.getClass();
                s4.d1 d1Var2 = qtVar.f30288b;
                stVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10662a = i10;
        this.f10665e = obj;
        this.f10663b = obj2;
        this.d = obj3;
        this.f10664c = obj4;
    }

    public j0(ji.n nVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10662a = 1;
        this.f10665e = nVar;
        this.f10663b = d1Var;
        this.f10664c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(st stVar, qt qtVar, s4.d1 d1Var, AnimatorSet animatorSet) {
        this.f10662a = 2;
        this.f10665e = stVar;
        this.d = qtVar;
        this.f10663b = d1Var;
        this.f10664c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
