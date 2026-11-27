package defpackage;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class co6 implements ifc {
    public final int a;
    public final r47 b;
    public final int[] c;
    public final boolean d;
    public final MediaController e;

    public co6(MediaController mediaController, int i, r47 r47Var, int[] iArr, boolean z) {
        this.e = mediaController;
        this.a = i;
        this.b = r47Var;
        this.c = iArr;
        this.d = z;
    }

    @Override
    public final void onError(kfc kfcVar, Exception exc) {
        cc4.g(exc, true);
    }

    @Override
    public final void onRenderedFirstFrame() {
        String[] strArr = MediaController.W1;
        MediaController mediaController = this.e;
        mediaController.E();
        jx jxVar = mediaController.M0;
        if (jxVar != null && !jxVar.d) {
            mediaController.N0 = true;
            jxVar.setDrawingReady(true);
            mediaController.O0.setTag(1);
        }
        if (mediaController.F0 != null && go.w()) {
            mediaController.F0.s0(true);
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        MediaController mediaController = this.e;
        if (this.a != mediaController.n0) {
            return;
        }
        mediaController.L0(this.b, this.c, this.d, z, i);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.e.F0 == null || !PhotoViewer.C0() || PhotoViewer.q0().S2 == null) {
            return false;
        }
        PhotoViewer.q0().T2 = surfaceTexture;
        return true;
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
        jx jxVar = mediaController.M0;
        if (jxVar != null) {
            jxVar.a(f2, 0);
        }
    }

    @Override
    public final void onSeekFinished(uj ujVar) {
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
    }
}
