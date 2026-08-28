package ih;

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
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pu0;
public final class k1 implements NotificationCenter.NotificationCenterDelegate, ze.a {
    public static final pu0 T = new pu0(new i3.i(2), new i3.i(3));
    public static final pu0 U = new pu0(new i3.i(4), new i3.i(5));
    public static final k1 V;
    public boolean A;
    public boolean B;
    public View C;
    public boolean D;
    public ValueAnimator E;
    public int F;
    public int G;
    public xe.d H;
    public float I;
    public float J;
    public float K;
    public o1.j L;
    public o1.j M;
    public Float N;
    public boolean O;
    public boolean P;
    public g Q;
    public kh.d4 R;
    public boolean S;
    public float f11656a;
    public WindowManager f11657b;
    public WindowManager.LayoutParams f11658c;
    public j1 d;
    public fh.d2 f11659e;
    public kh.d4 f11660f;
    public FrameLayout h;
    public org.telegram.ui.Components.o9 f11661n;
    public an f11662r;
    public boolean f11663s;
    public f1 v;
    public int f11664w;
    public ScaleGestureDetector f11665x;
    public m5.c0 f11666y;

    static {
        ?? obj = new Object();
        obj.f11656a = 1.4f;
        obj.f11663s = true;
        obj.I = 1.0f;
        obj.Q = new g(obj, 3);
        V = obj;
    }

    public static void j() {
        V.k(true);
    }

    public static void o(Activity activity, f1 f1Var) {
        Context context;
        k1 k1Var = V;
        if (f1Var != null && !k1Var.O) {
            k1Var.O = true;
            k1Var.v = f1Var;
            int i9 = f1Var.f11401e;
            k1Var.f11664w = i9;
            NotificationCenter.getInstance(i9).addObserver(k1Var, NotificationCenter.liveStoryUpdated);
            k1Var.F = k1Var.n();
            k1Var.G = k1Var.m();
            k1Var.I = 1.0f;
            k1Var.D = false;
            o1.j jVar = new o1.j(k1Var, T);
            o1.k kVar = new o1.k();
            kVar.a(0.75f);
            kVar.b(650.0f);
            jVar.f18800u = kVar;
            k1Var.L = jVar;
            o1.j jVar2 = new o1.j(k1Var, U);
            o1.k kVar2 = new o1.k();
            kVar2.a(0.75f);
            kVar2.b(650.0f);
            jVar2.f18800u = kVar2;
            k1Var.M = jVar2;
            if (activity != null) {
                context = activity;
            } else {
                context = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
            k1Var.f11665x = scaleGestureDetector;
            int i10 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i10 >= 23) {
                k1Var.f11665x.setStylusScaleEnabled(false);
            }
            k1Var.f11666y = new m5.c0(context, new i1(scaledTouchSlop));
            fh.d2 d2Var = new fh.d2(context, 5);
            d2Var.f6412b = new Path();
            k1Var.f11659e = d2Var;
            ?? viewGroup = new ViewGroup(context);
            k1Var.d = viewGroup;
            viewGroup.addView(k1Var.f11659e, g7.e6.c(-1.0f, -1));
            k1Var.f11659e.setOutlineProvider(new bg.q1(4));
            k1Var.f11659e.setClipToOutline(true);
            k1Var.f11659e.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23065gg, false));
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            k1Var.f11661n = o9Var;
            k1Var.f11659e.addView(o9Var, g7.e6.c(-1.0f, -1));
            kh.d4 d4Var = new kh.d4(context, k1Var.f11664w);
            k1Var.f11660f = d4Var;
            d4Var.setAlpha(0.0f);
            k1Var.f11659e.addView(k1Var.f11660f, g7.e6.c(-1.0f, -1));
            an anVar = new an(context, 2);
            k1Var.f11662r = anVar;
            k1Var.f11659e.addView(anVar, g7.e6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(context);
            k1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            k1Var.h.addView(view, g7.e6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = org.telegram.ui.ActionBar.f6.f23083hg;
            imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            int i12 = org.telegram.ui.ActionBar.f6.f23092i6;
            imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new fh.n(5));
            float f10 = 38;
            float f11 = 4;
            k1Var.h.addView(imageView, g7.e6.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new bg.u1(21, f1Var, context));
            k1Var.h.addView(imageView2, g7.e6.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
            k1Var.f11659e.addView(k1Var.h, g7.e6.c(-1.0f, -1));
            k1Var.f11657b = (WindowManager) context.getSystemService("window");
            WindowManager.LayoutParams b10 = af.d.b(context, false);
            k1Var.f11658c = b10;
            int i13 = k1Var.F;
            b10.width = i13;
            b10.height = k1Var.G;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            k1Var.J = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = k1Var.f11658c;
            float dp3 = (AndroidUtilities.displaySize.y - k1Var.G) - AndroidUtilities.dp(16.0f);
            k1Var.K = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = k1Var.f11658c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            k1Var.d.setAlpha(0.0f);
            k1Var.d.setScaleX(0.1f);
            k1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(k1Var.f11657b, k1Var.d, k1Var.f11658c);
            k1Var.f11657b.addView(k1Var.d, k1Var.f11658c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f28844f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(k1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new hg.r(1));
            animatorSet.start();
            k1Var.i();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            xe.d dVar = k1Var.H;
            if (dVar != null) {
                dVar.c();
                k1Var.H = null;
            }
            if (activity != null && af.d.a(activity) == 1) {
                xe.c cVar = new xe.c(activity, k1Var);
                cVar.f49135c = "pip-live-story";
                cVar.f49136e = 1;
                cVar.d = AndroidUtilities.dp(10.0f);
                cVar.f49140j = k1Var.d;
                cVar.f49141k = k1Var.f11660f.getPlaceholderView();
                k1Var.H = cVar.a();
            }
        }
    }

    @Override
    public final Bitmap a() {
        kh.d4 d4Var = this.R;
        if (d4Var != null && d4Var.a()) {
            return this.R.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap c() {
        kh.d4 d4Var = this.f11660f;
        if (d4Var != null && d4Var.a()) {
            return this.f11660f.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didEndCall) {
            j();
        } else if (i9 == NotificationCenter.groupCallUpdated) {
            i();
        }
    }

    @Override
    public final void e(af.f fVar) {
        xe.d dVar = this.H;
        if (dVar != null && dVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f11658c;
            int width = this.H.h.f153a.width();
            this.F = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f11658c;
            int height = this.H.h.f153a.height();
            this.G = height;
            layoutParams2.height = height;
        }
        this.S = false;
        this.f11657b.addView(this.d, this.f11658c);
        this.d.invalidate();
        kh.d4 d4Var = this.R;
        if (d4Var != null) {
            d4Var.b();
            this.R = null;
        }
        i();
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g(af.f fVar) {
        i();
        this.S = true;
        this.f11657b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final View h() {
        kh.d4 d4Var = new kh.d4(this.f11660f.getContext(), this.f11664w);
        this.R = d4Var;
        return d4Var;
    }

    public final void i() {
        float dp;
        float f10;
        f1 f1Var = this.v;
        if (f1Var != null) {
            f1Var.v(1.0f);
            kh.d4 d4Var = this.R;
            if (d4Var != null) {
                this.v.s(d4Var.getSink());
            } else {
                this.v.s(this.f11660f.getSink());
            }
        }
        if (this.f11663s) {
            this.f11662r.animate().cancel();
            ViewPropertyAnimator duration = this.f11662r.animate().alpha(0.0f).setDuration(150L);
            gr grVar = gr.f28844f;
            duration.setInterpolator(grVar).start();
            this.f11661n.animate().cancel();
            this.f11661n.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f11660f.animate().cancel();
            this.f11660f.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f11663s = false;
        }
        if (this.F == n() * this.I && this.G == m() * this.I) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f11658c;
        int n10 = (int) (n() * this.I);
        this.F = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f11658c;
        int m10 = (int) (m() * this.I);
        this.G = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.f11657b, this.d, this.f11658c);
        o1.j jVar = this.L;
        float f11 = this.J;
        jVar.f18791b = f11;
        jVar.f18792c = true;
        o1.k kVar = jVar.f18800u;
        float d = aa.d.d(n(), this.I, 2.0f, f11);
        float f12 = AndroidUtilities.displaySize.x;
        if (d >= f12 / 2.0f) {
            dp = (f12 - (n() * this.I)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f18807i = dp;
        this.L.f();
        o1.j jVar2 = this.M;
        jVar2.f18791b = this.K;
        jVar2.f18792c = true;
        jVar2.f18800u.f18807i = g7.n.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.I)) - AndroidUtilities.dp(16.0f));
        this.M.f();
    }

    public final void k(boolean z10) {
        if (this.O) {
            this.O = false;
            AndroidUtilities.runOnUIThread(new bg.d2(9), 100L);
            NotificationCenter.getInstance(this.f11664w).removeObserver(this, NotificationCenter.liveStoryUpdated);
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
            animatorSet.setInterpolator(gr.f28844f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new hg.b0(3, this, z10));
            animatorSet.start();
            xe.d dVar = this.H;
            if (dVar != null) {
                dVar.c();
                this.H = null;
            }
        }
    }

    public final float l() {
        if (this.N == null) {
            this.N = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.f11656a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.N.floatValue();
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

    public final void p(boolean z10) {
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
        this.E = duration;
        duration.setInterpolator(gr.f28844f);
        this.E.addUpdateListener(new bg.b(this, 16));
        this.E.addListener(new ag.e(this, 12));
        this.E.start();
    }

    @Override
    public final void b(Canvas canvas) {
    }

    @Override
    public final void d(Canvas canvas) {
    }
}
