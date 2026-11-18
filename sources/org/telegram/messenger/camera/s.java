package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f23322a;
    public final Object f23323b;
    public final Object f23324c;

    public s(int i7, Object obj, Object obj2) {
        this.f23322a = i7;
        this.f23323b = obj;
        this.f23324c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f23322a) {
            case 0:
                ((CameraView.VideoRecorder) this.f23323b).lambda$handleStopRecording$0((CountDownLatch) this.f23324c);
                return;
            case 1:
                ((Camera2Session) this.f23323b).lambda$open$1((SurfaceTexture) this.f23324c);
                return;
            case 2:
                ((CameraController) this.f23323b).lambda$initCamera$2((Runnable) this.f23324c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f23323b, (CameraSession) this.f23324c);
                return;
            default:
                ((CameraView) this.f23323b).lambda$enableDualInternal$1((Handler) this.f23324c);
                return;
        }
    }
}
