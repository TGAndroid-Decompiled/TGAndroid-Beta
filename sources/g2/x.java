package g2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import ei.z5;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.l4;
public final class x implements k51 {
    public static x f11915f;
    public boolean f11916a;
    public int f11917b;
    public final Object f11918c;
    public final Object d;
    public final Object f11919e;

    public x(ci.a aVar, com.google.android.gms.common.api.internal.o oVar, m6.c[] cVarArr, boolean z10, int i3) {
        this.f11919e = aVar;
        this.f11918c = oVar;
        this.d = cVarArr;
        this.f11916a = z10;
        this.f11917b = i3;
    }

    public static synchronized x a(Context context) {
        x xVar;
        synchronized (x.class) {
            try {
                if (f11915f == null) {
                    f11915f = new x(context);
                }
                xVar = f11915f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVar;
    }

    public int b() {
        int i3;
        synchronized (this.f11919e) {
            i3 = this.f11917b;
        }
        return i3;
    }

    public void c(int i3) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar.f11912a.get() == null) {
                copyOnWriteArrayList.remove(wVar);
            }
        }
        synchronized (this.f11919e) {
            try {
                if (this.f11916a && this.f11917b == i3) {
                    return;
                }
                this.f11916a = true;
                this.f11917b = i3;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    w wVar2 = (w) it2.next();
                    wVar2.f11913b.execute(new z5(wVar2, 15));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void onError(m51 m51Var, Exception exc) {
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        int i10 = this.f11917b;
        MediaController mediaController = (MediaController) this.f11919e;
        if (i10 != mediaController.f21330n0) {
            return;
        }
        MediaController.f(mediaController, (zi) this.f11918c, (int[]) this.d, this.f11916a, z10, i3);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = (MediaController) this.f11919e;
        if (mediaController.F0 != null) {
            int i3 = mediaController.J0;
            if (i3 == 2) {
                l4 l4Var = mediaController.M0;
                if (l4Var != null) {
                    if (mediaController.N0) {
                        l4Var.setDrawingReady(true);
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
            } else if (i3 == 1) {
                if (mediaController.K0 != null) {
                    if (mediaController.I0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.I0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.K0, new org.telegram.messenger.a(this, 16));
                        } catch (Exception unused) {
                            mediaController.I0 = null;
                        }
                    }
                    PipRoundVideoView pipRoundVideoView2 = mediaController.I0;
                    if (pipRoundVideoView2 != null) {
                        if (pipRoundVideoView2.f31499c.getSurfaceTexture() != surfaceTexture) {
                            mediaController.I0.f31499c.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.F0.A0(mediaController.I0.f31499c);
                    }
                }
                mediaController.J0 = 0;
                return true;
            } else if (PhotoViewer.F1() && PhotoViewer.v1().T2 != null) {
                PhotoViewer.v1().U2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        float f11;
        MediaController mediaController = (MediaController) this.f11919e;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = (i3 * f10) / i10;
        }
        mediaController.P0 = f11;
        l4 l4Var = mediaController.M0;
        if (l4Var != null) {
            l4Var.a(f11, 0);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        MediaController mediaController = (MediaController) this.f11919e;
        l4 l4Var = mediaController.M0;
        if (l4Var != null && !l4Var.d) {
            mediaController.N0 = true;
            l4Var.setDrawingReady(true);
            mediaController.O0.setTag(1);
        }
        if (mediaController.F0 == null || !d1.f.u()) {
            return;
        }
        mediaController.F0.t0(true);
    }

    public x(Context context) {
        Executor e10 = a.e();
        this.f11918c = e10;
        this.d = new CopyOnWriteArrayList();
        this.f11919e = new Object();
        this.f11917b = 0;
        e10.execute(new c(1, this, context));
    }

    public x(MediaController mediaController, int i3, zi ziVar, int[] iArr, boolean z10) {
        this.f11919e = mediaController;
        this.f11917b = i3;
        this.f11918c = ziVar;
        this.d = iArr;
        this.f11916a = z10;
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
