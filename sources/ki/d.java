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
    public final int f14861a;
    public final Object f14862b;

    public d(Object obj, int i10) {
        this.f14861a = i10;
        this.f14862b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f14861a) {
            case 0:
                i iVar = (i) this.f14862b;
                m mVar = iVar.f14908j;
                mVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = iVar.f14915n;
                if (iVar.S && handler != null && iVar.f14896c.isAvailable()) {
                    handler.post(new a(iVar, 5));
                    return;
                }
                return;
            case 1:
                f60 f60Var = (f60) this.f14862b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (f60Var.m0 == null && surfaceTexture != null && !f60Var.f26313l0) {
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
                final v11 v11Var = (v11) this.f14862b;
                ArrayList arrayList = v11Var.f31501c;
                t11 t11Var = v11Var.f31499a;
                if (t11Var != null) {
                    t11Var.i();
                    v11Var.f31499a = null;
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
                                    v11Var2.f31502e = true;
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
                                    v11Var2.f31502e = true;
                                    v11Var2.d = null;
                                    v11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                v11Var.f31499a = t11Var2;
                t11Var2.f30921a = EmuDetector.with(v11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        u11 u11Var = (u11) arrayList.get(i12);
                        Bitmap bitmap = u11Var.f31241e;
                        if (bitmap != null) {
                            v11Var.f31499a.c(u11Var.f31242f, bitmap, u11Var.f31240c, u11Var.d);
                        } else {
                            ArrayList arrayList2 = u11Var.f31239b;
                            if (arrayList2 != null) {
                                v11Var.f31499a.f(arrayList2, u11Var.d);
                            } else {
                                v11Var.f31499a.e(u11Var.f31238a, u11Var.f31243g, u11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(v11Var.f31500b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f14862b;
                if (fVar.f48375f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f48375f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f14861a) {
            case 0:
                m mVar = ((i) this.f14862b).f14908j;
                mVar.b("preview surface destroyed: active=" + ((i) this.f14862b).S);
                if (((i) this.f14862b).S) {
                    ((i) this.f14862b).t(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                f60 f60Var = (f60) this.f14862b;
                Camera2Session[] camera2SessionArr = f60Var.f26325v0;
                q50 q50Var = f60Var.m0;
                if (q50Var != null) {
                    q50Var.b(0L, 0, true, 0, 0);
                    f60Var.m0 = null;
                }
                if (f60Var.f26322s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (f60Var.f26323t0 != null) {
                    CameraController.getInstance().close(f60Var.f26323t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((rg0) this.f14862b).V.f34056w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                v11 v11Var = (v11) this.f14862b;
                t11 t11Var = v11Var.f31499a;
                if (t11Var != null) {
                    t11Var.i();
                    v11Var.f31499a = null;
                }
                Runnable runnable = v11Var.d;
                if (runnable != null) {
                    v11Var.d = null;
                    v11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                z91 z91Var = (z91) this.f14862b;
                TextureView textureView = z91Var.d;
                if (z91Var.S) {
                    if (z91Var.W) {
                        z91Var.f33456r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    z91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f14862b).f48375f;
                if (eVar != null) {
                    eVar.f48359a = false;
                    ((vh.f) this.f14862b).f48375f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f14861a) {
            case 0:
                i iVar = (i) this.f14862b;
                m mVar = iVar.f14908j;
                mVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                iVar.G();
                return;
            case 1:
                q50 q50Var = ((f60) this.f14862b).m0;
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
                t11 t11Var = ((v11) this.f14862b).f31499a;
                if (t11Var != null && (handler = t11Var.getHandler()) != null && t11Var.f30922b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f14862b).f48375f;
                if (eVar != null) {
                    synchronized (eVar.f48362e) {
                        eVar.f48363f = true;
                        eVar.h = i10;
                        eVar.f48364n = i11;
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
        switch (this.f14861a) {
            case 0:
                if (((i) this.f14862b).X) {
                    ((i) this.f14862b).X = false;
                    ((i) this.f14862b).f14908j.b("camera switch first preview frame");
                    s0 s0Var = (s0) ((i) this.f14862b).f14910k.f12543b;
                    Handler handler = s0Var.f15049i;
                    l2.g gVar = s0Var.d;
                    Objects.requireNonNull(gVar);
                    handler.post(new i2.h0(gVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                i iVar = (i) this.f14862b;
                if (iVar.f14909j0 == 0) {
                    iVar.f14909j0 = elapsedRealtimeNanos;
                    m mVar = iVar.f14908j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((i) this.f14862b).f14896c.getWidth());
                    sb2.append("x");
                    sb2.append(((i) this.f14862b).f14896c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((i) this.f14862b).f14921q);
                    sb2.append(", attached=");
                    sb2.append(((i) this.f14862b).f14896c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((i) this.f14862b).f14896c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((i) this.f14862b).f14896c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((i) this.f14862b).f14896c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((i) this.f14862b).f14896c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((i) this.f14862b).f14896c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    mVar.b(sb2.toString());
                }
                i iVar2 = (i) this.f14862b;
                long j11 = iVar2.f14913l0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    iVar2.f14916n0++;
                    iVar2.f14918o0 += j12;
                    j3 = 0;
                    double d = j12;
                    iVar2.f14920p0 = (d * d) + iVar2.f14920p0;
                    long j13 = iVar2.f14922q0;
                    if (j13 == 0 || j12 < j13) {
                        iVar2.f14922q0 = j12;
                    }
                    iVar2.f14924r0 = Math.max(iVar2.f14924r0, j12);
                    if (j12 > 50000000) {
                        iVar2.f14926s0++;
                    }
                    if (j12 > 100000000) {
                        iVar2.f14928t0++;
                    }
                } else {
                    j3 = 0;
                }
                i iVar3 = (i) this.f14862b;
                iVar3.f14913l0 = elapsedRealtimeNanos;
                long j14 = iVar3.m0;
                if (timestamp > j14) {
                    if (iVar3.f14931v0 == j3) {
                        iVar3.f14931v0 = timestamp;
                    }
                    iVar3.f14933w0 = timestamp;
                    iVar3.f14930u0++;
                } else if (j14 != j3) {
                    iVar3.f14935x0++;
                }
                iVar3.m0 = timestamp;
                iVar3.f14911k0++;
                if (elapsedRealtimeNanos - iVar3.f14909j0 >= 5000000000L) {
                    TextureView textureView = iVar3.f14896c;
                    long j15 = iVar3.f14933w0 - iVar3.f14931v0;
                    if (j15 > j3) {
                        long j16 = iVar3.f14930u0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            iVar3.f14908j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f14911k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f14918o0, iVar3.f14916n0) + ", min=" + (((float) iVar3.f14922q0) / 1000000.0f) + ", max=" + (((float) iVar3.f14924r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f14920p0, iVar3.f14918o0, iVar3.f14916n0) + "}, gaps={over50ms=" + iVar3.f14926s0 + ", over100ms=" + iVar3.f14928t0 + "}, nonMonotonicTimestamps=" + iVar3.f14935x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            iVar3.v();
                            iVar3.f14909j0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    iVar3.f14908j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f14911k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f14918o0, iVar3.f14916n0) + ", min=" + (((float) iVar3.f14922q0) / 1000000.0f) + ", max=" + (((float) iVar3.f14924r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f14920p0, iVar3.f14918o0, iVar3.f14916n0) + "}, gaps={over50ms=" + iVar3.f14926s0 + ", over100ms=" + iVar3.f14928t0 + "}, nonMonotonicTimestamps=" + iVar3.f14935x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    iVar3.v();
                    iVar3.f14909j0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                z91 z91Var = (z91) this.f14862b;
                if (z91Var.f33456r == 1) {
                    z91Var.f33455n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    z91Var.f33455n.invalidate();
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
