package ki;

import ai.n8;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
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
import ci.g4;
import com.google.android.gms.internal.vision.e2;
import gg.x1;
import hg.k0;
import j$.util.Objects;
import java.util.Arrays;
public final class g {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final g4 M;
    public final a N;
    public final c O;
    public final d P;
    public final e Q;
    public final int R;
    public final int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final Context f13677a;
    public final CameraManager f13678b;
    public final TextureView f13679c;
    public final int d;
    public final int e;
    public final j f13680f;
    public final k2.u f13681g;
    public HandlerThread f13682i;
    public Handler f13683j;
    public String f13684k;
    public CameraCharacteristics f13685l;
    public Size f13686m;
    public Size f13687n;
    public int f13688o;
    public Surface f13689p;
    public Surface f13690q;
    public m f13691r;
    public i f13692s;
    public CameraDevice f13693t;
    public CameraCaptureSession f13694u;
    public CaptureRequest.Builder v;
    public o f13695w;
    public long f13696x;
    public float f13697y;
    public final Rect h = new Rect();
    public float f13698z = 1.0f;

    public g(Context context, TextureView textureView, j jVar, k2.u uVar) {
        g4 g4Var = new g4(this, 2);
        this.M = g4Var;
        this.N = new a(this, 3);
        this.O = new c(this, 0);
        this.P = new d(this);
        this.Q = new e(this);
        this.f13677a = context.getApplicationContext();
        this.f13678b = (CameraManager) context.getSystemService("camera");
        this.f13679c = textureView;
        this.R = 1;
        this.d = 480;
        this.e = 1150000;
        this.S = 1;
        this.f13680f = jVar;
        this.f13681g = uVar;
        textureView.addOnLayoutChangeListener(g4Var);
    }

    public static void a(g gVar, CaptureRequest.Builder builder) {
        Range[] rangeArr;
        j jVar = gVar.f13680f;
        CameraCharacteristics cameraCharacteristics = gVar.f13685l;
        Range range = null;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        if (rangeArr == null) {
            return;
        }
        for (Range range2 : rangeArr) {
            if (range2.contains((Range) 30) && (range == null || ((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue() < ((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue())) {
                range = range2;
            }
        }
        if (range != null) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            jVar.b("capture FPS range selected: " + range);
            return;
        }
        jVar.b("capture FPS range: no range containing 30 fps");
    }

    public static long c(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static Size d(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(o(size2) - 720);
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

    public static e2.a0 e(Size[] sizeArr, int i10, int i11) {
        int compare;
        e2.a0 a0Var = null;
        for (Size size : sizeArr) {
            int i12 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int o9 = o(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (o9 >= i10 && o9 <= i12 && max <= min) {
                Size d = d(sizeArr, size);
                e2.a0 a0Var2 = new e2.a0(d, size, i11, i10);
                if (a0Var != null) {
                    Size size2 = (Size) a0Var.f7875c;
                    int abs = Math.abs(Math.min(d.getWidth(), d.getHeight()) - 720);
                    Size size3 = (Size) a0Var.d;
                    int abs2 = Math.abs(o(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long c10 = c(size) + c(d);
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
                a0Var = a0Var2;
            }
        }
        return a0Var;
    }

    public static long g(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static int o(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public final void b(CaptureRequest.Builder builder) {
        Range range;
        float z10 = e2.z(this.f13698z, 1.0f, this.f13697y, 1.0f);
        Rect rect = null;
        if (Build.VERSION.SDK_INT >= 30) {
            CameraCharacteristics cameraCharacteristics = this.f13685l;
            if (cameraCharacteristics == null) {
                range = null;
            } else {
                range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            }
            if (range != null) {
                builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z10))));
                return;
            }
        }
        CameraCharacteristics cameraCharacteristics2 = this.f13685l;
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
        Rect rect2 = this.h;
        rect2.set(centerX, centerY, max + centerX, max2 + centerY);
        builder.set(CaptureRequest.SCALER_CROP_REGION, rect2);
    }

    public final void f() {
        this.C = false;
        this.D = false;
        this.E = false;
        this.v = null;
        CameraCaptureSession cameraCaptureSession = this.f13694u;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f13694u = null;
        }
        this.v = null;
        CameraDevice cameraDevice = this.f13693t;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f13693t = null;
        }
        Surface surface = this.f13689p;
        if (surface != null) {
            surface.release();
            this.f13689p = null;
        }
        m mVar = this.f13691r;
        if (mVar != null) {
            mVar.h();
            this.f13691r = null;
        }
        this.f13690q = null;
    }

    public final boolean h() {
        Boolean bool;
        CameraCharacteristics cameraCharacteristics = this.f13685l;
        if (cameraCharacteristics == null) {
            bool = null;
        } else {
            bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        }
        if (this.U == 2 && Boolean.TRUE.equals(bool)) {
            return true;
        }
        return false;
    }

    public final void i() {
        if (this.B && !this.C && this.f13693t == null) {
            if (f0.e.b(this.f13677a, "android.permission.CAMERA") != 0) {
                k(new SecurityException("Camera permission is not granted"));
                return;
            }
            try {
                l(this.T);
                SurfaceTexture surfaceTexture = this.f13679c.getSurfaceTexture();
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(this.f13686m.getWidth(), this.f13686m.getHeight());
                    if (this.f13689p == null) {
                        this.f13689p = new Surface(surfaceTexture);
                    }
                    if (this.f13692s == null) {
                        o oVar = this.f13695w;
                        long j3 = this.f13696x;
                        int i10 = this.d;
                        int i11 = this.e;
                        j jVar = this.f13680f;
                        k2.u uVar = this.f13681g;
                        Objects.requireNonNull(uVar);
                        i iVar = new i(oVar, j3, i10, i11, jVar, new b(uVar));
                        this.f13692s = iVar;
                        Surface f7 = iVar.f();
                        Size size = this.f13687n;
                        int i12 = this.d;
                        int i13 = this.f13688o;
                        j jVar2 = this.f13680f;
                        i iVar2 = this.f13692s;
                        k2.u uVar2 = this.f13681g;
                        Objects.requireNonNull(uVar2);
                        m mVar = new m(size, f7, i12, i13, jVar2, iVar2, new b(uVar2));
                        this.f13691r = mVar;
                        mVar.V = new a(this, 0);
                        this.f13690q = this.f13691r.g();
                    } else {
                        m mVar2 = this.f13691r;
                        if (mVar2 != null) {
                            mVar2.j(this.f13687n, this.f13688o);
                            Surface surface = this.f13691r.f13763l;
                            if (surface != null) {
                                this.f13690q = surface;
                            } else {
                                throw new IllegalStateException("GL processor is not started");
                            }
                        }
                    }
                    this.C = true;
                    this.J = SystemClock.elapsedRealtimeNanos();
                    j jVar3 = this.f13680f;
                    jVar3.b("camera open requested: id=" + this.f13684k + ", preview=" + this.f13686m + ", recording=" + this.f13687n + ", crop=" + this.f13688o);
                    this.f13678b.openCamera(this.f13684k, this.P, this.f13683j);
                }
            } catch (Exception e) {
                this.C = false;
                k(e);
            }
        }
    }

    public final void j() {
        this.B = false;
        TextureView textureView = this.f13679c;
        textureView.setSurfaceTextureListener(null);
        textureView.removeOnLayoutChangeListener(this.M);
        Handler handler = this.f13683j;
        HandlerThread handlerThread = this.f13682i;
        this.f13683j = null;
        this.f13682i = null;
        if (handler != null && handlerThread != null) {
            handler.post(new x1(27, this, handlerThread));
        }
    }

    public final void k(Exception exc) {
        this.f13680f.a("camera error", exc);
        k2.u uVar = this.f13681g;
        ((h0) uVar.f13383b).h.post(new c0(0, uVar, exc));
    }

    public final void l(int i10) {
        int i11;
        Size size;
        String str;
        CameraCharacteristics cameraCharacteristics;
        int i12;
        float floatValue;
        String str2;
        String valueOf;
        int i13;
        if (i10 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        CameraManager cameraManager = this.f13678b;
        String[] cameraIdList = cameraManager.getCameraIdList();
        int length = cameraIdList.length;
        int i14 = 0;
        while (true) {
            size = null;
            if (i14 < length) {
                str = cameraIdList[i14];
                cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == i11) {
                    break;
                }
                i14++;
            } else {
                str = null;
                cameraCharacteristics = null;
                break;
            }
        }
        if (str != null && cameraCharacteristics != null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                if (outputSizes != null && outputSizes.length != 0) {
                    this.f13684k = str;
                    this.V = i10;
                    this.f13685l = cameraCharacteristics;
                    int i15 = this.S;
                    int i16 = this.R;
                    if (i15 == 3) {
                        i12 = k0.d(i16);
                    } else {
                        i12 = 720;
                        if (i16 == 1) {
                            if (i15 == 1) {
                                i12 = 960;
                            }
                        } else if (i15 != 1) {
                            i12 = 540;
                        }
                    }
                    e2.a0 e = e(outputSizes, i12, i15);
                    if (e == null && (i16 != 2 || i15 != 2 || (e = e(outputSizes, 480, 2)) == null)) {
                        int d = k0.d(i16);
                        if (i15 == 3 || (e = e(outputSizes, d, 3)) == null) {
                            int d10 = k0.d(i16);
                            int length2 = outputSizes.length;
                            int i17 = 0;
                            while (true) {
                                i13 = 1920;
                                if (i17 >= length2) {
                                    break;
                                }
                                Size size2 = outputSizes[i17];
                                if (o(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= d10 && (size == null || c(size2) < c(size))) {
                                    size = size2;
                                }
                                i17++;
                            }
                            if (size == null) {
                                int length3 = outputSizes.length;
                                int i18 = 0;
                                while (i18 < length3) {
                                    Size size3 = outputSizes[i18];
                                    if (o(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= i13 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && c(size3) < c(size)))) {
                                        size = size3;
                                    }
                                    i18++;
                                    i13 = 1920;
                                }
                                if (size == null) {
                                    throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
                                }
                            }
                            e = new e2.a0(d(outputSizes, size), size, 3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
                        }
                    }
                    this.f13686m = (Size) e.f7875c;
                    this.f13687n = (Size) e.d;
                    this.f13688o = e.f7874b;
                    this.W = e.f7873a;
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 30) {
                        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
                        if (range != null) {
                            floatValue = ((Float) range.getUpper()).floatValue();
                        }
                        floatValue = 1.0f;
                    } else {
                        Float f7 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
                        if (f7 != null) {
                            floatValue = f7.floatValue();
                        }
                        floatValue = 1.0f;
                    }
                    this.f13698z = Math.max(1.0f, Math.min(4.0f, floatValue));
                    int i20 = this.d;
                    StringBuilder k10 = k0.k("camera outputs selected: output=", i20, "x", i20, ", cameraMode=");
                    k10.append(k0.A(this.W));
                    if (this.W != i15) {
                        str2 = " (fallback from " + k0.A(i15) + ")";
                    } else {
                        str2 = "";
                    }
                    k10.append(str2);
                    k10.append(", crop=");
                    k10.append(this.f13688o);
                    k10.append(", preview=");
                    k10.append(this.f13686m);
                    k10.append(", recording=");
                    k10.append(this.f13687n);
                    String sb2 = k10.toString();
                    j jVar = this.f13680f;
                    jVar.b(sb2);
                    if (i10 == 1) {
                        if (!this.G) {
                            this.G = true;
                        } else {
                            return;
                        }
                    } else if (this.H) {
                        return;
                    } else {
                        this.H = true;
                    }
                    Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    StringBuilder v = a4.a.v("camera capabilities: id=", str, ", facing=");
                    v.append(k0.z(i10));
                    v.append(", hardwareLevel=");
                    if (num2 == null) {
                        valueOf = "unknown";
                    } else if (num2.intValue() == 2) {
                        valueOf = "LEGACY";
                    } else if (num2.intValue() == 0) {
                        valueOf = "LIMITED";
                    } else if (num2.intValue() == 1) {
                        valueOf = "FULL";
                    } else if (num2.intValue() == 3) {
                        valueOf = "LEVEL_3";
                    } else if (i19 >= 28 && num2.intValue() == 4) {
                        valueOf = "EXTERNAL";
                    } else {
                        valueOf = String.valueOf(num2);
                    }
                    v.append(valueOf);
                    v.append(", sensorOrientation=");
                    v.append(num3);
                    v.append(", activeArray=");
                    v.append(rect);
                    v.append(", fpsRanges=");
                    v.append(Arrays.toString(rangeArr));
                    v.append(", outputSizes=");
                    v.append(Arrays.toString(outputSizes));
                    jVar.b(v.toString());
                    return;
                }
                throw new IllegalStateException("Camera has no SurfaceTexture output sizes");
            }
            throw new IllegalStateException("Camera has no stream configuration map");
        }
        throw new IllegalStateException("Requested camera is not available");
    }

    public final void m(boolean z10) {
        this.A = z10;
        Handler handler = this.f13683j;
        if (this.B && handler != null) {
            handler.post(new a(this, 3));
        }
    }

    public final boolean n(float f7) {
        this.f13697y = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f13683j;
        if (this.B && handler != null) {
            a aVar = this.N;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
            return true;
        }
        return false;
    }

    public final void p(o oVar, long j3, int i10) {
        if (this.f13682i == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f13682i = handlerThread;
            handlerThread.start();
            this.f13683j = new Handler(this.f13682i.getLooper());
        }
        this.f13695w = oVar;
        this.f13696x = j3;
        this.T = i10;
        this.B = true;
        this.F = false;
        this.I = SystemClock.elapsedRealtimeNanos();
        StringBuilder sb2 = new StringBuilder("camera segment start: facing=");
        sb2.append(k0.z(i10));
        sb2.append(", timelineOffsetUs=");
        sb2.append(j3);
        sb2.append(", textureAvailable=");
        TextureView textureView = this.f13679c;
        sb2.append(textureView.isAvailable());
        this.f13680f.b(sb2.toString());
        textureView.setSurfaceTextureListener(this.O);
        Handler handler = this.f13683j;
        if (this.B && handler != null && textureView.isAvailable()) {
            handler.post(new a(this, 2));
        }
    }

    public final boolean q() {
        Handler handler = this.f13683j;
        if (this.B && !this.F && handler != null) {
            this.F = true;
            this.f13680f.b("camera segment stop requested");
            handler.post(new a(this, 4));
            return true;
        }
        return false;
    }

    public final void r(int i10) {
        if (this.B && !this.D && i10 != this.U) {
            this.D = true;
            this.E = true;
            this.A = false;
            this.f13697y = 0.0f;
            k2.u uVar = this.f13681g;
            ((h0) uVar.f13383b).h.post(new n8(uVar, i10, 13));
            this.L = SystemClock.elapsedRealtimeNanos();
            j jVar = this.f13680f;
            jVar.b("camera device switch started: from=" + k0.z(this.U) + ", to=" + k0.z(i10));
            m mVar = this.f13691r;
            if (mVar != null) {
                Handler handler = mVar.f13761j;
                if (mVar.T && handler != null) {
                    handler.post(new x1(29, mVar, handler));
                }
            }
            CameraCaptureSession cameraCaptureSession = this.f13694u;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f13694u = null;
            }
            this.v = null;
            CameraDevice cameraDevice = this.f13693t;
            if (cameraDevice != null) {
                this.f13693t = null;
                cameraDevice.close();
            } else if (!this.C) {
                this.D = false;
                i();
            }
        }
    }

    public final void s() {
        int width;
        int height;
        Integer num;
        Size size = this.f13687n;
        if (size != null) {
            TextureView textureView = this.f13679c;
            if (textureView.getWidth() != 0 && textureView.getHeight() != 0) {
                int min = Math.min(this.f13688o, Math.min(size.getWidth(), size.getHeight()));
                boolean z10 = false;
                if (this.f13685l != null && textureView.getDisplay() != null && (num = (Integer) this.f13685l.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                this.f13680f.b("preview transform: view=" + textureView.getWidth() + "x" + textureView.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }
}
