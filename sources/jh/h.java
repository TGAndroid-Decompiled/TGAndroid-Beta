package jh;

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
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.z01;
import org.telegram.ui.Components.z50;
public final class h implements TextureView.SurfaceTextureListener {
    public final int f10108a;
    public final Object f10109b;

    public h(Object obj, int i10) {
        this.f10108a = i10;
        this.f10109b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f10108a) {
            case 0:
                j jVar = (j) this.f10109b;
                if (jVar.f10126f == null) {
                    i iVar = new i(jVar, surfaceTexture, i10, i11, new f(jVar, 1));
                    jVar.f10126f = iVar;
                    iVar.start();
                    return;
                }
                return;
            case 1:
                z50 z50Var = (z50) this.f10109b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (z50Var.f33740e0 == null && surfaceTexture != null && !z50Var.f33738d0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    z50Var.f33740e0 = new r50(z50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final b11 b11Var = (b11) this.f10109b;
                ArrayList arrayList = b11Var.f25457c;
                z01 z01Var = b11Var.f25455a;
                if (z01Var != null) {
                    z01Var.i();
                    b11Var.f25455a = null;
                }
                z01 z01Var2 = new z01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                b11Var.invalidate();
                                return;
                            default:
                                b11 b11Var2 = b11Var;
                                Runnable runnable = b11Var2.d;
                                if (runnable != null) {
                                    b11Var2.f25458e = true;
                                    b11Var2.d = null;
                                    b11.b(runnable);
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
                                b11Var.invalidate();
                                return;
                            default:
                                b11 b11Var2 = b11Var;
                                Runnable runnable = b11Var2.d;
                                if (runnable != null) {
                                    b11Var2.f25458e = true;
                                    b11Var2.d = null;
                                    b11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                b11Var.f25455a = z01Var2;
                z01Var2.f33677a = EmuDetector.with(b11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        a11 a11Var = (a11) arrayList.get(i12);
                        Bitmap bitmap = a11Var.f25116e;
                        if (bitmap != null) {
                            b11Var.f25455a.c(a11Var.f25117f, bitmap, a11Var.f25115c, a11Var.d);
                        } else {
                            ArrayList arrayList2 = a11Var.f25114b;
                            if (arrayList2 != null) {
                                b11Var.f25455a.f(arrayList2, a11Var.d);
                            } else {
                                b11Var.f25455a.e(a11Var.f25113a, a11Var.f25118g, a11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(b11Var.f25456b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f10108a) {
            case 0:
                i iVar = ((j) this.f10109b).f10126f;
                if (iVar != null) {
                    iVar.f10110a = false;
                    ((j) this.f10109b).f10126f = null;
                    return true;
                }
                return true;
            case 1:
                z50 z50Var = (z50) this.f10109b;
                Camera2Session[] camera2SessionArr = z50Var.f33750n0;
                r50 r50Var = z50Var.f33740e0;
                if (r50Var != null) {
                    r50Var.b(0L, 0, true, 0, 0);
                    z50Var.f33740e0 = null;
                }
                if (z50Var.f33747k0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (z50Var.f33748l0 != null) {
                    CameraController.getInstance().close(z50Var.f33748l0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((ng0) this.f10109b).S.f34396t3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                b11 b11Var = (b11) this.f10109b;
                z01 z01Var = b11Var.f25455a;
                if (z01Var != null) {
                    z01Var.i();
                    b11Var.f25455a = null;
                }
                Runnable runnable = b11Var.d;
                if (runnable != null) {
                    b11Var.d = null;
                    b11.b(runnable);
                    return false;
                }
                return false;
            default:
                f91 f91Var = (f91) this.f10109b;
                TextureView textureView = f91Var.d;
                if (f91Var.P) {
                    if (f91Var.T) {
                        f91Var.f26826r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    f91Var.P = false;
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f10108a) {
            case 0:
                i iVar = ((j) this.f10109b).f10126f;
                if (iVar != null) {
                    synchronized (iVar.f10113e) {
                        iVar.f10114f = true;
                        iVar.h = i10;
                        iVar.f10115n = i11;
                    }
                    return;
                }
                return;
            case 1:
                r50 r50Var = ((z50) this.f10109b).f33740e0;
                if (r50Var != null) {
                    r50Var.C = i10;
                    r50Var.D = i11;
                    r50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                z01 z01Var = ((b11) this.f10109b).f25455a;
                if (z01Var != null && (handler = z01Var.getHandler()) != null && z01Var.f33678b.get()) {
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
        switch (this.f10108a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                f91 f91Var = (f91) this.f10109b;
                if (f91Var.f26826r == 1) {
                    f91Var.f26825n.getViewTreeObserver().addOnPreDrawListener(new ba(this, 4));
                    f91Var.f26825n.invalidate();
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
