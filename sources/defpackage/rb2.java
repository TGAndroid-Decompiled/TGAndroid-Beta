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
public final class rb2 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public rb2(oh4 oh4Var, u69 u69Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = (byte) 2;
        this.e = oh4Var;
        this.b = u69Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setTranslationY(0.0f);
                if (view instanceof rc2) {
                    ((rc2) view).getTransitionParams().i = false;
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
                u69 u69Var = (u69) obj2;
                wb2 wb2Var = (wb2) obj4;
                View view = (View) obj3;
                if (view instanceof rc2) {
                    ((rc2) view).getTransitionParams().i = false;
                }
                ((ViewPropertyAnimator) obj).setListener(null);
                if (wb2Var.y.remove(u69Var)) {
                    wb2Var.u(u69Var);
                    wb2Var.G();
                    return;
                }
                return;
            case 1:
                ((u69) obj2).a.setAlpha(1.0f);
                ((AnimatorSet) obj).removeAllListeners();
                ki3 ki3Var = (ki3) obj4;
                sl3 sl3Var = (sl3) obj3;
                ki3Var.d(sl3Var.a);
                ArrayList arrayList = ki3Var.y;
                arrayList.remove(sl3Var.a);
                ki3Var.A();
                ki3Var.d(sl3Var.b);
                arrayList.remove(sl3Var.b);
                ki3Var.A();
                return;
            case 2:
                ((ViewPropertyAnimator) obj).setListener(null);
                View view2 = (View) obj3;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                oh4 oh4Var = (oh4) obj4;
                u69 u69Var2 = (u69) obj2;
                oh4Var.d(u69Var2);
                oh4Var.A.remove(u69Var2);
                oh4Var.G();
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
                profileActivity.f5 = null;
                profileActivity.g5 = 0.0f;
                profileActivity.Z.invalidate();
                profileActivity.r5 = null;
                profileActivity.q5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            case 4:
                ((nha) obj4).L1 = false;
                View view3 = (View) obj3;
                if (view3.getParent() != null) {
                    ((iga) obj2).removeView(view3);
                    ((Bitmap) obj).recycle();
                    return;
                }
                return;
            default:
                xjc xjcVar = (xjc) obj4;
                TextView[] textViewArr = xjcVar.a;
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
                xjcVar.f = false;
                CharSequence charSequence = xjcVar.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        xjcVar.e(true);
                    } else {
                        textViewArr[1].setText(xjcVar.e);
                        xjcVar.a(textViewArr[0], textViewArr[1], new f8c(this, (byte) 24));
                    }
                    xjcVar.e = null;
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

    public rb2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public rb2(Object obj, Object obj2, View view, Object obj3, byte b) {
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
