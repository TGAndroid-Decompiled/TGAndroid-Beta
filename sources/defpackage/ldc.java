package defpackage;

import android.graphics.SurfaceTexture;
public interface ldc {
    void onError(ndc ndcVar, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(tk tkVar);

    void onSeekFinished(tk tkVar);

    void onSeekStarted(tk tkVar);

    void onStateChanged(boolean z, int i);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
