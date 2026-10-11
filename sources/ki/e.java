package ki;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ha1;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.t60;
public final class e implements TextureView.SurfaceTextureListener {
    public final int f14917a;
    public final Object f14918b;

    public e(Object obj, int i10) {
        this.f14917a = i10;
        this.f14918b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f14917a) {
            case 0:
                k kVar = (k) this.f14918b;
                o oVar = kVar.f14986j;
                oVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = kVar.f14996n;
                if (kVar.V && handler != null && kVar.f14967c.isAvailable()) {
                    handler.post(new a(kVar, 6));
                    return;
                }
                return;
            case 1:
                t60 t60Var = (t60) this.f14918b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (t60Var.m0 == null && surfaceTexture != null && !t60Var.f31105l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    t60Var.m0 = new f60(t60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final d21 d21Var = (d21) this.f14918b;
                ArrayList arrayList = d21Var.f25592c;
                b21 b21Var = d21Var.f25590a;
                if (b21Var != null) {
                    b21Var.i();
                    d21Var.f25590a = null;
                }
                b21 b21Var2 = new b21(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d21Var.invalidate();
                                return;
                            default:
                                d21 d21Var2 = d21Var;
                                Runnable runnable = d21Var2.d;
                                if (runnable != null) {
                                    d21Var2.f25593e = true;
                                    d21Var2.d = null;
                                    d21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d21Var.invalidate();
                                return;
                            default:
                                d21 d21Var2 = d21Var;
                                Runnable runnable = d21Var2.d;
                                if (runnable != null) {
                                    d21Var2.f25593e = true;
                                    d21Var2.d = null;
                                    d21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                d21Var.f25590a = b21Var2;
                b21Var2.f24855a = EmuDetector.with(d21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        c21 c21Var = (c21) arrayList.get(i12);
                        Bitmap bitmap = c21Var.f25178e;
                        if (bitmap != null) {
                            d21Var.f25590a.c(c21Var.f25179f, bitmap, c21Var.f25177c, c21Var.d);
                        } else {
                            ArrayList arrayList2 = c21Var.f25176b;
                            if (arrayList2 != null) {
                                d21Var.f25590a.f(arrayList2, c21Var.d);
                            } else {
                                d21Var.f25590a.e(c21Var.f25175a, c21Var.f25180g, c21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(d21Var.f25591b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f14918b;
                if (fVar.f49794f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f49794f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f14917a) {
            case 0:
                ((k) this.f14918b).f14986j.b("preview surface destroyed: active=" + ((k) this.f14918b).V);
                if (((k) this.f14918b).V) {
                    ((k) this.f14918b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                t60 t60Var = (t60) this.f14918b;
                Camera2Session[] camera2SessionArr = t60Var.f31117v0;
                f60 f60Var = t60Var.m0;
                if (f60Var != null) {
                    f60Var.b(0L, 0, true, 0, 0);
                    t60Var.m0 = null;
                }
                if (t60Var.f31114s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (t60Var.f31115t0 != null) {
                    CameraController.getInstance().close(t60Var.f31115t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((hh0) this.f14918b).V.f34128w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                d21 d21Var = (d21) this.f14918b;
                b21 b21Var = d21Var.f25590a;
                if (b21Var != null) {
                    b21Var.i();
                    d21Var.f25590a = null;
                }
                Runnable runnable = d21Var.d;
                if (runnable != null) {
                    d21Var.d = null;
                    d21.b(runnable);
                    return false;
                }
                return false;
            case 4:
                ha1 ha1Var = (ha1) this.f14918b;
                TextureView textureView = ha1Var.d;
                if (ha1Var.S) {
                    if (ha1Var.W) {
                        ha1Var.f27055r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ha1Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f14918b).f49794f;
                if (eVar != null) {
                    eVar.f49778a = false;
                    ((vh.f) this.f14918b).f49794f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f14917a) {
            case 0:
                k kVar = (k) this.f14918b;
                o oVar = kVar.f14986j;
                oVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                kVar.d0();
                return;
            case 1:
                f60 f60Var = ((t60) this.f14918b).m0;
                if (f60Var != null) {
                    f60Var.F = i10;
                    f60Var.G = i11;
                    f60Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                b21 b21Var = ((d21) this.f14918b).f25590a;
                if (b21Var != null && (handler = b21Var.getHandler()) != null && b21Var.f24856b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f14918b).f49794f;
                if (eVar != null) {
                    synchronized (eVar.f49781e) {
                        eVar.f49782f = true;
                        eVar.h = i10;
                        eVar.f49783n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        long j10;
        float f7;
        Object valueOf;
        String str;
        switch (this.f14917a) {
            case 0:
                if (((k) this.f14918b).f14962a0) {
                    ((k) this.f14918b).f14962a0 = false;
                    o oVar = ((k) this.f14918b).f14986j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    k kVar = (k) this.f14918b;
                    if (kVar.m0) {
                        str = "DUAL_ACTIVE";
                    } else if (kVar.D0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(k.z(((k) this.f14918b).H0));
                    oVar.b(sb2.toString());
                    v0 v0Var = (v0) ((k) this.f14918b).f14989k.f51228b;
                    Handler handler = v0Var.f15164i;
                    m2.t tVar = v0Var.d;
                    Objects.requireNonNull(tVar);
                    handler.post(new i2.h0(tVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                k kVar2 = (k) this.f14918b;
                if (kVar2.I0 == 0) {
                    kVar2.I0 = elapsedRealtimeNanos;
                    o oVar2 = kVar2.f14986j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((k) this.f14918b).f14967c.getWidth());
                    sb3.append("x");
                    sb3.append(((k) this.f14918b).f14967c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((k) this.f14918b).f15005q);
                    sb3.append(", attached=");
                    sb3.append(((k) this.f14918b).f14967c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((k) this.f14918b).f14967c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((k) this.f14918b).f14967c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((k) this.f14918b).f14967c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((k) this.f14918b).f14967c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((k) this.f14918b).f14967c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    oVar2.b(sb3.toString());
                }
                k kVar3 = (k) this.f14918b;
                long j11 = kVar3.K0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    kVar3.M0++;
                    kVar3.N0 += j12;
                    j3 = 0;
                    double d = j12;
                    kVar3.O0 = (d * d) + kVar3.O0;
                    long j13 = kVar3.P0;
                    if (j13 == 0 || j12 < j13) {
                        kVar3.P0 = j12;
                    }
                    kVar3.Q0 = Math.max(kVar3.Q0, j12);
                    if (j12 > 50000000) {
                        kVar3.R0++;
                    }
                    if (j12 > 100000000) {
                        kVar3.S0++;
                    }
                } else {
                    j3 = 0;
                }
                k kVar4 = (k) this.f14918b;
                kVar4.K0 = elapsedRealtimeNanos;
                long j14 = kVar4.L0;
                if (timestamp > j14) {
                    if (kVar4.U0 == j3) {
                        kVar4.U0 = timestamp;
                    }
                    kVar4.V0 = timestamp;
                    kVar4.T0++;
                } else if (j14 != j3) {
                    kVar4.W0++;
                }
                kVar4.L0 = timestamp;
                kVar4.J0++;
                if (elapsedRealtimeNanos - kVar4.I0 >= 5000000000L) {
                    TextureView textureView = kVar4.f14967c;
                    long j15 = kVar4.V0 - kVar4.U0;
                    if (j15 > j3) {
                        long j16 = kVar4.T0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            kVar4.f14986j.b("preview frame delivery: callbackFps=" + ((((float) kVar4.J0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + k.j(kVar4.N0, kVar4.M0) + ", min=" + (((float) kVar4.P0) / 1000000.0f) + ", max=" + (((float) kVar4.Q0) / 1000000.0f) + ", jitter=" + k.W(kVar4.O0, kVar4.N0, kVar4.M0) + "}, gaps={over50ms=" + kVar4.R0 + ", over100ms=" + kVar4.S0 + "}, nonMonotonicTimestamps=" + kVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            kVar4.P();
                            kVar4.I0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    kVar4.f14986j.b("preview frame delivery: callbackFps=" + ((((float) kVar4.J0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + k.j(kVar4.N0, kVar4.M0) + ", min=" + (((float) kVar4.P0) / 1000000.0f) + ", max=" + (((float) kVar4.Q0) / 1000000.0f) + ", jitter=" + k.W(kVar4.O0, kVar4.N0, kVar4.M0) + "}, gaps={over50ms=" + kVar4.R0 + ", over100ms=" + kVar4.S0 + "}, nonMonotonicTimestamps=" + kVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    kVar4.P();
                    kVar4.I0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ha1 ha1Var = (ha1) this.f14918b;
                if (ha1Var.f27055r == 1) {
                    ha1Var.f27054n.getViewTreeObserver().addOnPreDrawListener(new da(this, 4));
                    ha1Var.f27054n.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void g(SurfaceTexture surfaceTexture) {
    }

    private final void h(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void d(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
