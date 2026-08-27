package jh;

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
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.zm;

public final class i1 implements NotificationCenter.NotificationCenterDelegate, af.a {
    public static final su0 T = new su0(new ia.l(11), new ia.l(12));
    public static final su0 U = new su0(new ia.l(13), new ia.l(14));
    public static final i1 V;
    public boolean A;
    public boolean B;
    public View C;
    public boolean D;
    public ValueAnimator E;
    public int F;
    public int G;
    public ye.d H;
    public float I;
    public float J;
    public float K;
    public o1.j L;
    public o1.j M;
    public Float N;
    public boolean O;
    public boolean P;
    public y9 Q;
    public lh.c4 R;
    public boolean S;

    public float f13424a;

    public WindowManager f13425b;

    public WindowManager.LayoutParams f13426c;
    public h1 d;

    public ag.p1 f13427e;

    public lh.c4 f13428f;
    public FrameLayout h;

    public org.telegram.ui.Components.n9 f13429n;

    public zm f13430r;

    public boolean f13431s;
    public d1 v;

    public int f13432w;

    public ScaleGestureDetector f13433x;

    public m5.o f13434y;

    static {
        i1 i1Var = new i1();
        i1Var.f13424a = 1.4f;
        i1Var.f13431s = true;
        i1Var.I = 1.0f;
        i1Var.Q = new y9(i1Var, 10);
        V = i1Var;
    }

    public static void j() {
        V.k(true);
    }

    public static void o(Activity activity, d1 d1Var) {
        i1 i1Var = V;
        if (d1Var == null || i1Var.O) {
            return;
        }
        i1Var.O = true;
        i1Var.v = d1Var;
        int i10 = d1Var.f13177e;
        i1Var.f13432w = i10;
        NotificationCenter.getInstance(i10).addObserver(i1Var, NotificationCenter.liveStoryUpdated);
        i1Var.F = i1Var.n();
        i1Var.G = i1Var.m();
        i1Var.I = 1.0f;
        i1Var.D = false;
        o1.j jVar = new o1.j(i1Var, T);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.f19147u = kVar;
        i1Var.L = jVar;
        o1.j jVar2 = new o1.j(i1Var, U);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.f19147u = kVar2;
        i1Var.M = jVar2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new f1());
        i1Var.f13433x = scaleGestureDetector;
        int i11 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i11 >= 23) {
            i1Var.f13433x.setStylusScaleEnabled(false);
        }
        i1Var.f13434y = new m5.o(context, new g1(scaledTouchSlop));
        ag.p1 p1Var = new ag.p1(context, 8);
        p1Var.f594b = new Path();
        i1Var.f13427e = p1Var;
        h1 h1Var = new h1(context);
        i1Var.d = h1Var;
        h1Var.addView(i1Var.f13427e, h7.z5.c(-1.0f, -1));
        i1Var.f13427e.setOutlineProvider(new cg.l1(4));
        i1Var.f13427e.setClipToOutline(true);
        i1Var.f13427e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23117gg, false));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        i1Var.f13429n = n9Var;
        i1Var.f13427e.addView(n9Var, h7.z5.c(-1.0f, -1));
        lh.c4 c4Var = new lh.c4(context, i1Var.f13432w);
        i1Var.f13428f = c4Var;
        c4Var.setAlpha(0.0f);
        i1Var.f13427e.addView(i1Var.f13428f, h7.z5.c(-1.0f, -1));
        zm zmVar = new zm(context, 4);
        i1Var.f13430r = zmVar;
        i1Var.f13427e.addView(zmVar, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        i1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        i1Var.h.addView(view, h7.z5.c(-1.0f, -1));
        int iDp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i12 = org.telegram.ui.ActionBar.g6.f23135hg;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.g6.f23144i6;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 1, -1));
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new ag.l2(6));
        float f10 = 38;
        float f11 = 4;
        i1Var.h.addView(imageView, h7.z5.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 1, -1));
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        imageView2.setOnClickListener(new ag.q0(22, d1Var, context));
        i1Var.h.addView(imageView2, h7.z5.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
        i1Var.f13427e.addView(i1Var.h, h7.z5.c(-1.0f, -1));
        i1Var.f13425b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParamsB = bf.d.b(context, false);
        i1Var.f13426c = layoutParamsB;
        int i14 = i1Var.F;
        layoutParamsB.width = i14;
        layoutParamsB.height = i1Var.G;
        float fDp = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
        i1Var.J = fDp;
        layoutParamsB.x = (int) fDp;
        WindowManager.LayoutParams layoutParams = i1Var.f13426c;
        float fDp2 = (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f);
        i1Var.K = fDp2;
        layoutParams.y = (int) fDp2;
        WindowManager.LayoutParams layoutParams2 = i1Var.f13426c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        i1Var.d.setAlpha(0.0f);
        i1Var.d.setScaleX(0.1f);
        i1Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(i1Var.f13425b, i1Var.d, i1Var.f13426c);
        i1Var.f13425b.addView(i1Var.d, i1Var.f13426c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.f28122f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, (Property<h1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<h1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<h1, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new ig.r(1));
        animatorSet.start();
        i1Var.i();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        ye.d dVar = i1Var.H;
        if (dVar != null) {
            dVar.c();
            i1Var.H = null;
        }
        if (activity == null || bf.d.a(activity) != 1) {
            return;
        }
        ye.c cVar = new ye.c(activity, i1Var);
        cVar.f49851c = "pip-live-story";
        cVar.f49852e = 1;
        cVar.d = AndroidUtilities.dp(10.0f);
        cVar.f49856j = i1Var.d;
        cVar.f49857k = i1Var.f13428f.getPlaceholderView();
        i1Var.H = cVar.a();
    }

    @Override
    public final Bitmap a() {
        lh.c4 c4Var = this.R;
        if (c4Var == null || !c4Var.a()) {
            return null;
        }
        return this.R.getBitmap();
    }

    @Override
    public final Bitmap c() {
        lh.c4 c4Var = this.f13428f;
        if (c4Var == null || !c4Var.a()) {
            return null;
        }
        return this.f13428f.getBitmap();
    }

    @Override
    public final void d(bf.e eVar) {
        i();
        this.S = true;
        this.f13425b.removeView(this.d);
        this.d.invalidate();
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
    public final void f(bf.e eVar) {
        ye.d dVar = this.H;
        if (dVar != null && dVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f13426c;
            int iWidth = this.H.h.f2081a.width();
            this.F = iWidth;
            layoutParams.width = iWidth;
            WindowManager.LayoutParams layoutParams2 = this.f13426c;
            int iHeight = this.H.h.f2081a.height();
            this.G = iHeight;
            layoutParams2.height = iHeight;
        }
        this.S = false;
        this.f13425b.addView(this.d, this.f13426c);
        this.d.invalidate();
        lh.c4 c4Var = this.R;
        if (c4Var != null) {
            c4Var.b();
            this.R = null;
        }
        i();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        lh.c4 c4Var = new lh.c4(this.f13428f.getContext(), this.f13432w);
        this.R = c4Var;
        return c4Var;
    }

    public final void i() {
        d1 d1Var = this.v;
        if (d1Var != null) {
            d1Var.v(1.0f);
            lh.c4 c4Var = this.R;
            if (c4Var != null) {
                this.v.s(c4Var.getSink());
            } else {
                this.v.s(this.f13428f.getSink());
            }
        }
        if (this.f13431s) {
            this.f13430r.animate().cancel();
            ViewPropertyAnimator duration = this.f13430r.animate().alpha(0.0f).setDuration(150L);
            er erVar = er.f28122f;
            duration.setInterpolator(erVar).start();
            this.f13429n.animate().cancel();
            this.f13429n.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
            this.f13428f.animate().cancel();
            this.f13428f.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
            this.f13431s = false;
        }
        if (this.F == n() * this.I && this.G == m() * this.I) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f13426c;
        int iN = (int) (n() * this.I);
        this.F = iN;
        layoutParams.width = iN;
        WindowManager.LayoutParams layoutParams2 = this.f13426c;
        int iM = (int) (m() * this.I);
        this.G = iM;
        layoutParams2.height = iM;
        AndroidUtilities.updateViewLayout(this.f13425b, this.d, this.f13426c);
        o1.j jVar = this.L;
        float f10 = this.J;
        jVar.f19138b = f10;
        jVar.f19139c = true;
        o1.k kVar = jVar.f19147u;
        float fD = a9.p.d(n(), this.I, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        kVar.f19154i = fD >= f11 / 2.0f ? (f11 - (n() * this.I)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.L.f();
        o1.j jVar2 = this.M;
        float f12 = this.K;
        jVar2.f19138b = f12;
        jVar2.f19139c = true;
        jVar2.f19147u.f19154i = h7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.I)) - AndroidUtilities.dp(16.0f));
        this.M.f();
    }

    public final void k(boolean z10) {
        if (this.O) {
            this.O = false;
            AndroidUtilities.runOnUIThread(new ag.l3(10), 100L);
            NotificationCenter.getInstance(this.f13432w).removeObserver(this, NotificationCenter.liveStoryUpdated);
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
            animatorSet.setInterpolator(er.f28122f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<h1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<h1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<h1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ag.x(5, this, z10));
            animatorSet.start();
            ye.d dVar = this.H;
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
            this.f13424a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.N.floatValue();
    }

    public final int m() {
        return (int) (l() * n());
    }

    public final int n() {
        float fMin;
        float f10;
        if (l() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            fMin = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (fMin * f10);
    }

    public final void p(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.E = duration;
        duration.setInterpolator(er.f28122f);
        this.E.addUpdateListener(new ag.u(this, 19));
        this.E.addListener(new ag.r1(this, 14));
        this.E.start();
    }

    @Override
    public final void b(Canvas canvas) {
    }

    @Override
    public final void e(Canvas canvas) {
    }
}
