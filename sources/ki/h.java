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
import com.google.android.gms.internal.vision.e2;
import gg.x1;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
public final class h {
    public q A;
    public h0 B;
    public h0 C;
    public h0 D;
    public i0 E;
    public j0 F;
    public Range G;
    public j6.l H;
    public long I;
    public float J;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public volatile boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public long X;
    public long Y;
    public long Z;
    public final Context f13692a;
    public long f13693a0;
    public final CameraManager f13694b;
    public long f13695b0;
    public final TextureView f13696c;
    public long f13697c0;
    public final m0 d;
    public long f13698d0;
    public final int e;
    public long f13699e0;
    public final int f13700f;
    public long f13701f0;
    public final i0 f13702g;
    public final g4 f13703g0;
    public final j0 h;
    public final b f13704h0;
    public final boolean f13705i;
    public final c f13706i0;
    public final k f13707j;
    public final d f13708j0;
    public final k2.u f13709k;
    public final e f13710k0;
    public final f f13712l0;
    public HandlerThread f13713m;
    public Handler f13714n;
    public String f13715o;
    public CameraCharacteristics f13716p;
    public Size f13717q;
    public Size f13718r;
    public int f13719s;
    public Surface f13720t;
    public Surface f13721u;
    public o v;
    public j f13722w;
    public CameraDevice f13723x;
    public CameraCaptureSession f13724y;
    public CaptureRequest.Builder f13725z;
    public final Rect f13711l = new Rect();
    public float K = 1.0f;

    public h(Context context, TextureView textureView, m0 m0Var, int i10, i0 i0Var, j0 j0Var, boolean z10, k kVar, k2.u uVar) {
        g4 g4Var = new g4(this, 2);
        this.f13703g0 = g4Var;
        this.f13704h0 = new b(this, 3);
        this.f13706i0 = new c(this, 0);
        this.f13708j0 = new d(this);
        this.f13710k0 = new e(this);
        this.f13712l0 = new f(this);
        this.f13692a = context.getApplicationContext();
        this.f13694b = (CameraManager) context.getSystemService("camera");
        this.f13696c = textureView;
        this.d = m0Var;
        this.e = m0Var.f13772a;
        this.f13700f = i10;
        this.f13702g = i0Var;
        this.h = j0Var;
        this.f13705i = z10;
        this.f13707j = kVar;
        this.f13709k = uVar;
        textureView.addOnLayoutChangeListener(g4Var);
    }

    public static long c(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static n4.y d(StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, int i10, i0 i0Var, int i11) {
        Range<Integer> range;
        Size size = null;
        Range<Integer> range2 = null;
        for (Size size2 : sizeArr) {
            if (p(size2, i10)) {
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
                    if (range != null && (size == null || c(size2) < c(size))) {
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
        return new n4.y(new j6.l(size, size, i0Var, i10), range2);
    }

    public static j6.l e(Size[] sizeArr, m0 m0Var, i0 i0Var) {
        int i10;
        j6.l g10;
        i0 i0Var2;
        j6.l g11;
        i0 i0Var3 = i0.f13733c;
        if (i0Var == i0Var3) {
            i10 = m0Var.f13772a;
        } else {
            m0 m0Var2 = m0.P480;
            i0 i0Var4 = i0.f13731a;
            if (m0Var == m0Var2) {
                if (i0Var == i0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (i0Var != i0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l g12 = g(sizeArr, i10, i0Var);
        if (g12 != null) {
            return g12;
        }
        if (m0Var == m0.P360 && i0Var == (i0Var2 = i0.f13732b) && (g11 = g(sizeArr, 480, i0Var2)) != null) {
            return g11;
        }
        int i11 = m0Var.f13772a;
        if (i0Var != i0Var3 && (g10 = g(sizeArr, i11, i0Var3)) != null) {
            return g10;
        }
        int i12 = m0Var.f13772a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (x(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || c(size2) < c(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (x(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && c(size3) < c(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(f(sizeArr, size), size, i0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size f(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(x(size2) - 720);
                if (abs != abs2) {
                    compare = Integer.compare(abs, abs2);
                } else {
                    compare = Long.compare(c(size3), c(size2));
                }
                if (compare < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l g(Size[] sizeArr, int i10, i0 i0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            if (p(size, i10)) {
                Size f7 = f(sizeArr, size);
                j6.l lVar2 = new j6.l(f7, size, i0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f12912b;
                    int abs = Math.abs(Math.min(f7.getWidth(), f7.getHeight()) - 720);
                    Size size3 = (Size) lVar.f12913c;
                    int abs2 = Math.abs(x(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long c10 = c(size) + c(f7);
                        long c11 = c(size3) + c(size2);
                        if (c10 != c11) {
                            compare = Long.compare(c10, c11);
                        } else {
                            compare = Long.compare(c(size), c(size3));
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

    public static boolean i(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String k(CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap) {
        if (Build.VERSION.SDK_INT < 23) {
            return "unavailable before API 23";
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (!i(iArr, 9)) {
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

    public static boolean p(Size size, int i10) {
        int i11 = ((i10 * 15) / 100) + i10;
        int min = Math.min(1920, i10 * 2);
        int x10 = x(size);
        int max = Math.max(size.getWidth(), size.getHeight());
        if (x10 >= i10 && x10 <= i11 && max <= min) {
            return true;
        }
        return false;
    }

    public static int x(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public final void A() {
        CameraCaptureSession cameraCaptureSession = this.f13724y;
        CaptureRequest.Builder builder = this.f13725z;
        if (cameraCaptureSession != null && builder != null) {
            CaptureRequest build = builder.build();
            boolean z10 = this.V;
            f fVar = this.f13712l0;
            if (z10 && Build.VERSION.SDK_INT >= 23) {
                List<CaptureRequest> createHighSpeedRequestList = ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(build);
                cameraCaptureSession.setRepeatingBurst(createHighSpeedRequestList, fVar, this.f13714n);
                this.f13707j.b("high-speed repeating burst submitted: requests=" + createHighSpeedRequestList.size() + ", fpsRange=" + this.G);
                return;
            }
            cameraCaptureSession.setRepeatingRequest(build, fVar, this.f13714n);
        }
    }

    public final void B(h0 h0Var) {
        if (this.M && !this.O && h0Var != this.C) {
            this.O = true;
            this.P = true;
            this.L = false;
            this.J = 0.0f;
            k2.u uVar = this.f13709k;
            ((o0) uVar.f13384b).h.post(new l(1, uVar, h0Var));
            this.f13693a0 = SystemClock.elapsedRealtimeNanos();
            k kVar = this.f13707j;
            kVar.b("camera device switch started: from=" + this.C + ", to=" + h0Var);
            o oVar = this.v;
            if (oVar != null) {
                Handler handler = oVar.f13785k;
                if (oVar.U && handler != null) {
                    handler.post(new l(0, oVar, handler));
                }
            }
            CameraCaptureSession cameraCaptureSession = this.f13724y;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f13724y = null;
            }
            this.f13725z = null;
            CameraDevice cameraDevice = this.f13723x;
            if (cameraDevice != null) {
                this.f13723x = null;
                cameraDevice.close();
            } else if (!this.N) {
                this.O = false;
                q();
            }
        }
    }

    public final void C() {
        int width;
        int height;
        Integer num;
        Size size = this.f13718r;
        if (size != null) {
            TextureView textureView = this.f13696c;
            if (textureView.getWidth() != 0 && textureView.getHeight() != 0) {
                int min = Math.min(this.f13719s, Math.min(size.getWidth(), size.getHeight()));
                boolean z10 = false;
                if (this.f13716p != null && textureView.getDisplay() != null && (num = (Integer) this.f13716p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                this.f13707j.b("preview transform: view=" + textureView.getWidth() + "x" + textureView.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void a(CaptureRequest.Builder builder) {
        boolean z10;
        int[] iArr;
        int i10 = 0;
        if (this.L && o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        CameraCharacteristics cameraCharacteristics = this.f13716p;
        if (cameraCharacteristics == null) {
            iArr = null;
        } else {
            iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        }
        if (i(iArr, 1)) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
        }
        CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
        if (z10) {
            i10 = 2;
        }
        builder.set(key, Integer.valueOf(i10));
    }

    public final void b(CaptureRequest.Builder builder) {
        CameraCharacteristics.Key key;
        Range range;
        float z10 = e2.z(this.K, 1.0f, this.J, 1.0f);
        Rect rect = null;
        if (Build.VERSION.SDK_INT >= 30) {
            CameraCharacteristics cameraCharacteristics = this.f13716p;
            if (cameraCharacteristics != null) {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) cameraCharacteristics.get(key);
            } else {
                range = null;
            }
            if (range != null) {
                builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z10))));
                return;
            }
        }
        CameraCharacteristics cameraCharacteristics2 = this.f13716p;
        if (cameraCharacteristics2 != null) {
            rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        if (rect == null) {
            return;
        }
        int max = Math.max(1, Math.round(rect.width() / z10));
        int max2 = Math.max(1, Math.round(rect.height() / z10));
        int centerX = rect.centerX() - (max / 2);
        int centerY = rect.centerY() - (max2 / 2);
        Rect rect2 = this.f13711l;
        rect2.set(centerX, centerY, max + centerX, max2 + centerY);
        builder.set(CaptureRequest.SCALER_CROP_REGION, rect2);
    }

    public final void h() {
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.f13725z = null;
        CameraCaptureSession cameraCaptureSession = this.f13724y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f13724y = null;
        }
        this.f13725z = null;
        CameraDevice cameraDevice = this.f13723x;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f13723x = null;
        }
        Surface surface = this.f13720t;
        if (surface != null) {
            surface.release();
            this.f13720t = null;
        }
        o oVar = this.v;
        if (oVar != null) {
            oVar.h();
            this.v = null;
        }
        this.f13721u = null;
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.j():void");
    }

    public final void m(String str, Exception exc) {
        String str2;
        if (this.W) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            s(exc);
            return;
        }
        this.W = true;
        this.U = false;
        this.V = false;
        CameraCaptureSession cameraCaptureSession = this.f13724y;
        Range[] rangeArr = null;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f13724y = null;
        }
        this.f13725z = null;
        j6.l lVar = this.H;
        if (lVar == null) {
            s(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.F = j0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f13716p;
        if (cameraCharacteristics != null) {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.G = n(rangeArr, 30);
        this.f13717q = (Size) lVar.f12912b;
        this.f13718r = (Size) lVar.f12913c;
        this.f13719s = lVar.f12911a;
        this.E = (i0) lVar.d;
        SurfaceTexture surfaceTexture = this.f13696c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f13717q.getWidth(), this.f13717q.getHeight());
        }
        o oVar = this.v;
        if (oVar != null) {
            oVar.j(this.f13718r, this.f13719s);
            Surface surface = this.v.f13787m;
            if (surface != null) {
                this.f13721u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.f13698d0 = 0L;
        this.f13699e0 = 0L;
        this.f13701f0 = 0L;
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
        sb2.append(this.f13718r);
        sb2.append(", crop=");
        sb2.append(this.f13719s);
        sb2.append(", fpsRange=");
        sb2.append(this.G);
        this.f13707j.b(sb2.toString());
        Handler handler = this.f13714n;
        if (this.M && handler != null) {
            handler.post(new b(this, 1));
        }
    }

    public final boolean o() {
        Boolean bool;
        CameraCharacteristics cameraCharacteristics = this.f13716p;
        if (cameraCharacteristics == null) {
            bool = null;
        } else {
            bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        }
        if (this.C == h0.f13727b && Boolean.TRUE.equals(bool)) {
            return true;
        }
        return false;
    }

    public final void q() {
        if (this.M && !this.N && this.f13723x == null) {
            if (f0.e.b(this.f13692a, "android.permission.CAMERA") != 0) {
                s(new SecurityException("Camera permission is not granted"));
                return;
            }
            try {
                u(this.B);
                SurfaceTexture surfaceTexture = this.f13696c.getSurfaceTexture();
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(this.f13717q.getWidth(), this.f13717q.getHeight());
                    if (this.f13720t == null) {
                        this.f13720t = new Surface(surfaceTexture);
                    }
                    if (this.f13722w == null) {
                        q qVar = this.A;
                        long j3 = this.I;
                        int i10 = this.e;
                        int i11 = this.f13700f;
                        int i12 = this.h.f13758a;
                        k kVar = this.f13707j;
                        k2.u uVar = this.f13709k;
                        Objects.requireNonNull(uVar);
                        j jVar = new j(qVar, j3, i10, i11, i12, kVar, new a(uVar));
                        this.f13722w = jVar;
                        Surface f7 = jVar.f();
                        Size size = this.f13718r;
                        int i13 = this.e;
                        int i14 = this.f13719s;
                        boolean z10 = this.f13705i;
                        k kVar2 = this.f13707j;
                        j jVar2 = this.f13722w;
                        k2.u uVar2 = this.f13709k;
                        Objects.requireNonNull(uVar2);
                        o oVar = new o(size, f7, i13, i14, z10, kVar2, jVar2, new a(uVar2));
                        this.v = oVar;
                        oVar.W = new b(this, 0);
                        this.f13721u = this.v.g();
                    } else {
                        o oVar2 = this.v;
                        if (oVar2 != null) {
                            oVar2.j(this.f13718r, this.f13719s);
                            Surface surface = this.v.f13787m;
                            if (surface != null) {
                                this.f13721u = surface;
                            } else {
                                throw new IllegalStateException("GL processor is not started");
                            }
                        }
                    }
                    this.N = true;
                    this.Y = SystemClock.elapsedRealtimeNanos();
                    k kVar3 = this.f13707j;
                    kVar3.b("camera open requested: id=" + this.f13715o + ", preview=" + this.f13717q + ", recording=" + this.f13718r + ", crop=" + this.f13719s);
                    this.f13694b.openCamera(this.f13715o, this.f13708j0, this.f13714n);
                }
            } catch (Exception e) {
                this.N = false;
                s(e);
            }
        }
    }

    public final void r() {
        this.M = false;
        TextureView textureView = this.f13696c;
        textureView.setSurfaceTextureListener(null);
        textureView.removeOnLayoutChangeListener(this.f13703g0);
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
        ((o0) uVar.f13384b).h.post(new l(2, uVar, exc));
    }

    public final com.google.firebase.messaging.m t(java.lang.String r24, android.hardware.camera2.CameraCharacteristics r25, android.hardware.camera2.params.StreamConfigurationMap r26, android.util.Size[] r27, j6.l r28) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.t(java.lang.String, android.hardware.camera2.CameraCharacteristics, android.hardware.camera2.params.StreamConfigurationMap, android.util.Size[], j6.l):com.google.firebase.messaging.m");
    }

    public final void u(ki.h0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h.u(ki.h0):void");
    }

    public final void v(boolean z10) {
        this.L = z10;
        this.f13707j.b("torch requested: enabled=" + z10 + ", available=" + o() + ", facing=" + this.C);
        Handler handler = this.f13714n;
        if (this.M && handler != null) {
            handler.post(new b(this, 3));
        }
    }

    public final boolean w(float f7) {
        this.J = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f13714n;
        if (this.M && handler != null) {
            b bVar = this.f13704h0;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
            return true;
        }
        return false;
    }

    public final void y(q qVar, long j3, h0 h0Var) {
        if (this.f13713m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f13713m = handlerThread;
            handlerThread.start();
            this.f13714n = new Handler(this.f13713m.getLooper());
        }
        this.A = qVar;
        this.I = j3;
        this.B = h0Var;
        this.M = true;
        this.R = false;
        this.X = SystemClock.elapsedRealtimeNanos();
        this.f13695b0 = 0L;
        this.f13697c0 = 0L;
        this.f13698d0 = 0L;
        this.f13699e0 = 0L;
        this.f13701f0 = 0L;
        StringBuilder sb2 = new StringBuilder("camera segment start: facing=");
        sb2.append(h0Var);
        sb2.append(", timelineOffsetUs=");
        sb2.append(j3);
        sb2.append(", textureAvailable=");
        TextureView textureView = this.f13696c;
        sb2.append(textureView.isAvailable());
        this.f13707j.b(sb2.toString());
        textureView.setSurfaceTextureListener(this.f13706i0);
        Handler handler = this.f13714n;
        if (this.M && handler != null && textureView.isAvailable()) {
            handler.post(new b(this, 4));
        }
    }

    public final boolean z() {
        Handler handler = this.f13714n;
        if (this.M && !this.R && handler != null) {
            this.R = true;
            this.f13707j.b("camera segment stop requested");
            handler.post(new b(this, 5));
            return true;
        }
        return false;
    }
}
