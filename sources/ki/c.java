package ki;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Choreographer;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.q91;
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
                g gVar = (g) this.f13662b;
                j jVar = gVar.f13680f;
                jVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = gVar.f13683j;
                if (gVar.B && handler != null && gVar.f13679c.isAvailable()) {
                    handler.post(new a(gVar, 2));
                    return;
                }
                return;
            case 1:
                b60 b60Var = (b60) this.f13662b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (b60Var.f22844k0 == null && surfaceTexture != null && !b60Var.f22843j0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    b60Var.f22844k0 = new m50(b60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final m11 m11Var = (m11) this.f13662b;
                ArrayList arrayList = m11Var.f26281c;
                k11 k11Var = m11Var.f26279a;
                if (k11Var != null) {
                    k11Var.i();
                    m11Var.f26279a = null;
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
                m11Var.f26279a = k11Var2;
                k11Var2.f25530a = EmuDetector.with(m11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        l11 l11Var = (l11) arrayList.get(i12);
                        Bitmap bitmap = l11Var.e;
                        if (bitmap != null) {
                            m11Var.f26279a.c(l11Var.f25990f, bitmap, l11Var.f25989c, l11Var.d);
                        } else {
                            ArrayList arrayList2 = l11Var.f25988b;
                            if (arrayList2 != null) {
                                m11Var.f26279a.f(arrayList2, l11Var.d);
                            } else {
                                m11Var.f26279a.e(l11Var.f25987a, l11Var.f25991g, l11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(m11Var.f26280b);
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.g gVar2 = (vh.g) this.f13662b;
                if (gVar2.f44650f == null) {
                    vh.f fVar = new vh.f(gVar2, surfaceTexture, i10, i11, new vh.d(gVar2, 1));
                    gVar2.f44650f = fVar;
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
                g gVar = (g) this.f13662b;
                j jVar = gVar.f13680f;
                jVar.b("preview surface destroyed: active=" + gVar.B);
                if (gVar.B) {
                    gVar.k(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            case 1:
                b60 b60Var = (b60) this.f13662b;
                Camera2Session[] camera2SessionArr = b60Var.f22855t0;
                m50 m50Var = b60Var.f22844k0;
                if (m50Var != null) {
                    m50Var.b(0L, 0, true, 0, 0);
                    b60Var.f22844k0 = null;
                }
                if (b60Var.f22850q0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (b60Var.f22852r0 != null) {
                    CameraController.getInstance().close(b60Var.f22852r0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((pg0) this.f13662b).V.f31343w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                m11 m11Var = (m11) this.f13662b;
                k11 k11Var = m11Var.f26279a;
                if (k11Var != null) {
                    k11Var.i();
                    m11Var.f26279a = null;
                }
                Runnable runnable = m11Var.d;
                if (runnable != null) {
                    m11Var.d = null;
                    m11.b(runnable);
                    return false;
                }
                return false;
            case 4:
                q91 q91Var = (q91) this.f13662b;
                TextureView textureView = q91Var.d;
                if (q91Var.S) {
                    if (q91Var.W) {
                        q91Var.f27525r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    q91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.f fVar = ((vh.g) this.f13662b).f44650f;
                if (fVar != null) {
                    fVar.f44636a = false;
                    ((vh.g) this.f13662b).f44650f = null;
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
                g gVar = (g) this.f13662b;
                j jVar = gVar.f13680f;
                jVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                gVar.s();
                return;
            case 1:
                m50 m50Var = ((b60) this.f13662b).f22844k0;
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
                k11 k11Var = ((m11) this.f13662b).f26279a;
                if (k11Var != null && (handler = k11Var.getHandler()) != null && k11Var.f25531b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 4:
                return;
            default:
                vh.f fVar = ((vh.g) this.f13662b).f44650f;
                if (fVar != null) {
                    synchronized (fVar.e) {
                        fVar.f44639f = true;
                        fVar.h = i10;
                        fVar.f44640n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f13661a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                q91 q91Var = (q91) this.f13662b;
                if (q91Var.f27525r == 1) {
                    q91Var.f27524n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    q91Var.f27524n.invalidate();
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

    private final void i(SurfaceTexture surfaceTexture) {
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
