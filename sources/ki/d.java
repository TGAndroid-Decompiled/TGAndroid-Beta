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
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.rg0;
public final class d implements TextureView.SurfaceTextureListener {
    public final int f13672a;
    public final Object f13673b;

    public d(Object obj, int i10) {
        this.f13672a = i10;
        this.f13673b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f13672a) {
            case 0:
                i iVar = (i) this.f13673b;
                m mVar = iVar.f13715j;
                mVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = iVar.f13722n;
                if (iVar.S && handler != null && iVar.f13704c.isAvailable()) {
                    handler.post(new a(iVar, 5));
                    return;
                }
                return;
            case 1:
                e60 e60Var = (e60) this.f13673b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (e60Var.m0 == null && surfaceTexture != null && !e60Var.f23916l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    e60Var.m0 = new p50(e60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final m11 m11Var = (m11) this.f13673b;
                ArrayList arrayList = m11Var.f26286c;
                k11 k11Var = m11Var.f26284a;
                if (k11Var != null) {
                    k11Var.i();
                    m11Var.f26284a = null;
                }
                k11 k11Var2 = new k11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                m11Var.invalidate();
                                return;
                            default:
                                m11 m11Var2 = m11Var;
                                Runnable runnable = m11Var2.d;
                                if (runnable != null) {
                                    m11Var2.e = true;
                                    m11Var2.d = null;
                                    m11.b(runnable);
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
                                m11Var.invalidate();
                                return;
                            default:
                                m11 m11Var2 = m11Var;
                                Runnable runnable = m11Var2.d;
                                if (runnable != null) {
                                    m11Var2.e = true;
                                    m11Var2.d = null;
                                    m11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                m11Var.f26284a = k11Var2;
                k11Var2.f25596a = EmuDetector.with(m11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        l11 l11Var = (l11) arrayList.get(i12);
                        Bitmap bitmap = l11Var.e;
                        if (bitmap != null) {
                            m11Var.f26284a.c(l11Var.f25910f, bitmap, l11Var.f25909c, l11Var.d);
                        } else {
                            ArrayList arrayList2 = l11Var.f25908b;
                            if (arrayList2 != null) {
                                m11Var.f26284a.f(arrayList2, l11Var.d);
                            } else {
                                m11Var.f26284a.e(l11Var.f25907a, l11Var.f25911g, l11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(m11Var.f26285b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f13673b;
                if (fVar.f44723f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f44723f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f13672a) {
            case 0:
                m mVar = ((i) this.f13673b).f13715j;
                mVar.b("preview surface destroyed: active=" + ((i) this.f13673b).S);
                if (((i) this.f13673b).S) {
                    ((i) this.f13673b).t(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                e60 e60Var = (e60) this.f13673b;
                Camera2Session[] camera2SessionArr = e60Var.f23928v0;
                p50 p50Var = e60Var.m0;
                if (p50Var != null) {
                    p50Var.b(0L, 0, true, 0, 0);
                    e60Var.m0 = null;
                }
                if (e60Var.f23925s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (e60Var.f23926t0 != null) {
                    CameraController.getInstance().close(e60Var.f23926t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((rg0) this.f13673b).V.f31387w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                m11 m11Var = (m11) this.f13673b;
                k11 k11Var = m11Var.f26284a;
                if (k11Var != null) {
                    k11Var.i();
                    m11Var.f26284a = null;
                }
                Runnable runnable = m11Var.d;
                if (runnable != null) {
                    m11Var.d = null;
                    m11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                q91 q91Var = (q91) this.f13673b;
                TextureView textureView = q91Var.d;
                if (q91Var.S) {
                    if (q91Var.W) {
                        q91Var.f27667r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    q91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f13673b).f44723f;
                if (eVar != null) {
                    eVar.f44709a = false;
                    ((vh.f) this.f13673b).f44723f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f13672a) {
            case 0:
                i iVar = (i) this.f13673b;
                m mVar = iVar.f13715j;
                mVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                iVar.G();
                return;
            case 1:
                p50 p50Var = ((e60) this.f13673b).m0;
                if (p50Var != null) {
                    p50Var.F = i10;
                    p50Var.G = i11;
                    p50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                k11 k11Var = ((m11) this.f13673b).f26284a;
                if (k11Var != null && (handler = k11Var.getHandler()) != null && k11Var.f25597b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f13673b).f44723f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f44712f = true;
                        eVar.h = i10;
                        eVar.f44713n = i11;
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
        switch (this.f13672a) {
            case 0:
                if (((i) this.f13673b).X) {
                    ((i) this.f13673b).X = false;
                    ((i) this.f13673b).f13715j.b("camera switch first preview frame");
                    s0 s0Var = (s0) ((i) this.f13673b).f13717k.f13371a;
                    Handler handler = s0Var.h;
                    ka.c cVar = s0Var.f13846c;
                    Objects.requireNonNull(cVar);
                    handler.post(new i2.h0(cVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                i iVar = (i) this.f13673b;
                if (iVar.f13716j0 == 0) {
                    iVar.f13716j0 = elapsedRealtimeNanos;
                    m mVar = iVar.f13715j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((i) this.f13673b).f13704c.getWidth());
                    sb2.append("x");
                    sb2.append(((i) this.f13673b).f13704c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((i) this.f13673b).f13728q);
                    sb2.append(", attached=");
                    sb2.append(((i) this.f13673b).f13704c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((i) this.f13673b).f13704c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((i) this.f13673b).f13704c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((i) this.f13673b).f13704c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((i) this.f13673b).f13704c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((i) this.f13673b).f13704c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    mVar.b(sb2.toString());
                }
                i iVar2 = (i) this.f13673b;
                long j11 = iVar2.f13720l0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    iVar2.f13723n0++;
                    iVar2.f13725o0 += j12;
                    j3 = 0;
                    double d = j12;
                    iVar2.f13727p0 = (d * d) + iVar2.f13727p0;
                    long j13 = iVar2.f13729q0;
                    if (j13 == 0 || j12 < j13) {
                        iVar2.f13729q0 = j12;
                    }
                    iVar2.f13731r0 = Math.max(iVar2.f13731r0, j12);
                    if (j12 > 50000000) {
                        iVar2.f13733s0++;
                    }
                    if (j12 > 100000000) {
                        iVar2.f13735t0++;
                    }
                } else {
                    j3 = 0;
                }
                i iVar3 = (i) this.f13673b;
                iVar3.f13720l0 = elapsedRealtimeNanos;
                long j14 = iVar3.m0;
                if (timestamp > j14) {
                    if (iVar3.f13738v0 == j3) {
                        iVar3.f13738v0 = timestamp;
                    }
                    iVar3.f13740w0 = timestamp;
                    iVar3.f13737u0++;
                } else if (j14 != j3) {
                    iVar3.f13742x0++;
                }
                iVar3.m0 = timestamp;
                iVar3.f13718k0++;
                if (elapsedRealtimeNanos - iVar3.f13716j0 >= 5000000000L) {
                    TextureView textureView = iVar3.f13704c;
                    long j15 = iVar3.f13740w0 - iVar3.f13738v0;
                    if (j15 > j3) {
                        long j16 = iVar3.f13737u0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            iVar3.f13715j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f13718k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f13725o0, iVar3.f13723n0) + ", min=" + (((float) iVar3.f13729q0) / 1000000.0f) + ", max=" + (((float) iVar3.f13731r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f13727p0, iVar3.f13725o0, iVar3.f13723n0) + "}, gaps={over50ms=" + iVar3.f13733s0 + ", over100ms=" + iVar3.f13735t0 + "}, nonMonotonicTimestamps=" + iVar3.f13742x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            iVar3.v();
                            iVar3.f13716j0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    iVar3.f13715j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f13718k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f13725o0, iVar3.f13723n0) + ", min=" + (((float) iVar3.f13729q0) / 1000000.0f) + ", max=" + (((float) iVar3.f13731r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f13727p0, iVar3.f13725o0, iVar3.f13723n0) + "}, gaps={over50ms=" + iVar3.f13733s0 + ", over100ms=" + iVar3.f13735t0 + "}, nonMonotonicTimestamps=" + iVar3.f13742x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    iVar3.v();
                    iVar3.f13716j0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                q91 q91Var = (q91) this.f13673b;
                if (q91Var.f27667r == 1) {
                    q91Var.f27666n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    q91Var.f27666n.invalidate();
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
