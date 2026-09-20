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
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.p91;
public final class c implements TextureView.SurfaceTextureListener {
    public final int f13661a;
    public final Object f13662b;

    public c(Object obj, int i10) {
        this.f13661a = i10;
        this.f13662b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f13661a) {
            case 0:
                h hVar = (h) this.f13662b;
                k kVar = hVar.f13707j;
                kVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = hVar.f13714n;
                if (hVar.M && handler != null && hVar.f13696c.isAvailable()) {
                    handler.post(new b(hVar, 4));
                    return;
                }
                return;
            case 1:
                a60 a60Var = (a60) this.f13662b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (a60Var.f22549k0 == null && surfaceTexture != null && !a60Var.f22548j0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    a60Var.f22549k0 = new m50(a60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final l11 l11Var = (l11) this.f13662b;
                ArrayList arrayList = l11Var.f25995c;
                j11 j11Var = l11Var.f25993a;
                if (j11Var != null) {
                    j11Var.i();
                    l11Var.f25993a = null;
                }
                j11 j11Var2 = new j11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                l11Var.invalidate();
                                return;
                            default:
                                l11 l11Var2 = l11Var;
                                Runnable runnable = l11Var2.d;
                                if (runnable != null) {
                                    l11Var2.e = true;
                                    l11Var2.d = null;
                                    l11.b(runnable);
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
                                l11Var.invalidate();
                                return;
                            default:
                                l11 l11Var2 = l11Var;
                                Runnable runnable = l11Var2.d;
                                if (runnable != null) {
                                    l11Var2.e = true;
                                    l11Var2.d = null;
                                    l11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                l11Var.f25993a = j11Var2;
                j11Var2.f25167a = EmuDetector.with(l11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        k11 k11Var = (k11) arrayList.get(i12);
                        Bitmap bitmap = k11Var.e;
                        if (bitmap != null) {
                            l11Var.f25993a.c(k11Var.f25616f, bitmap, k11Var.f25615c, k11Var.d);
                        } else {
                            ArrayList arrayList2 = k11Var.f25614b;
                            if (arrayList2 != null) {
                                l11Var.f25993a.f(arrayList2, k11Var.d);
                            } else {
                                l11Var.f25993a.e(k11Var.f25613a, k11Var.f25617g, k11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(l11Var.f25994b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.g gVar = (vh.g) this.f13662b;
                if (gVar.f44694f == null) {
                    vh.f fVar = new vh.f(gVar, surfaceTexture, i10, i11, new vh.d(gVar, 1));
                    gVar.f44694f = fVar;
                    fVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f13661a) {
            case 0:
                h hVar = (h) this.f13662b;
                k kVar = hVar.f13707j;
                kVar.b("preview surface destroyed: active=" + hVar.M);
                if (hVar.M) {
                    hVar.s(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                a60 a60Var = (a60) this.f13662b;
                Camera2Session[] camera2SessionArr = a60Var.f22560t0;
                m50 m50Var = a60Var.f22549k0;
                if (m50Var != null) {
                    m50Var.b(0L, 0, true, 0, 0);
                    a60Var.f22549k0 = null;
                }
                if (a60Var.f22555q0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (a60Var.f22557r0 != null) {
                    CameraController.getInstance().close(a60Var.f22557r0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((og0) this.f13662b).V.f31383w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                l11 l11Var = (l11) this.f13662b;
                j11 j11Var = l11Var.f25993a;
                if (j11Var != null) {
                    j11Var.i();
                    l11Var.f25993a = null;
                }
                Runnable runnable = l11Var.d;
                if (runnable != null) {
                    l11Var.d = null;
                    l11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                p91 p91Var = (p91) this.f13662b;
                TextureView textureView = p91Var.d;
                if (p91Var.S) {
                    if (p91Var.W) {
                        p91Var.f27227r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    p91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.f fVar = ((vh.g) this.f13662b).f44694f;
                if (fVar != null) {
                    fVar.f44680a = false;
                    ((vh.g) this.f13662b).f44694f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f13661a) {
            case 0:
                h hVar = (h) this.f13662b;
                k kVar = hVar.f13707j;
                kVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                hVar.C();
                return;
            case 1:
                m50 m50Var = ((a60) this.f13662b).f22549k0;
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
                j11 j11Var = ((l11) this.f13662b).f25993a;
                if (j11Var != null && (handler = j11Var.getHandler()) != null && j11Var.f25168b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = ((vh.g) this.f13662b).f44694f;
                if (fVar != null) {
                    synchronized (fVar.e) {
                        fVar.f44683f = true;
                        fVar.h = i10;
                        fVar.f44684n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        switch (this.f13661a) {
            case 0:
                if (((h) this.f13662b).Q) {
                    ((h) this.f13662b).Q = false;
                    ((h) this.f13662b).f13707j.b("camera switch first preview frame");
                    o0 o0Var = (o0) ((h) this.f13662b).f13709k.f13384b;
                    Handler handler = o0Var.h;
                    l.d dVar = o0Var.f13802c;
                    Objects.requireNonNull(dVar);
                    handler.post(new i2.g0(dVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                h hVar = (h) this.f13662b;
                if (hVar.f13695b0 == 0) {
                    hVar.f13695b0 = elapsedRealtimeNanos;
                }
                hVar.f13697c0++;
                if (elapsedRealtimeNanos - hVar.f13695b0 >= 5000000000L) {
                    hVar.f13707j.b("preview frames: fps=" + ((((float) ((h) this.f13662b).f13697c0) * 1.0E9f) / ((float) j3)));
                    h hVar2 = (h) this.f13662b;
                    hVar2.f13695b0 = elapsedRealtimeNanos;
                    hVar2.f13697c0 = 0L;
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                p91 p91Var = (p91) this.f13662b;
                if (p91Var.f27227r == 1) {
                    p91Var.f27226n.getViewTreeObserver().addOnPreDrawListener(new ga(this, 4));
                    p91Var.f27226n.invalidate();
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
