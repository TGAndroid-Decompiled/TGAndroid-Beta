package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.zs;
import org.telegram.ui.ProfileActivity;
public final class k0 extends AnimatorListenerAdapter {
    public final int f11150a;
    public final Object f11151b;
    public final Object f11152c;
    public final Object d;
    public final Object f11153e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f11150a = i10;
        this.f11153e = frameLayout;
        this.f11152c = view;
        this.f11151b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11150a) {
            case 1:
                View view = (View) this.f11152c;
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
        switch (this.f11150a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f11152c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.f11153e;
                s4.c1 c1Var = (s4.c1) this.f11151b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                return;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.f11151b;
                ki.o oVar = (ki.o) this.f11153e;
                View view2 = (View) this.f11152c;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (oVar.f45840y.remove(c1Var2)) {
                    oVar.u(c1Var2);
                    oVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.c1) this.f11151b).f45766a.setAlpha(1.0f);
                ((AnimatorSet) this.f11152c).removeAllListeners();
                zs zsVar = (zs) this.f11153e;
                xs xsVar = (xs) this.d;
                zsVar.d(xsVar.f32682a);
                zsVar.f33252y.remove(xsVar.f32682a);
                zsVar.A();
                zsVar.d(xsVar.f32683b);
                zsVar.f33252y.remove(xsVar.f32683b);
                zsVar.A();
                return;
            case 3:
                ((xu0) this.f11153e).H1 = false;
                View view3 = (View) this.f11152c;
                if (view3.getParent() != null) {
                    ((qt0) this.f11151b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                n2 n2Var = (n2) this.f11153e;
                TextView[] textViewArr = n2Var.f31696a;
                View view4 = (View) this.f11152c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f11151b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                n2Var.f31700f = false;
                CharSequence charSequence = n2Var.f31699e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        n2Var.e(true);
                    } else {
                        textViewArr[1].setText(n2Var.f31699e);
                        n2Var.a(textViewArr[0], textViewArr[1], new ig.t0(this, 27));
                    }
                    n2Var.f31699e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f11152c;
                ProfileActivity profileActivity = (ProfileActivity) this.f11153e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f11151b;
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
                profileActivity.f33914e0.setProgressToExpand(0.0f);
                profileActivity.f33883a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z n10 = kVar.n();
                    ArrayList arrayList = n10.f21575e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f33914e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f33975n0.setAlpha(1.0f);
                    profileActivity.f33975n0.L();
                    profileActivity.f33975n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f33934g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11150a) {
            case 0:
                return;
            case 1:
                ((ki.o) this.f11153e).getClass();
                return;
            case 2:
                zs zsVar = (zs) this.f11153e;
                xs xsVar = (xs) this.d;
                s4.c1 c1Var = xsVar.f32682a;
                zsVar.getClass();
                s4.c1 c1Var2 = xsVar.f32683b;
                zsVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f11150a = i10;
        this.f11153e = obj;
        this.f11151b = obj2;
        this.d = obj3;
        this.f11152c = obj4;
    }

    public k0(ki.o oVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f11150a = 1;
        this.f11153e = oVar;
        this.f11151b = c1Var;
        this.f11152c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(zs zsVar, xs xsVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.f11150a = 2;
        this.f11153e = zsVar;
        this.d = xsVar;
        this.f11151b = c1Var;
        this.f11152c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
