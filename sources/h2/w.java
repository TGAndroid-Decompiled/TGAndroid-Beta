package h2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import fi.v9;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.j4;
public final class w implements q51 {
    public static w f14156f;
    public boolean f14157a;
    public int f14158b;
    public final Object f14159c;
    public final Object d;
    public final Object f14160e;

    public w(bi.a aVar, com.google.android.gms.common.api.internal.o oVar, n6.c[] cVarArr, boolean z9, int i7) {
        this.f14160e = aVar;
        this.f14159c = oVar;
        this.d = cVarArr;
        this.f14157a = z9;
        this.f14158b = i7;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f14156f == null) {
                    f14156f = new w(context);
                }
                wVar = f14156f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i7;
        synchronized (this.f14160e) {
            i7 = this.f14158b;
        }
        return i7;
    }

    public void c(int i7) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f14153a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.f14160e) {
            try {
                if (this.f14157a && this.f14158b == i7) {
                    return;
                }
                this.f14157a = true;
                this.f14158b = i7;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.f14154b.execute(new v9(vVar2, 9));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void onError(t51 t51Var, Exception exc) {
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        int i10 = this.f14158b;
        MediaController mediaController = (MediaController) this.f14160e;
        if (i10 != mediaController.m0) {
            return;
        }
        MediaController.f(mediaController, (ij) this.f14159c, (int[]) this.d, this.f14157a, z9, i7);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = (MediaController) this.f14160e;
        if (mediaController.E0 != null) {
            int i7 = mediaController.I0;
            if (i7 == 2) {
                j4 j4Var = mediaController.L0;
                if (j4Var != null) {
                    if (mediaController.M0) {
                        j4Var.setDrawingReady(true);
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
            } else if (i7 == 1) {
                if (mediaController.J0 != null) {
                    if (mediaController.H0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.H0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.J0, new org.telegram.messenger.a(this, 17));
                        } catch (Exception unused) {
                            mediaController.H0 = null;
                        }
                    }
                    PipRoundVideoView pipRoundVideoView2 = mediaController.H0;
                    if (pipRoundVideoView2 != null) {
                        if (pipRoundVideoView2.f31444c.getSurfaceTexture() != surfaceTexture) {
                            mediaController.H0.f31444c.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.E0.A0(mediaController.H0.f31444c);
                    }
                }
                mediaController.I0 = 0;
                return true;
            } else if (PhotoViewer.A1() && PhotoViewer.p1().R2 != null) {
                PhotoViewer.p1().S2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        MediaController mediaController = (MediaController) this.f14160e;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = (i7 * f10) / i10;
        }
        mediaController.O0 = f11;
        j4 j4Var = mediaController.L0;
        if (j4Var != null) {
            j4Var.a(f11, 0);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        MediaController mediaController = (MediaController) this.f14160e;
        j4 j4Var = mediaController.L0;
        if (j4Var != null && !j4Var.d) {
            mediaController.M0 = true;
            j4Var.setDrawingReady(true);
            mediaController.N0.setTag(1);
        }
        if (mediaController.E0 == null || !d1.f.u()) {
            return;
        }
        mediaController.E0.t0(true);
    }

    public w(Context context) {
        Executor e10 = a.e();
        this.f14159c = e10;
        this.d = new CopyOnWriteArrayList();
        this.f14160e = new Object();
        this.f14158b = 0;
        e10.execute(new f2.h(25, context, (Object) this));
    }

    public w(MediaController mediaController, int i7, ij ijVar, int[] iArr, boolean z9) {
        this.f14160e = mediaController;
        this.f14158b = i7;
        this.f14159c = ijVar;
        this.d = iArr;
        this.f14157a = z9;
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
