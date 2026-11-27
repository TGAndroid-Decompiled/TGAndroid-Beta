package defpackage;

import android.graphics.SurfaceTexture;
public interface ifc {
    void onError(kfc kfcVar, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(uj ujVar);

    void onSeekFinished(uj ujVar);

    void onSeekStarted(uj ujVar);

    void onStateChanged(boolean z, int i);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
