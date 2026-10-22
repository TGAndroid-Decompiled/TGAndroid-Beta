package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ei.vb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.dg0;
import org.telegram.ui.io;
import org.telegram.ui.k30;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
import org.telegram.ui.qv0;
import org.telegram.ui.v31;
import org.telegram.ui.x3;
import org.telegram.ui.x31;
import org.telegram.ui.yc1;
import rg.t2;
public final class q0 extends AnimatorListenerAdapter {
    public final int f849a;
    public boolean f850b;
    public final Object f851c;
    public final Object d;

    public q0(Object obj, Object obj2, boolean z10, int i10) {
        this.f849a = i10;
        this.d = obj;
        this.f851c = obj2;
        this.f850b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f849a) {
            case 14:
                this.f850b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator anim) {
        float f7;
        int i10;
        float f10;
        float f11;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float f12;
        float f13;
        v31 v31Var;
        float f14;
        float f15;
        float f16;
        switch (this.f849a) {
            case 0:
                super.onAnimationEnd(anim);
                t0 t0Var = (t0) this.d;
                t0Var.E.remove((ValueAnimator) this.f851c);
                t0.a(t0Var, this.f850b);
                return;
            case 1:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.f851c).endViewTransition(null);
                if (!this.f850b) {
                    throw null;
                }
                throw null;
            case 2:
                ((vb) this.d).m0();
                if (!this.f850b) {
                    ((View) this.f851c).setVisibility(8);
                    return;
                }
                return;
            case 3:
                x3 x3Var = (x3) this.d;
                if (this.f850b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                x3Var.f43020x = f7;
                if (!x3Var.f43016n) {
                    x3Var.n();
                }
                x3Var.i();
                Runnable runnable = (Runnable) this.f851c;
                if (runnable != null) {
                    runnable.run();
                }
                x3Var.h();
                return;
            case 4:
                qn qnVar = (qn) this.d;
                if (!this.f850b) {
                    Bitmap bitmap = qnVar.B8;
                    if (bitmap != null) {
                        qnVar.C8 = null;
                        qnVar.D8 = null;
                        bitmap.recycle();
                        qnVar.B8 = null;
                    }
                    u1 u1Var = (u1) this.f851c;
                    if (u1Var != null) {
                        u1Var.invalidate();
                    }
                    qnVar.tb(null);
                    qnVar.M8 = null;
                    qnVar.X0.invalidate();
                    qnVar.f40904x0.invalidate();
                    return;
                }
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.f851c;
                q8 q8Var = ((io) this.d).N;
                if (this.f850b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                q8Var.setVisibility(i10);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((View) arrayList.get(i11)).setTranslationY(0.0f);
                }
                return;
            case 6:
                zm0 zm0Var = (zm0) this.d;
                if (this.f850b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                zm0Var.f32977r = f10;
                zm0Var.f32981y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                zm0Var.f32981y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, zm0Var.f32977r));
                zm0Var.f32981y.setAlpha(zm0Var.f32977r);
                zm0Var.f32978s.invalidate();
                zm0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.f851c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f851c;
                tVar2.setScaleX(1.0f);
                tVar2.setScaleY(1.0f);
                tVar2.setAlpha(1.0f);
                if (this.f850b) {
                    tVar.f31741x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 8:
                q50 q50Var = (q50) this.d;
                k30 k30Var = q50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.f851c;
                if (tVar3 != null) {
                    tVar3.f31719f = false;
                }
                q50Var.d.getNotificationCenter().onAnimationFinish(q50Var.f40394d3);
                q50Var.f40390c3 = false;
                boolean z10 = this.f850b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                q50Var.f40393d2 = f11;
                q50Var.a2.f31532n = f11;
                if (!z10) {
                    q50Var.W2.setAlpha(0);
                    q50Var.c1();
                    if (q50Var.f40397e2.getParent() != null) {
                        viewGroup2 = ((f3) q50Var).containerView;
                        viewGroup2.removeView(q50Var.f40397e2);
                    }
                    q50Var.f40397e2 = null;
                    k30Var.setVisibility(8);
                    q50Var.f40402f2 = false;
                    q50Var.Y.X = true;
                    q50Var.f40384b2.setVisibility(8);
                    if (q50Var.f40453s0) {
                        q50Var.f40453s0 = false;
                        q50Var.P0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = q50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.f31711a.setRoundCorners(0.0f);
                    }
                } else {
                    k30Var.setAlpha(1.0f);
                    k30Var.setScaleX(1.0f);
                    k30Var.setScaleY(1.0f);
                    k30Var.setTranslationX(0.0f);
                    k30Var.setTranslationY(0.0f);
                }
                q50Var.T0();
                viewGroup = ((f3) q50Var).containerView;
                viewGroup.invalidate();
                q50Var.f40381b.invalidate();
                q50Var.Q.invalidate();
                return;
            case 9:
                qw0 qw0Var = (qw0) this.f851c;
                dg0 dg0Var = (dg0) this.d;
                if (dg0Var.J == 0 && this.f850b) {
                    dg0Var.v1(true, true);
                }
                qw0Var.setVisibility(8);
                qw0Var.g();
                qw0Var.setX(0.0f);
                return;
            case 10:
                qv0 qv0Var = (qv0) this.d;
                if (this.f850b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                qv0Var.f40998y = f12;
                qv0Var.f40986c.invalidate();
                qv0Var.d.invalidate();
                qv0Var.e();
                Runnable runnable3 = (Runnable) this.f851c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                x31 x31Var = (x31) this.d;
                if (this.f850b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                x31Var.f43034s = f13;
                x31Var.f43025b.invalidate();
                x31Var.f43027c.invalidate();
                x31Var.e();
                TextView textView = x31Var.f43037y;
                if (textView != null) {
                    textView.setAlpha(x31Var.f43034s);
                }
                if (x31Var.S) {
                    x31Var.N.invalidate();
                }
                if (!x31Var.S && (v31Var = x31Var.N) != null && v31Var.getSeekBarWaveform() != null) {
                    gp0 seekBarWaveform = x31Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = x31Var.f43034s;
                    u1 u1Var2 = seekBarWaveform.f26639n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.f851c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 12:
                yc1 yc1Var = (yc1) this.d;
                if (this.f850b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                yc1Var.f43464x = f14;
                yc1Var.f43453b.invalidate();
                yc1Var.f43455c.invalidate();
                yc1Var.e();
                Runnable runnable5 = (Runnable) this.f851c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 13:
                t2 t2Var = (t2) this.d;
                ai.r rVar = t2Var.f45657c;
                if (this.f850b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                t2Var.f45664y = f15;
                rVar.setAlpha(f15);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f45664y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f45664y));
                t2Var.f45656b.invalidate();
                Runnable runnable6 = (Runnable) this.f851c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
            case 14:
                zh.b0 b0Var = (zh.b0) this.d;
                if (b0Var.T == anim) {
                    b0Var.T = null;
                }
                if (!this.f850b) {
                    ((Runnable) this.f851c).run();
                    return;
                }
                return;
            default:
                zh.n0 n0Var = (zh.n0) this.d;
                n0Var.g0();
                zh.c1 c1Var = n0Var.d;
                if (this.f850b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                c1Var.setReveal(f16);
                ((Runnable) this.f851c).run();
                return;
        }
    }

    public q0(Object obj, boolean z10, Object obj2, int i10) {
        this.f849a = i10;
        this.d = obj;
        this.f850b = z10;
        this.f851c = obj2;
    }

    public q0(zh.b0 b0Var, Runnable runnable) {
        this.f849a = 14;
        this.d = b0Var;
        this.f851c = runnable;
    }

    public q0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.u0 u0Var, androidx.fragment.app.h hVar) {
        this.f849a = 1;
        this.f851c = viewGroup;
        this.f850b = z10;
        this.d = hVar;
    }
}
