package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.provider.Settings;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.a;
public final class sj4 {
    public static final gia Q = new gia(new w44((byte) 24), new w44((byte) 25));
    public static final gia R = new gia(new w44((byte) 26), new w44((byte) 27));
    public float B;
    public float C;
    public yla D;
    public yla E;
    public iv9 G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final xa8 a;
    public final sa8 b;
    public final Activity c;
    public WindowManager d;
    public boolean f;
    public boolean g;
    public s8 h;
    public lj4 i;
    public ya8 j;
    public View k;
    public ImageView l;
    public lj4 m;
    public ImageView n;
    public rj4 o;
    public ScaleGestureDetector p;
    public z24 q;
    public boolean r;
    public boolean s;
    public View t;
    public boolean u;
    public ValueAnimator v;
    public boolean w;
    public int x;
    public int y;
    public final WindowManager.LayoutParams e = new WindowManager.LayoutParams();
    public float z = 1.0f;
    public float A = 1.4f;
    public final rac F = new rac(false);
    public final float[] M = new float[2];
    public final jj4 N = new jj4(this, (byte) 2);
    public final mj4 O = new mj4(this, (byte) 0);
    public final mj4 P = new mj4(this, (byte) 1);

    public sj4(xa8 xa8Var, Activity activity) {
        this.a = xa8Var;
        this.b = xa8Var.a;
        this.c = activity;
    }

    public static float e(float f, float f2) {
        return moe.a(f, m(), (gl.q.y - f2) - m());
    }

    public static int i(float f) {
        float f2;
        Point point = gl.q;
        float min = Math.min(point.x, point.y);
        if (f >= 1.0f) {
            f2 = 0.35f;
        } else {
            f2 = 0.6f;
        }
        return (int) (min * f2);
    }

    public static void j(RectF rectF, int i, int i2) {
        float f;
        float m;
        float m2;
        if (i > 0 && i2 > 0) {
            f = i2 / i;
        } else {
            f = 0.5625f;
        }
        SharedPreferences sharedPreferences = qj4.b().a;
        float f2 = sharedPreferences.getFloat("scale_factor", 1.0f);
        float i3 = i(f) * f2;
        float i4 = ((int) (i(f) * f)) * f2;
        float f3 = sharedPreferences.getFloat("x", -1.0f);
        float f4 = sharedPreferences.getFloat("y", -1.0f);
        if (f3 != -1.0f) {
            m = n(f3, i3);
        } else {
            m = (gl.q.x - i3) - m();
        }
        if (f4 != -1.0f) {
            m2 = e(f4, i4);
        } else {
            m2 = m();
        }
        float f5 = m2 + gl.m;
        rectF.set(m, f5, i3 + m, i4 + f5);
    }

    public static float m() {
        return gl.L(16.0f);
    }

    public static float n(float f, float f2) {
        float f3 = (f2 / 2.0f) + f;
        int i = gl.q.x;
        if (f3 >= i / 2.0f) {
            return (i - f2) - m();
        }
        return m();
    }

    public final void a() {
        boolean z;
        Context context;
        int i;
        if (this.g) {
            return;
        }
        if (this.b.U() && Settings.canDrawOverlays(this.c)) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        if (z) {
            context = a.b;
        } else {
            context = this.c;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.d = windowManager;
        WindowManager.LayoutParams layoutParams = this.e;
        layoutParams.token = null;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (this.f) {
            if (Build.VERSION.SDK_INT >= 26) {
                i = 2038;
            } else {
                i = 2002;
            }
            layoutParams.type = i;
        } else {
            layoutParams.type = 2;
        }
        layoutParams.flags = 520;
        layoutParams.dimAmount = 0.0f;
        layoutParams.width = this.x;
        layoutParams.height = this.y;
        layoutParams.x = (int) this.B;
        layoutParams.y = (int) this.C;
        try {
            gl.s3(windowManager, this.h, layoutParams);
            this.d.addView(this.h, this.e);
            this.g = true;
            mb3.e("floating window added, overlay=" + this.f);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final boolean b() {
        if (!this.K && !this.H && !this.r && !this.p.isInProgress() && this.L) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        sa8 sa8Var = this.b;
        if (!sa8Var.F2()) {
            return false;
        }
        long m = sa8Var.m();
        long duration = sa8Var.getDuration();
        if (m == -9223372036854775807L || duration < 15000) {
            return false;
        }
        return true;
    }

    public final void d() {
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.w) {
            gl.r(this.P);
            this.w = false;
        }
        gl.r(this.O);
        gl.r(this.N);
        this.L = false;
        this.r = false;
        this.t = null;
        this.b.L0();
    }

    public final void f(w88 w88Var) {
        l();
        ya8 ya8Var = this.j;
        this.j = null;
        if (ya8Var != null) {
            gl.B2(ya8Var);
        }
        View view = this.k;
        if (view != null) {
            gl.B2(view);
            this.k = null;
        }
        w88Var.run();
        if (ya8Var != null) {
            SurfaceTexture surfaceTexture = ya8Var.a;
            ya8Var.a = null;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
    }

    public final void g(RectF rectF) {
        s8 s8Var = this.h;
        if (s8Var != null && s8Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            this.h.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            rectF.set(i, i2, i + this.x, i2 + this.y);
            return;
        }
        float f = this.B;
        float f2 = this.C + gl.m;
        rectF.set(f, f2, this.x + f, this.y + f2);
    }

    public final int h() {
        float f;
        sa8 sa8Var = this.b;
        int Q0 = sa8Var.Q0();
        int S1 = sa8Var.S1();
        if (Q0 > 0 && S1 > 0) {
            f = S1 / Q0;
        } else {
            f = 0.5625f;
        }
        return i(f);
    }

    public final void k() {
        if (this.b.j()) {
            this.H = false;
        }
        p();
        q();
    }

    public final void l() {
        if (!this.g) {
            return;
        }
        this.g = false;
        try {
            this.d.removeViewImmediate(this.h);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void o(boolean z) {
        if (this.m == null) {
            return;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
        this.v = duration;
        duration.setInterpolator(s33.f);
        this.v.addUpdateListener(new ni4(this, (byte) 1));
        this.v.addListener(new im2(this, (byte) 22));
        this.v.start();
    }

    public final void p() {
        if (this.n == null) {
            return;
        }
        mj4 mj4Var = this.O;
        gl.r(mj4Var);
        if (this.b.j()) {
            this.n.setImageResource(2131232549);
            gl.d3(mj4Var, 500L);
            return;
        }
        boolean z = this.H;
        ImageView imageView = this.n;
        if (z) {
            imageView.setImageResource(2131232551);
        } else {
            imageView.setImageResource(2131232550);
        }
    }

    public final void q() {
        if (this.o != null && !this.H) {
            sa8 sa8Var = this.b;
            long duration = sa8Var.getDuration();
            if (duration > 0) {
                this.I = ((float) sa8Var.m()) / ((float) duration);
            }
            this.J = Math.max(this.J, sa8Var.a2());
            this.o.invalidate();
        }
    }

    public final void r() {
        if (this.g) {
            try {
                this.d.updateViewLayout(this.h, this.e);
            } catch (IllegalArgumentException unused) {
                yla ylaVar = this.D;
                if (ylaVar != null) {
                    ylaVar.d();
                    this.E.d();
                }
            }
        }
    }
}
