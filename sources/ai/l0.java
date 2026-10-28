package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.sb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.d41;
import org.telegram.ui.f41;
import org.telegram.ui.ig0;
import org.telegram.ui.kd1;
import org.telegram.ui.oo;
import org.telegram.ui.r30;
import org.telegram.ui.v3;
import org.telegram.ui.wn;
import org.telegram.ui.x50;
import org.telegram.ui.zv0;
import sg.u2;
public final class l0 extends AnimatorListenerAdapter {
    public final int f1566a;
    public boolean f1567b;
    public final Object f1568c;
    public final Object d;

    public l0(Object obj, Object obj2, boolean z10, int i10) {
        this.f1566a = i10;
        this.d = obj;
        this.f1568c = obj2;
        this.f1567b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1566a) {
            case 0:
                this.f1567b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator anim) {
        float f7;
        float f10;
        int i10;
        float f11;
        float f12;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float f13;
        float f14;
        d41 d41Var;
        float f15;
        float f16;
        switch (this.f1566a) {
            case 0:
                o0 o0Var = (o0) this.d;
                if (o0Var.T == anim) {
                    o0Var.T = null;
                }
                if (!this.f1567b) {
                    ((Runnable) this.f1568c).run();
                    return;
                }
                return;
            case 1:
                z0 z0Var = (z0) this.d;
                z0Var.h0();
                t1 t1Var = z0Var.d;
                if (this.f1567b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                t1Var.setReveal(f7);
                ((Runnable) this.f1568c).run();
                return;
            case 2:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.f1568c).endViewTransition(null);
                if (!this.f1567b) {
                    throw null;
                }
                throw null;
            case 3:
                super.onAnimationEnd(anim);
                bh.i0 i0Var = (bh.i0) this.d;
                i0Var.E.remove((ValueAnimator) this.f1568c);
                bh.i0.a(i0Var, this.f1567b);
                return;
            case 4:
                ((sb) this.d).m0();
                if (!this.f1567b) {
                    ((View) this.f1568c).setVisibility(8);
                    return;
                }
                return;
            case 5:
                v3 v3Var = (v3) this.d;
                if (this.f1567b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v3Var.f44174x = f10;
                if (!v3Var.f44170n) {
                    v3Var.n();
                }
                v3Var.i();
                Runnable runnable = (Runnable) this.f1568c;
                if (runnable != null) {
                    runnable.run();
                }
                v3Var.h();
                return;
            case 6:
                wn wnVar = (wn) this.d;
                if (!this.f1567b) {
                    Bitmap bitmap = wnVar.R8;
                    if (bitmap != null) {
                        wnVar.S8 = null;
                        wnVar.T8 = null;
                        bitmap.recycle();
                        wnVar.R8 = null;
                    }
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f1568c;
                    if (s1Var != null) {
                        s1Var.invalidate();
                    }
                    wnVar.Db(null);
                    wnVar.f45082c9 = null;
                    wnVar.f45163j1.invalidate();
                    wnVar.f45339x0.invalidate();
                    return;
                }
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.f1568c;
                v8 v8Var = ((oo) this.d).N;
                if (this.f1567b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                v8Var.setVisibility(i10);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((View) arrayList.get(i11)).setTranslationY(0.0f);
                }
                return;
            case 8:
                in0 in0Var = (in0) this.d;
                if (this.f1567b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                in0Var.f29394r = f11;
                in0Var.f29398y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                in0Var.f29398y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, in0Var.f29394r));
                in0Var.f29398y.setAlpha(in0Var.f29394r);
                in0Var.f29395s.invalidate();
                in0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.f1568c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f1568c;
                tVar2.setScaleX(1.0f);
                tVar2.setScaleY(1.0f);
                tVar2.setAlpha(1.0f);
                if (this.f1567b) {
                    tVar.f34209x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 10:
                x50 x50Var = (x50) this.d;
                r30 r30Var = x50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.f1568c;
                if (tVar3 != null) {
                    tVar3.f34187f = false;
                }
                x50Var.d.getNotificationCenter().onAnimationFinish(x50Var.f45506d3);
                x50Var.f45502c3 = false;
                boolean z10 = this.f1567b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                x50Var.f45505d2 = f12;
                x50Var.a2.f34022n = f12;
                if (!z10) {
                    x50Var.W2.setAlpha(0);
                    x50Var.b1();
                    if (x50Var.f45509e2.getParent() != null) {
                        viewGroup2 = ((k3) x50Var).containerView;
                        viewGroup2.removeView(x50Var.f45509e2);
                    }
                    x50Var.f45509e2 = null;
                    r30Var.setVisibility(8);
                    x50Var.f45514f2 = false;
                    x50Var.Y.X = true;
                    x50Var.f45496b2.setVisibility(8);
                    if (x50Var.f45565s0) {
                        x50Var.f45565s0 = false;
                        x50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = x50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.f34179a.setRoundCorners(0.0f);
                    }
                } else {
                    r30Var.setAlpha(1.0f);
                    r30Var.setScaleX(1.0f);
                    r30Var.setScaleY(1.0f);
                    r30Var.setTranslationX(0.0f);
                    r30Var.setTranslationY(0.0f);
                }
                x50Var.S0();
                viewGroup = ((k3) x50Var).containerView;
                viewGroup.invalidate();
                x50Var.f45493b.invalidate();
                x50Var.Q.invalidate();
                return;
            case 11:
                bx0 bx0Var = (bx0) this.f1568c;
                ig0 ig0Var = (ig0) this.d;
                if (ig0Var.J == 0 && this.f1567b) {
                    ig0Var.A1(true, true);
                }
                bx0Var.setVisibility(8);
                bx0Var.g();
                bx0Var.setX(0.0f);
                return;
            case 12:
                zv0 zv0Var = (zv0) this.d;
                if (this.f1567b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                zv0Var.f46391y = f13;
                zv0Var.f46379c.invalidate();
                zv0Var.d.invalidate();
                zv0Var.e();
                Runnable runnable3 = (Runnable) this.f1568c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                f41 f41Var = (f41) this.d;
                if (this.f1567b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f41Var.f39162s = f14;
                f41Var.f39153b.invalidate();
                f41Var.f39155c.invalidate();
                f41Var.e();
                TextView textView = f41Var.f39165y;
                if (textView != null) {
                    textView.setAlpha(f41Var.f39162s);
                }
                if (f41Var.S) {
                    f41Var.N.invalidate();
                }
                if (!f41Var.S && (d41Var = f41Var.N) != null && d41Var.getSeekBarWaveform() != null) {
                    qp0 seekBarWaveform = f41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = f41Var.f39162s;
                    org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.f31990n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.f1568c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 14:
                kd1 kd1Var = (kd1) this.d;
                if (this.f1567b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                kd1Var.f40751x = f15;
                kd1Var.f40740b.invalidate();
                kd1Var.f40742c.invalidate();
                kd1Var.e();
                Runnable runnable5 = (Runnable) this.f1568c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                u2 u2Var = (u2) this.d;
                bi.r rVar = u2Var.f48563c;
                if (this.f1567b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                u2Var.f48570y = f16;
                rVar.setAlpha(f16);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f48570y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f48570y));
                u2Var.f48562b.invalidate();
                Runnable runnable6 = (Runnable) this.f1568c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
        }
    }

    public l0(Object obj, boolean z10, Object obj2, int i10) {
        this.f1566a = i10;
        this.d = obj;
        this.f1567b = z10;
        this.f1568c = obj2;
    }

    public l0(o0 o0Var, Runnable runnable) {
        this.f1566a = 0;
        this.d = o0Var;
        this.f1568c = runnable;
    }

    public l0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.t0 t0Var, androidx.fragment.app.g gVar) {
        this.f1566a = 2;
        this.f1568c = viewGroup;
        this.f1567b = z10;
        this.d = gVar;
    }
}
