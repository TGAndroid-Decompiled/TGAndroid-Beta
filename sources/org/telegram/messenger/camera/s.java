package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f16104a;
    public final Object f16105b;
    public final Object f16106c;

    public s(int i10, Object obj, Object obj2) {
        this.f16104a = i10;
        this.f16105b = obj;
        this.f16106c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16104a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16105b).lambda$handleStopRecording$0((CountDownLatch) this.f16106c);
                return;
            case 1:
                ((Camera2Session) this.f16105b).lambda$open$1((SurfaceTexture) this.f16106c);
                return;
            case 2:
                ((CameraController) this.f16105b).lambda$initCamera$2((Runnable) this.f16106c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16105b, (CameraSession) this.f16106c);
                return;
            default:
                ((CameraView) this.f16105b).lambda$enableDualInternal$1((Handler) this.f16106c);
                return;
        }
    }
}
