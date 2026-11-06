package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.va;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.an;
import org.telegram.ui.c20;
import org.telegram.ui.c40;
import org.telegram.ui.ce0;
import org.telegram.ui.f81;
import org.telegram.ui.pn;
import org.telegram.ui.pz0;
import org.telegram.ui.rz0;
import org.telegram.ui.t3;
import org.telegram.ui.zr0;
import tg.i2;
public final class g0 extends AnimatorListenerAdapter {
    public final int f1198a;
    public boolean f1199b;
    public final Object f1200c;
    public final Object d;

    public g0(Object obj, Object obj2, boolean z9, int i7) {
        this.f1198a = i7;
        this.d = obj;
        this.f1200c = obj2;
        this.f1199b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1198a) {
            case 0:
                this.f1199b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator anim) {
        float f10;
        float f11;
        int i7;
        float f12;
        float f13;
        float f14;
        float f15;
        pz0 pz0Var;
        float f16;
        float f17;
        switch (this.f1198a) {
            case 0:
                i0 i0Var = (i0) this.d;
                if (i0Var.T == anim) {
                    i0Var.T = null;
                }
                if (!this.f1199b) {
                    ((Runnable) this.f1200c).run();
                    return;
                }
                return;
            case 1:
                s0 s0Var = (s0) this.d;
                s0Var.l0();
                l1 l1Var = s0Var.d;
                if (this.f1199b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l1Var.setReveal(f10);
                ((Runnable) this.f1200c).run();
                return;
            case 2:
                kotlin.jvm.internal.j.e(anim, "anim");
                ((ViewGroup) this.f1200c).endViewTransition(null);
                if (!this.f1199b) {
                    throw null;
                }
                throw null;
            case 3:
                super.onAnimationEnd(anim);
                ch.b0 b0Var = (ch.b0) this.d;
                b0Var.E.remove((ValueAnimator) this.f1200c);
                ch.b0.a(b0Var, this.f1199b);
                return;
            case 4:
                ((va) this.d).m0();
                if (!this.f1199b) {
                    ((View) this.f1200c).setVisibility(8);
                    return;
                }
                return;
            case 5:
                t3 t3Var = (t3) this.d;
                if (this.f1199b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                t3Var.f49912y = f11;
                if (!t3Var.f49907n) {
                    t3Var.A();
                }
                t3Var.u();
                Runnable runnable = (Runnable) this.f1200c;
                if (runnable != null) {
                    runnable.run();
                }
                t3Var.r();
                return;
            case 6:
                an anVar = (an) this.d;
                if (!this.f1199b) {
                    Bitmap bitmap = anVar.P8;
                    if (bitmap != null) {
                        anVar.Q8 = null;
                        anVar.R8 = null;
                        bitmap.recycle();
                        anVar.P8 = null;
                    }
                    q1 q1Var = (q1) this.f1200c;
                    if (q1Var != null) {
                        q1Var.invalidate();
                    }
                    anVar.Qb(null);
                    anVar.f43726a9 = null;
                    anVar.l1.invalidate();
                    anVar.f44038z0.invalidate();
                    return;
                }
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.f1200c;
                m8 m8Var = ((pn) this.d).N;
                if (this.f1199b) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                m8Var.setVisibility(i7);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 8:
                jk0 jk0Var = (jk0) this.d;
                if (this.f1199b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                jk0Var.f34963r = f12;
                jk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                jk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, jk0Var.f34963r));
                jk0Var.D.setAlpha(jk0Var.f34963r);
                jk0Var.f34964s.invalidate();
                jk0Var.f34965w.invalidate();
                Runnable runnable2 = (Runnable) this.f1200c;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.h3(runnable2);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.d;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.f1200c;
                yVar2.setScaleX(1.0f);
                yVar2.setScaleY(1.0f);
                yVar2.setAlpha(1.0f);
                if (this.f1199b) {
                    yVar.f39602y.removeView(yVar2);
                    yVar.e();
                }
                yVar2.setVisibility(8);
                return;
            case 10:
                c40 c40Var = (c40) this.d;
                c20 c20Var = c40Var.f44630t4;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) this.f1200c;
                if (yVar3 != null) {
                    yVar3.f39578f = false;
                }
                qs.f(c40Var.f44586k1.f21723a).j(c40Var.U4);
                c40Var.T4 = false;
                boolean z9 = this.f1199b;
                if (z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                c40Var.U3 = f13;
                c40Var.R3.f39252n = f13;
                if (!z9) {
                    c40Var.N4.setAlpha(0);
                    c40Var.d1();
                    if (c40Var.V3.getParent() != null) {
                        c40Var.f28615b.removeView(c40Var.V3);
                    }
                    c40Var.V3 = null;
                    c20Var.setVisibility(8);
                    c40Var.W3 = false;
                    c40Var.P1.X = true;
                    c40Var.S3.setVisibility(8);
                    if (c40Var.f44583j2) {
                        c40Var.f44583j2 = false;
                        c40Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.y yVar4 = c40Var.Q4;
                    if (yVar4 != null) {
                        yVar4.f39569a.setRoundCorners(0.0f);
                    }
                } else {
                    c20Var.setAlpha(1.0f);
                    c20Var.setScaleX(1.0f);
                    c20Var.setScaleY(1.0f);
                    c20Var.setTranslationX(0.0f);
                    c20Var.setTranslationY(0.0f);
                }
                c40Var.U0();
                c40Var.f28615b.invalidate();
                c40Var.f44577i1.invalidate();
                c40Var.H1.invalidate();
                return;
            case 11:
                wt0 wt0Var = (wt0) this.f1200c;
                ce0 ce0Var = (ce0) this.d;
                if (ce0Var.J == 0 && this.f1199b) {
                    ce0Var.N1(true, true);
                }
                wt0Var.setVisibility(8);
                wt0Var.g();
                wt0Var.setX(0.0f);
                return;
            case 12:
                zr0 zr0Var = (zr0) this.d;
                if (this.f1199b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                zr0Var.D = f14;
                zr0Var.f52654c.invalidate();
                zr0Var.d.invalidate();
                zr0Var.e();
                Runnable runnable3 = (Runnable) this.f1200c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                rz0 rz0Var = (rz0) this.d;
                if (this.f1199b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                rz0Var.f49604s = f15;
                rz0Var.f49594b.invalidate();
                rz0Var.f49596c.invalidate();
                rz0Var.e();
                TextView textView = rz0Var.D;
                if (textView != null) {
                    textView.setAlpha(rz0Var.f49604s);
                }
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                }
                if (!rz0Var.S && (pz0Var = rz0Var.N) != null && pz0Var.getSeekBarWaveform() != null) {
                    pm0 seekBarWaveform = rz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = rz0Var.f49604s;
                    q1 q1Var2 = seekBarWaveform.f36989n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.f1200c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 14:
                f81 f81Var = (f81) this.d;
                if (this.f1199b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                f81Var.f45571y = f16;
                f81Var.f45558b.invalidate();
                f81Var.f45560c.invalidate();
                f81Var.e();
                Runnable runnable5 = (Runnable) this.f1200c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                i2 i2Var = (i2) this.d;
                bi.t tVar = i2Var.f55666c;
                if (this.f1199b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                i2Var.D = f17;
                tVar.setAlpha(f17);
                tVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                tVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                i2Var.f55665b.invalidate();
                Runnable runnable6 = (Runnable) this.f1200c;
                if (runnable6 != null) {
                    org.telegram.messenger.g0.h3(runnable6);
                    return;
                }
                return;
        }
    }

    public g0(Object obj, boolean z9, Object obj2, int i7) {
        this.f1198a = i7;
        this.d = obj;
        this.f1199b = z9;
        this.f1200c = obj2;
    }

    public g0(i0 i0Var, Runnable runnable) {
        this.f1198a = 0;
        this.d = i0Var;
        this.f1200c = runnable;
    }

    public g0(ViewGroup viewGroup, boolean z9, androidx.fragment.app.t0 t0Var, androidx.fragment.app.g gVar) {
        this.f1198a = 2;
        this.f1200c = viewGroup;
        this.f1199b = z9;
        this.d = gVar;
    }
}
