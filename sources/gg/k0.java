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
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.ProfileActivity;
public final class k0 extends AnimatorListenerAdapter {
    public final int f9799a;
    public final Object f9800b;
    public final Object f9801c;
    public final Object d;
    public final Object e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f9799a = i10;
        this.e = frameLayout;
        this.f9801c = view;
        this.f9800b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f9799a) {
            case 1:
                View view = (View) this.f9801c;
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
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f9799a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f9801c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.e;
                s4.c1 c1Var = (s4.c1) this.f9800b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                return;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.f9800b;
                ji.n nVar = (ji.n) this.e;
                View view2 = (View) this.f9801c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f43071y.remove(c1Var2)) {
                    nVar.u(c1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.c1) this.f9800b).f43005a.setAlpha(1.0f);
                ((AnimatorSet) this.f9801c).removeAllListeners();
                ct ctVar = (ct) this.e;
                at atVar = (at) this.d;
                ctVar.d(atVar.f22754a);
                ctVar.f23405y.remove(atVar.f22754a);
                ctVar.A();
                ctVar.d(atVar.f22755b);
                ctVar.f23405y.remove(atVar.f22755b);
                ctVar.A();
                return;
            case 3:
                ((lv0) this.e).H1 = false;
                View view3 = (View) this.f9801c;
                if (view3.getParent() != null) {
                    ((eu0) this.f9800b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                q2 q2Var = (q2) this.e;
                TextView[] textViewArr = q2Var.f29516a;
                View view4 = (View) this.f9801c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f9800b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                q2Var.f29519f = false;
                CharSequence charSequence = q2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.e);
                        q2Var.a(textViewArr[0], textViewArr[1], new i2.h0(this, 24));
                    }
                    q2Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f9801c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) this.f9800b;
                if (lVar2 != null) {
                    lVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.d;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f31556e0.setProgressToExpand(0.0f);
                profileActivity.f31526a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    lVar = ((o2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.a0 o9 = lVar.o();
                    ArrayList arrayList = o9.e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    o9.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f31556e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f31617n0.setAlpha(1.0f);
                    profileActivity.f31617n0.L();
                    profileActivity.f31617n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f31576g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9799a) {
            case 0:
                return;
            case 1:
                ((ji.n) this.e).getClass();
                return;
            case 2:
                ct ctVar = (ct) this.e;
                at atVar = (at) this.d;
                s4.c1 c1Var = atVar.f22754a;
                ctVar.getClass();
                s4.c1 c1Var2 = atVar.f22755b;
                ctVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f9799a = i10;
        this.e = obj;
        this.f9800b = obj2;
        this.d = obj3;
        this.f9801c = obj4;
    }

    public k0(ji.n nVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9799a = 1;
        this.e = nVar;
        this.f9800b = c1Var;
        this.f9801c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(ct ctVar, at atVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.f9799a = 2;
        this.e = ctVar;
        this.d = atVar;
        this.f9800b = c1Var;
        this.f9801c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
