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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.ProfileActivity;
public final class j0 extends AnimatorListenerAdapter {
    public final int f11944a;
    public final Object f11945b;
    public final Object f11946c;
    public final Object d;
    public final Object e;

    public j0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f11944a = i10;
        this.e = frameLayout;
        this.f11946c = view;
        this.f11945b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11944a) {
            case 1:
                View view = (View) this.f11946c;
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
        switch (this.f11944a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f11946c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.e;
                s4.b1 b1Var = (s4.b1) this.f11945b;
                k0Var.d(b1Var);
                k0Var.A.remove(b1Var);
                k0Var.G();
                return;
            case 1:
                s4.b1 b1Var2 = (s4.b1) this.f11945b;
                li.m mVar = (li.m) this.e;
                View view2 = (View) this.f11946c;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (mVar.f46414y.remove(b1Var2)) {
                    mVar.u(b1Var2);
                    mVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.b1) this.f11945b).f46342a.setAlpha(1.0f);
                ((AnimatorSet) this.f11946c).removeAllListeners();
                ht htVar = (ht) this.e;
                ft ftVar = (ft) this.d;
                htVar.d(ftVar.f26431a);
                htVar.f27169y.remove(ftVar.f26431a);
                htVar.A();
                htVar.d(ftVar.f26432b);
                htVar.f27169y.remove(ftVar.f26432b);
                htVar.A();
                return;
            case 3:
                ((wv0) this.e).I1 = false;
                View view3 = (View) this.f11946c;
                if (view3.getParent() != null) {
                    ((pu0) this.f11945b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                n2 n2Var = (n2) this.e;
                TextView[] textViewArr = n2Var.f31739a;
                View view4 = (View) this.f11946c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f11945b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                n2Var.f31742f = false;
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
                Runnable runnable2 = (Runnable) this.f11946c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f11945b;
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
                profileActivity.f33922f0.setProgressToExpand(0.0f);
                profileActivity.f33884a.setLayerType(0, null);
                if (profileActivity.Q0 != null) {
                    kVar = ((o2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.y m10 = kVar.m();
                    ArrayList arrayList = m10.e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    m10.removeAllViews();
                    profileActivity.Q0 = null;
                }
                runnable2.run();
                if (profileActivity.K1 == 2) {
                    profileActivity.K1 = 1;
                    profileActivity.f33922f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f33983o0.setAlpha(1.0f);
                    profileActivity.f33983o0.L();
                    profileActivity.f33983o0.setVisibility(0);
                }
                profileActivity.Y4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f33948i5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11944a) {
            case 0:
                return;
            case 1:
                ((li.m) this.e).getClass();
                return;
            case 2:
                ht htVar = (ht) this.e;
                ft ftVar = (ft) this.d;
                s4.b1 b1Var = ftVar.f26431a;
                htVar.getClass();
                s4.b1 b1Var2 = ftVar.f26432b;
                htVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f11944a = i10;
        this.e = obj;
        this.f11945b = obj2;
        this.d = obj3;
        this.f11946c = obj4;
    }

    public j0(li.m mVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f11944a = 1;
        this.e = mVar;
        this.f11945b = b1Var;
        this.f11946c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(ht htVar, ft ftVar, s4.b1 b1Var, AnimatorSet animatorSet) {
        this.f11944a = 2;
        this.e = htVar;
        this.d = ftVar;
        this.f11945b = b1Var;
        this.f11946c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
