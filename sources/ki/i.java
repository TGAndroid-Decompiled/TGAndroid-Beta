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
import ii.n4;
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
    public final Context f14892a;
    public boolean f14893a0;
    public final CameraManager f14894b;
    public boolean f14895b0;
    public final TextureView f14896c;
    public boolean f14897c0;
    public final q0 d;
    public boolean f14898d0;
    public final int f14899e;
    public boolean f14900e0;
    public final int f14901f;
    public long f14902f0;
    public final m0 f14903g;
    public long f14904g0;
    public final n0 h;
    public long f14905h0;
    public final boolean f14906i;
    public long f14907i0;
    public final m f14908j;
    public long f14909j0;
    public final n4 f14910k;
    public long f14911k0;
    public long f14913l0;
    public HandlerThread f14914m;
    public long m0;
    public Handler f14915n;
    public long f14916n0;
    public String f14917o;
    public long f14918o0;
    public CameraCharacteristics f14919p;
    public double f14920p0;
    public Size f14921q;
    public long f14922q0;
    public volatile Size f14923r;
    public long f14924r0;
    public volatile int f14925s;
    public long f14926s0;
    public Surface f14927t;
    public long f14928t0;
    public Surface f14929u;
    public long f14930u0;
    public q v;
    public long f14931v0;
    public l f14932w;
    public long f14933w0;
    public l f14934x;
    public long f14935x0;
    public CameraDevice f14936y;
    public long f14937y0;
    public CameraCaptureSession f14938z;
    public long f14939z0;
    public final Rect f14912l = new Rect();
    public float L = 1.0f;

    public i(Context context, TextureView textureView, q0 q0Var, int i10, m0 m0Var, n0 n0Var, boolean z10, m mVar, n4 n4Var) {
        f4 f4Var = new f4(this, 2);
        this.M0 = f4Var;
        this.N0 = new a(this, 3);
        this.O0 = new a(this, 4);
        this.P0 = new d(this, 0);
        this.Q0 = new e(this);
        this.R0 = new f(this);
        this.S0 = new g(this);
        this.f14892a = context.getApplicationContext();
        this.f14894b = (CameraManager) context.getSystemService("camera");
        this.f14896c = textureView;
        this.d = q0Var;
        this.f14899e = q0Var.f15031a;
        this.f14901f = i10;
        this.f14903g = m0Var;
        this.h = n0Var;
        this.f14906i = z10;
        this.f14908j = mVar;
        this.f14910k = n4Var;
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
        m0 m0Var3 = m0.f14990c;
        if (m0Var == m0Var3) {
            i10 = q0Var.f15031a;
        } else {
            q0 q0Var2 = q0.P480;
            m0 m0Var4 = m0.f14988a;
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
        if (q0Var == q0.P360 && m0Var == (m0Var2 = m0.f14989b) && (g11 = g(sizeArr, 480, m0Var2)) != null) {
            return g11;
        }
        int i11 = q0Var.f15031a;
        if (m0Var != m0Var3 && (g10 = g(sizeArr, i11, m0Var3)) != null) {
            return g10;
        }
        int i12 = q0Var.f15031a;
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
                    Size size2 = (Size) lVar.f14024b;
                    int abs = Math.abs(Math.min(f7.getWidth(), f7.getHeight()) - 720);
                    Size size3 = (Size) lVar.f14025c;
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
        if (this.f14914m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f14914m = handlerThread;
            handlerThread.start();
            this.f14915n = new Handler(this.f14914m.getLooper());
        }
        this.B = tVar;
        this.J = j3;
        this.C = l0Var;
        this.S = true;
        this.Y = false;
        this.f14934x = null;
        this.Z = true;
        this.f14902f0 = SystemClock.elapsedRealtimeNanos();
        v();
        u();
        m mVar = this.f14908j;
        mVar.b("camera segment start: facing=" + l0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f14896c.isAvailable());
        this.f14896c.setSurfaceTextureListener(this.P0);
        Handler handler = this.f14915n;
        if (this.S && handler != null && this.f14896c.isAvailable()) {
            handler.post(new a(this, 5));
        }
    }

    public final boolean D() {
        Handler handler = this.f14915n;
        if (!this.S || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.f14908j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean E(l0 l0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (l0Var == l0.f14982a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f14894b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((n0) w(str, cameraCharacteristics, streamConfigurationMap, outputSizes, e(outputSizes, this.d, this.f14903g)).f386b) == n0.FPS_60) {
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
            n4 n4Var = this.f14910k;
            ((s0) n4Var.f12543b).f15049i.post(new h0(0, n4Var, l0Var));
            this.f14907i0 = SystemClock.elapsedRealtimeNanos();
            m mVar = this.f14908j;
            mVar.b("camera device switch started: from=" + this.D + ", to=" + l0Var);
            q qVar = this.v;
            if (qVar != null) {
                l0 l0Var2 = this.D;
                Handler handler = qVar.f15016m;
                if (qVar.Z && handler != null) {
                    handler.post(new h5(qVar, l0Var2, l0Var, handler, 20));
                }
            }
            i();
            CameraDevice cameraDevice = this.f14936y;
            if (cameraDevice != null) {
                this.f14936y = null;
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
        if (this.Z && (size = this.f14923r) != null && this.f14896c.getWidth() != 0 && this.f14896c.getHeight() != 0) {
            int min = Math.min(this.f14925s, Math.min(size.getWidth(), size.getHeight()));
            TextureView textureView = this.f14896c;
            boolean z10 = false;
            if (this.f14919p != null && textureView.getDisplay() != null && (num = (Integer) this.f14919p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
            matrix.setScale(f10, f11, this.f14896c.getWidth() * 0.5f, this.f14896c.getHeight() * 0.5f);
            this.f14896c.setTransform(matrix);
            this.f14908j.b("preview transform: view=" + this.f14896c.getWidth() + "x" + this.f14896c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
        }
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ki.i.a():void");
    }

    public final void d() {
        Handler handler = this.f14915n;
        if (handler != null) {
            handler.removeCallbacks(this.N0);
        }
        this.f14934x = null;
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
        CameraDevice cameraDevice = this.f14936y;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f14936y = null;
        }
        Surface surface = this.f14927t;
        if (surface != null) {
            surface.release();
            this.f14927t = null;
        }
        q qVar = this.v;
        if (qVar != null) {
            qVar.h();
            this.v = null;
        }
        this.f14929u = null;
    }

    public final void i() {
        CameraCaptureSession cameraCaptureSession = this.f14938z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f14938z = null;
        }
        this.A = null;
    }

    public final void j() {
        CameraDevice cameraDevice = this.f14936y;
        if (cameraDevice != null && this.f14927t != null && this.f14929u != null) {
            try {
                this.f14905h0 = SystemClock.elapsedRealtimeNanos();
                m mVar = this.f14908j;
                mVar.b("capture session requested: preview=" + this.f14921q + ", recording=" + this.f14923r + ", fpsRange=" + this.H);
                cameraDevice.createCaptureSession(Arrays.asList(this.f14927t, this.f14929u), this.R0, this.f14915n);
            } catch (CameraAccessException | IllegalArgumentException e7) {
                if (this.G == n0.FPS_60) {
                    n("60 fps session creation rejected", e7);
                } else {
                    t(e7);
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
        int i10 = this.f14899e;
        int i11 = this.f14901f;
        int i12 = this.G.f14995a;
        m mVar = this.f14908j;
        n4 n4Var = this.f14910k;
        Objects.requireNonNull(n4Var);
        l lVar = new l(tVar, j3, i10, i11, i12, mVar, new b(n4Var));
        this.f14932w = lVar;
        synchronized (lVar) {
            if (lVar.f14980y) {
                surface = lVar.f14972p;
            } else {
                lVar.m();
                long nanoTime = System.nanoTime();
                try {
                    lVar.b();
                    lVar.a();
                    lVar.f14969m.start();
                    lVar.f14980y = true;
                    m mVar2 = lVar.f14963f;
                    mVar2.b("codecs prepared: video=" + lVar.f14969m.getName() + ", audio=" + lVar.f14970n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = lVar.f14972p;
                } catch (IOException | RuntimeException e7) {
                    lVar.j();
                    throw e7;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.f14923r;
        int i13 = this.f14899e;
        int i14 = this.f14925s;
        boolean p5 = p();
        boolean z10 = this.f14906i;
        m mVar3 = this.f14908j;
        l lVar2 = this.f14932w;
        n4 n4Var2 = this.f14910k;
        Objects.requireNonNull(n4Var2);
        q qVar = new q(size, surface3, i13, i14, p5, z10, mVar3, lVar2, new b(n4Var2));
        this.v = qVar;
        qVar.f15004b0 = new a(this, 1);
        q qVar2 = this.v;
        if (qVar2.Z) {
            surface2 = qVar2.f15018o;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            qVar2.f15015l = handlerThread;
            handlerThread.start();
            qVar2.Y = System.nanoTime();
            m mVar4 = qVar2.f15008e;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(qVar2.f15001a);
            sb2.append(", crop=");
            sb2.append(qVar2.f15010f);
            sb2.append(", output=");
            sb2.append(qVar2.f15005c);
            sb2.append("x");
            sb2.append(qVar2.f15005c);
            sb2.append(", filter=");
            if (qVar2.f15010f == qVar2.f15005c) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(qVar2.d);
            mVar4.b(sb2.toString());
            Handler handler = new Handler(qVar2.f15015l.getLooper());
            qVar2.f15016m = handler;
            handler.post(new x1(29, qVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (qVar2.f15007d0 == null) {
                    surface2 = qVar2.f15018o;
                } else {
                    RuntimeException runtimeException = qVar2.f15007d0;
                    qVar2.f15007d0 = null;
                    qVar2.h();
                    throw runtimeException;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                qVar2.h();
                throw new IllegalStateException("GL initialization was interrupted", e10);
            }
        }
        this.f14929u = surface2;
    }

    public final android.hardware.camera2.CaptureRequest.Builder l(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.i.l(boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void n(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        if (this.f14897c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            t(exc);
            return;
        }
        this.f14897c0 = true;
        i();
        j6.l lVar = this.I;
        if (lVar == null) {
            t(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.G = n0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f14919p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.H = o(rangeArr, 30);
        this.f14921q = (Size) lVar.f14024b;
        this.f14923r = (Size) lVar.f14025c;
        this.f14925s = lVar.f14023a;
        this.F = (m0) lVar.d;
        SurfaceTexture surfaceTexture = this.f14896c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f14921q.getWidth(), this.f14921q.getHeight());
        }
        l lVar2 = this.f14932w;
        if (lVar2 != null) {
            synchronized (lVar2) {
                z10 = lVar2.f14981z;
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
        l lVar3 = this.f14932w;
        if (lVar3 != null) {
            lVar3.q();
            this.f14932w = null;
        }
        this.f14929u = null;
        try {
            k();
            u();
            m mVar = this.f14908j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f14921q);
            sb2.append(", recording=");
            sb2.append(this.f14923r);
            sb2.append(", crop=");
            sb2.append(this.f14925s);
            sb2.append(", fpsRange=");
            sb2.append(this.H);
            mVar.b(sb2.toString());
            Handler handler = this.f14915n;
            if (this.S && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e7) {
            t(e7);
        }
    }

    public final boolean p() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.f14919p;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        CameraCharacteristics cameraCharacteristics;
        if (this.D == l0.f14983b && (cameraCharacteristics = this.f14919p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void r() {
        if (this.S && !this.T && this.f14936y == null) {
            if (f0.e.b(this.f14892a, "android.permission.CAMERA") != 0) {
                t(new SecurityException("Camera permission is not granted"));
            } else if (f0.e.b(this.f14892a, "android.permission.RECORD_AUDIO") != 0) {
                t(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    x(this.C);
                    SurfaceTexture surfaceTexture = this.f14896c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(this.f14921q.getWidth(), this.f14921q.getHeight());
                        if (this.f14927t == null) {
                            this.f14927t = new Surface(surfaceTexture);
                        }
                        if (this.f14932w == null) {
                            k();
                        } else {
                            q qVar = this.v;
                            if (qVar != null) {
                                qVar.j(this.f14923r, this.f14925s, p());
                                Surface surface = this.v.f15018o;
                                if (surface != null) {
                                    this.f14929u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        this.T = true;
                        this.f14904g0 = SystemClock.elapsedRealtimeNanos();
                        m mVar = this.f14908j;
                        mVar.b("camera open requested: id=" + this.f14917o + ", preview=" + this.f14921q + ", recording=" + this.f14923r + ", crop=" + this.f14925s);
                        this.f14894b.openCamera(this.f14917o, this.Q0, this.f14915n);
                    }
                } catch (Exception e7) {
                    this.T = false;
                    t(e7);
                }
            }
        }
    }

    public final void s() {
        this.S = false;
        this.f14896c.setSurfaceTextureListener(null);
        this.f14896c.removeOnLayoutChangeListener(this.M0);
        Handler handler = this.f14915n;
        HandlerThread handlerThread = this.f14914m;
        this.f14915n = null;
        this.f14914m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new x1(28, this, handlerThread));
        }
    }

    public final void t(Exception exc) {
        this.f14908j.a("camera error", exc);
        n4 n4Var = this.f14910k;
        ((s0) n4Var.f12543b).f15049i.post(new h0(1, n4Var, exc));
    }

    public final void u() {
        this.f14937y0 = 0L;
        this.f14939z0 = 0L;
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
        this.f14909j0 = 0L;
        this.f14911k0 = 0L;
        this.f14913l0 = 0L;
        this.m0 = 0L;
        this.f14916n0 = 0L;
        this.f14918o0 = 0L;
        this.f14920p0 = 0.0d;
        this.f14922q0 = 0L;
        this.f14924r0 = 0L;
        this.f14926s0 = 0L;
        this.f14928t0 = 0L;
        this.f14930u0 = 0L;
        this.f14931v0 = 0L;
        this.f14933w0 = 0L;
        this.f14935x0 = 0L;
    }

    public final aa.a w(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        String str2;
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        m mVar = this.f14908j;
        n0 n0Var = this.h;
        n0 n0Var2 = n0.FPS_30;
        if (n0Var != n0Var2 && !this.f14900e0) {
            int i10 = n0Var.f14995a;
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
                    j6.l e7 = e(sizeArr3, this.d, this.f14903g);
                    mVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + o9 + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                    return new aa.a(n0.FPS_60, o9, e7, false, 27);
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
        StringBuilder v = a4.a.v("fps selection: id=", str, ", requested=");
        v.append(n0Var.f14995a);
        v.append(", mode=REGULAR, range=");
        v.append(o11);
        if (this.f14900e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        v.append(str2);
        mVar.b(v.toString());
        return new aa.a(n0Var2, o11, lVar, false, 27);
    }

    public final void x(ki.l0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: ki.i.x(ki.l0):void");
    }

    public final void y(boolean z10) {
        Handler handler = this.f14915n;
        if (this.S && handler != null) {
            handler.post(new bi.f(8, this, z10));
        }
    }

    public final boolean z(float f7) {
        this.K = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f14915n;
        if (this.S && handler != null) {
            handler.removeCallbacks(this.O0);
            handler.post(this.O0);
            return true;
        }
        return false;
    }
}
