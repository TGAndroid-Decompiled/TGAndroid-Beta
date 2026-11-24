package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;
public final class ga2 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ga2(nf4 nf4Var, s49 s49Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = (byte) 2;
        this.e = nf4Var;
        this.b = s49Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setTranslationY(0.0f);
                if (view instanceof gb2) {
                    ((gb2) view).getTransitionParams().i = false;
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
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                s49 s49Var = (s49) obj2;
                la2 la2Var = (la2) obj4;
                View view = (View) obj3;
                if (view instanceof gb2) {
                    ((gb2) view).getTransitionParams().i = false;
                }
                ((ViewPropertyAnimator) obj).setListener(null);
                if (la2Var.y.remove(s49Var)) {
                    la2Var.u(s49Var);
                    la2Var.G();
                    return;
                }
                return;
            case 1:
                ((s49) obj2).a.setAlpha(1.0f);
                ((AnimatorSet) obj).removeAllListeners();
                yg3 yg3Var = (yg3) obj4;
                ik3 ik3Var = (ik3) obj3;
                yg3Var.d(ik3Var.a);
                ArrayList arrayList = yg3Var.y;
                arrayList.remove(ik3Var.a);
                yg3Var.A();
                yg3Var.d(ik3Var.b);
                arrayList.remove(ik3Var.b);
                yg3Var.A();
                return;
            case 2:
                ((ViewPropertyAnimator) obj).setListener(null);
                View view2 = (View) obj3;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                nf4 nf4Var = (nf4) obj4;
                s49 s49Var2 = (s49) obj2;
                nf4Var.d(s49Var2);
                nf4Var.A.remove(s49Var2);
                nf4Var.G();
                return;
            case 3:
                Runnable runnable = (Runnable) obj;
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                a aVar = (a) obj2;
                if (aVar != null) {
                    aVar.setSkipDrawChild(false);
                }
                r7 r7Var = (r7) obj3;
                if (r7Var != null) {
                    r7Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable.run();
                    return;
                }
                profileActivity.f0.setProgressToExpand(0.0f);
                profileActivity.a.setLayerType(0, null);
                runnable.run();
                if (profileActivity.J1 == 2) {
                    profileActivity.J1 = (byte) 1;
                    profileActivity.f0.setForegroundAlpha(1.0f);
                    profileActivity.Y.setVisibility(8);
                    profileActivity.o0.setAlpha(1.0f);
                    profileActivity.o0.L();
                    profileActivity.o0.setVisibility(0);
                }
                profileActivity.a5 = null;
                profileActivity.b5 = 0.0f;
                profileActivity.Z.invalidate();
                profileActivity.m5 = null;
                profileActivity.l5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            case 4:
                ((nfa) obj4).L1 = false;
                View view3 = (View) obj3;
                if (view3.getParent() != null) {
                    ((iea) obj2).removeView(view3);
                    ((Bitmap) obj).recycle();
                    return;
                }
                return;
            default:
                xhc xhcVar = (xhc) obj4;
                TextView[] textViewArr = xhcVar.a;
                View view4 = (View) obj3;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) obj2;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                xhcVar.f = false;
                CharSequence charSequence = xhcVar.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        xhcVar.e(true);
                    } else {
                        textViewArr[1].setText(xhcVar.e);
                        xhcVar.a(textViewArr[0], textViewArr[1], new kbc(this, (byte) 16));
                    }
                    xhcVar.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ga2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public ga2(Object obj, Object obj2, View view, Object obj3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = view;
        this.d = obj3;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }
}
