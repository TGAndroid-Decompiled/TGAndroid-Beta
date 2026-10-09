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
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.ha1;
import org.telegram.ui.Components.t60;
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
                n nVar = jVar.f14978j;
                nVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.f14985n;
                if (jVar.S && handler != null && jVar.f14961c.isAvailable()) {
                    handler.post(new a(jVar, 5));
                    return;
                }
                return;
            case 1:
                t60 t60Var = (t60) this.f14912b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (t60Var.m0 == null && surfaceTexture != null && !t60Var.f31025l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    t60Var.m0 = new e60(t60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final c21 c21Var = (c21) this.f14912b;
                ArrayList arrayList = c21Var.f25215c;
                a21 a21Var = c21Var.f25213a;
                if (a21Var != null) {
                    a21Var.i();
                    c21Var.f25213a = null;
                }
                a21 a21Var2 = new a21(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                c21Var.invalidate();
                                return;
                            default:
                                c21 c21Var2 = c21Var;
                                Runnable runnable = c21Var2.d;
                                if (runnable != null) {
                                    c21Var2.f25216e = true;
                                    c21Var2.d = null;
                                    c21.b(runnable);
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
                                c21Var.invalidate();
                                return;
                            default:
                                c21 c21Var2 = c21Var;
                                Runnable runnable = c21Var2.d;
                                if (runnable != null) {
                                    c21Var2.f25216e = true;
                                    c21Var2.d = null;
                                    c21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                c21Var.f25213a = a21Var2;
                a21Var2.f24545a = EmuDetector.with(c21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        b21 b21Var = (b21) arrayList.get(i12);
                        Bitmap bitmap = b21Var.f24856e;
                        if (bitmap != null) {
                            c21Var.f25213a.c(b21Var.f24857f, bitmap, b21Var.f24855c, b21Var.d);
                        } else {
                            ArrayList arrayList2 = b21Var.f24854b;
                            if (arrayList2 != null) {
                                c21Var.f25213a.f(arrayList2, b21Var.d);
                            } else {
                                c21Var.f25213a.e(b21Var.f24853a, b21Var.f24858g, b21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(c21Var.f25214b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f14912b;
                if (fVar.f49671f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f49671f = eVar;
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
                ((j) this.f14912b).f14978j.b("preview surface destroyed: active=" + ((j) this.f14912b).S);
                if (((j) this.f14912b).S) {
                    ((j) this.f14912b).C(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                t60 t60Var = (t60) this.f14912b;
                Camera2Session[] camera2SessionArr = t60Var.f31037v0;
                e60 e60Var = t60Var.m0;
                if (e60Var != null) {
                    e60Var.b(0L, 0, true, 0, 0);
                    t60Var.m0 = null;
                }
                if (t60Var.f31034s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (t60Var.f31035t0 != null) {
                    CameraController.getInstance().close(t60Var.f31035t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((gh0) this.f14912b).V.f34066w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                c21 c21Var = (c21) this.f14912b;
                a21 a21Var = c21Var.f25213a;
                if (a21Var != null) {
                    a21Var.i();
                    c21Var.f25213a = null;
                }
                Runnable runnable = c21Var.d;
                if (runnable != null) {
                    c21Var.d = null;
                    c21.b(runnable);
                    return false;
                }
                return false;
            case 4:
                ha1 ha1Var = (ha1) this.f14912b;
                TextureView textureView = ha1Var.d;
                if (ha1Var.S) {
                    if (ha1Var.W) {
                        ha1Var.f27029r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ha1Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f14912b).f49671f;
                if (eVar != null) {
                    eVar.f49655a = false;
                    ((vh.f) this.f14912b).f49671f = null;
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
                n nVar = jVar.f14978j;
                nVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.Q();
                return;
            case 1:
                e60 e60Var = ((t60) this.f14912b).m0;
                if (e60Var != null) {
                    e60Var.F = i10;
                    e60Var.G = i11;
                    e60Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                a21 a21Var = ((c21) this.f14912b).f25213a;
                if (a21Var != null && (handler = a21Var.getHandler()) != null && a21Var.f24546b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f14912b).f49671f;
                if (eVar != null) {
                    synchronized (eVar.f49658e) {
                        eVar.f49659f = true;
                        eVar.h = i10;
                        eVar.f49660n = i11;
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
                    n nVar = ((j) this.f14912b).f14978j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((j) this.f14912b).f14994r0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(j.s(((j) this.f14912b).f15001v0));
                    nVar.b(sb2.toString());
                    t0 t0Var = (t0) ((j) this.f14912b).f14980k.f51105b;
                    Handler handler = t0Var.f15119i;
                    m2.t tVar = t0Var.d;
                    Objects.requireNonNull(tVar);
                    handler.post(new i2.h0(tVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                j jVar = (j) this.f14912b;
                if (jVar.f15003w0 == 0) {
                    jVar.f15003w0 = elapsedRealtimeNanos;
                    n nVar2 = jVar.f14978j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((j) this.f14912b).f14961c.getWidth());
                    sb3.append("x");
                    sb3.append(((j) this.f14912b).f14961c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((j) this.f14912b).f14991q);
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
                long j11 = jVar2.f15007y0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    jVar2.A0++;
                    jVar2.B0 += j12;
                    j3 = 0;
                    double d = j12;
                    jVar2.C0 = (d * d) + jVar2.C0;
                    long j13 = jVar2.D0;
                    if (j13 == 0 || j12 < j13) {
                        jVar2.D0 = j12;
                    }
                    jVar2.E0 = Math.max(jVar2.E0, j12);
                    if (j12 > 50000000) {
                        jVar2.F0++;
                    }
                    if (j12 > 100000000) {
                        jVar2.G0++;
                    }
                } else {
                    j3 = 0;
                }
                j jVar3 = (j) this.f14912b;
                jVar3.f15007y0 = elapsedRealtimeNanos;
                long j14 = jVar3.f15009z0;
                if (timestamp > j14) {
                    if (jVar3.I0 == j3) {
                        jVar3.I0 = timestamp;
                    }
                    jVar3.J0 = timestamp;
                    jVar3.H0++;
                } else if (j14 != j3) {
                    jVar3.K0++;
                }
                jVar3.f15009z0 = timestamp;
                jVar3.f15005x0++;
                if (elapsedRealtimeNanos - jVar3.f15003w0 >= 5000000000L) {
                    TextureView textureView = jVar3.f14961c;
                    long j15 = jVar3.J0 - jVar3.I0;
                    if (j15 > j3) {
                        long j16 = jVar3.H0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            jVar3.f14978j.b("preview frame delivery: callbackFps=" + ((((float) jVar3.f15005x0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + j.f(jVar3.B0, jVar3.A0) + ", min=" + (((float) jVar3.D0) / 1000000.0f) + ", max=" + (((float) jVar3.E0) / 1000000.0f) + ", jitter=" + j.K(jVar3.C0, jVar3.B0, jVar3.A0) + "}, gaps={over50ms=" + jVar3.F0 + ", over100ms=" + jVar3.G0 + "}, nonMonotonicTimestamps=" + jVar3.K0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar3.E();
                            jVar3.f15003w0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    jVar3.f14978j.b("preview frame delivery: callbackFps=" + ((((float) jVar3.f15005x0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + j.f(jVar3.B0, jVar3.A0) + ", min=" + (((float) jVar3.D0) / 1000000.0f) + ", max=" + (((float) jVar3.E0) / 1000000.0f) + ", jitter=" + j.K(jVar3.C0, jVar3.B0, jVar3.A0) + "}, gaps={over50ms=" + jVar3.F0 + ", over100ms=" + jVar3.G0 + "}, nonMonotonicTimestamps=" + jVar3.K0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar3.E();
                    jVar3.f15003w0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ha1 ha1Var = (ha1) this.f14912b;
                if (ha1Var.f27029r == 1) {
                    ha1Var.f27028n.getViewTreeObserver().addOnPreDrawListener(new da(this, 4));
                    ha1Var.f27028n.invalidate();
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
