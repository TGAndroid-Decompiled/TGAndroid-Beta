package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.PhotoViewer;
public final class me implements t61 {
    public final int f17111a;
    public final int f17112b;
    public final kj f17113c;
    public final MediaController d;

    public me(MediaController mediaController, int i10, kj kjVar, int i11) {
        this.f17111a = i11;
        this.d = mediaController;
        this.f17112b = i10;
        this.f17113c = kjVar;
    }

    @Override
    public final void onError(v61 v61Var, Exception exc) {
        switch (this.f17111a) {
            case 0:
                return;
            default:
                f8.g(exc, true);
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        int i10 = this.f17111a;
    }

    @Override
    public final void onSeekFinished(j2.a aVar) {
        int i10 = this.f17111a;
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        int i10 = this.f17111a;
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        int i11 = this.f17111a;
        int i12 = this.f17112b;
        switch (i11) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.R0;
                if (i12 == mediaController.m0) {
                    kj kjVar = this.f17113c;
                    if (i10 != 4 && ((i10 != 1 && i10 != 2) || !z10 || kjVar.f16652b0 < 0.999f)) {
                        v61 v61Var = mediaController.f14458i0;
                        if (v61Var != null && mediaController.f14481t0 != 0.0f && (i10 == 3 || i10 == 1)) {
                            mediaController.f14458i0.q0((int) (((float) v61Var.U()) * mediaController.f14481t0), false);
                            mediaController.f14481t0 = 0.0f;
                        }
                    } else {
                        kjVar.f16652b0 = 1.0f;
                        at.f(kjVar.I1).k(148, Integer.valueOf(kjVar.f1()), 0);
                        if (!mediaController.a0()) {
                            if (!arrayList.isEmpty() && (arrayList.size() > 1 || !kj.R4(kjVar.f16690k))) {
                                mediaController.U(true);
                            } else {
                                mediaController.q(true, mediaController.F(), kj.R4(kjVar.f16690k), false);
                            }
                        }
                    }
                    if (mediaController.f14458i0 != null && b5.d.u()) {
                        mediaController.f14458i0.t0(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                MediaController mediaController2 = this.d;
                if (i12 == mediaController2.m0) {
                    MediaController.f(mediaController2, this.f17113c, null, true, z10, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f17111a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.E0 == null) {
                    return false;
                }
                int i10 = mediaController.I0;
                if (i10 == 2) {
                    org.telegram.ui.k4 k4Var = mediaController.L0;
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
                } else if (i10 == 1) {
                    if (mediaController.J0 != null) {
                        if (mediaController.H0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.H0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.J0, new a(this, 15));
                            } catch (Exception unused) {
                                mediaController.H0 = null;
                            }
                        }
                        PipRoundVideoView pipRoundVideoView2 = mediaController.H0;
                        if (pipRoundVideoView2 != null) {
                            if (pipRoundVideoView2.f24079c.getSurfaceTexture() != surfaceTexture) {
                                mediaController.H0.f24079c.setSurfaceTexture(surfaceTexture);
                            }
                            mediaController.E0.A0(mediaController.H0.f24079c);
                        }
                    }
                    mediaController.I0 = 0;
                } else if (!PhotoViewer.F1() || PhotoViewer.v1().S2 == null) {
                    return false;
                } else {
                    PhotoViewer.v1().T2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i10 = this.f17111a;
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        switch (this.f17111a) {
            case 0:
                return;
            default:
                if (i11 == 0) {
                    f10 = 1.0f;
                } else {
                    f10 = (i10 * f7) / i11;
                }
                MediaController mediaController = this.d;
                mediaController.O0 = f10;
                org.telegram.ui.k4 k4Var = mediaController.L0;
                if (k4Var != null) {
                    k4Var.a(f10, 0);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f17111a) {
            case 0:
                return;
            default:
                MediaController mediaController = this.d;
                org.telegram.ui.k4 k4Var = mediaController.L0;
                if (k4Var == null || k4Var.d) {
                    return;
                }
                mediaController.M0 = true;
                k4Var.setDrawingReady(true);
                mediaController.N0.setTag(1);
                return;
        }
    }

    private final void b() {
    }

    private final void c(j2.a aVar) {
    }

    private final void d(j2.a aVar) {
    }

    private final void e(j2.a aVar) {
    }

    private final void f(j2.a aVar) {
    }

    private final void g(j2.a aVar) {
    }

    private final void h(j2.a aVar) {
    }

    private final void i(SurfaceTexture surfaceTexture) {
    }

    private final void j(SurfaceTexture surfaceTexture) {
    }

    private final void a(v61 v61Var, Exception exc) {
    }

    private final void k(int i10, int i11, float f7, int i12) {
    }
}
