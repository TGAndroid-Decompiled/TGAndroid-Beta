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
import org.telegram.ui.Components.xt0;
import org.telegram.ui.cn;
import org.telegram.ui.cs0;
import org.telegram.ui.f20;
import org.telegram.ui.f40;
import org.telegram.ui.fe0;
import org.telegram.ui.i81;
import org.telegram.ui.rn;
import org.telegram.ui.t3;
import org.telegram.ui.tz0;
import org.telegram.ui.vz0;
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
        tz0 tz0Var;
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
                t3Var.f50098y = f11;
                if (!t3Var.f50093n) {
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
                cn cnVar = (cn) this.d;
                if (!this.f1199b) {
                    Bitmap bitmap = cnVar.P8;
                    if (bitmap != null) {
                        cnVar.Q8 = null;
                        cnVar.R8 = null;
                        bitmap.recycle();
                        cnVar.P8 = null;
                    }
                    q1 q1Var = (q1) this.f1200c;
                    if (q1Var != null) {
                        q1Var.invalidate();
                    }
                    cnVar.Tb(null);
                    cnVar.f44427a9 = null;
                    cnVar.l1.invalidate();
                    cnVar.f44741z0.invalidate();
                    return;
                }
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.f1200c;
                m8 m8Var = ((rn) this.d).N;
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
                jk0Var.f34957r = f12;
                jk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                jk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, jk0Var.f34957r));
                jk0Var.D.setAlpha(jk0Var.f34957r);
                jk0Var.f34958s.invalidate();
                jk0Var.f34959w.invalidate();
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
                    yVar.f39669y.removeView(yVar2);
                    yVar.e();
                }
                yVar2.setVisibility(8);
                return;
            case 10:
                f40 f40Var = (f40) this.d;
                f20 f20Var = f40Var.f45600w4;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) this.f1200c;
                if (yVar3 != null) {
                    yVar3.f39645f = false;
                }
                qs.f(f40Var.n1.f21770a).j(f40Var.X4);
                f40Var.W4 = false;
                boolean z9 = this.f1199b;
                if (z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                f40Var.X3 = f13;
                f40Var.U3.f39317n = f13;
                if (!z9) {
                    f40Var.Q4.setAlpha(0);
                    f40Var.d1();
                    if (f40Var.Y3.getParent() != null) {
                        f40Var.f28672b.removeView(f40Var.Y3);
                    }
                    f40Var.Y3 = null;
                    f20Var.setVisibility(8);
                    f40Var.Z3 = false;
                    f40Var.S1.X = true;
                    f40Var.V3.setVisibility(8);
                    if (f40Var.f45551m2) {
                        f40Var.f45551m2 = false;
                        f40Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.y yVar4 = f40Var.T4;
                    if (yVar4 != null) {
                        yVar4.f39636a.setRoundCorners(0.0f);
                    }
                } else {
                    f20Var.setAlpha(1.0f);
                    f20Var.setScaleX(1.0f);
                    f20Var.setScaleY(1.0f);
                    f20Var.setTranslationX(0.0f);
                    f20Var.setTranslationY(0.0f);
                }
                f40Var.U0();
                f40Var.f28672b.invalidate();
                f40Var.l1.invalidate();
                f40Var.K1.invalidate();
                return;
            case 11:
                xt0 xt0Var = (xt0) this.f1200c;
                fe0 fe0Var = (fe0) this.d;
                if (fe0Var.J == 0 && this.f1199b) {
                    fe0Var.N1(true, true);
                }
                xt0Var.setVisibility(8);
                xt0Var.g();
                xt0Var.setX(0.0f);
                return;
            case 12:
                cs0 cs0Var = (cs0) this.d;
                if (this.f1199b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                cs0Var.D = f14;
                cs0Var.f44787c.invalidate();
                cs0Var.d.invalidate();
                cs0Var.e();
                Runnable runnable3 = (Runnable) this.f1200c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                vz0 vz0Var = (vz0) this.d;
                if (this.f1199b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                vz0Var.f50841s = f15;
                vz0Var.f50831b.invalidate();
                vz0Var.f50833c.invalidate();
                vz0Var.e();
                TextView textView = vz0Var.D;
                if (textView != null) {
                    textView.setAlpha(vz0Var.f50841s);
                }
                if (vz0Var.S) {
                    vz0Var.N.invalidate();
                }
                if (!vz0Var.S && (tz0Var = vz0Var.N) != null && tz0Var.getSeekBarWaveform() != null) {
                    pm0 seekBarWaveform = vz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = vz0Var.f50841s;
                    q1 q1Var2 = seekBarWaveform.f37028n;
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
                i81 i81Var = (i81) this.d;
                if (this.f1199b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                i81Var.f46573y = f16;
                i81Var.f46560b.invalidate();
                i81Var.f46562c.invalidate();
                i81Var.e();
                Runnable runnable5 = (Runnable) this.f1200c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                i2 i2Var = (i2) this.d;
                bi.t tVar = i2Var.f55769c;
                if (this.f1199b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                i2Var.D = f17;
                tVar.setAlpha(f17);
                tVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                tVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                i2Var.f55768b.invalidate();
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
