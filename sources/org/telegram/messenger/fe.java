package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;
public final class fe implements k51 {
    public final int f22480a;
    public final int f22481b;
    public final zi f22482c;
    public final MediaController d;

    public fe(MediaController mediaController, int i3, zi ziVar, int i10) {
        this.f22480a = i10;
        this.d = mediaController;
        this.f22481b = i3;
        this.f22482c = ziVar;
    }

    @Override
    public final void onError(m51 m51Var, Exception exc) {
        switch (this.f22480a) {
            case 0:
                return;
            default:
                a8.g(exc, true);
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame(l2.a aVar) {
        int i3 = this.f22480a;
    }

    @Override
    public final void onSeekFinished(l2.a aVar) {
        int i3 = this.f22480a;
    }

    @Override
    public final void onSeekStarted(l2.a aVar) {
        int i3 = this.f22480a;
    }

    @Override
    public final void onStateChanged(boolean z10, int i3) {
        int i10 = this.f22480a;
        int i11 = this.f22481b;
        switch (i10) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.S0;
                if (i11 == mediaController.f21330n0) {
                    zi ziVar = this.f22482c;
                    if (i3 != 4 && ((i3 != 1 && i3 != 2) || !z10 || ziVar.f26828b0 < 0.999f)) {
                        m51 m51Var = mediaController.f21324j0;
                        if (m51Var != null && mediaController.f21346u0 != 0.0f && (i3 == 3 || i3 == 1)) {
                            mediaController.f21324j0.q0((int) (((float) m51Var.U()) * mediaController.f21346u0), false);
                            mediaController.f21346u0 = 0.0f;
                        }
                    } else {
                        ziVar.f26828b0 = 1.0f;
                        hs.f(ziVar.I1).k(148, Integer.valueOf(ziVar.f1()), 0);
                        if (!mediaController.a0()) {
                            if (!arrayList.isEmpty() && (arrayList.size() > 1 || !zi.S4(ziVar.f26868k))) {
                                mediaController.U(true);
                            } else {
                                mediaController.q(true, mediaController.F(), zi.S4(ziVar.f26868k), false);
                            }
                        }
                    }
                    if (mediaController.f21324j0 != null && d1.f.u()) {
                        mediaController.f21324j0.t0(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                MediaController mediaController2 = this.d;
                if (i11 == mediaController2.f21330n0) {
                    MediaController.f(mediaController2, this.f22482c, null, true, z10, i3);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f22480a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.F0 == null) {
                    return false;
                }
                int i3 = mediaController.J0;
                if (i3 == 2) {
                    org.telegram.ui.l4 l4Var = mediaController.M0;
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
                } else if (i3 == 1) {
                    if (mediaController.K0 != null) {
                        if (mediaController.I0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.I0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.K0, new a(this, 15));
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
                } else if (!PhotoViewer.F1() || PhotoViewer.v1().T2 == null) {
                    return false;
                } else {
                    PhotoViewer.v1().U2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i3 = this.f22480a;
    }

    @Override
    public final void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        float f11;
        switch (this.f22480a) {
            case 0:
                return;
            default:
                if (i10 == 0) {
                    f11 = 1.0f;
                } else {
                    f11 = (i3 * f10) / i10;
                }
                MediaController mediaController = this.d;
                mediaController.P0 = f11;
                org.telegram.ui.l4 l4Var = mediaController.M0;
                if (l4Var != null) {
                    l4Var.a(f11, 0);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f22480a) {
            case 0:
                return;
            default:
                MediaController mediaController = this.d;
                org.telegram.ui.l4 l4Var = mediaController.M0;
                if (l4Var == null || l4Var.d) {
                    return;
                }
                mediaController.N0 = true;
                l4Var.setDrawingReady(true);
                mediaController.O0.setTag(1);
                return;
        }
    }

    private final void b() {
    }

    private final void c(l2.a aVar) {
    }

    private final void d(l2.a aVar) {
    }

    private final void e(l2.a aVar) {
    }

    private final void f(l2.a aVar) {
    }

    private final void g(l2.a aVar) {
    }

    private final void h(l2.a aVar) {
    }

    private final void i(SurfaceTexture surfaceTexture) {
    }

    private final void j(SurfaceTexture surfaceTexture) {
    }

    private final void a(m51 m51Var, Exception exc) {
    }

    private final void k(int i3, int i10, float f10, int i11) {
    }
}
