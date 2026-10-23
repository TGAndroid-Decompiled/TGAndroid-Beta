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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.b41;
import org.telegram.ui.ed1;
import org.telegram.ui.ig0;
import org.telegram.ui.ko;
import org.telegram.ui.n30;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.uv0;
import org.telegram.ui.w3;
import org.telegram.ui.z31;
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
        z31 z31Var;
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
                w3Var.f42916x = f7;
                if (!w3Var.f42912n) {
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
                    snVar.f41561j1.invalidate();
                    snVar.f41737x0.invalidate();
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
                cn0 cn0Var = (cn0) this.d;
                if (this.f851b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                cn0Var.f25388r = f10;
                cn0Var.f25392y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                cn0Var.f25392y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, cn0Var.f25388r));
                cn0Var.f25392y.setAlpha(cn0Var.f25388r);
                cn0Var.f25389s.invalidate();
                cn0Var.v.invalidate();
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
                    tVar.f31923x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 8:
                u50 u50Var = (u50) this.d;
                n30 n30Var = u50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.f852c;
                if (tVar3 != null) {
                    tVar3.f31901f = false;
                }
                u50Var.d.getNotificationCenter().onAnimationFinish(u50Var.f42186d3);
                u50Var.f42182c3 = false;
                boolean z10 = this.f851b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                u50Var.f42185d2 = f11;
                u50Var.a2.f31714n = f11;
                if (!z10) {
                    u50Var.W2.setAlpha(0);
                    u50Var.b1();
                    if (u50Var.f42189e2.getParent() != null) {
                        viewGroup2 = ((h3) u50Var).containerView;
                        viewGroup2.removeView(u50Var.f42189e2);
                    }
                    u50Var.f42189e2 = null;
                    n30Var.setVisibility(8);
                    u50Var.f42194f2 = false;
                    u50Var.Y.X = true;
                    u50Var.f42176b2.setVisibility(8);
                    if (u50Var.f42245s0) {
                        u50Var.f42245s0 = false;
                        u50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = u50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.f31893a.setRoundCorners(0.0f);
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
                u50Var.f42173b.invalidate();
                u50Var.Q.invalidate();
                return;
            case 9:
                tw0 tw0Var = (tw0) this.f852c;
                ig0 ig0Var = (ig0) this.d;
                if (ig0Var.J == 0 && this.f851b) {
                    ig0Var.z1(true, true);
                }
                tw0Var.setVisibility(8);
                tw0Var.g();
                tw0Var.setX(0.0f);
                return;
            case 10:
                uv0 uv0Var = (uv0) this.d;
                if (this.f851b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                uv0Var.f42530y = f12;
                uv0Var.f42518c.invalidate();
                uv0Var.d.invalidate();
                uv0Var.e();
                Runnable runnable3 = (Runnable) this.f852c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                b41 b41Var = (b41) this.d;
                if (this.f851b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                b41Var.f35867s = f13;
                b41Var.f35858b.invalidate();
                b41Var.f35860c.invalidate();
                b41Var.e();
                TextView textView = b41Var.f35870y;
                if (textView != null) {
                    textView.setAlpha(b41Var.f35867s);
                }
                if (b41Var.S) {
                    b41Var.N.invalidate();
                }
                if (!b41Var.S && (z31Var = b41Var.N) != null && z31Var.getSeekBarWaveform() != null) {
                    kp0 seekBarWaveform = b41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = b41Var.f35867s;
                    t1 t1Var2 = seekBarWaveform.f28112n;
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
                ed1 ed1Var = (ed1) this.d;
                if (this.f851b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ed1Var.f36939x = f14;
                ed1Var.f36928b.invalidate();
                ed1Var.f36930c.invalidate();
                ed1Var.e();
                Runnable runnable5 = (Runnable) this.f852c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 13:
                u2 u2Var = (u2) this.d;
                ai.r rVar = u2Var.f46086c;
                if (this.f851b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                u2Var.f46093y = f15;
                rVar.setAlpha(f15);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46093y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46093y));
                u2Var.f46085b.invalidate();
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
