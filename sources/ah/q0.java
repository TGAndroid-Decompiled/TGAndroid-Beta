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
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.a41;
import org.telegram.ui.dd1;
import org.telegram.ui.hg0;
import org.telegram.ui.ko;
import org.telegram.ui.n30;
import org.telegram.ui.sn;
import org.telegram.ui.tv0;
import org.telegram.ui.u50;
import org.telegram.ui.w3;
import org.telegram.ui.y31;
import rg.u2;
public final class q0 extends AnimatorListenerAdapter {
    public final int f850a;
    public boolean f851b;
    public final Object f852c;
    public final Object d;

    public q0(Object obj, Object obj2, boolean z10, int i10) {
        this.f850a = i10;
        this.d = obj;
        this.f852c = obj2;
        this.f851b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f850a) {
            case 14:
                this.f851b = true;
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
        y31 y31Var;
        float f14;
        float f15;
        float f16;
        switch (this.f850a) {
            case 0:
                super.onAnimationEnd(anim);
                t0 t0Var = (t0) this.d;
                t0Var.E.remove((ValueAnimator) this.f852c);
                t0.a(t0Var, this.f851b);
                return;
            case 1:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.f852c).endViewTransition(null);
                if (!this.f851b) {
                    throw null;
                }
                throw null;
            case 2:
                ((vb) this.d).m0();
                if (!this.f851b) {
                    ((View) this.f852c).setVisibility(8);
                    return;
                }
                return;
            case 3:
                w3 w3Var = (w3) this.d;
                if (this.f851b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                w3Var.f42892x = f7;
                if (!w3Var.f42888n) {
                    w3Var.n();
                }
                w3Var.i();
                Runnable runnable = (Runnable) this.f852c;
                if (runnable != null) {
                    runnable.run();
                }
                w3Var.h();
                return;
            case 4:
                sn snVar = (sn) this.d;
                if (!this.f851b) {
                    Bitmap bitmap = snVar.N8;
                    if (bitmap != null) {
                        snVar.O8 = null;
                        snVar.P8 = null;
                        bitmap.recycle();
                        snVar.N8 = null;
                    }
                    t1 t1Var = (t1) this.f852c;
                    if (t1Var != null) {
                        t1Var.invalidate();
                    }
                    snVar.ub(null);
                    snVar.Y8 = null;
                    snVar.f41558j1.invalidate();
                    snVar.f41734x0.invalidate();
                    return;
                }
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.f852c;
                r8 r8Var = ((ko) this.d).N;
                if (this.f851b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                r8Var.setVisibility(i10);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((View) arrayList.get(i11)).setTranslationY(0.0f);
                }
                return;
            case 6:
                bn0 bn0Var = (bn0) this.d;
                if (this.f851b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                bn0Var.f25058r = f10;
                bn0Var.f25062y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                bn0Var.f25062y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, bn0Var.f25058r));
                bn0Var.f25062y.setAlpha(bn0Var.f25058r);
                bn0Var.f25059s.invalidate();
                bn0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.f852c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f852c;
                tVar2.setScaleX(1.0f);
                tVar2.setScaleY(1.0f);
                tVar2.setAlpha(1.0f);
                if (this.f851b) {
                    tVar.f31893x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 8:
                u50 u50Var = (u50) this.d;
                n30 n30Var = u50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.f852c;
                if (tVar3 != null) {
                    tVar3.f31871f = false;
                }
                u50Var.d.getNotificationCenter().onAnimationFinish(u50Var.f42232d3);
                u50Var.f42228c3 = false;
                boolean z10 = this.f851b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                u50Var.f42231d2 = f11;
                u50Var.a2.f31684n = f11;
                if (!z10) {
                    u50Var.W2.setAlpha(0);
                    u50Var.b1();
                    if (u50Var.f42235e2.getParent() != null) {
                        viewGroup2 = ((h3) u50Var).containerView;
                        viewGroup2.removeView(u50Var.f42235e2);
                    }
                    u50Var.f42235e2 = null;
                    n30Var.setVisibility(8);
                    u50Var.f42240f2 = false;
                    u50Var.Y.X = true;
                    u50Var.f42222b2.setVisibility(8);
                    if (u50Var.f42291s0) {
                        u50Var.f42291s0 = false;
                        u50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = u50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.f31863a.setRoundCorners(0.0f);
                    }
                } else {
                    n30Var.setAlpha(1.0f);
                    n30Var.setScaleX(1.0f);
                    n30Var.setScaleY(1.0f);
                    n30Var.setTranslationX(0.0f);
                    n30Var.setTranslationY(0.0f);
                }
                u50Var.S0();
                viewGroup = ((h3) u50Var).containerView;
                viewGroup.invalidate();
                u50Var.f42219b.invalidate();
                u50Var.Q.invalidate();
                return;
            case 9:
                sw0 sw0Var = (sw0) this.f852c;
                hg0 hg0Var = (hg0) this.d;
                if (hg0Var.J == 0 && this.f851b) {
                    hg0Var.z1(true, true);
                }
                sw0Var.setVisibility(8);
                sw0Var.g();
                sw0Var.setX(0.0f);
                return;
            case 10:
                tv0 tv0Var = (tv0) this.d;
                if (this.f851b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                tv0Var.f42139y = f12;
                tv0Var.f42127c.invalidate();
                tv0Var.d.invalidate();
                tv0Var.e();
                Runnable runnable3 = (Runnable) this.f852c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                a41 a41Var = (a41) this.d;
                if (this.f851b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                a41Var.f35587s = f13;
                a41Var.f35578b.invalidate();
                a41Var.f35580c.invalidate();
                a41Var.e();
                TextView textView = a41Var.f35590y;
                if (textView != null) {
                    textView.setAlpha(a41Var.f35587s);
                }
                if (a41Var.S) {
                    a41Var.N.invalidate();
                }
                if (!a41Var.S && (y31Var = a41Var.N) != null && y31Var.getSeekBarWaveform() != null) {
                    jp0 seekBarWaveform = a41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = a41Var.f35587s;
                    t1 t1Var2 = seekBarWaveform.f27773n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.f852c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 12:
                dd1 dd1Var = (dd1) this.d;
                if (this.f851b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                dd1Var.f36601x = f14;
                dd1Var.f36590b.invalidate();
                dd1Var.f36592c.invalidate();
                dd1Var.e();
                Runnable runnable5 = (Runnable) this.f852c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 13:
                u2 u2Var = (u2) this.d;
                ai.r rVar = u2Var.f46085c;
                if (this.f851b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                u2Var.f46092y = f15;
                rVar.setAlpha(f15);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46092y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46092y));
                u2Var.f46084b.invalidate();
                Runnable runnable6 = (Runnable) this.f852c;
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
                if (!this.f851b) {
                    ((Runnable) this.f852c).run();
                    return;
                }
                return;
            default:
                zh.n0 n0Var = (zh.n0) this.d;
                n0Var.g0();
                zh.c1 c1Var = n0Var.d;
                if (this.f851b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                c1Var.setReveal(f16);
                ((Runnable) this.f852c).run();
                return;
        }
    }

    public q0(Object obj, boolean z10, Object obj2, int i10) {
        this.f850a = i10;
        this.d = obj;
        this.f851b = z10;
        this.f852c = obj2;
    }

    public q0(zh.b0 b0Var, Runnable runnable) {
        this.f850a = 14;
        this.d = b0Var;
        this.f852c = runnable;
    }

    public q0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.u0 u0Var, androidx.fragment.app.h hVar) {
        this.f850a = 1;
        this.f852c = viewGroup;
        this.f851b = z10;
        this.d = hVar;
    }
}
