package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f15858a;
    public final Object f15859b;
    public final Object f15860c;

    public s(int i10, Object obj, Object obj2) {
        this.f15858a = i10;
        this.f15859b = obj;
        this.f15860c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15858a) {
            case 0:
                ((CameraView.VideoRecorder) this.f15859b).lambda$handleStopRecording$0((CountDownLatch) this.f15860c);
                return;
            case 1:
                ((Camera2Session) this.f15859b).lambda$open$1((SurfaceTexture) this.f15860c);
                return;
            case 2:
                ((CameraController) this.f15859b).lambda$initCamera$2((Runnable) this.f15860c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f15859b, (CameraSession) this.f15860c);
                return;
            default:
                ((CameraView) this.f15859b).lambda$enableDualInternal$1((Handler) this.f15860c);
                return;
        }
    }
}
