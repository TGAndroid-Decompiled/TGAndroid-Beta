package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f14900a;
    public final Object f14901b;
    public final Object f14902c;

    public s(int i10, Object obj, Object obj2) {
        this.f14900a = i10;
        this.f14901b = obj;
        this.f14902c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f14900a) {
            case 0:
                ((CameraView.VideoRecorder) this.f14901b).lambda$handleStopRecording$0((CountDownLatch) this.f14902c);
                return;
            case 1:
                ((Camera2Session) this.f14901b).lambda$open$1((SurfaceTexture) this.f14902c);
                return;
            case 2:
                ((CameraController) this.f14901b).lambda$initCamera$2((Runnable) this.f14902c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f14901b, (CameraSession) this.f14902c);
                return;
            default:
                ((CameraView) this.f14901b).lambda$enableDualInternal$1((Handler) this.f14902c);
                return;
        }
    }
}
