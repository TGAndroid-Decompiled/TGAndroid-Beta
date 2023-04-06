package org.telegram.messenger.camera;

import android.hardware.Camera;
public final class CameraSession$$ExternalSyntheticLambda0 implements Camera.AutoFocusCallback {
    public static final CameraSession$$ExternalSyntheticLambda0 INSTANCE = new CameraSession$$ExternalSyntheticLambda0();

    private CameraSession$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void onAutoFocus(boolean z, Camera camera) {
        CameraSession.lambda$new$0(z, camera);
    }
}
