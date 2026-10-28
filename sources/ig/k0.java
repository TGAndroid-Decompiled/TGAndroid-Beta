package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.ProfileActivity;
public final class k0 extends AnimatorListenerAdapter {
    public final int f14145a;
    public final Object f14146b;
    public final Object f14147c;
    public final Object d;
    public final Object e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f14145a = i10;
        this.e = frameLayout;
        this.f14147c = view;
        this.f14146b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14145a) {
            case 1:
                View view = (View) this.f14147c;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).getTransitionParams().h = false;
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
        switch (this.f14145a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f14147c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.e;
                s4.e1 e1Var = (s4.e1) this.f14146b;
                l0Var.d(e1Var);
                l0Var.A.remove(e1Var);
                l0Var.G();
                return;
            case 1:
                s4.e1 e1Var2 = (s4.e1) this.f14146b;
                mi.m mVar = (mi.m) this.e;
                View view2 = (View) this.f14147c;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (mVar.f47831y.remove(e1Var2)) {
                    mVar.u(e1Var2);
                    mVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.e1) this.f14146b).f47773a.setAlpha(1.0f);
                ((AnimatorSet) this.f14147c).removeAllListeners();
                mt mtVar = (mt) this.e;
                kt ktVar = (kt) this.d;
                mtVar.d(ktVar.f30023a);
                mtVar.f30629y.remove(ktVar.f30023a);
                mtVar.A();
                mtVar.d(ktVar.f30024b);
                mtVar.f30629y.remove(ktVar.f30024b);
                mtVar.A();
                return;
            case 3:
                ((bw0) this.e).K1 = false;
                View view3 = (View) this.f14147c;
                if (view3.getParent() != null) {
                    ((uu0) this.f14146b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                q2 q2Var = (q2) this.e;
                TextView[] textViewArr = q2Var.f34137a;
                View view4 = (View) this.f14147c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f14146b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                q2Var.f34140f = false;
                CharSequence charSequence = q2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.e);
                        q2Var.a(textViewArr[0], textViewArr[1], new k2.c(this, 22));
                    }
                    q2Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f14147c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f14146b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.d;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f36002e0.setProgressToExpand(0.0f);
                profileActivity.f35972a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    kVar = ((r2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z l4 = kVar.l();
                    ArrayList arrayList = l4.e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    l4.removeAllViews();
                    profileActivity.P0 = null;
                }
                runnable2.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = 1;
                    profileActivity.f36002e0.setForegroundAlpha(1.0f);
                    profileActivity.X.setVisibility(8);
                    profileActivity.f36064n0.setAlpha(1.0f);
                    profileActivity.f36064n0.L();
                    profileActivity.f36064n0.setVisibility(0);
                }
                profileActivity.f35993c5 = null;
                profileActivity.Y.invalidate();
                profileActivity.f36061m5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14145a) {
            case 0:
                return;
            case 1:
                ((mi.m) this.e).getClass();
                return;
            case 2:
                mt mtVar = (mt) this.e;
                kt ktVar = (kt) this.d;
                s4.e1 e1Var = ktVar.f30023a;
                mtVar.getClass();
                s4.e1 e1Var2 = ktVar.f30024b;
                mtVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14145a = i10;
        this.e = obj;
        this.f14146b = obj2;
        this.d = obj3;
        this.f14147c = obj4;
    }

    public k0(mi.m mVar, s4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f14145a = 1;
        this.e = mVar;
        this.f14146b = e1Var;
        this.f14147c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(mt mtVar, kt ktVar, s4.e1 e1Var, AnimatorSet animatorSet) {
        this.f14145a = 2;
        this.e = mtVar;
        this.d = ktVar;
        this.f14146b = e1Var;
        this.f14147c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
