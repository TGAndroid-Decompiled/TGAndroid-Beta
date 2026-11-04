package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f21985a;

    public p(CameraView.CameraGLThread cameraGLThread) {
        this.f21985a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f21985a.updTex(surfaceTexture);
    }
}
