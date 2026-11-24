package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
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
            case 16:
                ((zf6) this.b).s = null;
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
                super.onAnimationEnd(animator);
                w85 w85Var = (w85) obj;
                w85Var.G = null;
                g95 g95Var = w85Var.L;
                g95Var.J1.invalidate();
                g95Var.T3.invalidate();
                g95Var.b.invalidate();
                g95Var.F1();
                w85Var.H.clear();
                w85Var.I.clear();
                return;
            case 1:
                ha5 ha5Var = ((da5) obj).t0;
                if (ha5Var.x0.getParent() != null) {
                    ha5Var.a.removeView(ha5Var.x0);
                    return;
                }
                return;
            case 2:
                va5 va5Var = (va5) obj;
                va5Var.s = null;
                va5Var.r = 1.0f;
                va5Var.a();
                va5Var.d();
                return;
            case 3:
                ((xc5) obj).H = null;
                return;
            case 4:
                hg5 hg5Var = (hg5) obj;
                hg5Var.A0 = 1.0f;
                hg5Var.invalidate();
                return;
            case 5:
                yp5 yp5Var = (yp5) obj;
                yp5Var.a.getPainting().c(null, yp5Var.a.getCurrentColor(), true, null);
                yp5Var.r = null;
                return;
            case 6:
                q qVar = (q) obj;
                if (animator == qVar.c0) {
                    qVar.m();
                    qVar.setVisibility(4);
                    return;
                }
                return;
            case 7:
                ds5 ds5Var = (ds5) obj;
                ds5Var.a = null;
                ds5Var.b = false;
                return;
            case 8:
                bu5 bu5Var = (bu5) obj;
                yt5 yt5Var = bu5Var.x;
                if (yt5Var != null) {
                    yt5Var.setProgress(1.0f);
                    bu5Var.x.invalidate();
                }
                bu5Var.p0 = null;
                return;
            case 9:
                kb2 kb2Var = (kb2) obj;
                ((wv5) kb2Var.e).A1 = false;
                TextView[] textViewArr = (TextView[]) kb2Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 10:
                iw5 iw5Var = (iw5) obj;
                if (!iw5Var.f) {
                    iw5Var.c.setVisibility(8);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                py5 py5Var = (py5) obj;
                ImageView imageView = py5Var.c;
                py5Var.c = py5Var.d;
                py5Var.d = imageView;
                imageView.bringToFront();
                py5Var.d.setVisibility(8);
                py5Var.h = null;
                return;
            case 12:
                ((m26) obj).h.setVisibility(8);
                return;
            case 13:
                de4 de4Var = (de4) obj;
                FrameLayout frameLayout = de4Var.b;
                a91 a91Var = (a91) de4Var.c;
                if (a91Var.getParent() != null) {
                    frameLayout.removeView(a91Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((fb) de4Var.d);
                return;
            case 14:
                d96 d96Var = (d96) obj;
                i96 i96Var = d96Var.L;
                if (i96Var != null && d96Var.J == i96Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d96Var.K = ofFloat;
                    ofFloat.addUpdateListener(new fh4(this, (byte) 23));
                    d96Var.K.setStartDelay(3000L);
                    d96Var.K.setDuration(550L);
                    d96Var.K.setInterpolator(new LinearInterpolator());
                    d96Var.K.start();
                    return;
                }
                return;
            case 15:
                pc6 pc6Var = (pc6) obj;
                pc6Var.E = false;
                pc6Var.y0();
                return;
            case 16:
                zf6 zf6Var = (zf6) obj;
                if (zf6Var.s != null && zf6Var.n != null) {
                    zf6Var.r.setVisibility(4);
                    zf6Var.s = null;
                    return;
                }
                return;
            case 17:
                ndc ndcVar = ((MediaController) obj).j0;
                if (ndcVar != null) {
                    ndcVar.f0();
                    return;
                }
                return;
            case 18:
                try {
                    ((ndc) obj).l0();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 19:
                f57 f57Var = (f57) obj;
                f57Var.d0.h = null;
                f57Var.e(f57Var.T, f57Var.S);
                return;
            case 20:
                ((t67) obj).U.setVisibility(8);
                return;
            case 21:
                vn7 vn7Var = (vn7) obj;
                vn7Var.f = 1.0f;
                vn7Var.invalidate();
                return;
            case 22:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 23:
                NumberTextView numberTextView = (NumberTextView) obj;
                numberTextView.d = null;
                numberTextView.b.clear();
                return;
            case 24:
                lu7 lu7Var = (lu7) obj;
                if (animator == lu7Var.r) {
                    lu7Var.f = lu7Var.h;
                    lu7Var.h = -1;
                    lu7Var.r = null;
                    return;
                }
                return;
            case 25:
                super.onAnimationEnd(animator);
                vv7 vv7Var = (vv7) obj;
                ImageView imageView2 = vv7Var.c;
                vv7Var.c = vv7Var.d;
                vv7Var.d = imageView2;
                imageView2.bringToFront();
                vv7Var.d.setVisibility(8);
                vv7Var.h = null;
                return;
            case 26:
                by7 by7Var = (by7) obj;
                by7Var.T = null;
                by7Var.r.setText("");
                wx7 wx7Var = by7Var.s;
                int i = wx7.n;
                wx7Var.b(false);
                by7Var.setVisibility(8);
                by7Var.b0 = 0.0f;
                by7Var.h(0.0f);
                by7Var.setAlpha(0.0f);
                by7Var.j();
                return;
            case 27:
                AnimatorSet animatorSet = (AnimatorSet) obj;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 28:
                wx7 wx7Var2 = (wx7) ((eg0) obj).c;
                AnimatorSet animatorSet2 = (AnimatorSet) wx7Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wx7Var2.e = null;
                    return;
                }
                return;
            default:
                d38 d38Var = (d38) obj;
                fi1 fi1Var = d38Var.Y;
                if (fi1Var != null) {
                    if (fi1Var.getParent() != null) {
                        ((ViewGroup) d38Var.Y.getParent()).removeView(d38Var.Y);
                    }
                    d38Var.Y = null;
                }
                d38Var.a0 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
