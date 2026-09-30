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
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.ProfileActivity;
public final class k0 extends AnimatorListenerAdapter {
    public final int f9805a;
    public final Object f9806b;
    public final Object f9807c;
    public final Object d;
    public final Object e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f9805a = i10;
        this.e = frameLayout;
        this.f9807c = view;
        this.f9806b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f9805a) {
            case 1:
                View view = (View) this.f9807c;
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
        switch (this.f9805a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f9807c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.e;
                s4.c1 c1Var = (s4.c1) this.f9806b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                return;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.f9806b;
                ji.n nVar = (ji.n) this.e;
                View view2 = (View) this.f9807c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f43134y.remove(c1Var2)) {
                    nVar.u(c1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.c1) this.f9806b).f43068a.setAlpha(1.0f);
                ((AnimatorSet) this.f9807c).removeAllListeners();
                dt dtVar = (dt) this.e;
                bt btVar = (bt) this.d;
                dtVar.d(btVar.f23002a);
                dtVar.f23726y.remove(btVar.f23002a);
                dtVar.A();
                dtVar.d(btVar.f23003b);
                dtVar.f23726y.remove(btVar.f23003b);
                dtVar.A();
                return;
            case 3:
                ((mv0) this.e).H1 = false;
                View view3 = (View) this.f9807c;
                if (view3.getParent() != null) {
                    ((fu0) this.f9806b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                q2 q2Var = (q2) this.e;
                TextView[] textViewArr = q2Var.f29491a;
                View view4 = (View) this.f9807c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f9806b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                q2Var.f29494f = false;
                CharSequence charSequence = q2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.e);
                        q2Var.a(textViewArr[0], textViewArr[1], new i2.h0(this, 25));
                    }
                    q2Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f9807c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f9806b;
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
                profileActivity.f31628e0.setProgressToExpand(0.0f);
                profileActivity.f31598a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((m2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.y n10 = kVar.n();
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
                    profileActivity.f31628e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f31689n0.setAlpha(1.0f);
                    profileActivity.f31689n0.L();
                    profileActivity.f31689n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f31648g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9805a) {
            case 0:
                return;
            case 1:
                ((ji.n) this.e).getClass();
                return;
            case 2:
                dt dtVar = (dt) this.e;
                bt btVar = (bt) this.d;
                s4.c1 c1Var = btVar.f23002a;
                dtVar.getClass();
                s4.c1 c1Var2 = btVar.f23003b;
                dtVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f9805a = i10;
        this.e = obj;
        this.f9806b = obj2;
        this.d = obj3;
        this.f9807c = obj4;
    }

    public k0(ji.n nVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9805a = 1;
        this.e = nVar;
        this.f9806b = c1Var;
        this.f9807c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(dt dtVar, bt btVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.f9805a = 2;
        this.e = dtVar;
        this.d = btVar;
        this.f9806b = c1Var;
        this.f9807c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
