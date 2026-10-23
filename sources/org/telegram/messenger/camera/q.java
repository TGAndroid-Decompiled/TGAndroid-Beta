package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class q implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f18074a;

    public q(CameraView.CameraGLThread cameraGLThread) {
        this.f18074a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f18074a.updTex(surfaceTexture);
    }
}
