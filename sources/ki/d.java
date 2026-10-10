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
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.ia1;
import org.telegram.ui.Components.u60;
public final class d implements TextureView.SurfaceTextureListener {
    public final int f14911a;
    public final Object f14912b;

    public d(Object obj, int i10) {
        this.f14911a = i10;
        this.f14912b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f14911a) {
            case 0:
                j jVar = (j) this.f14912b;
                n nVar = jVar.f14980j;
                nVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.f14989n;
                if (jVar.S && handler != null && jVar.f14961c.isAvailable()) {
                    handler.post(new a(jVar, 5));
                    return;
                }
                return;
            case 1:
                u60 u60Var = (u60) this.f14912b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (u60Var.m0 == null && surfaceTexture != null && !u60Var.f31359l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    u60Var.m0 = new f60(u60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final d21 d21Var = (d21) this.f14912b;
                ArrayList arrayList = d21Var.f25530c;
                b21 b21Var = d21Var.f25528a;
                if (b21Var != null) {
                    b21Var.i();
                    d21Var.f25528a = null;
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
                                    d21Var2.f25531e = true;
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
                                    d21Var2.f25531e = true;
                                    d21Var2.d = null;
                                    d21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                d21Var.f25528a = b21Var2;
                b21Var2.f24813a = EmuDetector.with(d21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        c21 c21Var = (c21) arrayList.get(i12);
                        Bitmap bitmap = c21Var.f25140e;
                        if (bitmap != null) {
                            d21Var.f25528a.c(c21Var.f25141f, bitmap, c21Var.f25139c, c21Var.d);
                        } else {
                            ArrayList arrayList2 = c21Var.f25138b;
                            if (arrayList2 != null) {
                                d21Var.f25528a.f(arrayList2, c21Var.d);
                            } else {
                                d21Var.f25528a.e(c21Var.f25137a, c21Var.f25142g, c21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(d21Var.f25529b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f14912b;
                if (fVar.f49717f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f49717f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f14911a) {
            case 0:
                ((j) this.f14912b).f14980j.b("preview surface destroyed: active=" + ((j) this.f14912b).S);
                if (((j) this.f14912b).S) {
                    ((j) this.f14912b).H(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                u60 u60Var = (u60) this.f14912b;
                Camera2Session[] camera2SessionArr = u60Var.f31371v0;
                f60 f60Var = u60Var.m0;
                if (f60Var != null) {
                    f60Var.b(0L, 0, true, 0, 0);
                    u60Var.m0 = null;
                }
                if (u60Var.f31368s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (u60Var.f31369t0 != null) {
                    CameraController.getInstance().close(u60Var.f31369t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((hh0) this.f14912b).V.f34104w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                d21 d21Var = (d21) this.f14912b;
                b21 b21Var = d21Var.f25528a;
                if (b21Var != null) {
                    b21Var.i();
                    d21Var.f25528a = null;
                }
                Runnable runnable = d21Var.d;
                if (runnable != null) {
                    d21Var.d = null;
                    d21.b(runnable);
                    return false;
                }
                return false;
            case 4:
                ia1 ia1Var = (ia1) this.f14912b;
                TextureView textureView = ia1Var.d;
                if (ia1Var.S) {
                    if (ia1Var.W) {
                        ia1Var.f27335r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ia1Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f14912b).f49717f;
                if (eVar != null) {
                    eVar.f49701a = false;
                    ((vh.f) this.f14912b).f49717f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f14911a) {
            case 0:
                j jVar = (j) this.f14912b;
                n nVar = jVar.f14980j;
                nVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.W();
                return;
            case 1:
                f60 f60Var = ((u60) this.f14912b).m0;
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
                b21 b21Var = ((d21) this.f14912b).f25528a;
                if (b21Var != null && (handler = b21Var.getHandler()) != null && b21Var.f24814b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f14912b).f49717f;
                if (eVar != null) {
                    synchronized (eVar.f49704e) {
                        eVar.f49705f = true;
                        eVar.h = i10;
                        eVar.f49706n = i11;
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
        switch (this.f14911a) {
            case 0:
                if (((j) this.f14912b).X) {
                    ((j) this.f14912b).X = false;
                    n nVar = ((j) this.f14912b).f14980j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((j) this.f14912b).f15005v0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(j.u(((j) this.f14912b).f15013z0));
                    nVar.b(sb2.toString());
                    t0 t0Var = (t0) ((j) this.f14912b).f14983k.f51151b;
                    Handler handler = t0Var.f15123i;
                    m2.t tVar = t0Var.d;
                    Objects.requireNonNull(tVar);
                    handler.post(new i2.h0(tVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                j jVar = (j) this.f14912b;
                if (jVar.A0 == 0) {
                    jVar.A0 = elapsedRealtimeNanos;
                    n nVar2 = jVar.f14980j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((j) this.f14912b).f14961c.getWidth());
                    sb3.append("x");
                    sb3.append(((j) this.f14912b).f14961c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((j) this.f14912b).f14995q);
                    sb3.append(", attached=");
                    sb3.append(((j) this.f14912b).f14961c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((j) this.f14912b).f14961c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((j) this.f14912b).f14961c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((j) this.f14912b).f14961c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((j) this.f14912b).f14961c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((j) this.f14912b).f14961c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                j jVar2 = (j) this.f14912b;
                long j11 = jVar2.C0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    jVar2.E0++;
                    jVar2.F0 += j12;
                    j3 = 0;
                    double d = j12;
                    jVar2.G0 = (d * d) + jVar2.G0;
                    long j13 = jVar2.H0;
                    if (j13 == 0 || j12 < j13) {
                        jVar2.H0 = j12;
                    }
                    jVar2.I0 = Math.max(jVar2.I0, j12);
                    if (j12 > 50000000) {
                        jVar2.J0++;
                    }
                    if (j12 > 100000000) {
                        jVar2.K0++;
                    }
                } else {
                    j3 = 0;
                }
                j jVar3 = (j) this.f14912b;
                jVar3.C0 = elapsedRealtimeNanos;
                long j14 = jVar3.D0;
                if (timestamp > j14) {
                    if (jVar3.M0 == j3) {
                        jVar3.M0 = timestamp;
                    }
                    jVar3.N0 = timestamp;
                    jVar3.L0++;
                } else if (j14 != j3) {
                    jVar3.O0++;
                }
                jVar3.D0 = timestamp;
                jVar3.B0++;
                if (elapsedRealtimeNanos - jVar3.A0 >= 5000000000L) {
                    TextureView textureView = jVar3.f14961c;
                    long j15 = jVar3.N0 - jVar3.M0;
                    if (j15 > j3) {
                        long j16 = jVar3.L0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            jVar3.f14980j.b("preview frame delivery: callbackFps=" + ((((float) jVar3.B0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + j.h(jVar3.F0, jVar3.E0) + ", min=" + (((float) jVar3.H0) / 1000000.0f) + ", max=" + (((float) jVar3.I0) / 1000000.0f) + ", jitter=" + j.Q(jVar3.G0, jVar3.F0, jVar3.E0) + "}, gaps={over50ms=" + jVar3.J0 + ", over100ms=" + jVar3.K0 + "}, nonMonotonicTimestamps=" + jVar3.O0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar3.J();
                            jVar3.A0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    jVar3.f14980j.b("preview frame delivery: callbackFps=" + ((((float) jVar3.B0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + j.h(jVar3.F0, jVar3.E0) + ", min=" + (((float) jVar3.H0) / 1000000.0f) + ", max=" + (((float) jVar3.I0) / 1000000.0f) + ", jitter=" + j.Q(jVar3.G0, jVar3.F0, jVar3.E0) + "}, gaps={over50ms=" + jVar3.J0 + ", over100ms=" + jVar3.K0 + "}, nonMonotonicTimestamps=" + jVar3.O0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar3.J();
                    jVar3.A0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ia1 ia1Var = (ia1) this.f14912b;
                if (ia1Var.f27335r == 1) {
                    ia1Var.f27334n.getViewTreeObserver().addOnPreDrawListener(new da(this, 4));
                    ia1Var.f27334n.invalidate();
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
