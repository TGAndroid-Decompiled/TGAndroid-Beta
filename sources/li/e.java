package li;

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
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.y11;
public final class e implements TextureView.SurfaceTextureListener {
    public final int f14762a;
    public final Object f14763b;

    public e(Object obj, int i10) {
        this.f14762a = i10;
        this.f14763b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f14762a) {
            case 0:
                l lVar = (l) this.f14763b;
                p pVar = lVar.f14851j;
                pVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = lVar.f14861n;
                if (lVar.V && handler != null && lVar.f14833c.isAvailable()) {
                    handler.post(new a(lVar, 6));
                    return;
                }
                return;
            case 1:
                p60 p60Var = (p60) this.f14763b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (p60Var.m0 == null && surfaceTexture != null && !p60Var.f28181l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    p60Var.m0 = new a60(p60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final y11 y11Var = (y11) this.f14763b;
                ArrayList arrayList = y11Var.f31453c;
                w11 w11Var = y11Var.f31451a;
                if (w11Var != null) {
                    w11Var.i();
                    y11Var.f31451a = null;
                }
                w11 w11Var2 = new w11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                y11Var.invalidate();
                                return;
                            default:
                                y11 y11Var2 = y11Var;
                                Runnable runnable = y11Var2.d;
                                if (runnable != null) {
                                    y11Var2.e = true;
                                    y11Var2.d = null;
                                    y11.b(runnable);
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
                                y11Var.invalidate();
                                return;
                            default:
                                y11 y11Var2 = y11Var;
                                Runnable runnable = y11Var2.d;
                                if (runnable != null) {
                                    y11Var2.e = true;
                                    y11Var2.d = null;
                                    y11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                y11Var.f31451a = w11Var2;
                w11Var2.f30738a = EmuDetector.with(y11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        x11 x11Var = (x11) arrayList.get(i12);
                        Bitmap bitmap = x11Var.e;
                        if (bitmap != null) {
                            y11Var.f31451a.c(x11Var.f31111f, bitmap, x11Var.f31110c, x11Var.d);
                        } else {
                            ArrayList arrayList2 = x11Var.f31109b;
                            if (arrayList2 != null) {
                                y11Var.f31451a.f(arrayList2, x11Var.d);
                            } else {
                                y11Var.f31451a.d(x11Var.f31108a, x11Var.f31112g, x11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(y11Var.f31452b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                wh.f fVar = (wh.f) this.f14763b;
                if (fVar.f47653f == null) {
                    wh.e eVar = new wh.e(fVar, surfaceTexture, i10, i11, new wh.d(fVar, 1));
                    fVar.f47653f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f14762a) {
            case 0:
                ((l) this.f14763b).f14851j.b("preview surface destroyed: active=" + ((l) this.f14763b).V);
                if (((l) this.f14763b).V) {
                    ((l) this.f14763b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                p60 p60Var = (p60) this.f14763b;
                Camera2Session[] camera2SessionArr = p60Var.f28193v0;
                a60 a60Var = p60Var.m0;
                if (a60Var != null) {
                    a60Var.b(0L, 0, true, 0, 0);
                    p60Var.m0 = null;
                }
                if (p60Var.f28190s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (p60Var.f28191t0 != null) {
                    CameraController.getInstance().close(p60Var.f28191t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((fh0) this.f14763b).V.f32389w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                y11 y11Var = (y11) this.f14763b;
                w11 w11Var = y11Var.f31451a;
                if (w11Var != null) {
                    w11Var.i();
                    y11Var.f31451a = null;
                }
                Runnable runnable = y11Var.d;
                if (runnable != null) {
                    y11Var.d = null;
                    y11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                ca1 ca1Var = (ca1) this.f14763b;
                TextureView textureView = ca1Var.d;
                if (ca1Var.S) {
                    if (ca1Var.W) {
                        ca1Var.f24006r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ca1Var.S = false;
                    return false;
                }
                return true;
            default:
                wh.e eVar = ((wh.f) this.f14763b).f47653f;
                if (eVar != null) {
                    eVar.f47639a = false;
                    ((wh.f) this.f14763b).f47653f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f14762a) {
            case 0:
                l lVar = (l) this.f14763b;
                p pVar = lVar.f14851j;
                pVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                lVar.d0();
                return;
            case 1:
                a60 a60Var = ((p60) this.f14763b).m0;
                if (a60Var != null) {
                    a60Var.F = i10;
                    a60Var.G = i11;
                    a60Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                w11 w11Var = ((y11) this.f14763b).f31451a;
                if (w11Var != null && (handler = w11Var.getHandler()) != null && w11Var.f30739b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                wh.e eVar = ((wh.f) this.f14763b).f47653f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f47642f = true;
                        eVar.h = i10;
                        eVar.f47643n = i11;
                    }
                    return;
                }
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
        switch (this.f14762a) {
            case 0:
                if (((l) this.f14763b).f14828a0) {
                    ((l) this.f14763b).f14828a0 = false;
                    p pVar = ((l) this.f14763b).f14851j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    l lVar = (l) this.f14763b;
                    if (lVar.m0) {
                        str = "DUAL_ACTIVE";
                    } else if (lVar.D0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(l.z(((l) this.f14763b).H0));
                    pVar.b(sb2.toString());
                    u0 u0Var = (u0) ((l) this.f14763b).f14854k.f13233b;
                    Handler handler = u0Var.f15011i;
                    l2.f fVar = u0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new ig.t0(fVar, 16));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                l lVar2 = (l) this.f14763b;
                if (lVar2.I0 == 0) {
                    lVar2.I0 = elapsedRealtimeNanos;
                    p pVar2 = lVar2.f14851j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((l) this.f14763b).f14833c.getWidth());
                    sb3.append("x");
                    sb3.append(((l) this.f14763b).f14833c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((l) this.f14763b).f14870q);
                    sb3.append(", attached=");
                    sb3.append(((l) this.f14763b).f14833c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((l) this.f14763b).f14833c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((l) this.f14763b).f14833c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((l) this.f14763b).f14833c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((l) this.f14763b).f14833c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((l) this.f14763b).f14833c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    pVar2.b(sb3.toString());
                }
                l lVar3 = (l) this.f14763b;
                long j12 = lVar3.K0;
                if (j12 != 0) {
                    long j13 = elapsedRealtimeNanos - j12;
                    lVar3.M0++;
                    lVar3.N0 += j13;
                    j10 = 0;
                    double d = j13;
                    lVar3.O0 = (d * d) + lVar3.O0;
                    long j14 = lVar3.P0;
                    if (j14 == 0 || j13 < j14) {
                        lVar3.P0 = j13;
                    }
                    lVar3.Q0 = Math.max(lVar3.Q0, j13);
                    if (j13 > 50000000) {
                        lVar3.R0++;
                    }
                    if (j13 > 100000000) {
                        lVar3.S0++;
                    }
                } else {
                    j10 = 0;
                }
                l lVar4 = (l) this.f14763b;
                lVar4.K0 = elapsedRealtimeNanos;
                long j15 = lVar4.L0;
                if (timestamp > j15) {
                    if (lVar4.U0 == j10) {
                        lVar4.U0 = timestamp;
                    }
                    lVar4.V0 = timestamp;
                    lVar4.T0++;
                } else if (j15 != j10) {
                    lVar4.W0++;
                }
                lVar4.L0 = timestamp;
                lVar4.J0++;
                if (elapsedRealtimeNanos - lVar4.I0 >= 5000000000L) {
                    TextureView textureView = lVar4.f14833c;
                    long j16 = lVar4.V0 - lVar4.U0;
                    if (j16 > j10) {
                        long j17 = lVar4.T0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            lVar4.f14851j.b("preview frame delivery: callbackFps=" + ((((float) lVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.N0, lVar4.M0) + ", min=" + (((float) lVar4.P0) / 1000000.0f) + ", max=" + (((float) lVar4.Q0) / 1000000.0f) + ", jitter=" + l.W(lVar4.O0, lVar4.N0, lVar4.M0) + "}, gaps={over50ms=" + lVar4.R0 + ", over100ms=" + lVar4.S0 + "}, nonMonotonicTimestamps=" + lVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            lVar4.P();
                            lVar4.I0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    lVar4.f14851j.b("preview frame delivery: callbackFps=" + ((((float) lVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.N0, lVar4.M0) + ", min=" + (((float) lVar4.P0) / 1000000.0f) + ", max=" + (((float) lVar4.Q0) / 1000000.0f) + ", jitter=" + l.W(lVar4.O0, lVar4.N0, lVar4.M0) + "}, gaps={over50ms=" + lVar4.R0 + ", over100ms=" + lVar4.S0 + "}, nonMonotonicTimestamps=" + lVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    lVar4.P();
                    lVar4.I0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ca1 ca1Var = (ca1) this.f14763b;
                if (ca1Var.f24006r == 1) {
                    ca1Var.f24005n.getViewTreeObserver().addOnPreDrawListener(new da(this, 4));
                    ca1Var.f24005n.invalidate();
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
