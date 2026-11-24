package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedFileNative;
public final class km extends BitmapDrawable implements Animatable, bk0 {
    public static final float[] W0 = new float[8];
    public static final ScheduledThreadPoolExecutor X0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode Y0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public final dk0 A0;
    public g30 B0;
    public final im C0;
    public boolean D0;
    public boolean E;
    public im E0;
    public boolean F;
    public final im F0;
    public boolean G;
    public final im G0;
    public final File H;
    public int H0;
    public final long I;
    public final im I0;
    public final boolean J;
    public final im J0;
    public final int K;
    public im K0;
    public boolean L;
    public boolean L0;
    public volatile long M;
    public long M0;
    public volatile long N;
    public Bitmap N0;
    public boolean O;
    public AnimatedFileNative O0;
    public int P;
    public int P0;
    public boolean Q;
    public int Q0;
    public final Object R;
    public int R0;
    public boolean S;
    public volatile boolean S0;
    public final RectF T;
    public final jm T0;
    public final int[] U;
    public boolean U0;
    public int[] V;
    public boolean V0;
    public final Matrix[] W;
    public final Path[] X;
    public float Y;
    public float Z;
    public boolean a;
    public boolean a0;
    public boolean b;
    public final RectF b0;
    public int c;
    public volatile boolean c0;
    public final int[] d;
    public volatile boolean d0;
    public im e;
    public volatile AnimatedFileNative e0;
    public boolean f;
    public boolean f0;
    public do3 g0;
    public final ArrayList h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public final boolean l0;
    public final boolean m0;
    public hm n;
    public float n0;
    public boolean o0;
    public final TLRPC.Document p0;
    public final RectF[] q0;
    public hm r;
    public final Paint[] r0;
    public hm s;
    public WeakReference s0;
    public final e59 t0;
    public final e59 u0;
    public AnimatedFileDrawableStream v0;
    public hm w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public int z0;

    public km(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, defpackage.gl5 r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, defpackage.ak0 r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, gl5, java.lang.Object, long, int, boolean, int, int, ak0, int, boolean):void");
    }

    public final void A(boolean z) {
        this.y0 = z;
        if (z) {
            this.b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.t0.isEmpty();
        int[] iArr2 = this.U;
        if (!isEmpty) {
            int[] iArr3 = this.V;
            if (iArr3 == null) {
                iArr3 = new int[4];
                this.V = iArr3;
            }
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.x0 && iArr[i] != iArr2[i]) {
                this.x0 = true;
            }
            iArr2[i] = iArr[i];
        }
    }

    public final void C(long j, long j2) {
        this.h0 = ((float) j) / 1000.0f;
        this.i0 = ((float) j2) / 1000.0f;
        if (j >= 0 && o() < j) {
            y(j, true, false);
        }
    }

    public final void D(long j) {
        boolean z;
        this.R0 = 0;
        if (this.S0) {
            this.S0 = false;
            im imVar = new im(this, (byte) 0);
            Typeface typeface = gl.a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                gl.d3(imVar);
            } else {
                imVar.run();
            }
        }
        if (!this.U0 && (this.c0 || !this.E)) {
            z = false;
        } else {
            z = true;
        }
        if (this.c0) {
            hm hmVar = this.n;
            if (hmVar == null && this.r == null) {
                x(false);
            } else if (this.r != null) {
                if (hmVar == null || (z && !this.a && this.N < 0)) {
                    hm hmVar2 = this.n;
                    if (hmVar2 != null) {
                        this.h.add(hmVar2);
                    }
                    this.n = this.r;
                    this.r = this.s;
                    this.s = null;
                    this.U0 = false;
                    x(false);
                }
            }
        } else if (!this.c0 && this.E && z && this.r != null) {
            hm hmVar3 = this.n;
            if (hmVar3 != null) {
                this.h.add(hmVar3);
            }
            this.n = this.r;
            this.r = this.s;
            this.s = null;
            this.U0 = false;
            x(false);
        }
    }

    public final void E() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        if (!this.o0 && (i = this.j0) > 0 && (i2 = this.k0) > 0 && (i3 = (iArr = this.d)[0]) > 0 && (i4 = iArr[1]) > 0) {
            float max = Math.max(i2 / i3, i / i4);
            this.n0 = max;
            if (max > 0.0f && max <= 0.7d) {
                return;
            }
            this.n0 = 1.0f;
            return;
        }
        this.n0 = 1.0f;
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i;
        if (this.O0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.N0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            this.N0 = bitmap2;
        }
        this.O0.c(bitmap2, false, this.h0, this.i0, this.l0);
        long j = this.M0;
        if (j != 0 && ((i = iArr[3]) == 0 || j > i)) {
            return 0;
        }
        int i2 = this.Q0;
        int i3 = iArr[3];
        if (i2 == i3) {
            int i4 = this.P0 + 1;
            this.P0 = i4;
            if (i4 > 5) {
                return 0;
            }
        }
        this.Q0 = i3;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.M0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.O0 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.v0, false);
    }

    @Override
    public final void c() {
        AnimatedFileNative animatedFileNative = this.O0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.O0 = null;
        }
    }

    public final void d() {
        int i;
        if (this.k0 == 0 && this.j0 == 0) {
            int[] iArr = this.d;
            int i2 = iArr[0];
            if (i2 <= 3000 && (i = iArr[1]) <= 3000) {
                if (i2 > 2200 || i > 2200) {
                    this.k0 = i2 / 2;
                    this.j0 = i / 2;
                    return;
                }
                return;
            }
            this.k0 = i2 / 4;
            this.j0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (imageReceiver != null && this.u0.add(imageReceiver) && this.c0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.t0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.t0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.m0) {
            if (this.A0 == null) {
                return false;
            }
            return true;
        } else if (this.e0 == null && this.y) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            if (i2 != 90 && i2 != 270) {
                i = iArr[1];
            } else {
                i = iArr[0];
            }
        }
        if (i == 0) {
            return gl.L(100.0f);
        }
        return (int) (i * this.n0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            if (i2 != 90 && i2 != 270) {
                i = iArr[0];
            } else {
                i = iArr[1];
            }
        }
        if (i == 0) {
            return gl.L(100.0f);
        }
        return (int) (i * this.n0);
    }

    @Override
    public final int getMinimumHeight() {
        int i = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            if (i2 != 90 && i2 != 270) {
                i = iArr[1];
            } else {
                i = iArr[0];
            }
        }
        if (i == 0) {
            return gl.L(100.0f);
        }
        return i;
    }

    @Override
    public final int getMinimumWidth() {
        int i = 0;
        if (this.y) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            if (i2 != 90 && i2 != 270) {
                i = iArr[0];
            } else {
                i = iArr[1];
            }
        }
        if (i == 0) {
            return gl.L(100.0f);
        }
        return i;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        if (this.A0 != null) {
            boolean isEmpty = this.u0.isEmpty();
            im imVar = this.K0;
            if (isEmpty) {
                if (imVar == null) {
                    im imVar2 = new im(this, (byte) 3);
                    this.K0 = imVar2;
                    gl.e3(imVar2, 600L);
                }
            } else if (imVar != null) {
                gl.r(imVar);
                this.K0 = null;
            }
        }
    }

    public final void i() {
        int i;
        if (this.c0 && !this.S0 && !this.f) {
            if (!this.V0 && (i = this.d[5]) > 0) {
                this.V0 = true;
                this.R0 = 0;
                rg2.d().b(this.T0, i);
            }
        } else if (this.V0) {
            this.V0 = false;
            this.R0 = 0;
            rg2.d().f(this.T0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.c0;
    }

    public final void j() {
        e59 e59Var = this.u0;
        Iterator it = e59Var.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (!imageReceiver.y1) {
                e59Var.remove(imageReceiver);
            } else {
                i++;
            }
            int i3 = imageReceiver.D1;
            if (i3 > 0 && this.z0 >= i3) {
                i2++;
            }
        }
        if (i == i2) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (!g()) {
            hm hmVar = this.n;
            if (hmVar != null) {
                hmVar.b.recycle();
                Arrays.fill(hmVar.a, (Object) null);
                this.n = null;
            }
            hm hmVar2 = this.w;
            if (hmVar2 != null) {
                hmVar2.b.recycle();
                Arrays.fill(hmVar2.a, (Object) null);
                this.w = null;
            }
            do3 do3Var = this.g0;
            if (do3Var != null) {
                do3Var.recycle();
                this.g0 = null;
            }
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i < arrayList.size()) {
                    hm hmVar3 = (hm) arrayList.get(i);
                    hmVar3.b.recycle();
                    Arrays.fill(hmVar3.a, (Object) null);
                    i++;
                } else {
                    arrayList.clear();
                    t();
                    return;
                }
            }
        }
    }

    public final void l(android.graphics.Canvas r20, boolean r21, long r22, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        hm hmVar = this.n;
        if (hmVar != null) {
            return hmVar.b;
        }
        hm hmVar2 = this.r;
        if (hmVar2 != null) {
            return hmVar2.b;
        }
        hm hmVar3 = this.s;
        if (hmVar3 != null) {
            return hmVar3.b;
        }
        return null;
    }

    public final float n() {
        float f;
        int i;
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.N >= 0) {
            f = (float) this.N;
            i = this.d[4];
        } else {
            int[] iArr = this.d;
            f = iArr[3];
            i = iArr[4];
        }
        return f / i;
    }

    public final int o() {
        int i;
        if (this.N >= 0) {
            return (int) this.N;
        }
        hm hmVar = this.r;
        if (hmVar != null && (i = hmVar.e) != 0) {
            return i;
        }
        hm hmVar2 = this.n;
        if (hmVar2 != null) {
            return hmVar2.e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a0 = true;
    }

    public final Bitmap p() {
        int i = this.k0;
        int i2 = this.j0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.v0, false);
        if (a == null) {
            return createBitmap;
        }
        Bitmap bitmap = this.N0;
        if (bitmap == null) {
            int[] iArr = this.d;
            bitmap = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
            this.N0 = bitmap;
        }
        a.c(bitmap, false, this.h0, this.i0, true);
        a.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j, boolean z) {
        int c;
        if (this.y && this.e0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.v0.d();
            }
            if (!z) {
                this.e0.g(j, z);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            AnimatedFileNative animatedFileNative = this.e0;
            if (z) {
                c = animatedFileNative.b(j, createBitmap);
            } else {
                c = animatedFileNative.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z) {
        AnimatedFileNative animatedFileNative = this.e0;
        hm hmVar = this.w;
        if (animatedFileNative == null) {
            if (hmVar != null) {
                return hmVar.b;
            }
            return null;
        }
        if (hmVar == null) {
            if (!this.h.isEmpty()) {
                this.w = (hm) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f = this.n0;
                this.w = new hm(Bitmap.createBitmap((int) (iArr[0] * f), (int) (iArr[1] * f), Bitmap.Config.ARGB_8888));
            }
        }
        this.e0.c(this.w.b, false, this.h0, this.i0, z);
        return this.w.b;
    }

    public final boolean s() {
        if (g()) {
            if (this.n != null || this.r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.c0 && !this.u0.isEmpty()) {
            this.c0 = true;
            this.S0 = false;
            x(false);
            gl.d3(this.J0);
            im imVar = new im(this, (byte) 0);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                gl.d3(imVar);
            } else {
                imVar.run();
            }
        }
    }

    @Override
    public final void stop() {
        this.c0 = false;
        im imVar = new im(this, (byte) 0);
        Typeface typeface = gl.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gl.d3(imVar);
        } else {
            imVar.run();
        }
    }

    public final void t() {
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.t0.isEmpty()) {
            this.L = true;
            return;
        }
        int i = 0;
        this.c0 = false;
        this.d0 = true;
        im imVar = new im(this, (byte) 0);
        Typeface typeface = gl.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gl.d3(imVar);
        } else {
            imVar.run();
        }
        if (this.E0 != null) {
            dk0.c();
            oy8.U0.cancelRunnable(this.E0);
            this.E0 = null;
        }
        if (this.e == null) {
            if (this.e0 != null) {
                this.e0.f();
                this.e0 = null;
            }
            ArrayList arrayList = new ArrayList();
            hm hmVar = this.n;
            if (hmVar != null) {
                arrayList.add(hmVar.b);
            }
            hm hmVar2 = this.r;
            if (hmVar2 != null) {
                arrayList.add(hmVar2.b);
            }
            hm hmVar3 = this.s;
            if (hmVar3 != null) {
                arrayList.add(hmVar3.b);
            }
            hm hmVar4 = this.w;
            if (hmVar4 != null) {
                arrayList.add(hmVar4.b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                hm hmVar5 = (hm) obj;
                if (hmVar5 != null) {
                    arrayList.add(hmVar5.b);
                }
            }
            this.h.clear();
            this.n = null;
            this.r = null;
            this.s = null;
            this.w = null;
            do3 do3Var = this.g0;
            if (do3Var != null) {
                do3Var.recycle();
                this.g0 = null;
            }
            getPaint().setShader(null);
            gl.x2(arrayList);
        } else {
            this.x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.v0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.v0 = null;
        }
        im imVar2 = new im(this, (byte) 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gl.d3(imVar2);
        } else {
            imVar2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        e59 e59Var = this.u0;
        e59Var.remove(imageReceiver);
        if (e59Var.isEmpty()) {
            this.z0 = 0;
        }
        h();
    }

    public final void w(View view) {
        e59 e59Var = this.t0;
        e59Var.remove(view);
        if (e59Var.isEmpty()) {
            if (this.L) {
                u();
                return;
            }
            int[] iArr = this.V;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z) {
        im imVar;
        im imVar2;
        if (this.e == null || z) {
            if ((this.b && (this.s == null || (!this.L0 && this.N >= 0))) || this.r == null) {
                if ((this.n == null || !this.f) && g() && !this.x) {
                    if ((this.c0 || (this.E && !this.F)) && !this.u0.isEmpty() && !this.D0) {
                        if (this.w0) {
                            if (this.y0) {
                                im imVar3 = this.I0;
                                this.e = imVar3;
                                eo3.a(imVar3);
                            } else {
                                if (z && (imVar2 = this.e) != null) {
                                    X0.remove(imVar2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = X0;
                                im imVar4 = this.I0;
                                this.e = imVar4;
                                scheduledThreadPoolExecutor.execute(imVar4);
                            }
                        } else {
                            do3 do3Var = this.g0;
                            if (do3Var == null) {
                                do3Var = new do3("decodeQueue" + this, true);
                                this.g0 = do3Var;
                            }
                            if (z && (imVar = this.e) != null) {
                                do3Var.cancelRunnable(imVar);
                            }
                            do3 do3Var2 = this.g0;
                            im imVar5 = this.I0;
                            this.e = imVar5;
                            do3Var2.postRunnable(imVar5, 0L);
                        }
                        this.L0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j, boolean z, boolean z2) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i;
        synchronized (this.R) {
            this.M = j;
            this.N = j;
            this.L0 = false;
            if (this.e0 != null) {
                this.e0.e();
            }
            if (this.y && (animatedFileDrawableStream = this.v0) != null) {
                animatedFileDrawableStream.b(z);
                this.O = z;
                if (z) {
                    i = 0;
                } else {
                    i = 10;
                }
                this.P = i;
            }
            if (z2 && this.E) {
                this.F = false;
                if (this.e == null) {
                    x(true);
                } else {
                    this.G = true;
                }
            }
        }
    }

    public final void z(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.T;
        if (rectF.left == f && rectF.top == f2 && rectF.right == f6 && rectF.bottom == f5) {
            return;
        }
        rectF.set(f, f2, f6, f5);
        this.x0 = true;
    }

    public km(File file, boolean z, long j, int i, TLRPC.Document document, gl5 gl5Var, Object obj, long j2, int i2, boolean z2) {
        this(file, z, j, i, document, gl5Var, obj, j2, i2, z2, 0, 0, null, document != null ? 1 : 0, true);
    }
}
