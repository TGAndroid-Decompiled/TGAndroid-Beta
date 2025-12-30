package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;

public final class CameraView$CameraGLThread$$ExternalSyntheticLambda6 implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f$0;

    public CameraView$CameraGLThread$$ExternalSyntheticLambda6(CameraView.CameraGLThread cameraGLThread) {
        this.f$0 = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f$0.updTex(surfaceTexture);
    }
}
