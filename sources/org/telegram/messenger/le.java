package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t51;
import org.telegram.ui.PhotoViewer;
public final class le implements q51 {
    public final int f23884a;
    public final int f23885b;
    public final ij f23886c;
    public final MediaController d;

    public le(MediaController mediaController, int i7, ij ijVar, int i10) {
        this.f23884a = i10;
        this.d = mediaController;
        this.f23885b = i7;
        this.f23886c = ijVar;
    }

    @Override
    public final void onError(t51 t51Var, Exception exc) {
        switch (this.f23884a) {
            case 0:
                return;
            default:
                a8.g(exc, true);
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
        int i7 = this.f23884a;
    }

    @Override
    public final void onSeekFinished(m2.a aVar) {
        int i7 = this.f23884a;
    }

    @Override
    public final void onSeekStarted(m2.a aVar) {
        int i7 = this.f23884a;
    }

    @Override
    public final void onStateChanged(boolean z9, int i7) {
        int i10 = this.f23884a;
        int i11 = this.f23885b;
        switch (i10) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.R0;
                if (i11 == mediaController.m0) {
                    ij ijVar = this.f23886c;
                    if (i7 != 4 && ((i7 != 1 && i7 != 2) || !z9 || ijVar.f23222b0 < 0.999f)) {
                        t51 t51Var = mediaController.f21271i0;
                        if (t51Var != null && mediaController.f21293t0 != 0.0f && (i7 == 3 || i7 == 1)) {
                            mediaController.f21271i0.q0((int) (((float) t51Var.U()) * mediaController.f21293t0), false);
                            mediaController.f21293t0 = 0.0f;
                        }
                    } else {
                        ijVar.f23222b0 = 1.0f;
                        qs.f(ijVar.I1).k(148, Integer.valueOf(ijVar.f1()), 0);
                        if (!mediaController.a0()) {
                            if (!arrayList.isEmpty() && (arrayList.size() > 1 || !ij.S4(ijVar.f23262k))) {
                                mediaController.U(true);
                            } else {
                                mediaController.q(true, mediaController.F(), ij.S4(ijVar.f23262k), false);
                            }
                        }
                    }
                    if (mediaController.f21271i0 != null && d1.f.u()) {
                        mediaController.f21271i0.t0(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                MediaController mediaController2 = this.d;
                if (i11 == mediaController2.m0) {
                    MediaController.f(mediaController2, this.f23886c, null, true, z9, i7);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f23884a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.E0 == null) {
                    return false;
                }
                int i7 = mediaController.I0;
                if (i7 == 2) {
                    org.telegram.ui.j4 j4Var = mediaController.L0;
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
                } else if (i7 == 1) {
                    if (mediaController.J0 != null) {
                        if (mediaController.H0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.H0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.J0, new a(this, 16));
                            } catch (Exception unused) {
                                mediaController.H0 = null;
                            }
                        }
                        PipRoundVideoView pipRoundVideoView2 = mediaController.H0;
                        if (pipRoundVideoView2 != null) {
                            if (pipRoundVideoView2.f31428c.getSurfaceTexture() != surfaceTexture) {
                                mediaController.H0.f31428c.setSurfaceTexture(surfaceTexture);
                            }
                            mediaController.E0.A0(mediaController.H0.f31428c);
                        }
                    }
                    mediaController.I0 = 0;
                } else if (!PhotoViewer.A1() || PhotoViewer.p1().R2 == null) {
                    return false;
                } else {
                    PhotoViewer.p1().S2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i7 = this.f23884a;
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        switch (this.f23884a) {
            case 0:
                return;
            default:
                if (i10 == 0) {
                    f11 = 1.0f;
                } else {
                    f11 = (i7 * f10) / i10;
                }
                MediaController mediaController = this.d;
                mediaController.O0 = f11;
                org.telegram.ui.j4 j4Var = mediaController.L0;
                if (j4Var != null) {
                    j4Var.a(f11, 0);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f23884a) {
            case 0:
                return;
            default:
                MediaController mediaController = this.d;
                org.telegram.ui.j4 j4Var = mediaController.L0;
                if (j4Var == null || j4Var.d) {
                    return;
                }
                mediaController.M0 = true;
                j4Var.setDrawingReady(true);
                mediaController.N0.setTag(1);
                return;
        }
    }

    private final void b() {
    }

    private final void c(m2.a aVar) {
    }

    private final void d(m2.a aVar) {
    }

    private final void e(m2.a aVar) {
    }

    private final void f(m2.a aVar) {
    }

    private final void g(m2.a aVar) {
    }

    private final void h(m2.a aVar) {
    }

    private final void i(SurfaceTexture surfaceTexture) {
    }

    private final void j(SurfaceTexture surfaceTexture) {
    }

    private final void a(t51 t51Var, Exception exc) {
    }

    private final void k(int i7, int i10, float f10, int i11) {
    }
}
