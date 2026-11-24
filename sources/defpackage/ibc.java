package defpackage;

import android.graphics.SurfaceTexture;
public interface ibc {
    void onError(lbc lbcVar, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(tj tjVar);

    void onSeekFinished(tj tjVar);

    void onSeekStarted(tj tjVar);

    void onStateChanged(boolean z, int i);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
