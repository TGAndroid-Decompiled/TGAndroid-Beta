package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f19806a;

    public p(CameraView.CameraGLThread cameraGLThread) {
        this.f19806a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f19806a.updTex(surfaceTexture);
    }
}
