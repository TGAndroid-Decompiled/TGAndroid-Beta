package org.telegram.messenger.camera;

import android.hardware.Camera;
public final class j implements Camera.AutoFocusCallback {
    @Override
    public final void onAutoFocus(boolean z10, Camera camera) {
        CameraSession.lambda$new$0(z10, camera);
    }
}
