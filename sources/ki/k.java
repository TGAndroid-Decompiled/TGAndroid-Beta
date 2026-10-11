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
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import ci.e4;
import ci.x0;
import gg.w1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
public final class k {
    public CameraCaptureSession A;
    public long A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public boolean D0;
    public w E;
    public long E0;
    public volatile o0 F;
    public long F0;
    public o0 G;
    public long G0;
    public o0 H;
    public long H0;
    public p0 I;
    public long I0;
    public q0 J;
    public long J0;
    public Range K;
    public long K0;
    public j6.l L;
    public long L0;
    public long M;
    public long M0;
    public volatile float N;
    public long N0;
    public double O0;
    public boolean P;
    public long P0;
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
    public final Context f14961a;
    public volatile boolean f14962a0;
    public long f14963a1;
    public final CameraManager f14964b;
    public volatile boolean f14965b0;
    public long f14966b1;
    public final TextureView f14967c;
    public volatile boolean f14968c0;
    public long f14969c1;
    public final t0 d;
    public boolean f14970d0;
    public double f14971d1;
    public final int f14972e;
    public boolean f14973e0;
    public long f14974e1;
    public final int f14975f;
    public boolean f14976f0;
    public long f14977f1;
    public final p0 f14978g;
    public boolean f14979g0;
    public long f14980g1;
    public final q0 h;
    public boolean f14981h0;
    public long f14982h1;
    public final boolean f14983i;
    public j f14984i0;
    public long f14985i1;
    public final o f14986j;
    public j f14987j0;
    public long f14988j1;
    public final xa.c f14989k;
    public boolean f14990k0;
    public long f14991k1;
    public boolean f14993l0;
    public final e4 l1;
    public HandlerThread f14994m;
    public boolean m0;
    public final a f14995m1;
    public Handler f14996n;
    public boolean f14997n0;
    public final a f14998n1;
    public String f14999o;
    public boolean f15000o0;
    public final e f15001o1;
    public CameraCharacteristics f15002p;
    public boolean f15003p0;
    public final f f15004p1;
    public Size f15005q;
    public boolean f15006q0;
    public final f f15007q1;
    public volatile Size f15008r;
    public boolean f15009r0;
    public final g f15010r1;
    public volatile int f15011s;
    public CameraDevice f15012s0;
    public final g f15013s1;
    public Surface f15014t;
    public CameraDevice f15015t0;
    public final h f15016t1;
    public Surface f15017u;
    public CameraDevice f15018u0;
    public Surface v;
    public CameraDevice f15019v0;
    public t f15020w;
    public j f15021w0;
    public n f15022x;
    public o0 f15023x0;
    public n f15024y;
    public boolean f15025y0;
    public CameraDevice f15026z;
    public boolean f15027z0;
    public final Rect f14992l = new Rect();
    public float O = 1.0f;

    public k(Context context, TextureView textureView, t0 t0Var, int i10, p0 p0Var, q0 q0Var, boolean z10, o oVar, xa.c cVar) {
        e4 e4Var = new e4(this, 2);
        this.l1 = e4Var;
        this.f14995m1 = new a(this, 4);
        this.f14998n1 = new a(this, 5);
        this.f15001o1 = new e(this, 0);
        this.f15004p1 = new f(this, 0);
        this.f15007q1 = new f(this, 1);
        this.f15010r1 = new g(this, 0);
        this.f15013s1 = new g(this, 1);
        this.f15016t1 = new h(this);
        this.f14961a = context.getApplicationContext();
        this.f14964b = (CameraManager) context.getSystemService("camera");
        this.f14967c = textureView;
        this.d = t0Var;
        this.f14972e = t0Var.f15146a;
        this.f14975f = i10;
        this.f14978g = p0Var;
        this.h = q0Var;
        this.f14983i = z10;
        this.f14986j = oVar;
        this.f14989k = cVar;
        textureView.addOnLayoutChangeListener(e4Var);
    }

    public static Range C(Range[] rangeArr, int i10) {
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

    public static float W(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d10 = j10;
        double d11 = j3 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static void a(k kVar) {
        CameraDevice cameraDevice = kVar.f15026z;
        CameraDevice cameraDevice2 = kVar.f15012s0;
        if (kVar.m0 && cameraDevice != null && cameraDevice2 != null && kVar.f15017u != null && kVar.v != null && kVar.A == null && kVar.B == null) {
            kVar.f15000o0 = false;
            kVar.f15003p0 = false;
            try {
                kVar.G0 = SystemClock.elapsedRealtimeNanos();
                o oVar = kVar.f14986j;
                oVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + kVar.f15008r + ", fpsRange=" + kVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(kVar.f15017u), kVar.f15013s1, kVar.f14996n);
                cameraDevice2.createCaptureSession(Arrays.asList(kVar.v), kVar.f15010r1, kVar.f14996n);
            } catch (CameraAccessException | IllegalArgumentException e7) {
                kVar.A("session request failed", e7, false);
            }
        }
    }

    public static void b(k kVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == kVar.f15026z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && kVar.m0) {
            o oVar = kVar.f14986j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            oVar.b(sb2.toString());
            kVar.m0 = false;
            kVar.f14990k0 = false;
            kVar.f14993l0 = true;
            kVar.f15009r0 = false;
            kVar.f15012s0 = null;
            kVar.f15021w0 = null;
            kVar.r();
            kVar.f15015t0 = cameraDevice;
            if (!kVar.V || kVar.f15026z == null || kVar.A != null || kVar.X) {
                z11 = false;
            }
            kVar.f15025y0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == kVar.f15012s0) {
            kVar.f15012s0 = null;
        }
        kVar.f15009r0 = false;
        cameraDevice.close();
        if (z10) {
            kVar.q();
            kVar.f15026z = null;
            if (illegalStateException != null) {
                kVar.N(illegalStateException);
                return;
            } else {
                kVar.N(new IllegalStateException(sc.v.i("Active warm camera ", str)));
                return;
            }
        }
        kVar.y("standby device " + str, illegalStateException);
        if (kVar.f15023x0 != null) {
            kVar.t();
        } else if (kVar.V && kVar.f15026z != null && kVar.A == null && !kVar.X) {
            kVar.f14986j.b("warm camera failed during startup; configuring active camera only");
            kVar.u();
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

    public static boolean d(k kVar, CameraDevice cameraDevice) {
        String id2;
        if (!kVar.G(cameraDevice)) {
            return false;
        }
        if (cameraDevice == kVar.f15018u0) {
            kVar.f15018u0 = null;
        }
        if (cameraDevice == kVar.f15019v0) {
            kVar.f15019v0 = null;
        }
        o oVar = kVar.f14986j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = kVar.f15018u0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = kVar.f15019v0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        oVar.b(sb2.toString());
        kVar.H();
        return true;
    }

    public static boolean e(k kVar, CameraDevice cameraDevice) {
        if (cameraDevice != kVar.f15015t0) {
            return false;
        }
        kVar.f15015t0 = null;
        o oVar = kVar.f14986j;
        oVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (kVar.f15025y0) {
            kVar.f15025y0 = false;
            if (kVar.V && !kVar.f14965b0 && kVar.f15026z != null) {
                kVar.f14986j.b("retrying capture session after standby camera closed");
                kVar.u();
                return true;
            }
            return true;
        } else if (kVar.X && kVar.f15023x0 != null) {
            kVar.f14986j.b("continuing pending switch after DUAL_ACTIVE fallback");
            kVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(k kVar) {
        o0 o0Var = kVar.f15023x0;
        if (o0Var != null && kVar.m0 && kVar.f15000o0 && kVar.f15003p0) {
            kVar.f15023x0 = null;
            if (!kVar.b0(o0Var)) {
                kVar.X = false;
                kVar.a0(o0Var);
            }
        }
    }

    public static long i(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float j(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (((float) j3) / ((float) j10)) / 1000000.0f;
    }

    public static j6.l m(Size[] sizeArr, t0 t0Var, p0 p0Var) {
        int i10;
        j6.l o9;
        p0 p0Var2;
        j6.l o10;
        p0 p0Var3 = p0.f15083c;
        if (p0Var == p0Var3) {
            i10 = t0Var.f15146a;
        } else {
            t0 t0Var2 = t0.P480;
            p0 p0Var4 = p0.f15081a;
            if (t0Var == t0Var2) {
                if (p0Var == p0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (p0Var != p0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l o11 = o(sizeArr, i10, p0Var);
        if (o11 != null) {
            return o11;
        }
        if (t0Var == t0.P360 && p0Var == (p0Var2 = p0.f15082b) && (o10 = o(sizeArr, 480, p0Var2)) != null) {
            return o10;
        }
        int i11 = t0Var.f15146a;
        if (p0Var != p0Var3 && (o9 = o(sizeArr, i11, p0Var3)) != null) {
            return o9;
        }
        int i12 = t0Var.f15146a;
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
        return new j6.l(n(sizeArr, size), size, p0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static j6.l o(Size[] sizeArr, int i10, p0 p0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                j6.l lVar2 = new j6.l(n10, size, p0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f14061b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) lVar.f14062c;
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
                lVar = lVar2;
            }
        }
        return lVar;
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

    public static long z(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public final void A(String str, Exception exc, boolean z10) {
        String str2;
        if (this.m0) {
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
            this.f14986j.b(sb2.toString());
            this.m0 = false;
            this.f14990k0 = false;
            this.f14993l0 = true;
            this.f15000o0 = false;
            this.f15003p0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f15012s0;
                this.f15012s0 = null;
                this.f15021w0 = null;
                if (cameraDevice != null) {
                    this.f15015t0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f15015t0 == null && this.X && this.f15023x0 != null) {
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
        n nVar = this.f15022x;
        if (nVar != null) {
            synchronized (nVar) {
                z10 = nVar.f15069z;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f14976f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f14976f0 = true;
        q();
        j6.l lVar = this.L;
        if (lVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = q0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f15002p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f15005q = (Size) lVar.f14061b;
        this.f15008r = (Size) lVar.f14062c;
        this.f15011s = lVar.f14060a;
        this.I = (p0) lVar.d;
        this.f14984i0 = null;
        this.f14987j0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f14967c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f15005q.getWidth(), this.f15005q.getHeight());
        }
        t tVar = this.f15020w;
        if (tVar != null) {
            tVar.l();
            this.f15020w = null;
        }
        n nVar2 = this.f15022x;
        if (nVar2 != null) {
            nVar2.q();
            this.f15022x = null;
        }
        this.f15017u = null;
        try {
            v();
            O();
            o oVar = this.f14986j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f15005q);
            sb2.append(", recording=");
            sb2.append(this.f15008r);
            sb2.append(", crop=");
            sb2.append(this.f15011s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            oVar.b(sb2.toString());
            Handler handler = this.f14996n;
            if (this.V && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e7) {
            N(e7);
        }
    }

    public final boolean E(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.f14964b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == o0.f15077b && (cameraCharacteristics = this.f15002p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.f15027z0) {
            if (cameraDevice == this.f15018u0 || cameraDevice == this.f15019v0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.f15027z0 && this.f15018u0 == null && this.f15019v0 == null) {
            this.f15027z0 = false;
            this.X = false;
            o oVar = this.f14986j;
            oVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.H0));
            if (this.V && !this.f14965b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f15026z == null) {
            if (f0.c.b(this.f14961a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f14961a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.C0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.C0);
                    if (this.f15026z == null && this.f15022x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f14967c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.m0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f14967c.getWidth(), this.f14967c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f15005q.getWidth(), this.f15005q.getHeight());
                        }
                        if (this.f15014t == null) {
                            this.f15014t = new Surface(surfaceTexture);
                        }
                        if (this.f15022x == null) {
                            w(surfaceTexture);
                        } else {
                            t tVar = this.f15020w;
                            if (tVar != null) {
                                tVar.n(this.f15008r, this.f15011s, D(this.f15002p));
                                Surface surface = null;
                                if (!this.m0 && this.f15006q0) {
                                    this.f15006q0 = false;
                                    t tVar2 = this.f15020w;
                                    Handler handler = tVar2.f15135u;
                                    if (tVar2.f15130r0 && handler != null) {
                                        handler.post(new x0((Object) tVar2, false, (Object) null, 7));
                                    }
                                }
                                t tVar3 = this.f15020w;
                                Surface surface2 = tVar3.f15138w;
                                if (surface2 != null) {
                                    this.f15017u = surface2;
                                    if (this.m0 && (!tVar3.f15107f || (surface = tVar3.f15142y) == null)) {
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
                        this.F0 = SystemClock.elapsedRealtimeNanos();
                        o oVar = this.f14986j;
                        oVar.b("camera open requested: id=" + this.f14999o + ", preview=" + this.f15005q + ", recording=" + this.f15008r + ", crop=" + this.f15011s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.m0);
                        this.f14964b.openCamera(this.f14999o, this.f15004p1, this.f14996n);
                    }
                } catch (Exception e7) {
                    this.W = false;
                    N(e7);
                }
            }
        }
    }

    public final void J() {
        boolean z10;
        CameraDevice cameraDevice;
        o0 o0Var;
        j jVar;
        if (this.f14990k0 && !this.f14993l0 && !(z10 = this.f15009r0) && (cameraDevice = this.f15012s0) == null) {
            o0 o0Var2 = this.H;
            o0 o0Var3 = o0.f15076a;
            if (o0Var2 == o0Var3) {
                o0Var = o0.f15077b;
            } else {
                o0Var = o0Var3;
            }
            if (o0Var == o0Var3) {
                jVar = this.f14984i0;
            } else {
                jVar = this.f14987j0;
            }
            if (jVar != null) {
                String str = jVar.f14946a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f15021w0 = jVar;
                        this.f15009r0 = true;
                        this.A0 = SystemClock.elapsedRealtimeNanos();
                        o oVar = this.f14986j;
                        oVar.b("warm camera open requested: id=" + str + ", facing=" + jVar.f14947b);
                        this.f14964b.openCamera(str, this.f15007q1, this.f14996n);
                    } catch (Exception e7) {
                        this.f15009r0 = false;
                        y("open request failed", e7);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f14993l0) {
            return;
        }
        if (this.f14990k0) {
            this.m0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f14986j;
        if (i10 < 30) {
            this.f14993l0 = true;
            oVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        j l4 = l();
        q0 q0Var = l4.h;
        String str2 = l4.f14946a;
        o0 o0Var = l4.f14947b;
        o0 o0Var2 = o0.f15076a;
        if (o0Var == o0Var2) {
            o0Var2 = o0.f15077b;
        }
        try {
            try {
                S(o0Var2);
                j l10 = l();
                q0 q0Var2 = l10.h;
                String str3 = l10.f14946a;
                boolean E = E(str2, str3);
                this.f14990k0 = E;
                if (E && q0Var != q0Var2) {
                    this.f14990k0 = false;
                    oVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.f14949e + "/" + l4.f14950f + ", second=" + l10.f14949e + "/" + l10.f14950f + ", firstFps=" + q0Var.f15091a + ", secondFps=" + q0Var2.f15091a);
                }
                boolean z10 = this.f14990k0;
                if (!z10) {
                    this.f14993l0 = true;
                }
                this.m0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f14990k0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f14990k0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                h(l4);
            } catch (Exception e7) {
                this.f14993l0 = true;
                oVar.b("camera warm-switch capability unavailable: " + e7);
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
        if (this.f15027z0) {
            return;
        }
        this.f15027z0 = true;
        this.f14993l0 = true;
        this.f14990k0 = false;
        this.f15025y0 = false;
        this.f15023x0 = null;
        this.D0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f15026z;
        this.f15018u0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f15012s0;
        this.f15019v0 = cameraDevice2;
        this.f15026z = null;
        this.f15012s0 = null;
        this.f15021w0 = null;
        CameraDevice cameraDevice3 = this.f15015t0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f15015t0 = null;
        }
        o oVar = this.f14986j;
        StringBuilder w10 = a1.g.w("camera warm-switch recovery started: reason=", str, ", target=");
        w10.append(this.F);
        w10.append(", targetId=");
        CameraDevice cameraDevice4 = this.f15018u0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        w10.append(id2);
        w10.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f15019v0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        w10.append(str3);
        w10.append(", fps=");
        q0 q0Var = this.J;
        if (q0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(q0Var.f15091a);
        }
        w10.append(valueOf);
        w10.append(", switchElapsedMs=");
        w10.append(z(this.H0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        w10.append(str2);
        oVar.b(w10.toString());
        CameraDevice cameraDevice6 = this.f15018u0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f15019v0;
        if (cameraDevice7 != null && cameraDevice7 != this.f15018u0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f14967c.setSurfaceTextureListener(null);
        this.f14967c.removeOnLayoutChangeListener(this.l1);
        Handler handler = this.f14996n;
        HandlerThread handlerThread = this.f14994m;
        this.f14996n = null;
        this.f14994m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new w1(28, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f14986j.a("camera error", exc);
        xa.c cVar = this.f14989k;
        ((v0) cVar.f51228b).f15164i.post(new k0(1, cVar, exc));
    }

    public final void O() {
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f14963a1 = 0L;
        this.f14966b1 = 0L;
        this.f14969c1 = 0L;
        this.f14971d1 = 0.0d;
        this.f14974e1 = 0L;
        this.f14977f1 = 0L;
        this.f14980g1 = 0L;
        this.f14982h1 = 0L;
        this.f14985i1 = 0L;
        this.f14988j1 = 0L;
        this.f14991k1 = 0L;
    }

    public final void P() {
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0.0d;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
    }

    public final aa.a Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        String str2;
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        o oVar = this.f14986j;
        q0 q0Var = this.h;
        q0 q0Var2 = q0.FPS_30;
        if (q0Var != q0Var2 && !this.f14981h0) {
            int i10 = q0Var.f15091a;
            Range C = C(rangeArr3, i10);
            if (C != null) {
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
                    j6.l m10 = m(sizeArr3, this.d, this.f14978g);
                    oVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                    return new aa.a(q0.FPS_60, C, m10, false, 27);
                } catch (RuntimeException unused) {
                    oVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr3));
                }
            } else {
                rangeArr = rangeArr3;
                oVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range C2 = C(rangeArr, 30);
            oVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + C2);
            return new aa.a(q0Var2, C2, lVar, false, 27);
        }
        Range C3 = C(rangeArr3, 30);
        StringBuilder w10 = a1.g.w("fps selection: id=", str, ", requested=");
        w10.append(q0Var.f15091a);
        w10.append(", mode=REGULAR, range=");
        w10.append(C3);
        if (this.f14981h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        w10.append(str2);
        oVar.b(w10.toString());
        return new aa.a(q0Var2, C3, lVar, false, 27);
    }

    public final void R(String str, Exception exc) {
        this.f15025y0 = true;
        y(str, exc);
        if (this.f15015t0 == null) {
            this.f15025y0 = false;
            u();
            return;
        }
        this.f14986j.b("capture session retry waiting for standby camera close: id=" + this.f15015t0.getId());
    }

    public final void S(ki.o0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: ki.k.S(ki.o0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f14996n;
        if (this.V && handler != null) {
            handler.post(new bi.f(9, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f14996n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f14998n1);
            handler.post(this.f14998n1);
            return true;
        }
        return false;
    }

    public final void X(w wVar, long j3, o0 o0Var) {
        if (this.f14994m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f14994m = handlerThread;
            handlerThread.start();
            this.f14996n = new Handler(this.f14994m.getLooper());
        }
        this.E = wVar;
        this.M = j3;
        this.F = o0Var;
        this.V = true;
        this.f14965b0 = false;
        this.f15024y = null;
        this.f14968c0 = true;
        this.E0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        o oVar = this.f14986j;
        oVar.b("camera segment start: facing=" + o0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f14967c.isAvailable());
        this.f14967c.setSurfaceTextureListener(this.f15001o1);
        Handler handler = this.f14996n;
        if (this.V && handler != null && this.f14967c.isAvailable()) {
            handler.post(new a(this, 6));
        }
    }

    public final boolean Y() {
        Handler handler = this.f14996n;
        if (!this.V || this.f14965b0 || handler == null) {
            return false;
        }
        this.f14965b0 = true;
        this.f14968c0 = false;
        this.f14986j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean Z(o0 o0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (o0Var == o0.f15076a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f14964b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((q0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f14978g)).f384b) == q0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(ki.o0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: ki.k.a0(ki.o0):void");
    }

    public final boolean b0(o0 o0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        j jVar;
        j jVar2;
        CaptureRequest.Builder x10;
        if (!this.m0 || !this.f15000o0 || !this.f15003p0 || (cameraDevice = this.f15026z) == null || (cameraDevice2 = this.f15012s0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (jVar = this.f15021w0) == null || jVar.f14947b != o0Var || this.f15020w == null) {
            return false;
        }
        this.f15026z = cameraDevice2;
        this.f15012s0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f15017u;
        this.f15017u = this.v;
        this.v = surface;
        if (this.G == o0.f15076a) {
            jVar2 = this.f14984i0;
        } else {
            jVar2 = this.f14987j0;
        }
        this.f15021w0 = jVar2;
        h(jVar);
        this.G = o0Var;
        try {
            try {
                x10 = x(this.f15026z, this.f15017u, jVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e7) {
                e = e7;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
            e = e10;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.f15016t1, this.f14996n);
            j jVar3 = this.f15021w0;
            if (jVar3 != null) {
                CaptureRequest.Builder x11 = x(this.f15012s0, this.v, jVar3, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.f15016t1, this.f14996n);
            }
            boolean z10 = !this.f15006q0;
            this.f15006q0 = z10;
            long j3 = this.H0;
            t tVar = this.f15020w;
            b bVar = new b(this, o0Var, j3, 0);
            Handler handler = tVar.f15135u;
            if (tVar.f15130r0 && handler != null) {
                handler.post(new x0(tVar, z10, bVar, 7));
            }
            this.f15000o0 = true;
            this.f15003p0 = true;
            this.D0 = true;
            this.Z = false;
            this.X = false;
            this.f14962a0 = false;
            O();
            this.f14986j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f15026z.getId() + ", standbyId=" + this.f15012s0.getId() + ", input=" + (this.f15006q0 ? 1 : 0) + ", elapsedMs=" + z(this.H0));
            this.f14967c.post(new a(this, 1));
            xa.c cVar = this.f14989k;
            ((v0) cVar.f51228b).f15164i.post(new x0((Object) cVar, (Object) new i(this.G, this.I, this.J, this.f15005q, this.f15008r, this.O, F()), true, 8));
            return true;
        } catch (CameraAccessException e11) {
            e = e11;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalArgumentException e12) {
            e = e12;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalStateException e13) {
            e = e13;
            A("role switch request failed", e, false);
            return true;
        }
    }

    public final boolean c0(o0 o0Var) {
        String id2;
        CameraDevice cameraDevice = this.f15012s0;
        j jVar = this.f15021w0;
        if (cameraDevice == null || jVar == null || jVar.f14947b != o0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f14967c.getSurfaceTexture();
        j jVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f15026z;
        o0 o0Var2 = this.G;
        if (o0Var2 != null) {
            if (o0Var2 == o0.f15076a) {
                jVar2 = this.f14984i0;
            } else {
                jVar2 = this.f14987j0;
            }
        }
        q();
        this.f15012s0 = cameraDevice2;
        this.f15021w0 = jVar2;
        this.f15026z = cameraDevice;
        h(jVar);
        surfaceTexture.setDefaultBufferSize(this.f15005q.getWidth(), this.f15005q.getHeight());
        t tVar = this.f15020w;
        if (tVar != null) {
            tVar.n(this.f15008r, this.f15011s, D(this.f15002p));
            Surface surface = this.f15020w.f15138w;
            if (surface != null) {
                this.f15017u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.D0 = true;
        o oVar = this.f14986j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f14999o);
        sb2.append(", standbyId=");
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", preparationMs=");
        sb2.append(z(this.H0));
        oVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        int width;
        int height;
        Integer num;
        if (this.f14968c0) {
            if (this.f14997n0) {
                this.f14967c.setTransform(new Matrix());
                this.f14986j.b("preview transform: GL output, identity matrix, view=" + this.f14967c.getWidth() + "x" + this.f14967c.getHeight());
                return;
            }
            Size size = this.f15008r;
            if (size != null && this.f14967c.getWidth() != 0 && this.f14967c.getHeight() != 0) {
                int min = Math.min(this.f15011s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f14967c;
                boolean z10 = false;
                if (this.f15002p != null && textureView.getDisplay() != null && (num = (Integer) this.f15002p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, this.f14967c.getWidth() * 0.5f, this.f14967c.getHeight() * 0.5f);
                this.f14967c.setTransform(matrix);
                this.f14986j.b("preview transform: view=" + this.f14967c.getWidth() + "x" + this.f14967c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: ki.k.g():void");
    }

    public final void h(j jVar) {
        this.f14999o = jVar.f14946a;
        this.H = jVar.f14947b;
        this.f15002p = jVar.f14948c;
        this.f15005q = jVar.d;
        this.f15008r = jVar.f14949e;
        this.f15011s = jVar.f14950f;
        this.I = jVar.f14951g;
        this.J = jVar.h;
        this.K = jVar.f14952i;
        this.L = jVar.f14953j;
        this.O = jVar.f14954k;
        this.f14976f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f14996n;
        if (handler != null) {
            handler.removeCallbacks(this.f14995m1);
        }
        this.f15024y = null;
    }

    public final j l() {
        return new j(this.f14999o, this.H, this.f15002p, this.f15005q, this.f15008r, this.f15011s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f15027z0 = false;
        this.f15025y0 = false;
        this.f15018u0 = null;
        this.f15019v0 = null;
        this.f14968c0 = false;
        this.Z = false;
        this.f14962a0 = false;
        this.C = null;
        this.Q = false;
        this.f15023x0 = null;
        this.f15009r0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f15026z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f15026z = null;
        }
        CameraDevice cameraDevice2 = this.f15012s0;
        this.f15012s0 = null;
        this.f15021w0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f15015t0;
        this.f15015t0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        t tVar = this.f15020w;
        if (tVar != null) {
            tVar.l();
            this.f15020w = null;
        }
        Surface surface = this.f15014t;
        if (surface != null) {
            surface.release();
            this.f15014t = null;
        }
        this.f15017u = null;
        this.v = null;
        this.m0 = false;
        this.f14997n0 = false;
        this.f15000o0 = false;
        this.f15003p0 = false;
        this.f15006q0 = false;
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
        this.f15003p0 = false;
    }

    public final void t() {
        String str;
        this.f15023x0 = null;
        this.D0 = false;
        if (this.f14990k0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f14986j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f15026z;
        if (cameraDevice != null) {
            this.f15026z = null;
            this.B0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.W) {
            this.X = false;
            I();
        }
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: ki.k.u():void");
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        String str;
        boolean z10;
        Surface surface3;
        o0 o0Var;
        j jVar;
        Surface surface4;
        this.f14997n0 = this.m0;
        w wVar = this.E;
        long j3 = this.M;
        int i10 = this.f14972e;
        int i11 = this.f14975f;
        int i12 = this.J.f15091a;
        o oVar = this.f14986j;
        xa.c cVar = this.f14989k;
        Objects.requireNonNull(cVar);
        n nVar = new n(wVar, j3, i10, i11, i12, oVar, new c(cVar));
        this.f15022x = nVar;
        synchronized (nVar) {
            if (nVar.f15068y) {
                surface = nVar.f15060p;
            } else {
                nVar.m();
                long nanoTime = System.nanoTime();
                try {
                    nVar.b();
                    nVar.a();
                    nVar.f15057m.start();
                    nVar.f15068y = true;
                    nVar.f15051f.b("codecs prepared: video=" + nVar.f15057m.getName() + ", audio=" + nVar.f15058n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = nVar.f15060p;
                } catch (IOException | RuntimeException e7) {
                    nVar.j();
                    throw e7;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f15008r;
        if (this.f14997n0) {
            surface2 = this.f15014t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.m0;
        int i13 = this.f14972e;
        int i14 = this.f15011s;
        boolean D = D(this.f15002p);
        boolean z12 = this.f14983i;
        o oVar2 = this.f14986j;
        n nVar2 = this.f15022x;
        xa.c cVar2 = this.f14989k;
        Objects.requireNonNull(cVar2);
        t tVar = new t(size, surface5, surface2, z11, i13, i14, D, z12, oVar2, nVar2, new c(cVar2));
        this.f15020w = tVar;
        tVar.f15134t0 = new a(this, 2);
        t tVar2 = this.f15020w;
        if (tVar2.f15130r0) {
            surface3 = tVar2.f15138w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar2.f15133t = handlerThread;
            handlerThread.start();
            tVar2.f15128q0 = System.nanoTime();
            o oVar3 = tVar2.f15112i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar2.f15098a);
            sb2.append(", crop=");
            sb2.append(tVar2.f15114j);
            sb2.append(", output=");
            sb2.append(tVar2.f15109g);
            sb2.append("x");
            sb2.append(tVar2.f15109g);
            sb2.append(", filter=");
            if (tVar2.f15114j == tVar2.f15109g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(tVar2.h);
            sb2.append(", dualInput=");
            sb2.append(tVar2.f15107f);
            sb2.append(", glPreview=");
            if (tVar2.f15105e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            oVar3.b(sb2.toString());
            Handler handler = new Handler(tVar2.f15133t.getLooper());
            tVar2.f15135u = handler;
            handler.post(new w1(29, tVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar2.f15139w0 == null) {
                    surface3 = tVar2.f15138w;
                } else {
                    RuntimeException runtimeException = tVar2.f15139w0;
                    tVar2.f15139w0 = null;
                    tVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                tVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e10);
            }
        }
        this.f15017u = surface3;
        if (this.m0) {
            o0 o0Var2 = this.H;
            o0 o0Var3 = o0.f15076a;
            if (o0Var2 == o0Var3) {
                o0Var = o0.f15077b;
            } else {
                o0Var = o0Var3;
            }
            if (o0Var == o0Var3) {
                jVar = this.f14984i0;
            } else {
                jVar = this.f14987j0;
            }
            if (jVar != null) {
                t tVar3 = this.f15020w;
                Size size2 = jVar.f14949e;
                int i15 = jVar.f14950f;
                boolean D2 = D(jVar.f14948c);
                Handler handler2 = tVar3.f15135u;
                if (tVar3.f15130r0 && tVar3.f15107f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new q(tVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 1));
                    try {
                        countDownLatch2.await();
                        RuntimeException runtimeException2 = runtimeExceptionArr[0];
                        if (runtimeException2 != null) {
                            throw runtimeException2;
                        }
                    } catch (InterruptedException e11) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException("Secondary input update was interrupted", e11);
                    }
                }
                t tVar4 = this.f15020w;
                if (tVar4.f15107f && (surface4 = tVar4.f15142y) != null) {
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
        } catch (IOException | RuntimeException e7) {
            if (this.m0) {
                this.f14986j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e7);
                t tVar = this.f15020w;
                if (tVar != null) {
                    tVar.l();
                    this.f15020w = null;
                }
                n nVar = this.f15022x;
                if (nVar != null) {
                    nVar.q();
                    this.f15022x = null;
                }
                this.f15017u = null;
                this.v = null;
                this.m0 = false;
                this.f14997n0 = false;
                this.f14990k0 = false;
                this.f14993l0 = true;
                surfaceTexture.setDefaultBufferSize(this.f15005q.getWidth(), this.f15005q.getHeight());
                v();
                return;
            }
            throw e7;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder x(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, ki.j r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: ki.k.x(android.hardware.camera2.CameraDevice, android.view.Surface, ki.j, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.f14993l0 = true;
        this.f14990k0 = false;
        this.m0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f14986j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f15012s0;
        this.f15012s0 = null;
        this.f15021w0 = null;
        if (cameraDevice != null && cameraDevice != this.f15026z) {
            this.f15015t0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
