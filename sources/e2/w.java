package e2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.k4;
public final class w implements s61 {
    public static w f6201f;
    public boolean f6202a;
    public int f6203b;
    public final Object f6204c;
    public final Object d;
    public final Object e;

    public w(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = rVar;
        this.f6204c = pVar;
        this.d = cVarArr;
        this.f6202a = z10;
        this.f6203b = i10;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f6201f == null) {
                    f6201f = new w(context);
                }
                wVar = f6201f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.f6203b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f6198a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.f6202a && this.f6203b == i10) {
                    return;
                }
                this.f6202a = true;
                this.f6203b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.f6199b.execute(new a3.d(vVar2, 29));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void onError(u61 u61Var, Exception exc) {
        f8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        int i11 = this.f6203b;
        MediaController mediaController = (MediaController) this.e;
        if (i11 != mediaController.m0) {
            return;
        }
        MediaController.f(mediaController, (jj) this.f6204c, (int[]) this.d, this.f6202a, z10, i10);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = (MediaController) this.e;
        if (mediaController.E0 != null) {
            int i10 = mediaController.I0;
            if (i10 == 2) {
                k4 k4Var = mediaController.L0;
                if (k4Var != null) {
                    if (mediaController.M0) {
                        k4Var.setDrawingReady(true);
                    }
                    if (mediaController.L0.getParent() == null) {
                        mediaController.N0.addView(mediaController.L0);
                    }
                    if (mediaController.G0.getSurfaceTexture() != surfaceTexture) {
                        mediaController.G0.setSurfaceTexture(surfaceTexture);
                    }
                    mediaController.E0.A0(mediaController.G0);
                }
                mediaController.I0 = 0;
                return true;
            } else if (i10 == 1) {
                if (mediaController.J0 != null) {
                    if (mediaController.H0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.H0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.J0, new org.telegram.messenger.a(this, 16));
                        } catch (Exception unused) {
                            mediaController.H0 = null;
                        }
                    }
                    PipRoundVideoView pipRoundVideoView2 = mediaController.H0;
                    if (pipRoundVideoView2 != null) {
                        if (pipRoundVideoView2.f24078c.getSurfaceTexture() != surfaceTexture) {
                            mediaController.H0.f24078c.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.E0.A0(mediaController.H0.f24078c);
                    }
                }
                mediaController.I0 = 0;
                return true;
            } else if (PhotoViewer.F1() && PhotoViewer.v1().S2 != null) {
                PhotoViewer.v1().T2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        MediaController mediaController = (MediaController) this.e;
        if (i11 == 0) {
            f10 = 1.0f;
        } else {
            f10 = (i10 * f7) / i11;
        }
        mediaController.O0 = f10;
        k4 k4Var = mediaController.L0;
        if (k4Var != null) {
            k4Var.a(f10, 0);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        MediaController mediaController = (MediaController) this.e;
        k4 k4Var = mediaController.L0;
        if (k4Var != null && !k4Var.d) {
            mediaController.M0 = true;
            k4Var.setDrawingReady(true);
            mediaController.N0.setTag(1);
        }
        if (mediaController.E0 == null || !b5.d.u()) {
            return;
        }
        mediaController.E0.t0(true);
    }

    public w(Context context) {
        Executor e = a.e();
        this.f6204c = e;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f6203b = 0;
        e.execute(new d1.e(8, this, context));
    }

    public w(MediaController mediaController, int i10, jj jjVar, int[] iArr, boolean z10) {
        this.e = mediaController;
        this.f6203b = i10;
        this.f6204c = jjVar;
        this.d = iArr;
        this.f6202a = z10;
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
