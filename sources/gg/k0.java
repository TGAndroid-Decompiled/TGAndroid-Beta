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
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.ProfileActivity;
public final class k0 extends AnimatorListenerAdapter {
    public final int f10663a;
    public final Object f10664b;
    public final Object f10665c;
    public final Object d;
    public final Object f10666e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f10663a = i10;
        this.f10666e = frameLayout;
        this.f10665c = view;
        this.f10664b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f10663a) {
            case 1:
                View view = (View) this.f10665c;
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
        switch (this.f10663a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f10665c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.f10666e;
                s4.c1 c1Var = (s4.c1) this.f10664b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                return;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.f10664b;
                ji.n nVar = (ji.n) this.f10666e;
                View view2 = (View) this.f10665c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f46598y.remove(c1Var2)) {
                    nVar.u(c1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.c1) this.f10664b).f46524a.setAlpha(1.0f);
                ((AnimatorSet) this.f10665c).removeAllListeners();
                dt dtVar = (dt) this.f10666e;
                bt btVar = (bt) this.d;
                dtVar.d(btVar.f25051a);
                dtVar.f25821y.remove(btVar.f25051a);
                dtVar.A();
                dtVar.d(btVar.f25052b);
                dtVar.f25821y.remove(btVar.f25052b);
                dtVar.A();
                return;
            case 3:
                ((pv0) this.f10666e).H1 = false;
                View view3 = (View) this.f10665c;
                if (view3.getParent() != null) {
                    ((iu0) this.f10664b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                q2 q2Var = (q2) this.f10666e;
                TextView[] textViewArr = q2Var.f32094a;
                View view4 = (View) this.f10665c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f10664b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                q2Var.f32098f = false;
                CharSequence charSequence = q2Var.f32097e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.f32097e);
                        q2Var.a(textViewArr[0], textViewArr[1], new i2.h0(this, 24));
                    }
                    q2Var.f32097e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f10665c;
                ProfileActivity profileActivity = (ProfileActivity) this.f10666e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f10664b;
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
                profileActivity.f34233e0.setProgressToExpand(0.0f);
                profileActivity.f34202a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((n2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z n10 = kVar.n();
                    ArrayList arrayList = n10.f21722e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f34233e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f34294n0.setAlpha(1.0f);
                    profileActivity.f34294n0.L();
                    profileActivity.f34294n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f34253g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10663a) {
            case 0:
                return;
            case 1:
                ((ji.n) this.f10666e).getClass();
                return;
            case 2:
                dt dtVar = (dt) this.f10666e;
                bt btVar = (bt) this.d;
                s4.c1 c1Var = btVar.f25051a;
                dtVar.getClass();
                s4.c1 c1Var2 = btVar.f25052b;
                dtVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10663a = i10;
        this.f10666e = obj;
        this.f10664b = obj2;
        this.d = obj3;
        this.f10665c = obj4;
    }

    public k0(ji.n nVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10663a = 1;
        this.f10666e = nVar;
        this.f10664b = c1Var;
        this.f10665c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(dt dtVar, bt btVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.f10663a = 2;
        this.f10666e = dtVar;
        this.d = btVar;
        this.f10664b = c1Var;
        this.f10665c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
