package lh;

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
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t9;
public final class i1 implements NotificationCenter.NotificationCenterDelegate, cf.a {
    public static final av0 T = new av0(new k3.d(21), new k3.d(22));
    public static final av0 U = new av0(new k3.d(23), new k3.d(24));
    public static final i1 V;
    public boolean A;
    public boolean B;
    public View C;
    public boolean D;
    public ValueAnimator E;
    public int F;
    public int G;
    public af.g H;
    public float I;
    public float J;
    public float K;
    public o1.k L;
    public o1.k M;
    public Float N;
    public boolean O;
    public boolean P;
    public jh.o Q;
    public nh.y3 R;
    public boolean S;
    public float f15698a;
    public WindowManager f15699b;
    public WindowManager.LayoutParams f15700c;
    public h1 d;
    public bg.x2 f15701e;
    public nh.y3 f15702f;
    public FrameLayout h;
    public t9 f15703n;
    public fn f15704r;
    public boolean f15705s;
    public d1 v;
    public int f15706w;
    public ScaleGestureDetector f15707x;
    public o4.g f15708y;

    static {
        ?? obj = new Object();
        obj.f15698a = 1.4f;
        obj.f15705s = true;
        obj.I = 1.0f;
        obj.Q = new jh.o(obj, 24);
        V = obj;
    }

    public static void j() {
        V.k(true);
    }

    public static void o(Activity activity, d1 d1Var) {
        Context context;
        i1 i1Var = V;
        if (d1Var != null && !i1Var.O) {
            i1Var.O = true;
            i1Var.v = d1Var;
            int i10 = d1Var.f15456e;
            i1Var.f15706w = i10;
            NotificationCenter.getInstance(i10).addObserver(i1Var, NotificationCenter.liveStoryUpdated);
            i1Var.F = i1Var.n();
            i1Var.G = i1Var.m();
            i1Var.I = 1.0f;
            i1Var.D = false;
            o1.k kVar = new o1.k(i1Var, T);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f19045u = lVar;
            i1Var.L = kVar;
            o1.k kVar2 = new o1.k(i1Var, U);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f19045u = lVar2;
            i1Var.M = kVar2;
            if (activity != null) {
                context = activity;
            } else {
                context = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
            i1Var.f15707x = scaleGestureDetector;
            int i11 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i11 >= 23) {
                i1Var.f15707x.setStylusScaleEnabled(false);
            }
            i1Var.f15708y = new o4.g(context, new g1(scaledTouchSlop));
            bg.x2 x2Var = new bg.x2(context, 11);
            x2Var.f2608b = new Path();
            i1Var.f15701e = x2Var;
            ?? viewGroup = new ViewGroup(context);
            i1Var.d = viewGroup;
            viewGroup.addView(i1Var.f15701e, i7.f6.c(-1.0f, -1));
            i1Var.f15701e.setOutlineProvider(new eg.k1(4));
            i1Var.f15701e.setClipToOutline(true);
            i1Var.f15701e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126gg, false));
            t9 t9Var = new t9(context);
            i1Var.f15703n = t9Var;
            i1Var.f15701e.addView(t9Var, i7.f6.c(-1.0f, -1));
            nh.y3 y3Var = new nh.y3(context, i1Var.f15706w);
            i1Var.f15702f = y3Var;
            y3Var.setAlpha(0.0f);
            i1Var.f15701e.addView(i1Var.f15702f, i7.f6.c(-1.0f, -1));
            fn fnVar = new fn(context, 4);
            i1Var.f15704r = fnVar;
            i1Var.f15701e.addView(fnVar, i7.f6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(context);
            i1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            i1Var.h.addView(view, i7.f6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i12 = org.telegram.ui.ActionBar.g6.f23143hg;
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            int i13 = org.telegram.ui.ActionBar.g6.f23152i6;
            imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new bg.n(7));
            float f9 = 38;
            float f10 = 4;
            i1Var.h.addView(imageView, i7.f6.d(38, f9, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new ag.n(25, d1Var, context));
            i1Var.h.addView(imageView2, i7.f6.d(38, f9, 5, 0.0f, f10, 48, 0.0f));
            i1Var.f15701e.addView(i1Var.h, i7.f6.c(-1.0f, -1));
            i1Var.f15699b = (WindowManager) context.getSystemService("window");
            WindowManager.LayoutParams b10 = df.d.b(context, false);
            i1Var.f15700c = b10;
            int i14 = i1Var.F;
            b10.width = i14;
            b10.height = i1Var.G;
            float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
            i1Var.J = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = i1Var.f15700c;
            float dp3 = (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f);
            i1Var.K = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = i1Var.f15700c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            i1Var.d.setAlpha(0.0f);
            i1Var.d.setScaleX(0.1f);
            i1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(i1Var.f15699b, i1Var.d, i1Var.f15700c);
            i1Var.f15699b.addView(i1Var.d, i1Var.f15700c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(jr.f29800f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new kg.r(1));
            animatorSet.start();
            i1Var.i();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            af.g gVar = i1Var.H;
            if (gVar != null) {
                gVar.c();
                i1Var.H = null;
            }
            if (activity != null && df.d.a(activity) == 1) {
                af.f fVar = new af.f(activity, i1Var);
                fVar.f388c = "pip-live-story";
                fVar.f389e = 1;
                fVar.d = AndroidUtilities.dp(10.0f);
                fVar.f393j = i1Var.d;
                fVar.f394k = i1Var.f15702f.getPlaceholderView();
                i1Var.H = fVar.a();
            }
        }
    }

    @Override
    public final void a(c2.p pVar) {
        af.g gVar = this.H;
        if (gVar != null && gVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f15700c;
            int width = this.H.h.f5546a.width();
            this.F = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f15700c;
            int height = this.H.h.f5546a.height();
            this.G = height;
            layoutParams2.height = height;
        }
        this.S = false;
        this.f15699b.addView(this.d, this.f15700c);
        this.d.invalidate();
        nh.y3 y3Var = this.R;
        if (y3Var != null) {
            y3Var.b();
            this.R = null;
        }
        i();
    }

    @Override
    public final Bitmap b() {
        nh.y3 y3Var = this.R;
        if (y3Var != null && y3Var.a()) {
            return this.R.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        nh.y3 y3Var = this.f15702f;
        if (y3Var != null && y3Var.a()) {
            return this.f15702f.getBitmap();
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
        this.S = true;
        this.f15699b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        nh.y3 y3Var = new nh.y3(this.f15702f.getContext(), this.f15706w);
        this.R = y3Var;
        return y3Var;
    }

    public final void i() {
        float dp;
        float f9;
        d1 d1Var = this.v;
        if (d1Var != null) {
            d1Var.v(1.0f);
            nh.y3 y3Var = this.R;
            if (y3Var != null) {
                this.v.s(y3Var.getSink());
            } else {
                this.v.s(this.f15702f.getSink());
            }
        }
        if (this.f15705s) {
            this.f15704r.animate().cancel();
            ViewPropertyAnimator duration = this.f15704r.animate().alpha(0.0f).setDuration(150L);
            jr jrVar = jr.f29800f;
            duration.setInterpolator(jrVar).start();
            this.f15703n.animate().cancel();
            this.f15703n.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
            this.f15702f.animate().cancel();
            this.f15702f.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
            this.f15705s = false;
        }
        if (this.F == n() * this.I && this.G == m() * this.I) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f15700c;
        int n10 = (int) (n() * this.I);
        this.F = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f15700c;
        int m10 = (int) (m() * this.I);
        this.G = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.f15699b, this.d, this.f15700c);
        o1.k kVar = this.L;
        float f10 = this.J;
        kVar.f19036b = f10;
        kVar.f19037c = true;
        o1.l lVar = kVar.f19045u;
        float d = a4.w.d(n(), this.I, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        if (d >= f11 / 2.0f) {
            dp = (f11 - (n() * this.I)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f19052i = dp;
        this.L.f();
        o1.k kVar2 = this.M;
        kVar2.f19036b = this.K;
        kVar2.f19037c = true;
        kVar2.f19045u.f19052i = i7.w.a(f9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.I)) - AndroidUtilities.dp(16.0f));
        this.M.f();
    }

    public final void k(boolean z10) {
        if (this.O) {
            this.O = false;
            AndroidUtilities.runOnUIThread(new ag.o0(14), 100L);
            NotificationCenter.getInstance(this.f15706w).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.P) {
                AndroidUtilities.cancelRunOnUIThread(this.Q);
                this.P = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(jr.f29800f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new bg.z2(6, this, z10));
            animatorSet.start();
            af.g gVar = this.H;
            if (gVar != null) {
                gVar.c();
                this.H = null;
            }
        }
    }

    public final float l() {
        if (this.N == null) {
            this.N = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.f15698a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.N.floatValue();
    }

    public final int m() {
        return (int) (l() * n());
    }

    public final int n() {
        float min;
        float f9;
        if (l() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f9 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f9 = 0.6f;
        }
        return (int) (min * f9);
    }

    public final void p(boolean z10) {
        float f9;
        float f10 = 1.0f;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f9, f10).setDuration(200L);
        this.E = duration;
        duration.setInterpolator(jr.f29800f);
        this.E.addUpdateListener(new bg.q1(this, 25));
        this.E.addListener(new ag.m0(this, 17));
        this.E.start();
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
