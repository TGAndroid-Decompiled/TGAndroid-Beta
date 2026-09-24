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
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.og0;
public final class c implements TextureView.SurfaceTextureListener {
    public final int f13664a;
    public final Object f13665b;

    public c(Object obj, int i10) {
        this.f13664a = i10;
        this.f13665b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f13664a) {
            case 0:
                h hVar = (h) this.f13665b;
                l lVar = hVar.f13707j;
                lVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = hVar.f13714n;
                if (hVar.R && handler != null && hVar.f13696c.isAvailable()) {
                    handler.post(new b(hVar, 3));
                    return;
                }
                return;
            case 1:
                c60 c60Var = (c60) this.f13665b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (c60Var.m0 == null && surfaceTexture != null && !c60Var.f23201l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    c60Var.m0 = new n50(c60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final k11 k11Var = (k11) this.f13665b;
                ArrayList arrayList = k11Var.f25580c;
                i11 i11Var = k11Var.f25578a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.f25578a = null;
                }
                i11 i11Var2 = new i11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                k11Var.invalidate();
                                return;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
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
                                k11Var.invalidate();
                                return;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                k11Var.f25578a = i11Var2;
                i11Var2.f24882a = EmuDetector.with(k11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j11 j11Var = (j11) arrayList.get(i12);
                        Bitmap bitmap = j11Var.e;
                        if (bitmap != null) {
                            k11Var.f25578a.c(j11Var.f25217f, bitmap, j11Var.f25216c, j11Var.d);
                        } else {
                            ArrayList arrayList2 = j11Var.f25215b;
                            if (arrayList2 != null) {
                                k11Var.f25578a.f(arrayList2, j11Var.d);
                            } else {
                                k11Var.f25578a.e(j11Var.f25214a, j11Var.f25218g, j11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(k11Var.f25579b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f13665b;
                if (fVar.f44663f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f44663f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f13664a) {
            case 0:
                l lVar = ((h) this.f13665b).f13707j;
                lVar.b("preview surface destroyed: active=" + ((h) this.f13665b).R);
                if (((h) this.f13665b).R) {
                    ((h) this.f13665b).s(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                c60 c60Var = (c60) this.f13665b;
                Camera2Session[] camera2SessionArr = c60Var.f23213v0;
                n50 n50Var = c60Var.m0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
                    c60Var.m0 = null;
                }
                if (c60Var.f23210s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (c60Var.f23211t0 != null) {
                    CameraController.getInstance().close(c60Var.f23211t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((og0) this.f13665b).V.f31371w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                k11 k11Var = (k11) this.f13665b;
                i11 i11Var = k11Var.f25578a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.f25578a = null;
                }
                Runnable runnable = k11Var.d;
                if (runnable != null) {
                    k11Var.d = null;
                    k11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                o91 o91Var = (o91) this.f13665b;
                TextureView textureView = o91Var.d;
                if (o91Var.S) {
                    if (o91Var.W) {
                        o91Var.f27007r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    o91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f13665b).f44663f;
                if (eVar != null) {
                    eVar.f44649a = false;
                    ((vh.f) this.f13665b).f44663f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f13664a) {
            case 0:
                h hVar = (h) this.f13665b;
                l lVar = hVar.f13707j;
                lVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                hVar.F();
                return;
            case 1:
                n50 n50Var = ((c60) this.f13665b).m0;
                if (n50Var != null) {
                    n50Var.F = i10;
                    n50Var.G = i11;
                    n50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                i11 i11Var = ((k11) this.f13665b).f25578a;
                if (i11Var != null && (handler = i11Var.getHandler()) != null && i11Var.f24883b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f13665b).f44663f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f44652f = true;
                        eVar.h = i10;
                        eVar.f44653n = i11;
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
        switch (this.f13664a) {
            case 0:
                if (((h) this.f13665b).W) {
                    ((h) this.f13665b).W = false;
                    ((h) this.f13665b).f13707j.b("camera switch first preview frame");
                    r0 r0Var = (r0) ((h) this.f13665b).f13709k.f13369b;
                    Handler handler = r0Var.h;
                    l.d dVar = r0Var.f13834c;
                    Objects.requireNonNull(dVar);
                    handler.post(new i2.h0(dVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                h hVar = (h) this.f13665b;
                if (hVar.f13706i0 == 0) {
                    hVar.f13706i0 = elapsedRealtimeNanos;
                    l lVar = hVar.f13707j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((h) this.f13665b).f13696c.getWidth());
                    sb2.append("x");
                    sb2.append(((h) this.f13665b).f13696c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((h) this.f13665b).f13720q);
                    sb2.append(", attached=");
                    sb2.append(((h) this.f13665b).f13696c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((h) this.f13665b).f13696c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((h) this.f13665b).f13696c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((h) this.f13665b).f13696c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((h) this.f13665b).f13696c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((h) this.f13665b).f13696c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    lVar.b(sb2.toString());
                }
                h hVar2 = (h) this.f13665b;
                long j11 = hVar2.f13710k0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    hVar2.m0++;
                    hVar2.f13715n0 += j12;
                    j3 = 0;
                    double d = j12;
                    hVar2.f13717o0 = (d * d) + hVar2.f13717o0;
                    long j13 = hVar2.f13719p0;
                    if (j13 == 0 || j12 < j13) {
                        hVar2.f13719p0 = j12;
                    }
                    hVar2.f13721q0 = Math.max(hVar2.f13721q0, j12);
                    if (j12 > 50000000) {
                        hVar2.f13723r0++;
                    }
                    if (j12 > 100000000) {
                        hVar2.f13725s0++;
                    }
                } else {
                    j3 = 0;
                }
                h hVar3 = (h) this.f13665b;
                hVar3.f13710k0 = elapsedRealtimeNanos;
                long j14 = hVar3.f13712l0;
                if (timestamp > j14) {
                    if (hVar3.f13729u0 == j3) {
                        hVar3.f13729u0 = timestamp;
                    }
                    hVar3.f13730v0 = timestamp;
                    hVar3.f13727t0++;
                } else if (j14 != j3) {
                    hVar3.f13732w0++;
                }
                hVar3.f13712l0 = timestamp;
                hVar3.f13708j0++;
                if (elapsedRealtimeNanos - hVar3.f13706i0 >= 5000000000L) {
                    TextureView textureView = hVar3.f13696c;
                    long j15 = hVar3.f13730v0 - hVar3.f13729u0;
                    if (j15 > j3) {
                        long j16 = hVar3.f13727t0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            hVar3.f13707j.b("preview frame delivery: callbackFps=" + ((((float) hVar3.f13708j0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + h.c(hVar3.f13715n0, hVar3.m0) + ", min=" + (((float) hVar3.f13719p0) / 1000000.0f) + ", max=" + (((float) hVar3.f13721q0) / 1000000.0f) + ", jitter=" + h.A(hVar3.f13717o0, hVar3.f13715n0, hVar3.m0) + "}, gaps={over50ms=" + hVar3.f13723r0 + ", over100ms=" + hVar3.f13725s0 + "}, nonMonotonicTimestamps=" + hVar3.f13732w0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            hVar3.u();
                            hVar3.f13706i0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    hVar3.f13707j.b("preview frame delivery: callbackFps=" + ((((float) hVar3.f13708j0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + h.c(hVar3.f13715n0, hVar3.m0) + ", min=" + (((float) hVar3.f13719p0) / 1000000.0f) + ", max=" + (((float) hVar3.f13721q0) / 1000000.0f) + ", jitter=" + h.A(hVar3.f13717o0, hVar3.f13715n0, hVar3.m0) + "}, gaps={over50ms=" + hVar3.f13723r0 + ", over100ms=" + hVar3.f13725s0 + "}, nonMonotonicTimestamps=" + hVar3.f13732w0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    hVar3.u();
                    hVar3.f13706i0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                o91 o91Var = (o91) this.f13665b;
                if (o91Var.f27007r == 1) {
                    o91Var.f27006n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    o91Var.f27006n.invalidate();
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
