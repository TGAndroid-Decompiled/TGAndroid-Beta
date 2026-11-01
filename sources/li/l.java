package li;

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
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
public final class l {
    public CameraCaptureSession A;
    public boolean A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public long D0;
    public z E;
    public boolean E0;
    public volatile q0 F;
    public long F0;
    public q0 G;
    public long G0;
    public q0 H;
    public long H0;
    public r0 I;
    public long I0;
    public s0 J;
    public long J0;
    public Range K;
    public long K0;
    public j6.m L;
    public long L0;
    public long M;
    public long M0;
    public volatile float N;
    public long N0;
    public long O0;
    public boolean P;
    public double P0;
    public boolean Q;
    public long Q0;
    public int R;
    public long R0;
    public int S;
    public long S0;
    public int T;
    public long T0;
    public int U;
    public long U0;
    public volatile boolean V;
    public long V0;
    public boolean W;
    public long W0;
    public boolean X;
    public long X0;
    public boolean Y;
    public long Y0;
    public boolean Z;
    public long Z0;
    public final Context f12106a;
    public volatile boolean f12107a0;
    public long f12108a1;
    public final CameraManager f12109b;
    public volatile boolean f12110b0;
    public long f12111b1;
    public final TextureView f12112c;
    public volatile boolean f12113c0;
    public long f12114c1;
    public final v0 d;
    public boolean f12115d0;
    public long f12116d1;
    public final int e;
    public boolean f12117e0;
    public double f12118e1;
    public final int f12119f;
    public boolean f12120f0;
    public long f12121f1;
    public final r0 f12122g;
    public boolean f12123g0;
    public long f12124g1;
    public final s0 h;
    public boolean f12125h0;
    public long f12126h1;
    public final boolean f12127i;
    public int f12128i0;
    public long f12129i1;
    public final p f12130j;
    public j f12131j0;
    public long f12132j1;
    public final a4.l f12133k;
    public j f12134k0;
    public long f12135k1;
    public boolean f12137l0;
    public long l1;
    public HandlerThread f12138m;
    public boolean m0;
    public final dg.c f12139m1;
    public Handler f12140n;
    public boolean f12141n0;
    public final a f12142n1;
    public String f12143o;
    public boolean f12144o0;
    public final a f12145o1;
    public CameraCharacteristics f12146p;
    public boolean f12147p0;
    public final e f12148p1;
    public Size f12149q;
    public boolean f12150q0;
    public final f f12151q1;
    public volatile Size f12152r;
    public boolean f12153r0;
    public final f f12154r1;
    public volatile int f12155s;
    public boolean f12156s0;
    public final g f12157s1;
    public Surface f12158t;
    public CameraDevice f12159t0;
    public final g f12160t1;
    public Surface f12161u;
    public CameraDevice f12162u0;
    public final h f12163u1;
    public Surface v;
    public CameraDevice f12164v0;
    public v f12165w;
    public CameraDevice f12166w0;
    public o f12167x;
    public j f12168x0;
    public o f12169y;
    public q0 f12170y0;
    public CameraDevice f12171z;
    public boolean f12172z0;
    public final Rect f12136l = new Rect();
    public float O = 1.0f;

    public l(Context context, TextureView textureView, v0 v0Var, int i10, r0 r0Var, s0 s0Var, boolean z10, p pVar, a4.l lVar) {
        dg.c cVar = new dg.c(this, 1);
        this.f12139m1 = cVar;
        this.f12142n1 = new a(this, 4);
        this.f12145o1 = new a(this, 5);
        this.f12148p1 = new e(this, 0);
        this.f12151q1 = new f(this, 0);
        this.f12154r1 = new f(this, 1);
        this.f12157s1 = new g(this, 0);
        this.f12160t1 = new g(this, 1);
        this.f12163u1 = new h(this);
        this.f12106a = context.getApplicationContext();
        this.f12109b = (CameraManager) context.getSystemService("camera");
        this.f12112c = textureView;
        this.d = v0Var;
        this.e = v0Var.f12298a;
        this.f12119f = i10;
        this.f12122g = r0Var;
        this.h = s0Var;
        this.f12127i = z10;
        this.f12130j = pVar;
        this.f12133k = lVar;
        textureView.addOnLayoutChangeListener(cVar);
    }

    public static Range C(Range[] rangeArr, int i10) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        int i11 = i10 / 2;
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i10))) {
                if (((Integer) range3.getUpper()).intValue() == i10 && ((Integer) range3.getLower()).intValue() >= i11 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
                if (range2 == null || ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue() || (((Integer) range3.getLower()).equals(range2.getLower()) && ((Integer) range3.getUpper()).intValue() < ((Integer) range2.getUpper()).intValue())) {
                    range2 = range3;
                }
            }
        }
        if (range != null) {
            return range;
        }
        return range2;
    }

    public static boolean D(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static int V(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float W(double d, long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        double d10 = j11;
        double d11 = j10 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static void a(l lVar) {
        CameraDevice cameraDevice = lVar.f12171z;
        CameraDevice cameraDevice2 = lVar.f12159t0;
        if (lVar.f12141n0 && cameraDevice != null && cameraDevice2 != null && lVar.f12161u != null && lVar.v != null && lVar.A == null && lVar.B == null) {
            lVar.f12147p0 = false;
            lVar.f12150q0 = false;
            try {
                lVar.H0 = SystemClock.elapsedRealtimeNanos();
                p pVar = lVar.f12130j;
                pVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + lVar.f12152r + ", fpsRange=" + lVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(lVar.f12161u), lVar.f12160t1, lVar.f12140n);
                cameraDevice2.createCaptureSession(Arrays.asList(lVar.v), lVar.f12157s1, lVar.f12140n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                lVar.A("session request failed", e, false);
            }
        }
    }

    public static void b(l lVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == lVar.f12171z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && lVar.f12141n0) {
            p pVar = lVar.f12130j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            pVar.b(sb2.toString());
            lVar.f12141n0 = false;
            lVar.f12137l0 = false;
            lVar.m0 = true;
            lVar.f12156s0 = false;
            lVar.f12159t0 = null;
            lVar.f12168x0 = null;
            lVar.r();
            lVar.f12162u0 = cameraDevice;
            if (!lVar.V || lVar.f12171z == null || lVar.A != null || lVar.X) {
                z11 = false;
            }
            lVar.f12172z0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == lVar.f12159t0) {
            lVar.f12159t0 = null;
        }
        lVar.f12156s0 = false;
        cameraDevice.close();
        if (z10) {
            lVar.q();
            lVar.f12171z = null;
            if (illegalStateException != null) {
                lVar.N(illegalStateException);
                return;
            } else {
                lVar.N(new IllegalStateException(sc.e.h("Active warm camera ", str)));
                return;
            }
        }
        lVar.y("standby device " + str, illegalStateException);
        if (lVar.f12170y0 != null) {
            lVar.t();
        } else if (lVar.V && lVar.f12171z != null && lVar.A == null && !lVar.X) {
            lVar.f12130j.b("warm camera failed during startup; configuring active camera only");
            lVar.u();
        }
    }

    public static String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return "UNKNOWN";
                        }
                        return "CAMERA_SERVICE";
                    }
                    return "CAMERA_DEVICE";
                }
                return "CAMERA_DISABLED";
            }
            return "MAX_CAMERAS_IN_USE";
        }
        return "CAMERA_IN_USE";
    }

    public static boolean d(l lVar, CameraDevice cameraDevice) {
        String id2;
        if (!lVar.G(cameraDevice)) {
            return false;
        }
        if (cameraDevice == lVar.f12164v0) {
            lVar.f12164v0 = null;
        }
        if (cameraDevice == lVar.f12166w0) {
            lVar.f12166w0 = null;
        }
        p pVar = lVar.f12130j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = lVar.f12164v0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = lVar.f12166w0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        pVar.b(sb2.toString());
        lVar.H();
        return true;
    }

    public static boolean e(l lVar, CameraDevice cameraDevice) {
        if (cameraDevice != lVar.f12162u0) {
            return false;
        }
        lVar.f12162u0 = null;
        p pVar = lVar.f12130j;
        pVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (lVar.f12172z0) {
            lVar.f12172z0 = false;
            if (lVar.V && !lVar.f12110b0 && lVar.f12171z != null) {
                lVar.f12130j.b("retrying capture session after standby camera closed");
                lVar.u();
                return true;
            }
            return true;
        } else if (lVar.X && lVar.f12170y0 != null) {
            lVar.f12130j.b("continuing pending switch after DUAL_ACTIVE fallback");
            lVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(l lVar) {
        q0 q0Var = lVar.f12170y0;
        if (q0Var != null && lVar.f12141n0 && lVar.f12147p0 && lVar.f12150q0) {
            lVar.f12170y0 = null;
            if (!lVar.b0(q0Var)) {
                lVar.X = false;
                lVar.a0(q0Var);
            }
        }
    }

    public static long i(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float j(long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        return (((float) j10) / ((float) j11)) / 1000000.0f;
    }

    public static j6.m m(Size[] sizeArr, v0 v0Var, r0 r0Var) {
        int i10;
        j6.m o10;
        r0 r0Var2;
        j6.m o11;
        r0 r0Var3 = r0.f12239c;
        if (r0Var == r0Var3) {
            i10 = v0Var.f12298a;
        } else {
            v0 v0Var2 = v0.P480;
            r0 r0Var4 = r0.f12237a;
            if (v0Var == v0Var2) {
                if (r0Var == r0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (r0Var != r0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.m o12 = o(sizeArr, i10, r0Var);
        if (o12 != null) {
            return o12;
        }
        if (v0Var == v0.P360 && r0Var == (r0Var2 = r0.f12238b) && (o11 = o(sizeArr, 480, r0Var2)) != null) {
            return o11;
        }
        int i11 = v0Var.f12298a;
        if (r0Var != r0Var3 && (o10 = o(sizeArr, i11, r0Var3)) != null) {
            return o10;
        }
        int i12 = v0Var.f12298a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (V(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || i(size2) < i(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (V(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && i(size3) < i(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.m(n(sizeArr, size), size, r0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size n(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(V(size2) - 720);
                if (abs != abs2) {
                    compare = Integer.compare(abs, abs2);
                } else {
                    compare = Long.compare(i(size3), i(size2));
                }
                if (compare < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.m o(Size[] sizeArr, int i10, r0 r0Var) {
        int compare;
        j6.m mVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                j6.m mVar2 = new j6.m(n10, size, r0Var, i10);
                if (mVar != null) {
                    Size size2 = (Size) mVar.f9700b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) mVar.f9701c;
                    int abs2 = Math.abs(V(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long i12 = i(size) + i(n10);
                        long i13 = i(size3) + i(size2);
                        if (i12 != i13) {
                            compare = Long.compare(i12, i13);
                        } else {
                            compare = Long.compare(i(size), i(size3));
                        }
                    }
                    if (compare >= 0) {
                    }
                }
                mVar = mVar2;
            }
        }
        return mVar;
    }

    public static boolean s(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long z(long j10) {
        if (j10 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
    }

    public final void A(String str, Exception exc, boolean z10) {
        String str2;
        if (this.f12141n0) {
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z10);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            this.f12130j.b(sb2.toString());
            this.f12141n0 = false;
            this.f12137l0 = false;
            this.m0 = true;
            this.f12147p0 = false;
            this.f12150q0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f12159t0;
                this.f12159t0 = null;
                this.f12168x0 = null;
                if (cameraDevice != null) {
                    this.f12162u0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f12162u0 == null && this.X && this.f12170y0 != null) {
                    t();
                    return;
                }
                return;
            }
            L("DUAL_ACTIVE ".concat(str), exc);
        }
    }

    public final void B(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        o oVar = this.f12167x;
        if (oVar != null) {
            synchronized (oVar) {
                z10 = oVar.E;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f12120f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f12120f0 = true;
        this.f12125h0 = true;
        q();
        j6.m mVar = this.L;
        if (mVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = s0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f12146p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f12149q = (Size) mVar.f9700b;
        this.f12152r = (Size) mVar.f9701c;
        this.f12155s = mVar.f9699a;
        this.I = (r0) mVar.d;
        this.f12131j0 = null;
        this.f12134k0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f12112c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f12149q.getWidth(), this.f12149q.getHeight());
        }
        v vVar = this.f12165w;
        if (vVar != null) {
            vVar.l();
            this.f12165w = null;
        }
        o oVar2 = this.f12167x;
        if (oVar2 != null) {
            oVar2.u();
            this.f12167x = null;
        }
        this.f12161u = null;
        try {
            v();
            O();
            p pVar = this.f12130j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f12149q);
            sb2.append(", recording=");
            sb2.append(this.f12152r);
            sb2.append(", crop=");
            sb2.append(this.f12155s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            pVar.b(sb2.toString());
            Handler handler = this.f12140n;
            if (this.V && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e) {
            N(e);
        }
    }

    public final boolean E(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.f12109b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == q0.f12231b && (cameraCharacteristics = this.f12146p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.A0) {
            if (cameraDevice == this.f12164v0 || cameraDevice == this.f12166w0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.A0 && this.f12164v0 == null && this.f12166w0 == null) {
            this.A0 = false;
            this.X = false;
            p pVar = this.f12130j;
            pVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.I0));
            if (this.V && !this.f12110b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f12171z == null) {
            if (f0.c.b(this.f12106a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f12106a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.D0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.D0);
                    if (this.f12171z == null && this.f12167x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f12112c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.f12141n0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f12112c.getWidth(), this.f12112c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f12149q.getWidth(), this.f12149q.getHeight());
                        }
                        if (this.f12158t == null) {
                            this.f12158t = new Surface(surfaceTexture);
                        }
                        if (this.f12167x == null) {
                            w(surfaceTexture);
                        } else {
                            v vVar = this.f12165w;
                            if (vVar != null) {
                                vVar.n(this.f12152r, this.f12155s, D(this.f12146p));
                                Surface surface = null;
                                if (!this.f12141n0 && this.f12153r0) {
                                    this.f12153r0 = false;
                                    v vVar2 = this.f12165w;
                                    Handler handler = vVar2.f12287u;
                                    if (vVar2.f12282r0 && handler != null) {
                                        handler.post(new ag.j0((Object) vVar2, false, (Object) null, 5));
                                    }
                                }
                                v vVar3 = this.f12165w;
                                Surface surface2 = vVar3.f12290w;
                                if (surface2 != null) {
                                    this.f12161u = surface2;
                                    if (this.f12141n0 && (!vVar3.f12259f || (surface = vVar3.f12294y) == null)) {
                                        throw new IllegalStateException("Secondary GL camera surface is unavailable");
                                    }
                                    this.v = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        J();
                        this.W = true;
                        this.G0 = SystemClock.elapsedRealtimeNanos();
                        p pVar = this.f12130j;
                        pVar.b("camera open requested: id=" + this.f12143o + ", preview=" + this.f12149q + ", recording=" + this.f12152r + ", crop=" + this.f12155s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.f12141n0);
                        this.f12109b.openCamera(this.f12143o, this.f12151q1, this.f12140n);
                    }
                } catch (Exception e) {
                    this.W = false;
                    N(e);
                }
            }
        }
    }

    public final void J() {
        boolean z10;
        CameraDevice cameraDevice;
        q0 q0Var;
        j jVar;
        if (this.f12137l0 && !this.m0 && !(z10 = this.f12156s0) && (cameraDevice = this.f12159t0) == null) {
            q0 q0Var2 = this.H;
            q0 q0Var3 = q0.f12230a;
            if (q0Var2 == q0Var3) {
                q0Var = q0.f12231b;
            } else {
                q0Var = q0Var3;
            }
            if (q0Var == q0Var3) {
                jVar = this.f12131j0;
            } else {
                jVar = this.f12134k0;
            }
            if (jVar != null) {
                String str = jVar.f12088a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f12168x0 = jVar;
                        this.f12156s0 = true;
                        this.B0 = SystemClock.elapsedRealtimeNanos();
                        p pVar = this.f12130j;
                        pVar.b("warm camera open requested: id=" + str + ", facing=" + jVar.f12089b);
                        this.f12109b.openCamera(str, this.f12154r1, this.f12140n);
                    } catch (Exception e) {
                        this.f12156s0 = false;
                        y("open request failed", e);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.m0) {
            return;
        }
        if (this.f12137l0) {
            this.f12141n0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        p pVar = this.f12130j;
        if (i10 < 30) {
            this.m0 = true;
            pVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        j l4 = l();
        s0 s0Var = l4.h;
        String str2 = l4.f12088a;
        q0 q0Var = l4.f12089b;
        q0 q0Var2 = q0.f12230a;
        if (q0Var == q0Var2) {
            q0Var2 = q0.f12231b;
        }
        try {
            try {
                S(q0Var2);
                j l10 = l();
                s0 s0Var2 = l10.h;
                String str3 = l10.f12088a;
                boolean E = E(str2, str3);
                this.f12137l0 = E;
                if (E && s0Var != s0Var2) {
                    this.f12137l0 = false;
                    pVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f12091f + ", second=" + l10.e + "/" + l10.f12091f + ", firstFps=" + s0Var.f12245a + ", secondFps=" + s0Var2.f12245a);
                }
                boolean z10 = this.f12137l0;
                if (!z10) {
                    this.m0 = true;
                }
                this.f12141n0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f12137l0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f12137l0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.m0 = true;
                pVar.b("camera warm-switch capability unavailable: " + e);
                h(l4);
            }
        } catch (Throwable th2) {
            h(l4);
            throw th2;
        }
    }

    public final void L(String str, Exception exc) {
        String id2;
        Object valueOf;
        String str2;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.m0 = true;
        this.f12137l0 = false;
        this.f12172z0 = false;
        this.f12170y0 = null;
        this.E0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f12171z;
        this.f12164v0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f12159t0;
        this.f12166w0 = cameraDevice2;
        this.f12171z = null;
        this.f12159t0 = null;
        this.f12168x0 = null;
        CameraDevice cameraDevice3 = this.f12162u0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f12162u0 = null;
        }
        p pVar = this.f12130j;
        StringBuilder u10 = a1.g.u("camera warm-switch recovery started: reason=", str, ", target=");
        u10.append(this.F);
        u10.append(", targetId=");
        CameraDevice cameraDevice4 = this.f12164v0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        u10.append(id2);
        u10.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f12166w0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        u10.append(str3);
        u10.append(", fps=");
        s0 s0Var = this.J;
        if (s0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(s0Var.f12245a);
        }
        u10.append(valueOf);
        u10.append(", switchElapsedMs=");
        u10.append(z(this.I0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        u10.append(str2);
        pVar.b(u10.toString());
        CameraDevice cameraDevice6 = this.f12164v0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f12166w0;
        if (cameraDevice7 != null && cameraDevice7 != this.f12164v0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f12112c.setSurfaceTextureListener(null);
        this.f12112c.removeOnLayoutChangeListener(this.f12139m1);
        Handler handler = this.f12140n;
        HandlerThread handlerThread = this.f12138m;
        this.f12140n = null;
        this.f12138m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new k2.u(13, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f12130j.a("camera error", exc);
        a4.l lVar = this.f12133k;
        ((x0) lVar.f279b).f12313i.post(new n0(lVar, exc, 1));
    }

    public final void O() {
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f12108a1 = 0L;
        this.f12111b1 = 0L;
        this.f12114c1 = 0L;
        this.f12116d1 = 0L;
        this.f12118e1 = 0.0d;
        this.f12121f1 = 0L;
        this.f12124g1 = 0L;
        this.f12126h1 = 0L;
        this.f12129i1 = 0L;
        this.f12132j1 = 0L;
        this.f12135k1 = 0L;
        this.l1 = 0L;
    }

    public final void P() {
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0.0d;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
    }

    public final k Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.m mVar) {
        Range[] rangeArr;
        j6.m mVar2;
        int i10;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        p pVar = this.f12130j;
        s0 s0Var = this.h;
        s0 s0Var2 = s0.FPS_30;
        if (s0Var != s0Var2) {
            if (this.f12125h0) {
                rangeArr = rangeArr4;
                i10 = 30;
                mVar2 = mVar;
            } else {
                int i11 = s0Var.f12245a;
                Range C = C(rangeArr4, i11);
                if (C != null) {
                    ArrayList arrayList = new ArrayList(sizeArr.length);
                    int length = sizeArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        Size size = sizeArr[i12];
                        int i13 = i12;
                        int i14 = length;
                        long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                        if (outputMinFrameDuration > 0) {
                            rangeArr3 = rangeArr4;
                            if (outputMinFrameDuration > 1000000000 / i11) {
                                rangeArr4 = rangeArr3;
                                length = i14;
                                i12 = i13 + 1;
                            }
                        } else {
                            rangeArr3 = rangeArr4;
                        }
                        arrayList.add(size);
                        rangeArr4 = rangeArr3;
                        length = i14;
                        i12 = i13 + 1;
                    }
                    rangeArr2 = rangeArr4;
                    Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
                    try {
                        j6.m m10 = m(sizeArr2, this.d, this.f12122g);
                        pVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new k(s0.FPS_60, C, m10, 0);
                    } catch (RuntimeException unused) {
                        pVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    pVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                pVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new k(s0Var2, C2, mVar, 0);
            }
        } else {
            rangeArr = rangeArr4;
            mVar2 = mVar;
            i10 = 30;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder u10 = a1.g.u("fps selection: id=", str, ", requested=");
        u10.append(s0Var.f12245a);
        u10.append(", mode=REGULAR, range=");
        u10.append(C3);
        if (this.f12125h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        u10.append(str2);
        pVar.b(u10.toString());
        return new k(s0Var2, C3, mVar2, 0);
    }

    public final void R(String str, Exception exc) {
        this.f12172z0 = true;
        y(str, exc);
        if (this.f12162u0 == null) {
            this.f12172z0 = false;
            u();
            return;
        }
        this.f12130j.b("capture session retry waiting for standby camera close: id=" + this.f12162u0.getId());
    }

    public final void S(li.q0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: li.l.S(li.q0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f12140n;
        if (this.V && handler != null) {
            handler.post(new k2.v(1, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f12140n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f12145o1);
            handler.post(this.f12145o1);
            return true;
        }
        return false;
    }

    public final void X(z zVar, long j10, q0 q0Var) {
        if (this.f12138m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f12138m = handlerThread;
            handlerThread.start();
            this.f12140n = new Handler(this.f12138m.getLooper());
        }
        this.E = zVar;
        this.M = j10;
        this.F = q0Var;
        this.V = true;
        this.f12110b0 = false;
        this.f12120f0 = false;
        this.f12169y = null;
        this.f12113c0 = true;
        this.F0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        p pVar = this.f12130j;
        pVar.b("camera segment start: facing=" + q0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f12112c.isAvailable());
        this.f12112c.setSurfaceTextureListener(this.f12148p1);
        Handler handler = this.f12140n;
        if (this.V && handler != null && this.f12112c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f12140n;
        if (!this.V || this.f12110b0 || handler == null) {
            return false;
        }
        this.f12110b0 = true;
        this.f12113c0 = false;
        this.f12130j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(q0 q0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (q0Var == q0.f12230a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f12109b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((s0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f12122g)).f12101b) == s0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(li.q0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: li.l.a0(li.q0):void");
    }

    public final boolean b0(q0 q0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        j jVar;
        j jVar2;
        if (!this.f12141n0 || !this.f12147p0 || !this.f12150q0 || (cameraDevice = this.f12171z) == null || (cameraDevice2 = this.f12159t0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (jVar = this.f12168x0) == null || jVar.f12089b != q0Var || this.f12165w == null) {
            return false;
        }
        this.f12171z = cameraDevice2;
        this.f12159t0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f12161u;
        this.f12161u = this.v;
        this.v = surface;
        if (this.G == q0.f12230a) {
            jVar2 = this.f12131j0;
        } else {
            jVar2 = this.f12134k0;
        }
        this.f12168x0 = jVar2;
        h(jVar);
        this.G = q0Var;
        try {
            try {
                CaptureRequest.Builder x10 = x(this.f12171z, this.f12161u, jVar, true, false);
                try {
                    this.C = x10;
                    this.A.setRepeatingRequest(x10.build(), this.f12163u1, this.f12140n);
                    j jVar3 = this.f12168x0;
                    if (jVar3 != null) {
                        CaptureRequest.Builder x11 = x(this.f12159t0, this.v, jVar3, false, false);
                        this.D = x11;
                        this.B.setRepeatingRequest(x11.build(), this.f12163u1, this.f12140n);
                    }
                    boolean z10 = !this.f12153r0;
                    this.f12153r0 = z10;
                    long j10 = this.I0;
                    v vVar = this.f12165w;
                    b bVar = new b(this, q0Var, j10, 0);
                    Handler handler = vVar.f12287u;
                    if (vVar.f12282r0 && handler != null) {
                        handler.post(new ag.j0(vVar, z10, bVar, 5));
                    }
                    this.f12147p0 = true;
                    this.f12150q0 = true;
                    this.E0 = true;
                    this.Z = false;
                    this.X = false;
                    this.f12107a0 = false;
                    O();
                    this.f12130j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f12171z.getId() + ", standbyId=" + this.f12159t0.getId() + ", input=" + (this.f12153r0 ? 1 : 0) + ", elapsedMs=" + z(this.I0));
                    this.f12112c.post(new a(this, 1));
                    a4.l lVar = this.f12133k;
                    ((x0) lVar.f279b).f12313i.post(new ag.j0((Object) lVar, (Object) new i(this.G, this.I, this.J, this.f12149q, this.f12152r, this.O, F()), true, 6));
                    return true;
                } catch (CameraAccessException e) {
                    e = e;
                    A("role switch request failed", e, false);
                    return true;
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    A("role switch request failed", e, false);
                    return true;
                } catch (IllegalStateException e10) {
                    e = e10;
                    A("role switch request failed", e, false);
                    return true;
                }
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
                e = e11;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e12) {
            e = e12;
        }
    }

    public final boolean c0(q0 q0Var) {
        String id2;
        CameraDevice cameraDevice = this.f12159t0;
        j jVar = this.f12168x0;
        if (cameraDevice == null || jVar == null || jVar.f12089b != q0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f12112c.getSurfaceTexture();
        j jVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f12171z;
        q0 q0Var2 = this.G;
        if (q0Var2 != null) {
            if (q0Var2 == q0.f12230a) {
                jVar2 = this.f12131j0;
            } else {
                jVar2 = this.f12134k0;
            }
        }
        q();
        this.f12159t0 = cameraDevice2;
        this.f12168x0 = jVar2;
        this.f12171z = cameraDevice;
        h(jVar);
        surfaceTexture.setDefaultBufferSize(this.f12149q.getWidth(), this.f12149q.getHeight());
        v vVar = this.f12165w;
        if (vVar != null) {
            vVar.n(this.f12152r, this.f12155s, D(this.f12146p));
            Surface surface = this.f12165w.f12290w;
            if (surface != null) {
                this.f12161u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.E0 = true;
        p pVar = this.f12130j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f12143o);
        sb2.append(", standbyId=");
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", preparationMs=");
        sb2.append(z(this.I0));
        pVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        int width;
        int height;
        Integer num;
        if (this.f12113c0) {
            if (this.f12144o0) {
                this.f12112c.setTransform(new Matrix());
                this.f12130j.b("preview transform: GL output, identity matrix, view=" + this.f12112c.getWidth() + "x" + this.f12112c.getHeight());
                return;
            }
            Size size = this.f12152r;
            if (size != null && this.f12112c.getWidth() != 0 && this.f12112c.getHeight() != 0) {
                int min = Math.min(this.f12155s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f12112c;
                boolean z10 = false;
                if (this.f12146p != null && textureView.getDisplay() != null && (num = (Integer) this.f12146p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, this.f12112c.getWidth() * 0.5f, this.f12112c.getHeight() * 0.5f);
                this.f12112c.setTransform(matrix);
                this.f12130j.b("preview transform: view=" + this.f12112c.getWidth() + "x" + this.f12112c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: li.l.g():void");
    }

    public final void h(j jVar) {
        this.f12143o = jVar.f12088a;
        this.H = jVar.f12089b;
        this.f12146p = jVar.f12090c;
        this.f12149q = jVar.d;
        this.f12152r = jVar.e;
        this.f12155s = jVar.f12091f;
        this.I = jVar.f12092g;
        this.J = jVar.h;
        this.K = jVar.f12093i;
        this.L = jVar.f12094j;
        this.O = jVar.f12095k;
        this.f12120f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f12140n;
        if (handler != null) {
            handler.removeCallbacks(this.f12142n1);
        }
        this.f12169y = null;
    }

    public final j l() {
        return new j(this.f12143o, this.H, this.f12146p, this.f12149q, this.f12152r, this.f12155s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.A0 = false;
        this.f12172z0 = false;
        this.f12164v0 = null;
        this.f12166w0 = null;
        this.f12113c0 = false;
        this.Z = false;
        this.f12107a0 = false;
        this.C = null;
        this.Q = false;
        this.f12170y0 = null;
        this.f12156s0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f12171z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f12171z = null;
        }
        CameraDevice cameraDevice2 = this.f12159t0;
        this.f12159t0 = null;
        this.f12168x0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f12162u0;
        this.f12162u0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        v vVar = this.f12165w;
        if (vVar != null) {
            vVar.l();
            this.f12165w = null;
        }
        Surface surface = this.f12158t;
        if (surface != null) {
            surface.release();
            this.f12158t = null;
        }
        this.f12161u = null;
        this.v = null;
        this.f12141n0 = false;
        this.f12144o0 = false;
        this.f12147p0 = false;
        this.f12150q0 = false;
        this.f12153r0 = false;
    }

    public final void q() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
    }

    public final void r() {
        CameraCaptureSession cameraCaptureSession = this.B;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.B = null;
        }
        this.D = null;
        this.f12150q0 = false;
    }

    public final void t() {
        String str;
        this.f12170y0 = null;
        this.E0 = false;
        if (this.f12137l0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f12130j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f12171z;
        if (cameraDevice != null) {
            this.f12171z = null;
            this.C0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.W) {
            this.X = false;
            I();
        }
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: li.l.u():void");
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        String str;
        boolean z10;
        Surface surface3;
        q0 q0Var;
        j jVar;
        Surface surface4;
        this.f12144o0 = this.f12141n0;
        z zVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f12119f;
        int i12 = this.f12128i0;
        if (i12 <= 0) {
            i12 = this.J.f12245a;
        }
        int i13 = i12;
        p pVar = this.f12130j;
        a4.l lVar = this.f12133k;
        Objects.requireNonNull(lVar);
        c cVar = new c(lVar, 0);
        a4.l lVar2 = this.f12133k;
        Objects.requireNonNull(lVar2);
        o oVar = new o(zVar, j10, i10, i11, i13, pVar, cVar, new c(lVar2, 1));
        this.f12167x = oVar;
        synchronized (oVar) {
            if (oVar.D) {
                surface = oVar.f12204q;
            } else {
                oVar.q();
                long nanoTime = System.nanoTime();
                try {
                    oVar.b();
                    oVar.a();
                    oVar.f12201n.start();
                    oVar.D = true;
                    oVar.f12194f.b("codecs prepared: video=" + oVar.f12201n.getName() + ", audio=" + oVar.f12202o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = oVar.f12204q;
                } catch (IOException | RuntimeException e) {
                    oVar.n();
                    throw e;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f12152r;
        if (this.f12144o0) {
            surface2 = this.f12158t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.f12141n0;
        int i14 = this.e;
        int i15 = this.f12155s;
        boolean D = D(this.f12146p);
        boolean z12 = this.f12127i;
        p pVar2 = this.f12130j;
        o oVar2 = this.f12167x;
        a4.l lVar3 = this.f12133k;
        Objects.requireNonNull(lVar3);
        v vVar = new v(size, surface5, surface2, z11, i14, i15, D, z12, pVar2, oVar2, new c(lVar3, 2));
        this.f12165w = vVar;
        vVar.f12286t0 = new a(this, 2);
        v vVar2 = this.f12165w;
        if (vVar2.f12282r0) {
            surface3 = vVar2.f12290w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            vVar2.f12285t = handlerThread;
            handlerThread.start();
            vVar2.f12280q0 = System.nanoTime();
            p pVar3 = vVar2.f12264i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(vVar2.f12251a);
            sb2.append(", crop=");
            sb2.append(vVar2.f12266j);
            sb2.append(", output=");
            sb2.append(vVar2.f12261g);
            sb2.append("x");
            sb2.append(vVar2.f12261g);
            sb2.append(", filter=");
            if (vVar2.f12266j == vVar2.f12261g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(vVar2.h);
            sb2.append(", dualInput=");
            sb2.append(vVar2.f12259f);
            sb2.append(", glPreview=");
            if (vVar2.e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            pVar3.b(sb2.toString());
            Handler handler = new Handler(vVar2.f12285t.getLooper());
            vVar2.f12287u = handler;
            handler.post(new k2.u(14, vVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (vVar2.f12291w0 == null) {
                    surface3 = vVar2.f12290w;
                } else {
                    RuntimeException runtimeException = vVar2.f12291w0;
                    vVar2.f12291w0 = null;
                    vVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                vVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.f12161u = surface3;
        if (this.f12141n0) {
            q0 q0Var2 = this.H;
            q0 q0Var3 = q0.f12230a;
            if (q0Var2 == q0Var3) {
                q0Var = q0.f12231b;
            } else {
                q0Var = q0Var3;
            }
            if (q0Var == q0Var3) {
                jVar = this.f12131j0;
            } else {
                jVar = this.f12134k0;
            }
            if (jVar != null) {
                v vVar3 = this.f12165w;
                Size size2 = jVar.e;
                int i16 = jVar.f12091f;
                boolean D2 = D(jVar.f12090c);
                Handler handler2 = vVar3.f12287u;
                if (vVar3.f12282r0 && vVar3.f12259f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new r(vVar3, size2, i16, D2, runtimeExceptionArr, countDownLatch2, 0));
                    try {
                        countDownLatch2.await();
                        RuntimeException runtimeException2 = runtimeExceptionArr[0];
                        if (runtimeException2 != null) {
                            throw runtimeException2;
                        }
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException("Secondary input update was interrupted", e10);
                    }
                }
                v vVar4 = this.f12165w;
                if (vVar4.f12259f && (surface4 = vVar4.f12294y) != null) {
                    this.v = surface4;
                    return;
                }
                throw new IllegalStateException("Secondary GL camera surface is unavailable");
            }
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        this.v = null;
    }

    public final void w(SurfaceTexture surfaceTexture) {
        try {
            v();
        } catch (IOException | RuntimeException e) {
            if (this.f12141n0) {
                this.f12130j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                v vVar = this.f12165w;
                if (vVar != null) {
                    vVar.l();
                    this.f12165w = null;
                }
                o oVar = this.f12167x;
                if (oVar != null) {
                    oVar.u();
                    this.f12167x = null;
                }
                this.f12161u = null;
                this.v = null;
                this.f12141n0 = false;
                this.f12144o0 = false;
                this.f12137l0 = false;
                this.m0 = true;
                surfaceTexture.setDefaultBufferSize(this.f12149q.getWidth(), this.f12149q.getHeight());
                v();
                return;
            }
            throw e;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder x(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, li.j r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: li.l.x(android.hardware.camera2.CameraDevice, android.view.Surface, li.j, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.m0 = true;
        this.f12137l0 = false;
        this.f12141n0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f12130j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f12159t0;
        this.f12159t0 = null;
        this.f12168x0 = null;
        if (cameraDevice != null && cameraDevice != this.f12171z) {
            this.f12162u0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
