package eh;

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
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.sf0;

public final class h implements TextureView.SurfaceTextureListener {

    public final int f5486a;

    public final Object f5487b;

    public h(Object obj, int i10) {
        this.f5486a = i10;
        this.f5487b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f5486a) {
            case 0:
                j jVar = (j) this.f5487b;
                if (jVar.f5504f == null) {
                    i iVar = new i(jVar, surfaceTexture, i10, i11, new f(jVar, 1));
                    jVar.f5504f = iVar;
                    iVar.start();
                }
                break;
            case 1:
                k50 k50Var = (k50) this.f5487b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (k50Var.f29973d0 == null && surfaceTexture != null && !k50Var.f29972c0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    k50Var.f29973d0 = new b50(k50Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 3:
                final f01 f01Var = (f01) this.f5487b;
                ArrayList arrayList = f01Var.f28223c;
                d01 d01Var = f01Var.f28221a;
                if (d01Var != null) {
                    d01Var.i();
                    f01Var.f28221a = null;
                }
                final int i12 = 0;
                ?? r10 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                f01Var.invalidate();
                                break;
                            default:
                                f01 f01Var2 = f01Var;
                                Runnable runnable = f01Var2.d;
                                if (runnable != null) {
                                    f01Var2.f28224e = true;
                                    f01Var2.d = null;
                                    f01.b(runnable);
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                d01 d01Var2 = new d01(surfaceTexture, r10, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                f01Var.invalidate();
                                break;
                            default:
                                f01 f01Var2 = f01Var;
                                Runnable runnable = f01Var2.d;
                                if (runnable != null) {
                                    f01Var2.f28224e = true;
                                    f01Var2.d = null;
                                    f01.b(runnable);
                                }
                                break;
                        }
                    }
                }, i10, i11);
                f01Var.f28221a = d01Var2;
                d01Var2.f27593a = EmuDetector.with(f01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        e01 e01Var = (e01) arrayList.get(i14);
                        Bitmap bitmap = e01Var.f27916e;
                        if (bitmap != null) {
                            f01Var.f28221a.c(e01Var.f27917f, bitmap, e01Var.f27915c, e01Var.d);
                        } else {
                            ArrayList arrayList2 = e01Var.f27914b;
                            if (arrayList2 != null) {
                                f01Var.f28221a.f(arrayList2, e01Var.d);
                            } else {
                                f01Var.f28221a.e(e01Var.f27913a, e01Var.f27918g, e01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(f01Var.f28222b);
                }
                break;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f5486a) {
            case 0:
                i iVar = ((j) this.f5487b).f5504f;
                if (iVar == null) {
                    return true;
                }
                iVar.f5488a = false;
                ((j) this.f5487b).f5504f = null;
                return true;
            case 1:
                k50 k50Var = (k50) this.f5487b;
                Camera2Session[] camera2SessionArr = k50Var.m0;
                b50 b50Var = k50Var.f29973d0;
                if (b50Var != null) {
                    b50Var.b(0L, 0, true, 0, 0);
                    k50Var.f29973d0 = null;
                }
                if (!k50Var.f29981j0) {
                    if (k50Var.f29982k0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(k50Var.f29982k0, null, null);
                    return true;
                }
                for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                    Camera2Session camera2Session = camera2SessionArr[i10];
                    if (camera2Session != null) {
                        camera2Session.destroy(false);
                        camera2SessionArr[i10] = null;
                    }
                }
                return true;
            case 2:
                ((sf0) this.f5487b).R.f35749s3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                f01 f01Var = (f01) this.f5487b;
                d01 d01Var = f01Var.f28221a;
                if (d01Var != null) {
                    d01Var.i();
                    f01Var.f28221a = null;
                }
                Runnable runnable = f01Var.d;
                if (runnable == null) {
                    return false;
                }
                f01Var.d = null;
                f01.b(runnable);
                return false;
            default:
                i81 i81Var = (i81) this.f5487b;
                TextureView textureView = i81Var.d;
                if (!i81Var.O) {
                    return true;
                }
                if (i81Var.S) {
                    i81Var.f29308r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                i81Var.O = false;
                return false;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f5486a) {
            case 0:
                i iVar = ((j) this.f5487b).f5504f;
                if (iVar != null) {
                    synchronized (iVar.f5491e) {
                        iVar.f5492f = true;
                        iVar.h = i10;
                        iVar.f5493n = i11;
                        break;
                    }
                    return;
                }
                return;
            case 1:
                b50 b50Var = ((k50) this.f5487b).f29973d0;
                if (b50Var != null) {
                    b50Var.B = i10;
                    b50Var.C = i11;
                    b50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                d01 d01Var = ((f01) this.f5487b).f28221a;
                if (d01Var == null || (handler = d01Var.getHandler()) == null || !d01Var.f27594b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f5486a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                i81 i81Var = (i81) this.f5487b;
                if (i81Var.f29308r == 1) {
                    i81Var.f29307n.getViewTreeObserver().addOnPreDrawListener(new y9(this, 4));
                    i81Var.f29307n.invalidate();
                }
                break;
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
