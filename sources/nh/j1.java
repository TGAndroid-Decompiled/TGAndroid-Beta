package nh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.nr;
public final class j1 implements NotificationCenter.NotificationCenterDelegate, ef.a {
    public static final iv0 U = new iv0(new m.j0(3), new m.j0(4));
    public static final iv0 V = new iv0(new m.j0(5), new m.j0(6));
    public static final j1 W;
    public boolean B;
    public boolean C;
    public View D;
    public boolean E;
    public ValueAnimator F;
    public int G;
    public int H;
    public cf.f I;
    public float J;
    public float K;
    public float L;
    public o1.j M;
    public o1.j N;
    public Float O;
    public boolean P;
    public boolean Q;
    public lh.b R;
    public ph.k3 S;
    public boolean T;
    public float f15502a;
    public WindowManager f15503b;
    public WindowManager.LayoutParams f15504c;
    public i1 d;
    public dg.u2 e;
    public ph.k3 f15505f;
    public FrameLayout h;
    public org.telegram.ui.Components.p9 f15506n;
    public hn f15507r;
    public boolean f15508s;
    public e1 v;
    public int f15509w;
    public ScaleGestureDetector f15510x;
    public org.telegram.ui.Cells.f1 f15511y;

    static {
        ?? obj = new Object();
        obj.f15502a = 1.4f;
        obj.f15508s = true;
        obj.J = 1.0f;
        obj.R = new lh.b(obj, 24);
        W = obj;
    }

    public static void j() {
        W.k(true);
    }

    public static void o(Activity activity, e1 e1Var) {
        Context context;
        j1 j1Var = W;
        if (e1Var != null && !j1Var.P) {
            j1Var.P = true;
            j1Var.v = e1Var;
            int i10 = e1Var.e;
            j1Var.f15509w = i10;
            NotificationCenter.getInstance(i10).addObserver(j1Var, NotificationCenter.liveStoryUpdated);
            j1Var.G = j1Var.n();
            j1Var.H = j1Var.m();
            j1Var.J = 1.0f;
            j1Var.E = false;
            o1.j jVar = new o1.j(j1Var, U);
            o1.k kVar = new o1.k();
            kVar.a(0.75f);
            kVar.b(650.0f);
            jVar.f16198u = kVar;
            j1Var.M = jVar;
            o1.j jVar2 = new o1.j(j1Var, V);
            o1.k kVar2 = new o1.k();
            kVar2.a(0.75f);
            kVar2.b(650.0f);
            jVar2.f16198u = kVar2;
            j1Var.N = jVar2;
            if (activity != null) {
                context = activity;
            } else {
                context = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
            j1Var.f15510x = scaleGestureDetector;
            int i11 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i11 >= 23) {
                j1Var.f15510x.setStylusScaleEnabled(false);
            }
            j1Var.f15511y = new org.telegram.ui.Cells.f1(context, new h1(scaledTouchSlop));
            dg.u2 u2Var = new dg.u2(context, 11);
            u2Var.f4811b = new Path();
            j1Var.e = u2Var;
            ?? viewGroup = new ViewGroup(context);
            j1Var.d = viewGroup;
            viewGroup.addView(j1Var.e, k7.b6.c(-1.0f, -1));
            j1Var.e.setOutlineProvider(new gg.j1(4));
            j1Var.e.setClipToOutline(true);
            j1Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19970gg, false));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            j1Var.f15506n = p9Var;
            j1Var.e.addView(p9Var, k7.b6.c(-1.0f, -1));
            ph.k3 k3Var = new ph.k3(context, j1Var.f15509w);
            j1Var.f15505f = k3Var;
            k3Var.setAlpha(0.0f);
            j1Var.e.addView(j1Var.f15505f, k7.b6.c(-1.0f, -1));
            hn hnVar = new hn(context, 4);
            j1Var.f15507r = hnVar;
            j1Var.e.addView(hnVar, k7.b6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(context);
            j1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            j1Var.h.addView(view, k7.b6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i12 = org.telegram.ui.ActionBar.j6.f19987hg;
            imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            int i13 = org.telegram.ui.ActionBar.j6.f19996i6;
            imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new dg.m(7));
            float f10 = 38;
            float f11 = 4;
            j1Var.h.addView(imageView, k7.b6.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new cg.n(25, e1Var, context));
            j1Var.h.addView(imageView2, k7.b6.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
            j1Var.e.addView(j1Var.h, k7.b6.c(-1.0f, -1));
            j1Var.f15503b = (WindowManager) context.getSystemService("window");
            WindowManager.LayoutParams b10 = ff.d.b(context, false);
            j1Var.f15504c = b10;
            int i14 = j1Var.G;
            b10.width = i14;
            b10.height = j1Var.H;
            float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
            j1Var.K = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = j1Var.f15504c;
            float dp3 = (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f);
            j1Var.L = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = j1Var.f15504c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            j1Var.d.setAlpha(0.0f);
            j1Var.d.setScaleX(0.1f);
            j1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(j1Var.f15503b, j1Var.d, j1Var.f15504c);
            j1Var.f15503b.addView(j1Var.d, j1Var.f15504c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(nr.f27346f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(j1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new mg.r(1));
            animatorSet.start();
            j1Var.i();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            cf.f fVar = j1Var.I;
            if (fVar != null) {
                fVar.c();
                j1Var.I = null;
            }
            if (activity != null && ff.d.a(activity) == 1) {
                cf.e eVar = new cf.e(activity, j1Var);
                eVar.f2287c = "pip-live-story";
                eVar.e = 1;
                eVar.d = AndroidUtilities.dp(10.0f);
                eVar.f2291j = j1Var.d;
                eVar.f2292k = j1Var.f15505f.getPlaceholderView();
                j1Var.I = eVar.a();
            }
        }
    }

    @Override
    public final void a(c2.p pVar) {
        cf.f fVar = this.I;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f15504c;
            int width = this.I.h.f6114a.width();
            this.G = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f15504c;
            int height = this.I.h.f6114a.height();
            this.H = height;
            layoutParams2.height = height;
        }
        this.T = false;
        this.f15503b.addView(this.d, this.f15504c);
        this.d.invalidate();
        ph.k3 k3Var = this.S;
        if (k3Var != null) {
            k3Var.b();
            this.S = null;
        }
        i();
    }

    @Override
    public final Bitmap b() {
        ph.k3 k3Var = this.S;
        if (k3Var != null && k3Var.a()) {
            return this.S.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        ph.k3 k3Var = this.f15505f;
        if (k3Var != null && k3Var.a()) {
            return this.f15505f.getBitmap();
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
    public final void e(c2.p pVar) {
        i();
        this.T = true;
        this.f15503b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        ph.k3 k3Var = new ph.k3(this.f15505f.getContext(), this.f15509w);
        this.S = k3Var;
        return k3Var;
    }

    public final void i() {
        float dp;
        float f10;
        e1 e1Var = this.v;
        if (e1Var != null) {
            e1Var.v(1.0f);
            ph.k3 k3Var = this.S;
            if (k3Var != null) {
                this.v.s(k3Var.getSink());
            } else {
                this.v.s(this.f15505f.getSink());
            }
        }
        if (this.f15508s) {
            this.f15507r.animate().cancel();
            ViewPropertyAnimator duration = this.f15507r.animate().alpha(0.0f).setDuration(150L);
            nr nrVar = nr.f27346f;
            duration.setInterpolator(nrVar).start();
            this.f15506n.animate().cancel();
            this.f15506n.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
            this.f15505f.animate().cancel();
            this.f15505f.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
            this.f15508s = false;
        }
        if (this.G == n() * this.J && this.H == m() * this.J) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f15504c;
        int n10 = (int) (n() * this.J);
        this.G = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f15504c;
        int m9 = (int) (m() * this.J);
        this.H = m9;
        layoutParams2.height = m9;
        AndroidUtilities.updateViewLayout(this.f15503b, this.d, this.f15504c);
        o1.j jVar = this.M;
        float f11 = this.K;
        jVar.f16190b = f11;
        jVar.f16191c = true;
        o1.k kVar = jVar.f16198u;
        float d = android.support.v4.media.a.d(n(), this.J, 2.0f, f11);
        float f12 = AndroidUtilities.displaySize.x;
        if (d >= f12 / 2.0f) {
            dp = (f12 - (n() * this.J)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f16204i = dp;
        this.M.f();
        o1.j jVar2 = this.N;
        jVar2.f16190b = this.L;
        jVar2.f16191c = true;
        jVar2.f16198u.f16204i = k7.n.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.J)) - AndroidUtilities.dp(16.0f));
        this.N.f();
    }

    public final void k(boolean z4) {
        if (this.P) {
            this.P = false;
            AndroidUtilities.runOnUIThread(new cg.n0(14), 100L);
            NotificationCenter.getInstance(this.f15509w).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.Q) {
                AndroidUtilities.cancelRunOnUIThread(this.R);
                this.Q = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(nr.f27346f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new dg.w2(6, this, z4));
            animatorSet.start();
            cf.f fVar = this.I;
            if (fVar != null) {
                fVar.c();
                this.I = null;
            }
        }
    }

    public final float l() {
        if (this.O == null) {
            this.O = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.f15502a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.O.floatValue();
    }

    public final int m() {
        return (int) (l() * n());
    }

    public final int n() {
        float min;
        float f10;
        if (l() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public final void p(boolean z4) {
        float f10;
        float f11 = 1.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.F = duration;
        duration.setInterpolator(nr.f27346f);
        this.F.addUpdateListener(new dg.o1(this, 25));
        this.F.addListener(new cg.l0(this, 18));
        this.F.start();
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
