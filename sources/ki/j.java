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
    public double C0;
    public m0 D;
    public long D0;
    public m0 E;
    public long E0;
    public n0 F;
    public long F0;
    public o0 G;
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
    public double R0;
    public volatile boolean S;
    public long S0;
    public boolean T;
    public long T0;
    public boolean U;
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
    public final e4 Z0;
    public final Context f14955a;
    public boolean f14956a0;
    public final a f14957a1;
    public final CameraManager f14958b;
    public boolean f14959b0;
    public final a f14960b1;
    public final TextureView f14961c;
    public boolean f14962c0;
    public final d f14963c1;
    public final r0 d;
    public boolean f14964d0;
    public final e f14965d1;
    public final int f14966e;
    public boolean f14967e0;
    public final e f14968e1;
    public final int f14969f;
    public i f14970f0;
    public final f f14971f1;
    public final n0 f14972g;
    public i f14973g0;
    public final g f14974g1;
    public final o0 h;
    public boolean f14975h0;
    public final boolean f14976i;
    public boolean f14977i0;
    public final n f14978j;
    public boolean f14979j0;
    public final xa.d f14980k;
    public CameraDevice f14981k0;
    public CameraDevice f14983l0;
    public HandlerThread f14984m;
    public i m0;
    public Handler f14985n;
    public m0 f14986n0;
    public String f14987o;
    public long f14988o0;
    public CameraCharacteristics f14989p;
    public long f14990p0;
    public Size f14991q;
    public long f14992q0;
    public volatile Size f14993r;
    public boolean f14994r0;
    public volatile int f14995s;
    public long f14996s0;
    public Surface f14997t;
    public long f14998t0;
    public Surface f14999u;
    public long f15000u0;
    public r v;
    public long f15001v0;
    public m f15002w;
    public long f15003w0;
    public m f15004x;
    public long f15005x0;
    public CameraDevice f15006y;
    public long f15007y0;
    public CameraCaptureSession f15008z;
    public long f15009z0;
    public final Rect f14982l = new Rect();
    public float L = 1.0f;

    public j(Context context, TextureView textureView, r0 r0Var, int i10, n0 n0Var, o0 o0Var, boolean z10, n nVar, xa.d dVar) {
        e4 e4Var = new e4(this, 2);
        this.Z0 = e4Var;
        this.f14957a1 = new a(this, 3);
        this.f14960b1 = new a(this, 4);
        this.f14963c1 = new d(this, 0);
        this.f14965d1 = new e(this, 0);
        this.f14968e1 = new e(this, 1);
        this.f14971f1 = new f(this);
        this.f14974g1 = new g(this);
        this.f14955a = context.getApplicationContext();
        this.f14958b = (CameraManager) context.getSystemService("camera");
        this.f14961c = textureView;
        this.d = r0Var;
        this.f14966e = r0Var.f15101a;
        this.f14969f = i10;
        this.f14972g = n0Var;
        this.h = o0Var;
        this.f14976i = z10;
        this.f14978j = nVar;
        this.f14980k = dVar;
        textureView.addOnLayoutChangeListener(e4Var);
    }

    public static int J(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float K(double d, long j3, long j10) {
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

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        if (cameraDevice == jVar.f15006y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (cameraDevice == jVar.f14981k0) {
            jVar.f14981k0 = null;
        }
        jVar.f14979j0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.m();
            jVar.f15006y = null;
            if (illegalStateException != null) {
                jVar.C(illegalStateException);
                return;
            } else {
                jVar.C(new IllegalStateException(sc.v.i("Active warm camera ", str)));
                return;
            }
        }
        jVar.r("standby device " + str, illegalStateException);
        if (jVar.f14986n0 != null) {
            jVar.n();
        } else if (jVar.S && jVar.f15006y != null && jVar.f15008z == null && !jVar.U) {
            jVar.f14978j.b("warm camera failed during startup; configuring active camera only");
            jVar.o();
        }
    }

    public static long e(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float f(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (((float) j3) / ((float) j10)) / 1000000.0f;
    }

    public static j6.l i(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i10;
        j6.l k10;
        n0 n0Var2;
        j6.l k11;
        n0 n0Var3 = n0.f15060c;
        if (n0Var == n0Var3) {
            i10 = r0Var.f15101a;
        } else {
            r0 r0Var2 = r0.P480;
            n0 n0Var4 = n0.f15058a;
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
        j6.l k12 = k(sizeArr, i10, n0Var);
        if (k12 != null) {
            return k12;
        }
        if (r0Var == r0.P360 && n0Var == (n0Var2 = n0.f15059b) && (k11 = k(sizeArr, 480, n0Var2)) != null) {
            return k11;
        }
        int i11 = r0Var.f15101a;
        if (n0Var != n0Var3 && (k10 = k(sizeArr, i11, n0Var3)) != null) {
            return k10;
        }
        int i12 = r0Var.f15101a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (J(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || e(size2) < e(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (J(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && e(size3) < e(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(j(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size j(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(J(size2) - 720);
                if (abs != abs2) {
                    compare = Integer.compare(abs, abs2);
                } else {
                    compare = Long.compare(e(size3), e(size2));
                }
                if (compare < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l k(Size[] sizeArr, int i10, n0 n0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int J = J(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (J >= i10 && J <= i11 && max <= min) {
                Size j3 = j(sizeArr, size);
                j6.l lVar2 = new j6.l(j3, size, n0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f14062b;
                    int abs = Math.abs(Math.min(j3.getWidth(), j3.getHeight()) - 720);
                    Size size3 = (Size) lVar.f14063c;
                    int abs2 = Math.abs(J(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long e7 = e(size) + e(j3);
                        long e10 = e(size3) + e(size2);
                        if (e7 != e10) {
                            compare = Long.compare(e7, e10);
                        } else {
                            compare = Long.compare(e(size), e(size3));
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

    public static long s(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range u(Range[] rangeArr, int i10) {
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

    public final void A() {
        String str;
        if (!this.f14977i0 && !this.f14975h0) {
            int i10 = Build.VERSION.SDK_INT;
            n nVar = this.f14978j;
            if (i10 < 30) {
                this.f14977i0 = true;
                nVar.b("camera warm-switch capability: supported=false, reason=API<30");
                return;
            }
            i h = h();
            String str2 = h.f14943a;
            m0 m0Var = h.f14944b;
            m0 m0Var2 = m0.f15052a;
            if (m0Var == m0Var2) {
                m0Var2 = m0.f15053b;
            }
            try {
                try {
                    G(m0Var2);
                    String str3 = h().f14943a;
                    boolean w10 = w(str2, str3);
                    this.f14975h0 = w10;
                    if (!w10) {
                        this.f14977i0 = true;
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
                    d(h);
                } catch (Exception e7) {
                    this.f14977i0 = true;
                    nVar.b("camera warm-switch capability unavailable: " + e7);
                    d(h);
                }
            } catch (Throwable th2) {
                d(h);
                throw th2;
            }
        }
    }

    public final void B() {
        this.S = false;
        this.f14961c.setSurfaceTextureListener(null);
        this.f14961c.removeOnLayoutChangeListener(this.Z0);
        Handler handler = this.f14985n;
        HandlerThread handlerThread = this.f14984m;
        this.f14985n = null;
        this.f14984m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new w1(28, this, handlerThread));
        }
    }

    public final void C(Exception exc) {
        this.f14978j.a("camera error", exc);
        xa.d dVar = this.f14980k;
        ((t0) dVar.f51105b).f15119i.post(new i0(1, dVar, exc));
    }

    public final void D() {
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0.0d;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
    }

    public final void E() {
        this.f15003w0 = 0L;
        this.f15005x0 = 0L;
        this.f15007y0 = 0L;
        this.f15009z0 = 0L;
        this.A0 = 0L;
        this.B0 = 0L;
        this.C0 = 0.0d;
        this.D0 = 0L;
        this.E0 = 0L;
        this.F0 = 0L;
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
    }

    public final aa.a F(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        String str2;
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar = this.f14978j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.FPS_30;
        if (o0Var != o0Var2 && !this.f14967e0) {
            int i10 = o0Var.f15065a;
            Range u10 = u(rangeArr3, i10);
            if (u10 != null) {
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
                    j6.l i13 = i(sizeArr3, this.d, this.f14972g);
                    nVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + u10 + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                    return new aa.a(o0.FPS_60, u10, i13, false, 27);
                } catch (RuntimeException unused) {
                    nVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr3));
                }
            } else {
                rangeArr = rangeArr3;
                nVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range u11 = u(rangeArr, 30);
            nVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + u11);
            return new aa.a(o0Var2, u11, lVar, false, 27);
        }
        Range u12 = u(rangeArr3, 30);
        StringBuilder w10 = a1.g.w("fps selection: id=", str, ", requested=");
        w10.append(o0Var.f15065a);
        w10.append(", mode=REGULAR, range=");
        w10.append(u12);
        if (this.f14967e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        w10.append(str2);
        nVar.b(w10.toString());
        return new aa.a(o0Var2, u12, lVar, false, 27);
    }

    public final void G(ki.m0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: ki.j.G(ki.m0):void");
    }

    public final void H(boolean z10) {
        Handler handler = this.f14985n;
        if (this.S && handler != null) {
            handler.post(new bi.f(9, this, z10));
        }
    }

    public final boolean I(float f7) {
        this.K = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f14985n;
        if (this.S && handler != null) {
            handler.removeCallbacks(this.f14960b1);
            handler.post(this.f14960b1);
            return true;
        }
        return false;
    }

    public final void L(u uVar, long j3, m0 m0Var) {
        if (this.f14984m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f14984m = handlerThread;
            handlerThread.start();
            this.f14985n = new Handler(this.f14984m.getLooper());
        }
        this.B = uVar;
        this.J = j3;
        this.C = m0Var;
        this.S = true;
        this.Y = false;
        this.f15004x = null;
        this.Z = true;
        this.f14996s0 = SystemClock.elapsedRealtimeNanos();
        E();
        D();
        n nVar = this.f14978j;
        nVar.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f14961c.isAvailable());
        this.f14961c.setSurfaceTextureListener(this.f14963c1);
        Handler handler = this.f14985n;
        if (this.S && handler != null && this.f14961c.isAvailable()) {
            handler.post(new a(this, 5));
        }
    }

    public final boolean M() {
        Handler handler = this.f14985n;
        if (!this.S || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.f14978j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean N(m0 m0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (m0Var == m0.f15052a) {
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
                    if (((o0) F(str, cameraCharacteristics, streamConfigurationMap, outputSizes, i(outputSizes, this.d, this.f14972g)).f384b) == o0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void O(ki.m0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.j.O(ki.m0):void");
    }

    public final boolean P(m0 m0Var) {
        String id2;
        CameraDevice cameraDevice = this.f14981k0;
        i iVar = this.m0;
        if (cameraDevice == null || iVar == null || iVar.f14944b != m0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f14961c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            r("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f15006y;
        m0 m0Var2 = this.D;
        if (m0Var2 != null) {
            if (m0Var2 == m0.f15052a) {
                iVar2 = this.f14970f0;
            } else {
                iVar2 = this.f14973g0;
            }
        }
        m();
        this.f14981k0 = cameraDevice2;
        this.m0 = iVar2;
        this.f15006y = cameraDevice;
        d(iVar);
        surfaceTexture.setDefaultBufferSize(this.f14991q.getWidth(), this.f14991q.getHeight());
        r rVar = this.v;
        if (rVar != null) {
            rVar.j(this.f14993r, this.f14995s, v());
            Surface surface = this.v.f15088o;
            if (surface != null) {
                this.f14999u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.f14994r0 = true;
        n nVar = this.f14978j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f14987o);
        sb2.append(", standbyId=");
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", preparationMs=");
        sb2.append(s(this.f15001v0));
        nVar.b(sb2.toString());
        o();
        return true;
    }

    public final void Q() {
        Size size;
        int width;
        int height;
        Integer num;
        if (this.Z && (size = this.f14993r) != null && this.f14961c.getWidth() != 0 && this.f14961c.getHeight() != 0) {
            int min = Math.min(this.f14995s, Math.min(size.getWidth(), size.getHeight()));
            TextureView textureView = this.f14961c;
            boolean z10 = false;
            if (this.f14989p != null && textureView.getDisplay() != null && (num = (Integer) this.f14989p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
            this.f14978j.b("preview transform: view=" + this.f14961c.getWidth() + "x" + this.f14961c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ki.j.c():void");
    }

    public final void d(i iVar) {
        this.f14987o = iVar.f14943a;
        this.E = iVar.f14944b;
        this.f14989p = iVar.f14945c;
        this.f14991q = iVar.d;
        this.f14993r = iVar.f14946e;
        this.f14995s = iVar.f14947f;
        this.F = iVar.f14948g;
        this.G = iVar.h;
        this.H = iVar.f14949i;
        this.I = iVar.f14950j;
        this.L = iVar.f14951k;
        this.f14962c0 = false;
        D();
    }

    public final void g() {
        Handler handler = this.f14985n;
        if (handler != null) {
            handler.removeCallbacks(this.f14957a1);
        }
        this.f15004x = null;
    }

    public final i h() {
        return new i(this.f14987o, this.E, this.f14989p, this.f14991q, this.f14993r, this.f14995s, this.F, this.G, this.H, this.I, this.L);
    }

    public final void l() {
        g();
        this.T = false;
        this.U = false;
        this.V = false;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.A = null;
        this.N = false;
        this.f14986n0 = null;
        this.f14979j0 = false;
        m();
        CameraDevice cameraDevice = this.f15006y;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f15006y = null;
        }
        CameraDevice cameraDevice2 = this.f14981k0;
        this.f14981k0 = null;
        this.m0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f14983l0;
        this.f14983l0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        Surface surface = this.f14997t;
        if (surface != null) {
            surface.release();
            this.f14997t = null;
        }
        r rVar = this.v;
        if (rVar != null) {
            rVar.h();
            this.v = null;
        }
        this.f14999u = null;
    }

    public final void m() {
        CameraCaptureSession cameraCaptureSession = this.f15008z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f15008z = null;
        }
        this.A = null;
    }

    public final void n() {
        String str;
        this.f14986n0 = null;
        this.f14994r0 = false;
        if (this.f14975h0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f14978j.b("camera switch path: sequential".concat(str));
        m();
        CameraDevice cameraDevice = this.f15006y;
        if (cameraDevice != null) {
            this.f15006y = null;
            this.f14990p0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.T) {
            this.U = false;
            y();
        }
    }

    public final void o() {
        CameraDevice cameraDevice = this.f15006y;
        if (cameraDevice != null && this.f14997t != null && this.f14999u != null) {
            try {
                this.f15000u0 = SystemClock.elapsedRealtimeNanos();
                n nVar = this.f14978j;
                nVar.b("capture session requested: preview=" + this.f14991q + ", recording=" + this.f14993r + ", fpsRange=" + this.H);
                cameraDevice.createCaptureSession(Arrays.asList(this.f14997t, this.f14999u), this.f14971f1, this.f14985n);
            } catch (CameraAccessException | IllegalArgumentException e7) {
                if (this.f14981k0 != null && !this.f14977i0) {
                    n nVar2 = this.f14978j;
                    nVar2.b("camera session request failed with warm device open; retrying with standby device closed: " + e7);
                    if (this.U) {
                        this.f14994r0 = false;
                    }
                    r("session request failed", e7);
                    o();
                } else if (this.G == o0.FPS_60) {
                    t("60 fps session creation rejected", e7);
                } else {
                    C(e7);
                }
            }
        }
    }

    public final void p() {
        Surface surface;
        String str;
        Surface surface2;
        u uVar = this.B;
        long j3 = this.J;
        int i10 = this.f14966e;
        int i11 = this.f14969f;
        int i12 = this.G.f15065a;
        n nVar = this.f14978j;
        xa.d dVar = this.f14980k;
        Objects.requireNonNull(dVar);
        m mVar = new m(uVar, j3, i10, i11, i12, nVar, new b(dVar));
        this.f15002w = mVar;
        synchronized (mVar) {
            if (mVar.f15050y) {
                surface = mVar.f15042p;
            } else {
                mVar.m();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f15039m.start();
                    mVar.f15050y = true;
                    n nVar2 = mVar.f15033f;
                    nVar2.b("codecs prepared: video=" + mVar.f15039m.getName() + ", audio=" + mVar.f15040n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f15042p;
                } catch (IOException | RuntimeException e7) {
                    mVar.j();
                    throw e7;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.f14993r;
        int i13 = this.f14966e;
        int i14 = this.f14995s;
        boolean v = v();
        boolean z10 = this.f14976i;
        n nVar3 = this.f14978j;
        m mVar2 = this.f15002w;
        xa.d dVar2 = this.f14980k;
        Objects.requireNonNull(dVar2);
        r rVar = new r(size, surface3, i13, i14, v, z10, nVar3, mVar2, new b(dVar2));
        this.v = rVar;
        rVar.f15074b0 = new a(this, 1);
        r rVar2 = this.v;
        if (rVar2.Z) {
            surface2 = rVar2.f15088o;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            rVar2.f15085l = handlerThread;
            handlerThread.start();
            rVar2.Y = System.nanoTime();
            n nVar4 = rVar2.f15078e;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(rVar2.f15071a);
            sb2.append(", crop=");
            sb2.append(rVar2.f15080f);
            sb2.append(", output=");
            sb2.append(rVar2.f15075c);
            sb2.append("x");
            sb2.append(rVar2.f15075c);
            sb2.append(", filter=");
            if (rVar2.f15080f == rVar2.f15075c) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(rVar2.d);
            nVar4.b(sb2.toString());
            Handler handler = new Handler(rVar2.f15085l.getLooper());
            rVar2.f15086m = handler;
            handler.post(new w1(29, rVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (rVar2.f15077d0 == null) {
                    surface2 = rVar2.f15088o;
                } else {
                    RuntimeException runtimeException = rVar2.f15077d0;
                    rVar2.f15077d0 = null;
                    rVar2.h();
                    throw runtimeException;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                rVar2.h();
                throw new IllegalStateException("GL initialization was interrupted", e10);
            }
        }
        this.f14999u = surface2;
    }

    public final android.hardware.camera2.CaptureRequest.Builder q(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.j.q(boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void r(String str, Exception exc) {
        String str2;
        this.f14977i0 = true;
        this.f14975h0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f14978j.b(sb2.toString());
        CameraDevice cameraDevice = this.f14981k0;
        this.f14981k0 = null;
        this.m0 = null;
        if (cameraDevice != null && cameraDevice != this.f15006y) {
            this.f14983l0 = cameraDevice;
            cameraDevice.close();
        }
    }

    public final void t(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        if (this.f14962c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            C(exc);
            return;
        }
        this.f14962c0 = true;
        m();
        j6.l lVar = this.I;
        if (lVar == null) {
            C(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.G = o0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f14989p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.H = u(rangeArr, 30);
        this.f14991q = (Size) lVar.f14062b;
        this.f14993r = (Size) lVar.f14063c;
        this.f14995s = lVar.f14061a;
        this.F = (n0) lVar.d;
        this.f14970f0 = null;
        this.f14973g0 = null;
        r("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f14961c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f14991q.getWidth(), this.f14991q.getHeight());
        }
        m mVar = this.f15002w;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.f15051z;
            }
            if (z10) {
                C(new IllegalStateException("Unable to change encoder frame rate after recording started", exc));
                return;
            }
        }
        r rVar = this.v;
        if (rVar != null) {
            rVar.h();
            this.v = null;
        }
        m mVar2 = this.f15002w;
        if (mVar2 != null) {
            mVar2.q();
            this.f15002w = null;
        }
        this.f14999u = null;
        try {
            p();
            D();
            n nVar = this.f14978j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f14991q);
            sb2.append(", recording=");
            sb2.append(this.f14993r);
            sb2.append(", crop=");
            sb2.append(this.f14995s);
            sb2.append(", fpsRange=");
            sb2.append(this.H);
            nVar.b(sb2.toString());
            Handler handler = this.f14985n;
            if (this.S && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e7) {
            C(e7);
        }
    }

    public final boolean v() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.f14989p;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean w(String str, String str2) {
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

    public final boolean x() {
        CameraCharacteristics cameraCharacteristics;
        if (this.D == m0.f15053b && (cameraCharacteristics = this.f14989p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void y() {
        if (this.S && !this.T && this.f15006y == null) {
            if (f0.c.b(this.f14955a, "android.permission.CAMERA") != 0) {
                C(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f14955a, "android.permission.RECORD_AUDIO") != 0) {
                C(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.f14992q0 = SystemClock.elapsedRealtimeNanos();
                    G(this.C);
                    long s10 = s(this.f14992q0);
                    if (this.f15006y == null && this.f15002w == null) {
                        A();
                    }
                    SurfaceTexture surfaceTexture = this.f14961c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(this.f14991q.getWidth(), this.f14991q.getHeight());
                        if (this.f14997t == null) {
                            this.f14997t = new Surface(surfaceTexture);
                        }
                        if (this.f15002w == null) {
                            p();
                        } else {
                            r rVar = this.v;
                            if (rVar != null) {
                                rVar.j(this.f14993r, this.f14995s, v());
                                Surface surface = this.v.f15088o;
                                if (surface != null) {
                                    this.f14999u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        z();
                        this.T = true;
                        this.f14998t0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f14978j;
                        nVar.b("camera open requested: id=" + this.f14987o + ", preview=" + this.f14991q + ", recording=" + this.f14993r + ", crop=" + this.f14995s + ", selectionElapsedMs=" + s10 + ", warmSwitch=" + this.f14975h0);
                        this.f14958b.openCamera(this.f14987o, this.f14965d1, this.f14985n);
                    }
                } catch (Exception e7) {
                    this.T = false;
                    C(e7);
                }
            }
        }
    }

    public final void z() {
        boolean z10;
        CameraDevice cameraDevice;
        m0 m0Var;
        i iVar;
        if (this.f14975h0 && !this.f14977i0 && !(z10 = this.f14979j0) && (cameraDevice = this.f14981k0) == null) {
            m0 m0Var2 = this.E;
            m0 m0Var3 = m0.f15052a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f15053b;
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
                        this.m0 = iVar;
                        this.f14979j0 = true;
                        this.f14988o0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f14978j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f14944b);
                        this.f14958b.openCamera(str, this.f14968e1, this.f14985n);
                    } catch (Exception e7) {
                        this.f14979j0 = false;
                        r("open request failed", e7);
                    }
                }
            }
        }
    }
}
