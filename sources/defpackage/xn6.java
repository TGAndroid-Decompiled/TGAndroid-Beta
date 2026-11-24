package defpackage;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.PhotoViewer;
public final class xn6 implements ldc {
    public final int a;
    public final k47 b;
    public final int[] c;
    public final boolean d;
    public final MediaController e;

    public xn6(MediaController mediaController, int i, k47 k47Var, int[] iArr, boolean z) {
        this.e = mediaController;
        this.a = i;
        this.b = k47Var;
        this.c = iArr;
        this.d = z;
    }

    @Override
    public final void onError(ndc ndcVar, Exception exc) {
        fc4.g(exc, true);
    }

    @Override
    public final void onRenderedFirstFrame() {
        MediaController mediaController = this.e;
        jy jyVar = mediaController.M0;
        if (jyVar != null && !jyVar.d) {
            mediaController.N0 = true;
            jyVar.setDrawingReady(true);
            mediaController.O0.setTag(1);
        }
        if (mediaController.F0 != null && fp.w()) {
            mediaController.F0.s0(true);
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        MediaController mediaController = this.e;
        if (this.a != mediaController.n0) {
            return;
        }
        mediaController.G0(this.b, this.c, this.d, z, i);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = this.e;
        if (mediaController.F0 != null) {
            byte b = mediaController.J0;
            if (b == 2) {
                jy jyVar = mediaController.M0;
                if (jyVar != null) {
                    if (mediaController.N0) {
                        jyVar.setDrawingReady(true);
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
                return true;
            } else if (b == 1) {
                if (mediaController.K0 != null) {
                    if (mediaController.I0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.I0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.K0, new pg6(this, (byte) 7));
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
                return true;
            } else if (PhotoViewer.C0() && PhotoViewer.r0().S2 != null) {
                PhotoViewer.r0().T2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        float f2;
        if (i2 == 0) {
            f2 = 1.0f;
        } else {
            f2 = (i * f) / i2;
        }
        MediaController mediaController = this.e;
        mediaController.P0 = f2;
        jy jyVar = mediaController.M0;
        if (jyVar != null) {
            jyVar.a(f2, 0);
        }
    }

    @Override
    public final void onSeekFinished(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
    }
}
