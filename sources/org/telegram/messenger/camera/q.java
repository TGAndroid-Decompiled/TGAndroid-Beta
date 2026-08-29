package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class q implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f19926a;

    public q(CameraView.CameraGLThread cameraGLThread) {
        this.f19926a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f19926a.updTex(surfaceTexture);
    }
}
