package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;

public final class q implements SurfaceTexture.OnFrameAvailableListener {

    public final CameraView.CameraGLThread f19938a;

    public q(CameraView.CameraGLThread cameraGLThread) {
        this.f19938a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f19938a.updTex(surfaceTexture);
    }
}
