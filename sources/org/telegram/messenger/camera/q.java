package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class q implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f23284a;

    public q(CameraView.CameraGLThread cameraGLThread) {
        this.f23284a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f23284a.updTex(surfaceTexture);
    }
}
