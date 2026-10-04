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
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.z91;
public final class d implements TextureView.SurfaceTextureListener {
    public final int f14862a;
    public final Object f14863b;

    public d(Object obj, int i10) {
        this.f14862a = i10;
        this.f14863b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f14862a) {
            case 0:
                i iVar = (i) this.f14863b;
                m mVar = iVar.f14909j;
                mVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = iVar.f14916n;
                if (iVar.S && handler != null && iVar.f14897c.isAvailable()) {
                    handler.post(new a(iVar, 5));
                    return;
                }
                return;
            case 1:
                f60 f60Var = (f60) this.f14863b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (f60Var.m0 == null && surfaceTexture != null && !f60Var.f26319l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    f60Var.m0 = new q50(f60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final v11 v11Var = (v11) this.f14863b;
                ArrayList arrayList = v11Var.f31508c;
                t11 t11Var = v11Var.f31506a;
                if (t11Var != null) {
                    t11Var.i();
                    v11Var.f31506a = null;
                }
                t11 t11Var2 = new t11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                v11Var.invalidate();
                                return;
                            default:
                                v11 v11Var2 = v11Var;
                                Runnable runnable = v11Var2.d;
                                if (runnable != null) {
                                    v11Var2.f31509e = true;
                                    v11Var2.d = null;
                                    v11.b(runnable);
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
                                v11Var.invalidate();
                                return;
                            default:
                                v11 v11Var2 = v11Var;
                                Runnable runnable = v11Var2.d;
                                if (runnable != null) {
                                    v11Var2.f31509e = true;
                                    v11Var2.d = null;
                                    v11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                v11Var.f31506a = t11Var2;
                t11Var2.f30928a = EmuDetector.with(v11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        u11 u11Var = (u11) arrayList.get(i12);
                        Bitmap bitmap = u11Var.f31248e;
                        if (bitmap != null) {
                            v11Var.f31506a.c(u11Var.f31249f, bitmap, u11Var.f31247c, u11Var.d);
                        } else {
                            ArrayList arrayList2 = u11Var.f31246b;
                            if (arrayList2 != null) {
                                v11Var.f31506a.f(arrayList2, u11Var.d);
                            } else {
                                v11Var.f31506a.e(u11Var.f31245a, u11Var.f31250g, u11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(v11Var.f31507b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f14863b;
                if (fVar.f48384f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f48384f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f14862a) {
            case 0:
                m mVar = ((i) this.f14863b).f14909j;
                mVar.b("preview surface destroyed: active=" + ((i) this.f14863b).S);
                if (((i) this.f14863b).S) {
                    ((i) this.f14863b).t(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                f60 f60Var = (f60) this.f14863b;
                Camera2Session[] camera2SessionArr = f60Var.f26331v0;
                q50 q50Var = f60Var.m0;
                if (q50Var != null) {
                    q50Var.b(0L, 0, true, 0, 0);
                    f60Var.m0 = null;
                }
                if (f60Var.f26328s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (f60Var.f26329t0 != null) {
                    CameraController.getInstance().close(f60Var.f26329t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((rg0) this.f14863b).V.f34063w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                v11 v11Var = (v11) this.f14863b;
                t11 t11Var = v11Var.f31506a;
                if (t11Var != null) {
                    t11Var.i();
                    v11Var.f31506a = null;
                }
                Runnable runnable = v11Var.d;
                if (runnable != null) {
                    v11Var.d = null;
                    v11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                z91 z91Var = (z91) this.f14863b;
                TextureView textureView = z91Var.d;
                if (z91Var.S) {
                    if (z91Var.W) {
                        z91Var.f33463r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    z91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f14863b).f48384f;
                if (eVar != null) {
                    eVar.f48368a = false;
                    ((vh.f) this.f14863b).f48384f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f14862a) {
            case 0:
                i iVar = (i) this.f14863b;
                m mVar = iVar.f14909j;
                mVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                iVar.G();
                return;
            case 1:
                q50 q50Var = ((f60) this.f14863b).m0;
                if (q50Var != null) {
                    q50Var.F = i10;
                    q50Var.G = i11;
                    q50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                t11 t11Var = ((v11) this.f14863b).f31506a;
                if (t11Var != null && (handler = t11Var.getHandler()) != null && t11Var.f30929b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f14863b).f48384f;
                if (eVar != null) {
                    synchronized (eVar.f48371e) {
                        eVar.f48372f = true;
                        eVar.h = i10;
                        eVar.f48373n = i11;
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
        switch (this.f14862a) {
            case 0:
                if (((i) this.f14863b).X) {
                    ((i) this.f14863b).X = false;
                    ((i) this.f14863b).f14909j.b("camera switch first preview frame");
                    s0 s0Var = (s0) ((i) this.f14863b).f14911k.f12544b;
                    Handler handler = s0Var.f15050i;
                    l2.g gVar = s0Var.d;
                    Objects.requireNonNull(gVar);
                    handler.post(new i2.h0(gVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                i iVar = (i) this.f14863b;
                if (iVar.f14910j0 == 0) {
                    iVar.f14910j0 = elapsedRealtimeNanos;
                    m mVar = iVar.f14909j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((i) this.f14863b).f14897c.getWidth());
                    sb2.append("x");
                    sb2.append(((i) this.f14863b).f14897c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((i) this.f14863b).f14922q);
                    sb2.append(", attached=");
                    sb2.append(((i) this.f14863b).f14897c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((i) this.f14863b).f14897c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((i) this.f14863b).f14897c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((i) this.f14863b).f14897c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((i) this.f14863b).f14897c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((i) this.f14863b).f14897c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    mVar.b(sb2.toString());
                }
                i iVar2 = (i) this.f14863b;
                long j11 = iVar2.f14914l0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    iVar2.f14917n0++;
                    iVar2.f14919o0 += j12;
                    j3 = 0;
                    double d = j12;
                    iVar2.f14921p0 = (d * d) + iVar2.f14921p0;
                    long j13 = iVar2.f14923q0;
                    if (j13 == 0 || j12 < j13) {
                        iVar2.f14923q0 = j12;
                    }
                    iVar2.f14925r0 = Math.max(iVar2.f14925r0, j12);
                    if (j12 > 50000000) {
                        iVar2.f14927s0++;
                    }
                    if (j12 > 100000000) {
                        iVar2.f14929t0++;
                    }
                } else {
                    j3 = 0;
                }
                i iVar3 = (i) this.f14863b;
                iVar3.f14914l0 = elapsedRealtimeNanos;
                long j14 = iVar3.m0;
                if (timestamp > j14) {
                    if (iVar3.f14932v0 == j3) {
                        iVar3.f14932v0 = timestamp;
                    }
                    iVar3.f14934w0 = timestamp;
                    iVar3.f14931u0++;
                } else if (j14 != j3) {
                    iVar3.f14936x0++;
                }
                iVar3.m0 = timestamp;
                iVar3.f14912k0++;
                if (elapsedRealtimeNanos - iVar3.f14910j0 >= 5000000000L) {
                    TextureView textureView = iVar3.f14897c;
                    long j15 = iVar3.f14934w0 - iVar3.f14932v0;
                    if (j15 > j3) {
                        long j16 = iVar3.f14931u0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            iVar3.f14909j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f14912k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f14919o0, iVar3.f14917n0) + ", min=" + (((float) iVar3.f14923q0) / 1000000.0f) + ", max=" + (((float) iVar3.f14925r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f14921p0, iVar3.f14919o0, iVar3.f14917n0) + "}, gaps={over50ms=" + iVar3.f14927s0 + ", over100ms=" + iVar3.f14929t0 + "}, nonMonotonicTimestamps=" + iVar3.f14936x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            iVar3.v();
                            iVar3.f14910j0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    iVar3.f14909j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f14912k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f14919o0, iVar3.f14917n0) + ", min=" + (((float) iVar3.f14923q0) / 1000000.0f) + ", max=" + (((float) iVar3.f14925r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f14921p0, iVar3.f14919o0, iVar3.f14917n0) + "}, gaps={over50ms=" + iVar3.f14927s0 + ", over100ms=" + iVar3.f14929t0 + "}, nonMonotonicTimestamps=" + iVar3.f14936x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    iVar3.v();
                    iVar3.f14910j0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                z91 z91Var = (z91) this.f14863b;
                if (z91Var.f33463r == 1) {
                    z91Var.f33462n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    z91Var.f33462n.invalidate();
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
