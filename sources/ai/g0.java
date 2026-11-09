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
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.bs0;
import org.telegram.ui.cn;
import org.telegram.ui.e20;
import org.telegram.ui.e40;
import org.telegram.ui.ee0;
import org.telegram.ui.h81;
import org.telegram.ui.rn;
import org.telegram.ui.sz0;
import org.telegram.ui.t3;
import org.telegram.ui.uz0;
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
        sz0 sz0Var;
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
                t3Var.f50055y = f11;
                if (!t3Var.f50050n) {
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
                    cnVar.f44386a9 = null;
                    cnVar.l1.invalidate();
                    cnVar.f44700z0.invalidate();
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
                kk0 kk0Var = (kk0) this.d;
                if (this.f1199b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                kk0Var.f35366r = f12;
                kk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                kk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, kk0Var.f35366r));
                kk0Var.D.setAlpha(kk0Var.f35366r);
                kk0Var.f35367s.invalidate();
                kk0Var.f35368w.invalidate();
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
                    yVar.f39747y.removeView(yVar2);
                    yVar.e();
                }
                yVar2.setVisibility(8);
                return;
            case 10:
                e40 e40Var = (e40) this.d;
                e20 e20Var = e40Var.f45272t4;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) this.f1200c;
                if (yVar3 != null) {
                    yVar3.f39723f = false;
                }
                qs.f(e40Var.f45228k1.f21765a).j(e40Var.U4);
                e40Var.T4 = false;
                boolean z9 = this.f1199b;
                if (z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                e40Var.U3 = f13;
                e40Var.R3.f39397n = f13;
                if (!z9) {
                    e40Var.N4.setAlpha(0);
                    e40Var.d1();
                    if (e40Var.V3.getParent() != null) {
                        e40Var.f28624b.removeView(e40Var.V3);
                    }
                    e40Var.V3 = null;
                    e20Var.setVisibility(8);
                    e40Var.W3 = false;
                    e40Var.P1.X = true;
                    e40Var.S3.setVisibility(8);
                    if (e40Var.f45225j2) {
                        e40Var.f45225j2 = false;
                        e40Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.y yVar4 = e40Var.Q4;
                    if (yVar4 != null) {
                        yVar4.f39714a.setRoundCorners(0.0f);
                    }
                } else {
                    e20Var.setAlpha(1.0f);
                    e20Var.setScaleX(1.0f);
                    e20Var.setScaleY(1.0f);
                    e20Var.setTranslationX(0.0f);
                    e20Var.setTranslationY(0.0f);
                }
                e40Var.U0();
                e40Var.f28624b.invalidate();
                e40Var.f45219i1.invalidate();
                e40Var.H1.invalidate();
                return;
            case 11:
                yt0 yt0Var = (yt0) this.f1200c;
                ee0 ee0Var = (ee0) this.d;
                if (ee0Var.J == 0 && this.f1199b) {
                    ee0Var.N1(true, true);
                }
                yt0Var.setVisibility(8);
                yt0Var.g();
                yt0Var.setX(0.0f);
                return;
            case 12:
                bs0 bs0Var = (bs0) this.d;
                if (this.f1199b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                bs0Var.D = f14;
                bs0Var.f44115c.invalidate();
                bs0Var.d.invalidate();
                bs0Var.e();
                Runnable runnable3 = (Runnable) this.f1200c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                uz0 uz0Var = (uz0) this.d;
                if (this.f1199b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                uz0Var.f50512s = f15;
                uz0Var.f50502b.invalidate();
                uz0Var.f50504c.invalidate();
                uz0Var.e();
                TextView textView = uz0Var.D;
                if (textView != null) {
                    textView.setAlpha(uz0Var.f50512s);
                }
                if (uz0Var.S) {
                    uz0Var.N.invalidate();
                }
                if (!uz0Var.S && (sz0Var = uz0Var.N) != null && sz0Var.getSeekBarWaveform() != null) {
                    qm0 seekBarWaveform = uz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = uz0Var.f50512s;
                    q1 q1Var2 = seekBarWaveform.f37429n;
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
                h81 h81Var = (h81) this.d;
                if (this.f1199b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                h81Var.f46260y = f16;
                h81Var.f46247b.invalidate();
                h81Var.f46249c.invalidate();
                h81Var.e();
                Runnable runnable5 = (Runnable) this.f1200c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                i2 i2Var = (i2) this.d;
                bi.t tVar = i2Var.f55770c;
                if (this.f1199b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                i2Var.D = f17;
                tVar.setAlpha(f17);
                tVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                tVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                i2Var.f55769b.invalidate();
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
