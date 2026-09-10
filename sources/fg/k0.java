package fg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.ProfileActivity;
public final class k0 extends AnimatorListenerAdapter {
    public final int f8095a;
    public final Object f8096b;
    public final Object f8097c;
    public final Object d;
    public final Object e;

    public k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.f8095a = i10;
        this.e = frameLayout;
        this.f8097c = view;
        this.f8096b = view2;
        this.d = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f8095a) {
            case 1:
                View view = (View) this.f8097c;
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
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f8095a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.f8097c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.e;
                s4.c1 c1Var = (s4.c1) this.f8096b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                return;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.f8096b;
                ii.n nVar = (ii.n) this.e;
                View view2 = (View) this.f8097c;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f41676y.remove(c1Var2)) {
                    nVar.u(c1Var2);
                    nVar.G();
                    return;
                }
                return;
            case 2:
                ((s4.c1) this.f8096b).f41610a.setAlpha(1.0f);
                ((AnimatorSet) this.f8097c).removeAllListeners();
                gt gtVar = (gt) this.e;
                et etVar = (et) this.d;
                gtVar.d(etVar.f22752a);
                gtVar.f23430y.remove(etVar.f22752a);
                gtVar.A();
                gtVar.d(etVar.f22753b);
                gtVar.f23430y.remove(etVar.f22753b);
                gtVar.A();
                return;
            case 3:
                ((iv0) this.e).H1 = false;
                View view3 = (View) this.f8097c;
                if (view3.getParent() != null) {
                    ((au0) this.f8096b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 4:
                o2 o2Var = (o2) this.e;
                TextView[] textViewArr = o2Var.f28307a;
                View view4 = (View) this.f8097c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.f8096b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                o2Var.f28310f = false;
                CharSequence charSequence = o2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        o2Var.e(true);
                    } else {
                        textViewArr[1].setText(o2Var.e);
                        o2Var.a(textViewArr[0], textViewArr[1], new org.telegram.ui.Components.voip.x(this, 6));
                    }
                    o2Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f8097c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) this.f8096b;
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
                profileActivity.f30380e0.setProgressToExpand(0.0f);
                profileActivity.f30350a.setLayerType(0, null);
                if (profileActivity.P0 != null) {
                    lVar = ((p2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z n10 = lVar.n();
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
                    profileActivity.f30380e0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.f30441n0.setAlpha(1.0f);
                    profileActivity.f30441n0.L();
                    profileActivity.f30441n0.setVisibility(0);
                }
                profileActivity.W4 = null;
                profileActivity.Z.invalidate();
                profileActivity.f30400g5 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f8095a) {
            case 0:
                return;
            case 1:
                ((ii.n) this.e).getClass();
                return;
            case 2:
                gt gtVar = (gt) this.e;
                et etVar = (et) this.d;
                s4.c1 c1Var = etVar.f22752a;
                gtVar.getClass();
                s4.c1 c1Var2 = etVar.f22753b;
                gtVar.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f8095a = i10;
        this.e = obj;
        this.f8096b = obj2;
        this.d = obj3;
        this.f8097c = obj4;
    }

    public k0(ii.n nVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f8095a = 1;
        this.e = nVar;
        this.f8096b = c1Var;
        this.f8097c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(gt gtVar, et etVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.f8095a = 2;
        this.e = gtVar;
        this.d = etVar;
        this.f8096b = c1Var;
        this.f8097c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
