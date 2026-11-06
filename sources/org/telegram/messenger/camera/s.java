package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f21792a;
    public final Object f21793b;
    public final Object f21794c;

    public s(int i7, Object obj, Object obj2) {
        this.f21792a = i7;
        this.f21793b = obj;
        this.f21794c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21792a) {
            case 0:
                ((CameraView.VideoRecorder) this.f21793b).lambda$handleStopRecording$0((CountDownLatch) this.f21794c);
                return;
            case 1:
                ((Camera2Session) this.f21793b).lambda$open$1((SurfaceTexture) this.f21794c);
                return;
            case 2:
                ((CameraController) this.f21793b).lambda$initCamera$2((Runnable) this.f21794c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f21793b, (CameraSession) this.f21794c);
                return;
            default:
                ((CameraView) this.f21793b).lambda$enableDualInternal$1((Handler) this.f21794c);
                return;
        }
    }
}
