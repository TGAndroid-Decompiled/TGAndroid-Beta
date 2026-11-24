package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.webrtc.EglRenderer;
public final class up5 implements TextureView.SurfaceTextureListener {
    public final byte a;
    public final Object b;

    public up5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.a) {
            case 0:
                wp5 wp5Var = (wp5) this.b;
                if (wp5Var.J == null && surfaceTexture != null) {
                    wp5Var.J = new vp5(wp5Var, surfaceTexture);
                    Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
                    wp5Var.J.postRunnable(new tp5(this, (byte) 0));
                    vp5 vp5Var = wp5Var.J;
                    vp5Var.postRunnable(vp5Var.x);
                    return;
                }
                return;
            case 1:
                ta8 ta8Var = (ta8) this.b;
                EglRenderer eglRenderer = ta8Var.a;
                if (!ta8Var.c && ta8Var.b != surfaceTexture) {
                    ta8Var.b = surfaceTexture;
                    if (i > 0 && i2 > 0) {
                        eglRenderer.setLayoutAspectRatio(i / i2);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 2:
                ak9 ak9Var = (ak9) this.b;
                ek9 ek9Var = ak9Var.j;
                ek9Var.b("preview surface available: view=" + i + "x" + i2);
                Handler handler = ak9Var.n;
                if (ak9Var.U && handler != null && ak9Var.c.isAvailable()) {
                    handler.post(new pj9(ak9Var, (byte) 8));
                    return;
                }
                return;
            case 3:
                pla plaVar = (pla) this.b;
                if (plaVar.f == null) {
                    ola olaVar = new ola(plaVar, surfaceTexture, i, i2, new nla(plaVar, (byte) 1));
                    plaVar.f = olaVar;
                    olaVar.start();
                    return;
                }
                return;
            case 4:
                final ijb ijbVar = (ijb) this.b;
                ArrayList arrayList = ijbVar.c;
                gjb gjbVar = ijbVar.a;
                if (gjbVar != null) {
                    gjbVar.g();
                    ijbVar.a = null;
                }
                gjb gjbVar2 = new gjb(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        ijb ijbVar2 = ijbVar;
                        switch (b) {
                            case 0:
                                ijbVar2.invalidate();
                                return;
                            default:
                                Boolean bool = ijb.f;
                                Runnable runnable = ijbVar2.d;
                                if (runnable != null) {
                                    ijbVar2.e = true;
                                    ijbVar2.d = null;
                                    ijb.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        ijb ijbVar2 = ijbVar;
                        switch (b) {
                            case 0:
                                ijbVar2.invalidate();
                                return;
                            default:
                                Boolean bool = ijb.f;
                                Runnable runnable = ijbVar2.d;
                                if (runnable != null) {
                                    ijbVar2.e = true;
                                    ijbVar2.d = null;
                                    ijb.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i, i2);
                ijbVar.a = gjbVar2;
                gjbVar2.a = h24.m(ijbVar.getContext()).h();
                if (!arrayList.isEmpty()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        hjb hjbVar = (hjb) arrayList.get(i3);
                        Bitmap bitmap = hjbVar.e;
                        if (bitmap != null) {
                            ijbVar.a.c(hjbVar.f, bitmap, hjbVar.c, hjbVar.d);
                        } else {
                            ArrayList arrayList2 = hjbVar.b;
                            gjb gjbVar3 = ijbVar.a;
                            if (arrayList2 != null) {
                                gjbVar3.d(arrayList2, hjbVar.d);
                            } else {
                                gjbVar3.b(hjbVar.g, hjbVar.a, hjbVar.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(ijbVar.b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                wp5 wp5Var = (wp5) this.b;
                vp5 vp5Var = wp5Var.J;
                if (vp5Var != null) {
                    vp5Var.postRunnable(new tp5(vp5Var, (byte) 2));
                    wp5Var.J = null;
                }
                return true;
            case 1:
                break;
            case 2:
                ek9 ek9Var = ((ak9) this.b).j;
                ek9Var.b("preview surface destroyed: active=" + ((ak9) this.b).U);
                if (((ak9) this.b).U) {
                    ((ak9) this.b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
            case 3:
                ola olaVar = ((pla) this.b).f;
                if (olaVar != null) {
                    olaVar.a = false;
                    ((pla) this.b).f = null;
                }
                return true;
            case 4:
                ijb ijbVar = (ijb) this.b;
                gjb gjbVar = ijbVar.a;
                if (gjbVar != null) {
                    gjbVar.g();
                    ijbVar.a = null;
                }
                Runnable runnable = ijbVar.d;
                if (runnable != null) {
                    ijbVar.d = null;
                    ijb.b(runnable);
                }
                return false;
            default:
                stc stcVar = (stc) this.b;
                TextureView textureView = stcVar.d;
                if (!stcVar.T) {
                    return true;
                }
                if (stcVar.a0) {
                    stcVar.r = (byte) 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                stcVar.T = false;
                return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Handler handler;
        switch (this.a) {
            case 0:
                if (((wp5) this.b).J != null) {
                    Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
                    return;
                }
                return;
            case 1:
                ta8 ta8Var = (ta8) this.b;
                if (i > 0 && i2 > 0) {
                    ta8Var.a.setLayoutAspectRatio(i / i2);
                    return;
                }
                return;
            case 2:
                ak9 ak9Var = (ak9) this.b;
                ek9 ek9Var = ak9Var.j;
                ek9Var.b("preview surface size changed: view=" + i + "x" + i2);
                ak9Var.a0();
                return;
            case 3:
                ola olaVar = ((pla) this.b).f;
                if (olaVar != null) {
                    synchronized (olaVar.e) {
                        olaVar.f = true;
                        olaVar.h = i;
                        olaVar.n = i2;
                    }
                    return;
                }
                return;
            case 4:
                gjb gjbVar = ((ijb) this.b).a;
                if (gjbVar != null && (handler = gjbVar.getHandler()) != null && gjbVar.b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i, i2));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j;
        long j2;
        long j3;
        float f;
        Object valueOf;
        String str;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                if (((ak9) this.b).X) {
                    ((ak9) this.b).X = false;
                    ek9 ek9Var = ((ak9) this.b).j;
                    StringBuilder sb = new StringBuilder("camera switch first preview frame: path=");
                    if (((ak9) this.b).k0) {
                        str = "DUAL_ACTIVE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb.append(str);
                    sb.append(", totalElapsedMs=");
                    sb.append(ak9.x(((ak9) this.b).F0));
                    ek9Var.b(sb.toString());
                    ul9 ul9Var = (ul9) ((ak9) this.b).k.b;
                    Handler handler = ul9Var.i;
                    gi3 gi3Var = ul9Var.d;
                    Objects.requireNonNull(gi3Var);
                    handler.post(new zk9(gi3Var, (byte) 1));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                ak9 ak9Var = (ak9) this.b;
                if (ak9Var.G0 == 0) {
                    ak9Var.G0 = elapsedRealtimeNanos;
                    ek9 ek9Var2 = ak9Var.j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((ak9) this.b).c.getWidth());
                    sb2.append("x");
                    sb2.append(((ak9) this.b).c.getHeight());
                    sb2.append(", buffer=");
                    ro5 ro5Var = ((ak9) this.b).c;
                    sb2.append(Math.max(1, Math.min(720, Math.min(ro5Var.getWidth(), ro5Var.getHeight()))));
                    sb2.append(", attached=");
                    sb2.append(((ak9) this.b).c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((ak9) this.b).c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((ak9) this.b).c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((ak9) this.b).c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((ak9) this.b).c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((ak9) this.b).c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    ek9Var2.b(sb2.toString());
                }
                ak9 ak9Var2 = (ak9) this.b;
                long j4 = ak9Var2.I0;
                if (j4 != 0) {
                    long j5 = elapsedRealtimeNanos - j4;
                    j = 0;
                    ak9Var2.K0++;
                    ak9Var2.L0 += j5;
                    j2 = 1;
                    double d = j5;
                    ak9Var2.M0 = (d * d) + ak9Var2.M0;
                    long j6 = ak9Var2.N0;
                    if (j6 == 0 || j5 < j6) {
                        ak9Var2.N0 = j5;
                    }
                    ak9Var2.O0 = Math.max(ak9Var2.O0, j5);
                    if (j5 > 50000000) {
                        ak9Var2.P0++;
                    }
                    if (j5 > 100000000) {
                        ak9Var2.Q0++;
                    }
                } else {
                    j = 0;
                    j2 = 1;
                }
                ak9 ak9Var3 = (ak9) this.b;
                ak9Var3.I0 = elapsedRealtimeNanos;
                long j7 = ak9Var3.J0;
                if (timestamp > j7) {
                    if (ak9Var3.S0 == j) {
                        ak9Var3.S0 = timestamp;
                    }
                    ak9Var3.T0 = timestamp;
                    ak9Var3.R0 += j2;
                } else if (j7 != j) {
                    ak9Var3.U0 += j2;
                }
                ak9Var3.J0 = timestamp;
                ak9Var3.H0 += j2;
                if (elapsedRealtimeNanos - ak9Var3.G0 >= 5000000000L) {
                    ro5 ro5Var2 = ak9Var3.c;
                    long j8 = ak9Var3.T0 - ak9Var3.S0;
                    if (j8 > j) {
                        long j9 = ak9Var3.R0;
                        if (j9 > j2) {
                            f = (((float) (j9 - j2)) * 1.0E9f) / ((float) j8);
                            ak9Var3.j.b("preview frame delivery: callbackFps=" + ((((float) ak9Var3.H0) * 1.0E9f) / ((float) j3)) + ", timestampFps=" + f + ", callbackIntervalMs={avg=" + ak9.d(ak9Var3.L0, ak9Var3.K0) + ", min=" + (((float) ak9Var3.N0) / 1000000.0f) + ", max=" + (((float) ak9Var3.O0) / 1000000.0f) + ", jitter=" + ak9.U(ak9Var3.M0, ak9Var3.L0, ak9Var3.K0) + "}, gaps={over50ms=" + ak9Var3.P0 + ", over100ms=" + ak9Var3.Q0 + "}, nonMonotonicTimestamps=" + ak9Var3.U0 + ", viewState={shown=" + ro5Var2.isShown() + ", alpha=" + ro5Var2.getAlpha() + ", windowVisibility=" + ro5Var2.getWindowVisibility() + "}");
                            ak9Var3.O();
                            ak9Var3.G0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f = 0.0f;
                    ak9Var3.j.b("preview frame delivery: callbackFps=" + ((((float) ak9Var3.H0) * 1.0E9f) / ((float) j3)) + ", timestampFps=" + f + ", callbackIntervalMs={avg=" + ak9.d(ak9Var3.L0, ak9Var3.K0) + ", min=" + (((float) ak9Var3.N0) / 1000000.0f) + ", max=" + (((float) ak9Var3.O0) / 1000000.0f) + ", jitter=" + ak9.U(ak9Var3.M0, ak9Var3.L0, ak9Var3.K0) + "}, gaps={over50ms=" + ak9Var3.P0 + ", over100ms=" + ak9Var3.Q0 + "}, nonMonotonicTimestamps=" + ak9Var3.U0 + ", viewState={shown=" + ro5Var2.isShown() + ", alpha=" + ro5Var2.getAlpha() + ", windowVisibility=" + ro5Var2.getWindowVisibility() + "}");
                    ak9Var3.O();
                    ak9Var3.G0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 3:
            case 4:
                return;
            default:
                stc stcVar = (stc) this.b;
                if (stcVar.r == 1) {
                    stcVar.n.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 12));
                    stcVar.n.invalidate();
                    return;
                }
                return;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void d(SurfaceTexture surfaceTexture) {
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
