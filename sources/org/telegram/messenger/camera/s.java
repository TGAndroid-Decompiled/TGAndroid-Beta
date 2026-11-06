package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f21786a;
    public final Object f21787b;
    public final Object f21788c;

    public s(int i7, Object obj, Object obj2) {
        this.f21786a = i7;
        this.f21787b = obj;
        this.f21788c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21786a) {
            case 0:
                ((CameraView.VideoRecorder) this.f21787b).lambda$handleStopRecording$0((CountDownLatch) this.f21788c);
                return;
            case 1:
                ((Camera2Session) this.f21787b).lambda$open$1((SurfaceTexture) this.f21788c);
                return;
            case 2:
                ((CameraController) this.f21787b).lambda$initCamera$2((Runnable) this.f21788c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f21787b, (CameraSession) this.f21788c);
                return;
            default:
                ((CameraView) this.f21787b).lambda$enableDualInternal$1((Handler) this.f21788c);
                return;
        }
    }
}
