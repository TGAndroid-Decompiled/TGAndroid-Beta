package h2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import fi.c1;
import fi.f6;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.j4;
public final class w implements s51 {
    public static w f13513f;
    public boolean f13514a;
    public int f13515b;
    public final Object f13516c;
    public final Object d;
    public final Object f13517e;

    public w(com.google.android.gms.common.api.internal.p pVar, com.google.android.gms.common.api.internal.o oVar, n6.c[] cVarArr, boolean z10, int i7) {
        this.f13517e = pVar;
        this.f13516c = oVar;
        this.d = cVarArr;
        this.f13514a = z10;
        this.f13515b = i7;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f13513f == null) {
                    f13513f = new w(context);
                }
                wVar = f13513f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i7;
        synchronized (this.f13517e) {
            i7 = this.f13515b;
        }
        return i7;
    }

    public void c(int i7) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f13510a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.f13517e) {
            try {
                if (this.f13514a && this.f13515b == i7) {
                    return;
                }
                this.f13514a = true;
                this.f13515b = i7;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.f13511b.execute(new c1(vVar2, 24));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void onError(u51 u51Var, Exception exc) {
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        int i10 = this.f13515b;
        MediaController mediaController = (MediaController) this.f13517e;
        if (i10 != mediaController.f22360n0) {
            return;
        }
        MediaController.f(mediaController, (gj) this.f13516c, (int[]) this.d, this.f13514a, z10, i7);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = (MediaController) this.f13517e;
        if (mediaController.F0 != null) {
            int i7 = mediaController.J0;
            if (i7 == 2) {
                j4 j4Var = mediaController.M0;
                if (j4Var != null) {
                    if (mediaController.N0) {
                        j4Var.setDrawingReady(true);
                    }
                    if (mediaController.M0.getParent() == null) {
                        mediaController.O0.addView(mediaController.M0);
                    }
                    if (mediaController.H0.getSurfaceTexture() != surfaceTexture) {
                        mediaController.H0.setSurfaceTexture(surfaceTexture);
                    }
                    mediaController.F0.A0(mediaController.H0);
                }
                mediaController.J0 = 0;
                return true;
            } else if (i7 == 1) {
                if (mediaController.K0 != null) {
                    if (mediaController.I0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.I0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.K0, new org.telegram.messenger.a(this, 17));
                        } catch (Exception unused) {
                            mediaController.I0 = null;
                        }
                    }
                    PipRoundVideoView pipRoundVideoView2 = mediaController.I0;
                    if (pipRoundVideoView2 != null) {
                        if (pipRoundVideoView2.f32606c.getSurfaceTexture() != surfaceTexture) {
                            mediaController.I0.f32606c.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.F0.A0(mediaController.I0.f32606c);
                    }
                }
                mediaController.J0 = 0;
                return true;
            } else if (PhotoViewer.A1() && PhotoViewer.p1().S2 != null) {
                PhotoViewer.p1().T2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        MediaController mediaController = (MediaController) this.f13517e;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = (i7 * f10) / i10;
        }
        mediaController.P0 = f11;
        j4 j4Var = mediaController.M0;
        if (j4Var != null) {
            j4Var.a(f11, 0);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        MediaController mediaController = (MediaController) this.f13517e;
        j4 j4Var = mediaController.M0;
        if (j4Var != null && !j4Var.d) {
            mediaController.N0 = true;
            j4Var.setDrawingReady(true);
            mediaController.O0.setTag(1);
        }
        if (mediaController.F0 == null || !d1.f.u()) {
            return;
        }
        mediaController.F0.t0(true);
    }

    public w(Context context) {
        Executor e10 = a.e();
        this.f13516c = e10;
        this.d = new CopyOnWriteArrayList();
        this.f13517e = new Object();
        this.f13515b = 0;
        e10.execute(new f6(20, this, context));
    }

    public w(MediaController mediaController, int i7, gj gjVar, int[] iArr, boolean z10) {
        this.f13517e = mediaController;
        this.f13515b = i7;
        this.f13516c = gjVar;
        this.d = iArr;
        this.f13514a = z10;
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
