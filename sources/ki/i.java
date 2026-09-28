package ki;

import ai.h5;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import ci.f4;
import gg.x1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
public final class i {
    public CaptureRequest.Builder A;
    public long A0;
    public t B;
    public long B0;
    public volatile l0 C;
    public long C0;
    public l0 D;
    public long D0;
    public l0 E;
    public double E0;
    public m0 F;
    public long F0;
    public n0 G;
    public long G0;
    public Range H;
    public long H0;
    public j6.l I;
    public long I0;
    public long J;
    public long J0;
    public volatile float K;
    public long K0;
    public long L0;
    public boolean M;
    public final f4 M0;
    public boolean N;
    public final a N0;
    public int O;
    public final a O0;
    public int P;
    public final d P0;
    public int Q;
    public final e Q0;
    public int R;
    public final f R0;
    public volatile boolean S;
    public final g S0;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public volatile boolean X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final Context f13698a;
    public boolean f13699a0;
    public final CameraManager f13700b;
    public boolean f13701b0;
    public final TextureView f13702c;
    public boolean f13703c0;
    public final q0 d;
    public boolean f13704d0;
    public final int e;
    public boolean f13705e0;
    public final int f13706f;
    public long f13707f0;
    public final m0 f13708g;
    public long f13709g0;
    public final n0 h;
    public long f13710h0;
    public final boolean f13711i;
    public long f13712i0;
    public final m f13713j;
    public long f13714j0;
    public final k2.u f13715k;
    public long f13716k0;
    public long f13718l0;
    public HandlerThread f13719m;
    public long m0;
    public Handler f13720n;
    public long f13721n0;
    public String f13722o;
    public long f13723o0;
    public CameraCharacteristics f13724p;
    public double f13725p0;
    public Size f13726q;
    public long f13727q0;
    public volatile Size f13728r;
    public long f13729r0;
    public volatile int f13730s;
    public long f13731s0;
    public Surface f13732t;
    public long f13733t0;
    public Surface f13734u;
    public long f13735u0;
    public q v;
    public long f13736v0;
    public l f13737w;
    public long f13738w0;
    public l f13739x;
    public long f13740x0;
    public CameraDevice f13741y;
    public long f13742y0;
    public CameraCaptureSession f13743z;
    public long f13744z0;
    public final Rect f13717l = new Rect();
    public float L = 1.0f;

    public i(Context context, TextureView textureView, q0 q0Var, int i10, m0 m0Var, n0 n0Var, boolean z10, m mVar, k2.u uVar) {
        f4 f4Var = new f4(this, 2);
        this.M0 = f4Var;
        this.N0 = new a(this, 3);
        this.O0 = new a(this, 4);
        this.P0 = new d(this, 0);
        this.Q0 = new e(this);
        this.R0 = new f(this);
        this.S0 = new g(this);
        this.f13698a = context.getApplicationContext();
        this.f13700b = (CameraManager) context.getSystemService("camera");
        this.f13702c = textureView;
        this.d = q0Var;
        this.e = q0Var.f13831a;
        this.f13706f = i10;
        this.f13708g = m0Var;
        this.h = n0Var;
        this.f13711i = z10;
        this.f13713j = mVar;
        this.f13715k = uVar;
        textureView.addOnLayoutChangeListener(f4Var);
    }

    public static int A(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float B(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d10 = j10;
        double d11 = j3 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static long b(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float c(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (((float) j3) / ((float) j10)) / 1000000.0f;
    }

    public static j6.l e(Size[] sizeArr, q0 q0Var, m0 m0Var) {
        int i10;
        j6.l g10;
        m0 m0Var2;
        j6.l g11;
        m0 m0Var3 = m0.f13792c;
        if (m0Var == m0Var3) {
            i10 = q0Var.f13831a;
        } else {
            q0 q0Var2 = q0.P480;
            m0 m0Var4 = m0.f13790a;
            if (q0Var == q0Var2) {
                if (m0Var == m0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (m0Var != m0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l g12 = g(sizeArr, i10, m0Var);
        if (g12 != null) {
            return g12;
        }
        if (q0Var == q0.P360 && m0Var == (m0Var2 = m0.f13791b) && (g11 = g(sizeArr, 480, m0Var2)) != null) {
            return g11;
        }
        int i11 = q0Var.f13831a;
        if (m0Var != m0Var3 && (g10 = g(sizeArr, i11, m0Var3)) != null) {
            return g10;
        }
        int i12 = q0Var.f13831a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (A(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || b(size2) < b(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (A(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && b(size3) < b(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(f(sizeArr, size), size, m0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size f(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(A(size2) - 720);
                if (abs != abs2) {
                    compare = Integer.compare(abs, abs2);
                } else {
                    compare = Long.compare(b(size3), b(size2));
                }
                if (compare < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l g(Size[] sizeArr, int i10, m0 m0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int A = A(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (A >= i10 && A <= i11 && max <= min) {
                Size f7 = f(sizeArr, size);
                j6.l lVar2 = new j6.l(f7, size, m0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f12900b;
                    int abs = Math.abs(Math.min(f7.getWidth(), f7.getHeight()) - 720);
                    Size size3 = (Size) lVar.f12901c;
                    int abs2 = Math.abs(A(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long b10 = b(size) + b(f7);
                        long b11 = b(size3) + b(size2);
                        if (b10 != b11) {
                            compare = Long.compare(b10, b11);
                        } else {
                            compare = Long.compare(b(size), b(size3));
                        }
                    }
                    if (compare >= 0) {
                    }
                }
                lVar = lVar2;
            }
        }
        return lVar;
    }

    public static long m(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range o(Range[] rangeArr, int i10) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        for (Range range2 : rangeArr) {
            if (range2.contains((Range) Integer.valueOf(i10)) && (range == null || ((Integer) range2.getLower()).intValue() > ((Integer) range.getLower()).intValue() || (((Integer) range2.getLower()).equals(range.getLower()) && ((Integer) range2.getUpper()).intValue() < ((Integer) range.getUpper()).intValue()))) {
                range = range2;
            }
        }
        return range;
    }

    public final void C(t tVar, long j3, l0 l0Var) {
        if (this.f13719m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f13719m = handlerThread;
            handlerThread.start();
            this.f13720n = new Handler(this.f13719m.getLooper());
        }
        this.B = tVar;
        this.J = j3;
        this.C = l0Var;
        this.S = true;
        this.Y = false;
        this.f13739x = null;
        this.Z = true;
        this.f13707f0 = SystemClock.elapsedRealtimeNanos();
        v();
        u();
        m mVar = this.f13713j;
        mVar.b("camera segment start: facing=" + l0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f13702c.isAvailable());
        this.f13702c.setSurfaceTextureListener(this.P0);
        Handler handler = this.f13720n;
        if (this.S && handler != null && this.f13702c.isAvailable()) {
            handler.post(new a(this, 5));
        }
    }

    public final boolean D() {
        Handler handler = this.f13720n;
        if (!this.S || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.f13713j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean E(l0 l0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (l0Var == l0.f13784a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f13700b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((n0) w(str, cameraCharacteristics, streamConfigurationMap, outputSizes, e(outputSizes, this.d, this.f13708g)).f359b) == n0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void F(l0 l0Var) {
        if (this.S && !this.U && l0Var != this.D) {
            this.U = true;
            this.W = true;
            this.M = false;
            this.N = false;
            this.K = 0.0f;
            k2.u uVar = this.f13715k;
            ((s0) uVar.f13369b).h.post(new h0(0, uVar, l0Var));
            this.f13712i0 = SystemClock.elapsedRealtimeNanos();
            m mVar = this.f13713j;
            mVar.b("camera device switch started: from=" + this.D + ", to=" + l0Var);
            q qVar = this.v;
            if (qVar != null) {
                l0 l0Var2 = this.D;
                Handler handler = qVar.f13816m;
                if (qVar.Z && handler != null) {
                    handler.post(new h5(qVar, l0Var2, l0Var, handler, 20));
                }
            }
            i();
            CameraDevice cameraDevice = this.f13741y;
            if (cameraDevice != null) {
                this.f13741y = null;
                cameraDevice.close();
            } else if (!this.T) {
                this.U = false;
                r();
            }
        }
    }

    public final void G() {
        Size size;
        int width;
        int height;
        Integer num;
        if (this.Z && (size = this.f13728r) != null && this.f13702c.getWidth() != 0 && this.f13702c.getHeight() != 0) {
            int min = Math.min(this.f13730s, Math.min(size.getWidth(), size.getHeight()));
            TextureView textureView = this.f13702c;
            boolean z10 = false;
            if (this.f13724p != null && textureView.getDisplay() != null && (num = (Integer) this.f13724p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
                int intValue = ((num.intValue() - (textureView.getDisplay().getRotation() * 90)) + 360) % 360;
                if (intValue == 90 || intValue == 270) {
                    z10 = true;
                }
            }
            if (z10) {
                width = size.getHeight();
            } else {
                width = size.getWidth();
            }
            float f7 = min;
            float f10 = width / f7;
            if (z10) {
                height = size.getWidth();
            } else {
                height = size.getHeight();
            }
            float f11 = height / f7;
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f11, this.f13702c.getWidth() * 0.5f, this.f13702c.getHeight() * 0.5f);
            this.f13702c.setTransform(matrix);
            this.f13713j.b("preview transform: view=" + this.f13702c.getWidth() + "x" + this.f13702c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
        }
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ki.i.a():void");
    }

    public final void d() {
        Handler handler = this.f13720n;
        if (handler != null) {
            handler.removeCallbacks(this.N0);
        }
        this.f13739x = null;
    }

    public final void h() {
        d();
        this.T = false;
        this.U = false;
        this.V = false;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.A = null;
        this.N = false;
        i();
        CameraDevice cameraDevice = this.f13741y;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f13741y = null;
        }
        Surface surface = this.f13732t;
        if (surface != null) {
            surface.release();
            this.f13732t = null;
        }
        q qVar = this.v;
        if (qVar != null) {
            qVar.h();
            this.v = null;
        }
        this.f13734u = null;
    }

    public final void i() {
        CameraCaptureSession cameraCaptureSession = this.f13743z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f13743z = null;
        }
        this.A = null;
    }

    public final void j() {
        CameraDevice cameraDevice = this.f13741y;
        if (cameraDevice != null && this.f13732t != null && this.f13734u != null) {
            try {
                this.f13710h0 = SystemClock.elapsedRealtimeNanos();
                m mVar = this.f13713j;
                mVar.b("capture session requested: preview=" + this.f13726q + ", recording=" + this.f13728r + ", fpsRange=" + this.H);
                cameraDevice.createCaptureSession(Arrays.asList(this.f13732t, this.f13734u), this.R0, this.f13720n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                if (this.G == n0.FPS_60) {
                    n("60 fps session creation rejected", e);
                } else {
                    t(e);
                }
            }
        }
    }

    public final void k() {
        Surface surface;
        String str;
        Surface surface2;
        t tVar = this.B;
        long j3 = this.J;
        int i10 = this.e;
        int i11 = this.f13706f;
        int i12 = this.G.f13797a;
        m mVar = this.f13713j;
        k2.u uVar = this.f13715k;
        Objects.requireNonNull(uVar);
        l lVar = new l(tVar, j3, i10, i11, i12, mVar, new b(uVar));
        this.f13737w = lVar;
        synchronized (lVar) {
            if (lVar.f13782y) {
                surface = lVar.f13774p;
            } else {
                lVar.m();
                long nanoTime = System.nanoTime();
                try {
                    lVar.b();
                    lVar.a();
                    lVar.f13771m.start();
                    lVar.f13782y = true;
                    m mVar2 = lVar.f13765f;
                    mVar2.b("codecs prepared: video=" + lVar.f13771m.getName() + ", audio=" + lVar.f13772n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = lVar.f13774p;
                } catch (IOException | RuntimeException e) {
                    lVar.j();
                    throw e;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.f13728r;
        int i13 = this.e;
        int i14 = this.f13730s;
        boolean p5 = p();
        boolean z10 = this.f13711i;
        m mVar3 = this.f13713j;
        l lVar2 = this.f13737w;
        k2.u uVar2 = this.f13715k;
        Objects.requireNonNull(uVar2);
        q qVar = new q(size, surface3, i13, i14, p5, z10, mVar3, lVar2, new b(uVar2));
        this.v = qVar;
        qVar.f13805b0 = new a(this, 1);
        q qVar2 = this.v;
        if (qVar2.Z) {
            surface2 = qVar2.f13818o;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            qVar2.f13815l = handlerThread;
            handlerThread.start();
            qVar2.Y = System.nanoTime();
            m mVar4 = qVar2.e;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(qVar2.f13802a);
            sb2.append(", crop=");
            sb2.append(qVar2.f13810f);
            sb2.append(", output=");
            sb2.append(qVar2.f13806c);
            sb2.append("x");
            sb2.append(qVar2.f13806c);
            sb2.append(", filter=");
            if (qVar2.f13810f == qVar2.f13806c) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(qVar2.d);
            mVar4.b(sb2.toString());
            Handler handler = new Handler(qVar2.f13815l.getLooper());
            qVar2.f13816m = handler;
            handler.post(new x1(29, qVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (qVar2.f13808d0 == null) {
                    surface2 = qVar2.f13818o;
                } else {
                    RuntimeException runtimeException = qVar2.f13808d0;
                    qVar2.f13808d0 = null;
                    qVar2.h();
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                qVar2.h();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.f13734u = surface2;
    }

    public final android.hardware.camera2.CaptureRequest.Builder l(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.i.l(boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void n(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        if (this.f13703c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            t(exc);
            return;
        }
        this.f13703c0 = true;
        i();
        j6.l lVar = this.I;
        if (lVar == null) {
            t(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.G = n0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f13724p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.H = o(rangeArr, 30);
        this.f13726q = (Size) lVar.f12900b;
        this.f13728r = (Size) lVar.f12901c;
        this.f13730s = lVar.f12899a;
        this.F = (m0) lVar.d;
        SurfaceTexture surfaceTexture = this.f13702c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f13726q.getWidth(), this.f13726q.getHeight());
        }
        l lVar2 = this.f13737w;
        if (lVar2 != null) {
            synchronized (lVar2) {
                z10 = lVar2.f13783z;
            }
            if (z10) {
                t(new IllegalStateException("Unable to change encoder frame rate after recording started", exc));
                return;
            }
        }
        q qVar = this.v;
        if (qVar != null) {
            qVar.h();
            this.v = null;
        }
        l lVar3 = this.f13737w;
        if (lVar3 != null) {
            lVar3.q();
            this.f13737w = null;
        }
        this.f13734u = null;
        try {
            k();
            u();
            m mVar = this.f13713j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f13726q);
            sb2.append(", recording=");
            sb2.append(this.f13728r);
            sb2.append(", crop=");
            sb2.append(this.f13730s);
            sb2.append(", fpsRange=");
            sb2.append(this.H);
            mVar.b(sb2.toString());
            Handler handler = this.f13720n;
            if (this.S && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e) {
            t(e);
        }
    }

    public final boolean p() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.f13724p;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        CameraCharacteristics cameraCharacteristics;
        if (this.D == l0.f13785b && (cameraCharacteristics = this.f13724p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void r() {
        if (this.S && !this.T && this.f13741y == null) {
            if (f0.e.b(this.f13698a, "android.permission.CAMERA") != 0) {
                t(new SecurityException("Camera permission is not granted"));
            } else if (f0.e.b(this.f13698a, "android.permission.RECORD_AUDIO") != 0) {
                t(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    x(this.C);
                    SurfaceTexture surfaceTexture = this.f13702c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(this.f13726q.getWidth(), this.f13726q.getHeight());
                        if (this.f13732t == null) {
                            this.f13732t = new Surface(surfaceTexture);
                        }
                        if (this.f13737w == null) {
                            k();
                        } else {
                            q qVar = this.v;
                            if (qVar != null) {
                                qVar.j(this.f13728r, this.f13730s, p());
                                Surface surface = this.v.f13818o;
                                if (surface != null) {
                                    this.f13734u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        this.T = true;
                        this.f13709g0 = SystemClock.elapsedRealtimeNanos();
                        m mVar = this.f13713j;
                        mVar.b("camera open requested: id=" + this.f13722o + ", preview=" + this.f13726q + ", recording=" + this.f13728r + ", crop=" + this.f13730s);
                        this.f13700b.openCamera(this.f13722o, this.Q0, this.f13720n);
                    }
                } catch (Exception e) {
                    this.T = false;
                    t(e);
                }
            }
        }
    }

    public final void s() {
        this.S = false;
        this.f13702c.setSurfaceTextureListener(null);
        this.f13702c.removeOnLayoutChangeListener(this.M0);
        Handler handler = this.f13720n;
        HandlerThread handlerThread = this.f13719m;
        this.f13720n = null;
        this.f13719m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new x1(28, this, handlerThread));
        }
    }

    public final void t(Exception exc) {
        this.f13713j.a("camera error", exc);
        k2.u uVar = this.f13715k;
        ((s0) uVar.f13369b).h.post(new h0(1, uVar, exc));
    }

    public final void u() {
        this.f13742y0 = 0L;
        this.f13744z0 = 0L;
        this.A0 = 0L;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0L;
        this.E0 = 0.0d;
        this.F0 = 0L;
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
    }

    public final void v() {
        this.f13714j0 = 0L;
        this.f13716k0 = 0L;
        this.f13718l0 = 0L;
        this.m0 = 0L;
        this.f13721n0 = 0L;
        this.f13723o0 = 0L;
        this.f13725p0 = 0.0d;
        this.f13727q0 = 0L;
        this.f13729r0 = 0L;
        this.f13731s0 = 0L;
        this.f13733t0 = 0L;
        this.f13735u0 = 0L;
        this.f13736v0 = 0L;
        this.f13738w0 = 0L;
        this.f13740x0 = 0L;
    }

    public final aa.a w(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        String str2;
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        m mVar = this.f13713j;
        n0 n0Var = this.h;
        n0 n0Var2 = n0.FPS_30;
        if (n0Var != n0Var2 && !this.f13705e0) {
            int i10 = n0Var.f13797a;
            Range o9 = o(rangeArr3, i10);
            if (o9 != null) {
                ArrayList arrayList = new ArrayList(sizeArr2.length);
                int length = sizeArr2.length;
                int i11 = 0;
                while (i11 < length) {
                    Size size = sizeArr2[i11];
                    int i12 = i11;
                    long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                    if (outputMinFrameDuration > 0) {
                        rangeArr2 = rangeArr3;
                        if (outputMinFrameDuration > 1000000000 / i10) {
                            i11 = i12 + 1;
                            rangeArr3 = rangeArr2;
                            sizeArr2 = sizeArr;
                        }
                    } else {
                        rangeArr2 = rangeArr3;
                    }
                    arrayList.add(size);
                    i11 = i12 + 1;
                    rangeArr3 = rangeArr2;
                    sizeArr2 = sizeArr;
                }
                rangeArr = rangeArr3;
                Size[] sizeArr3 = (Size[]) arrayList.toArray(new Size[0]);
                try {
                    j6.l e = e(sizeArr3, this.d, this.f13708g);
                    mVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + o9 + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                    return new aa.a(n0.FPS_60, o9, e, false, 27);
                } catch (RuntimeException unused) {
                    mVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr3));
                }
            } else {
                rangeArr = rangeArr3;
                mVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range o10 = o(rangeArr, 30);
            mVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + o10);
            return new aa.a(n0Var2, o10, lVar, false, 27);
        }
        Range o11 = o(rangeArr3, 30);
        StringBuilder w10 = a4.a.w("fps selection: id=", str, ", requested=");
        w10.append(n0Var.f13797a);
        w10.append(", mode=REGULAR, range=");
        w10.append(o11);
        if (this.f13705e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        w10.append(str2);
        mVar.b(w10.toString());
        return new aa.a(n0Var2, o11, lVar, false, 27);
    }

    public final void x(ki.l0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: ki.i.x(ki.l0):void");
    }

    public final void y(boolean z10) {
        Handler handler = this.f13720n;
        if (this.S && handler != null) {
            handler.post(new bi.f(8, this, z10));
        }
    }

    public final boolean z(float f7) {
        this.K = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f13720n;
        if (this.S && handler != null) {
            handler.removeCallbacks(this.O0);
            handler.post(this.O0);
            return true;
        }
        return false;
    }
}
