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
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f11917a;
    public final Object f11918b;
    public final Object f11919c;
    public final Object d;
    public final Object e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f11917a = i10;
        this.e = frameLayout;
        this.f11919c = view;
        this.f11918b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11917a) {
            case 1:
                View view = (View) this.f11919c;
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
        switch (this.f11917a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f11919c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.e;
                s4.b1 b1Var = (s4.b1) this.f11918b;
                k0Var.d(b1Var);
                k0Var.A.remove(b1Var);
                k0Var.G();
                return;
            case 1:
                s4.b1 b1Var2 = (s4.b1) this.f11918b;
                li.m mVar = (li.m) this.e;
                View view2 = (View) this.f11919c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (mVar.f46010y.remove(b1Var2)) {
                    mVar.u(b1Var2);
                    mVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.b1) this.f11918b).f45938a.setAlpha(1.0f);
                ((AnimatorSet) this.f11919c).removeAllListeners();
                kt ktVar = (kt) this.e;
                ht htVar = (ht) this.d;
                ktVar.d(htVar.f26929a);
                ktVar.f27983y.remove(htVar.f26929a);
                ktVar.A();
                ktVar.d(htVar.f26930b);
                ktVar.f27983y.remove(htVar.f26930b);
                ktVar.A();
                return;
            case 3:
                ((sv0) this.e).H1 = false;
                View view3 = (View) this.f11919c;
                if (view3.getParent() != null) {
                    ((lu0) this.f11918b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                n2 n2Var = (n2) this.e;
                TextView[] textViewArr = n2Var.f31623a;
                View view4 = (View) this.f11919c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f11918b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                n2Var.f31626f = false;
                CharSequence charSequence = n2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        n2Var.e(true);
                    } else {
                        textViewArr[1].setText(n2Var.e);
                        n2Var.a(textViewArr[0], textViewArr[1], new ki.u(this, 19));
                    }
                    n2Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f11919c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f11918b;
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
                profileActivity.f33606f0.setProgressToExpand(0.0f);
                profileActivity.f33568a.setLayerType(0, null);
                if (profileActivity.Q0 != null) {
                    kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.y n10 = kVar.n();
                    ArrayList arrayList = n10.e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.Q0 = null;
                }
                runnable2.run();
                if (profileActivity.K1 == 2) {
                    profileActivity.K1 = 1;
                    profileActivity.f33606f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f33667o0.setAlpha(1.0f);
                    profileActivity.f33667o0.L();
                    profileActivity.f33667o0.setVisibility(0);
                }
                profileActivity.Y4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f33632i5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11917a) {
            case 0:
                return;
            case 1:
                ((li.m) this.e).getClass();
                return;
            case 2:
                kt ktVar = (kt) this.e;
                ht htVar = (ht) this.d;
                s4.b1 b1Var = htVar.f26929a;
                ktVar.getClass();
                s4.b1 b1Var2 = htVar.f26930b;
                ktVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f11917a = i10;
        this.e = obj;
        this.f11918b = obj2;
        this.d = obj3;
        this.f11919c = obj4;
    }

    public j0(li.m mVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f11917a = 1;
        this.e = mVar;
        this.f11918b = b1Var;
        this.f11919c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(kt ktVar, ht htVar, s4.b1 b1Var, AnimatorSet animatorSet) {
        this.f11917a = 2;
        this.e = ktVar;
        this.d = htVar;
        this.f11918b = b1Var;
        this.f11919c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
