package bi;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.xn;
public final class b2 implements NotificationCenter.NotificationCenterDelegate, tf.a {
    public static final hw0 X = new hw0(new aa.a(25), new aa.a(26));
    public static final hw0 Y = new hw0(new aa.a(27), new aa.a(28));
    public static final b2 Z;
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
    public a3.d U;
    public di.j4 V;
    public boolean W;
    public float f2853a;
    public WindowManager f2854b;
    public WindowManager.LayoutParams f2855c;
    public z1 d;
    public y1 e;
    public di.j4 f2856f;
    public FrameLayout h;
    public org.telegram.ui.Components.z9 f2857n;
    public xn f2858r;
    public boolean f2859s;
    public t1 v;
    public int f2860w;
    public ScaleGestureDetector f2861x;
    public ji.d4 f2862y;

    static {
        ?? obj = new Object();
        obj.f2853a = 1.4f;
        obj.f2859s = true;
        obj.M = 1.0f;
        obj.U = new a3.d((Object) obj, 16);
        Z = obj;
    }

    public static void j() {
        Z.k(true);
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.f2854b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        rf.d dVar = this.L;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f2855c;
            int width = ((Rect) this.L.h.f13952a).width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f2855c;
            int height = ((Rect) this.L.h.f13952a).height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f2854b.addView(this.d, this.f2855c);
        this.d.invalidate();
        di.j4 j4Var = this.V;
        if (j4Var != null) {
            j4Var.b();
            this.V = null;
        }
        i();
    }

    @Override
    public final Bitmap c() {
        di.j4 j4Var = this.V;
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
        di.j4 j4Var = this.f2856f;
        if (j4Var != null && j4Var.a()) {
            return this.f2856f.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        di.j4 j4Var = new di.j4(this.f2856f.getContext(), this.f2860w);
        this.V = j4Var;
        return j4Var;
    }

    public final void i() {
        float dp;
        float f7;
        t1 t1Var = this.v;
        if (t1Var != null) {
            t1Var.v(1.0f);
            di.j4 j4Var = this.V;
            if (j4Var != null) {
                this.v.s(j4Var.getSink());
            } else {
                this.v.s(this.f2856f.getSink());
            }
        }
        if (this.f2859s) {
            this.f2858r.animate().cancel();
            ViewPropertyAnimator duration = this.f2858r.animate().alpha(0.0f).setDuration(150L);
            es esVar = es.f24771f;
            duration.setInterpolator(esVar).start();
            this.f2857n.animate().cancel();
            this.f2857n.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
            this.f2856f.animate().cancel();
            this.f2856f.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
            this.f2859s = false;
        }
        if (this.J == n() * this.M && this.K == m() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f2855c;
        int n10 = (int) (n() * this.M);
        this.J = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f2855c;
        int m10 = (int) (m() * this.M);
        this.K = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.f2854b, this.d, this.f2855c);
        o1.k kVar = this.P;
        float f10 = this.N;
        kVar.f16459b = f10;
        kVar.f16460c = true;
        o1.l lVar = kVar.f16468u;
        float B = a1.g.B(n(), this.M, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        if (B >= f11 / 2.0f) {
            dp = (f11 - (n() * this.M)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f16474i = dp;
        this.P.h();
        o1.k kVar2 = this.Q;
        kVar2.f16459b = this.O;
        kVar2.f16460c = true;
        kVar2.f16468u.f16474i = w7.s.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.h();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new ah.j(2), 100L);
            NotificationCenter.getInstance(this.f2860w).removeObserver(this, NotificationCenter.liveStoryUpdated);
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
            animatorSet.setInterpolator(es.f24771f);
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
            this.f2853a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
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
        duration.setInterpolator(es.f24771f);
        this.I.addUpdateListener(new ah.c0(this, 7));
        this.I.addListener(new ah.b(this, 6));
        this.I.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
