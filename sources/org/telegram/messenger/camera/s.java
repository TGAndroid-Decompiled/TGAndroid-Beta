package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f21832a;
    public final Object f21833b;
    public final Object f21834c;

    public s(int i7, Object obj, Object obj2) {
        this.f21832a = i7;
        this.f21833b = obj;
        this.f21834c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21832a) {
            case 0:
                ((CameraView.VideoRecorder) this.f21833b).lambda$handleStopRecording$0((CountDownLatch) this.f21834c);
                return;
            case 1:
                ((Camera2Session) this.f21833b).lambda$open$1((SurfaceTexture) this.f21834c);
                return;
            case 2:
                ((CameraController) this.f21833b).lambda$initCamera$2((Runnable) this.f21834c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f21833b, (CameraSession) this.f21834c);
                return;
            default:
                ((CameraView) this.f21833b).lambda$enableDualInternal$1((Handler) this.f21834c);
                return;
        }
    }
}
