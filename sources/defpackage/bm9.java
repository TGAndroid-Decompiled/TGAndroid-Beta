package defpackage;

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
import android.view.Display;
import android.view.Surface;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
public final class bm9 {
    public CameraCaptureSession A;
    public long A0;
    public CaptureRequest.Builder B;
    public int B0;
    public CaptureRequest.Builder C;
    public long C0;
    public om9 D;
    public long D0;
    public volatile nn9 E;
    public long E0;
    public nn9 F;
    public long F0;
    public nn9 G;
    public long G0;
    public on9 H;
    public long H0;
    public pn9 I;
    public long I0;
    public Range J;
    public long J0;
    public kq K;
    public long K0;
    public long L;
    public long L0;
    public volatile float M;
    public double M0;
    public long N0;
    public boolean O;
    public long O0;
    public boolean P;
    public long P0;
    public int Q;
    public long Q0;
    public int R;
    public long R0;
    public int S;
    public long S0;
    public int T;
    public long T0;
    public volatile boolean U;
    public long U0;
    public boolean V;
    public long V0;
    public boolean W;
    public long W0;
    public volatile boolean X;
    public long X0;
    public volatile boolean Y;
    public long Y0;
    public volatile boolean Z;
    public long Z0;
    public final Context a;
    public boolean a0;
    public long a1;
    public final CameraManager b;
    public boolean b0;
    public double b1;
    public final rq5 c;
    public boolean c0;
    public long c1;
    public final sn9 d;
    public boolean d0;
    public long d1;
    public final short e;
    public boolean e0;
    public long e1;
    public final int f;
    public byte f0;
    public long f1;
    public final on9 g;
    public zl9 g0;
    public long g1;
    public final pn9 h;
    public zl9 h0;
    public long h1;
    public final boolean i;
    public boolean i0;
    public long i1;
    public final fm9 j;
    public boolean j0;
    public final ol1 j1;
    public final et8 k;
    public boolean k0;
    public final rl9 k1;
    public boolean l0;
    public final rl9 l1;
    public HandlerThread m;
    public boolean m0;
    public final tr5 m1;
    public Handler n;
    public boolean n0;
    public final vl9 n1;
    public String o;
    public CameraDevice o0;
    public final vl9 o1;
    public CameraCharacteristics p;
    public zl9 p0;
    public final wl9 p1;
    public volatile Size q;
    public nn9 q0;
    public final wl9 q1;
    public volatile int r;
    public final xl9 r1;
    public Surface s;
    public Surface t;
    public volatile boolean t0;
    public Surface u;
    public am9 u0;
    public km9 v;
    public am9 v0;
    public em9 w;
    public int w0;
    public em9 x;
    public HandlerThread x0;
    public CameraDevice y;
    public long y0;
    public CameraCaptureSession z;
    public long z0;
    public final Rect l = new Rect();
    public float N = 1.0f;
    public final ArrayList r0 = new ArrayList();
    public final ArrayList s0 = new ArrayList();
    public int s1 = 1;

    public bm9(Context context, rq5 rq5Var, sn9 sn9Var, int i, on9 on9Var, pn9 pn9Var, boolean z, fm9 fm9Var, et8 et8Var) {
        ol1 ol1Var = new ol1(this, (byte) 5);
        this.j1 = ol1Var;
        this.k1 = new rl9(this, (byte) 5);
        this.l1 = new rl9(this, (byte) 6);
        this.m1 = new tr5(this, (byte) 2);
        this.n1 = new vl9(this, (byte) 0);
        this.o1 = new vl9(this, (byte) 1);
        this.p1 = new wl9(this, (byte) 0);
        this.q1 = new wl9(this, (byte) 1);
        this.r1 = new xl9(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = rq5Var;
        this.d = sn9Var;
        this.e = sn9Var.a;
        this.f = i;
        this.g = on9Var;
        this.h = pn9Var;
        this.i = z;
        this.j = fm9Var;
        this.k = et8Var;
        rq5Var.addOnLayoutChangeListener(ol1Var);
    }

    public static Range A(Range[] rangeArr, int i) {
        int i2;
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        if (i > 30) {
            i2 = i / 2;
        } else {
            i2 = 1;
        }
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i))) {
                if (((Integer) range3.getUpper()).intValue() == i && ((Integer) range3.getLower()).intValue() >= i2 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
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

    public static boolean C(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static float R(CameraCharacteristics cameraCharacteristics) {
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null && rect.width() > 0 && rect.height() > 0) {
            return Math.max(rect.width(), rect.height()) / Math.min(rect.width(), rect.height());
        }
        return 1.3333334f;
    }

    public static float U(double d, long j, long j2) {
        if (j2 == 0) {
            return 0.0f;
        }
        double d2 = j2;
        double d3 = j / d2;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d2) - (d3 * d3))) / 1000000.0d);
    }

    public static long c(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float d(long j, long j2) {
        if (j2 == 0) {
            return 0.0f;
        }
        return (((float) j) / ((float) j2)) / 1000000.0f;
    }

    public static String e(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
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

    public static kq h(Size[] sizeArr, float f, sn9 sn9Var, on9 on9Var) {
        short s;
        kq i;
        on9 on9Var2;
        kq i2;
        on9 on9Var3 = on9.c;
        if (on9Var == on9Var3) {
            s = sn9Var.a;
        } else {
            s = 720;
            sn9 sn9Var2 = sn9.P480;
            on9 on9Var4 = on9.a;
            if (sn9Var == sn9Var2) {
                if (on9Var == on9Var4) {
                    s = 960;
                }
            } else if (on9Var != on9Var4) {
                s = 540;
            }
        }
        kq i3 = i(sizeArr, f, s, on9Var);
        if (i3 != null) {
            return i3;
        }
        if (sn9Var == sn9.P360 && on9Var == (on9Var2 = on9.b) && (i2 = i(sizeArr, f, 480, on9Var2)) != null) {
            return i2;
        }
        short s2 = sn9Var.a;
        if (on9Var != on9Var3 && (i = i(sizeArr, f, s2, on9Var3)) != null) {
            return i;
        }
        short s3 = sn9Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (Math.min(size2.getWidth(), size2.getHeight()) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= s3 && (size == null || c(size2) < c(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (Math.min(size3.getWidth(), size3.getHeight()) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && c(size3) < c(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                dq9.m("Camera has no output at or below the bandwidth cap");
                return null;
            }
        }
        return new kq(size, on9Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088), (byte) 13);
    }

    public static kq i(Size[] sizeArr, float f, int i, on9 on9Var) {
        int i2;
        kq kqVar = null;
        float f2 = 0.0f;
        for (Size size : sizeArr) {
            int z = kt6.z(i, 15, 100, i);
            int min = Math.min(1920, i << 1);
            int min2 = Math.min(size.getWidth(), size.getHeight());
            int max = Math.max(size.getWidth(), size.getHeight());
            if (min2 >= i && min2 <= z && max <= min) {
                float min3 = (Math.min(1.0f, f / (Math.max(size.getWidth(), size.getHeight()) / Math.min(size.getWidth(), size.getHeight()))) * i) / Math.min(size.getWidth(), size.getHeight());
                if (kqVar == null || min3 > f2 || (i2 == 0 && c(size) < c((Size) kqVar.c))) {
                    kqVar = new kq(size, on9Var, i, (byte) 13);
                    f2 = min3;
                }
            }
        }
        return kqVar;
    }

    public static boolean o(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long x(long j) {
        if (j == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j) / 1000000;
    }

    public final void B(CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z;
        int i = 1;
        if (cameraDevice == this.y) {
            k();
            this.y = null;
            l(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException("Active camera ".concat(str));
            }
            L(illegalStateException);
            return;
        }
        if (cameraDevice == this.o0) {
            this.o0 = null;
        }
        if (!this.k0) {
            l(cameraDevice, 1);
            return;
        }
        fm9 fm9Var = this.j;
        StringBuilder k = b10.k("camera dual-active fallback: reason=standby device ", str);
        if (illegalStateException == null) {
            str2 = "";
        } else {
            str2 = ", error=" + illegalStateException;
        }
        k.append(str2);
        fm9Var.b(k.toString());
        boolean z2 = false;
        this.k0 = false;
        this.i0 = false;
        this.j0 = true;
        this.p0 = null;
        m();
        if (this.U && this.y != null && this.z == null && !this.V) {
            z = true;
        } else {
            z = false;
        }
        if (this.V && this.q0 != null) {
            z2 = true;
        }
        if (z) {
            i = 3;
        } else if (z2) {
            i = 4;
        }
        l(cameraDevice, i);
    }

    public final boolean D(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean E() {
        CameraCharacteristics cameraCharacteristics;
        if (this.F == nn9.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void F(CameraDevice cameraDevice) {
        String str;
        this.r0.remove(cameraDevice);
        this.s0.remove(cameraDevice);
        if (cameraDevice == this.y) {
            this.y = null;
        }
        if (cameraDevice == this.o0) {
            this.o0 = null;
        }
        fm9 fm9Var = this.j;
        StringBuilder sb = new StringBuilder("camera device closed: id=");
        sb.append(cameraDevice.getId());
        sb.append(", owned=");
        sb.append(this.r0.size());
        sb.append(", closing=");
        sb.append(this.s0.size());
        sb.append(", afterClose=");
        int i = this.s1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "APPLY_REQUEST";
                        }
                    } else {
                        str = "CONTINUE_SWITCH";
                    }
                } else {
                    str = "RETRY_SESSION";
                }
            } else {
                str = "REOPEN";
            }
        } else {
            str = "NONE";
        }
        sb.append(str);
        sb.append(", closeElapsedMs=");
        sb.append(x(this.z0));
        fm9Var.b(sb.toString());
        if (this.s0.isEmpty()) {
            int i2 = this.s1;
            this.s1 = 1;
            if (this.U && !this.Y && i2 != 1) {
                int F = wi8.F(i2);
                if (F != 1) {
                    if (F != 2) {
                        if (F != 3) {
                            if (F == 4) {
                                a();
                                return;
                            }
                            return;
                        }
                        this.j.b("continuing pending switch after DUAL_ACTIVE fallback");
                        p();
                        return;
                    } else if (this.y != null && this.z == null) {
                        this.j.b("retrying capture session after standby camera closed");
                        q();
                        return;
                    } else {
                        return;
                    }
                }
                this.V = false;
                G();
            }
        }
    }

    public final void G() {
        if (this.U && this.u0 == null && this.y == null) {
            if (rs.b(this.a, "android.permission.CAMERA") != 0) {
                M(new SecurityException("Camera permission is not granted"));
            } else if (rs.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                M(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.A0 = SystemClock.elapsedRealtimeNanos();
                    Q(this.E);
                    long x = x(this.A0);
                    if (this.y == null && this.w == null) {
                        J();
                    }
                    SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        rq5 rq5Var = this.c;
                        int max = Math.max(1, Math.min(720, Math.min(rq5Var.getWidth(), rq5Var.getHeight())));
                        surfaceTexture.setDefaultBufferSize(max, max);
                        if (this.s == null) {
                            this.s = new Surface(surfaceTexture);
                        }
                        if (this.w == null) {
                            t();
                        } else {
                            km9 km9Var = this.v;
                            if (km9Var != null) {
                                km9Var.n(this.q, this.r, C(this.p));
                                Surface surface = null;
                                if (!this.k0 && this.n0) {
                                    this.n0 = false;
                                    km9 km9Var2 = this.v;
                                    Handler handler = km9Var2.u;
                                    if (km9Var2.r0 && handler != null) {
                                        handler.post(new yl6((Object) km9Var2, false, (Object) null, (byte) 20));
                                    }
                                }
                                km9 km9Var3 = this.v;
                                Surface surface2 = km9Var3.w;
                                if (surface2 != null) {
                                    this.t = surface2;
                                    if (this.k0 && (!km9Var3.f || (surface = km9Var3.y) == null)) {
                                        throw new IllegalStateException("Secondary GL camera surface is unavailable");
                                    }
                                    this.u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        I();
                        this.D0 = SystemClock.elapsedRealtimeNanos();
                        fm9 fm9Var = this.j;
                        fm9Var.b("camera open requested: id=" + this.o + ", recording=" + this.q + ", crop=" + this.r + ", selectionElapsedMs=" + x + ", dualActive=" + this.k0);
                        H(this.o, false);
                    }
                } catch (Exception e) {
                    M(e);
                }
            }
        }
    }

    public final void H(String str, boolean z) {
        vl9 vl9Var;
        if (z) {
            vl9Var = this.o1;
        } else {
            vl9Var = this.n1;
        }
        am9 am9Var = new am9(this, vl9Var, z);
        if (z) {
            this.v0 = am9Var;
        } else {
            this.u0 = am9Var;
        }
        try {
            this.b.openCamera(str, am9Var, this.n);
        } catch (CameraAccessException | RuntimeException e) {
            am9Var.c();
            if (z) {
                if (this.v0 == am9Var) {
                    this.v0 = null;
                }
            } else if (this.u0 == am9Var) {
                this.u0 = null;
            }
            throw e;
        }
    }

    public final void I() {
        nn9 nn9Var;
        zl9 zl9Var;
        if (this.k0 && !this.j0 && this.v0 == null && this.o0 == null) {
            nn9 nn9Var2 = this.G;
            nn9 nn9Var3 = nn9.a;
            if (nn9Var2 == nn9Var3) {
                nn9Var = nn9.b;
            } else {
                nn9Var = nn9Var3;
            }
            if (nn9Var == nn9Var3) {
                zl9Var = this.g0;
            } else {
                zl9Var = this.h0;
            }
            if (zl9Var != null) {
                try {
                    String str = zl9Var.a;
                    this.p0 = zl9Var;
                    this.y0 = SystemClock.elapsedRealtimeNanos();
                    fm9 fm9Var = this.j;
                    fm9Var.b("warm camera open requested: id=" + str + ", facing=" + zl9Var.b);
                    H(str, true);
                } catch (Exception e) {
                    v("standby open request failed", e, 1);
                }
            }
        }
    }

    public final void J() {
        String str;
        if (this.j0) {
            return;
        }
        if (this.i0) {
            this.k0 = true;
            return;
        }
        int i = Build.VERSION.SDK_INT;
        fm9 fm9Var = this.j;
        if (i < 30) {
            this.j0 = true;
            fm9Var.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        zl9 g = g();
        pn9 pn9Var = g.g;
        String str2 = g.a;
        nn9 nn9Var = g.b;
        nn9 nn9Var2 = nn9.a;
        if (nn9Var == nn9Var2) {
            nn9Var2 = nn9.b;
        }
        try {
            try {
                Q(nn9Var2);
                zl9 g2 = g();
                pn9 pn9Var2 = g2.g;
                String str3 = g2.a;
                boolean D = D(str2, str3);
                this.i0 = D;
                if (D && pn9Var != pn9Var2) {
                    this.i0 = false;
                    fm9Var.b("camera dual-active capability rejected: incompatible frame rate, first=" + g.d + "/" + g.e + ", second=" + g2.d + "/" + g2.e + ", firstFps=" + ((int) pn9Var.a) + ", secondFps=" + ((int) pn9Var2.a));
                }
                boolean z = this.i0;
                if (!z) {
                    this.j0 = true;
                }
                this.k0 = z;
                StringBuilder sb = new StringBuilder("camera dual-active capability: supported=");
                sb.append(this.i0);
                sb.append(", pair=");
                sb.append(str2);
                sb.append("+");
                sb.append(str3);
                if (this.i0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb.append(str);
                fm9Var.b(sb.toString());
            } catch (Exception e) {
                this.j0 = true;
                fm9Var.b("camera dual-active capability unavailable: " + e);
            }
        } finally {
            b(g);
        }
    }

    public final void K() {
        this.t0 = true;
        this.U = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.j1);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new il9(this, handlerThread, (byte) 3));
        }
    }

    public final void L(IllegalStateException illegalStateException) {
        boolean z;
        em9 em9Var = this.w;
        if (em9Var != null) {
            synchronized (em9Var) {
                z = em9Var.E;
            }
            if (z) {
                this.j.a("camera lost while recording", illegalStateException);
                et8 et8Var = this.k;
                ((un9) et8Var.b).i.post(new kn9(et8Var, illegalStateException, (byte) 0));
                return;
            }
        }
        M(illegalStateException);
    }

    public final void M(Exception exc) {
        this.j.a("camera error", exc);
        et8 et8Var = this.k;
        ((un9) et8Var.b).i.post(new kn9(et8Var, exc, (byte) 1));
    }

    public final void N() {
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.a1 = 0L;
        this.b1 = 0.0d;
        this.c1 = 0L;
        this.d1 = 0L;
        this.e1 = 0L;
        this.f1 = 0L;
        this.g1 = 0L;
        this.h1 = 0L;
        this.i1 = 0L;
    }

    public final void O() {
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0.0d;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
    }

    public final in3 P(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, kq kqVar) {
        String str2;
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        fm9 fm9Var = this.j;
        pn9 pn9Var = this.h;
        pn9 pn9Var2 = pn9.FPS_30;
        if (pn9Var != pn9Var2 && !this.e0) {
            byte b = pn9Var.a;
            Range A = A(rangeArr, b);
            if (A != null) {
                ArrayList arrayList = new ArrayList(sizeArr.length);
                int length = sizeArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i;
                    Size size = sizeArr[i2];
                    int i3 = length;
                    long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                    if (outputMinFrameDuration <= 0 || outputMinFrameDuration <= 1000000000 / b) {
                        arrayList.add(size);
                    }
                    i = i2 + 1;
                    length = i3;
                }
                Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
                try {
                    kq h = h(sizeArr2, R(cameraCharacteristics), this.d, this.g);
                    fm9Var.b("fps selection: id=" + str + ", requested=" + ((int) b) + ", mode=REGULAR, range=" + A + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                    return new in3(pn9.FPS_60, A, h, (byte) 29);
                } catch (RuntimeException unused) {
                    fm9Var.b("fps selection: id=" + str + ", regular " + ((int) b) + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                }
            } else {
                fm9Var.b("fps selection: id=" + str + ", regular " + ((int) b) + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range A2 = A(rangeArr, 30);
            fm9Var.b("fps selection: id=" + str + ", requested=" + ((int) b) + ", fallback=30, range=" + A2);
            return new in3(pn9Var2, A2, kqVar, (byte) 29);
        }
        Range A3 = A(rangeArr, 30);
        StringBuilder p = wi8.p("fps selection: id=", str, ", requested=");
        p.append((int) pn9Var.a);
        p.append(", mode=REGULAR, range=");
        p.append(A3);
        if (this.e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        p.append(str2);
        fm9Var.b(p.toString());
        return new in3(pn9Var2, A3, kqVar, (byte) 29);
    }

    public final void Q(defpackage.nn9 r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm9.Q(nn9):void");
    }

    public final void S(boolean z) {
        Handler handler = this.n;
        if (this.U && handler != null) {
            handler.post(new n28((byte) 7, this, z));
        }
    }

    public final boolean T(float f) {
        this.M = Math.max(0.0f, Math.min(1.0f, f));
        Handler handler = this.n;
        if (this.U && handler != null) {
            handler.removeCallbacks(this.l1);
            handler.post(this.l1);
            return true;
        }
        return false;
    }

    public final void V(om9 om9Var, long j, nn9 nn9Var) {
        if (this.t0) {
            this.j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.D = om9Var;
        this.L = j;
        this.E = nn9Var;
        this.U = true;
        this.Y = false;
        this.c0 = false;
        this.x = null;
        this.Z = true;
        this.C0 = SystemClock.elapsedRealtimeNanos();
        O();
        N();
        fm9 fm9Var = this.j;
        fm9Var.b("camera segment start: facing=" + nn9Var + ", timelineOffsetUs=" + j + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.m1);
        Handler handler = this.n;
        if (this.U && handler != null && this.c.isAvailable()) {
            handler.post(new rl9(this, (byte) 8));
        }
    }

    public final boolean W() {
        Handler handler = this.n;
        if (!this.U || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.j.b("camera segment stop requested");
        handler.post(new rl9(this, (byte) 7));
        return true;
    }

    public final boolean X(nn9 nn9Var) {
        int i;
        bm9 bm9Var;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (nn9Var == nn9.a) {
            i = 0;
        } else {
            i = 1;
        }
        CameraManager cameraManager = this.b;
        String[] cameraIdList = cameraManager.getCameraIdList();
        int length = cameraIdList.length;
        int i2 = 0;
        while (i2 < length) {
            String str = cameraIdList[i2];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    bm9Var = this;
                    try {
                    } catch (RuntimeException unused) {
                        continue;
                    }
                } catch (RuntimeException unused2) {
                }
                if (((pn9) bm9Var.P(str, cameraCharacteristics, streamConfigurationMap, outputSizes, h(outputSizes, R(cameraCharacteristics), this.d, this.g)).b) == pn9.FPS_60) {
                    return true;
                }
                i2++;
                this = bm9Var;
            }
            bm9Var = this;
            i2++;
            this = bm9Var;
        }
        return false;
    }

    public final void Y(nn9 nn9Var) {
        if (this.U && !this.V && nn9Var != this.F) {
            this.V = true;
            this.W = true;
            this.O = false;
            this.P = false;
            this.M = 0.0f;
            et8 et8Var = this.k;
            ((un9) et8Var.b).i.post(new il9(et8Var, nn9Var, (byte) 6));
            this.F0 = SystemClock.elapsedRealtimeNanos();
            fm9 fm9Var = this.j;
            fm9Var.b("camera device switch started: from=" + this.F + ", to=" + nn9Var);
            if (!Z(nn9Var)) {
                if (this.k0) {
                    this.q0 = nn9Var;
                    this.j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
                    return;
                }
                km9 km9Var = this.v;
                if (km9Var != null) {
                    nn9 nn9Var2 = this.F;
                    Handler handler = km9Var.u;
                    if (km9Var.r0 && handler != null) {
                        handler.post(new no8(km9Var, nn9Var2, nn9Var, handler, (byte) 10));
                    }
                }
                p();
            }
        }
    }

    public final boolean Z(nn9 nn9Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        zl9 zl9Var;
        zl9 zl9Var2;
        bm9 bm9Var;
        Exception exc;
        CaptureRequest.Builder u;
        if (!this.k0 || !this.l0 || !this.m0 || (cameraDevice = this.y) == null || (cameraDevice2 = this.o0) == null || (cameraCaptureSession = this.z) == null || (cameraCaptureSession2 = this.A) == null || (zl9Var = this.p0) == null || zl9Var.b != nn9Var || this.v == null) {
            return false;
        }
        this.y = cameraDevice2;
        this.o0 = cameraDevice;
        this.z = cameraCaptureSession2;
        this.A = cameraCaptureSession;
        CaptureRequest.Builder builder = this.B;
        this.B = this.C;
        this.C = builder;
        Surface surface = this.t;
        this.t = this.u;
        this.u = surface;
        if (this.F == nn9.a) {
            zl9Var2 = this.g0;
        } else {
            zl9Var2 = this.h0;
        }
        this.p0 = zl9Var2;
        b(zl9Var);
        this.F = nn9Var;
        try {
            try {
                u = u(this.y, this.t, zl9Var, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
                bm9Var = this;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e2) {
            e = e2;
            bm9Var = this;
        }
        try {
            this.B = u;
            this.z.setRepeatingRequest(u.build(), this.r1, this.n);
            zl9 zl9Var3 = this.p0;
            if (zl9Var3 != null) {
                try {
                    CaptureRequest.Builder u2 = u(this.o0, this.u, zl9Var3, false, false);
                    this.C = u2;
                    this.A.setRepeatingRequest(u2.build(), this.r1, this.n);
                } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e3) {
                    exc = e3;
                    bm9Var = this;
                    bm9Var.y("role switch request failed", exc, false);
                    return true;
                }
            }
            boolean z = !this.n0;
            this.n0 = z;
            long j = this.F0;
            km9 km9Var = this.v;
            sl9 sl9Var = new sl9(this, nn9Var, j, (byte) 0);
            Handler handler = km9Var.u;
            if (km9Var.r0 && handler != null) {
                handler.post(new yl6(km9Var, z, sl9Var, (byte) 20));
            }
            this.l0 = true;
            this.m0 = true;
            this.W = false;
            this.V = false;
            this.X = false;
            N();
            this.j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.y.getId() + ", standbyId=" + this.o0.getId() + ", input=" + (this.n0 ? 1 : 0) + ", elapsedMs=" + x(this.F0));
            this.c.post(new rl9(this, (byte) 2));
            et8 et8Var = this.k;
            ((un9) et8Var.b).i.post(new yl6((Object) et8Var, (Object) new yl9(this.F, this.H, this.I, this.q, this.N, E()), true, (byte) 21));
            return true;
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e4) {
            e = e4;
            bm9Var = this;
            exc = e;
            bm9Var.y("role switch request failed", exc, false);
            return true;
        }
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm9.a():void");
    }

    public final void a0() {
        if (this.Z) {
            this.c.setTransform(new Matrix());
            if (w() != this.B0) {
                rl9 rl9Var = new rl9(this, (byte) 1);
                Handler handler = this.n;
                if (handler != null) {
                    handler.post(rl9Var);
                }
            }
        }
    }

    public final void b(zl9 zl9Var) {
        this.o = zl9Var.a;
        this.G = zl9Var.b;
        this.p = zl9Var.c;
        this.q = zl9Var.d;
        this.r = zl9Var.e;
        this.H = zl9Var.f;
        this.I = zl9Var.g;
        this.J = zl9Var.h;
        this.K = zl9Var.i;
        this.N = zl9Var.j;
        this.c0 = false;
        N();
    }

    public final void f() {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.k1);
        }
        this.x = null;
    }

    public final zl9 g() {
        return new zl9(this.o, this.G, this.p, this.q, this.r, this.H, this.I, this.J, this.K, this.N);
    }

    public final void j() {
        f();
        this.V = false;
        this.s1 = 1;
        this.u0 = null;
        this.v0 = null;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.B = null;
        this.P = false;
        this.q0 = null;
        k();
        m();
        this.y = null;
        this.o0 = null;
        this.p0 = null;
        if (!this.r0.isEmpty()) {
            this.z0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("closing camera devices: count=" + this.r0.size());
            ArrayList arrayList = new ArrayList(this.r0);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l((CameraDevice) obj, 1);
            }
        }
        km9 km9Var = this.v;
        if (km9Var != null) {
            km9Var.l();
            this.v = null;
        }
        Surface surface = this.s;
        if (surface != null) {
            surface.release();
            this.s = null;
        }
        this.t = null;
        this.u = null;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
    }

    public final void k() {
        CameraCaptureSession cameraCaptureSession = this.z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.z = null;
        }
        this.B = null;
    }

    public final void l(CameraDevice cameraDevice, int i) {
        ArrayList arrayList = this.s0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i != 1) {
            this.s1 = i;
        }
        cameraDevice.close();
    }

    public final void m() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
        this.m0 = false;
    }

    public final void n() {
        nn9 nn9Var = this.q0;
        if (nn9Var != null && this.k0 && this.l0 && this.m0) {
            this.q0 = null;
            if (!Z(nn9Var)) {
                this.V = false;
                Y(nn9Var);
            }
        }
    }

    public final void p() {
        String str;
        this.q0 = null;
        if (this.i0) {
            str = ", reason=standby session not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.j.b("camera switch path: sequential".concat(str));
        k();
        CameraDevice cameraDevice = this.y;
        if (cameraDevice != null) {
            this.y = null;
            this.z0 = SystemClock.elapsedRealtimeNanos();
            l(cameraDevice, 2);
        } else if (this.u0 != null) {
        } else {
            this.V = false;
            G();
        }
    }

    public final void q() {
        CameraDevice cameraDevice = this.y;
        if (cameraDevice != null && this.s != null && this.t != null) {
            try {
                this.E0 = SystemClock.elapsedRealtimeNanos();
                fm9 fm9Var = this.j;
                fm9Var.b("capture session requested: recording=" + this.q + ", fpsRange=" + this.J);
                cameraDevice.createCaptureSession(Arrays.asList(this.t), this.q1, this.n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                if (this.I == pn9.FPS_60) {
                    z("60 fps session creation rejected", e);
                } else {
                    M(e);
                }
            }
        }
    }

    public final void r() {
        CameraDevice cameraDevice = this.y;
        CameraDevice cameraDevice2 = this.o0;
        if (this.k0 && cameraDevice != null && cameraDevice2 != null && this.t != null && this.u != null && this.z == null && this.A == null) {
            this.l0 = false;
            this.m0 = false;
            try {
                this.E0 = SystemClock.elapsedRealtimeNanos();
                fm9 fm9Var = this.j;
                fm9Var.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + this.q + ", fpsRange=" + this.J);
                cameraDevice.createCaptureSession(Arrays.asList(this.t), this.q1, this.n);
                cameraDevice2.createCaptureSession(Arrays.asList(this.u), this.p1, this.n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                y("session request failed", e, false);
            }
        }
    }

    public final void s() {
        Surface surface;
        nn9 nn9Var;
        zl9 zl9Var;
        Surface surface2;
        String str;
        boolean z;
        om9 om9Var = this.D;
        long j = this.L;
        short s = this.e;
        int i = this.f;
        byte b = this.f0;
        if (b <= 0) {
            b = this.I.a;
        }
        fm9 fm9Var = this.j;
        et8 et8Var = this.k;
        Objects.requireNonNull(et8Var);
        tl9 tl9Var = new tl9(et8Var, (byte) 0);
        et8 et8Var2 = this.k;
        Objects.requireNonNull(et8Var2);
        em9 em9Var = new em9(om9Var, j, s, i, b, fm9Var, tl9Var, new tl9(et8Var2, (byte) 1));
        this.w = em9Var;
        synchronized (em9Var) {
            if (em9Var.D) {
                surface = em9Var.q;
            } else {
                em9Var.q();
                long nanoTime = System.nanoTime();
                try {
                    em9Var.b();
                    em9Var.a();
                    em9Var.n.start();
                    em9Var.D = true;
                    em9Var.f.b("codecs prepared: video=" + em9Var.n.getName() + ", audio=" + em9Var.o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = em9Var.q;
                } catch (IOException | RuntimeException e) {
                    em9Var.n();
                    throw e;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.q;
        Surface surface4 = this.s;
        boolean z2 = this.k0;
        short s2 = this.e;
        int i2 = this.r;
        boolean C = C(this.p);
        boolean z3 = this.i;
        fm9 fm9Var2 = this.j;
        em9 em9Var2 = this.w;
        et8 et8Var3 = this.k;
        Objects.requireNonNull(et8Var3);
        km9 km9Var = new km9(size, surface3, surface4, z2, s2, i2, C, z3, fm9Var2, em9Var2, new tl9(et8Var3, (byte) 2));
        this.v = km9Var;
        km9Var.u0 = new rl9(this, (byte) 3);
        int w = w();
        this.B0 = w;
        km9 km9Var2 = this.v;
        km9Var2.s0 = w;
        Handler handler = km9Var2.u;
        if (km9Var2.r0 && handler != null) {
            handler.post(new ge7(km9Var2, w, (byte) 14));
        }
        km9 km9Var3 = this.v;
        if (!km9Var3.r0) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            km9Var3.t = handlerThread;
            handlerThread.start();
            km9Var3.q0 = System.nanoTime();
            fm9 fm9Var3 = km9Var3.i;
            StringBuilder sb = new StringBuilder("GL processor start requested: input=");
            sb.append(km9Var3.a);
            sb.append(", crop=");
            sb.append(km9Var3.j);
            sb.append(", output=");
            sb.append((int) km9Var3.g);
            sb.append("x");
            sb.append((int) km9Var3.g);
            sb.append(", filter=");
            if (km9Var3.j == km9Var3.g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb.append(str);
            sb.append(", composition=");
            sb.append(km9Var3.h);
            sb.append(", dualInput=");
            sb.append(km9Var3.f);
            sb.append(", glPreview=");
            if (km9Var3.e != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            fm9Var3.b(sb.toString());
            Handler handler2 = new Handler(km9Var3.t.getLooper());
            km9Var3.u = handler2;
            handler2.post(new il9(km9Var3, countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
                if (km9Var3.x0 != null) {
                    RuntimeException runtimeException = km9Var3.x0;
                    km9Var3.x0 = null;
                    km9Var3.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                km9Var3.l();
                wa3.h("GL initialization was interrupted", e2);
                return;
            }
        }
        this.t = km9Var3.w;
        if (this.k0) {
            nn9 nn9Var2 = this.G;
            nn9 nn9Var3 = nn9.a;
            if (nn9Var2 == nn9Var3) {
                nn9Var = nn9.b;
            } else {
                nn9Var = nn9Var3;
            }
            if (nn9Var == nn9Var3) {
                zl9Var = this.g0;
            } else {
                zl9Var = this.h0;
            }
            if (zl9Var != null) {
                km9 km9Var4 = this.v;
                Size size2 = zl9Var.d;
                int i3 = zl9Var.e;
                boolean C2 = C(zl9Var.c);
                Handler handler3 = km9Var4.u;
                if (km9Var4.r0 && km9Var4.f && handler3 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler3.post(new im9(km9Var4, size2, i3, C2, runtimeExceptionArr, countDownLatch2, (byte) 0));
                    try {
                        countDownLatch2.await();
                        RuntimeException runtimeException2 = runtimeExceptionArr[0];
                        if (runtimeException2 != null) {
                            throw runtimeException2;
                        }
                    } catch (InterruptedException e3) {
                        Thread.currentThread().interrupt();
                        wa3.h("Secondary input update was interrupted", e3);
                        return;
                    }
                }
                km9 km9Var5 = this.v;
                if (km9Var5.f && (surface2 = km9Var5.y) != null) {
                    this.u = surface2;
                    return;
                } else {
                    dq9.m("Secondary GL camera surface is unavailable");
                    return;
                }
            }
            dq9.m("Secondary camera selection is unavailable");
            return;
        }
        this.u = null;
    }

    public final void t() {
        try {
            s();
        } catch (IOException | RuntimeException e) {
            if (this.k0) {
                this.j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                km9 km9Var = this.v;
                if (km9Var != null) {
                    km9Var.l();
                    this.v = null;
                }
                em9 em9Var = this.w;
                if (em9Var != null) {
                    em9Var.u();
                    this.w = null;
                }
                this.t = null;
                this.u = null;
                this.k0 = false;
                this.i0 = false;
                this.j0 = true;
                s();
                return;
            }
            throw e;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder u(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, defpackage.zl9 r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm9.u(android.hardware.camera2.CameraDevice, android.view.Surface, zl9, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void v(String str, Exception exc, int i) {
        String str2;
        this.j0 = true;
        this.i0 = false;
        this.k0 = false;
        StringBuilder k = b10.k("camera dual-active disabled: reason=", str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        k.append(str2);
        this.j.b(k.toString());
        m();
        CameraDevice cameraDevice = this.o0;
        this.o0 = null;
        this.p0 = null;
        this.v0 = null;
        if (cameraDevice != null && cameraDevice != this.y) {
            l(cameraDevice, i);
        } else if (i == 5) {
            a();
        }
    }

    public final int w() {
        Display display = this.c.getDisplay();
        if (display != null) {
            int rotation = display.getRotation();
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        return 0;
                    }
                    return 270;
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    public final void y(String str, Exception exc, boolean z) {
        String str2;
        if (this.k0) {
            fm9 fm9Var = this.j;
            StringBuilder sb = new StringBuilder("camera dual-active fallback: reason=");
            sb.append(str);
            sb.append(", keepActive=");
            sb.append(z);
            String str3 = "";
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb.append(str2);
            fm9Var.b(sb.toString());
            int i = 0;
            this.k0 = false;
            this.i0 = false;
            int i2 = 1;
            this.j0 = true;
            this.l0 = false;
            this.m0 = false;
            if (z && this.z != null) {
                m();
                CameraDevice cameraDevice = this.o0;
                this.o0 = null;
                this.p0 = null;
                if (this.V && this.q0 != null) {
                    i = 1;
                }
                if (cameraDevice != null) {
                    if (i != 0) {
                        i2 = 4;
                    }
                    l(cameraDevice, i2);
                    return;
                } else if (i != 0) {
                    p();
                    return;
                } else {
                    return;
                }
            }
            String concat = "DUAL_ACTIVE ".concat(str);
            this.j0 = true;
            this.i0 = false;
            this.k0 = false;
            this.q0 = null;
            k();
            m();
            this.y = null;
            this.o0 = null;
            this.p0 = null;
            this.u0 = null;
            this.v0 = null;
            fm9 fm9Var2 = this.j;
            StringBuilder p = wi8.p("camera recovery: reason=", concat, ", target=");
            p.append(this.E);
            p.append(", devices=");
            p.append(this.r0.size());
            p.append(", switchElapsedMs=");
            p.append(x(this.F0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            p.append(str3);
            fm9Var2.b(p.toString());
            if (this.r0.isEmpty()) {
                this.V = false;
                if (this.U && !this.Y) {
                    G();
                    return;
                }
                return;
            }
            this.z0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.r0);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l((CameraDevice) obj, 2);
            }
        }
    }

    public final void z(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z;
        em9 em9Var = this.w;
        if (em9Var != null) {
            synchronized (em9Var) {
                z = em9Var.E;
            }
            if (z) {
                M(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            M(exc);
            return;
        }
        this.c0 = true;
        this.e0 = true;
        k();
        kq kqVar = this.K;
        if (kqVar == null) {
            M(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.I = pn9.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.J = A(rangeArr, 30);
        this.q = (Size) kqVar.c;
        this.r = kqVar.b;
        this.H = (on9) kqVar.d;
        this.g0 = null;
        this.h0 = null;
        v("frame-rate fallback changed stream configuration", exc, 1);
        km9 km9Var = this.v;
        if (km9Var != null) {
            km9Var.l();
            this.v = null;
        }
        em9 em9Var2 = this.w;
        if (em9Var2 != null) {
            em9Var2.u();
            this.w = null;
        }
        this.t = null;
        try {
            s();
            N();
            fm9 fm9Var = this.j;
            StringBuilder k = b10.k("60 fps fallback: reason=", str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            k.append(str2);
            k.append(", recording=");
            k.append(this.q);
            k.append(", crop=");
            k.append(this.r);
            k.append(", fpsRange=");
            k.append(this.J);
            fm9Var.b(k.toString());
            Handler handler = this.n;
            if (this.U && handler != null) {
                handler.post(new rl9(this, (byte) 0));
            }
        } catch (Exception e) {
            M(e);
        }
    }
}
