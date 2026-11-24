package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.LaunchActivity;
public class p09 extends BitmapDrawable implements Animatable, bl0 {
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final AtomicInteger R0 = new AtomicInteger();
    public static final ExecutorService S0 = Executors.newFixedThreadPool(4, new y30((byte) 5));
    public static final ExecutorService T0 = Executors.newFixedThreadPool(2, new y30((byte) 6));
    public static np3 U0;
    public final Runnable A0;
    public Runnable B0;
    public dl0 C0;
    public int D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public float G;
    public final Runnable G0;
    public final boolean H;
    public int H0;
    public WeakReference I;
    public WeakReference I0;
    public int J;
    public final g79 J0;
    public byte K;
    public RLottieNative K0;
    public byte L;
    public int L0;
    public int M;
    public volatile boolean M0;
    public int N;
    public final jn N0;
    public volatile boolean O;
    public boolean O0;
    public xl1 P;
    public boolean P0;
    public Runnable Q;
    public volatile Bitmap R;
    public volatile Bitmap S;
    public volatile Bitmap T;
    public boolean U;
    public CountDownLatch V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a;
    public boolean a0;
    public final int b;
    public int b0;
    public final int c;
    public final boolean c0;
    public boolean d;
    public final boolean d0;
    public final int[] e;
    public float e0;
    public int f;
    public float f0;
    public boolean g0;
    public boolean h;
    public boolean h0;
    public final RectF i0;
    public final RectF[] j0;
    public final Paint[] k0;
    public volatile boolean l0;
    public volatile boolean m0;
    public int[] n;
    public volatile RLottieNative n0;
    public final boolean o0;
    public boolean p0;
    public boolean q0;
    public int[] r;
    public boolean r0;
    public final HashMap s;
    public final File s0;
    public final boolean t0;
    public Runnable u0;
    public final mf7 v0;
    public final HashMap w;
    public final Runnable w0;
    public final HashMap x;
    public final Runnable x0;
    public HashMap y;
    public boolean y0;
    public final Runnable z0;

    public p09(java.io.File r21, java.lang.String r22, int r23, int r24, defpackage.al0 r25, boolean r26, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p09.<init>(java.io.File, java.lang.String, int, int, al0, boolean, int, boolean):void");
    }

    public final void A(ImageReceiver imageReceiver) {
        View view;
        g79 g79Var = this.J0;
        g79Var.remove(imageReceiver);
        if (this.C0 != null && U0 != null && this.P != null) {
            WeakReference weakReference = this.I0;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (g79Var.isEmpty() && getCallback() == null) {
                if (view == null || !view.isAttachedToWindow()) {
                    xl1 xl1Var = this.P;
                    if (xl1Var != null) {
                        U0.cancelRunnable(xl1Var);
                        dl0.c();
                        this.P = null;
                    }
                    this.y0 = false;
                    this.E0 = false;
                }
            }
        }
    }

    public final void B() {
        if (!this.a0 && !this.l0 && this.X) {
            if (this.b0 <= 2) {
                this.b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!D()) {
                this.Z = true;
            }
        }
        s();
    }

    public final boolean C(boolean z) {
        if (!z && ((this.L < 2 || this.N == 0) && this.M < 0)) {
            return false;
        }
        this.N = 0;
        this.L = (byte) 2;
        start();
        return true;
    }

    public final boolean D() {
        ExecutorService executorService;
        if (this.Q == null && this.S == null && f() && !r() && !this.W && !this.m0) {
            if (this.l0 || (this.X && !this.Y)) {
                if (!this.y0 || this.F0) {
                    if (!this.s.isEmpty()) {
                        this.w.putAll(this.s);
                        this.s.clear();
                    }
                    int[] iArr = this.n;
                    if (iArr != null) {
                        this.r = iArr;
                        this.n = null;
                    }
                    Runnable runnable = this.G0;
                    this.Q = runnable;
                    if (this.c0) {
                        executorService = T0;
                    } else {
                        executorService = S0;
                    }
                    executorService.execute(runnable);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void E(boolean z) {
        this.X = true;
        D();
    }

    public final void F(int i) {
        if (this.L == 2 && i == 3 && this.b0 != 0) {
            return;
        }
        this.L = i;
    }

    public final void G() {
        I(85, false, false);
    }

    public final void H(int i) {
        I(i, true, false);
    }

    public final void I(int i, boolean z, boolean z2) {
        if (i >= 0 && i <= this.e[0]) {
            if (this.b0 != i || z2) {
                this.b0 = i;
                this.O = false;
                this.Y = false;
                if (this.p0) {
                    this.q0 = true;
                    if (this.Q != null) {
                        this.r0 = true;
                    }
                }
                if ((!z || z2) && this.U && this.S != null) {
                    this.T = this.S;
                    this.S = null;
                    this.Q = null;
                    this.U = false;
                }
                if (!z && this.Q == null) {
                    this.V = new CountDownLatch(1);
                }
                if (z2 && !this.l0) {
                    this.l0 = true;
                    g();
                }
                if (D()) {
                    if (!z) {
                        try {
                            this.V.await();
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        this.V = null;
                    }
                } else {
                    this.Z = true;
                }
                invalidateSelf();
            }
        }
    }

    public final void J(boolean z) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.T = this.R;
        this.R = this.S;
        this.S = null;
        this.O0 = false;
        if (this.K == 2 && (weakReference2 = this.I) != null && this.b0 - 1 >= this.J) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.I = null;
        }
        if (this.O || (this.M == 0 && this.L == 1)) {
            stop();
        }
        this.Q = null;
        if (this.r0) {
            this.r0 = false;
        } else if (this.q0) {
            this.q0 = false;
        }
        this.Y = true;
        this.U = false;
        if (z && this.Z) {
            this.Y = false;
            this.Z = false;
        }
        if (this.K == 0 && (weakReference = this.I) != null && this.b0 >= this.J && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        D();
    }

    public final boolean K(int i) {
        if (this.f == i || i > this.e[0]) {
            return false;
        }
        this.f = i;
        return true;
    }

    public final void L(int i, String str) {
        this.s.put(str, Integer.valueOf(i));
        B();
    }

    public final void M(View view) {
        this.I0 = new WeakReference(view);
    }

    public final void N(int i, Runnable runnable) {
        if (runnable != null) {
            this.I = new WeakReference(runnable);
            this.J = i;
        } else if (this.I != null) {
            this.I = null;
        }
    }

    public final void O(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p09.O(boolean, float):void");
    }

    public final void P(long j) {
        int i;
        int[] iArr = this.e;
        if (iArr[0] != 0 && (i = iArr[1]) != 0) {
            I(Math.round(((float) Math.max(0L, j)) / (1000.0f / i)) % iArr[0], true, true);
        }
    }

    public final void Q(long j) {
        boolean z;
        Integer num;
        int i;
        this.L0 = 0;
        if (this.M0) {
            this.M0 = false;
            g();
        }
        if (!this.O0 && (this.l0 || !this.X)) {
            z = false;
        } else {
            z = true;
        }
        if (this.l0) {
            if (this.R == null && this.S == null) {
                D();
            } else if (this.S != null) {
                if (this.R == null || (z && !this.a)) {
                    HashMap hashMap = this.y;
                    if (hashMap != null && this.F && (num = (Integer) hashMap.get(Integer.valueOf(this.b0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.H1;
                            if (activity == null) {
                                activity = BubbleActivity.b0;
                            }
                            View decorView = activity.getWindow().getDecorView();
                            if (num.intValue() == 1) {
                                i = 0;
                            } else {
                                i = 3;
                            }
                            decorView.performHapticFeedback(i, 2);
                        } catch (Exception unused) {
                        }
                    }
                    J(false);
                }
            }
        } else if ((this.Z || (this.X && z)) && this.S != null) {
            J(true);
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i;
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative != null) {
            int i2 = this.D0;
            if (i2 >= rLottieNative.a[0]) {
                return 0;
            }
            if (this.c0) {
                i = 2;
            } else {
                i = 1;
            }
            if (rLottieNative.c(i2, bitmap, true) == -5) {
                return -1;
            }
            this.D0 += i;
            return 1;
        }
        return -1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        mf7 mf7Var = this.v0;
        File file2 = (File) mf7Var.e;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = mf7Var.c;
        if (this.d0) {
            iArr = this.e;
        }
        RLottieNative a = RLottieNative.a(str, str2, iArr, (int[]) mf7Var.d, mf7Var.a, this.x);
        this.K0 = a;
        this.D0 = 0;
        if (a == null && (file = this.s0) != null) {
            file.delete();
        }
    }

    @Override
    public final void c() {
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.K0 = null;
        }
    }

    public void d() {
        int i;
        if (this.c0) {
            i = 2;
        } else {
            i = 1;
        }
        int i2 = this.f;
        if (i2 >= 0 && this.h) {
            int i3 = this.b0;
            if (i3 > i2) {
                int i4 = i3 - i;
                if (i4 >= i2) {
                    this.b0 = i4;
                    this.O = false;
                    return;
                }
                this.O = true;
                Runnable runnable = this.u0;
                if (runnable != null) {
                    runnable.run();
                    this.u0 = null;
                    return;
                }
                return;
            }
            int i5 = i3 + i;
            if (i5 < i2) {
                this.b0 = i5;
                this.O = false;
                return;
            }
            this.O = true;
            Runnable runnable2 = this.u0;
            if (runnable2 != null) {
                runnable2.run();
                this.u0 = null;
                return;
            }
            return;
        }
        int i6 = this.b0 + i;
        if (i2 < 0) {
            i2 = this.e[0];
        }
        byte b = this.L;
        if (i6 < i2) {
            if (b == 3) {
                this.O = true;
                this.N++;
                return;
            }
            this.b0 = i6;
            this.O = false;
        } else if (b == 1) {
            this.b0 = 0;
            this.O = false;
            if (this.E) {
                this.y = null;
                this.E = false;
            }
            int i7 = this.M;
            if (i7 > 0) {
                this.M = i7 - 1;
            }
        } else if (b == 2) {
            this.b0 = 0;
            this.O = true;
            this.N++;
            if (this.E) {
                this.y = null;
                this.E = false;
            }
        } else {
            this.O = true;
            Runnable runnable3 = this.u0;
            if (runnable3 != null) {
                runnable3.run();
                this.u0 = null;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, null, false, 0L, 0);
    }

    public int e() {
        if (this.m0) {
            return 3;
        }
        if (f()) {
            if (this.n0 == null && this.d) {
                String v2 = gm.v2(null, this.v0.b);
                if (TextUtils.isEmpty(v2)) {
                    return 2;
                }
                this.n0 = RLottieNative.b(v2, this.e, (int[]) this.v0.d, this.x);
                this.d = false;
                return 1;
            }
            return 1;
        }
        return 2;
    }

    public final boolean f() {
        if (this.t0) {
            if (this.C0 == null && !this.o0) {
                return false;
            }
            return true;
        } else if (this.n0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    public final void finalize() {
        try {
            x(false);
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        xl1 xl1Var = new xl1(this, (byte) 7);
        Typeface typeface = gm.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gm.c3(xl1Var);
        } else {
            xl1Var.run();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        float f;
        if (this.l0 && !this.M0) {
            if (!this.P0) {
                float f2 = this.e[1];
                if (this.c0) {
                    f = 2.0f;
                } else {
                    f = 1.0f;
                }
                int round = Math.round((f2 / f) * this.G);
                if (round > 0) {
                    if (this.e[0] != 1 || this.K != 0) {
                        this.P0 = true;
                        this.L0 = 0;
                        fi2.d().b(this.N0, round);
                        s();
                    }
                }
            }
        } else if (this.P0) {
            this.P0 = false;
            this.L0 = 0;
            fi2.d().f(this.N0);
        }
    }

    public final void i() {
        xl1 xl1Var = this.P;
        if (xl1Var != null) {
            U0.cancelRunnable(xl1Var);
            dl0.c();
            this.P = null;
        }
        if (!q() && this.S != null && this.Q != null) {
            this.Q = null;
            this.S = null;
        }
    }

    @Override
    public final boolean isRunning() {
        return this.l0;
    }

    public final void j() {
        if (!this.a0) {
            return;
        }
        this.a0 = false;
        if (!this.l0 && this.X) {
            if (this.b0 <= 2) {
                this.b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!D()) {
                this.Z = true;
            }
        }
        s();
    }

    public void k() {
        if (this.W) {
            i();
            if (this.Q == null && this.P == null && this.n0 != null) {
                y(true);
            }
        }
        if ((this.n0 == null || this.o0) && this.C0 == null) {
            z();
            return;
        }
        this.U = true;
        if (!q()) {
            stop();
        }
        if (this.l0) {
            D();
        }
    }

    public final void l(Canvas canvas, Paint paint, boolean z, long j, int i) {
        RectF rectF;
        float width;
        boolean z2;
        float f;
        if (f() && !this.W) {
            if (!z) {
                Q(j);
                rectF = this.i0;
            } else {
                rectF = this.j0[i];
            }
            if (paint == null) {
                if (z) {
                    paint = this.k0[i];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.q0 && this.R != null) {
                boolean z3 = true;
                if (!z) {
                    rectF.set(getBounds());
                    if (this.g0) {
                        this.e0 = rectF.width() / this.b;
                        this.f0 = rectF.height() / this.c;
                        this.g0 = false;
                        if (Math.abs(rectF.width() - this.b) < gm.L(1.0f) && Math.abs(rectF.height() - this.c) < gm.L(1.0f)) {
                            z3 = false;
                        }
                        this.h0 = z3;
                    }
                    width = this.e0;
                    f = this.f0;
                    z2 = this.h0;
                } else {
                    width = rectF.width() / this.b;
                    float height = rectF.height() / this.c;
                    if (Math.abs(rectF.width() - this.b) < gm.L(1.0f) && Math.abs(rectF.height() - this.c) < gm.L(1.0f)) {
                        z3 = false;
                    }
                    z2 = z3;
                    f = height;
                }
                if (!z2) {
                    canvas.drawBitmap(this.R, rectF.left, rectF.top, paint);
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, f);
                canvas.drawBitmap(this.R, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    public final long m() {
        int[] iArr = this.e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int n() {
        return this.e[0];
    }

    public final float o() {
        return this.b0 / this.e[0];
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.g0 = true;
    }

    public final boolean p() {
        if (!this.m0) {
            if ((this.R != null || this.S != null) && !this.q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean q() {
        if (this.J0.isEmpty()) {
            WeakReference weakReference = this.I0;
            if ((weakReference == null || weakReference.get() == null) && getCallback() == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean r() {
        if (this.R == null || this.e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void s() {
        View view;
        if (!this.m0) {
            Iterator it = this.J0.iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).invalidate();
            }
            WeakReference weakReference = this.I0;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null) {
                view.invalidate();
            }
            if (getCallback() != null) {
                invalidateSelf();
            }
        }
    }

    @Override
    public final void start() {
        if (!this.l0) {
            if ((this.L < 2 || this.N == 0) && this.f != this.b0) {
                this.l0 = true;
                this.M0 = false;
                if (this.p0) {
                    this.q0 = true;
                    if (this.Q != null) {
                        this.r0 = true;
                    }
                }
                D();
                s();
                g();
            }
        }
    }

    @Override
    public final void stop() {
        this.l0 = false;
        g();
    }

    public final boolean t() {
        if (this.P != null) {
            return true;
        }
        return false;
    }

    public boolean u() {
        return true;
    }

    public final boolean v() {
        if (this.b0 != this.e[0] - 1) {
            return false;
        }
        return true;
    }

    public int w(Bitmap bitmap, boolean z) {
        RLottieNative b;
        int i;
        int c;
        dl0 dl0Var;
        RLottieNative rLottieNative = this.n0;
        if (rLottieNative != null) {
            try {
                if (!this.w.isEmpty() || this.r != null) {
                    this.x.putAll(this.w);
                    int[] iArr = this.r;
                    if (iArr != null) {
                        this.v0.d = (int[]) iArr.clone();
                    }
                    mf7 mf7Var = this.v0;
                    File file = (File) mf7Var.e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        mf7 mf7Var2 = this.v0;
                        b = RLottieNative.a(absolutePath, mf7Var2.c, this.e, (int[]) mf7Var2.d, mf7Var2.a, this.x);
                    } else {
                        int i2 = mf7Var.b;
                        if (i2 != 0 && mf7Var.c == null) {
                            String v2 = gm.v2(null, i2);
                            if (!TextUtils.isEmpty(v2)) {
                                mf7 mf7Var3 = this.v0;
                                mf7Var3.c = v2;
                                b = RLottieNative.b(v2, this.e, (int[]) mf7Var3.d, this.x);
                            }
                        } else {
                            b = RLottieNative.b(mf7Var.c, this.e, (int[]) mf7Var.d, this.x);
                        }
                    }
                    if (b != null) {
                        this.n0 = b;
                        rLottieNative.d();
                        this.w.clear();
                        this.r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.n0;
        if (this.c0) {
            i = 2;
        } else {
            i = 1;
        }
        if (this.t0 && (dl0Var = this.C0) != null) {
            c = 0;
            try {
                c = dl0Var.f(this.b0 / i, bitmap);
                if (!this.C0.g() && this.F0 && this.n0 != null) {
                    this.n0.d();
                    this.n0 = null;
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } else {
            c = rLottieNative2.c(this.b0, bitmap, z);
        }
        dl0 dl0Var2 = this.C0;
        if (dl0Var2 != null && dl0Var2.g()) {
            if (!this.E0) {
                this.E0 = true;
                gm.c3(this.z0);
            }
            c = -1;
            if (this.F0) {
                if (this.n0 == null) {
                    String file2 = ((File) this.v0.e).toString();
                    mf7 mf7Var4 = this.v0;
                    this.n0 = RLottieNative.a(file2, mf7Var4.c, null, (int[]) mf7Var4.d, mf7Var4.a, this.x);
                }
                if (this.n0 != null) {
                    c = this.n0.c(this.b0, bitmap, z);
                }
            }
        }
        if (c < 0) {
            return 2;
        }
        return 1;
    }

    public void x(boolean z) {
        this.l0 = false;
        this.m0 = true;
        g();
        i();
        if (this.Q == null && this.P == null && !this.y0) {
            y(z);
            dl0 dl0Var = this.C0;
            if (dl0Var != null) {
                RandomAccessFile randomAccessFile = dl0Var.s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    dl0Var.s = null;
                }
                dl0Var.r = true;
                this.C0 = null;
            }
            z();
            return;
        }
        this.W = true;
    }

    public void y(boolean z) {
        RLottieNative rLottieNative = this.n0;
        this.n0 = null;
        if (rLottieNative != null) {
            pp8 pp8Var = new pp8(rLottieNative, (byte) 15);
            if (z) {
                op3.a(pp8Var);
            } else {
                Utilities.e.c(pp8Var);
            }
        }
    }

    public final void z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.R);
        arrayList.add(this.T);
        arrayList.add(this.S);
        this.S = null;
        this.R = null;
        this.T = null;
        gm.x2(arrayList);
        if (this.u0 != null) {
            this.u0 = null;
        }
    }

    public p09(int i, int i2) {
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = (byte) 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.w0 = new xl1(this, (byte) 2);
        this.x0 = new xl1(this, (byte) 3);
        this.z0 = new xl1(this, (byte) 4);
        this.A0 = new xl1(this, (byte) 5);
        this.G0 = new xl1(this, (byte) 6);
        this.J0 = new g79(0, true);
        this.N0 = new jn(this, (byte) 2);
        this.b = i;
        this.c = i2;
        this.H = false;
    }

    public p09(int i, int i2, int i3) {
        this(i, i2, i3, true, null);
    }

    public p09(int i, int i2, int i3, boolean z, int[] iArr) {
        long j;
        this.e = new int[3];
        this.f = -1;
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        boolean z2 = false;
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = (byte) 1;
        this.M = -1;
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.i0 = new RectF();
        this.j0 = new RectF[2];
        this.k0 = new Paint[2];
        this.w0 = new xl1(this, (byte) 2);
        this.x0 = new xl1(this, (byte) 3);
        this.z0 = new xl1(this, (byte) 4);
        this.A0 = new xl1(this, (byte) 5);
        this.G0 = new xl1(this, (byte) 6);
        this.J0 = new g79(0, true);
        this.N0 = new jn(this, (byte) 2);
        this.b = i2;
        this.c = i3;
        this.L = (byte) 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.v0 = obj;
        obj.d = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = qa9.a;
        int length = jArr.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 > length) {
                j = -1;
                break;
            }
            int i5 = (i4 + length) >>> 1;
            j = jArr[i5];
            int i6 = (int) (j >>> 32);
            if (i6 >= i) {
                if (i6 <= i) {
                    break;
                }
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        if (j != -1) {
            this.d = true;
            this.v0.b = i;
            boolean z3 = (8388608 & j) != 0;
            this.H = z3;
            int[] iArr2 = this.e;
            iArr2[0] = (int) (8388607 & j);
            iArr2[1] = (int) ((j >>> 24) & 255);
            z2 = z3;
        } else {
            this.H = false;
            String v2 = gm.v2(null, i);
            if (TextUtils.isEmpty(v2)) {
                this.v0 = null;
                return;
            }
            mf7 mf7Var = this.v0;
            mf7Var.c = v2;
            this.n0 = RLottieNative.b(v2, this.e, (int[]) mf7Var.d, this.x);
        }
        if (z2) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z) {
            E(true);
        }
    }
}
