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
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.r40;
public final class e implements TextureView.SurfaceTextureListener {
    public final int f12041a;
    public final Object f12042b;

    public e(Object obj, int i10) {
        this.f12041a = i10;
        this.f12042b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f12041a) {
            case 0:
                l lVar = (l) this.f12042b;
                p pVar = lVar.f12130j;
                pVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = lVar.f12140n;
                if (lVar.V && handler != null && lVar.f12112c.isAvailable()) {
                    handler.post(new a(lVar, 7));
                    return;
                }
                return;
            case 1:
                nh.h hVar = (nh.h) this.f12042b;
                if (hVar.f13833f == null) {
                    nh.g gVar = new nh.g(hVar, surfaceTexture, i10, i11, new nh.e(hVar, 1));
                    hVar.f13833f = gVar;
                    gVar.start();
                    return;
                }
                return;
            case 2:
                e50 e50Var = (e50) this.f12042b;
                if (v2.f18578a) {
                    f8.b("InstantCamera camera surface available");
                }
                if (e50Var.f25718l0 == null && surfaceTexture != null && !e50Var.f25716k0) {
                    if (v2.f18578a) {
                        f8.b("InstantCamera start create thread");
                    }
                    e50Var.f25718l0 = new r40(e50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                final i01 i01Var = (i01) this.f12042b;
                ArrayList arrayList = i01Var.f26978c;
                g01 g01Var = i01Var.f26976a;
                if (g01Var != null) {
                    g01Var.h();
                    i01Var.f26976a = null;
                }
                g01 g01Var2 = new g01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                i01Var.invalidate();
                                return;
                            default:
                                i01 i01Var2 = i01Var;
                                Runnable runnable = i01Var2.d;
                                if (runnable != null) {
                                    i01Var2.e = true;
                                    i01Var2.d = null;
                                    i01.b(runnable);
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
                                i01Var.invalidate();
                                return;
                            default:
                                i01 i01Var2 = i01Var;
                                Runnable runnable = i01Var2.d;
                                if (runnable != null) {
                                    i01Var2.e = true;
                                    i01Var2.d = null;
                                    i01.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                i01Var.f26976a = g01Var2;
                g01Var2.f26267a = o6.h(i01Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        h01 h01Var = (h01) arrayList.get(i12);
                        Bitmap bitmap = h01Var.e;
                        if (bitmap != null) {
                            i01Var.f26976a.c(h01Var.f26622f, bitmap, h01Var.f26621c, h01Var.d);
                        } else {
                            ArrayList arrayList2 = h01Var.f26620b;
                            if (arrayList2 != null) {
                                i01Var.f26976a.d(arrayList2, h01Var.d);
                            } else {
                                i01Var.f26976a.b(h01Var.f26623g, h01Var.f26619a, h01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(i01Var.f26977b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f12041a) {
            case 0:
                ((l) this.f12042b).f12130j.b("preview surface destroyed: active=" + ((l) this.f12042b).V);
                if (((l) this.f12042b).V) {
                    ((l) this.f12042b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                nh.g gVar = ((nh.h) this.f12042b).f13833f;
                if (gVar != null) {
                    gVar.f13819a = false;
                    ((nh.h) this.f12042b).f13833f = null;
                    return true;
                }
                return true;
            case 2:
                e50 e50Var = (e50) this.f12042b;
                Camera2Session[] camera2SessionArr = e50Var.f25729u0;
                r40 r40Var = e50Var.f25718l0;
                if (r40Var != null) {
                    r40Var.a(0, true, 0, 0, 0L);
                    e50Var.f25718l0 = null;
                }
                if (e50Var.f25725r0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (e50Var.f25727s0 != null) {
                    CameraController.getInstance().close(e50Var.f25727s0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 3:
                ((jf0) this.f12042b).V.f33640w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 4:
                i01 i01Var = (i01) this.f12042b;
                g01 g01Var = i01Var.f26976a;
                if (g01Var != null) {
                    g01Var.h();
                    i01Var.f26976a = null;
                }
                Runnable runnable = i01Var.d;
                if (runnable != null) {
                    i01Var.d = null;
                    i01.b(runnable);
                    return false;
                }
                return false;
            default:
                n81 n81Var = (n81) this.f12042b;
                TextureView textureView = n81Var.d;
                if (n81Var.S) {
                    if (n81Var.W) {
                        n81Var.f28741r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    n81Var.S = false;
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f12041a) {
            case 0:
                l lVar = (l) this.f12042b;
                p pVar = lVar.f12130j;
                pVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                lVar.d0();
                return;
            case 1:
                nh.g gVar = ((nh.h) this.f12042b).f13833f;
                if (gVar != null) {
                    synchronized (gVar.e) {
                        gVar.f13822f = true;
                        gVar.h = i10;
                        gVar.f13823n = i11;
                    }
                    return;
                }
                return;
            case 2:
                r40 r40Var = ((e50) this.f12042b).f25718l0;
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
                g01 g01Var = ((i01) this.f12042b).f26976a;
                if (g01Var != null && (handler = g01Var.getHandler()) != null && g01Var.f26268b.get()) {
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
        switch (this.f12041a) {
            case 0:
                if (((l) this.f12042b).f12107a0) {
                    ((l) this.f12042b).f12107a0 = false;
                    p pVar = ((l) this.f12042b).f12130j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    l lVar = (l) this.f12042b;
                    if (lVar.f12141n0) {
                        str = "DUAL_ACTIVE";
                    } else if (lVar.E0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(l.z(((l) this.f12042b).I0));
                    pVar.b(sb2.toString());
                    x0 x0Var = (x0) ((l) this.f12042b).f12133k.f279b;
                    Handler handler = x0Var.f12313i;
                    k2.m0 m0Var = x0Var.d;
                    Objects.requireNonNull(m0Var);
                    handler.post(new lg.s(m0Var, 3));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                l lVar2 = (l) this.f12042b;
                if (lVar2.J0 == 0) {
                    lVar2.J0 = elapsedRealtimeNanos;
                    p pVar2 = lVar2.f12130j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((l) this.f12042b).f12112c.getWidth());
                    sb3.append("x");
                    sb3.append(((l) this.f12042b).f12112c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((l) this.f12042b).f12149q);
                    sb3.append(", attached=");
                    sb3.append(((l) this.f12042b).f12112c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((l) this.f12042b).f12112c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((l) this.f12042b).f12112c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((l) this.f12042b).f12112c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((l) this.f12042b).f12112c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((l) this.f12042b).f12112c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    pVar2.b(sb3.toString());
                }
                l lVar3 = (l) this.f12042b;
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
                l lVar4 = (l) this.f12042b;
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
                    TextureView textureView = lVar4.f12112c;
                    long j16 = lVar4.W0 - lVar4.V0;
                    if (j16 > j10) {
                        long j17 = lVar4.U0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            lVar4.f12130j.b("preview frame delivery: callbackFps=" + ((((float) lVar4.K0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.O0, lVar4.N0) + ", min=" + (((float) lVar4.Q0) / 1000000.0f) + ", max=" + (((float) lVar4.R0) / 1000000.0f) + ", jitter=" + l.W(lVar4.P0, lVar4.O0, lVar4.N0) + "}, gaps={over50ms=" + lVar4.S0 + ", over100ms=" + lVar4.T0 + "}, nonMonotonicTimestamps=" + lVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            lVar4.P();
                            lVar4.J0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    lVar4.f12130j.b("preview frame delivery: callbackFps=" + ((((float) lVar4.K0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.O0, lVar4.N0) + ", min=" + (((float) lVar4.Q0) / 1000000.0f) + ", max=" + (((float) lVar4.R0) / 1000000.0f) + ", jitter=" + l.W(lVar4.P0, lVar4.O0, lVar4.N0) + "}, gaps={over50ms=" + lVar4.S0 + ", over100ms=" + lVar4.T0 + "}, nonMonotonicTimestamps=" + lVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
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
                n81 n81Var = (n81) this.f12042b;
                if (n81Var.f28741r == 1) {
                    n81Var.f28740n.getViewTreeObserver().addOnPreDrawListener(new l1(this, 5));
                    n81Var.f28740n.invalidate();
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
