package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f18085a;
    public final Object f18086b;
    public final Object f18087c;

    public s(int i10, Object obj, Object obj2) {
        this.f18085a = i10;
        this.f18086b = obj;
        this.f18087c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18085a) {
            case 0:
                ((CameraView.VideoRecorder) this.f18086b).lambda$handleStopRecording$0((CountDownLatch) this.f18087c);
                return;
            case 1:
                ((Camera2Session) this.f18086b).lambda$open$1((SurfaceTexture) this.f18087c);
                return;
            case 2:
                ((CameraController) this.f18086b).lambda$initCamera$2((Runnable) this.f18087c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f18086b, (CameraSession) this.f18087c);
                return;
            default:
                ((CameraView) this.f18086b).lambda$enableDualInternal$1((Handler) this.f18087c);
                return;
        }
    }
}
