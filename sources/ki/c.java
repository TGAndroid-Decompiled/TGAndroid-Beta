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
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.x50;
public final class c implements TextureView.SurfaceTextureListener {
    public final int f13659a;
    public final Object f13660b;

    public c(Object obj, int i10) {
        this.f13659a = i10;
        this.f13660b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f13659a) {
            case 0:
                h hVar = (h) this.f13660b;
                k kVar = hVar.f13704j;
                kVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = hVar.f13711n;
                if (hVar.R && handler != null && hVar.f13693c.isAvailable()) {
                    handler.post(new b(hVar, 4));
                    return;
                }
                return;
            case 1:
                c60 c60Var = (c60) this.f13660b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (c60Var.m0 == null && surfaceTexture != null && !c60Var.f23241l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    c60Var.m0 = new m50(c60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final n11 n11Var = (n11) this.f13660b;
                ArrayList arrayList = n11Var.f26595c;
                l11 l11Var = n11Var.f26593a;
                if (l11Var != null) {
                    l11Var.i();
                    n11Var.f26593a = null;
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
                n11Var.f26593a = l11Var2;
                l11Var2.f25949a = EmuDetector.with(n11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        m11 m11Var = (m11) arrayList.get(i12);
                        Bitmap bitmap = m11Var.e;
                        if (bitmap != null) {
                            n11Var.f26593a.c(m11Var.f26281f, bitmap, m11Var.f26280c, m11Var.d);
                        } else {
                            ArrayList arrayList2 = m11Var.f26279b;
                            if (arrayList2 != null) {
                                n11Var.f26593a.f(arrayList2, m11Var.d);
                            } else {
                                n11Var.f26593a.e(m11Var.f26278a, m11Var.f26282g, m11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(n11Var.f26594b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f13660b;
                if (fVar.f44715f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f44715f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f13659a) {
            case 0:
                h hVar = (h) this.f13660b;
                k kVar = hVar.f13704j;
                kVar.b("preview surface destroyed: active=" + hVar.R);
                if (hVar.R) {
                    hVar.u(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                c60 c60Var = (c60) this.f13660b;
                Camera2Session[] camera2SessionArr = c60Var.f23253v0;
                m50 m50Var = c60Var.m0;
                if (m50Var != null) {
                    m50Var.b(0L, 0, true, 0, 0);
                    c60Var.m0 = null;
                }
                if (c60Var.f23250s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (c60Var.f23251t0 != null) {
                    CameraController.getInstance().close(c60Var.f23251t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((rg0) this.f13660b).V.f31404w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                n11 n11Var = (n11) this.f13660b;
                l11 l11Var = n11Var.f26593a;
                if (l11Var != null) {
                    l11Var.i();
                    n11Var.f26593a = null;
                }
                Runnable runnable = n11Var.d;
                if (runnable != null) {
                    n11Var.d = null;
                    n11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                r91 r91Var = (r91) this.f13660b;
                TextureView textureView = r91Var.d;
                if (r91Var.S) {
                    if (r91Var.W) {
                        r91Var.f27906r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    r91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f13660b).f44715f;
                if (eVar != null) {
                    eVar.f44701a = false;
                    ((vh.f) this.f13660b).f44715f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f13659a) {
            case 0:
                h hVar = (h) this.f13660b;
                k kVar = hVar.f13704j;
                kVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                hVar.H();
                return;
            case 1:
                m50 m50Var = ((c60) this.f13660b).m0;
                if (m50Var != null) {
                    m50Var.F = i10;
                    m50Var.G = i11;
                    m50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                l11 l11Var = ((n11) this.f13660b).f26593a;
                if (l11Var != null && (handler = l11Var.getHandler()) != null && l11Var.f25950b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f13660b).f44715f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f44704f = true;
                        eVar.h = i10;
                        eVar.f44705n = i11;
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
        switch (this.f13659a) {
            case 0:
                if (((h) this.f13660b).W) {
                    ((h) this.f13660b).W = false;
                    ((h) this.f13660b).f13704j.b("camera switch first preview frame");
                    q0 q0Var = (q0) ((h) this.f13660b).f13706k.f13672b;
                    Handler handler = q0Var.h;
                    x50 x50Var = q0Var.f13830c;
                    Objects.requireNonNull(x50Var);
                    handler.post(new i2.g0(x50Var, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                h hVar = (h) this.f13660b;
                if (hVar.f13701h0 == 0) {
                    hVar.f13701h0 = elapsedRealtimeNanos;
                    k kVar = hVar.f13704j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((h) this.f13660b).f13693c.getWidth());
                    sb2.append("x");
                    sb2.append(((h) this.f13660b).f13693c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((h) this.f13660b).f13717q);
                    sb2.append(", attached=");
                    sb2.append(((h) this.f13660b).f13693c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((h) this.f13660b).f13693c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((h) this.f13660b).f13693c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((h) this.f13660b).f13693c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((h) this.f13660b).f13693c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((h) this.f13660b).f13693c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    kVar.b(sb2.toString());
                }
                h hVar2 = (h) this.f13660b;
                long j11 = hVar2.f13705j0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    hVar2.f13709l0++;
                    hVar2.m0 += j12;
                    j3 = 0;
                    double d = j12;
                    hVar2.f13712n0 = (d * d) + hVar2.f13712n0;
                    long j13 = hVar2.f13714o0;
                    if (j13 == 0 || j12 < j13) {
                        hVar2.f13714o0 = j12;
                    }
                    hVar2.f13716p0 = Math.max(hVar2.f13716p0, j12);
                    if (j12 > 50000000) {
                        hVar2.f13718q0++;
                    }
                    if (j12 > 100000000) {
                        hVar2.f13720r0++;
                    }
                } else {
                    j3 = 0;
                }
                h hVar3 = (h) this.f13660b;
                hVar3.f13705j0 = elapsedRealtimeNanos;
                long j14 = hVar3.f13707k0;
                if (timestamp > j14) {
                    if (hVar3.f13724t0 == j3) {
                        hVar3.f13724t0 = timestamp;
                    }
                    hVar3.f13726u0 = timestamp;
                    hVar3.f13722s0++;
                } else if (j14 != j3) {
                    hVar3.f13727v0++;
                }
                hVar3.f13707k0 = timestamp;
                hVar3.f13703i0++;
                if (elapsedRealtimeNanos - hVar3.f13701h0 >= 5000000000L) {
                    TextureView textureView = hVar3.f13693c;
                    long j15 = hVar3.f13726u0 - hVar3.f13724t0;
                    if (j15 > j3) {
                        long j16 = hVar3.f13722s0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            hVar3.f13704j.b("preview frame delivery: callbackFps=" + ((((float) hVar3.f13703i0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + h.c(hVar3.m0, hVar3.f13709l0) + ", min=" + (((float) hVar3.f13714o0) / 1000000.0f) + ", max=" + (((float) hVar3.f13716p0) / 1000000.0f) + ", jitter=" + h.C(hVar3.f13712n0, hVar3.m0, hVar3.f13709l0) + "}, gaps={over50ms=" + hVar3.f13718q0 + ", over100ms=" + hVar3.f13720r0 + "}, nonMonotonicTimestamps=" + hVar3.f13727v0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            hVar3.w();
                            hVar3.f13701h0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    hVar3.f13704j.b("preview frame delivery: callbackFps=" + ((((float) hVar3.f13703i0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + h.c(hVar3.m0, hVar3.f13709l0) + ", min=" + (((float) hVar3.f13714o0) / 1000000.0f) + ", max=" + (((float) hVar3.f13716p0) / 1000000.0f) + ", jitter=" + h.C(hVar3.f13712n0, hVar3.m0, hVar3.f13709l0) + "}, gaps={over50ms=" + hVar3.f13718q0 + ", over100ms=" + hVar3.f13720r0 + "}, nonMonotonicTimestamps=" + hVar3.f13727v0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    hVar3.w();
                    hVar3.f13701h0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                r91 r91Var = (r91) this.f13660b;
                if (r91Var.f27906r == 1) {
                    r91Var.f27905n.getViewTreeObserver().addOnPreDrawListener(new ga(this, 4));
                    r91Var.f27905n.invalidate();
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
