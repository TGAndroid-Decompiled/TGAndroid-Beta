package ai;

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
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tv0;
public final class m2 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final tv0 X = new tv0(new w1(1), new w1(2));
    public static final tv0 Y = new tv0(new w1(3), new w1(4));
    public static final m2 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public pf.e L;
    public float M;
    public float N;
    public float O;
    public o1.k P;
    public o1.k Q;
    public Float R;
    public boolean S;
    public boolean T;
    public a3.d U;
    public ci.l4 V;
    public boolean W;
    public float f1232a;
    public WindowManager f1233b;
    public WindowManager.LayoutParams f1234c;
    public j2 d;
    public f0 e;
    public ci.l4 f1235f;
    public FrameLayout h;
    public org.telegram.ui.Components.v9 f1236n;
    public kn f1237r;
    public boolean f1238s;
    public d2 v;
    public int f1239w;
    public ScaleGestureDetector f1240x;
    public n2.e f1241y;

    static {
        ?? obj = new Object();
        obj.f1232a = 1.4f;
        obj.f1238s = true;
        obj.M = 1.0f;
        obj.U = new a3.d((Object) obj, 5);
        Z = obj;
    }

    public static void j() {
        Z.k(true);
    }

    public static void o(Activity activity, d2 d2Var) {
        Context context;
        m2 m2Var = Z;
        if (d2Var != null && !m2Var.S) {
            m2Var.S = true;
            m2Var.v = d2Var;
            int i10 = d2Var.e;
            m2Var.f1239w = i10;
            NotificationCenter.getInstance(i10).addObserver(m2Var, NotificationCenter.liveStoryUpdated);
            m2Var.J = m2Var.n();
            m2Var.K = m2Var.m();
            m2Var.M = 1.0f;
            m2Var.H = false;
            o1.k kVar = new o1.k(m2Var, X);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f15522u = lVar;
            m2Var.P = kVar;
            o1.k kVar2 = new o1.k(m2Var, Y);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f15522u = lVar2;
            m2Var.Q = kVar2;
            if (activity != null) {
                context = activity;
            } else {
                context = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
            m2Var.f1240x = scaleGestureDetector;
            int i11 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i11 >= 23) {
                m2Var.f1240x.setStylusScaleEnabled(false);
            }
            m2Var.f1241y = new n2.e(context, new i2(scaledTouchSlop));
            f0 f0Var = new f0(context, 1);
            f0Var.f785b = new Path();
            m2Var.e = f0Var;
            ?? viewGroup = new ViewGroup(context);
            m2Var.d = viewGroup;
            viewGroup.addView(m2Var.e, w7.y5.c(-1.0f, -1));
            m2Var.e.setOutlineProvider(new k2(0));
            m2Var.e.setClipToOutline(true);
            m2Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19157gg, false));
            org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
            m2Var.f1236n = v9Var;
            m2Var.e.addView(v9Var, w7.y5.c(-1.0f, -1));
            ci.l4 l4Var = new ci.l4(context, m2Var.f1239w);
            m2Var.f1235f = l4Var;
            l4Var.setAlpha(0.0f);
            m2Var.e.addView(m2Var.f1235f, w7.y5.c(-1.0f, -1));
            kn knVar = new kn(context, 1);
            m2Var.f1237r = knVar;
            m2Var.e.addView(knVar, w7.y5.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(context);
            m2Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            m2Var.h.addView(view, w7.y5.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i12 = org.telegram.ui.ActionBar.j6.f19174hg;
            imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            int i13 = org.telegram.ui.ActionBar.j6.f19184i6;
            imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new e2(0));
            float f7 = 38;
            float f10 = 4;
            m2Var.h.addView(imageView, w7.y5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new f2(0, d2Var, context));
            m2Var.h.addView(imageView2, w7.y5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
            m2Var.e.addView(m2Var.h, w7.y5.c(-1.0f, -1));
            m2Var.f1233b = (WindowManager) context.getSystemService("window");
            WindowManager.LayoutParams b10 = sf.c.b(context, false);
            m2Var.f1234c = b10;
            int i14 = m2Var.J;
            b10.width = i14;
            b10.height = m2Var.K;
            float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
            m2Var.N = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = m2Var.f1234c;
            float dp3 = (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f);
            m2Var.O = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = m2Var.f1234c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            m2Var.d.setAlpha(0.0f);
            m2Var.d.setScaleX(0.1f);
            m2Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(m2Var.f1233b, m2Var.d, m2Var.f1234c);
            m2Var.f1233b.addView(m2Var.d, m2Var.f1234c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(qr.f27642f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(m2Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(m2Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(m2Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new l2(0));
            animatorSet.start();
            m2Var.i();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            pf.e eVar = m2Var.L;
            if (eVar != null) {
                eVar.c();
                m2Var.L = null;
            }
            if (activity != null && sf.c.a(activity) == 1) {
                pf.d dVar = new pf.d(activity, m2Var);
                dVar.f41081c = "pip-live-story";
                dVar.e = 1;
                dVar.d = AndroidUtilities.dp(10.0f);
                dVar.f41085j = m2Var.d;
                dVar.f41086k = m2Var.f1235f.getPlaceholderView();
                m2Var.L = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.f1233b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        pf.e eVar = this.L;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f1234c;
            int width = this.L.h.f43206a.width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f1234c;
            int height = this.L.h.f43206a.height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f1233b.addView(this.d, this.f1234c);
        this.d.invalidate();
        ci.l4 l4Var = this.V;
        if (l4Var != null) {
            l4Var.b();
            this.V = null;
        }
        i();
    }

    @Override
    public final Bitmap c() {
        ci.l4 l4Var = this.V;
        if (l4Var != null && l4Var.a()) {
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
        ci.l4 l4Var = this.f1235f;
        if (l4Var != null && l4Var.a()) {
            return this.f1235f.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        ci.l4 l4Var = new ci.l4(this.f1235f.getContext(), this.f1239w);
        this.V = l4Var;
        return l4Var;
    }

    public final void i() {
        float dp;
        float f7;
        d2 d2Var = this.v;
        if (d2Var != null) {
            d2Var.v(1.0f);
            ci.l4 l4Var = this.V;
            if (l4Var != null) {
                this.v.s(l4Var.getSink());
            } else {
                this.v.s(this.f1235f.getSink());
            }
        }
        if (this.f1238s) {
            this.f1237r.animate().cancel();
            ViewPropertyAnimator duration = this.f1237r.animate().alpha(0.0f).setDuration(150L);
            qr qrVar = qr.f27642f;
            duration.setInterpolator(qrVar).start();
            this.f1236n.animate().cancel();
            this.f1236n.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
            this.f1235f.animate().cancel();
            this.f1235f.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
            this.f1238s = false;
        }
        if (this.J == n() * this.M && this.K == m() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f1234c;
        int n10 = (int) (n() * this.M);
        this.J = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.f1234c;
        int m10 = (int) (m() * this.M);
        this.K = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.f1233b, this.d, this.f1234c);
        o1.k kVar = this.P;
        float f10 = this.N;
        kVar.f15513b = f10;
        kVar.f15514c = true;
        o1.l lVar = kVar.f15522u;
        float A = a4.a.A(n(), this.M, 2.0f, f10);
        float f11 = AndroidUtilities.displaySize.x;
        if (A >= f11 / 2.0f) {
            dp = (f11 - (n() * this.M)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f15528i = dp;
        this.P.f();
        o1.k kVar2 = this.Q;
        kVar2.f15513b = this.O;
        kVar2.f15514c = true;
        kVar2.f15522u.f15528i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.f();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new f(1), 100L);
            NotificationCenter.getInstance(this.f1239w).removeObserver(this, NotificationCenter.liveStoryUpdated);
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
            animatorSet.setInterpolator(qr.f27642f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new n(2, this, z10));
            animatorSet.start();
            pf.e eVar = this.L;
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
            this.f1232a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
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

    public final void p(boolean z10) {
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
        duration.setInterpolator(qr.f27642f);
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
