package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class r implements Runnable {
    public final int f23434a;
    public final Object f23435b;
    public final Object f23436c;

    public r(int i7, Object obj, Object obj2) {
        this.f23434a = i7;
        this.f23435b = obj;
        this.f23436c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f23434a) {
            case 0:
                ((CameraView.VideoRecorder) this.f23435b).lambda$handleStopRecording$0((CountDownLatch) this.f23436c);
                return;
            case 1:
                ((Camera2Session) this.f23435b).lambda$open$1((SurfaceTexture) this.f23436c);
                return;
            case 2:
                ((CameraController) this.f23435b).lambda$initCamera$2((Runnable) this.f23436c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f23435b, (CameraSession) this.f23436c);
                return;
            default:
                ((CameraView) this.f23435b).lambda$enableDualInternal$1((Handler) this.f23436c);
                return;
        }
    }
}
