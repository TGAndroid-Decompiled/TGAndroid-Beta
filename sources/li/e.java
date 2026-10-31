package li;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.f8;
import org.telegram.messenger.o6;
import org.telegram.messenger.v2;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.r40;
public final class e implements TextureView.SurfaceTextureListener {
    public final int f12040a;
    public final Object f12041b;

    public e(Object obj, int i10) {
        this.f12040a = i10;
        this.f12041b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f12040a) {
            case 0:
                l lVar = (l) this.f12041b;
                p pVar = lVar.f12129j;
                pVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = lVar.f12139n;
                if (lVar.V && handler != null && lVar.f12111c.isAvailable()) {
                    handler.post(new a(lVar, 7));
                    return;
                }
                return;
            case 1:
                nh.h hVar = (nh.h) this.f12041b;
                if (hVar.f13832f == null) {
                    nh.g gVar = new nh.g(hVar, surfaceTexture, i10, i11, new nh.e(hVar, 1));
                    hVar.f13832f = gVar;
                    gVar.start();
                    return;
                }
                return;
            case 2:
                e50 e50Var = (e50) this.f12041b;
                if (v2.f18448a) {
                    f8.b("InstantCamera camera surface available");
                }
                if (e50Var.f25669l0 == null && surfaceTexture != null && !e50Var.f25667k0) {
                    if (v2.f18448a) {
                        f8.b("InstantCamera start create thread");
                    }
                    e50Var.f25669l0 = new r40(e50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                final h01 h01Var = (h01) this.f12041b;
                ArrayList arrayList = h01Var.f26576c;
                f01 f01Var = h01Var.f26574a;
                if (f01Var != null) {
                    f01Var.h();
                    h01Var.f26574a = null;
                }
                f01 f01Var2 = new f01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                h01Var.invalidate();
                                return;
                            default:
                                h01 h01Var2 = h01Var;
                                Runnable runnable = h01Var2.d;
                                if (runnable != null) {
                                    h01Var2.e = true;
                                    h01Var2.d = null;
                                    h01.b(runnable);
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
                                h01Var.invalidate();
                                return;
                            default:
                                h01 h01Var2 = h01Var;
                                Runnable runnable = h01Var2.d;
                                if (runnable != null) {
                                    h01Var2.e = true;
                                    h01Var2.d = null;
                                    h01.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                h01Var.f26574a = f01Var2;
                f01Var2.f25915a = o6.h(h01Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        g01 g01Var = (g01) arrayList.get(i12);
                        Bitmap bitmap = g01Var.e;
                        if (bitmap != null) {
                            h01Var.f26574a.c(g01Var.f26209f, bitmap, g01Var.f26208c, g01Var.d);
                        } else {
                            ArrayList arrayList2 = g01Var.f26207b;
                            if (arrayList2 != null) {
                                h01Var.f26574a.d(arrayList2, g01Var.d);
                            } else {
                                h01Var.f26574a.b(g01Var.f26210g, g01Var.f26206a, g01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(h01Var.f26575b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f12040a) {
            case 0:
                ((l) this.f12041b).f12129j.b("preview surface destroyed: active=" + ((l) this.f12041b).V);
                if (((l) this.f12041b).V) {
                    ((l) this.f12041b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                nh.g gVar = ((nh.h) this.f12041b).f13832f;
                if (gVar != null) {
                    gVar.f13818a = false;
                    ((nh.h) this.f12041b).f13832f = null;
                    return true;
                }
                return true;
            case 2:
                e50 e50Var = (e50) this.f12041b;
                Camera2Session[] camera2SessionArr = e50Var.f25680u0;
                r40 r40Var = e50Var.f25669l0;
                if (r40Var != null) {
                    r40Var.a(0, true, 0, 0, 0L);
                    e50Var.f25669l0 = null;
                }
                if (e50Var.f25676r0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (e50Var.f25678s0 != null) {
                    CameraController.getInstance().close(e50Var.f25678s0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 3:
                ((jf0) this.f12041b).V.f33633w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 4:
                h01 h01Var = (h01) this.f12041b;
                f01 f01Var = h01Var.f26574a;
                if (f01Var != null) {
                    f01Var.h();
                    h01Var.f26574a = null;
                }
                Runnable runnable = h01Var.d;
                if (runnable != null) {
                    h01Var.d = null;
                    h01.b(runnable);
                    return false;
                }
                return false;
            default:
                m81 m81Var = (m81) this.f12041b;
                TextureView textureView = m81Var.d;
                if (m81Var.S) {
                    if (m81Var.W) {
                        m81Var.f28375r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    m81Var.S = false;
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f12040a) {
            case 0:
                l lVar = (l) this.f12041b;
                p pVar = lVar.f12129j;
                pVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                lVar.d0();
                return;
            case 1:
                nh.g gVar = ((nh.h) this.f12041b).f13832f;
                if (gVar != null) {
                    synchronized (gVar.e) {
                        gVar.f13821f = true;
                        gVar.h = i10;
                        gVar.f13822n = i11;
                    }
                    return;
                }
                return;
            case 2:
                r40 r40Var = ((e50) this.f12041b).f25669l0;
                if (r40Var != null) {
                    r40Var.F = i10;
                    r40Var.G = i11;
                    r40Var.b();
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                f01 f01Var = ((h01) this.f12041b).f26574a;
                if (f01Var != null && (handler = f01Var.getHandler()) != null && f01Var.f25916b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j10;
        long j11;
        float f7;
        Object valueOf;
        String str;
        switch (this.f12040a) {
            case 0:
                if (((l) this.f12041b).f12106a0) {
                    ((l) this.f12041b).f12106a0 = false;
                    p pVar = ((l) this.f12041b).f12129j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    l lVar = (l) this.f12041b;
                    if (lVar.f12140n0) {
                        str = "DUAL_ACTIVE";
                    } else if (lVar.E0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(l.z(((l) this.f12041b).I0));
                    pVar.b(sb2.toString());
                    x0 x0Var = (x0) ((l) this.f12041b).f12132k.f279b;
                    Handler handler = x0Var.f12312i;
                    k2.m0 m0Var = x0Var.d;
                    Objects.requireNonNull(m0Var);
                    handler.post(new lg.s(m0Var, 3));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                l lVar2 = (l) this.f12041b;
                if (lVar2.J0 == 0) {
                    lVar2.J0 = elapsedRealtimeNanos;
                    p pVar2 = lVar2.f12129j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((l) this.f12041b).f12111c.getWidth());
                    sb3.append("x");
                    sb3.append(((l) this.f12041b).f12111c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((l) this.f12041b).f12148q);
                    sb3.append(", attached=");
                    sb3.append(((l) this.f12041b).f12111c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((l) this.f12041b).f12111c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((l) this.f12041b).f12111c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((l) this.f12041b).f12111c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((l) this.f12041b).f12111c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((l) this.f12041b).f12111c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    pVar2.b(sb3.toString());
                }
                l lVar3 = (l) this.f12041b;
                long j12 = lVar3.L0;
                if (j12 != 0) {
                    long j13 = elapsedRealtimeNanos - j12;
                    lVar3.N0++;
                    lVar3.O0 += j13;
                    j10 = 0;
                    double d = j13;
                    lVar3.P0 = (d * d) + lVar3.P0;
                    long j14 = lVar3.Q0;
                    if (j14 == 0 || j13 < j14) {
                        lVar3.Q0 = j13;
                    }
                    lVar3.R0 = Math.max(lVar3.R0, j13);
                    if (j13 > 50000000) {
                        lVar3.S0++;
                    }
                    if (j13 > 100000000) {
                        lVar3.T0++;
                    }
                } else {
                    j10 = 0;
                }
                l lVar4 = (l) this.f12041b;
                lVar4.L0 = elapsedRealtimeNanos;
                long j15 = lVar4.M0;
                if (timestamp > j15) {
                    if (lVar4.V0 == j10) {
                        lVar4.V0 = timestamp;
                    }
                    lVar4.W0 = timestamp;
                    lVar4.U0++;
                } else if (j15 != j10) {
                    lVar4.X0++;
                }
                lVar4.M0 = timestamp;
                lVar4.K0++;
                if (elapsedRealtimeNanos - lVar4.J0 >= 5000000000L) {
                    TextureView textureView = lVar4.f12111c;
                    long j16 = lVar4.W0 - lVar4.V0;
                    if (j16 > j10) {
                        long j17 = lVar4.U0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            lVar4.f12129j.b("preview frame delivery: callbackFps=" + ((((float) lVar4.K0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.O0, lVar4.N0) + ", min=" + (((float) lVar4.Q0) / 1000000.0f) + ", max=" + (((float) lVar4.R0) / 1000000.0f) + ", jitter=" + l.W(lVar4.P0, lVar4.O0, lVar4.N0) + "}, gaps={over50ms=" + lVar4.S0 + ", over100ms=" + lVar4.T0 + "}, nonMonotonicTimestamps=" + lVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            lVar4.P();
                            lVar4.J0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    lVar4.f12129j.b("preview frame delivery: callbackFps=" + ((((float) lVar4.K0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.O0, lVar4.N0) + ", min=" + (((float) lVar4.Q0) / 1000000.0f) + ", max=" + (((float) lVar4.R0) / 1000000.0f) + ", jitter=" + l.W(lVar4.P0, lVar4.O0, lVar4.N0) + "}, gaps={over50ms=" + lVar4.S0 + ", over100ms=" + lVar4.T0 + "}, nonMonotonicTimestamps=" + lVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    lVar4.P();
                    lVar4.J0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            default:
                m81 m81Var = (m81) this.f12041b;
                if (m81Var.f28375r == 1) {
                    m81Var.f28374n.getViewTreeObserver().addOnPreDrawListener(new l1(this, 5));
                    m81Var.f28374n.invalidate();
                    return;
                }
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
