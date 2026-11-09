package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.yv0;
public final class t5 extends AnimatorListenerAdapter {
    public final int f4745a;
    public final Object f4746b;

    public t5(Object obj, int i7) {
        this.f4745a = i7;
        this.f4746b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7 = this.f4745a;
        Object obj = this.f4746b;
        switch (i7) {
            case 0:
                w5 w5Var = (w5) obj;
                w5Var.E = 1.0f;
                w5Var.F = -1;
                v5 v5Var = w5Var.H;
                if (v5Var != null && (z9 = v5Var.f4880l) && z9) {
                    v5Var.f4880l = false;
                    v5Var.b();
                }
                w5Var.G = null;
                return;
            case 1:
                rc rcVar = ((sc) obj).f4722c;
                rcVar.setScaleX(1.0f);
                rcVar.setScaleY(1.0f);
                return;
            case 2:
                ((a4) obj).run();
                return;
            case 3:
                ((ch.o) obj).f6347w.setVisibility(4);
                return;
            case 4:
                ch.r rVar = (ch.r) obj;
                rVar.setVisibility(8);
                ch.q qVar = rVar.f6383b;
                if (qVar != null) {
                    rVar.removeView(qVar);
                    rVar.f6383b = null;
                }
                rVar.f6385e = null;
                return;
            case 5:
                ((ch.h0) obj).f6264y.c();
                return;
            case 6:
                di.a aVar = (di.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 7:
                super.onAnimationEnd(animator);
                ((di.p) obj).O.f9454p = false;
                return;
            case 8:
                di.n0 n0Var = (di.n0) obj;
                di.s0 s0Var = n0Var.K;
                if (s0Var != null && n0Var.I == s0Var.f9714a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(this, 16));
                    n0Var.J.setStartDelay(3000L);
                    n0Var.J.setDuration(550L);
                    n0Var.J.setInterpolator(new LinearInterpolator());
                    n0Var.J.start();
                    return;
                }
                return;
            case 9:
                di.o2 o2Var = (di.o2) obj;
                o2Var.f9429x5.invalidate();
                o2Var.setAnimatedTop(0);
                o2Var.f9429x5.E2 = true;
                View view = o2Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var.G1.setTranslationY(((1.0f - o2Var.getTopViewEnterProgress()) * o2Var.G1.getLayoutParams().height) + o2Var.T1);
                }
                o2Var.f9429x5.N1 = null;
                return;
            case 10:
                di.f4 f4Var = (di.f4) obj;
                f4Var.f8987c[1].setVisibility(8);
                f4Var.f8987c[0].setAlpha(1.0f);
                f4Var.f8987c[0].setTranslationY(0.0f);
                return;
            case 11:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                yv0 yv0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                yv0Var.R = 1.0f;
                yv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 12:
                ((di.p4) obj).M = null;
                return;
            case 13:
                di.b5 b5Var = (di.b5) obj;
                b5Var.f8847x = null;
                b5Var.f8844r = 1.0f;
                b5Var.invalidate();
                return;
            case 14:
            default:
                super.onAnimationEnd(animator);
                return;
            case 15:
                di.h8 h8Var = (di.h8) obj;
                h8Var.H = false;
                h8Var.G = 0.0f;
                h8Var.invalidate();
                h8Var.requestLayout();
                h8Var.J.requestLayout();
                return;
            case 16:
                fi.m mVar = ((fi.g) obj).f12055c0;
                if (mVar.f12367f0 == animator) {
                    mVar.f12367f0 = null;
                    mVar.f12366f.getEditText().setScrollY(mVar.f12360b0);
                    return;
                }
                return;
            case 17:
                fi.d0 d0Var = (fi.d0) obj;
                d0Var.f11777l = 1.0f;
                fi.e0 e0Var = d0Var.f11781p;
                if (e0Var.f11839n.contains(d0Var)) {
                    d0Var.f11770c.R();
                    fi.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f11771e;
                    if (textureView != null) {
                        org.telegram.messenger.g0.E2(textureView);
                        d0Var.f11771e = null;
                    }
                    d0Var.f11772f = false;
                    e0Var.f11839n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 18:
                fi.f3 f3Var = (fi.f3) ((fi.u2) obj).f12885c;
                f3Var.F.setVisibility(8);
                f3Var.d.setVisibility(8);
                return;
            case 19:
                fi.m3 m3Var = (fi.m3) obj;
                m3Var.f12451z0 = 1.0f;
                m3Var.invalidate();
                return;
            case 20:
                org.telegram.messenger.g0.E2((ji0) obj);
                return;
            case 21:
                super.onAnimationEnd(animator);
                fi.l5 l5Var = (fi.l5) obj;
                ImageView imageView = l5Var.f12322c;
                l5Var.f12322c = l5Var.d;
                l5Var.d = imageView;
                imageView.bringToFront();
                l5Var.d.setVisibility(8);
                l5Var.h = null;
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((fi.r5) obj).f12742x = null;
                return;
            case 23:
                fi.l6 l6Var = (fi.l6) obj;
                if (l6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) l6Var.getParent()).removeView(l6Var);
                    return;
                }
                return;
            case 24:
                ((fi.n8) obj).N = false;
                return;
            case 25:
                fi.l8 l8Var = (fi.l8) obj;
                l8Var.setTranslationY(0.0f);
                l8Var.d = null;
                return;
            case 26:
                hi.u uVar = (hi.u) obj;
                uVar.setVisibility(8);
                uVar.f14965a = null;
                return;
            case 27:
                ((hi.a3) obj).E.setVisibility(8);
                return;
            case 28:
                ((hi.c4) obj).I.setVisibility(8);
                return;
            case 29:
                super.onAnimationEnd(animator);
                lg.g gVar = (lg.g) obj;
                if (!gVar.f18308i1) {
                    gVar.f18323u0 = false;
                    gVar.f18322t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f18301f0 = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4745a) {
            case 14:
                super.onAnimationStart(animator);
                di.d7 d7Var = (di.d7) this.f4746b;
                ah0 ah0Var = ((di.c7) d7Var.f8928a.get(d7Var.d)).f8877c;
                ah0Var.L = 2;
                ah0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
