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
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.rg0;
public final class d implements TextureView.SurfaceTextureListener {
    public final int f13685a;
    public final Object f13686b;

    public d(Object obj, int i10) {
        this.f13685a = i10;
        this.f13686b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f13685a) {
            case 0:
                i iVar = (i) this.f13686b;
                m mVar = iVar.f13728j;
                mVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = iVar.f13735n;
                if (iVar.S && handler != null && iVar.f13717c.isAvailable()) {
                    handler.post(new a(iVar, 5));
                    return;
                }
                return;
            case 1:
                f60 f60Var = (f60) this.f13686b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (f60Var.m0 == null && surfaceTexture != null && !f60Var.f24200l0) {
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
                final n11 n11Var = (n11) this.f13686b;
                ArrayList arrayList = n11Var.f26525c;
                l11 l11Var = n11Var.f26523a;
                if (l11Var != null) {
                    l11Var.i();
                    n11Var.f26523a = null;
                }
                l11 l11Var2 = new l11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                n11Var.invalidate();
                                return;
                            default:
                                n11 n11Var2 = n11Var;
                                Runnable runnable = n11Var2.d;
                                if (runnable != null) {
                                    n11Var2.e = true;
                                    n11Var2.d = null;
                                    n11.b(runnable);
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
                                n11Var.invalidate();
                                return;
                            default:
                                n11 n11Var2 = n11Var;
                                Runnable runnable = n11Var2.d;
                                if (runnable != null) {
                                    n11Var2.e = true;
                                    n11Var2.d = null;
                                    n11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                n11Var.f26523a = l11Var2;
                l11Var2.f25877a = EmuDetector.with(n11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        m11 m11Var = (m11) arrayList.get(i12);
                        Bitmap bitmap = m11Var.e;
                        if (bitmap != null) {
                            n11Var.f26523a.c(m11Var.f26174f, bitmap, m11Var.f26173c, m11Var.d);
                        } else {
                            ArrayList arrayList2 = m11Var.f26172b;
                            if (arrayList2 != null) {
                                n11Var.f26523a.f(arrayList2, m11Var.d);
                            } else {
                                n11Var.f26523a.e(m11Var.f26171a, m11Var.f26175g, m11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(n11Var.f26524b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f13686b;
                if (fVar.f44785f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f44785f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f13685a) {
            case 0:
                m mVar = ((i) this.f13686b).f13728j;
                mVar.b("preview surface destroyed: active=" + ((i) this.f13686b).S);
                if (((i) this.f13686b).S) {
                    ((i) this.f13686b).t(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                f60 f60Var = (f60) this.f13686b;
                Camera2Session[] camera2SessionArr = f60Var.f24212v0;
                q50 q50Var = f60Var.m0;
                if (q50Var != null) {
                    q50Var.b(0L, 0, true, 0, 0);
                    f60Var.m0 = null;
                }
                if (f60Var.f24209s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (f60Var.f24210t0 != null) {
                    CameraController.getInstance().close(f60Var.f24210t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((rg0) this.f13686b).V.f31459w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                n11 n11Var = (n11) this.f13686b;
                l11 l11Var = n11Var.f26523a;
                if (l11Var != null) {
                    l11Var.i();
                    n11Var.f26523a = null;
                }
                Runnable runnable = n11Var.d;
                if (runnable != null) {
                    n11Var.d = null;
                    n11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                r91 r91Var = (r91) this.f13686b;
                TextureView textureView = r91Var.d;
                if (r91Var.S) {
                    if (r91Var.W) {
                        r91Var.f27921r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    r91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f13686b).f44785f;
                if (eVar != null) {
                    eVar.f44771a = false;
                    ((vh.f) this.f13686b).f44785f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f13685a) {
            case 0:
                i iVar = (i) this.f13686b;
                m mVar = iVar.f13728j;
                mVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                iVar.G();
                return;
            case 1:
                q50 q50Var = ((f60) this.f13686b).m0;
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
                l11 l11Var = ((n11) this.f13686b).f26523a;
                if (l11Var != null && (handler = l11Var.getHandler()) != null && l11Var.f25878b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f13686b).f44785f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f44774f = true;
                        eVar.h = i10;
                        eVar.f44775n = i11;
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
        switch (this.f13685a) {
            case 0:
                if (((i) this.f13686b).X) {
                    ((i) this.f13686b).X = false;
                    ((i) this.f13686b).f13728j.b("camera switch first preview frame");
                    s0 s0Var = (s0) ((i) this.f13686b).f13730k.f13384b;
                    Handler handler = s0Var.f13863i;
                    l.d dVar = s0Var.d;
                    Objects.requireNonNull(dVar);
                    handler.post(new i2.h0(dVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                i iVar = (i) this.f13686b;
                if (iVar.f13729j0 == 0) {
                    iVar.f13729j0 = elapsedRealtimeNanos;
                    m mVar = iVar.f13728j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((i) this.f13686b).f13717c.getWidth());
                    sb2.append("x");
                    sb2.append(((i) this.f13686b).f13717c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((i) this.f13686b).f13741q);
                    sb2.append(", attached=");
                    sb2.append(((i) this.f13686b).f13717c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((i) this.f13686b).f13717c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((i) this.f13686b).f13717c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((i) this.f13686b).f13717c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((i) this.f13686b).f13717c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((i) this.f13686b).f13717c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    mVar.b(sb2.toString());
                }
                i iVar2 = (i) this.f13686b;
                long j11 = iVar2.f13733l0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    iVar2.f13736n0++;
                    iVar2.f13738o0 += j12;
                    j3 = 0;
                    double d = j12;
                    iVar2.f13740p0 = (d * d) + iVar2.f13740p0;
                    long j13 = iVar2.f13742q0;
                    if (j13 == 0 || j12 < j13) {
                        iVar2.f13742q0 = j12;
                    }
                    iVar2.f13744r0 = Math.max(iVar2.f13744r0, j12);
                    if (j12 > 50000000) {
                        iVar2.f13746s0++;
                    }
                    if (j12 > 100000000) {
                        iVar2.f13748t0++;
                    }
                } else {
                    j3 = 0;
                }
                i iVar3 = (i) this.f13686b;
                iVar3.f13733l0 = elapsedRealtimeNanos;
                long j14 = iVar3.m0;
                if (timestamp > j14) {
                    if (iVar3.f13751v0 == j3) {
                        iVar3.f13751v0 = timestamp;
                    }
                    iVar3.f13753w0 = timestamp;
                    iVar3.f13750u0++;
                } else if (j14 != j3) {
                    iVar3.f13755x0++;
                }
                iVar3.m0 = timestamp;
                iVar3.f13731k0++;
                if (elapsedRealtimeNanos - iVar3.f13729j0 >= 5000000000L) {
                    TextureView textureView = iVar3.f13717c;
                    long j15 = iVar3.f13753w0 - iVar3.f13751v0;
                    if (j15 > j3) {
                        long j16 = iVar3.f13750u0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            iVar3.f13728j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f13731k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f13738o0, iVar3.f13736n0) + ", min=" + (((float) iVar3.f13742q0) / 1000000.0f) + ", max=" + (((float) iVar3.f13744r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f13740p0, iVar3.f13738o0, iVar3.f13736n0) + "}, gaps={over50ms=" + iVar3.f13746s0 + ", over100ms=" + iVar3.f13748t0 + "}, nonMonotonicTimestamps=" + iVar3.f13755x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            iVar3.v();
                            iVar3.f13729j0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    iVar3.f13728j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f13731k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f13738o0, iVar3.f13736n0) + ", min=" + (((float) iVar3.f13742q0) / 1000000.0f) + ", max=" + (((float) iVar3.f13744r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f13740p0, iVar3.f13738o0, iVar3.f13736n0) + "}, gaps={over50ms=" + iVar3.f13746s0 + ", over100ms=" + iVar3.f13748t0 + "}, nonMonotonicTimestamps=" + iVar3.f13755x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    iVar3.v();
                    iVar3.f13729j0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                r91 r91Var = (r91) this.f13686b;
                if (r91Var.f27921r == 1) {
                    r91Var.f27920n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    r91Var.f27920n.invalidate();
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
