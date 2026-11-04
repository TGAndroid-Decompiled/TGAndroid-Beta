package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f21989a;
    public final Object f21990b;
    public final Object f21991c;

    public s(int i3, Object obj, Object obj2) {
        this.f21989a = i3;
        this.f21990b = obj;
        this.f21991c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21989a) {
            case 0:
                ((CameraView.VideoRecorder) this.f21990b).lambda$handleStopRecording$0((CountDownLatch) this.f21991c);
                return;
            case 1:
                ((Camera2Session) this.f21990b).lambda$open$1((SurfaceTexture) this.f21991c);
                return;
            case 2:
                ((CameraController) this.f21990b).lambda$initCamera$2((Runnable) this.f21991c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f21990b, (CameraSession) this.f21991c);
                return;
            default:
                ((CameraView) this.f21990b).lambda$enableDualInternal$1((Handler) this.f21991c);
                return;
        }
    }
}
