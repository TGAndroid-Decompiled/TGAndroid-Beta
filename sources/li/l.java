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
import di.e4;
import di.x0;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import ji.d4;
import ji.v2;
public final class l {
    public CameraCaptureSession A;
    public long A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public boolean D0;
    public x E;
    public long E0;
    public volatile n0 F;
    public long F0;
    public n0 G;
    public long G0;
    public n0 H;
    public long H0;
    public o0 I;
    public long I0;
    public p0 J;
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
    public final Context f14827a;
    public volatile boolean f14828a0;
    public long f14829a1;
    public final CameraManager f14830b;
    public volatile boolean f14831b0;
    public long f14832b1;
    public final TextureView f14833c;
    public volatile boolean f14834c0;
    public long f14835c1;
    public final s0 d;
    public boolean f14836d0;
    public double f14837d1;
    public final int e;
    public boolean f14838e0;
    public long f14839e1;
    public final int f14840f;
    public boolean f14841f0;
    public long f14842f1;
    public final o0 f14843g;
    public boolean f14844g0;
    public long f14845g1;
    public final p0 h;
    public boolean f14846h0;
    public long f14847h1;
    public final boolean f14848i;
    public j f14849i0;
    public long f14850i1;
    public final p f14851j;
    public j f14852j0;
    public long f14853j1;
    public final d4 f14854k;
    public boolean f14855k0;
    public long f14856k1;
    public boolean f14858l0;
    public final e4 l1;
    public HandlerThread f14859m;
    public boolean m0;
    public final a f14860m1;
    public Handler f14861n;
    public boolean f14862n0;
    public final a f14863n1;
    public String f14864o;
    public boolean f14865o0;
    public final e f14866o1;
    public CameraCharacteristics f14867p;
    public boolean f14868p0;
    public final f f14869p1;
    public Size f14870q;
    public boolean f14871q0;
    public final f f14872q1;
    public volatile Size f14873r;
    public boolean f14874r0;
    public final g f14875r1;
    public volatile int f14876s;
    public CameraDevice f14877s0;
    public final g f14878s1;
    public Surface f14879t;
    public CameraDevice f14880t0;
    public final h f14881t1;
    public Surface f14882u;
    public CameraDevice f14883u0;
    public Surface v;
    public CameraDevice f14884v0;
    public u f14885w;
    public j f14886w0;
    public o f14887x;
    public n0 f14888x0;
    public o f14889y;
    public boolean f14890y0;
    public CameraDevice f14891z;
    public boolean f14892z0;
    public final Rect f14857l = new Rect();
    public float O = 1.0f;

    public l(Context context, TextureView textureView, s0 s0Var, int i10, o0 o0Var, p0 p0Var, boolean z10, p pVar, d4 d4Var) {
        e4 e4Var = new e4(this, 2);
        this.l1 = e4Var;
        this.f14860m1 = new a(this, 4);
        this.f14863n1 = new a(this, 5);
        this.f14866o1 = new e(this, 0);
        this.f14869p1 = new f(this, 0);
        this.f14872q1 = new f(this, 1);
        this.f14875r1 = new g(this, 0);
        this.f14878s1 = new g(this, 1);
        this.f14881t1 = new h(this);
        this.f14827a = context.getApplicationContext();
        this.f14830b = (CameraManager) context.getSystemService("camera");
        this.f14833c = textureView;
        this.d = s0Var;
        this.e = s0Var.f14956a;
        this.f14840f = i10;
        this.f14843g = o0Var;
        this.h = p0Var;
        this.f14848i = z10;
        this.f14851j = pVar;
        this.f14854k = d4Var;
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

    public static float W(double d, long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        double d10 = j11;
        double d11 = j10 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static void a(l lVar) {
        CameraDevice cameraDevice = lVar.f14891z;
        CameraDevice cameraDevice2 = lVar.f14877s0;
        if (lVar.m0 && cameraDevice != null && cameraDevice2 != null && lVar.f14882u != null && lVar.v != null && lVar.A == null && lVar.B == null) {
            lVar.f14865o0 = false;
            lVar.f14868p0 = false;
            try {
                lVar.G0 = SystemClock.elapsedRealtimeNanos();
                p pVar = lVar.f14851j;
                pVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + lVar.f14873r + ", fpsRange=" + lVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(lVar.f14882u), lVar.f14878s1, lVar.f14861n);
                cameraDevice2.createCaptureSession(Arrays.asList(lVar.v), lVar.f14875r1, lVar.f14861n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                lVar.A("session request failed", e, false);
            }
        }
    }

    public static void b(l lVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == lVar.f14891z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && lVar.m0) {
            p pVar = lVar.f14851j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            pVar.b(sb2.toString());
            lVar.m0 = false;
            lVar.f14855k0 = false;
            lVar.f14858l0 = true;
            lVar.f14874r0 = false;
            lVar.f14877s0 = null;
            lVar.f14886w0 = null;
            lVar.r();
            lVar.f14880t0 = cameraDevice;
            if (!lVar.V || lVar.f14891z == null || lVar.A != null || lVar.X) {
                z11 = false;
            }
            lVar.f14890y0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == lVar.f14877s0) {
            lVar.f14877s0 = null;
        }
        lVar.f14874r0 = false;
        cameraDevice.close();
        if (z10) {
            lVar.q();
            lVar.f14891z = null;
            if (illegalStateException != null) {
                lVar.N(illegalStateException);
                return;
            } else {
                lVar.N(new IllegalStateException(t8.b.h("Active warm camera ", str)));
                return;
            }
        }
        lVar.y("standby device " + str, illegalStateException);
        if (lVar.f14888x0 != null) {
            lVar.t();
        } else if (lVar.V && lVar.f14891z != null && lVar.A == null && !lVar.X) {
            lVar.f14851j.b("warm camera failed during startup; configuring active camera only");
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
        if (cameraDevice == lVar.f14883u0) {
            lVar.f14883u0 = null;
        }
        if (cameraDevice == lVar.f14884v0) {
            lVar.f14884v0 = null;
        }
        p pVar = lVar.f14851j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = lVar.f14883u0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = lVar.f14884v0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        pVar.b(sb2.toString());
        lVar.H();
        return true;
    }

    public static boolean e(l lVar, CameraDevice cameraDevice) {
        if (cameraDevice != lVar.f14880t0) {
            return false;
        }
        lVar.f14880t0 = null;
        p pVar = lVar.f14851j;
        pVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (lVar.f14890y0) {
            lVar.f14890y0 = false;
            if (lVar.V && !lVar.f14831b0 && lVar.f14891z != null) {
                lVar.f14851j.b("retrying capture session after standby camera closed");
                lVar.u();
                return true;
            }
            return true;
        } else if (lVar.X && lVar.f14888x0 != null) {
            lVar.f14851j.b("continuing pending switch after DUAL_ACTIVE fallback");
            lVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(l lVar) {
        n0 n0Var = lVar.f14888x0;
        if (n0Var != null && lVar.m0 && lVar.f14865o0 && lVar.f14868p0) {
            lVar.f14888x0 = null;
            if (!lVar.b0(n0Var)) {
                lVar.X = false;
                lVar.a0(n0Var);
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

    public static j6.l m(Size[] sizeArr, s0 s0Var, o0 o0Var) {
        int i10;
        j6.l o10;
        o0 o0Var2;
        j6.l o11;
        o0 o0Var3 = o0.f14936c;
        if (o0Var == o0Var3) {
            i10 = s0Var.f14956a;
        } else {
            s0 s0Var2 = s0.P480;
            o0 o0Var4 = o0.f14934a;
            if (s0Var == s0Var2) {
                if (o0Var == o0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (o0Var != o0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l o12 = o(sizeArr, i10, o0Var);
        if (o12 != null) {
            return o12;
        }
        if (s0Var == s0.P360 && o0Var == (o0Var2 = o0.f14935b) && (o11 = o(sizeArr, 480, o0Var2)) != null) {
            return o11;
        }
        int i11 = s0Var.f14956a;
        if (o0Var != o0Var3 && (o10 = o(sizeArr, i11, o0Var3)) != null) {
            return o10;
        }
        int i12 = s0Var.f14956a;
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
        return new j6.l(n(sizeArr, size), size, o0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static j6.l o(Size[] sizeArr, int i10, o0 o0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                j6.l lVar2 = new j6.l(n10, size, o0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f12873b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) lVar.f12874c;
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

    public static long z(long j10) {
        if (j10 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
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
            this.f14851j.b(sb2.toString());
            this.m0 = false;
            this.f14855k0 = false;
            this.f14858l0 = true;
            this.f14865o0 = false;
            this.f14868p0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f14877s0;
                this.f14877s0 = null;
                this.f14886w0 = null;
                if (cameraDevice != null) {
                    this.f14880t0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f14880t0 == null && this.X && this.f14888x0 != null) {
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
        o oVar = this.f14887x;
        if (oVar != null) {
            synchronized (oVar) {
                z10 = oVar.f14933z;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f14841f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f14841f0 = true;
        q();
        j6.l lVar = this.L;
        if (lVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = p0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f14867p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f14870q = (Size) lVar.f12873b;
        this.f14873r = (Size) lVar.f12874c;
        this.f14876s = lVar.f12872a;
        this.I = (o0) lVar.d;
        this.f14849i0 = null;
        this.f14852j0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f14833c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f14870q.getWidth(), this.f14870q.getHeight());
        }
        u uVar = this.f14885w;
        if (uVar != null) {
            uVar.l();
            this.f14885w = null;
        }
        o oVar2 = this.f14887x;
        if (oVar2 != null) {
            oVar2.q();
            this.f14887x = null;
        }
        this.f14882u = null;
        try {
            v();
            O();
            p pVar = this.f14851j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f14870q);
            sb2.append(", recording=");
            sb2.append(this.f14873r);
            sb2.append(", crop=");
            sb2.append(this.f14876s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            pVar.b(sb2.toString());
            Handler handler = this.f14861n;
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
        for (Set<String> set : this.f14830b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == n0.f14910b && (cameraCharacteristics = this.f14867p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.f14892z0) {
            if (cameraDevice == this.f14883u0 || cameraDevice == this.f14884v0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.f14892z0 && this.f14883u0 == null && this.f14884v0 == null) {
            this.f14892z0 = false;
            this.X = false;
            p pVar = this.f14851j;
            pVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.H0));
            if (this.V && !this.f14831b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f14891z == null) {
            if (f0.c.b(this.f14827a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f14827a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.C0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.C0);
                    if (this.f14891z == null && this.f14887x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f14833c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.m0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f14833c.getWidth(), this.f14833c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f14870q.getWidth(), this.f14870q.getHeight());
                        }
                        if (this.f14879t == null) {
                            this.f14879t = new Surface(surfaceTexture);
                        }
                        if (this.f14887x == null) {
                            w(surfaceTexture);
                        } else {
                            u uVar = this.f14885w;
                            if (uVar != null) {
                                uVar.n(this.f14873r, this.f14876s, D(this.f14867p));
                                Surface surface = null;
                                if (!this.m0 && this.f14871q0) {
                                    this.f14871q0 = false;
                                    u uVar2 = this.f14885w;
                                    Handler handler = uVar2.f14997u;
                                    if (uVar2.f14992r0 && handler != null) {
                                        handler.post(new x0((Object) uVar2, false, (Object) null, 7));
                                    }
                                }
                                u uVar3 = this.f14885w;
                                Surface surface2 = uVar3.f15000w;
                                if (surface2 != null) {
                                    this.f14882u = surface2;
                                    if (this.m0 && (!uVar3.f14969f || (surface = uVar3.f15004y) == null)) {
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
                        p pVar = this.f14851j;
                        pVar.b("camera open requested: id=" + this.f14864o + ", preview=" + this.f14870q + ", recording=" + this.f14873r + ", crop=" + this.f14876s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.m0);
                        this.f14830b.openCamera(this.f14864o, this.f14869p1, this.f14861n);
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
        n0 n0Var;
        j jVar;
        if (this.f14855k0 && !this.f14858l0 && !(z10 = this.f14874r0) && (cameraDevice = this.f14877s0) == null) {
            n0 n0Var2 = this.H;
            n0 n0Var3 = n0.f14909a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f14910b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                jVar = this.f14849i0;
            } else {
                jVar = this.f14852j0;
            }
            if (jVar != null) {
                String str = jVar.f14807a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f14886w0 = jVar;
                        this.f14874r0 = true;
                        this.A0 = SystemClock.elapsedRealtimeNanos();
                        p pVar = this.f14851j;
                        pVar.b("warm camera open requested: id=" + str + ", facing=" + jVar.f14808b);
                        this.f14830b.openCamera(str, this.f14872q1, this.f14861n);
                    } catch (Exception e) {
                        this.f14874r0 = false;
                        y("open request failed", e);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f14858l0) {
            return;
        }
        if (this.f14855k0) {
            this.m0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        p pVar = this.f14851j;
        if (i10 < 30) {
            this.f14858l0 = true;
            pVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        j l4 = l();
        p0 p0Var = l4.h;
        String str2 = l4.f14807a;
        n0 n0Var = l4.f14808b;
        n0 n0Var2 = n0.f14909a;
        if (n0Var == n0Var2) {
            n0Var2 = n0.f14910b;
        }
        try {
            try {
                S(n0Var2);
                j l10 = l();
                p0 p0Var2 = l10.h;
                String str3 = l10.f14807a;
                boolean E = E(str2, str3);
                this.f14855k0 = E;
                if (E && p0Var != p0Var2) {
                    this.f14855k0 = false;
                    pVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f14810f + ", second=" + l10.e + "/" + l10.f14810f + ", firstFps=" + p0Var.f14942a + ", secondFps=" + p0Var2.f14942a);
                }
                boolean z10 = this.f14855k0;
                if (!z10) {
                    this.f14858l0 = true;
                }
                this.m0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f14855k0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f14855k0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.f14858l0 = true;
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
        if (this.f14892z0) {
            return;
        }
        this.f14892z0 = true;
        this.f14858l0 = true;
        this.f14855k0 = false;
        this.f14890y0 = false;
        this.f14888x0 = null;
        this.D0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f14891z;
        this.f14883u0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f14877s0;
        this.f14884v0 = cameraDevice2;
        this.f14891z = null;
        this.f14877s0 = null;
        this.f14886w0 = null;
        CameraDevice cameraDevice3 = this.f14880t0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f14880t0 = null;
        }
        p pVar = this.f14851j;
        StringBuilder v = a1.g.v("camera warm-switch recovery started: reason=", str, ", target=");
        v.append(this.F);
        v.append(", targetId=");
        CameraDevice cameraDevice4 = this.f14883u0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        v.append(id2);
        v.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f14884v0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        v.append(str3);
        v.append(", fps=");
        p0 p0Var = this.J;
        if (p0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(p0Var.f14942a);
        }
        v.append(valueOf);
        v.append(", switchElapsedMs=");
        v.append(z(this.H0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        v.append(str2);
        pVar.b(v.toString());
        CameraDevice cameraDevice6 = this.f14883u0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f14884v0;
        if (cameraDevice7 != null && cameraDevice7 != this.f14883u0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f14833c.setSurfaceTextureListener(null);
        this.f14833c.removeOnLayoutChangeListener(this.l1);
        Handler handler = this.f14861n;
        HandlerThread handlerThread = this.f14859m;
        this.f14861n = null;
        this.f14859m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new v2(10, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f14851j.a("camera error", exc);
        d4 d4Var = this.f14854k;
        ((u0) d4Var.f13233b).f15011i.post(new v2(13, d4Var, exc));
    }

    public final void O() {
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f14829a1 = 0L;
        this.f14832b1 = 0L;
        this.f14835c1 = 0L;
        this.f14837d1 = 0.0d;
        this.f14839e1 = 0L;
        this.f14842f1 = 0L;
        this.f14845g1 = 0L;
        this.f14847h1 = 0L;
        this.f14850i1 = 0L;
        this.f14853j1 = 0L;
        this.f14856k1 = 0L;
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

    public final k Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        Range[] rangeArr;
        j6.l lVar2;
        int i10;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        p pVar = this.f14851j;
        p0 p0Var = this.h;
        p0 p0Var2 = p0.FPS_30;
        if (p0Var != p0Var2) {
            if (this.f14846h0) {
                rangeArr = rangeArr4;
                i10 = 30;
                lVar2 = lVar;
            } else {
                int i11 = p0Var.f14942a;
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
                        j6.l m10 = m(sizeArr2, this.d, this.f14843g);
                        pVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new k(p0.FPS_60, C, m10, 0);
                    } catch (RuntimeException unused) {
                        pVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    pVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                pVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new k(p0Var2, C2, lVar, 0);
            }
        } else {
            rangeArr = rangeArr4;
            lVar2 = lVar;
            i10 = 30;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder v = a1.g.v("fps selection: id=", str, ", requested=");
        v.append(p0Var.f14942a);
        v.append(", mode=REGULAR, range=");
        v.append(C3);
        if (this.f14846h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        v.append(str2);
        pVar.b(v.toString());
        return new k(p0Var2, C3, lVar2, 0);
    }

    public final void R(String str, Exception exc) {
        this.f14890y0 = true;
        y(str, exc);
        if (this.f14880t0 == null) {
            this.f14890y0 = false;
            u();
            return;
        }
        this.f14851j.b("capture session retry waiting for standby camera close: id=" + this.f14880t0.getId());
    }

    public final void S(li.n0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: li.l.S(li.n0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f14861n;
        if (this.V && handler != null) {
            handler.post(new ah.t(10, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f14861n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f14863n1);
            handler.post(this.f14863n1);
            return true;
        }
        return false;
    }

    public final void X(x xVar, long j10, n0 n0Var) {
        if (this.f14859m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f14859m = handlerThread;
            handlerThread.start();
            this.f14861n = new Handler(this.f14859m.getLooper());
        }
        this.E = xVar;
        this.M = j10;
        this.F = n0Var;
        this.V = true;
        this.f14831b0 = false;
        this.f14889y = null;
        this.f14834c0 = true;
        this.E0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        p pVar = this.f14851j;
        pVar.b("camera segment start: facing=" + n0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f14833c.isAvailable());
        this.f14833c.setSurfaceTextureListener(this.f14866o1);
        Handler handler = this.f14861n;
        if (this.V && handler != null && this.f14833c.isAvailable()) {
            handler.post(new a(this, 6));
        }
    }

    public final boolean Y() {
        Handler handler = this.f14861n;
        if (!this.V || this.f14831b0 || handler == null) {
            return false;
        }
        this.f14831b0 = true;
        this.f14834c0 = false;
        this.f14851j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean Z(n0 n0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (n0Var == n0.f14909a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f14830b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((p0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f14843g)).f14820b) == p0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(li.n0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: li.l.a0(li.n0):void");
    }

    public final boolean b0(n0 n0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        j jVar;
        j jVar2;
        CaptureRequest.Builder x10;
        if (!this.m0 || !this.f14865o0 || !this.f14868p0 || (cameraDevice = this.f14891z) == null || (cameraDevice2 = this.f14877s0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (jVar = this.f14886w0) == null || jVar.f14808b != n0Var || this.f14885w == null) {
            return false;
        }
        this.f14891z = cameraDevice2;
        this.f14877s0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f14882u;
        this.f14882u = this.v;
        this.v = surface;
        if (this.G == n0.f14909a) {
            jVar2 = this.f14849i0;
        } else {
            jVar2 = this.f14852j0;
        }
        this.f14886w0 = jVar2;
        h(jVar);
        this.G = n0Var;
        try {
            try {
                x10 = x(this.f14891z, this.f14882u, jVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e7) {
            e = e7;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.f14881t1, this.f14861n);
            j jVar3 = this.f14886w0;
            if (jVar3 != null) {
                CaptureRequest.Builder x11 = x(this.f14877s0, this.v, jVar3, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.f14881t1, this.f14861n);
            }
            boolean z10 = !this.f14871q0;
            this.f14871q0 = z10;
            long j10 = this.H0;
            u uVar = this.f14885w;
            b bVar = new b(this, n0Var, j10, 0);
            Handler handler = uVar.f14997u;
            if (uVar.f14992r0 && handler != null) {
                handler.post(new x0(uVar, z10, bVar, 7));
            }
            this.f14865o0 = true;
            this.f14868p0 = true;
            this.D0 = true;
            this.Z = false;
            this.X = false;
            this.f14828a0 = false;
            O();
            this.f14851j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f14891z.getId() + ", standbyId=" + this.f14877s0.getId() + ", input=" + (this.f14871q0 ? 1 : 0) + ", elapsedMs=" + z(this.H0));
            this.f14833c.post(new a(this, 1));
            d4 d4Var = this.f14854k;
            ((u0) d4Var.f13233b).f15011i.post(new x0((Object) d4Var, (Object) new i(this.G, this.I, this.J, this.f14870q, this.f14873r, this.O, F()), true, 8));
            return true;
        } catch (CameraAccessException e10) {
            e = e10;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalArgumentException e11) {
            e = e11;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalStateException e12) {
            e = e12;
            A("role switch request failed", e, false);
            return true;
        }
    }

    public final boolean c0(n0 n0Var) {
        String id2;
        CameraDevice cameraDevice = this.f14877s0;
        j jVar = this.f14886w0;
        if (cameraDevice == null || jVar == null || jVar.f14808b != n0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f14833c.getSurfaceTexture();
        j jVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f14891z;
        n0 n0Var2 = this.G;
        if (n0Var2 != null) {
            if (n0Var2 == n0.f14909a) {
                jVar2 = this.f14849i0;
            } else {
                jVar2 = this.f14852j0;
            }
        }
        q();
        this.f14877s0 = cameraDevice2;
        this.f14886w0 = jVar2;
        this.f14891z = cameraDevice;
        h(jVar);
        surfaceTexture.setDefaultBufferSize(this.f14870q.getWidth(), this.f14870q.getHeight());
        u uVar = this.f14885w;
        if (uVar != null) {
            uVar.n(this.f14873r, this.f14876s, D(this.f14867p));
            Surface surface = this.f14885w.f15000w;
            if (surface != null) {
                this.f14882u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.D0 = true;
        p pVar = this.f14851j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f14864o);
        sb2.append(", standbyId=");
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", preparationMs=");
        sb2.append(z(this.H0));
        pVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        int width;
        int height;
        Integer num;
        if (this.f14834c0) {
            if (this.f14862n0) {
                this.f14833c.setTransform(new Matrix());
                this.f14851j.b("preview transform: GL output, identity matrix, view=" + this.f14833c.getWidth() + "x" + this.f14833c.getHeight());
                return;
            }
            Size size = this.f14873r;
            if (size != null && this.f14833c.getWidth() != 0 && this.f14833c.getHeight() != 0) {
                int min = Math.min(this.f14876s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f14833c;
                boolean z10 = false;
                if (this.f14867p != null && textureView.getDisplay() != null && (num = (Integer) this.f14867p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, this.f14833c.getWidth() * 0.5f, this.f14833c.getHeight() * 0.5f);
                this.f14833c.setTransform(matrix);
                this.f14851j.b("preview transform: view=" + this.f14833c.getWidth() + "x" + this.f14833c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: li.l.g():void");
    }

    public final void h(j jVar) {
        this.f14864o = jVar.f14807a;
        this.H = jVar.f14808b;
        this.f14867p = jVar.f14809c;
        this.f14870q = jVar.d;
        this.f14873r = jVar.e;
        this.f14876s = jVar.f14810f;
        this.I = jVar.f14811g;
        this.J = jVar.h;
        this.K = jVar.f14812i;
        this.L = jVar.f14813j;
        this.O = jVar.f14814k;
        this.f14841f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f14861n;
        if (handler != null) {
            handler.removeCallbacks(this.f14860m1);
        }
        this.f14889y = null;
    }

    public final j l() {
        return new j(this.f14864o, this.H, this.f14867p, this.f14870q, this.f14873r, this.f14876s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f14892z0 = false;
        this.f14890y0 = false;
        this.f14883u0 = null;
        this.f14884v0 = null;
        this.f14834c0 = false;
        this.Z = false;
        this.f14828a0 = false;
        this.C = null;
        this.Q = false;
        this.f14888x0 = null;
        this.f14874r0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f14891z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f14891z = null;
        }
        CameraDevice cameraDevice2 = this.f14877s0;
        this.f14877s0 = null;
        this.f14886w0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f14880t0;
        this.f14880t0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        u uVar = this.f14885w;
        if (uVar != null) {
            uVar.l();
            this.f14885w = null;
        }
        Surface surface = this.f14879t;
        if (surface != null) {
            surface.release();
            this.f14879t = null;
        }
        this.f14882u = null;
        this.v = null;
        this.m0 = false;
        this.f14862n0 = false;
        this.f14865o0 = false;
        this.f14868p0 = false;
        this.f14871q0 = false;
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
        this.f14868p0 = false;
    }

    public final void t() {
        String str;
        this.f14888x0 = null;
        this.D0 = false;
        if (this.f14855k0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f14851j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f14891z;
        if (cameraDevice != null) {
            this.f14891z = null;
            this.B0 = SystemClock.elapsedRealtimeNanos();
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
        n0 n0Var;
        j jVar;
        Surface surface4;
        this.f14862n0 = this.m0;
        x xVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f14840f;
        int i12 = this.J.f14942a;
        p pVar = this.f14851j;
        d4 d4Var = this.f14854k;
        Objects.requireNonNull(d4Var);
        o oVar = new o(xVar, j10, i10, i11, i12, pVar, new c(d4Var));
        this.f14887x = oVar;
        synchronized (oVar) {
            if (oVar.f14932y) {
                surface = oVar.f14924p;
            } else {
                oVar.m();
                long nanoTime = System.nanoTime();
                try {
                    oVar.b();
                    oVar.a();
                    oVar.f14921m.start();
                    oVar.f14932y = true;
                    oVar.f14915f.b("codecs prepared: video=" + oVar.f14921m.getName() + ", audio=" + oVar.f14922n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = oVar.f14924p;
                } catch (IOException | RuntimeException e) {
                    oVar.j();
                    throw e;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f14873r;
        if (this.f14862n0) {
            surface2 = this.f14879t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.m0;
        int i13 = this.e;
        int i14 = this.f14876s;
        boolean D = D(this.f14867p);
        boolean z12 = this.f14848i;
        p pVar2 = this.f14851j;
        o oVar2 = this.f14887x;
        d4 d4Var2 = this.f14854k;
        Objects.requireNonNull(d4Var2);
        u uVar = new u(size, surface5, surface2, z11, i13, i14, D, z12, pVar2, oVar2, new c(d4Var2));
        this.f14885w = uVar;
        uVar.f14996t0 = new a(this, 2);
        u uVar2 = this.f14885w;
        if (uVar2.f14992r0) {
            surface3 = uVar2.f15000w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            uVar2.f14995t = handlerThread;
            handlerThread.start();
            uVar2.f14990q0 = System.nanoTime();
            p pVar3 = uVar2.f14974i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(uVar2.f14961a);
            sb2.append(", crop=");
            sb2.append(uVar2.f14976j);
            sb2.append(", output=");
            sb2.append(uVar2.f14971g);
            sb2.append("x");
            sb2.append(uVar2.f14971g);
            sb2.append(", filter=");
            if (uVar2.f14976j == uVar2.f14971g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(uVar2.h);
            sb2.append(", dualInput=");
            sb2.append(uVar2.f14969f);
            sb2.append(", glPreview=");
            if (uVar2.e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            pVar3.b(sb2.toString());
            Handler handler = new Handler(uVar2.f14995t.getLooper());
            uVar2.f14997u = handler;
            handler.post(new v2(11, uVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (uVar2.f15001w0 == null) {
                    surface3 = uVar2.f15000w;
                } else {
                    RuntimeException runtimeException = uVar2.f15001w0;
                    uVar2.f15001w0 = null;
                    uVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                uVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.f14882u = surface3;
        if (this.m0) {
            n0 n0Var2 = this.H;
            n0 n0Var3 = n0.f14909a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f14910b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                jVar = this.f14849i0;
            } else {
                jVar = this.f14852j0;
            }
            if (jVar != null) {
                u uVar3 = this.f14885w;
                Size size2 = jVar.e;
                int i15 = jVar.f14810f;
                boolean D2 = D(jVar.f14809c);
                Handler handler2 = uVar3.f14997u;
                if (uVar3.f14992r0 && uVar3.f14969f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new r(uVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 1));
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
                u uVar4 = this.f14885w;
                if (uVar4.f14969f && (surface4 = uVar4.f15004y) != null) {
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
            if (this.m0) {
                this.f14851j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                u uVar = this.f14885w;
                if (uVar != null) {
                    uVar.l();
                    this.f14885w = null;
                }
                o oVar = this.f14887x;
                if (oVar != null) {
                    oVar.q();
                    this.f14887x = null;
                }
                this.f14882u = null;
                this.v = null;
                this.m0 = false;
                this.f14862n0 = false;
                this.f14855k0 = false;
                this.f14858l0 = true;
                surfaceTexture.setDefaultBufferSize(this.f14870q.getWidth(), this.f14870q.getHeight());
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
        this.f14858l0 = true;
        this.f14855k0 = false;
        this.m0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f14851j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f14877s0;
        this.f14877s0 = null;
        this.f14886w0 = null;
        if (cameraDevice != null && cameraDevice != this.f14891z) {
            this.f14880t0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
