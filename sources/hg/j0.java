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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f10612a;
    public final Object f10613b;
    public final Object f10614c;
    public final Object d;
    public final Object e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f10612a = i10;
        this.e = frameLayout;
        this.f10614c = view;
        this.f10613b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f10612a) {
            case 1:
                View view = (View) this.f10614c;
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
        switch (this.f10612a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f10614c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.e;
                s4.b1 b1Var = (s4.b1) this.f10613b;
                k0Var.d(b1Var);
                k0Var.A.remove(b1Var);
                k0Var.G();
                return;
            case 1:
                s4.b1 b1Var2 = (s4.b1) this.f10613b;
                ki.n nVar = (ki.n) this.e;
                View view2 = (View) this.f10614c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f44910y.remove(b1Var2)) {
                    nVar.u(b1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.b1) this.f10613b).f44838a.setAlpha(1.0f);
                ((AnimatorSet) this.f10614c).removeAllListeners();
                ot otVar = (ot) this.e;
                mt mtVar = (mt) this.d;
                otVar.d(mtVar.f27198a);
                otVar.f27738y.remove(mtVar.f27198a);
                otVar.A();
                otVar.d(mtVar.f27199b);
                otVar.f27738y.remove(mtVar.f27199b);
                otVar.A();
                return;
            case 3:
                ((xv0) this.e).H1 = false;
                View view3 = (View) this.f10614c;
                if (view3.getParent() != null) {
                    ((qu0) this.f10613b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                n2 n2Var = (n2) this.e;
                TextView[] textViewArr = n2Var.f30006a;
                View view4 = (View) this.f10614c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f10613b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                n2Var.f30009f = false;
                CharSequence charSequence = n2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        n2Var.e(true);
                    } else {
                        textViewArr[1].setText(n2Var.e);
                        n2Var.a(textViewArr[0], textViewArr[1], new ig.t0(this, 29));
                    }
                    n2Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f10614c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f10613b;
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
                profileActivity.f32260e0.setProgressToExpand(0.0f);
                profileActivity.f32230a.setLayerType(0, null);
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
                    profileActivity.f32260e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f32322n0.setAlpha(1.0f);
                    profileActivity.f32322n0.L();
                    profileActivity.f32322n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f32280g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10612a) {
            case 0:
                return;
            case 1:
                ((ki.n) this.e).getClass();
                return;
            case 2:
                ot otVar = (ot) this.e;
                mt mtVar = (mt) this.d;
                s4.b1 b1Var = mtVar.f27198a;
                otVar.getClass();
                s4.b1 b1Var2 = mtVar.f27199b;
                otVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10612a = i10;
        this.e = obj;
        this.f10613b = obj2;
        this.d = obj3;
        this.f10614c = obj4;
    }

    public j0(ki.n nVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10612a = 1;
        this.e = nVar;
        this.f10613b = b1Var;
        this.f10614c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(ot otVar, mt mtVar, s4.b1 b1Var, AnimatorSet animatorSet) {
        this.f10612a = 2;
        this.e = otVar;
        this.d = mtVar;
        this.f10613b = b1Var;
        this.f10614c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
