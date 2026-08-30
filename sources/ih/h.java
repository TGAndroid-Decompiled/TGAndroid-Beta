package ih;

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
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;
public final class h implements TextureView.SurfaceTextureListener {
    public final int f7580a;
    public final Object f7581b;

    public h(Object obj, int i10) {
        this.f7580a = i10;
        this.f7581b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f7580a) {
            case 0:
                j jVar = (j) this.f7581b;
                if (jVar.f7596f == null) {
                    i iVar = new i(jVar, surfaceTexture, i10, i11, new f(jVar, 1));
                    jVar.f7596f = iVar;
                    iVar.start();
                    return;
                }
                return;
            case 1:
                x50 x50Var = (x50) this.f7581b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (x50Var.f30553e0 == null && surfaceTexture != null && !x50Var.f30552d0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    x50Var.f30553e0 = new p50(x50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                final a11 a11Var = (a11) this.f7581b;
                ArrayList arrayList = a11Var.f23264c;
                y01 y01Var = a11Var.f23262a;
                if (y01Var != null) {
                    y01Var.i();
                    a11Var.f23262a = null;
                }
                y01 y01Var2 = new y01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                a11Var.invalidate();
                                return;
                            default:
                                a11 a11Var2 = a11Var;
                                Runnable runnable = a11Var2.d;
                                if (runnable != null) {
                                    a11Var2.e = true;
                                    a11Var2.d = null;
                                    a11.b(runnable);
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
                                a11Var.invalidate();
                                return;
                            default:
                                a11 a11Var2 = a11Var;
                                Runnable runnable = a11Var2.d;
                                if (runnable != null) {
                                    a11Var2.e = true;
                                    a11Var2.d = null;
                                    a11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                a11Var.f23262a = y01Var2;
                y01Var2.f30810a = EmuDetector.with(a11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        z01 z01Var = (z01) arrayList.get(i12);
                        Bitmap bitmap = z01Var.e;
                        if (bitmap != null) {
                            a11Var.f23262a.c(z01Var.f31200f, bitmap, z01Var.f31199c, z01Var.d);
                        } else {
                            ArrayList arrayList2 = z01Var.f31198b;
                            if (arrayList2 != null) {
                                a11Var.f23262a.f(arrayList2, z01Var.d);
                            } else {
                                a11Var.f23262a.e(z01Var.f31197a, z01Var.f31201g, z01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(a11Var.f23263b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f7580a) {
            case 0:
                i iVar = ((j) this.f7581b).f7596f;
                if (iVar != null) {
                    iVar.f7582a = false;
                    ((j) this.f7581b).f7596f = null;
                    return true;
                }
                return true;
            case 1:
                x50 x50Var = (x50) this.f7581b;
                Camera2Session[] camera2SessionArr = x50Var.f30563n0;
                p50 p50Var = x50Var.f30553e0;
                if (p50Var != null) {
                    p50Var.b(0L, 0, true, 0, 0);
                    x50Var.f30553e0 = null;
                }
                if (x50Var.f30560k0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (x50Var.f30561l0 != null) {
                    CameraController.getInstance().close(x50Var.f30561l0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 2:
                ((lg0) this.f7581b).S.f31870t3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                a11 a11Var = (a11) this.f7581b;
                y01 y01Var = a11Var.f23262a;
                if (y01Var != null) {
                    y01Var.i();
                    a11Var.f23262a = null;
                }
                Runnable runnable = a11Var.d;
                if (runnable != null) {
                    a11Var.d = null;
                    a11.b(runnable);
                    return false;
                }
                return false;
            default:
                e91 e91Var = (e91) this.f7581b;
                TextureView textureView = e91Var.d;
                if (e91Var.P) {
                    if (e91Var.T) {
                        e91Var.f24537r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    e91Var.P = false;
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f7580a) {
            case 0:
                i iVar = ((j) this.f7581b).f7596f;
                if (iVar != null) {
                    synchronized (iVar.e) {
                        iVar.f7585f = true;
                        iVar.h = i10;
                        iVar.f7586n = i11;
                    }
                    return;
                }
                return;
            case 1:
                p50 p50Var = ((x50) this.f7581b).f30553e0;
                if (p50Var != null) {
                    p50Var.C = i10;
                    p50Var.D = i11;
                    p50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                y01 y01Var = ((a11) this.f7581b).f23262a;
                if (y01Var != null && (handler = y01Var.getHandler()) != null && y01Var.f30811b.get()) {
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
        switch (this.f7580a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                e91 e91Var = (e91) this.f7581b;
                if (e91Var.f24537r == 1) {
                    e91Var.f24536n.getViewTreeObserver().addOnPreDrawListener(new ba(this, 4));
                    e91Var.f24536n.invalidate();
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
