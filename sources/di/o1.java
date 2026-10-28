package di;

import a8.ee;
import a8.fg;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.vn;
public final class o1 implements NotificationCenter.NotificationCenterDelegate, uf.a {
    public static final qw0 X = new qw0(new c2.i(11), new c2.i(12));
    public static final qw0 Y = new qw0(new c2.i(13), new c2.i(14));
    public static final o1 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public sf.d L;
    public float M;
    public float N;
    public float O;
    public o1.j P;
    public o1.j Q;
    public Float R;
    public boolean S;
    public boolean T;
    public bi.u6 U;
    public fi.b4 V;
    public boolean W;
    public float f8856a;
    public WindowManager f8857b;
    public WindowManager.LayoutParams f8858c;
    public m1 d;
    public l1 e;
    public fi.b4 f8859f;
    public FrameLayout h;
    public org.telegram.ui.Components.y9 f8860n;
    public vn f8861r;
    public boolean f8862s;
    public h1 v;
    public int f8863w;
    public ScaleGestureDetector f8864x;
    public jg.s0 f8865y;

    static {
        ?? obj = new Object();
        obj.f8856a = 1.4f;
        obj.f8862s = true;
        obj.M = 1.0f;
        obj.U = new bi.u6((Object) obj, 16);
        Z = obj;
    }

    public static void j() {
        Z.k(true);
    }

    @Override
    public final void a(fg fgVar) {
        i();
        this.W = true;
        this.f8857b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(fg fgVar) {
        sf.d dVar = this.L;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f8858c;
            int width = ((Rect) this.L.h.f16246a).width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f8858c;
            int height = ((Rect) this.L.h.f16246a).height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f8857b.addView(this.d, this.f8858c);
        this.d.invalidate();
        fi.b4 b4Var = this.V;
        if (b4Var != null) {
            b4Var.b();
            this.V = null;
        }
        i();
    }

    @Override
    public final Bitmap c() {
        fi.b4 b4Var = this.V;
        if (b4Var != null && b4Var.a()) {
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
        fi.b4 b4Var = this.f8859f;
        if (b4Var != null && b4Var.a()) {
            return this.f8859f.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        fi.b4 b4Var = new fi.b4(this.f8859f.getContext(), this.f8863w);
        this.V = b4Var;
        return b4Var;
    }

    public final void i() {
        float dp;
        float f7;
        h1 h1Var = this.v;
        if (h1Var != null) {
            h1Var.v(1.0f);
            fi.b4 b4Var = this.V;
            if (b4Var != null) {
                this.v.s(b4Var.getSink());
            } else {
                this.v.s(this.f8859f.getSink());
            }
        }
        if (this.f8862s) {
            this.f8861r.animate().cancel();
            ViewPropertyAnimator duration = this.f8861r.animate().alpha(0.0f).setDuration(150L);
            ds dsVar = ds.f27530f;
            duration.setInterpolator(dsVar).start();
            this.f8860n.animate().cancel();
            this.f8860n.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
            this.f8859f.animate().cancel();
            this.f8859f.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
            this.f8862s = false;
        }
        if (this.J == n() * this.M && this.K == m() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f8858c;
        int n10 = (int) (n() * this.M);
        this.J = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f8858c;
        int m10 = (int) (m() * this.M);
        this.K = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.f8857b, this.d, this.f8858c);
        o1.j jVar = this.P;
        float f10 = this.N;
        jVar.f18960b = f10;
        jVar.f18961c = true;
        o1.k kVar = jVar.f18968u;
        float C = a1.g.C(n(), this.M, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        if (C >= f11 / 2.0f) {
            dp = (f11 - (n() * this.M)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f18974i = dp;
        this.P.h();
        o1.j jVar2 = this.Q;
        jVar2.f18960b = this.O;
        jVar2.f18961c = true;
        jVar2.f18968u.f18974i = ee.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.h();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new ag.c(8), 100L);
            NotificationCenter.getInstance(this.f8863w).removeObserver(this, NotificationCenter.liveStoryUpdated);
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
            animatorSet.setInterpolator(ds.f27530f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new bh.f0(3, this, z10));
            animatorSet.start();
            sf.d dVar = this.L;
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
            this.f8856a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
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
        duration.setInterpolator(ds.f27530f);
        this.I.addUpdateListener(new ai.g0(this, 16));
        this.I.addListener(new bh.b(this, 9));
        this.I.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
