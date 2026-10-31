package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class q implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f14962a;

    public q(CameraView.CameraGLThread cameraGLThread) {
        this.f14962a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CameraView.CameraGLThread.d(this.f14962a, surfaceTexture);
    }
}
