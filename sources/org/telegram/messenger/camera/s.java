package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f18141a;
    public final Object f18142b;
    public final Object f18143c;

    public s(int i10, Object obj, Object obj2) {
        this.f18141a = i10;
        this.f18142b = obj;
        this.f18143c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18141a) {
            case 0:
                ((CameraView.VideoRecorder) this.f18142b).lambda$handleStopRecording$0((CountDownLatch) this.f18143c);
                return;
            case 1:
                ((Camera2Session) this.f18142b).lambda$open$1((SurfaceTexture) this.f18143c);
                return;
            case 2:
                ((CameraController) this.f18142b).lambda$initCamera$2((Runnable) this.f18143c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f18142b, (CameraSession) this.f18143c);
                return;
            default:
                ((CameraView) this.f18142b).lambda$enableDualInternal$1((Handler) this.f18143c);
                return;
        }
    }
}
