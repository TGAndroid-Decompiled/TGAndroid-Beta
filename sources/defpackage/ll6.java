package defpackage;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.PhotoViewer;
public final class ll6 implements ibc {
    public final byte a;
    public final int b;
    public final k27 c;
    public final MediaController d;

    public ll6(MediaController mediaController, int i, k27 k27Var, byte b) {
        this.a = b;
        this.d = mediaController;
        this.b = i;
        this.c = k27Var;
    }

    @Override
    public final void onError(lbc lbcVar, Exception exc) {
        switch (this.a) {
            case 0:
                return;
            default:
                fa4.g(exc, true);
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                return;
            default:
                MediaController mediaController = this.d;
                ix ixVar = mediaController.M0;
                if (ixVar != null && !ixVar.d) {
                    mediaController.N0 = true;
                    ixVar.setDrawingReady(true);
                    mediaController.O0.setTag(1);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSeekFinished(tj tjVar) {
        byte b = this.a;
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
        byte b = this.a;
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        byte b = this.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.S0;
                if (i2 == mediaController.n0) {
                    k27 k27Var = this.c;
                    if (i != 4 && ((i != 1 && i != 2) || !z || k27Var.b0 < 0.999f)) {
                        lbc lbcVar = mediaController.j0;
                        if (lbcVar != null && mediaController.u0 != 0.0f && (i == 3 || i == 1)) {
                            mediaController.j0.p0((int) (((float) lbcVar.U()) * mediaController.u0), false);
                            mediaController.u0 = 0.0f;
                        }
                    } else {
                        k27Var.b0 = 1.0f;
                        kk7.f(k27Var.K1).k(148, Integer.valueOf(k27Var.e1()), 0);
                        if (!mediaController.Z()) {
                            if (!arrayList.isEmpty() && (arrayList.size() > 1 || !k27.Q4(k27Var.k))) {
                                mediaController.T(true);
                            } else {
                                mediaController.l(true, mediaController.A(), k27.Q4(k27Var.k), false);
                            }
                        }
                    }
                    if (mediaController.j0 != null && fo.w()) {
                        mediaController.j0.s0(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                MediaController mediaController2 = this.d;
                if (i2 == mediaController2.n0) {
                    mediaController2.G0(this.c, null, true, z, i);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.F0 == null) {
                    return false;
                }
                byte b = mediaController.J0;
                if (b == 2) {
                    ix ixVar = mediaController.M0;
                    if (ixVar != null) {
                        if (mediaController.N0) {
                            ixVar.setDrawingReady(true);
                        }
                        if (mediaController.M0.getParent() == null) {
                            mediaController.O0.addView(mediaController.M0);
                        }
                        if (mediaController.H0.getSurfaceTexture() != surfaceTexture) {
                            mediaController.H0.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.F0.z0(mediaController.H0);
                    }
                    mediaController.J0 = (byte) 0;
                } else if (b == 1) {
                    if (mediaController.K0 != null) {
                        if (mediaController.I0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.I0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.K0, new tp5(this, (byte) 29));
                            } catch (Exception unused) {
                                mediaController.I0 = null;
                            }
                        }
                        PipRoundVideoView pipRoundVideoView2 = mediaController.I0;
                        if (pipRoundVideoView2 != null) {
                            if (pipRoundVideoView2.c.getSurfaceTexture() != surfaceTexture) {
                                mediaController.I0.c.setSurfaceTexture(surfaceTexture);
                            }
                            mediaController.F0.z0(mediaController.I0.c);
                        }
                    }
                    mediaController.J0 = (byte) 0;
                } else if (!PhotoViewer.C0() || PhotoViewer.r0().S2 == null) {
                    return false;
                } else {
                    PhotoViewer.r0().T2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        byte b = this.a;
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        float f2;
        switch (this.a) {
            case 0:
                return;
            default:
                if (i2 == 0) {
                    f2 = 1.0f;
                } else {
                    f2 = (i * f) / i2;
                }
                MediaController mediaController = this.d;
                mediaController.P0 = f2;
                ix ixVar = mediaController.M0;
                if (ixVar != null) {
                    ixVar.a(f2, 0);
                    return;
                }
                return;
        }
    }

    private final void b() {
    }

    private final void c(tj tjVar) {
    }

    private final void d(tj tjVar) {
    }

    private final void e(tj tjVar) {
    }

    private final void f(tj tjVar) {
    }

    private final void g(tj tjVar) {
    }

    private final void h(tj tjVar) {
    }

    private final void i(SurfaceTexture surfaceTexture) {
    }

    private final void j(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
        byte b = this.a;
    }

    private final void a(lbc lbcVar, Exception exc) {
    }

    private final void k(int i, int i2, float f, int i3) {
    }
}
