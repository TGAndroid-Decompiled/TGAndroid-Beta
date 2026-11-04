package ei;

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
import b8.be;
import b8.cg;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y00;
public final class n1 implements cs, wf.a {
    public static final kt0 Y = new kt0(new d2.t1(15), new d2.t1(16));
    public static final kt0 Z = new kt0(new d2.t1(17), new d2.t1(18));
    public static final n1 f10647a0;
    public y00 E;
    public boolean F;
    public boolean G;
    public View H;
    public boolean I;
    public ValueAnimator J;
    public int K;
    public int L;
    public uf.d M;
    public float N;
    public float O;
    public float P;
    public q1.g Q;
    public q1.g R;
    public Float S;
    public boolean T;
    public boolean U;
    public ci.d1 V;
    public gi.r3 W;
    public boolean X;
    public float f10648a;
    public WindowManager f10649b;
    public WindowManager.LayoutParams f10650c;
    public l1 d;
    public k1 f10651e;
    public gi.r3 f10652f;
    public FrameLayout h;
    public org.telegram.ui.Components.k9 f10653n;
    public sm f10654r;
    public boolean f10655s;
    public g1 f10656w;
    public int f10657x;
    public ScaleGestureDetector f10658y;

    static {
        ?? obj = new Object();
        obj.f10648a = 1.4f;
        obj.f10655s = true;
        obj.N = 1.0f;
        obj.V = new ci.d1(obj, 23);
        f10647a0 = obj;
    }

    public static void b() {
        f10647a0.d(true);
    }

    public final void a() {
        Point point;
        float L;
        float f10;
        g1 g1Var = this.f10656w;
        if (g1Var != null) {
            g1Var.v(1.0f);
            gi.r3 r3Var = this.W;
            if (r3Var != null) {
                this.f10656w.s(r3Var.getSink());
            } else {
                this.f10656w.s(this.f10652f.getSink());
            }
        }
        if (this.f10655s) {
            this.f10654r.animate().cancel();
            ViewPropertyAnimator duration = this.f10654r.animate().alpha(0.0f).setDuration(150L);
            xq xqVar = xq.f40452f;
            duration.setInterpolator(xqVar).start();
            this.f10653n.animate().cancel();
            this.f10653n.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
            this.f10652f.animate().cancel();
            this.f10652f.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
            this.f10655s = false;
        }
        if (this.K == h() * this.N && this.L == f() * this.N) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f10650c;
        int h = (int) (h() * this.N);
        this.K = h;
        layoutParams.width = h;
        WindowManager.LayoutParams layoutParams2 = this.f10650c;
        int f11 = (int) (f() * this.N);
        this.L = f11;
        layoutParams2.height = f11;
        org.telegram.messenger.g0.T3(this.f10649b, this.d, this.f10650c);
        q1.g gVar = this.Q;
        float f12 = this.O;
        gVar.f53644b = f12;
        gVar.f53645c = true;
        q1.h hVar = gVar.f53653m;
        float e10 = a1.g.e(h(), this.N, 2.0f, f12);
        float f13 = org.telegram.messenger.g0.f22608q.x;
        if (e10 >= f13 / 2.0f) {
            L = (f13 - (h() * this.N)) - org.telegram.messenger.g0.L(16.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        hVar.f53661i = L;
        this.Q.h();
        q1.g gVar2 = this.R;
        gVar2.f53644b = this.P;
        gVar2.f53645c = true;
        gVar2.f53653m.f53661i = be.a(f10, org.telegram.messenger.g0.L(16.0f), (point.y - (f() * this.N)) - org.telegram.messenger.g0.L(16.0f));
        this.R.h();
    }

    @Override
    public final void c(cg cgVar) {
        a();
        this.X = true;
        this.f10649b.removeView(this.d);
        this.d.invalidate();
    }

    public final void d(boolean z10) {
        if (this.T) {
            this.T = false;
            org.telegram.messenger.g0.i3(new ai.y1(9), 100L);
            hs.f(this.f10657x).n(this, hs.G2);
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.U) {
                org.telegram.messenger.g0.r(this.V);
                this.U = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(xq.f40452f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new dh.x(3, this, z10));
            animatorSet.start();
            uf.d dVar = this.M;
            if (dVar != null) {
                dVar.c();
                this.M = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.D2) {
            b();
        } else if (i3 == hs.f23328w2) {
            a();
        }
    }

    public final float e() {
        if (this.S == null) {
            this.S = Float.valueOf(1.7777778f);
            Point point = org.telegram.messenger.g0.f22608q;
            this.f10648a = (Math.min(point.x, point.y) - org.telegram.messenger.g0.L(32.0f)) / h();
        }
        return this.S.floatValue();
    }

    public final int f() {
        return (int) (e() * h());
    }

    @Override
    public final Bitmap g() {
        gi.r3 r3Var = this.W;
        if (r3Var != null && r3Var.a()) {
            return this.W.getBitmap();
        }
        return null;
    }

    public final int h() {
        float min;
        float f10;
        if (e() >= 1.0f) {
            Point point = org.telegram.messenger.g0.f22608q;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.g0.f22608q;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public final void j(boolean z10) {
        float f10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.J = duration;
        duration.setInterpolator(xq.f40452f);
        this.J.addUpdateListener(new bh.f(this, 17));
        this.J.addListener(new ai.e1(this, 10));
        this.J.start();
    }

    @Override
    public final Bitmap l() {
        gi.r3 r3Var = this.f10652f;
        if (r3Var != null && r3Var.a()) {
            return this.f10652f.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final View q() {
        gi.r3 r3Var = new gi.r3(this.f10652f.getContext(), this.f10657x);
        this.W = r3Var;
        return r3Var;
    }

    @Override
    public final void r(cg cgVar) {
        uf.d dVar = this.M;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f10650c;
            int width = ((Rect) this.M.h.f18942a).width();
            this.K = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f10650c;
            int height = ((Rect) this.M.h.f18942a).height();
            this.L = height;
            layoutParams2.height = height;
        }
        this.X = false;
        this.f10649b.addView(this.d, this.f10650c);
        this.d.invalidate();
        gi.r3 r3Var = this.W;
        if (r3Var != null) {
            r3Var.b();
            this.W = null;
        }
        a();
    }

    @Override
    public final void i(Canvas canvas) {
    }

    @Override
    public final void m(Canvas canvas) {
    }
}
