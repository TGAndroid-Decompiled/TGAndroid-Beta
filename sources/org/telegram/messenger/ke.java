package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.PhotoViewer;
public final class ke implements g61 {
    public final int f25059a;
    public final int f25060b;
    public final gj f25061c;
    public final MediaController d;

    public ke(MediaController mediaController, int i7, gj gjVar, int i10) {
        this.f25059a = i10;
        this.d = mediaController;
        this.f25060b = i7;
        this.f25061c = gjVar;
    }

    @Override
    public final void onError(i61 i61Var, Exception exc) {
        switch (this.f25059a) {
            case 0:
                return;
            default:
                a8.g(exc, true);
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
        int i7 = this.f25059a;
    }

    @Override
    public final void onSeekFinished(m2.a aVar) {
        int i7 = this.f25059a;
    }

    @Override
    public final void onSeekStarted(m2.a aVar) {
        int i7 = this.f25059a;
    }

    @Override
    public final void onStateChanged(boolean z10, int i7) {
        int i10 = this.f25059a;
        int i11 = this.f25060b;
        switch (i10) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.S0;
                if (i11 == mediaController.f22754n0) {
                    gj gjVar = this.f25061c;
                    if (i7 != 4 && ((i7 != 1 && i7 != 2) || !z10 || gjVar.f24173b0 < 0.999f)) {
                        i61 i61Var = mediaController.f22747j0;
                        if (i61Var != null && mediaController.f22769u0 != 0.0f && (i7 == 3 || i7 == 1)) {
                            mediaController.f22747j0.q0((int) (((float) i61Var.U()) * mediaController.f22769u0), false);
                            mediaController.f22769u0 = 0.0f;
                        }
                    } else {
                        gjVar.f24173b0 = 1.0f;
                        ls.f(gjVar.K1).k(148, Integer.valueOf(gjVar.e1()), 0);
                        if (!mediaController.a0()) {
                            if (!arrayList.isEmpty() && (arrayList.size() > 1 || !gj.R4(gjVar.f24213k))) {
                                mediaController.U(true);
                            } else {
                                mediaController.q(true, mediaController.F(), gj.R4(gjVar.f24213k), false);
                            }
                        }
                    }
                    if (mediaController.f22747j0 != null && d1.f.u()) {
                        mediaController.f22747j0.t0(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                MediaController mediaController2 = this.d;
                if (i11 == mediaController2.f22754n0) {
                    MediaController.f(mediaController2, this.f25061c, null, true, z10, i7);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f25059a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.F0 == null) {
                    return false;
                }
                int i7 = mediaController.J0;
                if (i7 == 2) {
                    org.telegram.ui.j4 j4Var = mediaController.M0;
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
                } else if (i7 == 1) {
                    if (mediaController.K0 != null) {
                        if (mediaController.I0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.I0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.K0, new a(this, 16));
                            } catch (Exception unused) {
                                mediaController.I0 = null;
                            }
                        }
                        PipRoundVideoView pipRoundVideoView2 = mediaController.I0;
                        if (pipRoundVideoView2 != null) {
                            if (pipRoundVideoView2.f33039c.getSurfaceTexture() != surfaceTexture) {
                                mediaController.I0.f33039c.setSurfaceTexture(surfaceTexture);
                            }
                            mediaController.F0.A0(mediaController.I0.f33039c);
                        }
                    }
                    mediaController.J0 = 0;
                } else if (!PhotoViewer.A1() || PhotoViewer.p1().S2 == null) {
                    return false;
                } else {
                    PhotoViewer.p1().T2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i7 = this.f25059a;
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        switch (this.f25059a) {
            case 0:
                return;
            default:
                if (i10 == 0) {
                    f11 = 1.0f;
                } else {
                    f11 = (i7 * f10) / i10;
                }
                MediaController mediaController = this.d;
                mediaController.P0 = f11;
                org.telegram.ui.j4 j4Var = mediaController.M0;
                if (j4Var != null) {
                    j4Var.a(f11, 0);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f25059a) {
            case 0:
                return;
            default:
                MediaController mediaController = this.d;
                org.telegram.ui.j4 j4Var = mediaController.M0;
                if (j4Var == null || j4Var.d) {
                    return;
                }
                mediaController.N0 = true;
                j4Var.setDrawingReady(true);
                mediaController.O0.setTag(1);
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

    private final void a(i61 i61Var, Exception exc) {
    }

    private final void k(int i7, int i10, float f10, int i11) {
    }
}
