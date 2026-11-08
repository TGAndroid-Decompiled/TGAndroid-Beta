package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f21828a;
    public final Object f21829b;
    public final Object f21830c;

    public s(int i7, Object obj, Object obj2) {
        this.f21828a = i7;
        this.f21829b = obj;
        this.f21830c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21828a) {
            case 0:
                ((CameraView.VideoRecorder) this.f21829b).lambda$handleStopRecording$0((CountDownLatch) this.f21830c);
                return;
            case 1:
                ((Camera2Session) this.f21829b).lambda$open$1((SurfaceTexture) this.f21830c);
                return;
            case 2:
                ((CameraController) this.f21829b).lambda$initCamera$2((Runnable) this.f21830c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f21829b, (CameraSession) this.f21830c);
                return;
            default:
                ((CameraView) this.f21829b).lambda$enableDualInternal$1((Handler) this.f21830c);
                return;
        }
    }
}
