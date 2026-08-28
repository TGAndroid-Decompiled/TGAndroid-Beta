package of;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import mh.m2;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.ProfileActivity;
public final class h0 extends AnimatorListenerAdapter {
    public final int f19358a;
    public final Object f19359b;
    public final Object f19360c;
    public final Object d;
    public final Object f19361e;

    public h0(FrameLayout frameLayout, View view, View view2, Object obj, int i9) {
        this.f19358a = i9;
        this.f19361e = frameLayout;
        this.d = view;
        this.f19359b = view2;
        this.f19360c = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19358a) {
            case 5:
                View view = (View) this.d;
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
        switch (this.f19358a) {
            case 0:
                ((ViewPropertyAnimator) this.f19360c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                i0 i0Var = (i0) this.f19361e;
                f2.q1 q1Var = (f2.q1) this.f19359b;
                i0Var.d(q1Var);
                i0Var.A.remove(q1Var);
                i0Var.G();
                return;
            case 1:
                ((f2.q1) this.f19359b).f5501a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ps psVar = (ps) this.f19361e;
                ns nsVar = (ns) this.f19360c;
                psVar.d(nsVar.f31172a);
                psVar.f31744y.remove(nsVar.f31172a);
                psVar.A();
                psVar.d(nsVar.f31173b);
                psVar.f31744y.remove(nsVar.f31173b);
                psVar.A();
                return;
            case 2:
                ((eu0) this.f19361e).D1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((xs0) this.f19359b).removeView(view2);
                    ((Bitmap) this.f19360c).recycle();
                    return;
                }
                return;
            case 3:
                o2 o2Var = (o2) this.f19361e;
                TextView[] textViewArr = o2Var.f33733a;
                View view3 = (View) this.d;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.f19359b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.f19360c;
                if (runnable != null) {
                    runnable.run();
                }
                o2Var.f33737f = false;
                CharSequence charSequence = o2Var.f33736e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        o2Var.e(true);
                    } else {
                        textViewArr[1].setText(o2Var.f33736e);
                        o2Var.a(textViewArr[0], textViewArr[1], new m2(this, 11));
                    }
                    o2Var.f33736e = null;
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f19361e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f19359b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f19360c;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f35919a0.setProgressToExpand(0.0f);
                profileActivity.f35918a.setLayerType(0, null);
                if (profileActivity.L0 != null) {
                    kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z n10 = kVar.n();
                    ArrayList arrayList = n10.f24001e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.L0 = null;
                }
                runnable2.run();
                if (profileActivity.F1 == 2) {
                    profileActivity.F1 = 1;
                    profileActivity.f35919a0.setForegroundAlpha(1.0f);
                    profileActivity.U.setVisibility(8);
                    profileActivity.f35984j0.setAlpha(1.0f);
                    profileActivity.f35984j0.L();
                    profileActivity.f35984j0.setVisibility(0);
                }
                profileActivity.S4 = null;
                profileActivity.V.invalidate();
                profileActivity.f35938c5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            default:
                f2.q1 q1Var2 = (f2.q1) this.f19359b;
                rh.m mVar = (rh.m) this.f19361e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.f19360c).setListener(null);
                if (mVar.f5458y.remove(q1Var2)) {
                    mVar.u(q1Var2);
                    mVar.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19358a) {
            case 0:
                return;
            case 1:
                ps psVar = (ps) this.f19361e;
                ns nsVar = (ns) this.f19360c;
                f2.q1 q1Var = nsVar.f31172a;
                psVar.getClass();
                f2.q1 q1Var2 = nsVar.f31173b;
                psVar.getClass();
                return;
            case 5:
                ((rh.m) this.f19361e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public h0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f19358a = i9;
        this.f19361e = obj;
        this.f19359b = obj2;
        this.f19360c = obj3;
        this.d = obj4;
    }

    public h0(rh.m mVar, f2.q1 q1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f19358a = 5;
        this.f19361e = mVar;
        this.f19359b = q1Var;
        this.d = view;
        this.f19360c = viewPropertyAnimator;
    }

    public h0(ps psVar, ns nsVar, f2.q1 q1Var, AnimatorSet animatorSet) {
        this.f19358a = 1;
        this.f19361e = psVar;
        this.f19360c = nsVar;
        this.f19359b = q1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
