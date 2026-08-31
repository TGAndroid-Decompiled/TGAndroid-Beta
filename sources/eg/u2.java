package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import oh.f4;
import oh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zv;
import org.telegram.ui.b5;
import org.telegram.ui.e5;
import org.telegram.ui.kd;
import org.telegram.ui.l4;
import org.telegram.ui.ma;
import org.telegram.ui.nd;
import org.telegram.ui.po;
import org.telegram.ui.u4;
import org.telegram.ui.xn;
public final class u2 extends AnimatorListenerAdapter {
    public final int f5506a;
    public boolean f5507b;
    public final Object f5508c;

    public u2(int i10, Object obj, boolean z4) {
        this.f5506a = i10;
        this.f5508c = obj;
        this.f5507b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f5506a) {
            case 12:
                org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) this.f5508c;
                AnimatorSet animatorSet = e2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.O = null;
                    return;
                }
                return;
            case 13:
                t5 t5Var = (t5) this.f5508c;
                AnimatorSet animatorSet2 = t5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.G = null;
                    return;
                }
                return;
            case 14:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                super.onAnimationCancel(animator);
                return;
            case 15:
                ya yaVar = (ya) this.f5508c;
                AnimatorSet animatorSet3 = yaVar.f24467f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f24467f = null;
                    return;
                }
                return;
            case 17:
                ((nd) this.f5508c).f39400n = null;
                return;
            case 18:
                xn xnVar = (xn) this.f5508c;
                AnimatorSet animatorSet4 = xnVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    xnVar.E0 = null;
                    return;
                }
                return;
            case 19:
                ((po) this.f5508c).h = null;
                return;
            case 20:
                v9 v9Var = (v9) this.f5508c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    v9Var.h = null;
                    return;
                }
                return;
            case 22:
                ((mi) this.f5508c).V0 = null;
                return;
            case 23:
                this.f5507b = true;
                return;
            case 28:
                o00 o00Var = (o00) this.f5508c;
                AnimatorSet animatorSet6 = o00Var.f29640e;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    o00Var.f29640e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        float f12;
        float f13;
        oh.e1 e1Var;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10;
        kd kdVar;
        View view;
        RadialProgressView radialProgressView;
        float f18;
        float f19;
        float f20;
        float f21;
        switch (this.f5506a) {
            case 0:
                v2 v2Var = (v2) this.f5508c;
                ((dg.p) v2Var).f4635y.f4506n.d();
                if (this.f5507b) {
                    v2Var.f5519w.accept(Integer.valueOf(v2Var.f5518s));
                }
                if (v2Var.getParent() != null) {
                    ((ViewGroup) v2Var.getParent()).removeView(v2Var);
                    return;
                }
                return;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f5508c;
                if (this.f5507b) {
                    limitPreviewView.f24955g0 = false;
                }
                Runnable runnable = limitPreviewView.f24956h0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24956h0.run();
                    return;
                }
                return;
            case 2:
                fg.b1 b1Var = (fg.b1) this.f5508c;
                if (this.f5507b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b1Var.J = f10;
                b1Var.d.invalidate();
                fg.a1 a1Var = b1Var.f6247e;
                if (a1Var != null) {
                    a1Var.invalidate();
                    return;
                }
                return;
            case 3:
                ng.d0 d0Var = (ng.d0) this.f5508c;
                rk0 rk0Var = d0Var.f16044n;
                d0Var.k();
                d0Var.l();
                boolean z4 = this.f5507b;
                ng.d0.a(d0Var, z4);
                d0Var.f16043m.invalidateOutline();
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                d0Var.f16040j = f11;
                boolean z10 = true;
                if (z4) {
                    d0Var.f16041k = true;
                    d0Var.f16033a.invalidate();
                }
                rk0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f16040j, 1.0f, 0.0f));
                if (!z4) {
                    rk0Var.setImportantForAccessibility(0);
                    rk0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = d0Var.f16054y;
                    rk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                d0Var.C = false;
                return;
            case 4:
                oh.p pVar = (oh.p) this.f5508c;
                if (this.f5507b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                pVar.f17575a0 = f12;
                pVar.b();
                return;
            case 5:
                oh.h2 h2Var = (oh.h2) this.f5508c;
                mh.d1 d1Var = h2Var.f17831c;
                boolean z11 = this.f5507b;
                float f22 = 0.0f;
                if (z11) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                d1Var.setAlpha(f13);
                View view2 = h2Var.f17827a;
                if (!z11) {
                    f22 = 0.5f;
                }
                view2.setAlpha(f22);
                h2Var.invalidate();
                return;
            case 6:
                oh.j1 j1Var = (oh.j1) this.f5508c;
                j1Var.f17312b.removeViewImmediate(j1Var.d);
                j1Var.f17315f.b();
                if (this.f5507b && (e1Var = j1Var.v) != null && e1Var != oh.e1.T) {
                    e1Var.e();
                }
                j1Var.v = null;
                j1Var.f17318s = true;
                j1Var.D = null;
                j1Var.B = false;
                return;
            case 7:
                i9 i9Var = (i9) this.f5508c;
                i9Var.G0.unlock();
                if (this.f5507b) {
                    f14 = i9Var.f17300w.f17489c;
                } else {
                    f14 = 0.0f;
                }
                i9Var.f17256b0 = f14;
                f4 currentPeerView = i9Var.f17277k0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.f17295s1 = null;
                return;
            case 8:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f5508c;
                if (this.f5507b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                g1Var.setTextColor(i0.a.d(f15, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f15, -1, -9194260));
                return;
            case 9:
                l4 l4Var = (l4) this.f5508c;
                boolean z12 = this.f5507b;
                if (z12) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                l4Var.V0 = f16;
                l4Var.f38615n0.setTranslationY(((1.0f - f16) * AndroidUtilities.dp(51.0f)) + l4Var.m0);
                if (!z12) {
                    l4Var.f38615n0.setVisibility(8);
                    return;
                }
                return;
            case 10:
                e5 e5Var = (e5) this.f5508c;
                if (!this.f5507b) {
                    e5Var.setVisibility(4);
                    cb.m mVar = ((u4) e5Var).D;
                    if (mVar.f2424a) {
                        mVar.f2424a = false;
                        if (((u4) mVar.d).getParent() != null) {
                            ((WindowManager) mVar.f2426c).removeView((u4) mVar.d);
                        }
                        u4 u4Var = (u4) mVar.d;
                        u4Var.B = true;
                        b5 b5Var = u4Var.f36406y;
                        if (b5Var != null) {
                            if (b5Var.f35335g) {
                                b5Var.f35335g = false;
                                b5Var.f35331b.removeObserver(b5Var.f35330a, b5Var.f35333e);
                            }
                            u4Var.f36406y = null;
                        }
                        mVar.d = null;
                        ((ViewGroup) mVar.f2425b).requestDisallowInterceptTouchEvent(false);
                        mVar.f2425b = null;
                        mVar.f2426c = null;
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f5508c;
                org.telegram.ui.Cells.s1 s1Var = t1Var.Wc;
                int g10 = s1Var.g();
                int i12 = t1Var.f23837ed;
                if (i12 != g10) {
                    t1Var.t1(i12, g10, this.f5507b);
                    return;
                }
                t1Var.f23881hd = false;
                s1Var.a2 = i12;
                return;
            case 12:
                org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) this.f5508c;
                AnimatorSet animatorSet = e2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.O = null;
                    if (!this.f5507b) {
                        e2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                t5 t5Var = (t5) this.f5508c;
                AnimatorSet animatorSet2 = t5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.G = null;
                    if (!this.f5507b) {
                        t5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                r7 r7Var = (r7) this.f5508c;
                ValueAnimator valueAnimator = r7Var.f23589x0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f5507b) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    r7Var.f23591y0 = f17;
                    r7Var.f23589x0 = null;
                    return;
                }
                return;
            case 15:
                ya yaVar = (ya) this.f5508c;
                AnimatorSet animatorSet3 = yaVar.f24467f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f24467f = null;
                    if (!this.f5507b) {
                        yaVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ImageView imageView = ((ma) this.f5508c).d;
                if (this.f5507b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                return;
            case 17:
                nd ndVar = (nd) this.f5508c;
                if (ndVar.f39400n != null && (kdVar = ndVar.h) != null) {
                    if (this.f5507b) {
                        kdVar.setVisibility(4);
                    } else {
                        ndVar.f39405r.setVisibility(4);
                    }
                    ndVar.f39400n = null;
                    return;
                }
                return;
            case 18:
                xn xnVar = (xn) this.f5508c;
                AnimatorSet animatorSet4 = xnVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f5507b) {
                        xnVar.D0.setVisibility(4);
                        return;
                    }
                    if (xnVar.f43430z0) {
                        view = xnVar.A0;
                    } else {
                        view = xnVar.f43417y0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            case 19:
                po poVar = (po) this.f5508c;
                if (poVar.h != null && (radialProgressView = poVar.f40111n) != null) {
                    if (!this.f5507b) {
                        radialProgressView.setVisibility(4);
                        poVar.f40103f.setVisibility(4);
                    }
                    poVar.h = null;
                    return;
                }
                return;
            case 20:
                v9 v9Var = (v9) this.f5508c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f5507b) {
                        v9Var.f31856c.setVisibility(4);
                        return;
                    } else {
                        v9Var.f31855b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 21:
                rc rcVar = (rc) this.f5508c;
                if (animator == rcVar.f30678g) {
                    rcVar.f30678g = null;
                    if (this.f5507b) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    rcVar.f30679i = f18;
                    rcVar.b();
                    return;
                }
                return;
            case 22:
                mi miVar = (mi) this.f5508c;
                if (miVar.V0 != null) {
                    if (this.f5507b) {
                        if (miVar.P0) {
                            ei eiVar = miVar.f29100v0;
                            if (eiVar == null || eiVar.I()) {
                                miVar.f29098u1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.w0 w0Var = miVar.f29037b1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (miVar.N0 != 0 || !miVar.f29075n1) {
                        miVar.X0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ho hoVar = (ho) this.f5508c;
                if (!this.f5507b) {
                    p9 p9Var = hoVar.h;
                    hoVar.h = hoVar.f27526n;
                    hoVar.f27526n = p9Var;
                    p9Var.setVisibility(8);
                    hoVar.f27526n.setAlpha(0.0f);
                    hoVar.h.setVisibility(0);
                    hoVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 24:
                boolean z13 = this.f5507b;
                ro roVar = (ro) this.f5508c;
                if (animator == roVar.f30807e) {
                    if (z13) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    roVar.d = f19;
                    roVar.setShown(f19);
                    if (!z13) {
                        roVar.setVisibility(8);
                    }
                    roVar.a(true);
                    return;
                }
                return;
            case 25:
                mp mpVar = (mp) this.f5508c;
                if (this.f5507b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                mpVar.f29171d0 = f20;
                mpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f29171d0);
                return;
            case 26:
                if (!this.f5507b) {
                    ((mq) this.f5508c).E.setVisibility(8);
                    return;
                }
                return;
            case 27:
                vv vvVar = (vv) this.f5508c;
                zv zvVar = vvVar.G;
                if (zvVar.R && !vvVar.h) {
                    if (!this.f5507b && !vvVar.f32549n) {
                        vvVar.setBackground(null);
                        return;
                    } else if (vvVar.getBackground() == null) {
                        vvVar.setBackground(k6.Y(zvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 28:
                o00 o00Var = (o00) this.f5508c;
                AnimatorSet animatorSet6 = o00Var.f29640e;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    if (!this.f5507b) {
                        o00Var.f29641f.setVisibility(4);
                    }
                    o00Var.f29640e = null;
                    return;
                }
                return;
            default:
                z00 z00Var = (z00) this.f5508c;
                if (this.f5507b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                z00Var.h = f21;
                z00Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f5506a) {
            case 4:
                super.onAnimationStart(animator);
                try {
                    ((oh.p) this.f5508c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public u2(ho hoVar) {
        this.f5506a = 23;
        this.f5508c = hoVar;
    }
}
