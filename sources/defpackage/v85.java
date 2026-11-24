package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.q;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class v85 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public v85(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                ((ae6) this.b).s = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                w85 w85Var = (w85) obj;
                w85Var.s = null;
                w85Var.r = 1.0f;
                w85Var.a();
                w85Var.d();
                return;
            case 1:
                ((za5) obj).H = null;
                return;
            case 2:
                je5 je5Var = (je5) obj;
                je5Var.A0 = 1.0f;
                je5Var.invalidate();
                return;
            case 3:
                yn5 yn5Var = (yn5) obj;
                yn5Var.a.getPainting().c(null, yn5Var.a.getCurrentColor(), true, null);
                yn5Var.r = null;
                return;
            case 4:
                q qVar = (q) obj;
                if (animator == qVar.c0) {
                    qVar.m();
                    qVar.setVisibility(4);
                    return;
                }
                return;
            case 5:
                fq5 fq5Var = (fq5) obj;
                fq5Var.a = null;
                fq5Var.b = false;
                return;
            case 6:
                cs5 cs5Var = (cs5) obj;
                zr5 zr5Var = cs5Var.x;
                if (zr5Var != null) {
                    zr5Var.setProgress(1.0f);
                    cs5Var.x.invalidate();
                }
                cs5Var.p0 = null;
                return;
            case 7:
                z92 z92Var = (z92) obj;
                ((xt5) z92Var.e).A1 = false;
                TextView[] textViewArr = (TextView[]) z92Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 8:
                ju5 ju5Var = (ju5) obj;
                if (!ju5Var.f) {
                    ju5Var.c.setVisibility(8);
                    return;
                }
                return;
            case 9:
                super.onAnimationEnd(animator);
                pw5 pw5Var = (pw5) obj;
                ImageView imageView = pw5Var.c;
                pw5Var.c = pw5Var.d;
                pw5Var.d = imageView;
                imageView.bringToFront();
                pw5Var.d.setVisibility(8);
                pw5Var.h = null;
                return;
            case 10:
                ((m06) obj).h.setVisibility(8);
                return;
            case 11:
                dc4 dc4Var = (dc4) obj;
                FrameLayout frameLayout = dc4Var.b;
                s71 s71Var = (s71) dc4Var.c;
                if (s71Var.getParent() != null) {
                    frameLayout.removeView(s71Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((fb) dc4Var.d);
                return;
            case 12:
                d76 d76Var = (d76) obj;
                i76 i76Var = d76Var.L;
                if (i76Var != null && d76Var.J == i76Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d76Var.K = ofFloat;
                    ofFloat.addUpdateListener(new ni4(this, (byte) 21));
                    d76Var.K.setStartDelay(3000L);
                    d76Var.K.setDuration(550L);
                    d76Var.K.setInterpolator(new LinearInterpolator());
                    d76Var.K.start();
                    return;
                }
                return;
            case 13:
                qa6 qa6Var = (qa6) obj;
                qa6Var.E = false;
                qa6Var.x0();
                return;
            case 14:
                ae6 ae6Var = (ae6) obj;
                if (ae6Var.s != null && ae6Var.n != null) {
                    ae6Var.r.setVisibility(4);
                    ae6Var.s = null;
                    return;
                }
                return;
            case 15:
                lbc lbcVar = ((MediaController) obj).j0;
                if (lbcVar != null) {
                    lbcVar.f0();
                    return;
                }
                return;
            case 16:
                try {
                    ((lbc) obj).l0();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 17:
                f37 f37Var = (f37) obj;
                f37Var.d0.h = null;
                f37Var.e(f37Var.T, f37Var.S);
                return;
            case 18:
                ((s47) obj).U.setVisibility(8);
                return;
            case 19:
                sl7 sl7Var = (sl7) obj;
                sl7Var.f = 1.0f;
                sl7Var.invalidate();
                return;
            case 20:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 21:
                NumberTextView numberTextView = (NumberTextView) obj;
                numberTextView.d = null;
                numberTextView.b.clear();
                return;
            case 22:
                ks7 ks7Var = (ks7) obj;
                if (animator == ks7Var.r) {
                    ks7Var.f = ks7Var.h;
                    ks7Var.h = -1;
                    ks7Var.r = null;
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                ut7 ut7Var = (ut7) obj;
                ImageView imageView2 = ut7Var.c;
                ut7Var.c = ut7Var.d;
                ut7Var.d = imageView2;
                imageView2.bringToFront();
                ut7Var.d.setVisibility(8);
                ut7Var.h = null;
                return;
            case 24:
                yv7 yv7Var = (yv7) obj;
                yv7Var.T = null;
                yv7Var.r.setText("");
                tv7 tv7Var = yv7Var.s;
                int i = tv7.n;
                tv7Var.b(false);
                yv7Var.setVisibility(8);
                yv7Var.b0 = 0.0f;
                yv7Var.h(0.0f);
                yv7Var.setAlpha(0.0f);
                yv7Var.j();
                return;
            case 25:
                AnimatorSet animatorSet = (AnimatorSet) obj;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 26:
                tv7 tv7Var2 = (tv7) ((ef0) obj).c;
                AnimatorSet animatorSet2 = (AnimatorSet) tv7Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    tv7Var2.e = null;
                    return;
                }
                return;
            case 27:
                a18 a18Var = (a18) obj;
                xg1 xg1Var = a18Var.Y;
                if (xg1Var != null) {
                    if (xg1Var.getParent() != null) {
                        ((ViewGroup) a18Var.Y.getParent()).removeView(a18Var.Y);
                    }
                    a18Var.Y = null;
                }
                a18Var.a0 = null;
                super.onAnimationEnd(animator);
                return;
            case 28:
                q18 q18Var = (q18) obj;
                y28 y28Var = q18Var.w7;
                y28Var.invalidate();
                q18Var.setAnimatedTop(0);
                y28Var.L2 = true;
                View view = q18Var.w2;
                if (view != null && view.getVisibility() == 0) {
                    q18Var.w2.setTranslationY(((1.0f - q18Var.getTopViewEnterProgress()) * q18Var.w2.getLayoutParams().height) + q18Var.J2);
                }
                y28Var.U1 = null;
                return;
            default:
                TextView[] textViewArr2 = ((v28) obj).c;
                textViewArr2[1].setVisibility(8);
                textViewArr2[0].setAlpha(1.0f);
                textViewArr2[0].setTranslationY(0.0f);
                return;
        }
    }
}
