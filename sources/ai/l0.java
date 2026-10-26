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
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.a41;
import org.telegram.ui.c41;
import org.telegram.ui.gg0;
import org.telegram.ui.id1;
import org.telegram.ui.mo;
import org.telegram.ui.p30;
import org.telegram.ui.un;
import org.telegram.ui.v3;
import org.telegram.ui.v50;
import org.telegram.ui.xv0;
import sg.v2;
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
        a41 a41Var;
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
                v3Var.f44592x = f10;
                if (!v3Var.f44588n) {
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
                un unVar = (un) this.d;
                if (!this.f1567b) {
                    Bitmap bitmap = unVar.N8;
                    if (bitmap != null) {
                        unVar.O8 = null;
                        unVar.P8 = null;
                        bitmap.recycle();
                        unVar.N8 = null;
                    }
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f1568c;
                    if (s1Var != null) {
                        s1Var.invalidate();
                    }
                    unVar.zb(null);
                    unVar.Y8 = null;
                    unVar.f44295j1.invalidate();
                    unVar.f44471x0.invalidate();
                    return;
                }
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.f1568c;
                v8 v8Var = ((mo) this.d).N;
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
                hn0 hn0Var = (hn0) this.d;
                if (this.f1567b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                hn0Var.f29025r = f11;
                hn0Var.f29029y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                hn0Var.f29029y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, hn0Var.f29025r));
                hn0Var.f29029y.setAlpha(hn0Var.f29025r);
                hn0Var.f29026s.invalidate();
                hn0Var.v.invalidate();
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
                    tVar.f34104x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 10:
                v50 v50Var = (v50) this.d;
                p30 p30Var = v50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.f1568c;
                if (tVar3 != null) {
                    tVar3.f34082f = false;
                }
                v50Var.d.getNotificationCenter().onAnimationFinish(v50Var.f44625d3);
                v50Var.f44621c3 = false;
                boolean z10 = this.f1567b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                v50Var.f44624d2 = f12;
                v50Var.a2.f33917n = f12;
                if (!z10) {
                    v50Var.W2.setAlpha(0);
                    v50Var.b1();
                    if (v50Var.f44628e2.getParent() != null) {
                        viewGroup2 = ((k3) v50Var).containerView;
                        viewGroup2.removeView(v50Var.f44628e2);
                    }
                    v50Var.f44628e2 = null;
                    p30Var.setVisibility(8);
                    v50Var.f44633f2 = false;
                    v50Var.Y.X = true;
                    v50Var.f44615b2.setVisibility(8);
                    if (v50Var.f44684s0) {
                        v50Var.f44684s0 = false;
                        v50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = v50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.f34074a.setRoundCorners(0.0f);
                    }
                } else {
                    p30Var.setAlpha(1.0f);
                    p30Var.setScaleX(1.0f);
                    p30Var.setScaleY(1.0f);
                    p30Var.setTranslationX(0.0f);
                    p30Var.setTranslationY(0.0f);
                }
                v50Var.S0();
                viewGroup = ((k3) v50Var).containerView;
                viewGroup.invalidate();
                v50Var.f44612b.invalidate();
                v50Var.Q.invalidate();
                return;
            case 11:
                ax0 ax0Var = (ax0) this.f1568c;
                gg0 gg0Var = (gg0) this.d;
                if (gg0Var.J == 0 && this.f1567b) {
                    gg0Var.A1(true, true);
                }
                ax0Var.setVisibility(8);
                ax0Var.g();
                ax0Var.setX(0.0f);
                return;
            case 12:
                xv0 xv0Var = (xv0) this.d;
                if (this.f1567b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                xv0Var.f45887y = f13;
                xv0Var.f45875c.invalidate();
                xv0Var.d.invalidate();
                xv0Var.e();
                Runnable runnable3 = (Runnable) this.f1568c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                c41 c41Var = (c41) this.d;
                if (this.f1567b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                c41Var.f38260s = f14;
                c41Var.f38251b.invalidate();
                c41Var.f38253c.invalidate();
                c41Var.e();
                TextView textView = c41Var.f38263y;
                if (textView != null) {
                    textView.setAlpha(c41Var.f38260s);
                }
                if (c41Var.S) {
                    c41Var.N.invalidate();
                }
                if (!c41Var.S && (a41Var = c41Var.N) != null && a41Var.getSeekBarWaveform() != null) {
                    pp0 seekBarWaveform = c41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = c41Var.f38260s;
                    org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.f31685n;
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
                id1 id1Var = (id1) this.d;
                if (this.f1567b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                id1Var.f40228x = f15;
                id1Var.f40217b.invalidate();
                id1Var.f40219c.invalidate();
                id1Var.e();
                Runnable runnable5 = (Runnable) this.f1568c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                v2 v2Var = (v2) this.d;
                bi.r rVar = v2Var.f48538c;
                if (this.f1567b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                v2Var.f48545y = f16;
                rVar.setAlpha(f16);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f48545y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f48545y));
                v2Var.f48537b.invalidate();
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
