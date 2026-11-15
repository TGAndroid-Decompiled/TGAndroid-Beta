package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class r implements Runnable {
    public final int f22851a;
    public final Object f22852b;
    public final Object f22853c;

    public r(int i7, Object obj, Object obj2) {
        this.f22851a = i7;
        this.f22852b = obj;
        this.f22853c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f22851a) {
            case 0:
                ((CameraView.VideoRecorder) this.f22852b).lambda$handleStopRecording$0((CountDownLatch) this.f22853c);
                return;
            case 1:
                ((Camera2Session) this.f22852b).lambda$open$1((SurfaceTexture) this.f22853c);
                return;
            case 2:
                ((CameraController) this.f22852b).lambda$initCamera$2((Runnable) this.f22853c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f22852b, (CameraSession) this.f22853c);
                return;
            default:
                ((CameraView) this.f22852b).lambda$enableDualInternal$1((Handler) this.f22853c);
                return;
        }
    }
}
