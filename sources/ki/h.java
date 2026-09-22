package ki;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
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
import ci.g4;
import gg.x1;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
public final class h {
    public q A;
    public long A0;
    public i0 B;
    public long B0;
    public i0 C;
    public double C0;
    public i0 D;
    public long D0;
    public j0 E;
    public long E0;
    public k0 F;
    public long F0;
    public Range G;
    public long G0;
    public j6.l H;
    public long H0;
    public long I;
    public long I0;
    public float J;
    public long J0;
    public final g4 K0;
    public boolean L;
    public final b L0;
    public boolean M;
    public final c M0;
    public int N;
    public final d N0;
    public int O;
    public final e O0;
    public int P;
    public final f P0;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context f13689a;
    public boolean f13690a0;
    public final CameraManager f13691b;
    public boolean f13692b0;
    public final TextureView f13693c;
    public boolean f13694c0;
    public final o0 d;
    public long f13695d0;
    public final int e;
    public long f13696e0;
    public final int f13697f;
    public long f13698f0;
    public final j0 f13699g;
    public long f13700g0;
    public final k0 h;
    public long f13701h0;
    public final boolean f13702i;
    public long f13703i0;
    public final k f13704j;
    public long f13705j0;
    public final e0 f13706k;
    public long f13707k0;
    public long f13709l0;
    public HandlerThread f13710m;
    public long m0;
    public Handler f13711n;
    public double f13712n0;
    public String f13713o;
    public long f13714o0;
    public CameraCharacteristics f13715p;
    public long f13716p0;
    public Size f13717q;
    public long f13718q0;
    public Size f13719r;
    public long f13720r0;
    public int f13721s;
    public long f13722s0;
    public Surface f13723t;
    public long f13724t0;
    public Surface f13725u;
    public long f13726u0;
    public o v;
    public long f13727v0;
    public j f13728w;
    public long f13729w0;
    public CameraDevice f13730x;
    public long f13731x0;
    public CameraCaptureSession f13732y;
    public long f13733y0;
    public CaptureRequest.Builder f13734z;
    public long f13735z0;
    public final Rect f13708l = new Rect();
    public float K = 1.0f;

    public h(Context context, TextureView textureView, o0 o0Var, int i10, j0 j0Var, k0 k0Var, boolean z10, k kVar, e0 e0Var) {
        g4 g4Var = new g4(this, 2);
        this.K0 = g4Var;
        this.L0 = new b(this, 3);
        this.M0 = new c(this, 0);
        this.N0 = new d(this);
        this.O0 = new e(this);
        this.P0 = new f(this);
        this.f13689a = context.getApplicationContext();
        this.f13691b = (CameraManager) context.getSystemService("camera");
        this.f13693c = textureView;
        this.d = o0Var;
        this.e = o0Var.f13808a;
        this.f13697f = i10;
        this.f13699g = j0Var;
        this.h = k0Var;
        this.f13702i = z10;
        this.f13704j = kVar;
        this.f13706k = e0Var;
        textureView.addOnLayoutChangeListener(g4Var);
    }

    public static int B(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float C(double d, long j3, long j10) {
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

    public static n4.y d(StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, int i10, j0 j0Var, int i11) {
        Range<Integer> range;
        Size size = null;
        Range<Integer> range2 = null;
        for (Size size2 : sizeArr) {
            if (r(size2, i10)) {
                try {
                    Range<Integer>[] highSpeedVideoFpsRangesFor = streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size2);
                    if (highSpeedVideoFpsRangesFor == null) {
                        range = null;
                    } else {
                        range = null;
                        for (Range<Integer> range3 : highSpeedVideoFpsRangesFor) {
                            if (range3.getUpper().intValue() == i11) {
                                try {
                                    if (range3.contains((Range<Integer>) Integer.valueOf(i11)) && (range == null || range3.getLower().intValue() > range.getLower().intValue())) {
                                        range = range3;
                                    }
                                } catch (RuntimeException unused) {
                                }
                            }
                        }
                    }
                    if (range != null && (size == null || b(size2) < b(size))) {
                        size = size2;
                        range2 = range;
                    }
                } catch (RuntimeException unused2) {
                }
            }
        }
        if (size == null || range2 == null) {
            return null;
        }
        return new n4.y(new j6.l(size, size, j0Var, i10), range2);
    }

    public static j6.l e(Size[] sizeArr, o0 o0Var, j0 j0Var) {
        int i10;
        j6.l g10;
        j0 j0Var2;
        j6.l g11;
        j0 j0Var3 = j0.f13768c;
        if (j0Var == j0Var3) {
            i10 = o0Var.f13808a;
        } else {
            o0 o0Var2 = o0.P480;
            j0 j0Var4 = j0.f13766a;
            if (o0Var == o0Var2) {
                if (j0Var == j0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (j0Var != j0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l g12 = g(sizeArr, i10, j0Var);
        if (g12 != null) {
            return g12;
        }
        if (o0Var == o0.P360 && j0Var == (j0Var2 = j0.f13767b) && (g11 = g(sizeArr, 480, j0Var2)) != null) {
            return g11;
        }
        int i11 = o0Var.f13808a;
        if (j0Var != j0Var3 && (g10 = g(sizeArr, i11, j0Var3)) != null) {
            return g10;
        }
        int i12 = o0Var.f13808a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (B(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || b(size2) < b(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (B(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && b(size3) < b(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(f(sizeArr, size), size, j0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size f(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(B(size2) - 720);
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

    public static j6.l g(Size[] sizeArr, int i10, j0 j0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            if (r(size, i10)) {
                Size f7 = f(sizeArr, size);
                j6.l lVar2 = new j6.l(f7, size, j0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f12912b;
                    int abs = Math.abs(Math.min(f7.getWidth(), f7.getHeight()) - 720);
                    Size size3 = (Size) lVar.f12913c;
                    int abs2 = Math.abs(B(size2) - 720);
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

    public static boolean j(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String m(CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap) {
        if (Build.VERSION.SDK_INT < 23) {
            return "unavailable before API 23";
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (!j(iArr, 9)) {
            return "unsupported, capabilities=" + Arrays.toString(iArr);
        }
        try {
            Size[] highSpeedVideoSizes = streamConfigurationMap.getHighSpeedVideoSizes();
            StringBuilder sb2 = new StringBuilder("supported{");
            for (int i10 = 0; i10 < highSpeedVideoSizes.length; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                Size size = highSpeedVideoSizes[i10];
                sb2.append(size);
                sb2.append('=');
                sb2.append(Arrays.toString(streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size)));
            }
            sb2.append('}');
            return sb2.toString();
        } catch (RuntimeException e) {
            return "query failed: " + e;
        }
    }

    public static long n(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range p(Range[] rangeArr, int i10) {
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

    public static boolean r(Size size, int i10) {
        int i11 = ((i10 * 15) / 100) + i10;
        int min = Math.min(1920, i10 * 2);
        int B = B(size);
        int max = Math.max(size.getWidth(), size.getHeight());
        if (B >= i10 && B <= i11 && max <= min) {
            return true;
        }
        return false;
    }

    public final boolean A(float f7) {
        this.J = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f13711n;
        if (this.R && handler != null) {
            b bVar = this.L0;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
            return true;
        }
        return false;
    }

    public final void D(q qVar, long j3, i0 i0Var) {
        if (this.f13710m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f13710m = handlerThread;
            handlerThread.start();
            this.f13711n = new Handler(this.f13710m.getLooper());
        }
        this.A = qVar;
        this.I = j3;
        this.B = i0Var;
        this.R = true;
        this.X = false;
        this.f13695d0 = SystemClock.elapsedRealtimeNanos();
        w();
        v();
        StringBuilder sb2 = new StringBuilder("camera segment start: facing=");
        sb2.append(i0Var);
        sb2.append(", timelineOffsetUs=");
        sb2.append(j3);
        sb2.append(", textureAvailable=");
        TextureView textureView = this.f13693c;
        sb2.append(textureView.isAvailable());
        this.f13704j.b(sb2.toString());
        textureView.setSurfaceTextureListener(this.M0);
        Handler handler = this.f13711n;
        if (this.R && handler != null && textureView.isAvailable()) {
            handler.post(new b(this, 4));
        }
    }

    public final boolean E() {
        Handler handler = this.f13711n;
        if (this.R && !this.X && handler != null) {
            this.X = true;
            this.f13704j.b("camera segment stop requested");
            handler.post(new b(this, 5));
            return true;
        }
        return false;
    }

    public final void F() {
        CameraCaptureSession cameraCaptureSession = this.f13732y;
        CaptureRequest.Builder builder = this.f13734z;
        if (cameraCaptureSession != null && builder != null) {
            CaptureRequest build = builder.build();
            boolean z10 = this.f13692b0;
            f fVar = this.P0;
            if (z10 && Build.VERSION.SDK_INT >= 23) {
                List<CaptureRequest> createHighSpeedRequestList = ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(build);
                cameraCaptureSession.setRepeatingBurst(createHighSpeedRequestList, fVar, this.f13711n);
                this.f13704j.b("high-speed repeating burst submitted: requests=" + createHighSpeedRequestList.size() + ", fpsRange=" + this.G);
                return;
            }
            cameraCaptureSession.setRepeatingRequest(build, fVar, this.f13711n);
        }
    }

    public final void G(i0 i0Var) {
        if (this.R && !this.T && i0Var != this.C) {
            this.T = true;
            this.V = true;
            this.L = false;
            this.M = false;
            this.J = 0.0f;
            e0 e0Var = this.f13706k;
            ((q0) e0Var.f13672b).h.post(new l(1, e0Var, i0Var));
            this.f13700g0 = SystemClock.elapsedRealtimeNanos();
            k kVar = this.f13704j;
            kVar.b("camera device switch started: from=" + this.C + ", to=" + i0Var);
            o oVar = this.v;
            if (oVar != null) {
                Handler handler = oVar.f13791k;
                if (oVar.U && handler != null) {
                    handler.post(new l(0, oVar, handler));
                }
            }
            i();
            CameraDevice cameraDevice = this.f13730x;
            if (cameraDevice != null) {
                this.f13730x = null;
                cameraDevice.close();
            } else if (!this.S) {
                this.T = false;
                s();
            }
        }
    }

    public final void H() {
        int width;
        int height;
        Integer num;
        Size size = this.f13719r;
        if (size != null) {
            TextureView textureView = this.f13693c;
            if (textureView.getWidth() != 0 && textureView.getHeight() != 0) {
                int min = Math.min(this.f13721s, Math.min(size.getWidth(), size.getHeight()));
                boolean z10 = false;
                if (this.f13715p != null && textureView.getDisplay() != null && (num = (Integer) this.f13715p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, textureView.getWidth() * 0.5f, textureView.getHeight() * 0.5f);
                textureView.setTransform(matrix);
                this.f13704j.b("preview transform: view=" + textureView.getWidth() + "x" + textureView.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.a():void");
    }

    public final void h() {
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f13734z = null;
        this.M = false;
        i();
        CameraDevice cameraDevice = this.f13730x;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f13730x = null;
        }
        Surface surface = this.f13723t;
        if (surface != null) {
            surface.release();
            this.f13723t = null;
        }
        o oVar = this.v;
        if (oVar != null) {
            oVar.h();
            this.v = null;
        }
        this.f13725u = null;
    }

    public final void i() {
        CameraCaptureSession cameraCaptureSession = this.f13732y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f13732y = null;
        }
        this.f13734z = null;
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.k():void");
    }

    public final android.hardware.camera2.CaptureRequest.Builder l(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.l(boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void o(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        if (this.f13694c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            u(exc);
            return;
        }
        this.f13694c0 = true;
        this.f13690a0 = false;
        this.f13692b0 = false;
        i();
        j6.l lVar = this.H;
        if (lVar == null) {
            u(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.F = k0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f13715p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.G = p(rangeArr, 30);
        this.f13717q = (Size) lVar.f12912b;
        this.f13719r = (Size) lVar.f12913c;
        this.f13721s = lVar.f12911a;
        this.E = (j0) lVar.d;
        SurfaceTexture surfaceTexture = this.f13693c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f13717q.getWidth(), this.f13717q.getHeight());
        }
        o oVar = this.v;
        if (oVar != null) {
            oVar.j(this.f13719r, this.f13721s);
            Surface surface = this.v.f13793m;
            if (surface != null) {
                this.f13725u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        v();
        StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        sb2.append(", preview=");
        sb2.append(this.f13717q);
        sb2.append(", recording=");
        sb2.append(this.f13719r);
        sb2.append(", crop=");
        sb2.append(this.f13721s);
        sb2.append(", fpsRange=");
        sb2.append(this.G);
        this.f13704j.b(sb2.toString());
        Handler handler = this.f13711n;
        if (this.R && handler != null) {
            handler.post(new b(this, 1));
        }
    }

    public final boolean q() {
        CameraCharacteristics cameraCharacteristics;
        if (this.C == i0.f13742b && (cameraCharacteristics = this.f13715p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void s() {
        if (this.R && !this.S && this.f13730x == null) {
            if (f0.e.b(this.f13689a, "android.permission.CAMERA") != 0) {
                u(new SecurityException("Camera permission is not granted"));
                return;
            }
            try {
                y(this.B);
                SurfaceTexture surfaceTexture = this.f13693c.getSurfaceTexture();
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(this.f13717q.getWidth(), this.f13717q.getHeight());
                    if (this.f13723t == null) {
                        this.f13723t = new Surface(surfaceTexture);
                    }
                    if (this.f13728w == null) {
                        q qVar = this.A;
                        long j3 = this.I;
                        int i10 = this.e;
                        int i11 = this.f13697f;
                        int i12 = this.h.f13774a;
                        k kVar = this.f13704j;
                        e0 e0Var = this.f13706k;
                        Objects.requireNonNull(e0Var);
                        j jVar = new j(qVar, j3, i10, i11, i12, kVar, new a(e0Var));
                        this.f13728w = jVar;
                        Surface f7 = jVar.f();
                        Size size = this.f13719r;
                        int i13 = this.e;
                        int i14 = this.f13721s;
                        boolean z10 = this.f13702i;
                        k kVar2 = this.f13704j;
                        j jVar2 = this.f13728w;
                        e0 e0Var2 = this.f13706k;
                        Objects.requireNonNull(e0Var2);
                        o oVar = new o(size, f7, i13, i14, z10, kVar2, jVar2, new a(e0Var2));
                        this.v = oVar;
                        oVar.W = new b(this, 0);
                        this.f13725u = this.v.g();
                    } else {
                        o oVar2 = this.v;
                        if (oVar2 != null) {
                            oVar2.j(this.f13719r, this.f13721s);
                            Surface surface = this.v.f13793m;
                            if (surface != null) {
                                this.f13725u = surface;
                            } else {
                                throw new IllegalStateException("GL processor is not started");
                            }
                        }
                    }
                    this.S = true;
                    this.f13696e0 = SystemClock.elapsedRealtimeNanos();
                    k kVar3 = this.f13704j;
                    kVar3.b("camera open requested: id=" + this.f13713o + ", preview=" + this.f13717q + ", recording=" + this.f13719r + ", crop=" + this.f13721s);
                    this.f13691b.openCamera(this.f13713o, this.N0, this.f13711n);
                }
            } catch (Exception e) {
                this.S = false;
                u(e);
            }
        }
    }

    public final void t() {
        this.R = false;
        TextureView textureView = this.f13693c;
        textureView.setSurfaceTextureListener(null);
        textureView.removeOnLayoutChangeListener(this.K0);
        Handler handler = this.f13711n;
        HandlerThread handlerThread = this.f13710m;
        this.f13711n = null;
        this.f13710m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new x1(28, this, handlerThread));
        }
    }

    public final void u(Exception exc) {
        this.f13704j.a("camera error", exc);
        e0 e0Var = this.f13706k;
        ((q0) e0Var.f13672b).h.post(new l(2, e0Var, exc));
    }

    public final void v() {
        this.f13729w0 = 0L;
        this.f13731x0 = 0L;
        this.f13733y0 = 0L;
        this.f13735z0 = 0L;
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
    }

    public final void w() {
        this.f13701h0 = 0L;
        this.f13703i0 = 0L;
        this.f13705j0 = 0L;
        this.f13707k0 = 0L;
        this.f13709l0 = 0L;
        this.m0 = 0L;
        this.f13712n0 = 0.0d;
        this.f13714o0 = 0L;
        this.f13716p0 = 0L;
        this.f13718q0 = 0L;
        this.f13720r0 = 0L;
        this.f13722s0 = 0L;
        this.f13724t0 = 0L;
        this.f13726u0 = 0L;
        this.f13727v0 = 0L;
    }

    public final com.google.firebase.messaging.m x(java.lang.String r24, android.hardware.camera2.CameraCharacteristics r25, android.hardware.camera2.params.StreamConfigurationMap r26, android.util.Size[] r27, j6.l r28) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.x(java.lang.String, android.hardware.camera2.CameraCharacteristics, android.hardware.camera2.params.StreamConfigurationMap, android.util.Size[], j6.l):com.google.firebase.messaging.m");
    }

    public final void y(ki.i0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.y(ki.i0):void");
    }

    public final void z(boolean z10) {
        Handler handler = this.f13711n;
        if (this.R && handler != null) {
            handler.post(new bi.f(8, this, z10));
        }
    }
}
