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
public final class ad5 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public ad5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 13:
                ((cg6) this.b).s = null;
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
                ((bd5) obj).H = null;
                return;
            case 1:
                kg5 kg5Var = (kg5) obj;
                kg5Var.A0 = 1.0f;
                kg5Var.invalidate();
                return;
            case 2:
                bq5 bq5Var = (bq5) obj;
                bq5Var.a.getPainting().c(null, bq5Var.a.getCurrentColor(), true, null);
                bq5Var.r = null;
                return;
            case 3:
                q qVar = (q) obj;
                if (animator == qVar.c0) {
                    qVar.m();
                    qVar.setVisibility(4);
                    return;
                }
                return;
            case 4:
                gs5 gs5Var = (gs5) obj;
                gs5Var.a = null;
                gs5Var.b = false;
                return;
            case 5:
                fu5 fu5Var = (fu5) obj;
                bu5 bu5Var = fu5Var.x;
                if (bu5Var != null) {
                    bu5Var.setProgress(1.0f);
                    fu5Var.x.invalidate();
                }
                fu5Var.s0 = null;
                return;
            case 6:
                pa2 pa2Var = (pa2) obj;
                ((bw5) pa2Var.e).A1 = false;
                TextView[] textViewArr = (TextView[]) pa2Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 7:
                nw5 nw5Var = (nw5) obj;
                if (!nw5Var.f) {
                    nw5Var.c.setVisibility(8);
                    return;
                }
                return;
            case 8:
                super.onAnimationEnd(animator);
                uy5 uy5Var = (uy5) obj;
                ImageView imageView = uy5Var.c;
                uy5Var.c = uy5Var.d;
                uy5Var.d = imageView;
                imageView.bringToFront();
                uy5Var.d.setVisibility(8);
                uy5Var.h = null;
                return;
            case 9:
                ((q26) obj).h.setVisibility(8);
                return;
            case 10:
                ae4 ae4Var = (ae4) obj;
                FrameLayout frameLayout = ae4Var.b;
                a81 a81Var = (a81) ae4Var.c;
                if (a81Var.getParent() != null) {
                    frameLayout.removeView(a81Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((gb) ae4Var.d);
                return;
            case 11:
                h96 h96Var = (h96) obj;
                m96 m96Var = h96Var.L;
                if (m96Var != null && h96Var.J == m96Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    h96Var.K = ofFloat;
                    ofFloat.addUpdateListener(new ch4(this, (byte) 23));
                    h96Var.K.setStartDelay(3000L);
                    h96Var.K.setDuration(550L);
                    h96Var.K.setInterpolator(new LinearInterpolator());
                    h96Var.K.start();
                    return;
                }
                return;
            case 12:
                uc6 uc6Var = (uc6) obj;
                uc6Var.E = false;
                uc6Var.y0();
                return;
            case 13:
                cg6 cg6Var = (cg6) obj;
                if (cg6Var.s != null && cg6Var.n != null) {
                    cg6Var.r.setVisibility(4);
                    cg6Var.s = null;
                    return;
                }
                return;
            case 14:
                kfc kfcVar = ((MediaController) obj).j0;
                if (kfcVar != null) {
                    kfcVar.f0();
                    return;
                }
                return;
            case 15:
                try {
                    ((kfc) obj).l0();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 16:
                m57 m57Var = (m57) obj;
                m57Var.d0.h = null;
                m57Var.e(m57Var.T, m57Var.S);
                return;
            case 17:
                ((z67) obj).U.setVisibility(8);
                return;
            case 18:
                ro7 ro7Var = (ro7) obj;
                ro7Var.f = 1.0f;
                ro7Var.invalidate();
                return;
            case 19:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 20:
                NumberTextView numberTextView = (NumberTextView) obj;
                numberTextView.d = null;
                numberTextView.b.clear();
                return;
            case 21:
                rv7 rv7Var = (rv7) obj;
                if (animator == rv7Var.r) {
                    rv7Var.f = rv7Var.h;
                    rv7Var.h = -1;
                    rv7Var.r = null;
                    return;
                }
                return;
            case 22:
                super.onAnimationEnd(animator);
                bx7 bx7Var = (bx7) obj;
                ImageView imageView2 = bx7Var.c;
                bx7Var.c = bx7Var.d;
                bx7Var.d = imageView2;
                imageView2.bringToFront();
                bx7Var.d.setVisibility(8);
                bx7Var.h = null;
                return;
            case 23:
                fz7 fz7Var = (fz7) obj;
                fz7Var.T = null;
                fz7Var.r.setText("");
                az7 az7Var = fz7Var.s;
                int i = az7.n;
                az7Var.b(false);
                fz7Var.setVisibility(8);
                fz7Var.b0 = 0.0f;
                fz7Var.h(0.0f);
                fz7Var.setAlpha(0.0f);
                fz7Var.j();
                return;
            case 24:
                AnimatorSet animatorSet = (AnimatorSet) obj;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 25:
                az7 az7Var2 = (az7) ((gf0) obj).c;
                AnimatorSet animatorSet2 = (AnimatorSet) az7Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    az7Var2.e = null;
                    return;
                }
                return;
            case 26:
                h48 h48Var = (h48) obj;
                gh1 gh1Var = h48Var.Y;
                if (gh1Var != null) {
                    if (gh1Var.getParent() != null) {
                        ((ViewGroup) h48Var.Y.getParent()).removeView(h48Var.Y);
                    }
                    h48Var.Y = null;
                }
                h48Var.a0 = null;
                super.onAnimationEnd(animator);
                return;
            case 27:
                g58 g58Var = (g58) obj;
                o68 o68Var = g58Var.c8;
                o68Var.invalidate();
                g58Var.setAnimatedTop(0);
                o68Var.F2 = true;
                View view = g58Var.v2;
                if (view != null && view.getVisibility() == 0) {
                    g58Var.v2.setTranslationY(((1.0f - g58Var.getTopViewEnterProgress()) * g58Var.v2.getLayoutParams().height) + g58Var.I2);
                }
                o68Var.O1 = null;
                return;
            case 28:
                TextView[] textViewArr2 = ((l68) obj).c;
                textViewArr2[1].setVisibility(8);
                textViewArr2[0].setAlpha(1.0f);
                textViewArr2[0].setTranslationY(0.0f);
                return;
            default:
                d88 d88Var = (d88) obj;
                if (animator.equals(d88Var.n)) {
                    d88Var.n = null;
                    return;
                }
                return;
        }
    }
}
