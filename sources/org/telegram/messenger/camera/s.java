package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f18136a;
    public final Object f18137b;
    public final Object f18138c;

    public s(int i10, Object obj, Object obj2) {
        this.f18136a = i10;
        this.f18137b = obj;
        this.f18138c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18136a) {
            case 0:
                ((CameraView.VideoRecorder) this.f18137b).lambda$handleStopRecording$0((CountDownLatch) this.f18138c);
                return;
            case 1:
                ((Camera2Session) this.f18137b).lambda$open$1((SurfaceTexture) this.f18138c);
                return;
            case 2:
                ((CameraController) this.f18137b).lambda$initCamera$2((Runnable) this.f18138c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f18137b, (CameraSession) this.f18138c);
                return;
            default:
                ((CameraView) this.f18137b).lambda$enableDualInternal$1((Handler) this.f18138c);
                return;
        }
    }
}
