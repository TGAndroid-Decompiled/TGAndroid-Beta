package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class q implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f16106a;

    public q(CameraView.CameraGLThread cameraGLThread) {
        this.f16106a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16106a.updTex(surfaceTexture);
    }
}
