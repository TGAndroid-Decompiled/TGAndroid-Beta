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
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ia1;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.u60;
public final class d implements TextureView.SurfaceTextureListener {
    public final int f14910a;
    public final Object f14911b;

    public d(Object obj, int i10) {
        this.f14910a = i10;
        this.f14911b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f14910a) {
            case 0:
                j jVar = (j) this.f14911b;
                n nVar = jVar.f14979j;
                nVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.f14988n;
                if (jVar.S && handler != null && jVar.f14960c.isAvailable()) {
                    handler.post(new a(jVar, 5));
                    return;
                }
                return;
            case 1:
                u60 u60Var = (u60) this.f14911b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (u60Var.m0 == null && surfaceTexture != null && !u60Var.f31281l0) {
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
                final e21 e21Var = (e21) this.f14911b;
                ArrayList arrayList = e21Var.f25808c;
                c21 c21Var = e21Var.f25806a;
                if (c21Var != null) {
                    c21Var.i();
                    e21Var.f25806a = null;
                }
                c21 c21Var2 = new c21(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                e21Var.invalidate();
                                return;
                            default:
                                e21 e21Var2 = e21Var;
                                Runnable runnable = e21Var2.d;
                                if (runnable != null) {
                                    e21Var2.f25809e = true;
                                    e21Var2.d = null;
                                    e21.b(runnable);
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
                                e21Var.invalidate();
                                return;
                            default:
                                e21 e21Var2 = e21Var;
                                Runnable runnable = e21Var2.d;
                                if (runnable != null) {
                                    e21Var2.f25809e = true;
                                    e21Var2.d = null;
                                    e21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                e21Var.f25806a = c21Var2;
                c21Var2.f25067a = EmuDetector.with(e21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        d21 d21Var = (d21) arrayList.get(i12);
                        Bitmap bitmap = d21Var.f25414e;
                        if (bitmap != null) {
                            e21Var.f25806a.c(d21Var.f25415f, bitmap, d21Var.f25413c, d21Var.d);
                        } else {
                            ArrayList arrayList2 = d21Var.f25412b;
                            if (arrayList2 != null) {
                                e21Var.f25806a.f(arrayList2, d21Var.d);
                            } else {
                                e21Var.f25806a.e(d21Var.f25411a, d21Var.f25416g, d21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(e21Var.f25807b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f14911b;
                if (fVar.f49760f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f49760f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f14910a) {
            case 0:
                ((j) this.f14911b).f14979j.b("preview surface destroyed: active=" + ((j) this.f14911b).S);
                if (((j) this.f14911b).S) {
                    ((j) this.f14911b).H(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                u60 u60Var = (u60) this.f14911b;
                Camera2Session[] camera2SessionArr = u60Var.f31293v0;
                f60 f60Var = u60Var.m0;
                if (f60Var != null) {
                    f60Var.b(0L, 0, true, 0, 0);
                    u60Var.m0 = null;
                }
                if (u60Var.f31290s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (u60Var.f31291t0 != null) {
                    CameraController.getInstance().close(u60Var.f31291t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((ih0) this.f14911b).V.f34094w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                e21 e21Var = (e21) this.f14911b;
                c21 c21Var = e21Var.f25806a;
                if (c21Var != null) {
                    c21Var.i();
                    e21Var.f25806a = null;
                }
                Runnable runnable = e21Var.d;
                if (runnable != null) {
                    e21Var.d = null;
                    e21.b(runnable);
                    return false;
                }
                return false;
            case 4:
                ia1 ia1Var = (ia1) this.f14911b;
                TextureView textureView = ia1Var.d;
                if (ia1Var.S) {
                    if (ia1Var.W) {
                        ia1Var.f27263r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ia1Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f14911b).f49760f;
                if (eVar != null) {
                    eVar.f49744a = false;
                    ((vh.f) this.f14911b).f49760f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f14910a) {
            case 0:
                j jVar = (j) this.f14911b;
                n nVar = jVar.f14979j;
                nVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.W();
                return;
            case 1:
                f60 f60Var = ((u60) this.f14911b).m0;
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
                c21 c21Var = ((e21) this.f14911b).f25806a;
                if (c21Var != null && (handler = c21Var.getHandler()) != null && c21Var.f25068b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f14911b).f49760f;
                if (eVar != null) {
                    synchronized (eVar.f49747e) {
                        eVar.f49748f = true;
                        eVar.h = i10;
                        eVar.f49749n = i11;
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
        switch (this.f14910a) {
            case 0:
                if (((j) this.f14911b).X) {
                    ((j) this.f14911b).X = false;
                    n nVar = ((j) this.f14911b).f14979j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((j) this.f14911b).f15004v0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(j.u(((j) this.f14911b).f15012z0));
                    nVar.b(sb2.toString());
                    t0 t0Var = (t0) ((j) this.f14911b).f14982k.f51194b;
                    Handler handler = t0Var.f15122i;
                    m2.t tVar = t0Var.d;
                    Objects.requireNonNull(tVar);
                    handler.post(new i2.h0(tVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                j jVar = (j) this.f14911b;
                if (jVar.A0 == 0) {
                    jVar.A0 = elapsedRealtimeNanos;
                    n nVar2 = jVar.f14979j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((j) this.f14911b).f14960c.getWidth());
                    sb3.append("x");
                    sb3.append(((j) this.f14911b).f14960c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((j) this.f14911b).f14994q);
                    sb3.append(", attached=");
                    sb3.append(((j) this.f14911b).f14960c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((j) this.f14911b).f14960c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((j) this.f14911b).f14960c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((j) this.f14911b).f14960c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((j) this.f14911b).f14960c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((j) this.f14911b).f14960c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                j jVar2 = (j) this.f14911b;
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
                j jVar3 = (j) this.f14911b;
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
                    TextureView textureView = jVar3.f14960c;
                    long j15 = jVar3.N0 - jVar3.M0;
                    if (j15 > j3) {
                        long j16 = jVar3.L0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            jVar3.f14979j.b("preview frame delivery: callbackFps=" + ((((float) jVar3.B0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + j.h(jVar3.F0, jVar3.E0) + ", min=" + (((float) jVar3.H0) / 1000000.0f) + ", max=" + (((float) jVar3.I0) / 1000000.0f) + ", jitter=" + j.Q(jVar3.G0, jVar3.F0, jVar3.E0) + "}, gaps={over50ms=" + jVar3.J0 + ", over100ms=" + jVar3.K0 + "}, nonMonotonicTimestamps=" + jVar3.O0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar3.J();
                            jVar3.A0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    jVar3.f14979j.b("preview frame delivery: callbackFps=" + ((((float) jVar3.B0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + j.h(jVar3.F0, jVar3.E0) + ", min=" + (((float) jVar3.H0) / 1000000.0f) + ", max=" + (((float) jVar3.I0) / 1000000.0f) + ", jitter=" + j.Q(jVar3.G0, jVar3.F0, jVar3.E0) + "}, gaps={over50ms=" + jVar3.J0 + ", over100ms=" + jVar3.K0 + "}, nonMonotonicTimestamps=" + jVar3.O0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
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
                ia1 ia1Var = (ia1) this.f14911b;
                if (ia1Var.f27263r == 1) {
                    ia1Var.f27262n.getViewTreeObserver().addOnPreDrawListener(new da(this, 4));
                    ia1Var.f27262n.invalidate();
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
