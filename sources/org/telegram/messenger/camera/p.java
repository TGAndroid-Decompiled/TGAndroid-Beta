package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
public final class p implements SurfaceTexture.OnFrameAvailableListener {
    public final CameraView.CameraGLThread f16679a;

    public p(CameraView.CameraGLThread cameraGLThread) {
        this.f16679a = cameraGLThread;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16679a.updTex(surfaceTexture);
    }
}
