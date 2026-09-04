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
    public final int f11124a;
    public final Object f11125b;
    public final Object f11126c;
    public final Object d;
    public final Object f11127e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f11124a = i10;
        this.f11127e = frameLayout;
        this.f11126c = view;
        this.f11125b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11124a) {
            case 1:
                View view = (View) this.f11126c;
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
        switch (this.f11124a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f11126c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.f11127e;
                s4.c1 c1Var = (s4.c1) this.f11125b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                return;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.f11125b;
                ki.o oVar = (ki.o) this.f11127e;
                View view2 = (View) this.f11126c;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (oVar.f45812y.remove(c1Var2)) {
                    oVar.u(c1Var2);
                    oVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.c1) this.f11125b).f45738a.setAlpha(1.0f);
                ((AnimatorSet) this.f11126c).removeAllListeners();
                zs zsVar = (zs) this.f11127e;
                xs xsVar = (xs) this.d;
                zsVar.d(xsVar.f32655a);
                zsVar.f33225y.remove(xsVar.f32655a);
                zsVar.A();
                zsVar.d(xsVar.f32656b);
                zsVar.f33225y.remove(xsVar.f32656b);
                zsVar.A();
                return;
            case 3:
                ((xu0) this.f11127e).H1 = false;
                View view3 = (View) this.f11126c;
                if (view3.getParent() != null) {
                    ((qt0) this.f11125b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                n2 n2Var = (n2) this.f11127e;
                TextView[] textViewArr = n2Var.f31669a;
                View view4 = (View) this.f11126c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f11125b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                n2Var.f31673f = false;
                CharSequence charSequence = n2Var.f31672e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        n2Var.e(true);
                    } else {
                        textViewArr[1].setText(n2Var.f31672e);
                        n2Var.a(textViewArr[0], textViewArr[1], new ig.t0(this, 27));
                    }
                    n2Var.f31672e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f11126c;
                ProfileActivity profileActivity = (ProfileActivity) this.f11127e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f11125b;
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
                profileActivity.f33887e0.setProgressToExpand(0.0f);
                profileActivity.f33856a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z n10 = kVar.n();
                    ArrayList arrayList = n10.f21548e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f33887e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f33948n0.setAlpha(1.0f);
                    profileActivity.f33948n0.L();
                    profileActivity.f33948n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f33907g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11124a) {
            case 0:
                return;
            case 1:
                ((ki.o) this.f11127e).getClass();
                return;
            case 2:
                zs zsVar = (zs) this.f11127e;
                xs xsVar = (xs) this.d;
                s4.c1 c1Var = xsVar.f32655a;
                zsVar.getClass();
                s4.c1 c1Var2 = xsVar.f32656b;
                zsVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f11124a = i10;
        this.f11127e = obj;
        this.f11125b = obj2;
        this.d = obj3;
        this.f11126c = obj4;
    }

    public k0(ki.o oVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f11124a = 1;
        this.f11127e = oVar;
        this.f11125b = c1Var;
        this.f11126c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(zs zsVar, xs xsVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.f11124a = 2;
        this.f11127e = zsVar;
        this.d = xsVar;
        this.f11125b = c1Var;
        this.f11126c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
