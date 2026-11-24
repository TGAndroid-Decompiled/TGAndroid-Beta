package defpackage;

import android.hardware.Camera;
import org.telegram.messenger.camera.CameraSession;
public final class ea1 implements Camera.AutoFocusCallback {
    @Override
    public final void onAutoFocus(boolean z, Camera camera) {
        CameraSession.lambda$new$0(z, camera);
    }
}
