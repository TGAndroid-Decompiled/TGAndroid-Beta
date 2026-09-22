package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f15864a;
    public final Object f15865b;
    public final Object f15866c;

    public s(int i10, Object obj, Object obj2) {
        this.f15864a = i10;
        this.f15865b = obj;
        this.f15866c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15864a) {
            case 0:
                ((CameraView.VideoRecorder) this.f15865b).lambda$handleStopRecording$0((CountDownLatch) this.f15866c);
                return;
            case 1:
                ((Camera2Session) this.f15865b).lambda$open$1((SurfaceTexture) this.f15866c);
                return;
            case 2:
                ((CameraController) this.f15865b).lambda$initCamera$2((Runnable) this.f15866c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f15865b, (CameraSession) this.f15866c);
                return;
            default:
                ((CameraView) this.f15865b).lambda$enableDualInternal$1((Handler) this.f15866c);
                return;
        }
    }
}
