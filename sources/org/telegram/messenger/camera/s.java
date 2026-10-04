package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f17562a;
    public final Object f17563b;
    public final Object f17564c;

    public s(int i10, Object obj, Object obj2) {
        this.f17562a = i10;
        this.f17563b = obj;
        this.f17564c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17562a) {
            case 0:
                ((CameraView.VideoRecorder) this.f17563b).lambda$handleStopRecording$0((CountDownLatch) this.f17564c);
                return;
            case 1:
                ((Camera2Session) this.f17563b).lambda$open$1((SurfaceTexture) this.f17564c);
                return;
            case 2:
                ((CameraController) this.f17563b).lambda$initCamera$2((Runnable) this.f17564c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f17563b, (CameraSession) this.f17564c);
                return;
            default:
                ((CameraView) this.f17563b).lambda$enableDualInternal$1((Handler) this.f17564c);
                return;
        }
    }
}
