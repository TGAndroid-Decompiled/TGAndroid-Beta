package dh;

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
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.w40;
public final class i implements TextureView.SurfaceTextureListener {
    public final int f4588a;
    public final Object f4589b;

    public i(Object obj, int i9) {
        this.f4588a = i9;
        this.f4589b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        switch (this.f4588a) {
            case 0:
                k kVar = (k) this.f4589b;
                if (kVar.f4606f == null) {
                    j jVar = new j(kVar, surfaceTexture, i9, i10, new f(kVar, 1));
                    kVar.f4606f = jVar;
                    jVar.start();
                    return;
                }
                return;
            case 1:
                f50 f50Var = (f50) this.f4589b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (f50Var.f28278d0 == null && surfaceTexture != null && !f50Var.f28277c0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    f50Var.f28278d0 = new w40(f50Var, surfaceTexture, i9, i10);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final d01 d01Var = (d01) this.f4589b;
                ArrayList arrayList = d01Var.f27622c;
                b01 b01Var = d01Var.f27620a;
                if (b01Var != null) {
                    b01Var.i();
                    d01Var.f27620a = null;
                }
                b01 b01Var2 = new b01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d01Var.invalidate();
                                return;
                            default:
                                d01 d01Var2 = d01Var;
                                Runnable runnable = d01Var2.d;
                                if (runnable != null) {
                                    d01Var2.f27623e = true;
                                    d01Var2.d = null;
                                    d01.b(runnable);
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
                                d01Var.invalidate();
                                return;
                            default:
                                d01 d01Var2 = d01Var;
                                Runnable runnable = d01Var2.d;
                                if (runnable != null) {
                                    d01Var2.f27623e = true;
                                    d01Var2.d = null;
                                    d01.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i9, i10);
                d01Var.f27620a = b01Var2;
                b01Var2.f26954a = EmuDetector.with(d01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        c01 c01Var = (c01) arrayList.get(i11);
                        Bitmap bitmap = c01Var.f27330e;
                        if (bitmap != null) {
                            d01Var.f27620a.c(c01Var.f27331f, bitmap, c01Var.f27329c, c01Var.d);
                        } else {
                            ArrayList arrayList2 = c01Var.f27328b;
                            if (arrayList2 != null) {
                                d01Var.f27620a.f(arrayList2, c01Var.d);
                            } else {
                                d01Var.f27620a.e(c01Var.f27327a, c01Var.f27332g, c01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(d01Var.f27621b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f4588a) {
            case 0:
                j jVar = ((k) this.f4589b).f4606f;
                if (jVar != null) {
                    jVar.f4590a = false;
                    ((k) this.f4589b).f4606f = null;
                    return true;
                }
                return true;
            case 1:
                f50 f50Var = (f50) this.f4589b;
                Camera2Session[] camera2SessionArr = f50Var.m0;
                w40 w40Var = f50Var.f28278d0;
                if (w40Var != null) {
                    w40Var.b(0L, 0, true, 0, 0);
                    f50Var.f28278d0 = null;
                }
                if (f50Var.f28286j0) {
                    for (int i9 = 0; i9 < camera2SessionArr.length; i9++) {
                        Camera2Session camera2Session = camera2SessionArr[i9];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i9] = null;
                        }
                    }
                    return true;
                } else if (f50Var.f28287k0 != null) {
                    CameraController.getInstance().close(f50Var.f28287k0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((pf0) this.f4589b).R.f35746s3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                d01 d01Var = (d01) this.f4589b;
                b01 b01Var = d01Var.f27620a;
                if (b01Var != null) {
                    b01Var.i();
                    d01Var.f27620a = null;
                }
                Runnable runnable = d01Var.d;
                if (runnable != null) {
                    d01Var.d = null;
                    d01.b(runnable);
                    return false;
                }
                return false;
            default:
                g81 g81Var = (g81) this.f4589b;
                TextureView textureView = g81Var.d;
                if (g81Var.O) {
                    if (g81Var.S) {
                        g81Var.f28705r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    g81Var.O = false;
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        Handler handler;
        switch (this.f4588a) {
            case 0:
                j jVar = ((k) this.f4589b).f4606f;
                if (jVar != null) {
                    synchronized (jVar.f4593e) {
                        jVar.f4594f = true;
                        jVar.h = i9;
                        jVar.f4595n = i10;
                    }
                    return;
                }
                return;
            case 1:
                w40 w40Var = ((f50) this.f4589b).f28278d0;
                if (w40Var != null) {
                    w40Var.B = i9;
                    w40Var.C = i10;
                    w40Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                b01 b01Var = ((d01) this.f4589b).f27620a;
                if (b01Var != null && (handler = b01Var.getHandler()) != null && b01Var.f26955b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i9, i10));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f4588a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                g81 g81Var = (g81) this.f4589b;
                if (g81Var.f28705r == 1) {
                    g81Var.f28704n.getViewTreeObserver().addOnPreDrawListener(new ca(this, 4));
                    g81Var.f28704n.invalidate();
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

    private final void a(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    private final void d(SurfaceTexture surfaceTexture, int i9, int i10) {
    }
}
