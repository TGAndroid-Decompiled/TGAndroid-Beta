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
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.ad1;
import org.telegram.ui.fg0;
import org.telegram.ui.ko;
import org.telegram.ui.m30;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
import org.telegram.ui.sv0;
import org.telegram.ui.x3;
import org.telegram.ui.x31;
import org.telegram.ui.z31;
import rg.t2;
public final class q0 extends AnimatorListenerAdapter {
    public final int f851a;
    public boolean f852b;
    public final Object f853c;
    public final Object d;

    public q0(Object obj, Object obj2, boolean z10, int i10) {
        this.f851a = i10;
        this.d = obj;
        this.f853c = obj2;
        this.f852b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f851a) {
            case 14:
                this.f852b = true;
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
        x31 x31Var;
        float f14;
        float f15;
        float f16;
        switch (this.f851a) {
            case 0:
                super.onAnimationEnd(anim);
                t0 t0Var = (t0) this.d;
                t0Var.E.remove((ValueAnimator) this.f853c);
                t0.a(t0Var, this.f852b);
                return;
            case 1:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.f853c).endViewTransition(null);
                if (!this.f852b) {
                    throw null;
                }
                throw null;
            case 2:
                ((vb) this.d).m0();
                if (!this.f852b) {
                    ((View) this.f853c).setVisibility(8);
                    return;
                }
                return;
            case 3:
                x3 x3Var = (x3) this.d;
                if (this.f852b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                x3Var.f43013x = f7;
                if (!x3Var.f43009n) {
                    x3Var.n();
                }
                x3Var.i();
                Runnable runnable = (Runnable) this.f853c;
                if (runnable != null) {
                    runnable.run();
                }
                x3Var.h();
                return;
            case 4:
                sn snVar = (sn) this.d;
                if (!this.f852b) {
                    Bitmap bitmap = snVar.B8;
                    if (bitmap != null) {
                        snVar.C8 = null;
                        snVar.D8 = null;
                        bitmap.recycle();
                        snVar.B8 = null;
                    }
                    u1 u1Var = (u1) this.f853c;
                    if (u1Var != null) {
                        u1Var.invalidate();
                    }
                    snVar.sb(null);
                    snVar.M8 = null;
                    snVar.X0.invalidate();
                    snVar.f41454x0.invalidate();
                    return;
                }
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.f853c;
                q8 q8Var = ((ko) this.d).N;
                if (this.f852b) {
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
                ym0 ym0Var = (ym0) this.d;
                if (this.f852b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ym0Var.f32713r = f10;
                ym0Var.f32717y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                ym0Var.f32717y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ym0Var.f32713r));
                ym0Var.f32717y.setAlpha(ym0Var.f32713r);
                ym0Var.f32714s.invalidate();
                ym0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.f853c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f853c;
                tVar2.setScaleX(1.0f);
                tVar2.setScaleY(1.0f);
                tVar2.setAlpha(1.0f);
                if (this.f852b) {
                    tVar.f31784x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 8:
                s50 s50Var = (s50) this.d;
                m30 m30Var = s50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.f853c;
                if (tVar3 != null) {
                    tVar3.f31762f = false;
                }
                s50Var.d.getNotificationCenter().onAnimationFinish(s50Var.f40949d3);
                s50Var.f40945c3 = false;
                boolean z10 = this.f852b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                s50Var.f40948d2 = f11;
                s50Var.a2.f31575n = f11;
                if (!z10) {
                    s50Var.W2.setAlpha(0);
                    s50Var.c1();
                    if (s50Var.f40952e2.getParent() != null) {
                        viewGroup2 = ((f3) s50Var).containerView;
                        viewGroup2.removeView(s50Var.f40952e2);
                    }
                    s50Var.f40952e2 = null;
                    m30Var.setVisibility(8);
                    s50Var.f40957f2 = false;
                    s50Var.Y.X = true;
                    s50Var.f40939b2.setVisibility(8);
                    if (s50Var.f41008s0) {
                        s50Var.f41008s0 = false;
                        s50Var.P0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = s50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.f31754a.setRoundCorners(0.0f);
                    }
                } else {
                    m30Var.setAlpha(1.0f);
                    m30Var.setScaleX(1.0f);
                    m30Var.setScaleY(1.0f);
                    m30Var.setTranslationX(0.0f);
                    m30Var.setTranslationY(0.0f);
                }
                s50Var.T0();
                viewGroup = ((f3) s50Var).containerView;
                viewGroup.invalidate();
                s50Var.f40936b.invalidate();
                s50Var.Q.invalidate();
                return;
            case 9:
                ow0 ow0Var = (ow0) this.f853c;
                fg0 fg0Var = (fg0) this.d;
                if (fg0Var.J == 0 && this.f852b) {
                    fg0Var.v1(true, true);
                }
                ow0Var.setVisibility(8);
                ow0Var.g();
                ow0Var.setX(0.0f);
                return;
            case 10:
                sv0 sv0Var = (sv0) this.d;
                if (this.f852b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                sv0Var.f41548y = f12;
                sv0Var.f41536c.invalidate();
                sv0Var.d.invalidate();
                sv0Var.e();
                Runnable runnable3 = (Runnable) this.f853c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                z31 z31Var = (z31) this.d;
                if (this.f852b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                z31Var.f43577s = f13;
                z31Var.f43568b.invalidate();
                z31Var.f43570c.invalidate();
                z31Var.e();
                TextView textView = z31Var.f43580y;
                if (textView != null) {
                    textView.setAlpha(z31Var.f43577s);
                }
                if (z31Var.S) {
                    z31Var.N.invalidate();
                }
                if (!z31Var.S && (x31Var = z31Var.N) != null && x31Var.getSeekBarWaveform() != null) {
                    fp0 seekBarWaveform = z31Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = z31Var.f43577s;
                    u1 u1Var2 = seekBarWaveform.f26349n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.f853c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 12:
                ad1 ad1Var = (ad1) this.d;
                if (this.f852b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ad1Var.f35429x = f14;
                ad1Var.f35418b.invalidate();
                ad1Var.f35420c.invalidate();
                ad1Var.e();
                Runnable runnable5 = (Runnable) this.f853c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 13:
                t2 t2Var = (t2) this.d;
                ai.r rVar = t2Var.f45692c;
                if (this.f852b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                t2Var.f45699y = f15;
                rVar.setAlpha(f15);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f45699y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f45699y));
                t2Var.f45691b.invalidate();
                Runnable runnable6 = (Runnable) this.f853c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
            case 14:
                zh.w wVar = (zh.w) this.d;
                if (wVar.O == anim) {
                    wVar.O = null;
                }
                if (!this.f852b) {
                    ((Runnable) this.f853c).run();
                    return;
                }
                return;
            default:
                zh.f0 f0Var = (zh.f0) this.d;
                f0Var.g0();
                zh.t0 t0Var2 = f0Var.d;
                if (this.f852b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                t0Var2.setReveal(f16);
                ((Runnable) this.f853c).run();
                return;
        }
    }

    public q0(Object obj, boolean z10, Object obj2, int i10) {
        this.f851a = i10;
        this.d = obj;
        this.f852b = z10;
        this.f853c = obj2;
    }

    public q0(zh.w wVar, Runnable runnable) {
        this.f851a = 14;
        this.d = wVar;
        this.f853c = runnable;
    }

    public q0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.u0 u0Var, androidx.fragment.app.h hVar) {
        this.f851a = 1;
        this.f853c = viewGroup;
        this.f852b = z10;
        this.d = hVar;
    }
}
