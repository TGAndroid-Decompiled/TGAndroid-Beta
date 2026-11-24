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
public final class tr5 implements TextureView.SurfaceTextureListener {
    public final byte a;
    public final Object b;

    public tr5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.a) {
            case 0:
                vr5 vr5Var = (vr5) this.b;
                if (vr5Var.J == null && surfaceTexture != null) {
                    vr5Var.J = new ur5(vr5Var, surfaceTexture);
                    Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
                    vr5Var.J.postRunnable(new kg5(this, (byte) 7));
                    ur5 ur5Var = vr5Var.J;
                    ur5Var.postRunnable(ur5Var.x);
                    return;
                }
                return;
            case 1:
                wc8 wc8Var = (wc8) this.b;
                EglRenderer eglRenderer = wc8Var.a;
                if (!wc8Var.c && wc8Var.b != surfaceTexture) {
                    wc8Var.b = surfaceTexture;
                    if (i > 0 && i2 > 0) {
                        eglRenderer.setLayoutAspectRatio(i / i2);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 2:
                bm9 bm9Var = (bm9) this.b;
                fm9 fm9Var = bm9Var.j;
                fm9Var.b("preview surface available: view=" + i + "x" + i2);
                Handler handler = bm9Var.n;
                if (bm9Var.U && handler != null && bm9Var.c.isAvailable()) {
                    handler.post(new rl9(bm9Var, (byte) 8));
                    return;
                }
                return;
            case 3:
                qna qnaVar = (qna) this.b;
                if (qnaVar.f == null) {
                    pna pnaVar = new pna(qnaVar, surfaceTexture, i, i2, new ona(qnaVar, (byte) 1));
                    qnaVar.f = pnaVar;
                    pnaVar.start();
                    return;
                }
                return;
            case 4:
                final jlb jlbVar = (jlb) this.b;
                ArrayList arrayList = jlbVar.c;
                hlb hlbVar = jlbVar.a;
                if (hlbVar != null) {
                    hlbVar.g();
                    jlbVar.a = null;
                }
                hlb hlbVar2 = new hlb(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        jlb jlbVar2 = jlbVar;
                        switch (b) {
                            case 0:
                                jlbVar2.invalidate();
                                return;
                            default:
                                Boolean bool = jlb.f;
                                Runnable runnable = jlbVar2.d;
                                if (runnable != null) {
                                    jlbVar2.e = true;
                                    jlbVar2.d = null;
                                    jlb.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        jlb jlbVar2 = jlbVar;
                        switch (b) {
                            case 0:
                                jlbVar2.invalidate();
                                return;
                            default:
                                Boolean bool = jlb.f;
                                Runnable runnable = jlbVar2.d;
                                if (runnable != null) {
                                    jlbVar2.e = true;
                                    jlbVar2.d = null;
                                    jlb.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i, i2);
                jlbVar.a = hlbVar2;
                hlbVar2.a = s34.m(jlbVar.getContext()).h();
                if (!arrayList.isEmpty()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ilb ilbVar = (ilb) arrayList.get(i3);
                        Bitmap bitmap = ilbVar.e;
                        if (bitmap != null) {
                            jlbVar.a.c(ilbVar.f, bitmap, ilbVar.c, ilbVar.d);
                        } else {
                            ArrayList arrayList2 = ilbVar.b;
                            hlb hlbVar3 = jlbVar.a;
                            if (arrayList2 != null) {
                                hlbVar3.d(arrayList2, ilbVar.d);
                            } else {
                                hlbVar3.b(ilbVar.g, ilbVar.a, ilbVar.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(jlbVar.b);
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
                vr5 vr5Var = (vr5) this.b;
                ur5 ur5Var = vr5Var.J;
                if (ur5Var != null) {
                    ur5Var.postRunnable(new kg5(ur5Var, (byte) 9));
                    vr5Var.J = null;
                }
                return true;
            case 1:
                break;
            case 2:
                fm9 fm9Var = ((bm9) this.b).j;
                fm9Var.b("preview surface destroyed: active=" + ((bm9) this.b).U);
                if (((bm9) this.b).U) {
                    ((bm9) this.b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
            case 3:
                pna pnaVar = ((qna) this.b).f;
                if (pnaVar != null) {
                    pnaVar.a = false;
                    ((qna) this.b).f = null;
                }
                return true;
            case 4:
                jlb jlbVar = (jlb) this.b;
                hlb hlbVar = jlbVar.a;
                if (hlbVar != null) {
                    hlbVar.g();
                    jlbVar.a = null;
                }
                Runnable runnable = jlbVar.d;
                if (runnable != null) {
                    jlbVar.d = null;
                    jlb.b(runnable);
                }
                return false;
            default:
                tvc tvcVar = (tvc) this.b;
                TextureView textureView = tvcVar.d;
                if (!tvcVar.T) {
                    return true;
                }
                if (tvcVar.a0) {
                    tvcVar.r = (byte) 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                tvcVar.T = false;
                return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Handler handler;
        switch (this.a) {
            case 0:
                if (((vr5) this.b).J != null) {
                    Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
                    return;
                }
                return;
            case 1:
                wc8 wc8Var = (wc8) this.b;
                if (i > 0 && i2 > 0) {
                    wc8Var.a.setLayoutAspectRatio(i / i2);
                    return;
                }
                return;
            case 2:
                bm9 bm9Var = (bm9) this.b;
                fm9 fm9Var = bm9Var.j;
                fm9Var.b("preview surface size changed: view=" + i + "x" + i2);
                bm9Var.a0();
                return;
            case 3:
                pna pnaVar = ((qna) this.b).f;
                if (pnaVar != null) {
                    synchronized (pnaVar.e) {
                        pnaVar.f = true;
                        pnaVar.h = i;
                        pnaVar.n = i2;
                    }
                    return;
                }
                return;
            case 4:
                hlb hlbVar = ((jlb) this.b).a;
                if (hlbVar != null && (handler = hlbVar.getHandler()) != null && hlbVar.b.get()) {
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
                if (((bm9) this.b).X) {
                    ((bm9) this.b).X = false;
                    fm9 fm9Var = ((bm9) this.b).j;
                    StringBuilder sb = new StringBuilder("camera switch first preview frame: path=");
                    if (((bm9) this.b).k0) {
                        str = "DUAL_ACTIVE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb.append(str);
                    sb.append(", totalElapsedMs=");
                    sb.append(bm9.x(((bm9) this.b).F0));
                    fm9Var.b(sb.toString());
                    un9 un9Var = (un9) ((bm9) this.b).k.b;
                    Handler handler = un9Var.i;
                    lj4 lj4Var = un9Var.d;
                    Objects.requireNonNull(lj4Var);
                    handler.post(new kf9(lj4Var, (byte) 9));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                bm9 bm9Var = (bm9) this.b;
                if (bm9Var.G0 == 0) {
                    bm9Var.G0 = elapsedRealtimeNanos;
                    fm9 fm9Var2 = bm9Var.j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((bm9) this.b).c.getWidth());
                    sb2.append("x");
                    sb2.append(((bm9) this.b).c.getHeight());
                    sb2.append(", buffer=");
                    rq5 rq5Var = ((bm9) this.b).c;
                    sb2.append(Math.max(1, Math.min(720, Math.min(rq5Var.getWidth(), rq5Var.getHeight()))));
                    sb2.append(", attached=");
                    sb2.append(((bm9) this.b).c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((bm9) this.b).c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((bm9) this.b).c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((bm9) this.b).c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((bm9) this.b).c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((bm9) this.b).c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    fm9Var2.b(sb2.toString());
                }
                bm9 bm9Var2 = (bm9) this.b;
                long j4 = bm9Var2.I0;
                if (j4 != 0) {
                    long j5 = elapsedRealtimeNanos - j4;
                    j = 0;
                    bm9Var2.K0++;
                    bm9Var2.L0 += j5;
                    j2 = 1;
                    double d = j5;
                    bm9Var2.M0 = (d * d) + bm9Var2.M0;
                    long j6 = bm9Var2.N0;
                    if (j6 == 0 || j5 < j6) {
                        bm9Var2.N0 = j5;
                    }
                    bm9Var2.O0 = Math.max(bm9Var2.O0, j5);
                    if (j5 > 50000000) {
                        bm9Var2.P0++;
                    }
                    if (j5 > 100000000) {
                        bm9Var2.Q0++;
                    }
                } else {
                    j = 0;
                    j2 = 1;
                }
                bm9 bm9Var3 = (bm9) this.b;
                bm9Var3.I0 = elapsedRealtimeNanos;
                long j7 = bm9Var3.J0;
                if (timestamp > j7) {
                    if (bm9Var3.S0 == j) {
                        bm9Var3.S0 = timestamp;
                    }
                    bm9Var3.T0 = timestamp;
                    bm9Var3.R0 += j2;
                } else if (j7 != j) {
                    bm9Var3.U0 += j2;
                }
                bm9Var3.J0 = timestamp;
                bm9Var3.H0 += j2;
                if (elapsedRealtimeNanos - bm9Var3.G0 >= 5000000000L) {
                    rq5 rq5Var2 = bm9Var3.c;
                    long j8 = bm9Var3.T0 - bm9Var3.S0;
                    if (j8 > j) {
                        long j9 = bm9Var3.R0;
                        if (j9 > j2) {
                            f = (((float) (j9 - j2)) * 1.0E9f) / ((float) j8);
                            bm9Var3.j.b("preview frame delivery: callbackFps=" + ((((float) bm9Var3.H0) * 1.0E9f) / ((float) j3)) + ", timestampFps=" + f + ", callbackIntervalMs={avg=" + bm9.d(bm9Var3.L0, bm9Var3.K0) + ", min=" + (((float) bm9Var3.N0) / 1000000.0f) + ", max=" + (((float) bm9Var3.O0) / 1000000.0f) + ", jitter=" + bm9.U(bm9Var3.M0, bm9Var3.L0, bm9Var3.K0) + "}, gaps={over50ms=" + bm9Var3.P0 + ", over100ms=" + bm9Var3.Q0 + "}, nonMonotonicTimestamps=" + bm9Var3.U0 + ", viewState={shown=" + rq5Var2.isShown() + ", alpha=" + rq5Var2.getAlpha() + ", windowVisibility=" + rq5Var2.getWindowVisibility() + "}");
                            bm9Var3.O();
                            bm9Var3.G0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f = 0.0f;
                    bm9Var3.j.b("preview frame delivery: callbackFps=" + ((((float) bm9Var3.H0) * 1.0E9f) / ((float) j3)) + ", timestampFps=" + f + ", callbackIntervalMs={avg=" + bm9.d(bm9Var3.L0, bm9Var3.K0) + ", min=" + (((float) bm9Var3.N0) / 1000000.0f) + ", max=" + (((float) bm9Var3.O0) / 1000000.0f) + ", jitter=" + bm9.U(bm9Var3.M0, bm9Var3.L0, bm9Var3.K0) + "}, gaps={over50ms=" + bm9Var3.P0 + ", over100ms=" + bm9Var3.Q0 + "}, nonMonotonicTimestamps=" + bm9Var3.U0 + ", viewState={shown=" + rq5Var2.isShown() + ", alpha=" + rq5Var2.getAlpha() + ", windowVisibility=" + rq5Var2.getWindowVisibility() + "}");
                    bm9Var3.O();
                    bm9Var3.G0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 3:
            case 4:
                return;
            default:
                tvc tvcVar = (tvc) this.b;
                if (tvcVar.r == 1) {
                    tvcVar.n.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 12));
                    tvcVar.n.invalidate();
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
