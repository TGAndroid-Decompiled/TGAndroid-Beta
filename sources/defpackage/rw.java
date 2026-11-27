package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class rw extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final Object c;
    public final Object d;

    public rw(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 8:
                this.b = true;
                return;
            case 9:
            default:
                super.onAnimationCancel(animator);
                return;
            case 10:
                this.b = true;
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        lq9 lq9Var;
        jy9 jy9Var;
        byte b = this.a;
        int i = 8;
        float f2 = 1.0f;
        float f3 = 0.0f;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                tw twVar = (tw) obj2;
                if (!this.b) {
                    f2 = 0.0f;
                }
                twVar.y = f2;
                if (!twVar.n) {
                    twVar.A();
                }
                twVar.t();
                c1 c1Var = (c1) obj;
                if (c1Var != null) {
                    c1Var.run();
                }
                twVar.r();
                return;
            case 1:
                zu1 zu1Var = (zu1) obj2;
                if (!this.b) {
                    Bitmap bitmap = zu1Var.R8;
                    if (bitmap != null) {
                        zu1Var.S8 = null;
                        zu1Var.T8 = null;
                        bitmap.recycle();
                        zu1Var.R8 = null;
                    }
                    wb2 wb2Var = (wb2) obj;
                    if (wb2Var != null) {
                        wb2Var.invalidate();
                    }
                    zu1Var.Nb(null);
                    zu1Var.c9 = null;
                    zu1Var.m1.invalidate();
                    zu1Var.A0.invalidate();
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                skb skbVar = ((g92) obj2).O;
                if (this.b) {
                    i = 0;
                }
                skbVar.setVisibility(i);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((View) arrayList.get(i2)).setTranslationY(0.0f);
                }
                return;
            case 3:
                super.onAnimationEnd(animator);
                e53 e53Var = (e53) obj2;
                e53Var.E.remove((ValueAnimator) obj);
                e53Var.a(this.b);
                return;
            case 4:
                j95 j95Var = (j95) obj2;
                k75 k75Var = j95Var.s4;
                ka5 ka5Var = (ka5) obj;
                if (ka5Var != null) {
                    ka5Var.f = false;
                }
                jn7.f(j95Var.n1.a).j(j95Var.S4);
                j95Var.R4 = false;
                boolean z = this.b;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                j95Var.W3 = f;
                j95Var.T3.n = f;
                if (!z) {
                    j95Var.L4.setAlpha(0);
                    j95Var.S0();
                    if (j95Var.X3.getParent() != null) {
                        j95Var.b.removeView(j95Var.X3);
                    }
                    j95Var.X3 = null;
                    k75Var.setVisibility(8);
                    j95Var.Y3 = false;
                    j95Var.R1.X = true;
                    j95Var.U3.setVisibility(8);
                    if (j95Var.l2) {
                        j95Var.l2 = false;
                        j95Var.E0(true);
                    }
                    ka5 ka5Var2 = j95Var.O4;
                    if (ka5Var2 != null) {
                        ka5Var2.a.setRoundCorners(0.0f);
                    }
                } else {
                    k75Var.setAlpha(1.0f);
                    k75Var.setScaleX(1.0f);
                    k75Var.setScaleY(1.0f);
                    k75Var.setTranslationX(0.0f);
                    k75Var.setTranslationY(0.0f);
                }
                j95Var.J0();
                j95Var.b.invalidate();
                j95Var.l1.invalidate();
                j95Var.J1.invalidate();
                return;
            case 5:
                ka5 ka5Var3 = (ka5) obj2;
                ka5 ka5Var4 = (ka5) obj;
                ka5Var4.setScaleX(1.0f);
                ka5Var4.setScaleY(1.0f);
                ka5Var4.setAlpha(1.0f);
                if (this.b) {
                    ka5Var3.y.removeView(ka5Var4);
                    ka5Var3.e();
                }
                ka5Var4.setVisibility(8);
                return;
            case 6:
                cna cnaVar = (cna) obj;
                qh6 qh6Var = (qh6) obj2;
                if (!qh6Var.K && this.b) {
                    qh6Var.K1(true, true);
                }
                cnaVar.setVisibility(8);
                cnaVar.g();
                cnaVar.setX(0.0f);
                return;
            case 7:
                ji8 ji8Var = (ji8) obj2;
                if (!this.b) {
                    f2 = 0.0f;
                }
                ji8Var.E = f2;
                ji8Var.c.invalidate();
                ji8Var.d.invalidate();
                ji8Var.e();
                bi8 bi8Var = (bi8) obj;
                if (bi8Var != null) {
                    bi8Var.run();
                    return;
                }
                return;
            case 8:
                jz8 jz8Var = (jz8) obj2;
                if (jz8Var.U == animator) {
                    jz8Var.U = null;
                }
                if (!this.b) {
                    ((Runnable) obj).run();
                    return;
                }
                return;
            case 9:
                rz8 rz8Var = (rz8) obj2;
                rz8Var.k0();
                f09 f09Var = rz8Var.d;
                if (!this.b) {
                    f2 = 0.0f;
                }
                f09Var.setReveal(f2);
                ((Runnable) obj).run();
                return;
            case 10:
                ((dr9) obj2).P.k0 = null;
                if (!this.b && (lq9Var = (lq9) obj) != null) {
                    lq9Var.run();
                    return;
                }
                return;
            case 11:
                mu9 mu9Var = (mu9) obj2;
                if (this.b) {
                    f3 = 1.0f;
                }
                mu9Var.r = f3;
                mu9Var.E.setScaleX(hl.R1(0.8f, 1.0f, f3));
                mu9Var.E.setScaleY(hl.R1(0.8f, 1.0f, mu9Var.r));
                mu9Var.E.setAlpha(mu9Var.r);
                mu9Var.s.invalidate();
                mu9Var.w.invalidate();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    hl.c3(runnable);
                    return;
                }
                return;
            case 12:
                ky9 ky9Var = (ky9) obj2;
                if (!this.b) {
                    f2 = 0.0f;
                }
                ky9Var.s = f2;
                ky9Var.b.invalidate();
                ky9Var.c.invalidate();
                ky9Var.e();
                TextView textView = ky9Var.E;
                if (textView != null) {
                    textView.setAlpha(ky9Var.s);
                }
                if (ky9Var.T) {
                    ky9Var.O.invalidate();
                }
                if (!ky9Var.T && (jy9Var = ky9Var.O) != null && jy9Var.getSeekBarWaveform() != null) {
                    xy9 seekBarWaveform = ky9Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = ky9Var.s;
                    wb2 wb2Var2 = seekBarWaveform.n;
                    if (wb2Var2 != null) {
                        wb2Var2.invalidate();
                    }
                }
                fy9 fy9Var = (fy9) obj;
                if (fy9Var != null) {
                    fy9Var.run();
                    return;
                }
                return;
            case 13:
                k8b k8bVar = (k8b) obj2;
                u1 u1Var = k8bVar.c;
                if (this.b) {
                    f3 = 1.0f;
                }
                k8bVar.E = f3;
                u1Var.setAlpha(f3);
                u1Var.setScaleX(hl.R1(0.9f, 1.0f, k8bVar.E));
                u1Var.setScaleY(hl.R1(0.9f, 1.0f, k8bVar.E));
                k8bVar.b.invalidate();
                f8b f8bVar = (f8b) obj;
                if (f8bVar != null) {
                    hl.c3(f8bVar);
                    return;
                }
                return;
            case 14:
                ((rbb) obj2).m0();
                if (!this.b) {
                    ((View) obj).setVisibility(8);
                    return;
                }
                return;
            default:
                ktb ktbVar = (ktb) obj2;
                if (!this.b) {
                    f2 = 0.0f;
                }
                ktbVar.y = f2;
                ktbVar.b.invalidate();
                ktbVar.c.invalidate();
                ktbVar.e();
                q38 q38Var = (q38) obj;
                if (q38Var != null) {
                    q38Var.run();
                    return;
                }
                return;
        }
    }

    public rw(FrameLayout frameLayout, Runnable runnable, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.c = runnable;
    }

    public rw(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = obj2;
    }
}
