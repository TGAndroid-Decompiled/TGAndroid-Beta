package ci;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.un;
public final class p1 implements NotificationCenter.NotificationCenterDelegate, tf.a {
    public static final ew0 X = new ew0(new i1(0), new i1(1));
    public static final ew0 Y = new ew0(new i1(2), new i1(3));
    public static final p1 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public rf.d L;
    public float M;
    public float N;
    public float O;
    public o1.k P;
    public o1.k Q;
    public Float R;
    public boolean S;
    public boolean T;
    public androidx.fragment.app.d U;
    public ei.d4 V;
    public boolean W;
    public float f5711a;
    public WindowManager f5712b;
    public WindowManager.LayoutParams f5713c;
    public n1 d;
    public m1 e;
    public ei.d4 f5714f;
    public FrameLayout h;
    public org.telegram.ui.Components.w9 f5715n;
    public un f5716r;
    public boolean f5717s;
    public h1 v;
    public int f5718w;
    public ScaleGestureDetector f5719x;
    public le.b f5720y;

    static {
        ?? obj = new Object();
        obj.f5711a = 1.4f;
        obj.f5717s = true;
        obj.M = 1.0f;
        obj.U = new androidx.fragment.app.d((Object) obj, 9);
        Z = obj;
    }

    public static void j() {
        Z.k(true);
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.f5712b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        rf.d dVar = this.L;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f5713c;
            int width = ((Rect) this.L.h.f14764a).width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f5713c;
            int height = ((Rect) this.L.h.f14764a).height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f5712b.addView(this.d, this.f5713c);
        this.d.invalidate();
        ei.d4 d4Var = this.V;
        if (d4Var != null) {
            d4Var.b();
            this.V = null;
        }
        i();
    }

    @Override
    public final Bitmap c() {
        ei.d4 d4Var = this.V;
        if (d4Var != null && d4Var.a()) {
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
        ei.d4 d4Var = this.f5714f;
        if (d4Var != null && d4Var.a()) {
            return this.f5714f.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        ei.d4 d4Var = new ei.d4(this.f5714f.getContext(), this.f5718w);
        this.V = d4Var;
        return d4Var;
    }

    public final void i() {
        float dp;
        float f7;
        h1 h1Var = this.v;
        if (h1Var != null) {
            h1Var.v(1.0f);
            ei.d4 d4Var = this.V;
            if (d4Var != null) {
                this.v.s(d4Var.getSink());
            } else {
                this.v.s(this.f5714f.getSink());
            }
        }
        if (this.f5717s) {
            this.f5716r.animate().cancel();
            ViewPropertyAnimator duration = this.f5716r.animate().alpha(0.0f).setDuration(150L);
            bs bsVar = bs.f25024f;
            duration.setInterpolator(bsVar).start();
            this.f5715n.animate().cancel();
            this.f5715n.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
            this.f5714f.animate().cancel();
            this.f5714f.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
            this.f5717s = false;
        }
        if (this.J == n() * this.M && this.K == m() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f5713c;
        int n10 = (int) (n() * this.M);
        this.J = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f5713c;
        int m10 = (int) (m() * this.M);
        this.K = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.f5712b, this.d, this.f5713c);
        o1.k kVar = this.P;
        float f10 = this.N;
        kVar.f17550b = f10;
        kVar.f17551c = true;
        o1.l lVar = kVar.f17559u;
        float B = a1.g.B(n(), this.M, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        if (B >= f11 / 2.0f) {
            dp = (f11 - (n() * this.M)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f17565i = dp;
        this.P.h();
        o1.k kVar2 = this.Q;
        kVar2.f17550b = this.O;
        kVar2.f17551c = true;
        kVar2.f17559u.f17565i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.h();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new ah.j(6), 100L);
            NotificationCenter.getInstance(this.f5718w).removeObserver(this, NotificationCenter.liveStoryUpdated);
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
            animatorSet.setInterpolator(bs.f25024f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ah.p0(3, this, z10));
            animatorSet.start();
            rf.d dVar = this.L;
            if (dVar != null) {
                dVar.c();
                this.L = null;
            }
        }
    }

    public final float l() {
        if (this.R == null) {
            this.R = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.f5711a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
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
        duration.setInterpolator(bs.f25024f);
        this.I.addUpdateListener(new ah.c0(this, 14));
        this.I.addListener(new ah.b(this, 8));
        this.I.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
