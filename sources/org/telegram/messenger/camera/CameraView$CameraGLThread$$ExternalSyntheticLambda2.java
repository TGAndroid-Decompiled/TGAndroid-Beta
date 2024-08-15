package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class CameraView$CameraGLThread$$ExternalSyntheticLambda2 implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f$0;

    public CameraView$CameraGLThread$$ExternalSyntheticLambda2(CameraView.CameraGLThread cameraGLThread) {
        this.f$0 = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CameraView.CameraGLThread.$r8$lambda$F9EmatV_YtQBimKoGwdOzkKHixM(this.f$0, surfaceTexture);
    }
}
