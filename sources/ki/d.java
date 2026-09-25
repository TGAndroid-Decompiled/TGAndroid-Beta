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
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.og0;
public final class d implements TextureView.SurfaceTextureListener {
    public final int f13670a;
    public final Object f13671b;

    public d(Object obj, int i10) {
        this.f13670a = i10;
        this.f13671b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f13670a) {
            case 0:
                i iVar = (i) this.f13671b;
                m mVar = iVar.f13713j;
                mVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = iVar.f13720n;
                if (iVar.S && handler != null && iVar.f13702c.isAvailable()) {
                    handler.post(new a(iVar, 5));
                    return;
                }
                return;
            case 1:
                c60 c60Var = (c60) this.f13671b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (c60Var.m0 == null && surfaceTexture != null && !c60Var.f23231l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    c60Var.m0 = new n50(c60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final k11 k11Var = (k11) this.f13671b;
                ArrayList arrayList = k11Var.f25599c;
                i11 i11Var = k11Var.f25597a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.f25597a = null;
                }
                i11 i11Var2 = new i11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                k11Var.invalidate();
                                return;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
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
                                k11Var.invalidate();
                                return;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                k11Var.f25597a = i11Var2;
                i11Var2.f24908a = EmuDetector.with(k11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j11 j11Var = (j11) arrayList.get(i12);
                        Bitmap bitmap = j11Var.e;
                        if (bitmap != null) {
                            k11Var.f25597a.c(j11Var.f25243f, bitmap, j11Var.f25242c, j11Var.d);
                        } else {
                            ArrayList arrayList2 = j11Var.f25241b;
                            if (arrayList2 != null) {
                                k11Var.f25597a.f(arrayList2, j11Var.d);
                            } else {
                                k11Var.f25597a.e(j11Var.f25240a, j11Var.f25244g, j11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(k11Var.f25598b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = (vh.f) this.f13671b;
                if (fVar.f44678f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f44678f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f13670a) {
            case 0:
                m mVar = ((i) this.f13671b).f13713j;
                mVar.b("preview surface destroyed: active=" + ((i) this.f13671b).S);
                if (((i) this.f13671b).S) {
                    ((i) this.f13671b).t(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                c60 c60Var = (c60) this.f13671b;
                Camera2Session[] camera2SessionArr = c60Var.f23243v0;
                n50 n50Var = c60Var.m0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
                    c60Var.m0 = null;
                }
                if (c60Var.f23240s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (c60Var.f23241t0 != null) {
                    CameraController.getInstance().close(c60Var.f23241t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((og0) this.f13671b).V.f31386w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                k11 k11Var = (k11) this.f13671b;
                i11 i11Var = k11Var.f25597a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.f25597a = null;
                }
                Runnable runnable = k11Var.d;
                if (runnable != null) {
                    k11Var.d = null;
                    k11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                o91 o91Var = (o91) this.f13671b;
                TextureView textureView = o91Var.d;
                if (o91Var.S) {
                    if (o91Var.W) {
                        o91Var.f27012r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    o91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f13671b).f44678f;
                if (eVar != null) {
                    eVar.f44664a = false;
                    ((vh.f) this.f13671b).f44678f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f13670a) {
            case 0:
                i iVar = (i) this.f13671b;
                m mVar = iVar.f13713j;
                mVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                iVar.G();
                return;
            case 1:
                n50 n50Var = ((c60) this.f13671b).m0;
                if (n50Var != null) {
                    n50Var.F = i10;
                    n50Var.G = i11;
                    n50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                i11 i11Var = ((k11) this.f13671b).f25597a;
                if (i11Var != null && (handler = i11Var.getHandler()) != null && i11Var.f24909b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.f13671b).f44678f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f44667f = true;
                        eVar.h = i10;
                        eVar.f44668n = i11;
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
        switch (this.f13670a) {
            case 0:
                if (((i) this.f13671b).X) {
                    ((i) this.f13671b).X = false;
                    ((i) this.f13671b).f13713j.b("camera switch first preview frame");
                    s0 s0Var = (s0) ((i) this.f13671b).f13715k.f13369b;
                    Handler handler = s0Var.h;
                    l.d dVar = s0Var.f13844c;
                    Objects.requireNonNull(dVar);
                    handler.post(new i2.h0(dVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                i iVar = (i) this.f13671b;
                if (iVar.f13714j0 == 0) {
                    iVar.f13714j0 = elapsedRealtimeNanos;
                    m mVar = iVar.f13713j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((i) this.f13671b).f13702c.getWidth());
                    sb2.append("x");
                    sb2.append(((i) this.f13671b).f13702c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((i) this.f13671b).f13726q);
                    sb2.append(", attached=");
                    sb2.append(((i) this.f13671b).f13702c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((i) this.f13671b).f13702c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((i) this.f13671b).f13702c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((i) this.f13671b).f13702c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((i) this.f13671b).f13702c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((i) this.f13671b).f13702c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    mVar.b(sb2.toString());
                }
                i iVar2 = (i) this.f13671b;
                long j11 = iVar2.f13718l0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    iVar2.f13721n0++;
                    iVar2.f13723o0 += j12;
                    j3 = 0;
                    double d = j12;
                    iVar2.f13725p0 = (d * d) + iVar2.f13725p0;
                    long j13 = iVar2.f13727q0;
                    if (j13 == 0 || j12 < j13) {
                        iVar2.f13727q0 = j12;
                    }
                    iVar2.f13729r0 = Math.max(iVar2.f13729r0, j12);
                    if (j12 > 50000000) {
                        iVar2.f13731s0++;
                    }
                    if (j12 > 100000000) {
                        iVar2.f13733t0++;
                    }
                } else {
                    j3 = 0;
                }
                i iVar3 = (i) this.f13671b;
                iVar3.f13718l0 = elapsedRealtimeNanos;
                long j14 = iVar3.m0;
                if (timestamp > j14) {
                    if (iVar3.f13736v0 == j3) {
                        iVar3.f13736v0 = timestamp;
                    }
                    iVar3.f13738w0 = timestamp;
                    iVar3.f13735u0++;
                } else if (j14 != j3) {
                    iVar3.f13740x0++;
                }
                iVar3.m0 = timestamp;
                iVar3.f13716k0++;
                if (elapsedRealtimeNanos - iVar3.f13714j0 >= 5000000000L) {
                    TextureView textureView = iVar3.f13702c;
                    long j15 = iVar3.f13738w0 - iVar3.f13736v0;
                    if (j15 > j3) {
                        long j16 = iVar3.f13735u0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            iVar3.f13713j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f13716k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f13723o0, iVar3.f13721n0) + ", min=" + (((float) iVar3.f13727q0) / 1000000.0f) + ", max=" + (((float) iVar3.f13729r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f13725p0, iVar3.f13723o0, iVar3.f13721n0) + "}, gaps={over50ms=" + iVar3.f13731s0 + ", over100ms=" + iVar3.f13733t0 + "}, nonMonotonicTimestamps=" + iVar3.f13740x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            iVar3.v();
                            iVar3.f13714j0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    iVar3.f13713j.b("preview frame delivery: callbackFps=" + ((((float) iVar3.f13716k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.f13723o0, iVar3.f13721n0) + ", min=" + (((float) iVar3.f13727q0) / 1000000.0f) + ", max=" + (((float) iVar3.f13729r0) / 1000000.0f) + ", jitter=" + i.B(iVar3.f13725p0, iVar3.f13723o0, iVar3.f13721n0) + "}, gaps={over50ms=" + iVar3.f13731s0 + ", over100ms=" + iVar3.f13733t0 + "}, nonMonotonicTimestamps=" + iVar3.f13740x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    iVar3.v();
                    iVar3.f13714j0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                o91 o91Var = (o91) this.f13671b;
                if (o91Var.f27012r == 1) {
                    o91Var.f27011n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    o91Var.f27011n.invalidate();
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
