package gh;

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
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.s81;
public final class h implements TextureView.SurfaceTextureListener {
    public final int f7378a;
    public final Object f7379b;

    public h(Object obj, int i10) {
        this.f7378a = i10;
        this.f7379b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f7378a) {
            case 0:
                j jVar = (j) this.f7379b;
                if (jVar.f7396f == null) {
                    i iVar = new i(jVar, surfaceTexture, i10, i11, new f(jVar, 1));
                    jVar.f7396f = iVar;
                    iVar.start();
                    return;
                }
                return;
            case 1:
                s50 s50Var = (s50) this.f7379b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (s50Var.f32499d0 == null && surfaceTexture != null && !s50Var.f32498c0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    s50Var.f32499d0 = new k50(s50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final p01 p01Var = (p01) this.f7379b;
                ArrayList arrayList = p01Var.f31535c;
                n01 n01Var = p01Var.f31533a;
                if (n01Var != null) {
                    n01Var.i();
                    p01Var.f31533a = null;
                }
                n01 n01Var2 = new n01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p01Var.invalidate();
                                return;
                            default:
                                p01 p01Var2 = p01Var;
                                Runnable runnable = p01Var2.d;
                                if (runnable != null) {
                                    p01Var2.f31536e = true;
                                    p01Var2.d = null;
                                    p01.b(runnable);
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
                                p01Var.invalidate();
                                return;
                            default:
                                p01 p01Var2 = p01Var;
                                Runnable runnable = p01Var2.d;
                                if (runnable != null) {
                                    p01Var2.f31536e = true;
                                    p01Var2.d = null;
                                    p01.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                p01Var.f31533a = n01Var2;
                n01Var2.f30800a = EmuDetector.with(p01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        o01 o01Var = (o01) arrayList.get(i12);
                        Bitmap bitmap = o01Var.f31219e;
                        if (bitmap != null) {
                            p01Var.f31533a.c(o01Var.f31220f, bitmap, o01Var.f31218c, o01Var.d);
                        } else {
                            ArrayList arrayList2 = o01Var.f31217b;
                            if (arrayList2 != null) {
                                p01Var.f31533a.f(arrayList2, o01Var.d);
                            } else {
                                p01Var.f31533a.e(o01Var.f31216a, o01Var.f31221g, o01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(p01Var.f31534b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f7378a) {
            case 0:
                i iVar = ((j) this.f7379b).f7396f;
                if (iVar != null) {
                    iVar.f7380a = false;
                    ((j) this.f7379b).f7396f = null;
                    return true;
                }
                return true;
            case 1:
                s50 s50Var = (s50) this.f7379b;
                Camera2Session[] camera2SessionArr = s50Var.m0;
                k50 k50Var = s50Var.f32499d0;
                if (k50Var != null) {
                    k50Var.b(0L, 0, true, 0, 0);
                    s50Var.f32499d0 = null;
                }
                if (s50Var.f32507j0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (s50Var.f32508k0 != null) {
                    CameraController.getInstance().close(s50Var.f32508k0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((bg0) this.f7379b).R.f35812s3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                p01 p01Var = (p01) this.f7379b;
                n01 n01Var = p01Var.f31533a;
                if (n01Var != null) {
                    n01Var.i();
                    p01Var.f31533a = null;
                }
                Runnable runnable = p01Var.d;
                if (runnable != null) {
                    p01Var.d = null;
                    p01.b(runnable);
                    return false;
                }
                return false;
            default:
                s81 s81Var = (s81) this.f7379b;
                TextureView textureView = s81Var.d;
                if (s81Var.O) {
                    if (s81Var.S) {
                        s81Var.f32582r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    s81Var.O = false;
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f7378a) {
            case 0:
                i iVar = ((j) this.f7379b).f7396f;
                if (iVar != null) {
                    synchronized (iVar.f7383e) {
                        iVar.f7384f = true;
                        iVar.h = i10;
                        iVar.f7385n = i11;
                    }
                    return;
                }
                return;
            case 1:
                k50 k50Var = ((s50) this.f7379b).f32499d0;
                if (k50Var != null) {
                    k50Var.B = i10;
                    k50Var.C = i11;
                    k50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                n01 n01Var = ((p01) this.f7379b).f31533a;
                if (n01Var != null && (handler = n01Var.getHandler()) != null && n01Var.f30801b.get()) {
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
        switch (this.f7378a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                s81 s81Var = (s81) this.f7379b;
                if (s81Var.f32582r == 1) {
                    s81Var.f32581n.getViewTreeObserver().addOnPreDrawListener(new z9(this, 4));
                    s81Var.f32581n.invalidate();
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
