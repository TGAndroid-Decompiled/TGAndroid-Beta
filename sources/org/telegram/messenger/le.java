package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.PhotoViewer;
public final class le implements s61 {
    public final int f16727a;
    public final int f16728b;
    public final jj f16729c;
    public final MediaController d;

    public le(MediaController mediaController, int i10, jj jjVar, int i11) {
        this.f16727a = i11;
        this.d = mediaController;
        this.f16728b = i10;
        this.f16729c = jjVar;
    }

    @Override
    public final void onError(u61 u61Var, Exception exc) {
        switch (this.f16727a) {
            case 0:
                return;
            default:
                f8.g(exc, true);
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        int i10 = this.f16727a;
    }

    @Override
    public final void onSeekFinished(j2.a aVar) {
        int i10 = this.f16727a;
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        int i10 = this.f16727a;
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        int i11 = this.f16727a;
        int i12 = this.f16728b;
        switch (i11) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.R0;
                if (i12 == mediaController.m0) {
                    jj jjVar = this.f16729c;
                    if (i10 != 4 && ((i10 != 1 && i10 != 2) || !z10 || jjVar.f16299b0 < 0.999f)) {
                        u61 u61Var = mediaController.f14457i0;
                        if (u61Var != null && mediaController.f14480t0 != 0.0f && (i10 == 3 || i10 == 1)) {
                            mediaController.f14457i0.q0((int) (((float) u61Var.U()) * mediaController.f14480t0), false);
                            mediaController.f14480t0 = 0.0f;
                        }
                    } else {
                        jjVar.f16299b0 = 1.0f;
                        zs.f(jjVar.I1).k(148, Integer.valueOf(jjVar.f1()), 0);
                        if (!mediaController.a0()) {
                            if (!arrayList.isEmpty() && (arrayList.size() > 1 || !jj.R4(jjVar.f16337k))) {
                                mediaController.U(true);
                            } else {
                                mediaController.q(true, mediaController.F(), jj.R4(jjVar.f16337k), false);
                            }
                        }
                    }
                    if (mediaController.f14457i0 != null && b5.d.u()) {
                        mediaController.f14457i0.t0(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                MediaController mediaController2 = this.d;
                if (i12 == mediaController2.m0) {
                    MediaController.f(mediaController2, this.f16729c, null, true, z10, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f16727a) {
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
                            if (pipRoundVideoView2.f24078c.getSurfaceTexture() != surfaceTexture) {
                                mediaController.H0.f24078c.setSurfaceTexture(surfaceTexture);
                            }
                            mediaController.E0.A0(mediaController.H0.f24078c);
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
        int i10 = this.f16727a;
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        switch (this.f16727a) {
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
        switch (this.f16727a) {
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

    private final void a(u61 u61Var, Exception exc) {
    }

    private final void k(int i10, int i11, float f7, int i12) {
    }
}
