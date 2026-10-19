package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f18082a;
    public final Object f18083b;
    public final Object f18084c;

    public s(int i10, Object obj, Object obj2) {
        this.f18082a = i10;
        this.f18083b = obj;
        this.f18084c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18082a) {
            case 0:
                ((CameraView.VideoRecorder) this.f18083b).lambda$handleStopRecording$0((CountDownLatch) this.f18084c);
                return;
            case 1:
                ((Camera2Session) this.f18083b).lambda$open$1((SurfaceTexture) this.f18084c);
                return;
            case 2:
                ((CameraController) this.f18083b).lambda$initCamera$2((Runnable) this.f18084c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f18083b, (CameraSession) this.f18084c);
                return;
            default:
                ((CameraView) this.f18083b).lambda$enableDualInternal$1((Handler) this.f18084c);
                return;
        }
    }
}
