package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f23430a;

    public p(CameraView.CameraGLThread cameraGLThread) {
        this.f23430a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CameraView.CameraGLThread.d(this.f23430a, surfaceTexture);
    }
}
