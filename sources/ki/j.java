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
import gg.w1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
public final class j {
    public CaptureRequest.Builder A;
    public long A0;
    public u B;
    public long B0;
    public volatile m0 C;
    public long C0;
    public m0 D;
    public long D0;
    public m0 E;
    public long E0;
    public n0 F;
    public long F0;
    public o0 G;
    public double G0;
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
    public long M0;
    public boolean N;
    public long N0;
    public int O;
    public long O0;
    public int P;
    public long P0;
    public int Q;
    public long Q0;
    public int R;
    public long R0;
    public volatile boolean S;
    public long S0;
    public boolean T;
    public long T0;
    public boolean U;
    public long U0;
    public boolean V;
    public double V0;
    public boolean W;
    public long W0;
    public volatile boolean X;
    public long X0;
    public volatile boolean Y;
    public long Y0;
    public volatile boolean Z;
    public long Z0;
    public final Context f14955a;
    public boolean f14956a0;
    public long f14957a1;
    public final CameraManager f14958b;
    public boolean f14959b0;
    public long f14960b1;
    public final TextureView f14961c;
    public boolean f14962c0;
    public long f14963c1;
    public final r0 d;
    public boolean f14964d0;
    public final e4 f14965d1;
    public final int f14966e;
    public boolean f14967e0;
    public final a f14968e1;
    public final int f14969f;
    public i f14970f0;
    public final a f14971f1;
    public final n0 f14972g;
    public i f14973g0;
    public final d f14974g1;
    public final o0 h;
    public boolean f14975h0;
    public final e f14976h1;
    public final boolean f14977i;
    public boolean f14978i0;
    public final e f14979i1;
    public final n f14980j;
    public boolean f14981j0;
    public final f f14982j1;
    public final xa.d f14983k;
    public CameraDevice f14984k0;
    public final g f14985k1;
    public CameraDevice f14987l0;
    public HandlerThread f14988m;
    public CameraDevice m0;
    public Handler f14989n;
    public CameraDevice f14990n0;
    public String f14991o;
    public i f14992o0;
    public CameraCharacteristics f14993p;
    public m0 f14994p0;
    public Size f14995q;
    public boolean f14996q0;
    public volatile Size f14997r;
    public boolean f14998r0;
    public volatile int f14999s;
    public long f15000s0;
    public Surface f15001t;
    public long f15002t0;
    public Surface f15003u;
    public long f15004u0;
    public r v;
    public boolean f15005v0;
    public m f15006w;
    public long f15007w0;
    public m f15008x;
    public long f15009x0;
    public CameraDevice f15010y;
    public long f15011y0;
    public CameraCaptureSession f15012z;
    public long f15013z0;
    public final Rect f14986l = new Rect();
    public float L = 1.0f;

    public j(Context context, TextureView textureView, r0 r0Var, int i10, n0 n0Var, o0 o0Var, boolean z10, n nVar, xa.d dVar) {
        e4 e4Var = new e4(this, 2);
        this.f14965d1 = e4Var;
        this.f14968e1 = new a(this, 3);
        this.f14971f1 = new a(this, 4);
        this.f14974g1 = new d(this, 0);
        this.f14976h1 = new e(this, 0);
        this.f14979i1 = new e(this, 1);
        this.f14982j1 = new f(this);
        this.f14985k1 = new g(this);
        this.f14955a = context.getApplicationContext();
        this.f14958b = (CameraManager) context.getSystemService("camera");
        this.f14961c = textureView;
        this.d = r0Var;
        this.f14966e = r0Var.f15105a;
        this.f14969f = i10;
        this.f14972g = n0Var;
        this.h = o0Var;
        this.f14977i = z10;
        this.f14980j = nVar;
        this.f14983k = dVar;
        textureView.addOnLayoutChangeListener(e4Var);
    }

    public static int P(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float Q(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d10 = j10;
        double d11 = j3 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static String a(int i10) {
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

    public static boolean b(j jVar, CameraDevice cameraDevice) {
        String id2;
        if (!jVar.A(cameraDevice)) {
            return false;
        }
        if (cameraDevice == jVar.m0) {
            jVar.m0 = null;
        }
        if (cameraDevice == jVar.f14990n0) {
            jVar.f14990n0 = null;
        }
        n nVar = jVar.f14980j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.m0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.f14990n0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        nVar.b(sb2.toString());
        jVar.B();
        return true;
    }

    public static boolean c(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.f14987l0) {
            return false;
        }
        jVar.f14987l0 = null;
        n nVar = jVar.f14980j;
        nVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (jVar.f14996q0) {
            jVar.f14996q0 = false;
            if (jVar.S && !jVar.Y && jVar.f15010y != null) {
                jVar.f14980j.b("retrying capture session after standby camera closed");
                jVar.q();
                return true;
            }
            return true;
        }
        return true;
    }

    public static void d(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        if (cameraDevice == jVar.f15010y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (cameraDevice == jVar.f14984k0) {
            jVar.f14984k0 = null;
        }
        jVar.f14981j0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.o();
            jVar.f15010y = null;
            if (illegalStateException != null) {
                jVar.H(illegalStateException);
                return;
            } else {
                jVar.H(new IllegalStateException(sc.v.i("Active warm camera ", str)));
                return;
            }
        }
        jVar.t("standby device " + str, illegalStateException);
        if (jVar.f14994p0 != null) {
            jVar.p();
        } else if (jVar.S && jVar.f15010y != null && jVar.f15012z == null && !jVar.U) {
            jVar.f14980j.b("warm camera failed during startup; configuring active camera only");
            jVar.q();
        }
    }

    public static long g(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float h(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (((float) j3) / ((float) j10)) / 1000000.0f;
    }

    public static j6.l k(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i10;
        j6.l m10;
        n0 n0Var2;
        j6.l m11;
        n0 n0Var3 = n0.f15064c;
        if (n0Var == n0Var3) {
            i10 = r0Var.f15105a;
        } else {
            r0 r0Var2 = r0.P480;
            n0 n0Var4 = n0.f15062a;
            if (r0Var == r0Var2) {
                if (n0Var == n0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (n0Var != n0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l m12 = m(sizeArr, i10, n0Var);
        if (m12 != null) {
            return m12;
        }
        if (r0Var == r0.P360 && n0Var == (n0Var2 = n0.f15063b) && (m11 = m(sizeArr, 480, n0Var2)) != null) {
            return m11;
        }
        int i11 = r0Var.f15105a;
        if (n0Var != n0Var3 && (m10 = m(sizeArr, i11, n0Var3)) != null) {
            return m10;
        }
        int i12 = r0Var.f15105a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (P(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || g(size2) < g(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (P(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && g(size3) < g(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(l(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size l(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(P(size2) - 720);
                if (abs != abs2) {
                    compare = Integer.compare(abs, abs2);
                } else {
                    compare = Long.compare(g(size3), g(size2));
                }
                if (compare < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l m(Size[] sizeArr, int i10, n0 n0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int P = P(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (P >= i10 && P <= i11 && max <= min) {
                Size l4 = l(sizeArr, size);
                j6.l lVar2 = new j6.l(l4, size, n0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f14062b;
                    int abs = Math.abs(Math.min(l4.getWidth(), l4.getHeight()) - 720);
                    Size size3 = (Size) lVar.f14063c;
                    int abs2 = Math.abs(P(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long g10 = g(size) + g(l4);
                        long g11 = g(size3) + g(size2);
                        if (g10 != g11) {
                            compare = Long.compare(g10, g11);
                        } else {
                            compare = Long.compare(g(size), g(size3));
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

    public static long u(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range w(Range[] rangeArr, int i10) {
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

    public final boolean A(CameraDevice cameraDevice) {
        if (this.f14998r0) {
            if (cameraDevice == this.m0 || cameraDevice == this.f14990n0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B() {
        if (this.f14998r0 && this.m0 == null && this.f14990n0 == null) {
            this.f14998r0 = false;
            this.U = false;
            n nVar = this.f14980j;
            nVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.C + ", switchElapsedMs=" + u(this.f15013z0));
            if (this.S && !this.Y) {
                C();
            }
        }
    }

    public final void C() {
        if (this.S && !this.T && this.f15010y == null) {
            if (f0.c.b(this.f14955a, "android.permission.CAMERA") != 0) {
                H(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f14955a, "android.permission.RECORD_AUDIO") != 0) {
                H(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.f15004u0 = SystemClock.elapsedRealtimeNanos();
                    M(this.C);
                    long u10 = u(this.f15004u0);
                    if (this.f15010y == null && this.f15006w == null) {
                        E();
                    }
                    SurfaceTexture surfaceTexture = this.f14961c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(this.f14995q.getWidth(), this.f14995q.getHeight());
                        if (this.f15001t == null) {
                            this.f15001t = new Surface(surfaceTexture);
                        }
                        if (this.f15006w == null) {
                            r();
                        } else {
                            r rVar = this.v;
                            if (rVar != null) {
                                rVar.j(this.f14997r, this.f14999s, x());
                                Surface surface = this.v.f15092o;
                                if (surface != null) {
                                    this.f15003u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        D();
                        this.T = true;
                        this.f15009x0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f14980j;
                        nVar.b("camera open requested: id=" + this.f14991o + ", preview=" + this.f14995q + ", recording=" + this.f14997r + ", crop=" + this.f14999s + ", selectionElapsedMs=" + u10 + ", warmSwitch=" + this.f14975h0);
                        this.f14958b.openCamera(this.f14991o, this.f14976h1, this.f14989n);
                    }
                } catch (Exception e7) {
                    this.T = false;
                    H(e7);
                }
            }
        }
    }

    public final void D() {
        boolean z10;
        CameraDevice cameraDevice;
        m0 m0Var;
        i iVar;
        if (this.f14975h0 && !this.f14978i0 && !(z10 = this.f14981j0) && (cameraDevice = this.f14984k0) == null) {
            m0 m0Var2 = this.E;
            m0 m0Var3 = m0.f15056a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f15057b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f14970f0;
            } else {
                iVar = this.f14973g0;
            }
            if (iVar != null) {
                String str = iVar.f14943a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f14992o0 = iVar;
                        this.f14981j0 = true;
                        this.f15000s0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f14980j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f14944b);
                        this.f14958b.openCamera(str, this.f14979i1, this.f14989n);
                    } catch (Exception e7) {
                        this.f14981j0 = false;
                        t("open request failed", e7);
                    }
                }
            }
        }
    }

    public final void E() {
        String str;
        if (!this.f14978i0 && !this.f14975h0) {
            int i10 = Build.VERSION.SDK_INT;
            n nVar = this.f14980j;
            if (i10 < 30) {
                this.f14978i0 = true;
                nVar.b("camera warm-switch capability: supported=false, reason=API<30");
                return;
            }
            i j3 = j();
            String str2 = j3.f14943a;
            m0 m0Var = j3.f14944b;
            m0 m0Var2 = m0.f15056a;
            if (m0Var == m0Var2) {
                m0Var2 = m0.f15057b;
            }
            try {
                try {
                    M(m0Var2);
                    String str3 = j().f14943a;
                    boolean y3 = y(str2, str3);
                    this.f14975h0 = y3;
                    if (!y3) {
                        this.f14978i0 = true;
                    }
                    StringBuilder sb2 = new StringBuilder("camera warm-switch capability: supported=");
                    sb2.append(this.f14975h0);
                    sb2.append(", pair=");
                    sb2.append(str2);
                    sb2.append("+");
                    sb2.append(str3);
                    if (this.f14975h0) {
                        str = "";
                    } else {
                        str = ", reason=pair not advertised";
                    }
                    sb2.append(str);
                    nVar.b(sb2.toString());
                    f(j3);
                } catch (Exception e7) {
                    this.f14978i0 = true;
                    nVar.b("camera warm-switch capability unavailable: " + e7);
                    f(j3);
                }
            } catch (Throwable th2) {
                f(j3);
                throw th2;
            }
        }
    }

    public final void F(String str, Exception exc) {
        String id2;
        Object valueOf;
        String str2;
        if (this.f14998r0) {
            return;
        }
        this.f14998r0 = true;
        this.f14978i0 = true;
        this.f14975h0 = false;
        this.f14996q0 = false;
        this.f14994p0 = null;
        this.f15005v0 = false;
        this.T = false;
        o();
        CameraDevice cameraDevice = this.f15010y;
        this.m0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f14984k0;
        this.f14990n0 = cameraDevice2;
        this.f15010y = null;
        this.f14984k0 = null;
        this.f14992o0 = null;
        CameraDevice cameraDevice3 = this.f14987l0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f14987l0 = null;
        }
        n nVar = this.f14980j;
        StringBuilder w10 = a1.g.w("camera warm-switch recovery started: reason=", str, ", target=");
        w10.append(this.C);
        w10.append(", targetId=");
        CameraDevice cameraDevice4 = this.m0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        w10.append(id2);
        w10.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f14990n0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        w10.append(str3);
        w10.append(", fps=");
        o0 o0Var = this.G;
        if (o0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(o0Var.f15069a);
        }
        w10.append(valueOf);
        w10.append(", switchElapsedMs=");
        w10.append(u(this.f15013z0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        w10.append(str2);
        nVar.b(w10.toString());
        CameraDevice cameraDevice6 = this.m0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f14990n0;
        if (cameraDevice7 != null && cameraDevice7 != this.m0) {
            cameraDevice7.close();
        }
        B();
    }

    public final void G() {
        this.S = false;
        this.f14961c.setSurfaceTextureListener(null);
        this.f14961c.removeOnLayoutChangeListener(this.f14965d1);
        Handler handler = this.f14989n;
        HandlerThread handlerThread = this.f14988m;
        this.f14989n = null;
        this.f14988m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new w1(28, this, handlerThread));
        }
    }

    public final void H(Exception exc) {
        this.f14980j.a("camera error", exc);
        xa.d dVar = this.f14983k;
        ((t0) dVar.f51151b).f15123i.post(new i0(1, dVar, exc));
    }

    public final void I() {
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0.0d;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f14957a1 = 0L;
        this.f14960b1 = 0L;
        this.f14963c1 = 0L;
    }

    public final void J() {
        this.A0 = 0L;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0L;
        this.E0 = 0L;
        this.F0 = 0L;
        this.G0 = 0.0d;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0L;
    }

    public final aa.a K(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        String str2;
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar = this.f14980j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.FPS_30;
        if (o0Var != o0Var2 && !this.f14967e0) {
            int i10 = o0Var.f15069a;
            Range w10 = w(rangeArr3, i10);
            if (w10 != null) {
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
                    j6.l k10 = k(sizeArr3, this.d, this.f14972g);
                    nVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + w10 + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                    return new aa.a(o0.FPS_60, w10, k10, false, 27);
                } catch (RuntimeException unused) {
                    nVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr3));
                }
            } else {
                rangeArr = rangeArr3;
                nVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range w11 = w(rangeArr, 30);
            nVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + w11);
            return new aa.a(o0Var2, w11, lVar, false, 27);
        }
        Range w12 = w(rangeArr3, 30);
        StringBuilder w13 = a1.g.w("fps selection: id=", str, ", requested=");
        w13.append(o0Var.f15069a);
        w13.append(", mode=REGULAR, range=");
        w13.append(w12);
        if (this.f14967e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        w13.append(str2);
        nVar.b(w13.toString());
        return new aa.a(o0Var2, w12, lVar, false, 27);
    }

    public final void L(String str, Exception exc) {
        this.f14996q0 = true;
        t(str, exc);
        if (this.f14987l0 == null) {
            this.f14996q0 = false;
            q();
            return;
        }
        this.f14980j.b("capture session retry waiting for standby camera close: id=" + this.f14987l0.getId());
    }

    public final void M(ki.m0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: ki.j.M(ki.m0):void");
    }

    public final void N(boolean z10) {
        Handler handler = this.f14989n;
        if (this.S && handler != null) {
            handler.post(new bi.f(9, this, z10));
        }
    }

    public final boolean O(float f7) {
        this.K = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f14989n;
        if (this.S && handler != null) {
            handler.removeCallbacks(this.f14971f1);
            handler.post(this.f14971f1);
            return true;
        }
        return false;
    }

    public final void R(u uVar, long j3, m0 m0Var) {
        if (this.f14988m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f14988m = handlerThread;
            handlerThread.start();
            this.f14989n = new Handler(this.f14988m.getLooper());
        }
        this.B = uVar;
        this.J = j3;
        this.C = m0Var;
        this.S = true;
        this.Y = false;
        this.f15008x = null;
        this.Z = true;
        this.f15007w0 = SystemClock.elapsedRealtimeNanos();
        J();
        I();
        n nVar = this.f14980j;
        nVar.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f14961c.isAvailable());
        this.f14961c.setSurfaceTextureListener(this.f14974g1);
        Handler handler = this.f14989n;
        if (this.S && handler != null && this.f14961c.isAvailable()) {
            handler.post(new a(this, 5));
        }
    }

    public final boolean S() {
        Handler handler = this.f14989n;
        if (!this.S || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.f14980j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean T(m0 m0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (m0Var == m0.f15056a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f14958b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) K(str, cameraCharacteristics, streamConfigurationMap, outputSizes, k(outputSizes, this.d, this.f14972g)).f384b) == o0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void U(ki.m0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.j.U(ki.m0):void");
    }

    public final boolean V(m0 m0Var) {
        String id2;
        CameraDevice cameraDevice = this.f14984k0;
        i iVar = this.f14992o0;
        if (cameraDevice == null || iVar == null || iVar.f14944b != m0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f14961c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            t("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f15010y;
        m0 m0Var2 = this.D;
        if (m0Var2 != null) {
            if (m0Var2 == m0.f15056a) {
                iVar2 = this.f14970f0;
            } else {
                iVar2 = this.f14973g0;
            }
        }
        o();
        this.f14984k0 = cameraDevice2;
        this.f14992o0 = iVar2;
        this.f15010y = cameraDevice;
        f(iVar);
        surfaceTexture.setDefaultBufferSize(this.f14995q.getWidth(), this.f14995q.getHeight());
        r rVar = this.v;
        if (rVar != null) {
            rVar.j(this.f14997r, this.f14999s, x());
            Surface surface = this.v.f15092o;
            if (surface != null) {
                this.f15003u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.f15005v0 = true;
        n nVar = this.f14980j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f14991o);
        sb2.append(", standbyId=");
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", preparationMs=");
        sb2.append(u(this.f15013z0));
        nVar.b(sb2.toString());
        q();
        return true;
    }

    public final void W() {
        Size size;
        int width;
        int height;
        Integer num;
        if (this.Z && (size = this.f14997r) != null && this.f14961c.getWidth() != 0 && this.f14961c.getHeight() != 0) {
            int min = Math.min(this.f14999s, Math.min(size.getWidth(), size.getHeight()));
            TextureView textureView = this.f14961c;
            boolean z10 = false;
            if (this.f14993p != null && textureView.getDisplay() != null && (num = (Integer) this.f14993p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
            matrix.setScale(f10, f11, this.f14961c.getWidth() * 0.5f, this.f14961c.getHeight() * 0.5f);
            this.f14961c.setTransform(matrix);
            this.f14980j.b("preview transform: view=" + this.f14961c.getWidth() + "x" + this.f14961c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
        }
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: ki.j.e():void");
    }

    public final void f(i iVar) {
        this.f14991o = iVar.f14943a;
        this.E = iVar.f14944b;
        this.f14993p = iVar.f14945c;
        this.f14995q = iVar.d;
        this.f14997r = iVar.f14946e;
        this.f14999s = iVar.f14947f;
        this.F = iVar.f14948g;
        this.G = iVar.h;
        this.H = iVar.f14949i;
        this.I = iVar.f14950j;
        this.L = iVar.f14951k;
        this.f14962c0 = false;
        I();
    }

    public final void i() {
        Handler handler = this.f14989n;
        if (handler != null) {
            handler.removeCallbacks(this.f14968e1);
        }
        this.f15008x = null;
    }

    public final i j() {
        return new i(this.f14991o, this.E, this.f14993p, this.f14995q, this.f14997r, this.f14999s, this.F, this.G, this.H, this.I, this.L);
    }

    public final void n() {
        i();
        this.T = false;
        this.U = false;
        this.V = false;
        this.f14998r0 = false;
        this.f14996q0 = false;
        this.m0 = null;
        this.f14990n0 = null;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.A = null;
        this.N = false;
        this.f14994p0 = null;
        this.f14981j0 = false;
        o();
        CameraDevice cameraDevice = this.f15010y;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f15010y = null;
        }
        CameraDevice cameraDevice2 = this.f14984k0;
        this.f14984k0 = null;
        this.f14992o0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f14987l0;
        this.f14987l0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        Surface surface = this.f15001t;
        if (surface != null) {
            surface.release();
            this.f15001t = null;
        }
        r rVar = this.v;
        if (rVar != null) {
            rVar.h();
            this.v = null;
        }
        this.f15003u = null;
    }

    public final void o() {
        CameraCaptureSession cameraCaptureSession = this.f15012z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f15012z = null;
        }
        this.A = null;
    }

    public final void p() {
        String str;
        this.f14994p0 = null;
        this.f15005v0 = false;
        if (this.f14975h0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f14980j.b("camera switch path: sequential".concat(str));
        o();
        CameraDevice cameraDevice = this.f15010y;
        if (cameraDevice != null) {
            this.f15010y = null;
            this.f15002t0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.T) {
            this.U = false;
            C();
        }
    }

    public final void q() {
        CameraDevice cameraDevice = this.f15010y;
        if (cameraDevice != null && this.f15001t != null && this.f15003u != null) {
            try {
                this.f15011y0 = SystemClock.elapsedRealtimeNanos();
                n nVar = this.f14980j;
                nVar.b("capture session requested: preview=" + this.f14995q + ", recording=" + this.f14997r + ", fpsRange=" + this.H);
                cameraDevice.createCaptureSession(Arrays.asList(this.f15001t, this.f15003u), this.f14982j1, this.f14989n);
            } catch (CameraAccessException | IllegalArgumentException e7) {
                if (this.f14984k0 != null && !this.f14978i0) {
                    if (this.U && this.f15005v0) {
                        F("session request failed", e7);
                        return;
                    }
                    n nVar2 = this.f14980j;
                    nVar2.b("camera session request failed with warm device open: " + e7);
                    L("session request failed", e7);
                } else if (this.G == o0.FPS_60) {
                    v("60 fps session creation rejected", e7);
                } else {
                    H(e7);
                }
            }
        }
    }

    public final void r() {
        Surface surface;
        String str;
        Surface surface2;
        u uVar = this.B;
        long j3 = this.J;
        int i10 = this.f14966e;
        int i11 = this.f14969f;
        int i12 = this.G.f15069a;
        n nVar = this.f14980j;
        xa.d dVar = this.f14983k;
        Objects.requireNonNull(dVar);
        m mVar = new m(uVar, j3, i10, i11, i12, nVar, new b(dVar));
        this.f15006w = mVar;
        synchronized (mVar) {
            if (mVar.f15054y) {
                surface = mVar.f15046p;
            } else {
                mVar.m();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f15043m.start();
                    mVar.f15054y = true;
                    n nVar2 = mVar.f15037f;
                    nVar2.b("codecs prepared: video=" + mVar.f15043m.getName() + ", audio=" + mVar.f15044n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f15046p;
                } catch (IOException | RuntimeException e7) {
                    mVar.j();
                    throw e7;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.f14997r;
        int i13 = this.f14966e;
        int i14 = this.f14999s;
        boolean x10 = x();
        boolean z10 = this.f14977i;
        n nVar3 = this.f14980j;
        m mVar2 = this.f15006w;
        xa.d dVar2 = this.f14983k;
        Objects.requireNonNull(dVar2);
        r rVar = new r(size, surface3, i13, i14, x10, z10, nVar3, mVar2, new b(dVar2));
        this.v = rVar;
        rVar.f15078b0 = new a(this, 1);
        r rVar2 = this.v;
        if (rVar2.Z) {
            surface2 = rVar2.f15092o;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            rVar2.f15089l = handlerThread;
            handlerThread.start();
            rVar2.Y = System.nanoTime();
            n nVar4 = rVar2.f15082e;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(rVar2.f15075a);
            sb2.append(", crop=");
            sb2.append(rVar2.f15084f);
            sb2.append(", output=");
            sb2.append(rVar2.f15079c);
            sb2.append("x");
            sb2.append(rVar2.f15079c);
            sb2.append(", filter=");
            if (rVar2.f15084f == rVar2.f15079c) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(rVar2.d);
            nVar4.b(sb2.toString());
            Handler handler = new Handler(rVar2.f15089l.getLooper());
            rVar2.f15090m = handler;
            handler.post(new w1(29, rVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (rVar2.f15081d0 == null) {
                    surface2 = rVar2.f15092o;
                } else {
                    RuntimeException runtimeException = rVar2.f15081d0;
                    rVar2.f15081d0 = null;
                    rVar2.h();
                    throw runtimeException;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                rVar2.h();
                throw new IllegalStateException("GL initialization was interrupted", e10);
            }
        }
        this.f15003u = surface2;
    }

    public final android.hardware.camera2.CaptureRequest.Builder s(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.j.s(boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void t(String str, Exception exc) {
        String str2;
        this.f14978i0 = true;
        this.f14975h0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f14980j.b(sb2.toString());
        CameraDevice cameraDevice = this.f14984k0;
        this.f14984k0 = null;
        this.f14992o0 = null;
        if (cameraDevice != null && cameraDevice != this.f15010y) {
            this.f14987l0 = cameraDevice;
            cameraDevice.close();
        }
    }

    public final void v(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        m mVar = this.f15006w;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.f15055z;
            }
            if (z10) {
                H(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f14962c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            H(exc);
            return;
        }
        this.f14962c0 = true;
        o();
        j6.l lVar = this.I;
        if (lVar == null) {
            H(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.G = o0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f14993p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.H = w(rangeArr, 30);
        this.f14995q = (Size) lVar.f14062b;
        this.f14997r = (Size) lVar.f14063c;
        this.f14999s = lVar.f14061a;
        this.F = (n0) lVar.d;
        this.f14970f0 = null;
        this.f14973g0 = null;
        t("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f14961c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f14995q.getWidth(), this.f14995q.getHeight());
        }
        r rVar = this.v;
        if (rVar != null) {
            rVar.h();
            this.v = null;
        }
        m mVar2 = this.f15006w;
        if (mVar2 != null) {
            mVar2.q();
            this.f15006w = null;
        }
        this.f15003u = null;
        try {
            r();
            I();
            n nVar = this.f14980j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f14995q);
            sb2.append(", recording=");
            sb2.append(this.f14997r);
            sb2.append(", crop=");
            sb2.append(this.f14999s);
            sb2.append(", fpsRange=");
            sb2.append(this.H);
            nVar.b(sb2.toString());
            Handler handler = this.f14989n;
            if (this.S && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e7) {
            H(e7);
        }
    }

    public final boolean x() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.f14993p;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean y(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.f14958b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        CameraCharacteristics cameraCharacteristics;
        if (this.D == m0.f15057b && (cameraCharacteristics = this.f14993p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }
}
