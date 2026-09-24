package ki;

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
public final class h {
    public t A;
    public long A0;
    public volatile k0 B;
    public long B0;
    public k0 C;
    public long C0;
    public k0 D;
    public double D0;
    public l0 E;
    public long E0;
    public m0 F;
    public long F0;
    public Range G;
    public long G0;
    public j6.l H;
    public long H0;
    public long I;
    public long I0;
    public volatile float J;
    public long J0;
    public long K0;
    public boolean L;
    public final f4 L0;
    public boolean M;
    public final b M0;
    public int N;
    public final c N0;
    public int O;
    public final d O0;
    public int P;
    public final e P0;
    public int Q;
    public final f Q0;
    public volatile boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public volatile boolean W;
    public volatile boolean X;
    public volatile boolean Y;
    public boolean Z;
    public final Context f13692a;
    public boolean f13693a0;
    public final CameraManager f13694b;
    public boolean f13695b0;
    public final TextureView f13696c;
    public boolean f13697c0;
    public final p0 d;
    public boolean f13698d0;
    public final int e;
    public long f13699e0;
    public final int f13700f;
    public long f13701f0;
    public final l0 f13702g;
    public long f13703g0;
    public final m0 h;
    public long f13704h0;
    public final boolean f13705i;
    public long f13706i0;
    public final l f13707j;
    public long f13708j0;
    public final k2.u f13709k;
    public long f13710k0;
    public long f13712l0;
    public HandlerThread f13713m;
    public long m0;
    public Handler f13714n;
    public long f13715n0;
    public String f13716o;
    public double f13717o0;
    public CameraCharacteristics f13718p;
    public long f13719p0;
    public Size f13720q;
    public long f13721q0;
    public volatile Size f13722r;
    public long f13723r0;
    public volatile int f13724s;
    public long f13725s0;
    public Surface f13726t;
    public long f13727t0;
    public Surface f13728u;
    public long f13729u0;
    public q v;
    public long f13730v0;
    public k f13731w;
    public long f13732w0;
    public CameraDevice f13733x;
    public long f13734x0;
    public CameraCaptureSession f13735y;
    public long f13736y0;
    public CaptureRequest.Builder f13737z;
    public long f13738z0;
    public final Rect f13711l = new Rect();
    public float K = 1.0f;

    public h(Context context, TextureView textureView, p0 p0Var, int i10, l0 l0Var, m0 m0Var, boolean z10, l lVar, k2.u uVar) {
        f4 f4Var = new f4(this, 2);
        this.L0 = f4Var;
        this.M0 = new b(this, 2);
        this.N0 = new c(this, 0);
        this.O0 = new d(this);
        this.P0 = new e(this);
        this.Q0 = new f(this);
        this.f13692a = context.getApplicationContext();
        this.f13694b = (CameraManager) context.getSystemService("camera");
        this.f13696c = textureView;
        this.d = p0Var;
        this.e = p0Var.f13801a;
        this.f13700f = i10;
        this.f13702g = l0Var;
        this.h = m0Var;
        this.f13705i = z10;
        this.f13707j = lVar;
        this.f13709k = uVar;
        textureView.addOnLayoutChangeListener(f4Var);
    }

    public static float A(double d, long j3, long j10) {
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

    public static j6.l d(Size[] sizeArr, p0 p0Var, l0 l0Var) {
        int i10;
        j6.l f7;
        l0 l0Var2;
        j6.l f10;
        l0 l0Var3 = l0.f13786c;
        if (l0Var == l0Var3) {
            i10 = p0Var.f13801a;
        } else {
            p0 p0Var2 = p0.P480;
            l0 l0Var4 = l0.f13784a;
            if (p0Var == p0Var2) {
                if (l0Var == l0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (l0Var != l0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l f11 = f(sizeArr, i10, l0Var);
        if (f11 != null) {
            return f11;
        }
        if (p0Var == p0.P360 && l0Var == (l0Var2 = l0.f13785b) && (f10 = f(sizeArr, 480, l0Var2)) != null) {
            return f10;
        }
        int i11 = p0Var.f13801a;
        if (l0Var != l0Var3 && (f7 = f(sizeArr, i11, l0Var3)) != null) {
            return f7;
        }
        int i12 = p0Var.f13801a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (z(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || b(size2) < b(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (z(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && b(size3) < b(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(e(sizeArr, size), size, l0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size e(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(z(size2) - 720);
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

    public static j6.l f(Size[] sizeArr, int i10, l0 l0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int z10 = z(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (z10 >= i10 && z10 <= i11 && max <= min) {
                Size e = e(sizeArr, size);
                j6.l lVar2 = new j6.l(e, size, l0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f12900b;
                    int abs = Math.abs(Math.min(e.getWidth(), e.getHeight()) - 720);
                    Size size3 = (Size) lVar.f12901c;
                    int abs2 = Math.abs(z(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long b10 = b(size) + b(e);
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

    public static long l(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range n(Range[] rangeArr, int i10) {
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

    public static int z(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public final void B(t tVar, long j3, k0 k0Var) {
        if (this.f13713m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f13713m = handlerThread;
            handlerThread.start();
            this.f13714n = new Handler(this.f13713m.getLooper());
        }
        this.A = tVar;
        this.I = j3;
        this.B = k0Var;
        this.R = true;
        this.X = false;
        this.Y = true;
        this.f13699e0 = SystemClock.elapsedRealtimeNanos();
        u();
        t();
        l lVar = this.f13707j;
        lVar.b("camera segment start: facing=" + k0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f13696c.isAvailable());
        this.f13696c.setSurfaceTextureListener(this.N0);
        Handler handler = this.f13714n;
        if (this.R && handler != null && this.f13696c.isAvailable()) {
            handler.post(new b(this, 3));
        }
    }

    public final boolean C() {
        Handler handler = this.f13714n;
        if (!this.R || this.X || handler == null) {
            return false;
        }
        this.X = true;
        this.Y = false;
        this.f13707j.b("camera segment stop requested");
        handler.post(new b(this, 4));
        return true;
    }

    public final boolean D(k0 k0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (k0Var == k0.f13778a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f13694b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((m0) v(str, cameraCharacteristics, streamConfigurationMap, outputSizes, d(outputSizes, this.d, this.f13702g)).f359b) == m0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void E(k0 k0Var) {
        if (this.R && !this.T && k0Var != this.C) {
            this.T = true;
            this.V = true;
            this.L = false;
            this.M = false;
            this.J = 0.0f;
            k2.u uVar = this.f13709k;
            ((r0) uVar.f13369b).h.post(new n(1, uVar, k0Var));
            this.f13704h0 = SystemClock.elapsedRealtimeNanos();
            l lVar = this.f13707j;
            lVar.b("camera device switch started: from=" + this.C + ", to=" + k0Var);
            q qVar = this.v;
            if (qVar != null) {
                Handler handler = qVar.f13811l;
                if (qVar.V && handler != null) {
                    handler.post(new n(0, qVar, handler));
                }
            }
            h();
            CameraDevice cameraDevice = this.f13733x;
            if (cameraDevice != null) {
                this.f13733x = null;
                cameraDevice.close();
            } else if (!this.S) {
                this.T = false;
                q();
            }
        }
    }

    public final void F() {
        Size size;
        int width;
        int height;
        Integer num;
        if (this.Y && (size = this.f13722r) != null && this.f13696c.getWidth() != 0 && this.f13696c.getHeight() != 0) {
            int min = Math.min(this.f13724s, Math.min(size.getWidth(), size.getHeight()));
            TextureView textureView = this.f13696c;
            boolean z10 = false;
            if (this.f13718p != null && textureView.getDisplay() != null && (num = (Integer) this.f13718p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
            matrix.setScale(f10, f11, this.f13696c.getWidth() * 0.5f, this.f13696c.getHeight() * 0.5f);
            this.f13696c.setTransform(matrix);
            this.f13707j.b("preview transform: view=" + this.f13696c.getWidth() + "x" + this.f13696c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
        }
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.a():void");
    }

    public final void g() {
        this.S = false;
        this.T = false;
        this.U = false;
        this.Y = false;
        this.V = false;
        this.W = false;
        this.f13737z = null;
        this.M = false;
        h();
        CameraDevice cameraDevice = this.f13733x;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f13733x = null;
        }
        Surface surface = this.f13726t;
        if (surface != null) {
            surface.release();
            this.f13726t = null;
        }
        q qVar = this.v;
        if (qVar != null) {
            qVar.g();
            this.v = null;
        }
        this.f13728u = null;
    }

    public final void h() {
        CameraCaptureSession cameraCaptureSession = this.f13735y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f13735y = null;
        }
        this.f13737z = null;
    }

    public final void i() {
        CameraDevice cameraDevice = this.f13733x;
        if (cameraDevice != null && this.f13726t != null && this.f13728u != null) {
            try {
                this.f13703g0 = SystemClock.elapsedRealtimeNanos();
                l lVar = this.f13707j;
                lVar.b("capture session requested: preview=" + this.f13720q + ", recording=" + this.f13722r + ", fpsRange=" + this.G);
                cameraDevice.createCaptureSession(Arrays.asList(this.f13726t, this.f13728u), this.P0, this.f13714n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                if (this.F == m0.FPS_60) {
                    m("60 fps session creation rejected", e);
                } else {
                    s(e);
                }
            }
        }
    }

    public final void j() {
        Surface surface;
        String str;
        Surface surface2;
        t tVar = this.A;
        long j3 = this.I;
        int i10 = this.e;
        int i11 = this.f13700f;
        int i12 = this.F.f13791a;
        l lVar = this.f13707j;
        k2.u uVar = this.f13709k;
        Objects.requireNonNull(uVar);
        k kVar = new k(tVar, j3, i10, i11, i12, lVar, new a(uVar));
        this.f13731w = kVar;
        synchronized (kVar) {
            if (kVar.f13773u) {
                surface = kVar.f13768p;
            } else {
                kVar.k();
                long nanoTime = System.nanoTime();
                try {
                    kVar.b();
                    kVar.a();
                    kVar.f13765m.start();
                    kVar.f13773u = true;
                    l lVar2 = kVar.f13759f;
                    lVar2.b("codecs prepared: video=" + kVar.f13765m.getName() + ", audio=" + kVar.f13766n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = kVar.f13768p;
                } catch (IOException | RuntimeException e) {
                    kVar.i();
                    throw e;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.f13722r;
        int i13 = this.e;
        int i14 = this.f13724s;
        boolean o9 = o();
        boolean z10 = this.f13705i;
        l lVar3 = this.f13707j;
        k kVar2 = this.f13731w;
        k2.u uVar2 = this.f13709k;
        Objects.requireNonNull(uVar2);
        q qVar = new q(size, surface3, i13, i14, o9, z10, lVar3, kVar2, new a(uVar2));
        this.v = qVar;
        qVar.X = new b(this, 0);
        q qVar2 = this.v;
        if (qVar2.V) {
            surface2 = qVar2.f13813n;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            qVar2.f13810k = handlerThread;
            handlerThread.start();
            qVar2.U = System.nanoTime();
            l lVar4 = qVar2.e;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(qVar2.f13802a);
            sb2.append(", crop=");
            sb2.append(qVar2.f13806f);
            sb2.append(", output=");
            sb2.append(qVar2.f13805c);
            sb2.append("x");
            sb2.append(qVar2.f13805c);
            sb2.append(", filter=");
            if (qVar2.f13806f == qVar2.f13805c) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(qVar2.d);
            lVar4.b(sb2.toString());
            Handler handler = new Handler(qVar2.f13810k.getLooper());
            qVar2.f13811l = handler;
            handler.post(new x1(29, qVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (qVar2.Z == null) {
                    surface2 = qVar2.f13813n;
                } else {
                    RuntimeException runtimeException = qVar2.Z;
                    qVar2.Z = null;
                    qVar2.g();
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                qVar2.g();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.f13728u = surface2;
    }

    public final android.hardware.camera2.CaptureRequest.Builder k(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.k(boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void m(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        if (this.f13695b0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            s(exc);
            return;
        }
        this.f13695b0 = true;
        h();
        j6.l lVar = this.H;
        if (lVar == null) {
            s(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.F = m0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f13718p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.G = n(rangeArr, 30);
        this.f13720q = (Size) lVar.f12900b;
        this.f13722r = (Size) lVar.f12901c;
        this.f13724s = lVar.f12899a;
        this.E = (l0) lVar.d;
        SurfaceTexture surfaceTexture = this.f13696c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f13720q.getWidth(), this.f13720q.getHeight());
        }
        k kVar = this.f13731w;
        if (kVar != null) {
            synchronized (kVar) {
                z10 = kVar.v;
            }
            if (z10) {
                s(new IllegalStateException("Unable to change encoder frame rate after recording started", exc));
                return;
            }
        }
        q qVar = this.v;
        if (qVar != null) {
            qVar.g();
            this.v = null;
        }
        k kVar2 = this.f13731w;
        if (kVar2 != null) {
            kVar2.o();
            this.f13731w = null;
        }
        this.f13728u = null;
        try {
            j();
            t();
            l lVar2 = this.f13707j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f13720q);
            sb2.append(", recording=");
            sb2.append(this.f13722r);
            sb2.append(", crop=");
            sb2.append(this.f13724s);
            sb2.append(", fpsRange=");
            sb2.append(this.G);
            lVar2.b(sb2.toString());
            Handler handler = this.f13714n;
            if (this.R && handler != null) {
                handler.post(new b(this, 5));
            }
        } catch (Exception e) {
            s(e);
        }
    }

    public final boolean o() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.f13718p;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean p() {
        CameraCharacteristics cameraCharacteristics;
        if (this.C == k0.f13779b && (cameraCharacteristics = this.f13718p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void q() {
        if (this.R && !this.S && this.f13733x == null) {
            if (f0.e.b(this.f13692a, "android.permission.CAMERA") != 0) {
                s(new SecurityException("Camera permission is not granted"));
            } else if (f0.e.b(this.f13692a, "android.permission.RECORD_AUDIO") != 0) {
                s(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    w(this.B);
                    SurfaceTexture surfaceTexture = this.f13696c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(this.f13720q.getWidth(), this.f13720q.getHeight());
                        if (this.f13726t == null) {
                            this.f13726t = new Surface(surfaceTexture);
                        }
                        if (this.f13731w == null) {
                            j();
                        } else {
                            q qVar = this.v;
                            if (qVar != null) {
                                qVar.i(this.f13722r, this.f13724s, o());
                                Surface surface = this.v.f13813n;
                                if (surface != null) {
                                    this.f13728u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        this.S = true;
                        this.f13701f0 = SystemClock.elapsedRealtimeNanos();
                        l lVar = this.f13707j;
                        lVar.b("camera open requested: id=" + this.f13716o + ", preview=" + this.f13720q + ", recording=" + this.f13722r + ", crop=" + this.f13724s);
                        this.f13694b.openCamera(this.f13716o, this.O0, this.f13714n);
                    }
                } catch (Exception e) {
                    this.S = false;
                    s(e);
                }
            }
        }
    }

    public final void r() {
        this.R = false;
        this.f13696c.setSurfaceTextureListener(null);
        this.f13696c.removeOnLayoutChangeListener(this.L0);
        Handler handler = this.f13714n;
        HandlerThread handlerThread = this.f13713m;
        this.f13714n = null;
        this.f13713m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new x1(28, this, handlerThread));
        }
    }

    public final void s(Exception exc) {
        this.f13707j.a("camera error", exc);
        k2.u uVar = this.f13709k;
        ((r0) uVar.f13369b).h.post(new n(2, uVar, exc));
    }

    public final void t() {
        this.f13734x0 = 0L;
        this.f13736y0 = 0L;
        this.f13738z0 = 0L;
        this.A0 = 0L;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0.0d;
        this.E0 = 0L;
        this.F0 = 0L;
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
    }

    public final void u() {
        this.f13706i0 = 0L;
        this.f13708j0 = 0L;
        this.f13710k0 = 0L;
        this.f13712l0 = 0L;
        this.m0 = 0L;
        this.f13715n0 = 0L;
        this.f13717o0 = 0.0d;
        this.f13719p0 = 0L;
        this.f13721q0 = 0L;
        this.f13723r0 = 0L;
        this.f13725s0 = 0L;
        this.f13727t0 = 0L;
        this.f13729u0 = 0L;
        this.f13730v0 = 0L;
        this.f13732w0 = 0L;
    }

    public final aa.a v(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        String str2;
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        l lVar2 = this.f13707j;
        m0 m0Var = this.h;
        m0 m0Var2 = m0.FPS_30;
        if (m0Var != m0Var2 && !this.f13698d0) {
            int i10 = m0Var.f13791a;
            Range n10 = n(rangeArr3, i10);
            if (n10 != null) {
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
                    j6.l d = d(sizeArr3, this.d, this.f13702g);
                    lVar2.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + n10 + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                    return new aa.a(m0.FPS_60, n10, d, false, 27);
                } catch (RuntimeException unused) {
                    lVar2.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr3));
                }
            } else {
                rangeArr = rangeArr3;
                lVar2.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range n11 = n(rangeArr, 30);
            lVar2.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + n11);
            return new aa.a(m0Var2, n11, lVar, false, 27);
        }
        Range n12 = n(rangeArr3, 30);
        StringBuilder w10 = a4.a.w("fps selection: id=", str, ", requested=");
        w10.append(m0Var.f13791a);
        w10.append(", mode=REGULAR, range=");
        w10.append(n12);
        if (this.f13698d0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        w10.append(str2);
        lVar2.b(w10.toString());
        return new aa.a(m0Var2, n12, lVar, false, 27);
    }

    public final void w(ki.k0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.w(ki.k0):void");
    }

    public final void x(boolean z10) {
        Handler handler = this.f13714n;
        if (this.R && handler != null) {
            handler.post(new bi.f(8, this, z10));
        }
    }

    public final boolean y(float f7) {
        this.J = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f13714n;
        if (this.R && handler != null) {
            handler.removeCallbacks(this.M0);
            handler.post(this.M0);
            return true;
        }
        return false;
    }
}
