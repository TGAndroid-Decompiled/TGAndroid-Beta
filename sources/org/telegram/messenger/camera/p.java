package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f16982a;

    public p(CameraView.CameraGLThread cameraGLThread) {
        this.f16982a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16982a.updTex(surfaceTexture);
    }
}
