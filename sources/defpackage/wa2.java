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
public final class wa2 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public wa2(lh4 lh4Var, f89 f89Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = (byte) 2;
        this.e = lh4Var;
        this.b = f89Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setTranslationY(0.0f);
                if (view instanceof wb2) {
                    ((wb2) view).getTransitionParams().i = false;
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
                f89 f89Var = (f89) obj2;
                bb2 bb2Var = (bb2) obj4;
                View view = (View) obj3;
                if (view instanceof wb2) {
                    ((wb2) view).getTransitionParams().i = false;
                }
                ((ViewPropertyAnimator) obj).setListener(null);
                if (bb2Var.y.remove(f89Var)) {
                    bb2Var.u(f89Var);
                    bb2Var.G();
                    return;
                }
                return;
            case 1:
                ((f89) obj2).a.setAlpha(1.0f);
                ((AnimatorSet) obj).removeAllListeners();
                sh3 sh3Var = (sh3) obj4;
                zk3 zk3Var = (zk3) obj3;
                sh3Var.d(zk3Var.a);
                ArrayList arrayList = sh3Var.y;
                arrayList.remove(zk3Var.a);
                sh3Var.A();
                sh3Var.d(zk3Var.b);
                arrayList.remove(zk3Var.b);
                sh3Var.A();
                return;
            case 2:
                ((ViewPropertyAnimator) obj).setListener(null);
                View view2 = (View) obj3;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                lh4 lh4Var = (lh4) obj4;
                f89 f89Var2 = (f89) obj2;
                lh4Var.d(f89Var2);
                lh4Var.A.remove(f89Var2);
                lh4Var.G();
                return;
            case 3:
                Runnable runnable = (Runnable) obj;
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                a aVar = (a) obj2;
                if (aVar != null) {
                    aVar.setSkipDrawChild(false);
                }
                s7 s7Var = (s7) obj3;
                if (s7Var != null) {
                    s7Var.setAlpha(1.0f);
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
                ((eja) obj4).L1 = false;
                View view3 = (View) obj3;
                if (view3.getParent() != null) {
                    ((zha) obj2).removeView(view3);
                    ((Bitmap) obj).recycle();
                    return;
                }
                return;
            default:
                emc emcVar = (emc) obj4;
                TextView[] textViewArr = emcVar.a;
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
                emcVar.f = false;
                CharSequence charSequence = emcVar.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        emcVar.e(true);
                    } else {
                        textViewArr[1].setText(emcVar.e);
                        emcVar.a(textViewArr[0], textViewArr[1], new olc(this, (byte) 3));
                    }
                    emcVar.e = null;
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

    public wa2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public wa2(Object obj, Object obj2, View view, Object obj3, byte b) {
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
