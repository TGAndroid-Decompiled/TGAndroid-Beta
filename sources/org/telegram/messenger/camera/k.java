package org.telegram.messenger.camera;

import android.hardware.Camera;
public final class k implements Camera.AutoFocusCallback {
    @Override
    public final void onAutoFocus(boolean z4, Camera camera) {
        CameraSession.lambda$new$0(z4, camera);
    }
}
