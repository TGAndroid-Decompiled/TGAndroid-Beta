package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class qw extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final Object c;
    public final Object d;

    public qw(Object obj, Object obj2, boolean z, byte b) {
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
        vm9 vm9Var;
        ou9 ou9Var;
        byte b = this.a;
        int i = 8;
        float f2 = 1.0f;
        float f3 = 0.0f;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                sw swVar = (sw) obj2;
                if (!this.b) {
                    f2 = 0.0f;
                }
                swVar.y = f2;
                if (!swVar.n) {
                    swVar.A();
                }
                swVar.s();
                b1 b1Var = (b1) obj;
                if (b1Var != null) {
                    b1Var.run();
                }
                swVar.r();
                return;
            case 1:
                mu1 mu1Var = (mu1) obj2;
                if (!this.b) {
                    Bitmap bitmap = mu1Var.R8;
                    if (bitmap != null) {
                        mu1Var.S8 = null;
                        mu1Var.T8 = null;
                        bitmap.recycle();
                        mu1Var.R8 = null;
                    }
                    gb2 gb2Var = (gb2) obj;
                    if (gb2Var != null) {
                        gb2Var.invalidate();
                    }
                    mu1Var.Cb(null);
                    mu1Var.c9 = null;
                    mu1Var.m1.invalidate();
                    mu1Var.A0.invalidate();
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                wgb wgbVar = ((p82) obj2).O;
                if (this.b) {
                    i = 0;
                }
                wgbVar.setVisibility(i);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((View) arrayList.get(i2)).setTranslationY(0.0f);
                }
                return;
            case 3:
                super.onAnimationEnd(animator);
                m43 m43Var = (m43) obj2;
                m43Var.E.remove((ValueAnimator) obj);
                m43Var.a(this.b);
                return;
            case 4:
                h75 h75Var = (h75) obj2;
                i55 i55Var = h75Var.s4;
                h85 h85Var = (h85) obj;
                if (h85Var != null) {
                    h85Var.f = false;
                }
                kk7.f(h75Var.n1.a).j(h75Var.S4);
                h75Var.R4 = false;
                boolean z = this.b;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                h75Var.W3 = f;
                h75Var.T3.n = f;
                if (!z) {
                    h75Var.L4.setAlpha(0);
                    h75Var.R0();
                    if (h75Var.X3.getParent() != null) {
                        h75Var.b.removeView(h75Var.X3);
                    }
                    h75Var.X3 = null;
                    i55Var.setVisibility(8);
                    h75Var.Y3 = false;
                    h75Var.R1.X = true;
                    h75Var.U3.setVisibility(8);
                    if (h75Var.l2) {
                        h75Var.l2 = false;
                        h75Var.D0(true);
                    }
                    h85 h85Var2 = h75Var.O4;
                    if (h85Var2 != null) {
                        h85Var2.a.setRoundCorners(0.0f);
                    }
                } else {
                    i55Var.setAlpha(1.0f);
                    i55Var.setScaleX(1.0f);
                    i55Var.setScaleY(1.0f);
                    i55Var.setTranslationX(0.0f);
                    i55Var.setTranslationY(0.0f);
                }
                h75Var.I0();
                h75Var.b.invalidate();
                h75Var.l1.invalidate();
                h75Var.J1.invalidate();
                return;
            case 5:
                h85 h85Var3 = (h85) obj2;
                h85 h85Var4 = (h85) obj;
                h85Var4.setScaleX(1.0f);
                h85Var4.setScaleY(1.0f);
                h85Var4.setAlpha(1.0f);
                if (this.b) {
                    h85Var3.y.removeView(h85Var4);
                    h85Var3.e();
                }
                h85Var4.setVisibility(8);
                return;
            case 6:
                jja jjaVar = (jja) obj;
                mf6 mf6Var = (mf6) obj2;
                if (!mf6Var.K && this.b) {
                    mf6Var.J1(true, true);
                }
                jjaVar.setVisibility(8);
                jjaVar.g();
                jjaVar.setX(0.0f);
                return;
            case 7:
                ve8 ve8Var = (ve8) obj2;
                if (!this.b) {
                    f2 = 0.0f;
                }
                ve8Var.E = f2;
                ve8Var.c.invalidate();
                ve8Var.d.invalidate();
                ve8Var.e();
                ne8 ne8Var = (ne8) obj;
                if (ne8Var != null) {
                    ne8Var.run();
                    return;
                }
                return;
            case 8:
                yv8 yv8Var = (yv8) obj2;
                if (yv8Var.U == animator) {
                    yv8Var.U = null;
                }
                if (!this.b) {
                    ((Runnable) obj).run();
                    return;
                }
                return;
            case 9:
                gw8 gw8Var = (gw8) obj2;
                gw8Var.k0();
                vw8 vw8Var = gw8Var.d;
                if (!this.b) {
                    f2 = 0.0f;
                }
                vw8Var.setReveal(f2);
                ((Runnable) obj).run();
                return;
            case 10:
                ((nn9) obj2).P.k0 = null;
                if (!this.b && (vm9Var = (vm9) obj) != null) {
                    vm9Var.run();
                    return;
                }
                return;
            case 11:
                tq9 tq9Var = (tq9) obj2;
                if (this.b) {
                    f3 = 1.0f;
                }
                tq9Var.r = f3;
                tq9Var.E.setScaleX(gl.R1(0.8f, 1.0f, f3));
                tq9Var.E.setScaleY(gl.R1(0.8f, 1.0f, tq9Var.r));
                tq9Var.E.setAlpha(tq9Var.r);
                tq9Var.s.invalidate();
                tq9Var.w.invalidate();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    gl.c3(runnable);
                    return;
                }
                return;
            case 12:
                qu9 qu9Var = (qu9) obj2;
                if (!this.b) {
                    f2 = 0.0f;
                }
                qu9Var.s = f2;
                qu9Var.b.invalidate();
                qu9Var.c.invalidate();
                qu9Var.e();
                TextView textView = qu9Var.E;
                if (textView != null) {
                    textView.setAlpha(qu9Var.s);
                }
                if (qu9Var.T) {
                    qu9Var.O.invalidate();
                }
                if (!qu9Var.T && (ou9Var = qu9Var.O) != null && ou9Var.getSeekBarWaveform() != null) {
                    dv9 seekBarWaveform = qu9Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = qu9Var.s;
                    gb2 gb2Var2 = seekBarWaveform.n;
                    if (gb2Var2 != null) {
                        gb2Var2.invalidate();
                    }
                }
                ku9 ku9Var = (ku9) obj;
                if (ku9Var != null) {
                    ku9Var.run();
                    return;
                }
                return;
            case 13:
                m4b m4bVar = (m4b) obj2;
                t1 t1Var = m4bVar.c;
                if (this.b) {
                    f3 = 1.0f;
                }
                m4bVar.E = f3;
                t1Var.setAlpha(f3);
                t1Var.setScaleX(gl.R1(0.9f, 1.0f, m4bVar.E));
                t1Var.setScaleY(gl.R1(0.9f, 1.0f, m4bVar.E));
                m4bVar.b.invalidate();
                i4b i4bVar = (i4b) obj;
                if (i4bVar != null) {
                    gl.c3(i4bVar);
                    return;
                }
                return;
            case 14:
                ((t7b) obj2).m0();
                if (!this.b) {
                    ((View) obj).setVisibility(8);
                    return;
                }
                return;
            default:
                jpb jpbVar = (jpb) obj2;
                if (!this.b) {
                    f2 = 0.0f;
                }
                jpbVar.y = f2;
                jpbVar.b.invalidate();
                jpbVar.c.invalidate();
                jpbVar.e();
                k08 k08Var = (k08) obj;
                if (k08Var != null) {
                    k08Var.run();
                    return;
                }
                return;
        }
    }

    public qw(FrameLayout frameLayout, Runnable runnable, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.c = runnable;
    }

    public qw(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = obj2;
    }
}
