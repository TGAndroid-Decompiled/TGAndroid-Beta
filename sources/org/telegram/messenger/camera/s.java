package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f15130a;
    public final Object f15131b;
    public final Object f15132c;

    public s(int i10, Object obj, Object obj2) {
        this.f15130a = i10;
        this.f15131b = obj;
        this.f15132c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15130a) {
            case 0:
                ((CameraView.VideoRecorder) this.f15131b).lambda$handleStopRecording$0((CountDownLatch) this.f15132c);
                return;
            case 1:
                ((Camera2Session) this.f15131b).lambda$open$1((SurfaceTexture) this.f15132c);
                return;
            case 2:
                ((CameraController) this.f15131b).lambda$initCamera$2((Runnable) this.f15132c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f15131b, (CameraSession) this.f15132c);
                return;
            default:
                ((CameraView) this.f15131b).lambda$enableDualInternal$1((Handler) this.f15132c);
                return;
        }
    }
}
