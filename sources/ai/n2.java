package ai;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.lw0;
public final class n2 implements NotificationCenter.NotificationCenterDelegate, sf.a {
    public static final lw0 X = new lw0(new w1(1), new w1(2));
    public static final lw0 Y = new lw0(new w1(3), new w1(4));
    public static final n2 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public qf.e L;
    public float M;
    public float N;
    public float O;
    public o1.k P;
    public o1.k Q;
    public Float R;
    public boolean S;
    public boolean T;
    public a3.d U;
    public ci.j4 V;
    public boolean W;
    public float f1446a;
    public WindowManager f1447b;
    public WindowManager.LayoutParams f1448c;
    public k2 d;
    public j2 f1449e;
    public ci.j4 f1450f;
    public FrameLayout h;
    public org.telegram.ui.Components.y9 f1451n;
    public ao f1452r;
    public boolean f1453s;
    public d2 v;
    public int f1454w;
    public ScaleGestureDetector f1455x;
    public m.f3 f1456y;

    static {
        ?? obj = new Object();
        obj.f1446a = 1.4f;
        obj.f1453s = true;
        obj.M = 1.0f;
        obj.U = new a3.d((Object) obj, 5);
        Z = obj;
    }

    public static void j() {
        Z.k(true);
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.f1447b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        qf.e eVar = this.L;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f1448c;
            int width = this.L.h.f48258a.width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f1448c;
            int height = this.L.h.f48258a.height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f1447b.addView(this.d, this.f1448c);
        this.d.invalidate();
        ci.j4 j4Var = this.V;
        if (j4Var != null) {
            j4Var.b();
            this.V = null;
        }
        i();
    }

    @Override
    public final Bitmap c() {
        ci.j4 j4Var = this.V;
        if (j4Var != null && j4Var.a()) {
            return this.V.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i();
        }
    }

    @Override
    public final Bitmap e() {
        ci.j4 j4Var = this.f1450f;
        if (j4Var != null && j4Var.a()) {
            return this.f1450f.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        ci.j4 j4Var = new ci.j4(this.f1450f.getContext(), this.f1454w);
        this.V = j4Var;
        return j4Var;
    }

    public final void i() {
        float dp;
        float f7;
        d2 d2Var = this.v;
        if (d2Var != null) {
            d2Var.v(1.0f);
            ci.j4 j4Var = this.V;
            if (j4Var != null) {
                this.v.s(j4Var.getSink());
            } else {
                this.v.s(this.f1450f.getSink());
            }
        }
        if (this.f1453s) {
            this.f1452r.animate().cancel();
            ViewPropertyAnimator duration = this.f1452r.animate().alpha(0.0f).setDuration(150L);
            hs hsVar = hs.f27118f;
            duration.setInterpolator(hsVar).start();
            this.f1451n.animate().cancel();
            this.f1451n.animate().alpha(0.0f).setDuration(150L).setInterpolator(hsVar).start();
            this.f1450f.animate().cancel();
            this.f1450f.animate().alpha(1.0f).setDuration(150L).setInterpolator(hsVar).start();
            this.f1453s = false;
        }
        if (this.J == n() * this.M && this.K == m() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f1448c;
        int n10 = (int) (n() * this.M);
        this.J = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f1448c;
        int m10 = (int) (m() * this.M);
        this.K = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.f1447b, this.d, this.f1448c);
        o1.k kVar = this.P;
        float f10 = this.N;
        kVar.f16928b = f10;
        kVar.f16929c = true;
        o1.l lVar = kVar.f16938u;
        float B = a1.g.B(n(), this.M, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        if (B >= f11 / 2.0f) {
            dp = (f11 - (n() * this.M)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f16945i = dp;
        this.P.h();
        o1.k kVar2 = this.Q;
        kVar2.f16928b = this.O;
        kVar2.f16929c = true;
        kVar2.f16938u.f16945i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.h();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new f(1), 100L);
            NotificationCenter.getInstance(this.f1454w).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.T) {
                AndroidUtilities.cancelRunOnUIThread(this.U);
                this.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(hs.f27118f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new n(2, this, z10));
            animatorSet.start();
            qf.e eVar = this.L;
            if (eVar != null) {
                eVar.c();
                this.L = null;
            }
        }
    }

    public final float l() {
        if (this.R == null) {
            this.R = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.f1446a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.R.floatValue();
    }

    public final int m() {
        return (int) (l() * n());
    }

    public final int n() {
        float min;
        float f7;
        if (l() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    public final void o(boolean z10) {
        float f7;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(hs.f27118f);
        this.I.addUpdateListener(new a(this, 6));
        this.I.addListener(new b(this, 3));
        this.I.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
